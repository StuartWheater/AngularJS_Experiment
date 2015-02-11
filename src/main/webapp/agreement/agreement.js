'use strict';

angular.module('agreementModule', []);

angular.module('agreementModule').controller('agreementController', ['$scope', '$stateParams', '$log', 'AgreementLoader', function ($scope, $stateParams, $log, AgreementLoader)
{
    $scope.agreement = { };

    this.reload = function (url)
    {
		AgreementLoader.load(url).then(function (data)
        {
            $scope.agreement = data;
            $log.debug("in load-url: " + JSON.stringify($scope.agreement));
        });
    };

    this.reload($stateParams.detailsurl);
}]);

angular.module('agreementModule').factory('AgreementLoader', ['$http', '$q', '$log', function ($http, $q, $log)
{
    return {
        load: function (url)
        {
            var deferred = $q.defer();

            $http.get(url).
                success(function (data, status, headers, config)
                {
                    deferred.resolve(data);
                }).
                error(function (data, status, headers, config)
                {
                    deferred.resolve([ ]);
                });

            return deferred.promise;
        }
    };
}]);