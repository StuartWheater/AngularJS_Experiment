'use strict';

angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsCtrl', ['$scope', '$state', '$log', 'Loader', function ($scope, $state, $log, Loader)
{
    $scope.currentPage = 1;
    $scope.pageSize    = 6;

    $scope.agreements = [ ];

    this.reload = function ()
    {
        Loader.load().then(function (data)
        {
            $scope.agreements = data.summaries;
        });
    };

    this.reload();

    this.examine = function (agreement)
    {
    	$log.debug("in examine")
        $state.go('agreement', agreement);
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
}]);

angular.module('agreementsModule').filter('onpage', ['$scope', function ($scope)
{
    return function (input)
    {
        return input.slice($scope.currentPage * $scope.pageSize, ($scope.currentPage + 1) * $scope.pageSize);
    }
}]);

angular.module('agreementsModule').factory('Loader', ['$http', '$q', '$log', function ($http, $q, $log)
{
    return {
        load: function ()
        {
            var deferred = $q.defer();

            $http.get('/ws/agreements').
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
