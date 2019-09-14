<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=8">
    <title>编辑雇员</title>
    <link rel="stylesheet" type="text/css" href="../css/reset.css"/>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <link rel="stylesheet" type="text/css" href="../css/thems.css">
    <script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //自适应屏幕宽度
            window.onresize = function () {
                location = location
            };

            var main_h = $(window).height();
            $('.hy_list').css('height', main_h - 45 + 'px');

            var main_w = $(window).width();
            $('.xjhy').css('width', main_w - 40 + 'px');

        });
    </script>
</head>

<body onLoad="Resize();">
<div id="right_ctn">
    <div class="right_m">
        <div class="hy_list">
            <div class="box_t">
                <span class="name">编辑雇员</span>
            </div>
            <div class="space_hx">&nbsp;</div>
            <form action="edit.do" method="post" name="addForm">
                <div class="xjhy">
                    <!--高级配置-->
                    <ul class="hypz gjpz clearfix">
                        <input class="chang" name="id" type="hidden" value="${OBJ.id}">
                        <li class="clearfix">
                            <%--private String  account     ;   // 账户--%>
                            <span class="title">账户：</span>
                            <div class="li_r">
                                <input class="chang" name="account" type="text" value="${OBJ.account}">
                                <i>*</i>
                            </div>
                        </li>
                        <%--private Integer did         ;   // 部门编号--%>
                        <li class="clearfix">
                            <span class="title">部门：</span>
                            <div class="li_r">
                                <select name="did">
                                    <c:forEach items="${DEPTS}" var="dept">
                                        <option value="${dept.id}" ${OBJ.did==dept.id?"selected":""}>${dept.name}</option>
                                    </c:forEach>
                                </select>
                                <i>*</i>
                            </div>
                        </li>
                        <%--private String  name        ;   // 姓名--%>
                        <li class="clearfix">
                            <span class="title">姓名：</span>
                            <div class="li_r">
                                <input class="chang" name="name" type="text" value="${OBJ.name}">
                                <i>*</i>
                            </div>
                        </li>
                        <%--private String  sex         ;   // 性别--%>
                        <li class="clearfix">
                            <span class="title">性别：</span>
                            <div class="li_r">
                                <span class="radio">
                                   <input name="sex" type="radio" value="男" ${OBJ.sex=="男"?"checked":""}/>
                                    <em>男</em>
                                </span>
                                <span class="radio">
                                   <input name="sex" type="radio" value="女" ${OBJ.sex=="女"?"checked":""}/>
                                    <em>女</em>
                                </span>
                                <i>*</i>
                            </div>
                        </li>
                        <%--private String  idNumber   ;   // 身份证号码--%>
                        <li class="clearfix">
                            <span class="title">身份证号码：</span>
                            <div class="li_r">
                                <input class="chang" name="idNumber" type="text" value="${OBJ.idNumber}">
                                <i>*</i>
                            </div>
                        </li>
                        <%--private Date    bornDate   ;   // 出生日期--%>
                        <li class="clearfix">
                            <span class="title">出生日期：</span>
                            <div class="li_r">
                                <input class="chang" name="bornDate" type="text" value="<fmt:formatDate value="${OBJ.bornDate}" pattern="yyyy-MM-dd"/>" >
                                <i>*</i>
                            </div>
                        </li>
                        <li class="clearfix">
                            <span class="title">离职日期：</span>
                            <div class="li_r">
                                <input class="chang" name="leaveTime" type="text" value="<fmt:formatDate value="${OBJ.leaveTime}" pattern="yyyy-MM-dd"/>" >
                                <i>*</i>
                            </div>
                        </li>
                        <%--private String  info        ;   // 备注--%>
                        <li class="clearfix">
                            <span class="title">备注：</span>
                            <div class="li_r">
                                <input class="chang" name="info" type="text" value="${OBJ.info}">
                                <i>*</i>
                            </div>
                        </li>
                        <li class="tj_btn">
                            <a href="javascript:history.go(-1);" class="back">返回</a>
                            <a href="javascript:addForm.submit();">保存</a>
                        </li>
                    </ul>
                    <!--高级配置-->
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
