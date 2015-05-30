Polymer('music-demo', {
      page: 0,
      notificacaos: [

            {"titulo": "Assalto ao Banco Bradesco em Campina Grande",
                      "mensagem": "Sete homens armados com fuzis chegaram em uma agência do Bradesco próxima a feira ..."},
            {"titulo": "Teste",
              "mensagem": "Testando ..."}

      ],
      selectedAlbum: null,
      transition: function(e) {
        if (this.page === 0 && e.target.templateInstance.model.item) {
          this.selectedAlbum = e.target.templateInstance.model.item;
          this.page = 1;
        }
        else {
          this.page = 0;
        }
      },
      updateElements: function() {
          var request = new XMLHttpRequest();
          request.onreadystatechange = function (event) {
              if (request.readyState === 4) {
                  if (request.status === 200) {
                      var resposta = JSON.parse(this.responseText);
                      document.querySelector('music-demo').items = resposta;
                  } else {
                      console.log = ("Não foi possivel recuperar dados");
                  }
                  request.abort();
              }
          };
          request.open('get', 'https://webservicecartpol.herokuapp.com/server/bo', true);
          request.send();
      }
    });