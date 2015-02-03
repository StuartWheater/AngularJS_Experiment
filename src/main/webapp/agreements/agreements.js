angular.module('agreementsModule', []);

angular.module('agreementsModule').controller('agreementsCtrl', ['$scope', function ($scope)
{
    $scope.currentPage = 1;
    $scope.pageSize    = 6;
    $scope.pageNumbers = ['1', '2', '3'];

    $scope.agreements =
    [
       {'name': 'Name  1', 'text': 'Text Text Text Text 01', 'status': 'active'},
       {'name': 'Name  2', 'text': 'Text Text Text Text 02', 'status': 'active'},
       {'name': 'Name  3', 'text': 'Text Text Text Text 03', 'status': 'active'},
       {'name': 'Name  4', 'text': 'Text Text Text Text 04', 'status': 'active'},
       {'name': 'Name  5', 'text': 'Text Text Text Text 05', 'status': 'active'},
       {'name': 'Name  6', 'text': 'Text Text Text Text 06', 'status': 'active'},
       {'name': 'Name  7', 'text': 'Text Text Text Text 07', 'status': 'active'},
       {'name': 'Name  8', 'text': 'Text Text Text Text 08', 'status': 'active'},
       {'name': 'Name  9', 'text': 'Text Text Text Text 09', 'status': 'active'},
       {'name': 'Name 10', 'text': 'Text Text Text Text 10', 'status': 'active'},
       {'name': 'Name 11', 'text': 'Text Text Text Text 11', 'status': 'active'},
       {'name': 'Name 12', 'text': 'Text Text Text Text 12', 'status': 'active'},
       {'name': 'Name 13', 'text': 'Text Text Text Text 13', 'status': 'active'},
       {'name': 'Name 14', 'text': 'Text Text Text Text 14', 'status': 'active'},
       {'name': 'Name 15', 'text': 'Text Text Text Text 15', 'status': 'active'},
       {'name': 'Name 16', 'text': 'Text Text Text Text 16', 'status': 'active'},
       {'name': 'Name 17', 'text': 'Text Text Text Text 17', 'status': 'active'},
       {'name': 'Name 18', 'text': 'Text Text Text Text 18', 'status': 'active'},
       {'name': 'Name 19', 'text': 'Text Text Text Text 19', 'status': 'active'},
       {'name': 'Name 20', 'text': 'Text Text Text Text 20', 'status': 'active'},
       {'name': 'Name 21', 'text': 'Text Text Text Text 21', 'status': 'active'},
       {'name': 'Name 22', 'text': 'Text Text Text Text 22', 'status': 'active'},
       {'name': 'Name 23', 'text': 'Text Text Text Text 23', 'status': 'active'},
       {'name': 'Name 24', 'text': 'Text Text Text Text 24', 'status': 'active'}
    ];

    $scope.setCurrentPage = function(currentIndex)
    {
        $scope.currentPage = currentIndex + 1;
    };

    $scope.decreaseCurrentPage = function()
    {
        $scope.currentPage--;
    };

    $scope.isCurrentPage = function(currentPage)
    {
        return $scope.currentPage == currentPage;
    };

    $scope.needsPagination = function()
    {
        return $scope.numberOfPages() > 0;
    };

    $scope.havePreviousPage = function()
    {
        return $scope.currentPage > 1;
    };

    $scope.haveNextPage = function()
    {
        return $scope.currentPage < $scope.numberOfPages();
    };

    $scope.numberOfPages = function()
    {
        return Math.ceil($scope.agreements.length / $scope.pageSize);
    };
}]);

angular.module('agreementsModule').filter('onpage', ['$scope', function ($scope)
{
    return function (input)
    {
        return $scope.agreements.slice($scope.currentPage * $scope.pageSize, ($scope.currentPage + 1) * $scope.pageSize);
    }
}]);
