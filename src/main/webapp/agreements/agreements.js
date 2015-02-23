'use strict';

angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsController', ['$scope', '$state', '$log', 'AgreementsLoader', function ($scope, $state, $log, AgreementsLoader)
{
    $scope.currentPage = 1;
    $scope.pageSize    = 6;

    $scope.agreements = [ ];

    this.create = function ()
    {
        $state.go('agreementtemplates');
    };

    this.reload = function ()
    {
        AgreementsLoader.load().then(function (summaries)
        {
            $scope.agreements = summaries;
        });
    };

    this.examine = function (agreement)
    {
        $state.go('agreement', { "detailsurl": agreement.detailsurl });
    };

    this.terminate = function (agreement)
    {
        $state.go('agreementtemplates');
    };

    this.setCurrentPage = function (currentIndex)
    {
        $scope.currentPage = currentIndex;
    };

    this.decreaseCurrentPage = function()
    {
        $scope.currentPage--;
    };

    this.increaseCurrentPage = function()
    {
        $scope.currentPage--;
    };

    this.isCurrentPage = function (currentPage)
    {
        return $scope.currentPage == currentPage;
    };

    this.needsPagination = function ()
    {
        return $scope.agreements.length > $scope.pageSize;
    };

    this.havePreviousPage = function ()
    {
        return $scope.currentPage > 1;
    };

    this.haveNextPage = function ()
    {
        return $scope.currentPage < this.numberOfPages();
    };

    this.numberOfPages = function ()
    {
        return Math.ceil($scope.agreements.length / $scope.pageSize);
    };

    this.reload();
}]);

angular.module('agreementsModule').filter('onpage', ['$scope', function ($scope)
{
    return function (input)
    {
        return input.slice($scope.currentPage * $scope.pageSize, ($scope.currentPage + 1) * $scope.pageSize);
    }
}]);

angular.module('agreementsModule').factory('AgreementsLoader', ['$http', '$q', '$log', function ($http, $q, $log)
{
    return {
        load: function ()
        {
            var deferred = $q.defer();

            $http.get('ws/agreements').
                success(function (data, status, headers, config)
                {
                    if (data.summaries)
                        deferred.resolve(data.summaries);
                    else
                        deferred.resolve([ ]);
                }).
                error(function (data, status, headers, config)
                {
                    deferred.resolve([ ]);
                });

            return deferred.promise;
        }
    };
}]);
