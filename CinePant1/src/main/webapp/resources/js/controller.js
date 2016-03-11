var panierApp = angular.module("panierApp", []);

panierApp.controller("panierCtrl", function ($scope, $http){
	$scope.refreshPanier = function (panierId){
		//je vais recuperer les informations du panierController de la methode GET
		$http.get('/CinePant1/rest/panier/'+$scope.panierId).success(function(data){
				$scope.panier = data;
		});
	};
	$scope.effacerPanier = function(){
		$http.delete('/CinePant1/rest/panier/'+$scope.panierId).success($scope.refreshPanier($scope.panierId));
	};
	$scope. initPanier = function (panierId){
		$scope.panierId = panierId;
		$scope.refreshPanier(panierId);
		
	};
	$scope.addToPanier = function (articleId){
		$scope.put('CinePant1/rest/panier/ajouter/'+articleId).success(function(data){
			$scope.refreshPanier($http.get('CinePant1/rest/panier/panierId'));
			alert("Ajout ok")
			});
		};
		
	$scope.removeFromPanier = function(articleId){
		$http.put('CinePant1/rest/panier/effacer/'+articleId).success(function(data){
			$scope.refreshPanier($http.get('CinePant1/rest/panier/panierId'));
		});
	};
		
	
});