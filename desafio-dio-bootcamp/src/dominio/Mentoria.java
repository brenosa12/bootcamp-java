package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data= LocalDate.now();

    public Mentoria(String titulo,String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }


    @Override
    public double calcularXp() {
        return XP_INICIAL + 10;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}






