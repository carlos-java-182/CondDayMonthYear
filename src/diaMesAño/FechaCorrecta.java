package diaMesA�o;

import javax.swing.JOptionPane;

public class FechaCorrecta {

	public static void main(String[] args) {
		
		
	int dia, mes, a�o;
	
	dia = Integer.parseInt(JOptionPane.showInputDialog("Digita un d�a"));
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digita un mes"));
	a�o = Integer.parseInt(JOptionPane.showInputDialog("Digita un a�o"));

	
	
	if (dia>=1 && dia<=30) {
		
		if(mes>=1 && mes<=12) {
			
			if(a�o!=0) {
				JOptionPane.showConfirmDialog(null, "La fecha es correcta");
			}
			else {JOptionPane.showConfirmDialog(null, "El a�o es incorrecto");}
			
		}else {
			JOptionPane.showConfirmDialog(null, "El mes es incorrecta");
		}
		
	}else {
		JOptionPane.showConfirmDialog(null, "El d�a es incorrecta");
	}

}
}