App.controller('UserController', [
		'$scope',
		'UserService',
		function($scope, UserService) {
			var self = this;
			self.employee = {
				id : null,
				name : '',
				salary : '',
				ssn : ''
			};
			self.employees = [];
			self.fetchAllUsers = function() {
				UserService.fetchAllUsers().then(function(d) {
					self.employees = d;
				}, function(errResponse) {
					console.error('Error while fetching Currencies');
				});
			};
			self.createUser = function(employee) {
				UserService.createUser(employee).then(self.fetchAllUsers,
						function(errResponse) {
							console.error('Error while creating User.');
						});
			};

			self.updateUser = function(employee, id) {
				UserService.updateUser(employee, id).then(self.fetchAllUsers,
						function(errResponse) {
							console.error('Error while updating User.');
						});
			};

			self.deleteUser = function(id) {
				UserService.deleteUser(id).then(self.fetchAllUsers,
						function(errResponse) {
							console.error('Error while deleting User.');
						});
			};

			self.submit = function() {
				if (self.employee.id == null) {
					console.log('Saving New User', self.user);
					self.createUser(self.employee);
				} else {
					self.updateUser(self.employee, self.employee.id);
					console.log('User updated with id ', self.employee.id);
				}
				self.reset();
			};

			self.edit = function(id) {
				console.log('id to be edited', id);
				for (var i = 0; i < self.employees.length; i++) {
					if (self.employees[i].id == id) {
						self.employee = angular.copy(self.employees[i]);
						break;
					}
				}
			};

			self.remove = function(id) {
				console.log('id to be deleted', id);
				if (self.employee.id === id) {// clean form if the user to be
												// deleted is shown there.
					self.reset();
				}
				self.deleteUser(id);
			};

			self.reset = function() {
				self.employee = {
					id : null,
					name : '',
					salary : '',
					ssn : ''
				};
				$scope.myForm.$setPristine(); // reset Form
			};

			self.fetchAllUsers();
		} ]);