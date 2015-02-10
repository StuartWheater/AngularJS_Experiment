'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementCtrl', ['$scope', function ($scope)
{
    $scope.features = [ {"name": "Name", "text": "Text", "status": "active"} ];
}]);
