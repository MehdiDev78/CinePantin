<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp" %>

<div class="container-wrapper">
    	<div class="container">
    		<div class="page-header">
    			<h1>Détails de l'article</h1>
    				<p class="lead">Voici les détails supplémentaires concernant le produits</p>
    		
    		</div>
    	<div class="container" ng-app = "PanierApp">
    		<div class="row">
    			<div class="col-md-5">
    				<img src="<c:url value="/resources/images/${article.articleId}.jpg" /> " alt="image"
                             style="width:100%"/>
    			
    			</div>
    			<div class="col-md-5">
    				<h3>${article.desigantion}</h3>
    				
    				<p><strong>Description : </strong>${article.description}</p>
    				<p><strong>Catégorie : </strong>${article.categorieArticle}</p>
    				<p><strong>Quantité en stock : </strong>${article.quantite}</p>
    				<h4>${article.prix} €</h4>
    				
    				<br>
    				
    				<c:set var ="role" scope="page" value="${param.role}"/>
    				<c:set var ="url" scope="page" value="$/article/articleListe"/>
    				<c:if test="${role='admin'}">
    					<c:set var="url" scope="page" value="/admin/inventaireArticle"/>
    					
    				</c:if>
    				<p ng-controller="panierCtrl">
    				<a href="<c:url value="${url}"/>" class="btn btn-default">Retour</a>
  					<a href="#" class="btn btn-warning btn-large" ng-click="addToPanier('${article.articleId}')"><span class="glyphicon glyphicon-shopping-cart"></span>Commander Maintenant</a>
  					<a href="<spring:url value="/panier"/>" class="btn btn-default"><span class="glyphicon glyphicon-hand-right"></span>Voir panier</a>
  					</p>
    				
    			
    			</div>
    		
    		</div>
    	
    	</div>
    	
    	</div>
    	
<script src="<c:url value="/resources/js/controller.js"/>"></script>  	
<%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
    	