<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../common/head.jsp"%>
<script type="text/javascript">
$(document).ready(function() {
	//初始化ueditor
 	 var editor = new UE.ui.Editor();  
     editor.render("formNewsContent");  
     
     $('#newsSaveForm').bootstrapValidator({
       message: 'This value is not valid',
       feedbackIcons: {
           valid: 'glyphicon glyphicon-ok',
           invalid: 'glyphicon glyphicon-remove',
           validating: 'glyphicon glyphicon-refresh'
       },
       fields: {
    	   formNewsTitle: {
                 message: '新闻标题验证失败',
                 validators: {
                     notEmpty: {
                         message: '标题不能为空'
                     }
                 }
             },
             formNewsCategory: {
                 validators: {
                     notEmpty: {
                         message: '栏目不能为空'
                     }
                 }
             },
             formNewsContent: {
                 validators: {
                     notEmpty: {
                         message: '内容不能为空'
                     }
                 }
             },
             formNewsUrl: {
                 validators: {
                     notEmpty: {
                         message: 'URL不能为空'
                     }
                 }
             }
         }
     }).on('success.form.bv', function(e) {
    	  // Prevent form submission
         e.preventDefault();

         // Get the form instance
         var $form = $(e.target);

         // Get the BootstrapValidator instance
         var bv = $form.data('bootstrapValidator');
    	 saveNews();
     }); 
})

function closeNews(){
	var formId = $("#formId").val();
	if(formId == null && formId !=''){
		parent.addNewsDialog.close();
	}else{
		parent.updateNewsDialog.close();
	}
}

function saveNews(){
	var ue = UE.getEditor('formNewsContent');
	//获取html内容
	var html = ue.getContent();
	$.ajax({
		   type: "POST",
		   url: '<%=basePath%>'+"/snews/newsSave",
		   data: {
			   "formNewsTitle":$("#formNewsTitle").val(),
			   "formNewsCategory":$("#formNewsCategory").val(),
			   "formNewsUrl":$("#formNewsUrl").val(),
			   "formStatus":$("#formStatus").val(),
			   "formNewsContent":html,
			   "formId":$("#formId").val()
		   },
		   success: function(msg){
			   if(msg == "1"){
				   window.top.alertMsg("保存新闻信息成功！");
			   }
			   if(msg =="2"){
				   window.top.alertMsg("更新新闻信息成功！");
			   }
			   closeNews();
			   parent.search();
		   },
		   error: function(msg){
			   if(msg == "0"){
				   window.top.alertMsgError("保存新闻信息失败！");
			   }
			   if(msg =="3"){
				   window.top.alertMsgError("更新新闻信息失败！");
			   }
			   
		   }
		});
}

</script>
<form class="form-horizontal" id="newsSaveForm" name="newsSaveForm">
		<input type="hidden" value="${news.id}" name="formId" id="formId"/>
		<div class="form-group">
			<label for="formNewsTitle" class="col-sm-2 control-label">新闻标题：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="formNewsTitle" name="formNewsTitle" placeholder="新闻标题" value="${news.newstitle}">
			</div>

			<label for="formNewsCategory" class="col-sm-2 control-label">栏目名称：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="formNewsCategory" name="formNewsCategory" placeholder="栏目名称" value="${news.newscategory}">
			</div>
			
			<label for="formNewsUrl" class="col-sm-2 control-label">访问URL：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="formNewsUrl" name="formNewsUrl" placeholder="访问URL" value="${news.newsurl}">
			</div>
			
			<label for="formStatus" class="col-sm-2 control-label">有效状态：</label>
			<div class="col-sm-4">
				<select id="formStatus" class="form-control">
					<option value="1" <c:if test="${news.status == 1}">selected</c:if> >有效</option>
					<option value="0" <c:if test="${news.status == 0}">selected</c:if> >无效</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label for="formNewsContent" class="col-sm-2 control-label">新闻内容：</label>
			<div class="col-sm-10">
				<script id="formNewsContent" >${news.newscontent}</script>
			</div>
		</div>
		<div class="form-group">
			<button type="button" class="btn btn-default pull-right" style="margin-left: 5px;margin-right: 25px;" onclick="closeNews()">关闭</button>
	        <button type="submit" class="btn btn-info pull-right" >保存</button>
        </div>
</form>

