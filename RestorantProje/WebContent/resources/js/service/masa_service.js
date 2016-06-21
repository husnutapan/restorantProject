App.factory('MasaService', [
		'$http',
		'$q',
		function($http, $q) {
			return {
				fetchAllMasa : function() {
					return $http.get(
							'http://localhost:8080/RestorantProje/masalar/')
							.then(function(response) {
								return response.data;
							}, function(errResponse) {
								console.error('Error while fetching users');
								return $q.reject(errResponse);
							});
				}

			};
		} ]);