<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Лошади</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/styles.css">
    <link rel="stylesheet" href="resources/css/pointstyles.css">
    <link rel="stylesheet" href="resources/css/horse.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
<div class="content-block">
    <section class="horsection">
        <div class="dateclass">
            <div class="formh">
                <form method="get" action="classhorse" class="bthorse">
                    <input class="bt" type="submit" value="Классовые">
                </form>
            </div>
            <div class="formh">
            <form method="get" action="breedhorse" class="bthorse">
                <input class="bt" type="submit" value="Породистые">
            </form>
            </div>
            <div class="formh">
            <form method="get" action="horseserv" class="bthorse">
                <input class="bt" type="submit" value="Показать всех">
            </form>
            </div>
            <div class="formh">
            <form method="post" action="horsefound">
                <input id="namef" name="name" type="text" required placeholder="Введите имя для поиска">
                <input class="btf" type="submit" value="Показать">
            </form>
            </div>
        </div>
        <c:forEach var="hlist" items="${hlist}">
            <div class="horseitem">
                <section class="horsel">
                    <div class="horseimg">
                        <img class="himg" src="${hlist.img}" alt="imgh">
                    </div>
                    <div class="horseinfo">
                        <div id="horseheader">
                            <h1 id="hname">${hlist.name}</h1>
                        </div>
                        <ul class="horseul">
                           <il class="colhorse">
                                   Пол: ${hlist.sex} <br/>
                                   Возраст: ${hlist.age} <br/>
                                   Порода: ${hlist.breed} <br/>
                                   Класс: ${hlist.classh} <br/>
                           </il>
                        </ul>
                    </div>
                </section>
            </div>
        </c:forEach>
    </section>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
