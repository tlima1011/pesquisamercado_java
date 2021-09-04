package pesquisamercado_java.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import pesquisamercado_java.domain.Carro;
import pesquisamercado_java.domain.Convidado;
import pesquisamercado_java.domain.Empresa;
import pesquisamercado_java.domain.Endereco;
import pesquisamercado_java.domain.Idade;
import pesquisamercado_java.domain.IdadeFilhos;
import pesquisamercado_java.domain.Pesquisador;
import pesquisamercado_java.domain.Projeto;
import pesquisamercado_java.domain.Telefone;
import pesquisamercado_java.enums.EstadoCivil;
import pesquisamercado_java.enums.Instrucao;
import pesquisamercado_java.enums.Status;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Status st1 = Status.ATIVO; 
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatadorDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Empresa empr1 = new Empresa(1, "Kyra","Jonana", "kyra@kyra.com", st1); 
		
		empr1.addTelefone(new Telefone(1,"44412333", empr1));
		empr1.addTelefone(new Telefone(2,"99998888", empr1));
		empr1.addEndereco(new Endereco(1, "Rua Gomes de Carvalho","88","Vila Olimpia", "7777879", empr1));
		System.out.println("=================================");
		empr1.informacoesEmpresa();
		System.out.println("=================================");
		
		Date nascimento = formatador.parse("19/03/1972"); 
		
		Pesquisador p1 = new Pesquisador(
				1, "Andreia", formatador.parse("19/03/1972"), 
				Idade.calcularIdade(nascimento),
				EstadoCivil.SOLTEIRO, "7743333222","2222222", 
				"contato2pesquisa@gmail.com", "@##$%%", st1);
				
		Telefone telPesq1 = new Telefone(1,"1112233", p1); 
		Telefone telPesq2 = new Telefone(2,"9624555", p1);
		
		//Integer idProjeto, String numProjeto, String descProjeto, Date dataRecrutamento, Double valorPagar, Double beneficio ,Date dataEntrevista, Empresa empresa, Pesquisador pesquisador
		Projeto proj = new Projeto(1, "9987/900", "BomBom Bom d+ ", formatador.parse("12/02/2021"), 120.00, 60.00,formatadorDataHora.parse("15/02/2021 13:00"), empr1, p1); 
		empr1.addProjetos(proj); 
		empr1.informacaoProjetos();
		System.out.println(proj);		
		System.out.println("====================================");
		Endereco e1 = new Endereco(1, "Lgo Lega", "77788","Perdizes", "3333", p1); 
		p1.addProjetos(proj); 
		p1.addEndereco(e1); 
		p1.addTelefone(telPesq1); 
		p1.addTelefone(telPesq2); 
		p1.dadosPesquisador(); 
		System.out.println(p1);
		System.out.println("====================================");
		
		Date dataNascimento = formatador.parse("25/03/2000"); 
		
		Instrucao inst = Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO; 		
		//int pontoInstrucao = Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO;
		
		
		Convidado c1 = new Convidado(
				1,"Luis Astolfo", "777777778", dataNascimento, "9964568", "luismane@gkmail.net",
				"Brasileiro", "15 anos", Idade.calcularIdade(dataNascimento),EstadoCivil.CASADO,
				'S','S',"Auxiliar Administrativo", 'S',"Medicina","Uninove", 1, 1,
				1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1,
				'S', 'S', inst, "Oficial Administrativo", st1, proj, empr1, p1); 
		IdadeFilhos i1 = new IdadeFilhos(1,"2",c1);
		IdadeFilhos i2 = new IdadeFilhos(2,"5",c1); 
		Carro carro1 = new Carro(1, "Fiat","Uno",2010,c1); 
		Endereco endconv1 = new Endereco(1,"Rua Joao Cabreuva","222","Cidade Tiradentes","888988",c1); 
		Telefone t1 = new Telefone(1,"33222466",c1); 
		Telefone t2 = new Telefone(1,"987777445",c1);
		c1.addIdadeFilhos(i1); 
		c1.addIdadeFilhos(i2);
		c1.addCarro(carro1); 
		c1.addEndereco(endconv1); 
		c1.addTelefone(t1); 
		c1.addTelefone(t2); 
		
		
		
		c1.informacaoCandidato();
			
		
	}

}
