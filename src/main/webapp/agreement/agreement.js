'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParam', function ($scope, $stateParam)
{
    $scope.agreement = $stateParam;
}]);
