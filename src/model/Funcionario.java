package model;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {
    private String matricula;
    private double salarioBase;
    private boolean ativo;
    private LocalDate dataAdmissao;

    public Funcionario (String nome, String cpf, LocalDate dataNascimento, String matricula, double salarioBase, boolean ativo, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
    }
}
