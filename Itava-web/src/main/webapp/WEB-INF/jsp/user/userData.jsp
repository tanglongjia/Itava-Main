<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div id="userTableDiv">
<table class="table table-bordered table-hover" id="user_table">
	<thead>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>手机号</th>
			<th>年龄</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${userList}" var="user" varStatus="item">
			<tr>
				<td>${item.index+1}</td>
				<td>${user.truename }</td>
				<td>${user.telephone }</td>
				<td>${user.age }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<input id ="currentPage" type ="hidden" value ="1"/>
<input id ="totalPages" type ="hidden" value ="2" />
<ul id ="example"></ul>
</div>
<script>
$('#example').bootstrapPaginator({
    currentPage: $('#currentPage').val(),   //当前页
    totalPages: $('#totalPages').val(),     //总页数
    bootstrapMajorVersion: 3,               //兼容Bootstrap3.x版本
    tooltipTitles: function (type, page) {
        switch (type) {
            case "first" :
                return "第一页" ;
            case "prev" :
                return "上一页" ;
            case "next" :
                return "下一页" ;
            case "last" :
                return "最后一页" ;
            case "page" :
                return page;
        }
        return "" ;
    },
    onPageClicked: function (event, originalEvent, type, page) {
        $.get('./selectUserPage' , { currentPage: page, pageSize:10 }, function (view) {
            $('#user_table').html(view);
        });
    }
});
</script>