package br.teste.separa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Aluno {

	public String nome;
	public LocalDate dataNascimento;
	public String bairro;
	public char sexo;
	public int idade;
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	LocalDate hoje = LocalDate.now();
	
	public Aluno(String nome, String data, String bairo, char sexo) {
		this.nome = nome;
		LocalDate dataNasci = LocalDate.parse(data,formato);
		this.dataNascimento = dataNasci;
		this.idade = hoje.getYear() - dataNasci.getYear();
		this.bairro = bairo;
		this.sexo = sexo;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public void buscaAluno() {
	
	}


	@Override
	public int hashCode() {
		return Objects.hash(bairro, dataNascimento, idade, nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", dataNascimento=" + dataNascimento + ", bairro=" + bairro + ", sexo=" + sexo
				+ ", idade=" + idade + "]";
	}
	
	
}
