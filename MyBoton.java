import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyBoton extends JButton implements ActionListener {

	MyBoton() {
		// le pasamos a la superclase el titulo del boton
		super("clickame");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// en caso de clicar imprime por consola
		System.out.println("se ha clicado");

	}

}
