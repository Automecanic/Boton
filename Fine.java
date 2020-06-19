
import java.awt.FlowLayout;

import javax.swing.JFrame;

//heredamos de JFrame
public class Fine extends JFrame {

	Fine() {
		setLayout(new FlowLayout());

		// posición de la ventana en la pantalla
		setBounds(200, 200, 200, 200);

		// creamos el boton
		MyBoton boto1 = new MyBoton();

		// le asignamos una accion/escucha
		boto1.addActionListener(boto1);
		add(boto1);

		// hacemos que la ventana sea visible
		setVisible(true);

	}

	public static void main(String[] args) {
		Fine f1 = new Fine();

	}
}
