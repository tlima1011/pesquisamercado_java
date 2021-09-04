package pesquisamercado_java.domain;

public class Telefone {
	
	private Integer idTelefone; 
	private String numero; 
		
	private Empresa empresa;
	
	private Pesquisador pesquisador;
	
	private Convidado convidado; 
	
	
	public Telefone() { 
		
	}
	
	public Telefone(Integer idTelefone, String numero, Convidado convidado) { 
		this.idTelefone = idTelefone; 
		this.numero = numero;
		this.convidado = convidado; 
	}
	
	
	public Telefone(Integer idTelefone, String numero, Pesquisador pesquisador) { 
		this.idTelefone = idTelefone; 
		this.numero = numero;
		this.pesquisador = pesquisador; 
	}

	public Telefone(Integer idTelefone, String numero, Empresa empresa) {
		this.idTelefone = idTelefone; 
		this.numero = numero;
		this.empresa = empresa; 
	}
	
	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	
	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numero=" + numero + "]Empresa: " +empresa;
	}
	
	public void informarPesquisador() { 
		System.out.println("Telefone");
		System.out.println("Id. Telefone: " +idTelefone);
		System.out.println("Numero: " +numero);
		System.out.println("Pesquisador: " +pesquisador.getNomePesquisador());
		
	}
	
	

}
