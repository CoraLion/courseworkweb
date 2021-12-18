<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div class="menubar">
    <meta charset="UTF-8">
    <div class="container">
        <div class="logoblock" >
            <a href="worksch">
                <img src="resources/css/image/altair.svg" alt="altair"/>
            </a>
        </div>
        <ul class="menu" >
            <li class="menu horse" >
                <a class="ma" href="horseserv">Лошади</a>
                <ul class="listhorse">
                    <li>
                        <a class="ahorse" href="breedhorse">Породистые лошади</a>
                    </li>
                    <li>
                        <a class="ahorse" href="classhorse">Лошади с классом </a>
                    </li>
                </ul>
            </li>
            <li><a class="ma" href="traintype">Тренера</a> </li>
            <li><a class="ma" href="inputuser">Студенты</a> </li>
            <li><a class="ma" href="about.jsp">О нас</a> </li>
        </ul>
    </div>
</div>
</body>
</html>
