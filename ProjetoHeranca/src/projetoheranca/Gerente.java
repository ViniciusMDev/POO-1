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
public class Gerente extends Funcionario{
    public String secretaria;
    
    public Gerente(String nome, double salario, String data){
        super(nome,salario,data);
    }

    public Gerente(String nome) {
        super(nome);
    }
    
    

    public Gerente(String secretaria, String nome, double salario, String data) {
        super(nome, salario, data);
        this.secretaria = secretaria;
    }
    
    @Override
    public void aumentarSalario(double perc){
        double bonus;
        bonus = (2018- anoAdmissao()) * 0.05 * salario;
        super.aumentarSalario(bonus+perc);
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Secretaria: "+secretaria);
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
    
    

    
    
    
}
