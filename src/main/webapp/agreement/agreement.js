angular.module('agreement', []);

angular.module('agreement').controller('agreementCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
