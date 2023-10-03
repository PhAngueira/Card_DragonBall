package br.com.fiap.bean;

/**
 * @author Paulo Henrique Moreira Angueira - 
 * 
 *         Interface que define os métodos para leitura e gravação de
 *         informações relacionadas aos personagens do Dragon Ball Super.
 */
public interface IDBSuper {
	/**
	 * Lê informações de um arquivo no caminho especificado e retorna um objeto
	 * DragonBallSuper com os dados lidos.
	 * 
	 * @author Paulo Henrique Moreira Angueira - 
	 * 
	 * @param path O caminho do arquivo a ser lido.
	 * @return Um objeto DragonBallSuper contendo as informações lidas do arquivo.
	 */
	public DragonBallSuper ler(String path);

	/**
	 * Grava as informações do objeto DragonBallSuper em um arquivo no caminho
	 * especificado.
	 * 
	 * @author Paulo Henrique Moreira Angueira - 
	 * @param path O caminho do arquivo onde as informações serão gravadas.
	 * @return Uma mensagem indicando o sucesso ou falha da operação de gravação.
	 */
	public String gravar(String path);
}
