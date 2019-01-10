import javax.swing.JFrame;

public class DesenhoTeste {

	public static void main(String[] args) {
		
		
		DesenhoPanel panel = new DesenhoPanel();
		JFrame app = new JFrame();
		
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);

	}

}
