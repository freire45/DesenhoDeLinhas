package br.com.erickfreire.desenhodelinhas;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Crie um prorgam em java que desenha linhas em uma janela gráfica
 * @author Erick Freire
 * @version 1 - Criado em 06-04-2021 as 17:49
 */

public class DesenhoDeLinhas extends JPanel {
	
	public void paintComponent(Graphics g) 
	{
		int largura = getWidth();
		int altura = getHeight();
		int contador = 1;
		int passos = 0;

		while (altura - passos >= 0) {

            g.drawLine(0, 0, passos, altura - passos);
			
			//canto inferior direito
			g.drawLine(largura, altura, passos, altura - passos);
			
			//canto superior direito
			g.drawLine(largura, 0, passos, passos);
			
		    //canto inferior esquerdo
			g.drawLine(0, altura, passos, passos);
			
			passos = passos + 15;

		}
	}

}
