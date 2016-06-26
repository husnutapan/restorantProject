App.controller('MasaController', [ '$scope', 'MasaService', 'ngDialog',
		'$rootScope',
		function($scope, MasaService, ngDialog, $rootScope, $controller) {
			var self = this;

			self.masa = {
				id : null,
				name : '',
				isOnline : false
			};

			self.masalar = [];

			self.fetchAllMasa = function() {
				MasaService.fetchAllMasa().then(function(d) {
					self.masalar = d;
				}, function(errResponse) {
					console.error('Error while fetching Currencies');
				});
			};

			self.sendDataToDialog = function sendDataToDialog(masa) {
				ngDialog.openConfirm({
					template : 'resources/html/corba.html',
					className : 'ngdialog-theme-default',
					showClose : false,

				}).then(function(value) {

					ngDialog.close('corba');
					ngDialog.openConfirm({
						template : 'resources/html/yemek.html',
						className : 'ngdialog-theme-default',
						showClose : false
					}).then(function(value) {

						ngDialog.close('yemek');

						ngDialog.openConfirm({
							template : 'resources/html/tatli.html',
							className : 'ngdialog-theme-default',
							showClose : false
						})
					}, function(reason) {
					});

				}, function(reason) {
				});

			};

			self.fetchAllMasa();
		} ]);
