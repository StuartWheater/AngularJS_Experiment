'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParams', '$log', function ($scope, $stateParams, $log)
{
    $scope.agreement = $stateParams.agreement;

    $log.debug("in agreementController - whole    : " + JSON.stringify($stateParams));
    $log.debug("in agreementController - agreement: " + JSON.stringify($stateParams.agreement));
}]);
