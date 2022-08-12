package br.teste.modelo;

public class Secretario {

	String wordSenha;
	Funcionario funcionario; 

	public Secretario(String nome, String cpf, Integer idade,String wordSenha) {
		this.wordSenha = wordSenha;
		this.funcionario = new Funcionario(nome, cpf, idade);
	}

	public String getWordSenha() {
		return wordSenha;
	}

	public void setWordSenha(String wordSenha) {
		this.wordSenha = wordSenha;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
