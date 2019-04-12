import java.util.ArrayList;
import java.util.Scanner;

public class ControleDisciplinas {
	
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public static Disciplina buscarDisciplina(String codigo) {
		for(Disciplina disciplina : disciplinas)
			if (disciplina.getCodigo().equals(codigo))
				return disciplina;
		
		return null;
	}
	
	public static void listarDisciplinas() {
		System.out.println("");
		System.out.println("------------- Disciplinas -------------");
		for(Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.toString());
		}
		System.out.println("");
	}
	
	public static void listarTodasInscricoes() {
		for(Disciplina disciplina : disciplinas) {
			System.out.println("------------ " + disciplina.toString() + " -----------" );
			for(Aluno aluno : disciplina.getInscritos()) {
				System.out.println(aluno.toString());
			}
			System.out.println("");
		}
		
		System.out.println("");
	}
	
	public static void listarInscricoesParaSelecao(String codigoDisciplina) {
		Disciplina disciplinaEscolhida = buscarDisciplina(codigoDisciplina);
		
		if (disciplinaEscolhida == null) {
			System.out.println("Disciplina n�o encontrada! Digite o c�digo novamente..");
			return;
		}
		
		for(Aluno aluno : disciplinaEscolhida.getInscritos()) {
			System.out.println(aluno.toString());
		}
		
		System.out.println("");
	}
	
	public static void selecionarAlunos() {
		listarDisciplinas();
		Disciplina disciplina = null;
		
		do {
			System.out.println("Caro Professor, digite o c�digo da sua disciplina: ");
			String codigo = scan.nextLine();
			
			disciplina = buscarDisciplina(codigo);
			listarInscricoesParaSelecao(codigo);			
		} while (disciplina == null);
	}
	
	public static void realizarCargaInicial() {
		disciplinas.add(new Disciplina("CABS001", "Algoritmos e Estruturas de Dados"));
		disciplinas.add(new Disciplina("CABS002", "Programa��o Avan�ada"));
		disciplinas.add(new Disciplina("CABS003", "Engenharia de Requisitos (vide CAES003)"));
		disciplinas.add(new Disciplina("CABS004", "Projeto de Software"));
		disciplinas.add(new Disciplina("CABS005", "Intelig�ncia Artificial"));
		disciplinas.add(new Disciplina("CABS006", "Sistemas Operacionais"));
		disciplinas.add(new Disciplina("CABS007", "Projeto e An�lise de Algoritmos"));
		disciplinas.add(new Disciplina("CABS008", "Bancos de Dados"));
		disciplinas.add(new Disciplina("CABS009", "Metodologia de Pesquisa"));
		disciplinas.add(new Disciplina("CABS010", "Processamento Digital de Imagens"));
		disciplinas.add(new Disciplina("CABS011", "Redes de Computadores"));
	}
}
