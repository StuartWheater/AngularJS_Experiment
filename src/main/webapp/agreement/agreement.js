'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParams', function ($scope, $stateParam)
{
    $scope.agreement = $stateParams;
}]);
