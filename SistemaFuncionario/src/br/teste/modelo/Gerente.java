package br.teste.modelo;

public class Gerente {

	String SenhaSecreta;
	String LoginSecreto;
	Funcionario funcionario;

	public Gerente(String nome, String cpf, Integer idade, String senhaSecreta, String loginSecreto) {
		SenhaSecreta = senhaSecreta;
		LoginSecreto = loginSecreto;
		this.funcionario = new Funcionario(nome, cpf, idade);
	}

	public String getSenhaSecreta() {
		return SenhaSecreta;
	}

	public void setSenhaSecreta(String senhaSecreta) {
		SenhaSecreta = senhaSecreta;
	}

	public String getLoginSecreto() {
		return LoginSecreto;
	}

	public void setLoginSecreto(String loginSecreto) {
		LoginSecreto = loginSecreto;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

}
