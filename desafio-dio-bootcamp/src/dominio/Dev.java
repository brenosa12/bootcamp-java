package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;

    Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }


    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        }
        else {
            throw new RuntimeException("Você não está Matriculado em nenhum conteúdo.");
        }
    }

    public void calcularTotalXp(){
        double xp= this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
        System.out.println("XP = "+ xp);

    }


    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }


    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }
}
