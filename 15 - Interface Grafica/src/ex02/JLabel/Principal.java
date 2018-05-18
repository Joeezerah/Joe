package ex02.JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciar JFrame
		JFrame formulario = new JFrame();
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setSize(500, 300);
        formulario.setLocationRelativeTo(null);
        formulario.setTitle("Utilizando JFrame");
        formulario.setLayout(null);
        
        //Instanciar JLabel
        JLabel rotulo = new JLabel();
        rotulo.setText("Ola mundo!");
        rotulo.setBounds(150, 120, 300, 15);
        
        //Adcionar componente ao JFrame
        formulario.add(rotulo);
        
        

	}

}
