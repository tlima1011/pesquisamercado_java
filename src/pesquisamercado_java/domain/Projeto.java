package pesquisamercado_java.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Projeto {
	
	private Integer idProjeto; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio; 
	private Date dataEntrevista; 
	
	private Empresa empresa; 
	
	private Pesquisador pesquisador; 
	
	private Convidado convidado; 
	
	public Projeto() { 
		
	}
	
	public Projeto(Integer idProjeto, String numProjeto, String descProjeto, Date dataRecrutamento, Double valorPagar, Double beneficio ,Date dataEntrevista, Empresa empresa, Pesquisador pesquisador) {
		this.idProjeto = idProjeto;
		this.numProjeto = numProjeto; 
		this.descProjeto = descProjeto; 
		this.dataRecrutamento = dataRecrutamento; 
		this.valorPagar = valorPagar; 
		this.beneficio = beneficio;
		this.dataEntrevista = dataEntrevista;
		this.empresa = empresa; 
		this.pesquisador = pesquisador; 
	}

	public Integer getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}
	
	public String getNumProjeto() {
		return numProjeto;
	}

	public void setNumProjeto(String numProjeto) {
		this.numProjeto = numProjeto;
	}

	public String getDescProjeto() {
		return descProjeto;
	}

	public void setDescProjeto(String descProjeto) {
		this.descProjeto = descProjeto;
	}

	public Date getDataRecrutamento() {
		return dataRecrutamento;
	}

	public void setDataRecrutamento(Date dataRecrutamento) {
		this.dataRecrutamento = dataRecrutamento;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Double beneficio) {
		this.beneficio = beneficio;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	public Date getDataEntrevista() {
		return dataEntrevista;
	}

	public void setDataEntrevista(Date dataEntrevista) {
		this.dataEntrevista = dataEntrevista;
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
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatadorDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		//formatador.format
		//formatadorDataHora.format
		return "Projeto:\n [idProjeto: " + idProjeto 
				+ "\nNumero do Projeto: " +numProjeto
				+ "\nDescricao do Projeto: " +descProjeto
				+ "\nData de Recrutamento: " +formatadorData.format(dataRecrutamento)
				+ "\nValor a Pagar: R$" +String.format("%.2f", valorPagar)
				+ "\nBeneficio R$" +String.format("%.2f", beneficio)
				+ "\nData e Hora da Entrevista: " + formatadorDataHora.format(dataEntrevista)
				+ "\n[Nome da Empresa: " + empresa.getNomeEmpresa() 
					+ "Contato: " + empresa.getNomeContato() + "\nEmail: " +empresa.getEmail()+ "]"
				+ "\n[Pesquisador: " +
					"\nNome Pesquisador: "+ pesquisador.getNomePesquisador()
					+"\nEmail: " +pesquisador.getEmail();
	}
	
	
	
	
	
}
