'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$log', function ($scope, $log)
{
    $scope.agreement = { };

    $log.debug("in agreementController - agreement: " + JSON.stringify($scope.agreement));
}]);
