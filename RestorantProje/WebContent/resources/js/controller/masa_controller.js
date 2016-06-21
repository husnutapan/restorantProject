App.controller('MasaController', [ '$scope', 'MasaService',
		function($scope, MasaService) {
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

			self.fetchAllMasa();
		} ]);
