/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoheranca;

/**
 *
 * @author conta
 */
public class Funcionario {
    public String nome;
    public double salario;
    private String data;

    public Funcionario(String nome, double salario, String data) {
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }
    
    
    
    
    
    public void exibir(){
        System.out.println("Nome: "+nome+"| Salario: "+salario+"| Data Adm: "+data);
    }
    
    public void aumentarSalario(double perc){
        salario = salario + (salario * perc/100);
    }
    
    public int anoAdmissao(){
        String ano = data.substring(6);
        return Integer.parseInt(ano);
    }
}
