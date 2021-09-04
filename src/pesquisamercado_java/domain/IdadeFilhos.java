package pesquisamercado_java.domain;

public class IdadeFilhos {
	
	private Integer idIdadeFilho;
	private String idade; 
	
	private Convidado convidado;

	public IdadeFilhos(Integer idIdadeFilho, String idade, Convidado convidado) {

		this.idIdadeFilho = idIdadeFilho;
		this.idade = idade;
		this.convidado = convidado;
	}

	public Integer getIdIdadeFilho() {
		return idIdadeFilho;
	}

	public void setIdIdadeFilho(Integer idIdadeFilho) {
		this.idIdadeFilho = idIdadeFilho;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	@Override
	public String toString() {
		return "Idade dos Filhos [\nidIdadeFilho=" + idIdadeFilho 
				+ "\nIdade=" + idade 
				+ "\nConvidado=" + convidado + "]";
	}
	
	
	
	
	

}
