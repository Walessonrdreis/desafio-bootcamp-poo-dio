package br.com.desafio;

import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Curso curso = new Curso();
        curso.setTitulo("ReactJs");
        System.out.println(curso);

       // Conteudo conteudo = new Curso(); posso insatanciar um objeto Curso atraves da classe conteudo porque ela é
        // classe mãe
    }
}
