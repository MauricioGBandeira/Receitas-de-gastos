package br.com.financeiro.model;

public class Usuario {
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private int contato;


	public Usuario(String cpf, String nome, String email, String senha, int contato) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.contato = contato;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}


	
	
}
