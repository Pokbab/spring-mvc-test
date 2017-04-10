window.boardApp = angular.module("boardApp", []);

boardApp.controller('boardCtrl', function($scope, $http, $httpParamSerializer) {
	
	$scope.boardList = {};
	
	$scope.init = function() {
		$scope.getBoardList();
	};
	
	$scope.getBoardList = function() {
		$http.get("/api/boards").then(function(response) {
			var responseData = response.data;
			if (responseData.header.successful) {
				$scope.boardList = responseData.boards;
			}
		});
	};
	
	$scope.goWrite = function() {
		location.href = '/board/write/form';
	}
	
	$scope.remove = function(id) {
		$scope.boardList = $scope.boardList.slice(id);
	}
})
