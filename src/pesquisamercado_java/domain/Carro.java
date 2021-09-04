package pesquisamercado_java.domain;

public class Carro {
	
	private Integer idCarro; 
	private String modelo; 
	private String marca; 
	private Integer ano; 
	
	private Convidado convidado;

	public Carro(Integer idCarro, String modelo, String marca, Integer ano, Convidado convidado) {
		this.idCarro = idCarro;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.convidado = convidado;
	}

	public Integer getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	@Override
	public String toString() {
		return "Carro "+ "[idCarro=" + idCarro 
				+ "\nModelo: " + modelo 
				+ "\nMarca=" + marca 
				+ "\nAno=" + ano 
				+ "\nConvidado="
				+ convidado + "]";
	} 
	
	
	
	

}
