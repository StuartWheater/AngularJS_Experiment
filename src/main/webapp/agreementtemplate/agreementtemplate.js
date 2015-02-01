angular.module('agreementyemplate', []);

angular.module('agreementtemplate').controller('agreementtemplateCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
