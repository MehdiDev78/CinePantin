<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp" %>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <div class="col-md-3">
                <p class="lead">Shop Name</p>
                <div class="list-group">
                    <a href="#" class="list-group-item">Category 1</a>
                    <a href="#" class="list-group-item">Category 2</a>
                    <a href="#" class="list-group-item">Category 3</a>
                </div>
            </div>
          </div>
    </div>
    <!-- /.container -->
    <div class="container-wrapper">
    	<div class="container">
    		<div class="page-header">
    			<h1>Tous les produits</h1>
    				<p class="lead">Vérifier tous les CD disponibles</p>
    		
    		</div>
    		<%-- <table class="table table-striped table-hover">
    			<thead>
    				<tr class="bg-success">
    					<th>Photo de l'article</th>
    					<th>Nom de l'article</th>
    					<th>Catégorie</th>
    					<th>Prix</th>
    				</tr>
     			</thead>
     			<c:forEach var="article"   items="${article}">
     			<tr>
     				<td><img alt="" src="#"></td>
     				<td>${article.designation}</td>
     				<td>${article.categorieArticle}</td>
     				<td>${article.prix} €</td>
     				<td><a href="<spring:url value="/listeArticle/detailArticle/${article.id}"/>">
     				<button type="button" class="btn btn-primary btn-sm">En savoir +</button></a></td>
     			
     			</tr>
     			</c:forEach>
    		</table> --%>
    		<c:forEach var="article"   items="${article}">
    			<div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail">
                            <img src="http://placehold.it/320x150" alt="">
                            <div class="caption">
                                <h4 class="pull-right">${article.prix} €</h4>
                                <h4><a href="<spring:url value="/listeArticle/detailArticle/${article.id}"/>">${article.designation}</a>
                                </h4>
                                <p>${article.description}</p>
                            </div>
                            <div class="ratings">
                                <p class="pull-right">18 reviews</p>
                                <p>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star-empty"></span>
                                </p>
                            </div>
                        </div>
                        
                </div>
            </c:forEach>
    	
    	</div>
    </div>
    	
    
    <!-- /.container -->
<%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
