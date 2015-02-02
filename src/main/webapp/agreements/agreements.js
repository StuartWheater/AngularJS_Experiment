angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsCtrl', ['$scope', function ($scope)
{
    $scope.features =
    [
       {"name": "Name 1", "text": "Text 1", "status": "active"},
       {"name": "Name 2", "text": "Text 2", "status": "active"}
    ];
}]);
