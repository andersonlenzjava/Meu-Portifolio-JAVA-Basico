package br.teste.modelo;

public class Entregador implements Deposita, Saca {

	String chaveArmario;
	Funcionario funcionario;
	
	public Entregador(String nome, String cpf, Integer idade,String chaveArmario) {
		this.chaveArmario = chaveArmario;
		this.funcionario = new Funcionario(nome, cpf, idade);
	}

	public String getChaveArmario() {
		return chaveArmario;
	}

	public void setChaveArmario(String chaveArmario) {
		this.chaveArmario = chaveArmario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public void saca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposita() {
		// TODO Auto-generated method stub
		
	}
	
}
