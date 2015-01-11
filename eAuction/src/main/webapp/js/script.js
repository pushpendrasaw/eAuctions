var eAuctionModule = angular.module('eAuctionApp', ['ngAnimate']);

eAuctionModule.controller('eAuctionController', function ($scope,$http) {
	var urlBase="";
	$scope.toggle=true;
	$scope.selection = [];
	$http.defaults.headers.post["Content-Type"] = "application/json";

    
	//Login Task
	$scope.loginTask = function loginTask() {
		
		if($scope.userName == null || $scope.pswd==null){
			alert(" Both Username and password are Required Filled ");
		}
		else{
			$http.get(urlBase + '/api/Login/'+$scope.userName, {
             username: $scope.userName,
             password: $scope.pswd
         	}).
         	success(function(data, status, headers) {
			 console.log("Data " + $scope.data + " \nstatus :" +status+"\n headers"+headers);
			 alert("Username and Password mismatch");
             var newAppUri = headers()["location"];
             console.log("Might be good to GET " + newAppUri + " and append the task.");
            }).
			error(function(data, status, headers, config) {
				alert("Username and Password mismatch");
				console.log("Data " + data + " \nstatus :" +status+"\n headers"+headers+"\n config : "+config);
				
			});
		}
	};
	
	// Registration Task
	$scope.addUser = function addUser() {
		if($scope.username=="" || $scope.usrpwd=="" || $scope.uname == "" || $scope.logger == ""){
			alert("Insufficient Data! Please provide values for user name, password and Name");
		}
		else{
		 $http.post(urlBase + '/Login', {
             username: $scope.username,
             password: $scope.usrpwd,
             sb: $scope.logger,
         }).
		  success(function(data, status, headers) {
			 console.log("Task added");
			 if($scope.logger=="BUYER"){
				 $http.post(urlBase + '/Buyer', {
					 name: $scope.uname,
				 }).
				 success(function(data, status, headers) {
					 console.log("Task added in buyer");
					 alert(" Successfully registered As Buyer");
				 }).
				 error(function(data, status, headers) {
					 console.log("Task not added in buyer");
					 alert(" Error : unregistered As Buyer");
				 });
			 }
			 else{
				 $http.post(urlBase + '/Seller', {
		             name: $scope.uname,
		          }).
				  success(function(data, status, headers) {
					 console.log("Task added in seller");
					 alert(" Successfully registered As Seller");
		             var newTaskUri = headers()["location"];
		           }).
		           error(function(data, status, headers) {
					 console.log("Task not added in seller");
					 alert(" Error : registered As Seller");
		           });
			 }
           }).
           error(function(data, status, headers) {
			 alert("Username Already Exists");
           });
		}
	};
});
