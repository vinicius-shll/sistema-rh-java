package model;

public class Setor {

    private int id;
    private String nome;
    private String descricao;
    private double orcamento;

    public Setor(int id, String nome, String descricao, double orcamento) {
        setId(id);
        setNome(nome);
        setDescricao(descricao);
        setOrcamento(orcamento);
    }

    public int getId() {return id;}

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.isEmpty()){
            this.descricao = descricao;
        }
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        if(orcamento > 0){
            this.orcamento = orcamento;
        }
    }

    @Override
    public String toString() {
        return String.format("[%d] %s | Orçamento: R$ %.2f | %s",
                id, nome, orcamento, descricao);
    }
}
