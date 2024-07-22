package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;

    public LocalDate getData() {
        return data;
    }


    @Override
    public double calcularXp() {
        return XP_INICIAL + 10;
    }
}






