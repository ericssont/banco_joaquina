package conta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private LocalDate dataNascimento;
	
	public Pessoa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Infome seu nome: ");
		this.nome = scanner.nextLine();
		System.out.println("Infome seu cpf: ");
		this.cpf = scanner.nextLine();
		System.out.println("Infome sua data de nascimento: ");
		this.dataNascimento = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
		this.endereco = new Endereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento
				+ "]";
	}
}
