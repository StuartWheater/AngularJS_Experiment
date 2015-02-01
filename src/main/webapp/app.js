// var mainApp = angular.module('mainApp', ['agreementsModule', 'agreementModule', 'agreementtemplatesModule', 'agreementtemplateModule']);

var mainApp = angular.module('mainApp', []);

angular.module('mainApp').controller('mainCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);

angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider)
{
    $urlRouterProvider.otherwise('/');

    $stateProvider.
        state('agreements',
        {
            url: '/', 
            templateUrl: 'agreements/agreements.html'
        }).
        state('agreement',
        {
            url: '/',
            templateUrl: 'agreement/agreement.html'
        }).
        state('agreementtemplates',
        {
            url: '/',
            templateUrl: 'agreementtemplates/agreementtemplates.html'
        }).
        state('agreementtemplate',
        {
            url: '/',
            templateUrl: 'agreementtemplate/agreementtemplate.html'
        });
}]);
