<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<form class="form-horizontal" id="userAddForm" name="userAddForm">
	<div class="box-body">
		<div class="form-group">
			<label for="inputTrueName" class="col-sm-2 control-label">用户名：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="formTrueName" name="formTrueName">
			</div>

			<label for="inputAge" class="col-sm-2 control-label">年龄：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="age" name="age" placeholder="年龄">
			</div>

			<label for="inputTelphone" class="col-sm-2 control-label">手机号：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="formTelphone" name="formTelphone"
					>
			</div>

			<label for="inputSex" class="col-sm-2 control-label">性别：</label>
			<div class="col-sm-4" style="margin-top: 5px;">
				<input type="radio" name="sex" id="sex1" value="1" checked>男
				&nbsp;&nbsp;<input type="radio" name="sex" id="sex2" value="0" checked>女
			</div>
		</div>
		<div class="box-footer">
                <button type="button" class="btn btn-default pull-right" onclick="closeUser()">关闭</button>
                <button type="submit" class="btn btn-info pull-right" >提交</button>
        </div>
	</div>
</form>
<script type="text/javascript">
$(document).ready(function() {
    $('#userAddForm').formValidation({
//      live: 'disabled',
      message: 'This value is not valid',
      feedbackIcons: {
          valid: 'glyphicon glyphicon-ok',
          invalid: 'glyphicon glyphicon-remove',
          validating: 'glyphicon glyphicon-refresh'
      },
      fields: {
        	formTrueName: {
                message: '用户名验证失败',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    }
                }
            },
            formTelphone: {
                validators: {
                    notEmpty: {
                        message: '手机号不能为空'
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

        // Use Ajax to submit form data
        $.post($form.attr('action'), $form.serialize(), function(result) {
            console.log(result);
        }, 'json');
    });
})

function closeUser(){
	addUserDialog.close();
}

</script>
