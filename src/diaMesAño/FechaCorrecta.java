package diaMesAño;

import javax.swing.JOptionPane;

public class FechaCorrecta {

	public static void main(String[] args) {
		
		
	int dia, mes, año;
	
	dia = Integer.parseInt(JOptionPane.showInputDialog("Digita un día"));
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digita un mes"));
	año = Integer.parseInt(JOptionPane.showInputDialog("Digita un año"));

	
	
	if (dia>=1 && dia<=30) {
		
		if(mes>=1 && mes<=12) {
			
			if(año!=0) {
				JOptionPane.showConfirmDialog(null, "La fecha es correcta");
			}
			else {JOptionPane.showConfirmDialog(null, "El año es incorrecto");}
			
		}else {
			JOptionPane.showConfirmDialog(null, "El mes es incorrecta");
		}
		
	}else {
		JOptionPane.showConfirmDialog(null, "El día es incorrecta");
	}

}
}