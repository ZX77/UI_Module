<%--
  Created by IntelliJ IDEA.
  User: 曾鑫
  Date: 2018/5/10
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态生成省市县</title>
    <script src = "../js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src = "../layui/layui.js"></script>
</head>
<body>
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">家庭住址</label>
        <div class="layui-input-inline">
            <select name="province" lay-filter="province">
                <option value="">请选择省</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="city" lay-filter="city" disabled>
                <option value="">请选择市</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="area" lay-filter="area" disabled>
                <option value="">请选择县/区</option>
            </select>
        </div>
    </div>
</form>
</body>
<script src = ../js/address.js></script>
<script src = "user.js"></script>
</html>
