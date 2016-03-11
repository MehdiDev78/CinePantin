<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Modifier un article</h1>

            <p class="lead">Merci de renseigner les informations du produit à modifier :</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/article/modifierArticle" method="post"
                   commandName="article" enctype="multipart/form-data">
        <form:hidden path="articleId" value="${article.articleId}"/>
        <div class="form-group">
            <label for="designation">Désignation</label>
            <form:input path="designation" id="designation" class="form-Control" value="${article.designation}" />
        </div>
        

        <div class="form-group">
            <label for="categorieArticle">Catégorie</label>
            <label class="checkbox-inline"><form:radiobutton path="categorieArticle" id="categorie"
                                                             value="livre" />Livres</label>
            <label class="checkbox-inline"><form:radiobutton path="categorieArticle" id="categorie"
                                                             value="CD" />CD</label>
            <label class="checkbox-inline"><form:radiobutton path="categorieArticle" id="categorie"
                                                             value="DVD" />DVD</label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="description" id="description" class="form-Control" value="${article.description}"/>
        </div>

        <div class="form-group">
            <label for="prix">Price</label>
            <form:input path="prix" id="prix" class="form-Control" value="${article.prix}"/>
        </div>

        <div class="form-group">
            <label for="statut">Statut</label>
            <label class="checkbox-inline"><form:radiobutton path="articleStatut" id="statut"
                                                             value="enStock" />En stock</label>
            <label class="checkbox-inline"><form:radiobutton path="articleStatut" id="statut"
                                                             value="rupture" />Rupture</label>
        </div>

        <div class="form-group">
            <label for="quantite">Quantité</label>
            <form:input path="quantite" id="quantite" class="form-Control" value="${article.quantite}"/>
        </div>
        <div class="form-group">
        	 <label class="control-labet" for="nomPhoto">Charger l'image</label>
        	 <form:input id="imageArticle" path="imageArticle" type="file" class="form:input-large"/>
        </div>

        <br><br>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/inventaireArticle" />" class="btn btn-danger">Supprimer</a>
        </form:form>


        <%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
