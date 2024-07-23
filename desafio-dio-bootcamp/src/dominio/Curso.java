package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(String titulo,String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_INICIAL * cargaHoraria;
    }
}
