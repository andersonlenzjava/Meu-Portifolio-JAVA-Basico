package br.sistemaTarefas.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.sistemaTarefas.modelo.Status;
import br.com.sistemaTarefas.modelo.Tarefa;

public class RepositorioTarefas {

	List<Tarefa> listaTarefas = new ArrayList<>();

	public void adicionaTarefa(Tarefa tarefa) {
		if (!(listaTarefas.contains(tarefa))) {
			listaTarefas.add(tarefa);
		}
	}

	public List<Tarefa> getTarefasStatus(Status status) {
		List<Tarefa> tarefasStatus = new ArrayList<>();
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getEstadoTarefa().equals(status)) {
				tarefasStatus.add(tarefa);
			}
		}
		return tarefasStatus;
	}

	public List<Tarefa> getTarefasUsuario(String nomeUsuario) {
		List<Tarefa> tarefasUsuario = new ArrayList<>();
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getNomeUsuario().equals(nomeUsuario)) {
				tarefasUsuario.add(tarefa);
			}
		}
		return tarefasUsuario;
	}

	public List<Tarefa> getTarefasTarde(String dataPesquisaTarefa) {
		List<Tarefa> tarefasTardeDoDia = new ArrayList<>();
		String[] output5 = dataPesquisaTarefa.split("/");
		int dia = Integer.valueOf(output5[0]);
		int mes = Integer.valueOf(output5[1]);
		int ano = Integer.valueOf(output5[2]);
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDataHoraTarefa().getDayOfMonth() == dia && tarefa.getDataHoraTarefa().getMonthValue() == mes
					&& tarefa.getDataHoraTarefa().getYear() == ano) {
				int hora = tarefa.getDataHoraTarefa().getHour();
				if (hora > 12) {
					tarefasTardeDoDia.add(tarefa);
				}
			}
		}
		return tarefasTardeDoDia;
	}

	public int getQuantiaAtividadesStatus(Status status) {
		int quantidade = 0;
		for (Tarefa tarefa : listaTarefas) {
			if(tarefa.getEstadoTarefa() == status) {
				quantidade++;
			}
		}
		return quantidade;
	}
}
