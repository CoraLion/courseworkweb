<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ученики</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/styles.css">
    <link rel="stylesheet" href="resources/css/pointstyles.css">
    <link rel="stylesheet" href="resources/css/about.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
    <div class="content-block">
        <section class="usercont">
            <div class="containcont">
                <div class="raiting">
                    <h1 id="rt">Лучшие ученики по рейтингу!</h1>
                </div>
            <div class="scrollbodyuser">
                <ul class="schtable">
                    <c:forEach var="user" items="${usersall}">
                        <il class="coluser">
                            ${user.firstname}
                            ${user.secondname}
                            ${user.threename}
                            —
                            ${user.raiting}
                            points.
                        </il>
                        <br/>
                    </c:forEach>
                </ul>
            </div>
            </div>
            <div id="imageus">
                <img id="imagehorse" src="resources/css/image/horseuser.jpg" alt="horse">
            </div>
        </section>
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>
