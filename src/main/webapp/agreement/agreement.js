'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParams', function ($scope, $stateParams)
{
    $scope.agreement = $stateParams;

    $log.debug("in agreementController: " + JSON.stringify($stateParams));
}]);
