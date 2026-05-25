package model;

public class Cargo {

    private int id;
    private String nome;
    private double salarioBase;
    private int setorId;

    public Cargo(int id, String nome, double salarioBase, int setorId) {
        setId(id);
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public int getId() {return id;}

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getSalarioBase() {return salarioBase;}

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        }
    }

    public int getSetorId() {return setorId;}

    public void setSetorId(int setorId) {
        if(setorId > 0){
            this.setorId = setorId;
        }
    }


    @Override
    public String toString() {
        return String.format("[%d] %s | Nível: %s | Salário Base: R$ %.2f | Setor: %s", id, nome, salarioBase);
    }
}
