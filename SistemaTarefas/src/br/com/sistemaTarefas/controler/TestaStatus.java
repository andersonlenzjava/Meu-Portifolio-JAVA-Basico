package br.com.sistemaTarefas.controler;

import java.util.List;

import br.com.sistemaTarefas.modelo.Status;
import br.com.sistemaTarefas.modelo.Tarefa;
import br.sistemaTarefas.repositorio.RepositorioTarefas;

public class TestaStatus {

	public static void main(String[] args) {

		Tarefa tarefa1 = new Tarefa("Fazer café", "Ander", "13/12/2020", "08:00");
		Tarefa tarefa2 = new Tarefa("Tomar café", "Ander", "13/12/2020", "09:00");
		Tarefa tarefa3 = new Tarefa("Acordar", "Ander", "13/12/2020", "06:30");
		Tarefa tarefa4 = new Tarefa("Estudar", "Ander", "13/12/2020", "10:00");
		Tarefa tarefa5 = new Tarefa("Fazer pão", "Ander", "13/12/2020", "08:00");
		Tarefa tarefa6 = new Tarefa("Correr", "Ander", "13/12/2020", "18:00");
		Tarefa tarefa7 = new Tarefa("Ler", "Ander", "12/12/2020", "20:00");
		Tarefa tarefa8 = new Tarefa("Praticar Estudo", "Ander", "12/12/2020", "18:30");

		RepositorioTarefas repoTarefas = new RepositorioTarefas();
		repoTarefas.adicionaTarefa(tarefa1);
		repoTarefas.adicionaTarefa(tarefa2);
		repoTarefas.adicionaTarefa(tarefa3);
		repoTarefas.adicionaTarefa(tarefa4);
		repoTarefas.adicionaTarefa(tarefa5);
		repoTarefas.adicionaTarefa(tarefa6);
		repoTarefas.adicionaTarefa(tarefa7);
		repoTarefas.adicionaTarefa(tarefa8);

		System.out.println("- Fazer uma consulta que traga todas as tarefas de um status ");
		List<Tarefa> tarefasStatus = repoTarefas.getTarefasStatus(Status.FEITO);
		System.out.println("Status: Feito");
		tarefasStatus.forEach(tarefa -> System.out.println(tarefa.getNomeTarefa()));
		System.out.println();

		System.out.println("- Fazer uma consulta que traga todas as tarefas de um usuário ");
		List<Tarefa> tarefasUsuario = repoTarefas.getTarefasUsuario("Ander");
		System.out.println("Unsuário: Ander");
		tarefasUsuario.forEach(tarefa -> System.out.println(tarefa.getNomeTarefa()));
		System.out.println();

		System.out.println("- Fazer uma consulta que retorna todas as tarefas do período da tarde de um determado dia ");
		List<Tarefa> tarefasTardedia = repoTarefas.getTarefasTarde("12/12/2020");
		System.out.println("Tarefas da tarde do dia 12/12/2020");
		tarefasTardedia.forEach(tarefa -> System.out.println(tarefa.getNomeTarefa()));
		System.out.println();
		
		System.out.println("- Fazer uma consulta que retorna quantas atividades por cada tipo de status tem na lista");
		int quantiaAtividadeStatus = repoTarefas.getQuantiaAtividadesStatus(Status.FAZENDO);
		System.out.println("Tarefas com o Status fazendo: " + quantiaAtividadeStatus);

	}

}
