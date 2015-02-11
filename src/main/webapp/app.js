'use strict';

var mainApp = angular.module('mainApp', ['ui.router', 'agreementsModule', 'agreementModule', 'agreementtemplatesModule', 'agreementtemplateModule']);

angular.module('mainApp').controller('mainController', [ '$scope', function ($scope)
{
    $scope.currentAgreement         = null;
    $scope.currentAgreementTemplate = null;
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
            url: '/:detailsurl',
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
