package prova;

import java.time.LocalDate;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private int anoLancamento;
    private String fabricante;
    private double preco;
    private Setor setor;

    public Produto(int codigo, String nome, String descricao, int anoLancamento, String fabricante, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public Produto(int codigo, String nome, String descricao, int anoLancamento, String fabricante, double preco, Setor setor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.fabricante = fabricante;
        this.preco = preco;
        this.setor = setor;
    }

    public void reajustarPreco(double percentual) {
        this.preco += this.preco * percentual / 100;
    }

    public void descontarPreco(double percentual) {
        this.preco -= this.preco * percentual / 100;
    }

    public int calcularIdade() {
        LocalDate dataLocal = LocalDate.now();
        int anoAtual = dataLocal.getYear();
        return anoAtual - this.anoLancamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Produto: " + "\nCódigo: " + codigo + "\nNome: "  + nome +
                "\nDescrição: " + descricao +
                "\nAno de Lançamento: " + anoLancamento +
                "\nFabricante: " + fabricante +
                "\nPreço: " + preco +
                "\n\n" + setor +
                "\nAno de Lançamento: " + anoLancamento +
                "\nIdade do produto: " + calcularIdade() + " anos" + ".";
    }
}
