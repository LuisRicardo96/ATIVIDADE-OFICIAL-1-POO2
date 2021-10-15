/* <UNIME>
* <BSI>
* <PROGAMAÇÃO ORIENTADA A OBJETO 2>
* <PABLO ROXO>
* <LUIS RICARDO SOUSA BORGES>
*/

package oficial1;

import java.util.List;

public class Pessoa extends Profissao  {
	
	private String nome;
	private List<Pessoa> funcionario;
	
	
	public String getNome() {
		return nome;
	}
	public void  setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	private int idade;
	

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
}
	
	private String profissao;
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	private String novo;


	public String getNovo() {
		return novo;
	}
	public void setNovo(String novo) {
		this.novo = novo;

	
	}	
	
	private int novaidade;


	public int getNovaidade() {
		return novaidade;
	}
	public void setNovaidade(int novaidade) {
		this.novaidade = novaidade;
	}
	
	private String novaprofissao;


	public String getNovaprofissao() {
		return novaprofissao;
	}
	public void setNovaprofissao(String novaprofissao) {
		this.novaprofissao = novaprofissao;
	}
	
	
	
}
	
	
	
	
