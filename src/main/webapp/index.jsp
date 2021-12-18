<%@ page import="ua.mk.cora.laba134.enities.WorkersEntity" %>
<%@ page import="java.util.*" %>
<%@ page import="ua.mk.cora.laba134.enities.ScheduleEntity" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Спортивный комплекс "Альтаир"</title>
    <link rel="stylesheet" href="resources/css/styles.css">
    <link rel="stylesheet" href="resources/css/pointstyles.css">
    <link rel="stylesheet" href="resources/css/trainerstyles.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
    <div class="content-block">
        <section class="benefits">
            <div class="containebenef">
                <h1 class="why">
                    Почему вам стоит выбрать нас?
                </h1>
                <ul class="whyno">
                    <li class="whyitem">
                        <a class="nameitem">У нас собраны лучшие лошадки города </a>
                    </li>
                    <li class="whyitem">
                        <a class="nameitem">Первоклассные тренера с дипломами</a>
                    </li>
                    <li class="whyitem">
                        <a class="nameitem">Самый лучший уход за лошадьми</a>
                    </li>
                    <li class="whyitem">
                        <a class="nameitem">Чистые, комфортные стойла</a>
                    </li>
                    <li class="whyitem">
                        <a class="nameitem">Несколько видов плацов и бочек</a>
                    </li>
                    <li class="whyitem">
                        <a class="nameitem">Постоянный выгул в наших полях</a>
                    </li>
                </ul>
            </div>
        </section>
        <section class="schedule-statement">
            <div class="schedule">
                <div class="schedule-header">
                    Расписание занятий трениров
                </div>
                <div class="scrollbody">
                    <table class="schtable">
                        <tr class="col">
                            <th>Имя тренера</th>
                            <th>День</th>
                            <th>Время</th>
                        </tr>
                        <c:forEach var="schwork" items="${schwork}" varStatus="iter">
                            <tr class="col">
                                <td>${schwork[0]}</td>
                                <td>${schwork[1]}</td>
                                <td>${schwork[2]}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <div class="topuser">
                <div class="schedule-header">
                    Лучшие лошадки нашего комплекса!
                </div>
                <div class="scrollbody">
                <c:forEach var="horsetop" items="${horsetop}" begin="0" end="2">
                    <div class="divhorse">
                        <ul class="ulus">
                            <il class="toph">
                                <img class="horseimgindex" src="${horsetop[0]}" alt="imgh"> <br/>
                                Имя: ${horsetop[1]} <br/>
                                Категория: ${horsetop[2]} <br/>
                                Хозяин: ${horsetop[3]} ${horsetop[4]} <br/>
                            </il>
                        </ul>
                    </div>
                </c:forEach>
                </div>
            </div>
        </section>
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>