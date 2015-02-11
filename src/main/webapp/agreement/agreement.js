'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParams', '$log', function ($scope, $stateParams, $log)
{
    $scope.agreement = $stateParams;

    $log.debug("in agreementController: " + JSON.stringify($stateParams));
}]);
