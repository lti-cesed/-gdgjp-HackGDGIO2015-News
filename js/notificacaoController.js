var app = angular.module('NewsWear', []);

app.controller('NotificacaosController', ['$scope', function($scope) {

    $scope.notificacaos = [
        {"titulo": "Assalto ao Banco Bradesco em Campina Grande",
          "mensagem": "Sete homens armados com fuzis chegaram em uma agência do Bradesco próxima a feira ..."},
        {"titulo": "Teste",
          "mensagem": "Testando ..."}
    ];

}]);