<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/jsp/includes/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Inscription</h1>

            <p class="lead">Merci de renseigner vos informations :</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/register" method="post"
                   commandName="registerClient">
        <div class="form-group">
        
        	<h3>Vos informations</h3>
       
            <label for="nom">Nom</label><form:errors path="nomClient" cssStyle="color:red"/>
            <form:input path="nomClient" id="nom" class="form-Control" />
            
            <label for="prenom">Prénom</label><form:errors path="prenomClient" cssStyle="color:red"/>
            <form:input path="prenomClient" id="prenom" class="form-Control" />
            
            <label for="email">Email</label><form:errors path="email" cssStyle="color:red"/>
            <form:input path="email" id="email" class="form-Control" />
            
            <label for="telMobile">Téléphone mobile</label><form:errors path="telMobile" cssStyle="color:red"/>
            <form:input path="telMobile" id="telMobile" class="form-Control" />
            
            <label for="password">Mot de passe</label><form:errors path="password" cssStyle="color:red"/>
            <form:input path="password" id="password" class="form-Control" />
                       
                    
            <h3>Adresse principale</h3>
            
            <label for="factureRue">Rue</label><form:errors path="AdresseClient.nomRue" cssStyle="color:red"/>
            <form:password path="AdresseClient.nomRue" id="factureRue" class="form-Control" />
            
            <label for="factureCP">Code Postal</label><form:errors path="AdresseClient.codePostal" cssStyle="color:red"/>
            <form:password path="AdresseClient.codePostal" id="factureCP" class="form-Control" />
            
            <label for="factureVille">Ville</label><form:errors path="AdresseClient.ville" cssStyle="color:red"/>
            <form:password path="AdresseClient.ville" id="factureVille" class="form-Control" />
            
            <label for="facturePays">Pays</label><form:errors path="AdresseClient.pays" cssStyle="color:red"/>
            <form:password path="AdresseClient.pays" id="facturePays" class="form-Control" />           
                       
            <h3>Adresse de facturation</h3>
            
            <label for="factureRue">Rue</label><form:errors path="AdresseFacturationClient.nomRue" cssStyle="color:red"/>
            <form:password path="AdresseFacturationClient.nomRue" id="factureRue" class="form-Control" />
            
            <label for="factureCP">Code Postal</label><form:errors path="AdresseFacturationClient.codePostal" cssStyle="color:red"/>
            <form:password path="AdresseFacturationClient.codePostal" id="factureCP" class="form-Control" />
            
            <label for="factureVille">Ville</label><form:errors path="AdresseFacturationClient.ville" cssStyle="color:red"/>
            <form:password path="AdresseFacturationClient.ville" id="factureVille" class="form-Control" />
            
            <label for="facturePays">Pays</label><form:errors path="AdresseFacturationClient.pays" cssStyle="color:red"/>
            <form:password path="AdresseFacturationClient.pays" id="facturePays" class="form-Control" />

        </div>

        

        <br><br>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/" />" class="btn btn-danger">Supprimer</a>
        </form:form>


        <%@include file="/WEB-INF/jsp/includes/footer.jsp" %>
