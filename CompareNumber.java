import javax.swing.JOptionPane;

public class CompareNumber {
	
	public CompareNumber()
	{
		start();
	}
	
	public int getNumber() {
		
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba un número.", "Comparación", JOptionPane.QUESTION_MESSAGE));
	}
	
	public void start() {
		
		int numero1 = getNumber();
		int numero2 = getNumber();
		
		if(numero1 < numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " < " + numero2, "Comparación", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " > " + numero2, "Comparación", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, numero1 + " = " + numero2, "Comparación", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void main(String[] args) {

		new CompareNumber();
		System.exit(0);
	}
	
}
