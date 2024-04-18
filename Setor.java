package prova;

public class Setor {
    private int codigo;
    private String sigla;
    private String descricao;

    public Setor(int codigo, String sigla, String descricao) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Setor: " + "\nCódigo: " + codigo +
                "\nSigla: " + sigla +
                "\nDescrição: " + descricao +
                ".";
    }
}
