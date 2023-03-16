package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
//JFrame é o componente Geral que agrupa outros componentes
	//menores, como os JPanel
	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("NokiaCalculator");
	}
	
	
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);//Definindo o local do display
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		//Definindo o lugar do teclado
	}



	public static void main(String[] args) {
		new Calculadora();
	}
}
