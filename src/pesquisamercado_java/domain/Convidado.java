package pesquisamercado_java.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import pesquisamercado_java.enums.EstadoCivil;
import pesquisamercado_java.enums.Instrucao;
import pesquisamercado_java.enums.Status;

public class Convidado {

	private Integer idConvidado;
	private String nomeConvidado;
	private String rg;
	private Date dataNascimento;
	private String cpf;
	private String email;
	private String nacionalidade;
	private String tempoMoradia;
	private int idade;
	private EstadoCivil estadoCivil;
	private Character temFilhos;
	private Character trabalha;
	private String profissao;
	private Character estuda;
	private String curso;
	private String faculdade;
	private int contBanheiro;
	private int[] banheiro = { 0, 3, 7, 10, 14 };
	private int pontoBanheiros;
	private int contMensalista;
	private int[] mensalista = { 0, 3, 7, 10, 13 };
	private int pontoMensalista;
	private int contAutomovel;
	private int[] automovel = { 0, 3, 5, 8, 11 };
	private int pontoAutomovel;
	private int contMicrocomputador;
	private int[] microcomputador = { 0, 3, 6, 8, 11 };
	private int pontoMicrocomputador;
	private int contLavaLoucas;
	private int[] lavaLoucas = { 0, 3, 6, 6, 6 };
	private int pontoLavaLoucas;
	private int contGeladeira;
	private int[] geladeira = { 0, 2, 3, 5, 5 };
	private int pontoGeladeira;
	private int contFreezer;
	private int[] freezer = { 0, 2, 4, 6, 6 };
	private int pontoFreezer;
	private int contLavaRoupa;
	private int[] lavaRoupas = { 0, 2, 4, 6, 6 };
	private int pontoLavaRoupas;
	private int contDvd;
	private int[] dvd = { 0, 1, 3, 4, 6 };
	private int pontoDvd;
	private int contMicroondas;
	private int[] microondas = { 0, 2, 4, 4, 4 };
	private int pontoMicroondas;
	private int contMotocicleta;
	private int[] motocicletas = { 0, 1, 3, 3, 3 };
	private int pontoMotocicletas;
	private int contSecadoraRoupas;
	private int[] secadoraRoupas = { 0, 2, 2, 2, 2 };
	private int pontoSecadoraRoupas;
	private Character aguaEncanada;
	private Integer pontoAguaEncanada;
	private Character ruaPavimentada;
	private Integer pontoRuaPavimentada;
	private Instrucao instrucao;
	private Integer pontoInstrucao;
	private String profissaoChefe;
	private String empresaChefe; 
	private Integer totalPontos;
	private String criterio;
	private Status status;

	private Projeto projeto;

	private Empresa empresa;

	private Pesquisador pesquisador;

	private ArrayList<IdadeFilhos> idadesFilhos = new ArrayList<>();

	private ArrayList<Endereco> enderecos = new ArrayList<>();

	private ArrayList<Telefone> telefones = new ArrayList<>();

	private ArrayList<Carro> carros = new ArrayList<>();

	public Convidado() {

	}

	public Convidado(Integer idConvidado, String nomeConvidado, String rg, Date dataNascimento, String cpf,
			String email, String nacionalidade, String tempoMoradia, int idade, EstadoCivil estadoCivil,
			Character temFilhos, Character trabalha, String profissao, Character estuda, String curso, String faculdade,
			int contBanheiro, int pontoBanheiros, int contMensalista, int contAutomovel, int contMicrocomputador,
			int pontoMicrocomputador, int contLavaLoucas, int contGeladeira, int pontoGeladeira, int contFreezer,
			int contLavaRoupa, int contDvd, int contMicroondas, int contMotocicleta, int contSecadoraRoupas,
			Character aguaEncanada, Character ruaPavimentada, Instrucao instrucao, String profissaoChefe, String empresaChefe, Status status,
			Projeto projeto, Empresa empresa, Pesquisador pesquisador) {
		this.idConvidado = idConvidado;
		this.nomeConvidado = nomeConvidado;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.tempoMoradia = tempoMoradia;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.temFilhos = temFilhos;
		this.trabalha = trabalha;
		this.profissao = profissao;
		this.estuda = estuda;
		this.curso = curso;
		this.faculdade = faculdade;
		this.contBanheiro = contBanheiro;
		setPontoBanheiros(contBanheiro);
		this.contMensalista = contMensalista;
		setPontoMensalista(contMensalista);
		this.contAutomovel = contAutomovel;
		setPontoAutomovel(contAutomovel);
		this.contMicrocomputador = contMicrocomputador;
		setPontoMicrocomputador(contMicrocomputador);
		this.contLavaLoucas = contLavaLoucas;
		setPontoLavaLoucas(contLavaLoucas);
		this.contGeladeira = contGeladeira;
		setPontoGeladeira(contGeladeira);
		this.contFreezer = contFreezer;
		setPontoFreezer(contFreezer);
		this.contLavaRoupa = contLavaRoupa;
		setPontoLavaRoupas(contLavaRoupa);
		this.contDvd = contDvd;
		setPontoDvd(contDvd);
		this.contMicroondas = contMicroondas;
		setPontoMicroondas(contMicroondas);
		this.contMotocicleta = contMotocicleta;
		setPontoMotocicletas(contMotocicleta);
		this.contSecadoraRoupas = contSecadoraRoupas;
		setPontoSecadoraRoupas(contSecadoraRoupas);
		this.aguaEncanada = aguaEncanada;
		setPontoAguaEncanada(aguaEncanada);
		this.ruaPavimentada = ruaPavimentada;
		setPontoRuaPavimentada(ruaPavimentada);
		this.instrucao = instrucao;
		setPontoInstrucao(instrucao);
		this.profissaoChefe = profissaoChefe;
		this.empresaChefe = empresaChefe; 
		this.status = status;
		this.projeto = projeto;
		this.empresa = empresa;
		this.pesquisador = pesquisador;
	}

	public Integer getIdConvidado() {
		return idConvidado;
	}

	// public void setIdConvidado(Integer idConvidado) {
	// this.idConvidado = idConvidado;
	// }

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTempoMoradia() {
		return tempoMoradia;
	}

	public void setTempoMoradia(String tempoMoradia) {
		this.tempoMoradia = tempoMoradia;
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

	public Character getTemFilhos() {
		return temFilhos;
	}

	public void setTemFilhos(Character temFilhos) {
		this.temFilhos = temFilhos;
	}

	public Character getTrabalha() {
		return trabalha;
	}

	public void setTrabalha(Character trabalha) {
		this.trabalha = trabalha;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Character getEstuda() {
		return estuda;
	}

	public void setEstuda(Character estuda) {
		this.estuda = estuda;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public int getContBanheiro() {
		return contBanheiro;
	}

	public void setContBanheiro(int contBanheiro) {
		this.contBanheiro = contBanheiro;
	}

	public int getPontoBanheiros() {
		return pontoBanheiros;
	}

	public void setPontoBanheiros(int contBanheiro) {
		this.pontoBanheiros = banheiro[contBanheiro];
	}

	public int getContMensalista() {
		return contMensalista;
	}

	public void setContMensalista(int contMensalista) {
		this.contMensalista = contMensalista;
	}

	public int getPontoMensalista() {
		return pontoMensalista;
	}

	public void setPontoMensalista(int contMensalista) {
		this.pontoMensalista = mensalista[contMensalista];
	}

	public int getContAutomovel() {
		return contAutomovel;
	}

	public void setContAutomovel(int contAutomovel) {
		this.contAutomovel = contAutomovel;
	}

	public int getPontoAutomovel() {
		return pontoAutomovel;
	}

	public void setPontoAutomovel(int contAutomovel) {
		this.pontoAutomovel = automovel[contAutomovel];
	}

	public int getContMicrocomputador() {
		return contMicrocomputador;
	}

	public void setContMicrocomputador(int contMicrocomputador) {
		this.contMicrocomputador = contMicrocomputador;
	}

	public int getPontoMicrocomputador() {
		return pontoMicrocomputador;
	}

	public void setPontoMicrocomputador(int contMicrocomputador) {
		this.pontoMicrocomputador = microcomputador[contMicrocomputador];
	}

	public int getContLavaLoucas() {
		return contLavaLoucas;
	}

	public void setContLavaLoucas(int contLavaLoucas) {
		this.contLavaLoucas = contLavaLoucas;
	}

	public int getPontoLavaLoucas() {
		return pontoLavaLoucas;
	}

	public void setPontoLavaLoucas(int contLavaLoucas) {
		this.pontoLavaLoucas = lavaLoucas[contLavaLoucas];
	}

	public int getContGeladeira() {
		return contGeladeira;
	}

	public void setContGeladeira(int contGeladeira) {
		this.contGeladeira = contGeladeira;
	}

	public int getPontoGeladeira() {
		return pontoGeladeira;
	}

	public void setPontoGeladeira(int contGeladeira) {
		this.pontoGeladeira = geladeira[contGeladeira];
	}

	public int getContFreezer() {
		return contFreezer;
	}

	public void setContFreezer(int contFreezer) {
		this.contFreezer = contFreezer;
	}

	public int getPontoFreezer() {
		return pontoFreezer;
	}

	public void setPontoFreezer(int contFreezer) {
		this.pontoFreezer = freezer[contFreezer];
	}

	public int getContLavaRoupa() {
		return contLavaRoupa;
	}

	public void setContLavaRoupa(int contLavaRoupa) {
		this.contLavaRoupa = contLavaRoupa;
	}

	public int getPontoLavaRoupas() {
		return pontoLavaRoupas;
	}

	public void setPontoLavaRoupas(int contLavaRoupas) {
		this.pontoLavaRoupas = lavaRoupas[contLavaRoupas];
	}

	public int getContDvd() {
		return contDvd;
	}

	public void setContDvd(int contDvd) {
		this.contDvd = contDvd;
	}

	public int getPontoDvd() {
		return pontoDvd;
	}

	public void setPontoDvd(int contDvd) {
		this.pontoDvd = dvd[contDvd];
	}

	public int getContMicroondas() {
		return contMicroondas;
	}

	public void setContMicroondas(int contMicroondas) {
		this.contMicroondas = contMicroondas;
	}

	public int getPontoMicroondas() {
		return pontoMicroondas;
	}

	public void setPontoMicroondas(int contMicroondas) {
		this.pontoMicroondas = microondas[contMicroondas];
	}

	public int getContMotocicleta() {
		return contMotocicleta;
	}

	public void setContMotocicleta(int contMotocicleta) {
		this.contMotocicleta = contMotocicleta;
	}

	public int getPontoMotocicletas() {
		return pontoMotocicletas;
	}

	public void setPontoMotocicletas(int contMotocicletas) {
		this.pontoMotocicletas = motocicletas[contMotocicletas];
	}

	public int getContSecadoraRoupas() {
		return contSecadoraRoupas;
	}

	public void setContSecadoraRoupas(int contSecadoraRoupas) {
		this.contSecadoraRoupas = contSecadoraRoupas;
	}

	public int getPontoSecadoraRoupas() {
		return pontoSecadoraRoupas;
	}

	public void setPontoSecadoraRoupas(int contSecadoraRoupas) {
		this.pontoSecadoraRoupas = secadoraRoupas[contSecadoraRoupas];
	}

	public Character getAguaEncanada() {
		return aguaEncanada;
	}

	public void setAguaEncanada(Character aguaEncanada) {
		this.aguaEncanada = aguaEncanada;
	}

	public Integer getPontoAguaEncanada() {
		return pontoAguaEncanada;
	}

	public void setPontoAguaEncanada(Character aguaEncanada) {
		switch (aguaEncanada) {
		case 'S':
			this.pontoAguaEncanada = 4;
			break;
		case 'N':
			this.pontoAguaEncanada = 0;
		}
	}

	public Character getRuaPavimentada() {
		return ruaPavimentada;
	}

	public void setRuaPavimentada(Character ruaPavimentada) {
		this.ruaPavimentada = ruaPavimentada;
	}

	public Integer getPontoRuaPavimentada() {
		return pontoRuaPavimentada;
	}

	public void setPontoRuaPavimentada(Character ruaPavimentada) {
		switch (ruaPavimentada) {
		case 'S':
			this.pontoRuaPavimentada = 2;
			break;
		case 'N':
			this.pontoRuaPavimentada = 0;
		}
	}

	public Instrucao getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(Instrucao instrucao) {
		this.instrucao = instrucao;
	}

	public Integer getPontoInstrucao() {
		return pontoInstrucao;
	}

	public void setPontoInstrucao(Instrucao inst) {
		switch (inst) {
		case ANALFABETO_FUNDAMENTAL_I_INCOMPLETO:
			this.pontoInstrucao = 0;
			break;
		case FUNDAMENTAL_I_COMPLETO_FUNDAMENTAL_II_COMPLETO:
			this.pontoInstrucao = 1;
			break;
		case FUNDAMENTAL_II_COMPLETO_MEDIO_INCOMPLETO:
			this.pontoInstrucao = 2;
			break;
		case MEDIO_COMPLETO_SUPERIOR_INCOMPLETO:
			this.pontoInstrucao = 4;
			break;
		case SUPERIOR_COMPLETO:
			this.pontoInstrucao = 7;
			break;
		default:
			this.pontoInstrucao = 0;
		}
	}

	public String getProfissaoChefe() {
		return profissaoChefe;
	}

	public void setProfissaoChefe(String profissaoChefe) {
		this.profissaoChefe = profissaoChefe;
	}
	
	public String getEmpresaChefe() {
		return empresaChefe;
	}

	public void setEmpresaChefe(String empresaChefe) {
		this.empresaChefe = empresaChefe;
	}

	public Integer getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(Integer totalPontos) {
		this.totalPontos = totalPontos;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
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

	public ArrayList<IdadeFilhos> getIdadesFilhos() {
		return idadesFilhos;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void addIdadeFilhos(IdadeFilhos idades) {
		idadesFilhos.add(idades);
	}

	public void addEndereco(Endereco ends) {
		enderecos.add(ends);
	}

	public void addTelefone(Telefone tels) {
		telefones.add(tels);
	}

	public void addCarro(Carro cars) {
		carros.add(cars);
	}

	public void informacaoCandidato() {
		SimpleDateFormat formatadorDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("=======================================================");
		System.out.println("Dados do Convidado");
		System.out.println("=======================================================");
		System.out.println("Convidado Id# " + getIdConvidado());
		System.out.println("Nome Convidado: " + nomeConvidado);
		System.out.println("RG: " + rg);
		System.out.println("Data de Nascimento: " + formatador.format(dataNascimento));
		System.out.println("CPF: " + cpf);
		System.out.println("Enderecos:");
		for (Endereco end : enderecos) {
			System.out.println("Logradouro: " + end.getLogradouro() + ", Numero: " + end.getNumero() + " - Bairro: "
					+ end.getBairro() + ", CEP: " + end.getCep());
		}
		System.out.println("E-mail: " + email);
		System.out.println("Nacionalidade: " + nacionalidade);
		System.out.println("Tempo Moradia: " + tempoMoradia);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Idade dos Filhos: ");
		for (IdadeFilhos filhos : idadesFilhos) {
			System.out.print(filhos.getIdade() + " - ");
		}
		System.out.println("\n=======================================================");
		System.out.println("Qtde. Banheiro: " + contBanheiro + " Pontos Banheiro: " + getPontoBanheiros());
		System.out.println(
				"Qtde. Empregados mensalistas: " + contMensalista + " Pontos Mensalistas: " + getPontoMensalista());
		System.out.println(
				"Qtde. Autom�veis de passeio: " + contAutomovel + " Pontos Automoveis: " + getPontoBanheiros());
		System.out.println("Qtde. Microcomputador: " + contMicrocomputador + " Pontos Microcomputador"
				+ getPontoMicrocomputador());
		System.out.println("Qtde. Lava loucas: " + contLavaLoucas + " Pontos Lava Loucas" + getPontoLavaLoucas());
		System.out.println("Qtde. Geladeira: " + contGeladeira + "Pontos Geladeira: " + getPontoGeladeira());
		System.out.println("Qtde. Freezer: " + contFreezer + " Pontos Freezer: " + getPontoFreezer());
		System.out.println("Qtde. Lava roupa: " + contLavaRoupa + " Pontos Lava Roupa: " + getPontoLavaRoupas());
		System.out.println("Qtde. DVD: " + contDvd + " Pontos DVD: " + getPontoDvd());
		System.out.println("Qtde. Microondas: " + contMicroondas + " Pontos Microondas: " + getPontoMicroondas());
		System.out.println("Qtde. Motocicleta: " + contMotocicleta + " Pontos Motocicleta: " + getPontoMotocicletas());
		System.out.println("Qtde. Secadora de roupas: " + contSecadoraRoupas + " Pontos Secadora de Roupas: "
				+ getPontoSecadoraRoupas());
		for (Carro car : carros) {
			System.out
					.println("Marca: " + car.getMarca() + " - Modelo: " + car.getModelo() + " - Ano: " + car.getAno());
		}
		System.out.println("Agua Encanada: " + aguaEncanada + " - Ponto Agua: " + getPontoAguaEncanada());
		System.out.println("Rua Pavimentada: " + ruaPavimentada + " - Ponto Rua: " + getPontoRuaPavimentada());
		System.out.println("-------------------------------------------");
		System.out.println("Instrucao do Convidado ou do Chefe da Casa");
		System.out.println("Grau: " +getInstrucao() + " - Ponto de Instrucao: " +getPontoInstrucao());
		System.out.println("-------------------------------------------");
		System.out.println("Profissao Chefe: " +profissaoChefe + " - Empresa: " +empresaChefe);
		System.out.println("-------------------------------------------");
		System.out.println("Dados da Empresa");
		System.out.println("Nome da empresa disponibilizada: " + empresa.getNomeEmpresa());
		System.out.println("Nome do Pesquisador: " + pesquisador.getNomePesquisador());
		System.out.println("Email: " + pesquisador.getEmail());
		System.out.println("Num. Projeto inserido: " + projeto.getNumProjeto());
		System.out.println("Desc. Projeto: " + projeto.getDescProjeto());
		System.out.println("Data Recrutamento: " + formatador.format(projeto.getDataRecrutamento()));
		System.out.println("Valor a pagar:  R$" + String.format("%.2f", projeto.getValorPagar()));
		System.out.println("Data da Entrevista: " + formatadorDataHora.format(projeto.getDataEntrevista()));
	}

}
