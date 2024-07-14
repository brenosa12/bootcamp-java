package Client;

public class Cliente {
    private  String nome;
    private int registro;

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public Cliente(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }

    @Override
    public String toString() {
        return
                "Nome= " + nome +
                ", Registro=" + registro
                ;
    }
}
