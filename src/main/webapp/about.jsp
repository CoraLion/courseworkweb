<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>О нас</title>
    <link rel="stylesheet" href="resources/css/styles.css">
    <link rel="stylesheet" href="resources/css/pointstyles.css">
    <link rel="stylesheet" href="resources/css/about.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
<div class="content-block">
    <div class="aboutdiv">
        <div class="aboutcont">
            <div id="imagea">
                <img id="imageabout" src="resources/css/image/altair.svg" alt="altair"/>
            </div>
            <h1>О нас!</h1>
            <p class="maintext">Сайт ALTAIRCOMPANY был предоставлен публике для того, чтобы
                люди смогли узнать лучше наш конно-спортивный комплекс, просмотрели лошадей, тренеров. Так же пользователи могут просмотреть информацию о расписаниях занятий,
                когда те или иные тренера заняты или свободны.</p>
            <p class="maintext">Связаться с нами вы можете через электронную почту: altaircompany@gmail.com</p>
            <a class="inputtext" href="#darkmess">Форма для отправки сообщения</a>
            <h1>Наши социальные сети </h1>
            <div id="adiv">
                <a class="atext" href ="#">Instagram</a>
                <a class="atext" href ="#">Tik-tok</a>
                <a class="atext" href ="#">YouTube</a>
            </div>
            <div id="darkmess">
                <div id="window">
                    <h1>У вас есть вопросы?</h1>
                    <form action="mailmsg" class="mailmsg" method="post">
                        <label> Тема: <input id="name" name="name" type="text" placeholder="Тема"/></label> <br/>
                        <label> Ваш email: <input id="gmail" name="email" type="email" placeholder="Email"/></label> <br/>
                        <label>Текст сообщения:
                            <textarea id="textout" name="textfoulder" placeholder="Введите ваше сообщение"></textarea></label>
                        <input class="submit" type="submit">
                    </form>
                    <a href="#" class="close">Закрыть окно</a>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
