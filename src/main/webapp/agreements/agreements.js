'use strict';

angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsCtrl', ['$scope', '$log', 'Loader', function ($scope, $log, Loader)
{
    $scope.currentPage = 1;
    $scope.pageSize    = 6;
    $scope.pageNumbers = ['1'];

    $scope.agreements = [ ];

    $scope.reload = function ()
    {
        $log.debug('reload');
        alert('reload');
        Loader.load().then(function (data)
        {
            $scope.agreements = data;
        });
    };

    $scope.setCurrentPage = function (currentIndex)
    {
        $scope.currentPage = currentIndex + 1;
    };

    $scope.decreaseCurrentPage = function()
    {
        $scope.currentPage--;
    };

    $scope.isCurrentPage = function (currentPage)
    {
        return $scope.currentPage == currentPage;
    };

    $scope.needsPagination = function ()
    {
        return $scope.numberOfPages() > 0;
    };

    $scope.havePreviousPage = function ()
    {
        return $scope.currentPage > 1;
    };

    $scope.haveNextPage = function ()
    {
        return $scope.currentPage < $scope.numberOfPages();
    };

    $scope.numberOfPages = function ()
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

angular.module('agreementsModule').factory('Loader', ['$scope', '$http', '$q', '$log', function ($scope, $http, $q, $log)
{
    return {
        load: function ()
        {
            var deferred = $q.defer();

            $http.get('/ws/agreements').
            success(function (data, status, headers, config)
            {
                $log.debug('http - success: ' + data);
                deferred.resolve(data);
            }).
            error(function (data, status, headers, config)
            {
                $log.debug('http - error: ' + data);
                deferred.resolve([ ]);
            });

            return deferred.promise;
        }
    };
}]);
