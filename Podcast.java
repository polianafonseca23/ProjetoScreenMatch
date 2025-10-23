package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentor;
    private String descricao;

    public String getApresentor(String poliana) {
        return apresentor;
    }

    public void setApresentor(String apresentor) {
        this.apresentor = apresentor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }

    }
}
