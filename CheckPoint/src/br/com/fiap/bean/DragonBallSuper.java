package br.com.fiap.bean;

/**Classe para objetos do tipo DragonBallSuper
 * @author Paulo Henrique Moreira Angueira - 
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe que representa um personagem do Dragon Ball Super, com atributos como
 * nome, ki, técnicas, velocidade e transformações. Implementa a interface
 * IDBSuper para ler e gravar informações em arquivos.
 * 
 * @author Paulo Henrique Moreira Angueira - 
 */

public class DragonBallSuper implements IDBSuper {

	private String nome;
	private int ki;
	private int tecnicas;
	private int velocidade;
	private int transformacoes;

	/**
	 * Construtor padrão da classe DragonBallSuper.
	 * 
	 * @author Paulo Henrique Moreira Angueira - 
	 */

	public DragonBallSuper() {
	}

	/**
	 * Métodos getters e setters para os atributos (nome, ki, técnicas, velocidade,
	 * transformações)
	 * 
	 * @author Paulo Henrique Moreira Angueira - 
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}

	public int getTecnicas() {
		return tecnicas;
	}

	public void setTecnicas(int tecnicas) {
		this.tecnicas = tecnicas;
	}

	public int getValocidade() {
		return velocidade;
	}

	public void setValocidade(int valocidade) {
		this.velocidade = valocidade;
	}

	public int getTransformacoes() {
		return transformacoes;
	}

	public void setTransformacoes(int transformacoes) {
		this.transformacoes = transformacoes;
	}

	/**
	 * Lê informações de um arquivo no caminho especificado e popula o objeto
	 * DragonBallSuper com essas informações.
	 *
	 * @author Paulo Henrique Moreira Angueira - 
	 * @param path O caminho do arquivo a ser lido.
	 * @return O objeto DragonBallSuper com os dados lidos do arquivo, ou null em
	 *         caso de falha na leitura.
	 */

	public DragonBallSuper ler(String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "/" + nome + ".txt"));
			nome = br.readLine();
			ki = Integer.parseInt(br.readLine());
			tecnicas = Integer.parseInt(br.readLine());
			velocidade = Integer.parseInt(br.readLine());
			transformacoes = Integer.parseInt(br.readLine());
			br.close();
			return this;
		} catch (IOException e) {
			return null;
		}

	}

	/**
	 * Grava as informações do objeto DragonBallSuper em um arquivo no caminho
	 * especificado.
	 *
	 * @author Paulo Henrique Moreira Angueira - Rm 99704
	 * @param path O caminho do arquivo onde as informações serão gravadas.
	 * @return Uma mensagem indicando o sucesso ou falha da operação de gravação.
	 */

	public String gravar(String path) {
		try {
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdir();
			}
			PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
			pw.println(nome);
			pw.println(ki);
			pw.println(tecnicas);
			pw.println(velocidade);
			pw.println(transformacoes);
			pw.flush();
			pw.close();
			return "Arquivo gravado com sucesso";
		} catch (IOException e) {
			return "Falha ao gravar arquivo: " + e.getMessage();
		}

	}

}
