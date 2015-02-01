angular.module('agreementtemplatesModule', []);

angular.module('agreementtemplatesModule').controller('agreementtemplatesCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
