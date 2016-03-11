<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Page d'inventaire</h1>

            <p class="lead">Présentation de la page d'inventaire</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo de l'article</th>
                <th>Nom de l'article</th>
                <th>catégorie</th>
                <th>Prix</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${articles}" var="article">
                <tr>
                    <td><img src="<c:url value="/resources/images/${article.articleId}.jpg" /> " alt="image"
                             style="width:100%"/></td>
                    <td>${article.designation}</td>
                    <td>${article.categorieArticle}</td>
                    <td>${article.prix} €</td>
                    <td><a href="<spring:url value="/article/detailArticle/${article.articleId}" />"
                    ><span class="glyphicon glyphicon-info-sign"></span></a></td>
                    <td><a href="<spring:url value="/admin/article/deleteArticle/${article.articleId}" />"
                    ><span class="glyphicon glyphicon-info-remove"></span></a></td>
                    <td><a href="<spring:url value="/admin/article/modifierArticle/${article.articleId}" />"
                    ><span class="glyphicon glyphicon-info-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/article/inventaireArticle/ajouterArticle" />" class="btn btn-primary">Ajouter</a>

        <%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
