package pesquisamercado_java.domain;

public class Endereco {
	
	private Integer idEndereco; 
	private String logradouro;
	private String numero; 
	private String bairro; 
	private String cep; 
	
	public Endereco() {
		
	}
	
	private Empresa empresa; 	
	
	private Pesquisador pesquisador; 
	
	private Convidado convidado; 
	
	public Endereco(Integer idEndereco, String logradouro, String numero, String bairro, String cep, Convidado convidado) {
		this.idEndereco = idEndereco; 
		this.logradouro = logradouro;
		this.numero = numero; 
		this.bairro = bairro; 
		this.cep = cep; 
		this.convidado = convidado; 
	}
	
	
	public Endereco(Integer idEndereco, String logradouro, String numero, String bairro, String cep, Pesquisador pesquisador) {
		this.idEndereco = idEndereco; 
		this.logradouro = logradouro;
		this.numero = numero; 
		this.bairro = bairro; 
		this.cep = cep; 
		this.pesquisador = pesquisador; 
	}
	
	
	
	public Endereco(Integer idEndereco, String logradouro, String numero, String bairro, String cep, Empresa empresa) {
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.empresa = empresa; 
	}
	
	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro="
				+ bairro + ", cep=" + cep + "], Empresa: " +empresa;
	}
	
	public void informarEnderecoPesquisador() { 
		System.out.println("Dados do Pesquisador: "); 
		System.out.println("Nome: " +pesquisador.getNomePesquisador());
		System.out.println("Idade: " +pesquisador.getIdade());
		System.out.println("Endereco: " + idEndereco); 
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Numero: " +numero); 
		System.out.println("Bairro: " + bairro); 
		System.out.println("Cep: " +cep); 
		
		
	}
	
}
