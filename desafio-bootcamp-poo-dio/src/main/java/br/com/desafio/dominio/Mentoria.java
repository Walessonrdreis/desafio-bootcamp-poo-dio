package br.com.desafio.dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudo {

  private LocalDate data;

  @Override
  public double calcularXo() {
    return XP_PADRAO + 20d;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Mentoria() {
  }

  
  @Override
  public String toString() {
    return "Mentoria [data=" + data + ", descricacao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
  }
  
  
}
