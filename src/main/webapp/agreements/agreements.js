angular.module('agreements', []);

angular.module('agreements').controller('agreementsCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
