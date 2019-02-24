
package projetoheranca;

public class ProjetoHeranca {


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro",2000,"10/05/1999");
        Funcionario f2 = new Funcionario("Ana",2000,"20/10/1999");
        
        Gerente g1 = new Gerente("Paulo",2000,"05/11/1999");
        
        g1.setSecretaria("Joana");
        
        f1.aumentarSalario(20);
        f2.aumentarSalario(20);
        g1.aumentarSalario(20);
        
        f1.exibir();
        f2.exibir();
        g1.exibir();
        
        
        
    }
    
}
