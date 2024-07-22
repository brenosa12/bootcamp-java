package dominio;

public abstract class Conteudo {

    private String titulo;
    private String descricao;
    protected static final double XP_INICIAL = 10;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
