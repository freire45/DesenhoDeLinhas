package br.com.erickfreire.desenhodelinhas;

import javax.swing.JFrame;

public class DesenhoDeLinhasTeste {
	public static void main(String[] args) {
		
		DesenhoDeLinhas painel = new DesenhoDeLinhas();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(painel);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);
		
	}

}
