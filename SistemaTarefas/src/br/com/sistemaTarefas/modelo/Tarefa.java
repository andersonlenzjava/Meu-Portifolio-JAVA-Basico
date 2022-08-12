package br.com.sistemaTarefas.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tarefa {

	String nomeTarefa;
	String nomeUsuario;
	LocalDateTime dataHoraTarefa;
	Status estadoTarefa;
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public Tarefa(String nomeTarefa, String nomeUsuario, String data, String hora) {
		this.nomeTarefa = nomeTarefa;
		this.nomeUsuario = nomeUsuario;
		String resultado = data + " " + hora;
		this.dataHoraTarefa = LocalDateTime.parse(resultado, formato);
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public LocalDateTime getDataHoraTarefa() {
		return dataHoraTarefa;
	}

	public Status getEstadoTarefa() {

		String dataHoraHoje = "13/12/2020 08:00";

		LocalDateTime dataHoraHojeFormatada = LocalDateTime.parse(dataHoraHoje, formato);

		//segundo n° - o primeiro n°
		long diferencaEmMinutos = ChronoUnit.MINUTES.between(dataHoraTarefa, dataHoraHojeFormatada);

		if (diferencaEmMinutos < 0) {
			this.estadoTarefa = Status.PENDENTE;
		} else if (diferencaEmMinutos >= 0 && diferencaEmMinutos <= 59) {
			this.estadoTarefa = Status.FAZENDO;
		} else if (diferencaEmMinutos >= 60) {
			this.estadoTarefa = Status.FEITO;
		}
		return this.estadoTarefa;
	}
}
