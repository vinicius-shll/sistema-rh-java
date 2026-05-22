package model;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    private LocalDate dataNascimento;

    public Pessoa (String nome, String cpf, LocalDate dataNascimento) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Nascimento: " + dataNascimento;
    }
}
