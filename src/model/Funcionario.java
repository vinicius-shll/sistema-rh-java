package model;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    private String matricula;
    private double salarioBase;
    private boolean ativo;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento,
                       String matricula, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
        setDataAdmissao(dataAdmissao);
        this.ativo = true;
    }

    public abstract double calcularSalario();
    public abstract String getTipoContrato();

    public String getMatricula() { return matricula; }
    public double getSalarioBase() { return salarioBase; }
    public boolean isAtivo() { return ativo; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
        this.matricula = matricula;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if (dataAdmissao == null || dataAdmissao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de admissão inválida.");
        }
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Matrícula: " + matricula +
                " | Contrato: " + getTipoContrato() +
                " | Salário Base: " + salarioBase +
                " | Ativo: " + (ativo ? "Sim" : "Não");
    }
}