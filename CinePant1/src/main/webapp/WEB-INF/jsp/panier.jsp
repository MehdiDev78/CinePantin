<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp" %>


<div class="container-wrapper">
	<div class="container">
		<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Panier</h1>
				
				<p>Tous les produits sélectionnés dans votre panier</p>
			
			</div>
		
		</div>
		
		</section>
		<section class="container" ng-app="panierApp">
			<div ng-controller = "panierCtrl" ng-init ="initPanierId('${panierId}')">
			</div>
		<div>
			<a class="btn btn-danger pull-left" ng-click ="removeFromPanier(article.articleId)"><span class="glyphicon glyphicon-remove-sign"></span>Effacer panier</a>
		</div>
		<table class="table table-hover">
			<tr>
				<th>Desigantion</th>
				<th>Prix unitaire</th>
				<th>Quantité</th>
				<th>Prix</th>
				<th>Action</th>
				
			</tr ng-repeat = "article in panier.ligneCommandes">
				<tr>
					<td>${article.designation}</td>
					<td>${article.prix}</td>
					<td>${article.quantite}</td>
					<td>${article.prixTotal}</td>
					<td><a href="#" class ="label label-danger" ng-click="removeFromPanier(article.articleId)"><span class="glyphicon glyphicon-remove"></span>Effacer</a></td>
				
				</tr>
			<tr>
				<th></th>
				<th></th>
				<th>Total</th>
				<th>{{panier.panierTotal}}</th>
				
			</tr>
			
		</table>
		<a href="<spring:url value="/articlesListe"/>" class="btn btn-default">Continuer vos achats</a>
		
		</section>
	
	</div>

</div>
















<script src="<c:url value="/resources/js/controller.js"/>"></script>
<%@include file="/WEB-INF/jsp/includes/footer.jsp" %>