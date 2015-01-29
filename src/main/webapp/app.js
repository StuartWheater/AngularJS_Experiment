var agreementApp = angular.module('agreementApp', []);

agreementApp.controller('agreementCtrl', function ($scope)
{
     $scope.features = [
         { 'name': 'Field 1', 'text': 'Test text 1', 'status': 'active' },
         { 'name': 'Field 2', 'text': 'Test text 2', 'status': 'proposed' },
         { 'name': 'Field 3', 'text': 'Test text 3', 'status': 'active' },
         { 'name': 'Field 3', 'text': 'Test text 4', 'status': 'proposed' },
     ];
});
