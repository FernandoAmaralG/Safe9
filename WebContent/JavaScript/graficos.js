function desenharGraficos(){			
      			
      //Line Chart
	  var dadosJson = $.ajax({
		  url: 'https://gist.githubusercontent.com/FernandoAmaralG/c78ba0c0538b4d81e93f0321c2cf6302/raw/cc899470a7e4e6ad4e855c021247992e284fdb0d/lineChartDados.json',
		  dataType: 'json',
		  async: false
	  }).responseText;
	  
	  var tabela = new google.visualization.DataTable(dadosJson);
            				
      var opcoes = {
    		  title: 'Gastos por mês',
    		  heigth: 500,
    		  width: 650,
    		  vAxis: {
    			  format: 'currency', 
    			  gridlines: {count:5, color: 'transparent'}
    		  },
    		  curveType: 'function',
    		  legend: 'none'
      }
				
      var grafico = new google.visualization.LineChart(document.getElementById('graficoLinha'));
      grafico.draw(tabela,opcoes);
      
      //Column Chart
      var tabela = google.visualization.arrayToDataTable([
    	  ['Mês','Entrada','Saída'],
    	  ['jan', 2500, 1000],
    	  ['fev', 2000, 500],
    	  ['mar', 3000, 1300],
    	  ['abr', 1500, 1700],
    	  ['mai', 5000, 2250],
    	  ['jun', 3567, 3000],
    	  ['jul', 3452, 1468],
    	  ['ago', 1833, 5250],
    	  ['set', 3803, 5500],
    	  ['out', 1800, 1000],
    	  ['nov', 3569, 1500],
    	  ['dez', 3000, 1740]
      ]);
      
      var opcoes = {
    		  title: 'Entradas e saídas da conta',
    		  width: 800,
    		  height: 400,
    		  vAxis: {
    			  gridlines:{color:'transparent'},
    			  format: 'currency',
    			  title: 'Valores'
    		  },
    		  hAxis: {
    			  title: 'Mês'
    		  }
      }
      
      var grafico = new google.visualization.ColumnChart(document.getElementById('graficoColuna'));
      grafico.draw(tabela,opcoes);
      
      //Colunas surpresa
      var tabela = new google.visualization.DataTable();
      tabela.addColumn('string','categorias');
      tabela.addColumn('number','valores');
      tabela.addColumn({type: 'string', role:'annotation'});
      tabela.addColumn({type: 'string', role:'style'});
      tabela.addRows([
      		['Educação', 2000, 'R$2.000,00', 'blue'],
       		['Transporte',500, 'R$500,00', 'grey'],
      		['Lazer',230, 'R$230,00', 'green'],
   			['Saúde',50, 'R$50,00', 'yellow'],
       		['Cartão de crédito',900, 'R$900,00', '#a6a6a6'],
          	['Alimentação',260, 'R$260,00', 'purple']      			
      ]);
      
      tabela.sort([{column: 1, desc: true}]);
            
      var opcoes = {
    		  title: 'Tipos de Gastos',
    		  height: 400,
    		  width: 800,
    		  vAxis: {
    			  gridlines: {count:0, color:'transparent'}
    		  },
    		  legend:'none',
    		  hAxis: {
    			  gridlines: {color: 'transparent'},
    			  format: 'currency'
    		  },
    		  
      }
      
      var grafico = new google.visualization.BarChart(document.getElementById('graficoColunaSurpresa'));
      grafico.draw(tabela,opcoes);
      
      //grafico de barra com arquivo json
      
      var dadosJson = $.ajax({
    	  url: 'https://gist.githubusercontent.com/FernandoAmaralG/0c3e926150962e2bf7a3a4650c9c872b/raw/de5a2d2092516b279dd8349685e4de16f6e706e5/dados.json',
    	  dataType: 'json',
    	  async: false
      }).responseText;
      
      var tabela = new google.visualization.DataTable(dadosJson);
      
      tabela.sort([{column: 1, desc: true}]);
      
      var opcoes = {
    		  title: 'Usuários e Poupanças',
    		  height: 400,
    		  width: 800,
    		  legend: 'none',
    		  hAxis: {
    			  gridlines: {
    				  color: 'transparent'
    			  }
    		  }
      }
      
      var grafico = new google.visualization.BarChart(document.getElementById('graficoBarrasJson'));
      grafico.draw(tabela);
}