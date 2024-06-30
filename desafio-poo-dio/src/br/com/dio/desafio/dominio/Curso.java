package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{


    /*Modificadores de acesso:
     * private - so a classe tem acesso ao atributo
     * protected - so esta classe e as classes filhas tem acesso
     * public - qualquer classe pode acessar
    */

    private int cargaHoraria;


    @Override
    public double calcularXp() {
       
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    
    
}