package pesquisamercado_java.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import pesquisamercado_java.enums.EstadoCivil;
import pesquisamercado_java.enums.Status;

public class Pesquisador {
	
	private Integer idPesquisador; 
	private String nomePesquisador; 
	private Date dataNascimento; 
	private int idade; 
	private EstadoCivil estadoCivil; 
	private String cpf; 
	private String rg; 
	private String email; 
	private String senha; 
	private Status status; 
	
	private ArrayList<Telefone> telefones = new ArrayList<>(); 
	
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	
	private ArrayList<Projeto> projetos = new ArrayList<>();
	
	private ArrayList<Convidado> convidados = new ArrayList<>();
	
	public Pesquisador(Integer id, String nomePesquisador, Date dataNascimento, int idade, EstadoCivil estadoCivil, String cpf, String rg, String email, String senha, Status status) { 
		this.idPesquisador = id;
		this.nomePesquisador = nomePesquisador; 
		this.dataNascimento = dataNascimento; 
		this.idade = idade; 
		this.estadoCivil = estadoCivil;
		this.cpf = cpf; 
		this.rg = rg; 
		this.email = email; 
		this.senha = senha; 
		this.status = status; 
	}

	public Integer getIdPesquisador() {
		return idPesquisador;
	}

	public void setIdPesquisador(Integer idPesquisador) {
		this.idPesquisador = idPesquisador;
	}

	public String getNomePesquisador() {
		return nomePesquisador;
	}

	public void setNomePesquisador(String nomePesquisador) {
		this.nomePesquisador = nomePesquisador;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void addEndereco(Endereco ends) {
		enderecos.add(ends);
	}
	
	public void addTelefone(Telefone tels) { 
		telefones.add(tels); 
	}
	
	public void addProjetos(Projeto projs) {
		projetos.add(projs); 
	}
	
	public void addConvidado(Convidado conv) {
		convidados.add(conv); 
	}
	
	@Override
	public String toString() {
		return "Pesquisador [idPesquisador=" + idPesquisador + ", nomePesquisador=" + nomePesquisador
				+ ", dataNascimento=" + dataNascimento + ", idade=" + idade + ", estadoCivil=" + estadoCivil + ", cpf="
				+ cpf + ", rg=" + rg + ", email=" + email + ", status=" + status + ", telefones=" + telefones + "]";
	}

	public void dadosPesquisador() { 
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("Dados pesquisador: ");
		System.out.println("Nome: " +nomePesquisador);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " +rg);
		System.out.println("Email: " +email);
		System.out.println("Senha: " +senha);
		System.out.println("Status: " + status);
		System.out.println("Enderecos: ");
		for(int i = 0; i < enderecos.size();i++) {
			System.out.println("Logradouro: " +enderecos.get(i).getLogradouro());
			System.out.println("Numero: " +enderecos.get(i).getNumero());
			System.out.println("Bairro: " +enderecos.get(i).getBairro());
			System.out.println("CEP: " +enderecos.get(i).getCep());
		}
		System.out.println("Telefones: ");
		for (Telefone tels : telefones) {
			System.out.println(tels.getNumero());
		}
		System.out.println("Projeto Aberto: ");
		for (Projeto projs: projetos) {
			System.out.println("Num Projeto: " + projs.getNumProjeto());
			System.out.println("Descricao Projeto: " +projs.getDescProjeto());
			System.out.println("Beneficio: R$" + String.format("%.2f", projs.getBeneficio()));
			System.out.println("Valor a pagar: R$" + String.format("%.2f", projs.getValorPagar()));
			System.out.println("Data do Projeto: " +formatador.format(projs.getDataRecrutamento()));
		}
		System.out.println("Convidado(s): ");
		for(Convidado convs : convidados) {
			System.out.println("Nome: " +convs.getNomeConvidado());
		}
	}
	
	
	
}
