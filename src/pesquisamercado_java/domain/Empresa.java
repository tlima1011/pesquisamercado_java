package pesquisamercado_java.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import pesquisamercado_java.enums.Status;

public class Empresa {
	
	private Integer idEmpresa; 
	private String nomeEmpresa;
	private String nomeContato; 
	private String email; 
	private Status status; 
	
	
	private ArrayList<Telefone> telefones = new ArrayList<>();
	
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	
	private ArrayList<Projeto> projetos = new ArrayList<>(); 
	
		
	private Empresa() { 
		
	}

	public Empresa(Integer idEmpresa, String nomeEmpresa, String nomeContato, String email, Status status) {
		this.idEmpresa = idEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeContato = nomeContato;
		this.email = email;
		this.status = status;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

//	public ArrayList<Telefone> getTelefones() {
//		return telefones;
//	}
//
//	public ArrayList<Endereco> getEnderecos() {
//		return enderecos;
//	}
	
	public void addEndereco(Endereco end) {
		enderecos.add(end); 
	}
	
	public void addTelefone(Telefone tel) {
		telefones.add(tel); 
	}
	
	public void addProjetos(Projeto projs) {
		projetos.add(projs); 
	}
	
	public void informacoesEmpresa() { 
		System.out.println("Empresa");
		System.out.println("Nome da Empresa: "+this.nomeEmpresa);
		System.out.println("Nome do contato: " +this.nomeContato);
		System.out.println("Email: " + this.email);
		System.out.println("Status da Empresa: " +this.status);
		System.out.println("================================");
		System.out.println("Enderecos: ");
		for (Endereco endereco : enderecos) {
			System.out.println(endereco.getLogradouro()+ " - Número: " + endereco.getNumero() + " - Cep: " +endereco.getNumero() + " - Bairro: " +endereco.getBairro() );
		}
		System.out.println("================================");
		System.out.println("Telefones:");
		for (Telefone tels : telefones) {
			System.out.println("Número (11)"+tels.getNumero());
		}
	}
	
	public void informacaoProjetos() { 
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Empresa");
		System.out.println("Nome da Empresa: "+this.nomeEmpresa);
		System.out.println("Nome do contato: " +this.nomeContato);
		System.out.println("Email: " + this.email);
		System.out.println("Projetos: ");
		for (Projeto p : projetos) {
			System.out.println("Data de Abertura: "+formatador.format(p.getDataEntrevista()));
		}
	}
	
	

}
