package View;

import javax.swing.JOptionPane;

public class ViewExibirMusica {
	
	public ViewExibirMusica(String musicas){
		if (musicas == null) {
			JOptionPane.showMessageDialog(null, "Musicas n�o Cadastradas");
		} else {
			JOptionPane.showMessageDialog(null, musicas);
			
		}
	}
}
