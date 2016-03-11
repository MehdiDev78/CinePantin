<%@include file="/WEB-INF/jsp/includes/header.jsp" %>


<div class="container-wrapper">
    <div class="login-container">
        <div id="login-box">

            <h2>Renseigner votre username et mot de passe</h2>

            <c:if test="${not empty logout}">
                <div class="msg">${logout}</div>
            </c:if>

            <form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">Nom utilisateur : </label>
                    <input type="text" id="username" name="username" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="password">Mot de passe :</label>
                    <input type="password" id="password" name="password" class="form-control" />
                </div>

                <input type="submit" value="Valider" class="btn btn-default">

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>

        </div>
    </div>
</div>

<%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
