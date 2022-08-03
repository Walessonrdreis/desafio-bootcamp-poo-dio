package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricacao;
    private final LocalDate dataInicial = LocalDate.now();// começa a contar quando ocorre a inscrição.
    private final LocalDate dataFinal =dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricacao, bootcamp.descricacao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricacao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}


