import javax.swing.JOptionPane;

public class compareNumero
{
	public static void main (String args[])
	{
		// declaracion de variables.
		String primerNumero;
		String segundoNumero;
		String resultado1;

		//declaracion de variables int.
		int numero1;
		int numero2;

		//se ingresan los numeros.
		primerNumero = JOptionPane.showInputDialog ("Escriba el primer entero.");
		segundoNumero = JOptionPane.showInputDialog ("Escriba el segundo entero.");

		//se transforman los numeros guardados como strings.
		numero1= Integer.parseInt(primerNumero);
		numero2 = Integer.parseInt(segundoNumero);

		//se inicializa la variable resultado en 0.
		resultado1 = " " ;

		//se comprar con if los numeros.
		if (numero1 < numero2)
			resultado1 = resultado1 + numero1 + " < " + numero2;
		if (numero1 > numero2)
			resultado1 = resultado1 + numero1 + " > " + numero2;
		if (numero1 == numero2)
			resultado1 = resultado1 + numero1 + " == " + numero2;

		//se despliega la comparacion atraves de un message box.
		JOptionPane.showMessageDialog( null , resultado1 ,"Resultados De La Comparacion", JOptionPane.PLAIN_MESSAGE);
		System.exit (0);
	}
}
