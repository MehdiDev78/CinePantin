<%@include file="/WEB-INF/jsp/includes/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Bienvenue</h1>

            <p class="lead">Page d'administration</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/inventaireArticle" />" >Inventaire</a>
        </h3>

        <p>Je peux voir, modifier, verifier l'inventaire des articles</p>


        <%@include file="/WEB-INF/jsp/includes/footer.jsp" %>