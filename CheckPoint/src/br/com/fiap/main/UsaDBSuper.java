package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.DragonBallSuper;

/**
 * Classe principal que permite interagir com a classe DragonBallSuper,
 * permitindo cadastrar e consultar informações sobre personagens do Dragon Ball
 * Super.
 * 
 * @author Paulo Henrique Moreira Angueira - 
 */

public class UsaDBSuper {

	/**
	 * Método principal que inicia a interação com o usuário para cadastrar e
	 * consultar informações sobre personagens do Dragon Ball Super.
	 *
	 * @author Paulo Henrique Moreira Angueira - 
	 */
	public static void main(String[] args) {
		String aux, nome, path, escolha = "sim";
		int opcao, ki, tecnicas, velocidade, transformacoes;
		DragonBallSuper dragonballsuper;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Escolha:  \n1.Cadastrar \n2.Consultar");
				opcao = Integer.parseInt(aux);
				path = JOptionPane.showInputDialog("Digite o caminho da pasta");
				dragonballsuper = new DragonBallSuper();
				switch (opcao) {
				case 1:
					nome = JOptionPane.showInputDialog("Digite o nome");
					aux = JOptionPane.showInputDialog("Digite a ki");
					ki = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite as tecnicas");
					tecnicas = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite a velocidade");
					velocidade = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite as transformações");
					transformacoes = Integer.parseInt(aux);
					dragonballsuper.setNome(nome);
					dragonballsuper.setKi(ki);
					dragonballsuper.setTecnicas(tecnicas);
					dragonballsuper.setValocidade(velocidade);
					dragonballsuper.setTransformacoes(transformacoes);
					JOptionPane.showMessageDialog(null, dragonballsuper.gravar(path));
					break;

				case 2:
					nome = JOptionPane.showInputDialog("Digite o nome: ");
					dragonballsuper.setNome(nome);
					dragonballsuper = dragonballsuper.ler(path);
					if (dragonballsuper == null) {
						JOptionPane.showMessageDialog(null, "Caminho e/ou nome informado inexistente ");
					} else {
						JOptionPane.showMessageDialog(null, "exibindo dados: " + "\nCaminho: " + path + "\nArquivo:"
								+ path + "/" + dragonballsuper.getNome() + ".txt" + "\nNome: "
								+ dragonballsuper.getNome() + "\nki: " + dragonballsuper.getKi() + "\nTecnicas: "
								+ dragonballsuper.getTecnicas() + "\nVelocidade: " + dragonballsuper.getValocidade()
								+ "\nTransformação: " + dragonballsuper.getTransformacoes());
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Escolha incorreta");
				}
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar? ");
		}
		JOptionPane.showMessageDialog(null, "Fim do programa!");
	}
}