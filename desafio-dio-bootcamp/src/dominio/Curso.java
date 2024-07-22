package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;




    public int getCargaHoraria() {
        return cargaHoraria;
    }


    @Override
    public double calcularXp() {
        return XP_INICIAL * cargaHoraria;
    }
}
