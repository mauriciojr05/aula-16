/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula16;

/**
 *
 * @author mauricio.junior1
 */
public class Dados implements funcao{
    public String A1;
    public String A2;
    public String A3;
    public String A4;

    @Override
    public void regDados() {
        A1 = " Senac";
        A2 = " Rio do Sul";
        A3 = " Santa Catarina";
        A4 = " Brasil";
    }

    @Override
    public void verDados() {
       System.out.print(A1 + A2 + A3 + A4);
    }

    @Override
    public void lerDados() {
       
    }
}
