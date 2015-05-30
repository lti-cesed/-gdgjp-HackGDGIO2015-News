var app = angular.module('NewsWear', []);

app.controller('NotificacaosController', ['$scope', function($scope) {

    $scope.notificacaos = [];

    $scope.updateElements = function() {
	  	var request = new XMLHttpRequest();
	  	request.onreadystatechange = function (event) {
	      	if (request.readyState === 4) {
	          	if (request.status === 200) {
	              	var resposta = JSON.parse(this.responseText);
	              	$scope.$apply(function() {
		              	$scope.notificacaos = resposta
	              	});
	          	} else {
	              	console.log = ("Não foi possivel recuperar dados");
	          	}
	          	request.abort();
	      	}
	  	};
	  	request.open('get', 'http://wsnewsappwatch.herokuapp.com/server/notificacao', true);
	  	request.send();
	}
	$scope.updateElements();
}]);