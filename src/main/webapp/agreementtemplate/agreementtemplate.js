angular.module('agreementtemplateModule', []);

angular.module('agreementtemplateModule').controller('agreementtemplateCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
