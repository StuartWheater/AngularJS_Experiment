angular.module('agreementyemplates', []);

angular.module('agreementtemplates').controller('agreementtemplatesCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
