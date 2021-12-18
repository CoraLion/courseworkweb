<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Тренера</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/styles.css">
    <link rel="stylesheet" href="resources/css/trainerstyles.css">
    <link rel="stylesheet" href="resources/css/pointstyles.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
<div class="content-block">
    <section class="trainercount">
        <div class="containertrain">
            <h1 class="train">Тренера по выездке!</h1>
            <div class="scrollbodytrain">
                <ul class="schtable">
                    <c:forEach var="trainone" items="${trainone}">
                        <il class="coltrain">
                            _________________________ <br/>
                                Имя: ${trainone.firstname} <br/>
                                Второе имя: ${trainone.secondname} <br/>
                                Фамилия: ${trainone.threename} <br/>
                                День рождения: ${trainone.birthday} <br/>
                                Телефон: +${trainone.phone} <br/>
                            _________________________
                            <br/>
                        </il>
                    </c:forEach>
                </ul>
            </div>
            <div class="imagetrain"> 
                <img class="imgtr" src="resources/css/image/viezd.jpg">
            </div>
        </div>
        <div class="containertrain">
            <h1 class="train">Тренера по конкуру!</h1>
            <div class="scrollbodytrain">
                <ul class="schtable">
                    <c:forEach var="traintwo" items="${traintwo}">
                        <il class="coltrain">
                            _________________________ <br/>
                            Имя: ${traintwo.firstname} <br/>
                            Второе имя: ${traintwo.secondname} <br/>
                            Фамилия: ${traintwo.threename} <br/>
                            День рождения: ${traintwo.birthday} <br/>
                            Телефон: +${traintwo.phone} <br/>
                            _________________________
                            <br/>
                        </il>
                    </c:forEach>
                </ul>
            </div>
            <div class="imagetrain">
                <img class="imgtr" src="resources/css/image/conc.jpg">
            </div>
        </div>
        <div class="containertrain">
            <h1 class="train">Тренера для профи!</h1>
            <div class="scrollbodytrain">
                <ul class="schtable">
                    <c:forEach var="trainothree" items="${trainthree}">
                        <il class="coltrain">
                            _________________________ <br/>
                            Имя: ${trainothree.firstname} <br/>
                            Второе имя: ${trainothree.secondname} <br/>
                            Фамилия: ${trainothree.threename} <br/>
                            День рождения: ${trainothree.birthday} <br/>
                            Телефон: +${trainothree.phone} <br/>
                            _________________________
                            <br/>
                        </il>
                    </c:forEach>
                </ul>
            </div>
            <div class="imagetrain">
                <img class="imgtr" src="resources/css/image/profi.jpg">
            </div>
        </div>
        <div class="containertrain">
            <h1 class="train">Тренера для новичков!</h1>
            <div class="scrollbodytrain">
                <ul class="schtable">
                    <c:forEach var="trainfour" items="${trainfour}">
                        <il class="coltrain">
                            _________________________ <br/>
                            Имя: ${trainfour.firstname} <br/>
                            Второе имя: ${trainfour.secondname} <br/>
                            Фамилия: ${trainfour.threename} <br/>
                            День рождения: ${trainfour.birthday} <br/>
                            Телефон: +${trainfour.phone} <br/>
                            _________________________
                            <br/>
                        </il>
                    </c:forEach>
                </ul>
            </div>
            <div class="imagetrain">
                <img class="imgtr" src="resources/css/image/new.jpg">
            </div>
        </div>
    </section>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
