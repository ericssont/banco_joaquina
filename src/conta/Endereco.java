package conta;

import java.util.Scanner;

public class Endereco {
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String tipo;
	private Integer numero;

	public Endereco() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu cep:");
		this.cep = scanner.next();
		System.out.println("Informe seu logradouro:");
		this.logradouro = scanner.nextLine();
		System.out.println("Informe seu bairro:");
		this.bairro = scanner.nextLine();
		System.out.println("Informe sua cidade:");
		this.cidade = scanner.nextLine();
		System.out.println("Informe seu estado:");
		this.estado = scanner.nextLine();
		System.out.println("Informe o tipo da sua residência:");
		this.tipo = scanner.next();
		System.out.println("Informe o número da sua residência:");
		this.numero = scanner.nextInt();
		scanner.close();
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
