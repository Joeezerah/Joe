package exercicio10;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		//Variaveis
		Object[] menu = {"Cadastrar Contatos" , "Alterar Contatos", "Excluir  Contatos" , "Pesquisar Contatos" , "Alterar Categoria" , "Excluir Categoria" , "Lembrete De Aniversario" , "Sair"};
		Object escolha = "";
		boolean valido = false;
		String nome = "";
		String sobrenome = "";
		String data = "";
		boolean valido2 = true;
		String[] nomes = new String [100];
		String[] sobrenomes = new String [100];
		String[] datas = new String [100];
		int [] meses = new int [100];
		int dia = 0;
		int mes = 0;
		int ano = 0;
		String email = "";
		String endereco = "";
		String nrcel = "";
		String categoria = "";
		int quantcontatos = 1;
		String info = "";
		String []infos = new String [100];
		String [] categorias = new String [100];
		int confirmacao = 0;
	    int quantcategorias = -1;
	    int contato = 0;
	  
	  
		
		
		while(!escolha.equals("Sair")){
			
			do{
				try {
					escolha = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu" , JOptionPane.PLAIN_MESSAGE, null, menu, "");
					valido = true;
				}catch (Exception e){
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro");
				}
			}while(valido==false);
			
			if (escolha.equals("Sair")){
				break;
			}
		
		
		if (escolha.equals("Cadastrar Contatos")){
			valido = false;
			do{
				
				try{
					nome = JOptionPane.showInputDialog("Digite o nome do contato");
					valido = true;
					if (nome.isEmpty()){
							valido=false;
							
						}
					}catch (Exception e){
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro");
					
				}
			}while (valido2 == false);
			valido = false ;
			
		}do{
			do{
				
			try{
				sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do contato");
				valido = true;
				if (sobrenome.isEmpty()){
						valido=false;
						
					}
				}catch (Exception e){
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro");
				
			}
		}while (valido2 == false);
		valido = true ;
		for (int i = 0; i < nomes.length; i++) {
			if ((nome.equals(nomes[i])) && (sobrenome.equals(sobrenomes[i]))){
				valido2 = false;
				JOptionPane.showMessageDialog(null, "Pessoa ja cadastrada");
				valido2 = false;
			}
		}	
		}while (valido == false);
		
 		valido = false;
 		do{
 			try{
 				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento do contato"));
 				valido = true;
 				if ((dia>31) || (dia < 1)){
 					valido = false;
 				}
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null, "Erro");		
 			}
 		}while (valido == false);
 		
 		valido = false;
 		
 		do{
 			try{
 				mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento do contato"));
 				valido = true;
 				if ((mes >12) || (mes < 1)){
 					valido = false;
 				}
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null,"Erro");
 				
 			}
 		}while(valido == false);
 		valido = false;
 		
 		do{
 			try{
 				ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do contato"));
 				valido = true;
 				if (ano <1900){
 					valido = false;
 				}
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null,"Erro");
 				
 			}
 		}while(valido == false);
 		valido = false;
 			
 		do{
 			try{
 				nrcel = JOptionPane.showInputDialog("Digite o Nr do celular do contato");
 				valido = true;
 				if (nrcel.isEmpty()){
 					valido = false;
 					
 				}
 						
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null, "Erro");
 			}
 		}while (valido == false);
 		
 		valido = false;
 		
 		do{
 			try{
 				email = JOptionPane.showInputDialog("Digite o email do contato");
 				valido = true;
 				if (email.isEmpty()){
 					valido = false;
 					
 				}
 						
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null, "Erro");
 			}
 		}while (valido == false);
 		
 		valido = false;
 		
 		do{
 			try{
 				endereco = JOptionPane.showInputDialog("Digite o endereço do contato");
 				valido = true;
 				if (endereco.isEmpty()){
 					valido = false;
 					
 				}
 						
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null, "Erro");
 			}
 		}while (valido == false);
 		
 		valido = false;
 		do{
 			try{
 				categoria = JOptionPane.showInputDialog("Digite a categoria do contato");
 				valido = true;
 				if (categoria.isEmpty()){
 					valido = false;
 					
 				}
 						
 			}catch (Exception e){
 				valido = false;
 				JOptionPane.showMessageDialog(null, "Erro");
 			}
 		}while (valido == false);
 		
 		valido = false;
 		
		} 
		if (escolha.equals("Alterar contato")){
			valido = false;
			do{
				
				try{
					nome = JOptionPane.showInputDialog("Digite o nome do contato que desejas alterar");
					for (int i = 0; i < nome.length(); i++) {
						if (nome.equals(infos[i])){
						nome = JOptionPane.showInputDialog("Digite o nome do novo contato");
						sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do novo contato");
						email = JOptionPane.showInputDialog("Digite o email do novo contato");
						nrcel = JOptionPane.showInputDialog("Digite o Telefone do novo contato");
						endereco = JOptionPane.showInputDialog("Digite o endereço do novo contato");
						categoria = JOptionPane.showInputDialog("Digite a categoria do novo contato");
						
						
						}
					}
						
					
					
					valido = true;
					if (nome.isEmpty()){
							valido=false;
							
						}
					}catch (Exception e){
						valido = false;
						JOptionPane.showMessageDialog(null, "Erro");
					
				}
			}while (valido == false);
			valido = false ;
			
			if (escolha.equals("Excluir Contato")){
				valido = false;
				do{
					
					try{
						nome = JOptionPane.showInputDialog("Diga nome do seu contato ao qual deseja excluir");
						for (int i = 0; i < nome.length(); i++) {
							if (nome.equals(infos[i])){
								
								infos[i] = null;
								nomes[i] = null;
								sobrenomes[i] = null;
							
							
							}
						}
							
						
						
						valido = true;
						if (nome.isEmpty()){
								valido=false;
								
							}
						}catch (Exception e){
							valido = false;
							JOptionPane.showMessageDialog(null, "Erro");
						
					}
				}while (valido == false);
				valido = false ;
			
			
			
 		
 	
 		
 		
			}
		}
	}
}

	
 		

 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		


