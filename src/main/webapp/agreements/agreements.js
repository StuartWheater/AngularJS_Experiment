angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsCtrl', ['$scope', function ($scope)
{
    $scope.currentPage = 1;
    $scope.pageSize    = 6;
    $scope.pageNumbers = ['1'];

    $scope.agreements = [ ];

    this.reload = function ()
    {
        alert('reload');
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

angular.module('agreementsModule').service('loader', ['$scope', '$http', function ($scope, $http)
{
    this.load = function ()
    {
        $http.get('/ws/agreements').
            success(function (data, status, headers, config)
            {
                $scope.agreements = data;
                alert('success');
            }).
            error(function (data, status, headers, config)
            {
                $scope.agreements = [ ];
                alert('error');
            });
    };
}]);
