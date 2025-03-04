package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFim = dataInicio.plusDays(60);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devs = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public Set<dominio.Conteudo> getConteudos() {
        return conteudos;
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, conteudos, devs);
    }
}
