var agreementApp = angular.module('agreementApp', []);

agreementApp.controller('agreementCtrl', function ($scope)
{
     $scope.features = [
         { 'name': 'Field 1', 'text': 'Test text 1'},
         { 'name': 'Field 2', 'text': 'Test text 2'},
         { 'name': 'Field 3', 'text': 'Test text 3'},
         { 'name': 'Field 3', 'text': 'Test text 4'}
     ];
});
