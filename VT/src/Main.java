/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conta
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);                             //Parte 2 - 1
        
        ArrayList<Livro> list1 = new ArrayList<>();
        ArrayList<TrabalhoCientifico> list2 = new ArrayList<>();
    
    
        System.out.print("Deseja cadastrar quantas publicações: ");
        int n = sc.nextInt();
        
        System.out.print("Digite: 1 - Livros ou 2 - Trabalhos Científicos: ");
        int opcao = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            if(opcao == 1)
            {
                list1.add(new Livro());
            }
            else if(opcao == 2)
            {
                list2.add(new TrabalhoCientifico());
            }
            else
            {
                System.out.println("Codigo Errado!");
                System.out.print("Digite: 1 - Livros ou 2 - Trabalhos Cintificos: ");
                opcao = sc.nextInt();
                
            }
              
        }
        
        System.out.println("Alugar Publicação");                      //Parte 2 - 2
        System.out.print("Número da Publicação a ser Alugada: ");
            int numero = sc.nextInt();
            sc.nextLine();
        
         System.out.print("CPF do cliente : ");
            String cpf2 = sc.nextLine();
            
        for(Publicacao p: list1){                                        //Parte 2 - 2(lista1)
            if(numero == p.getNumordem()){
                if(p.getQntdloca()>0){
                    System.out.println("Em estoque!");
                    p.setEstadoloca(true);
                    p.setCpf(cpf2);
                    p.validacaocliente(cpf2);
                    System.out.println("Valor total da locação: "+p.valortotalloca());
                    p.setQntdloca(p.getQntdloca()-numero);
                    System.out.println("Quantidade atualizada: "+p.getQntdloca());
                }
            
                else{
                    System.out.println("Não há a quantidade informada em estoque!");
                }
            }
            else{
                System.out.println("O número da publicação digitada não existe!");
            }
        }
        
        for(Publicacao p: list2){                                        //Parte 2 - 2(lista2)
            if(numero == p.getNumordem()){
                if(p.getQntdloca()>0){
                    System.out.println("Em estoque!");
                    p.setEstadoloca(true);
                    p.setCpf(cpf2);
                    p.validacaocliente(cpf2);
                    System.out.println("Valor total da locação: "+p.valortotalloca());
                    p.setQntdloca(p.getQntdloca()-numero);
                    System.out.println("Quantidade atualizada: "+p.getQntdloca());
                }
            
                else{
                    System.out.println("Não há a quantidade informada em estoque!");
                }
            }
            else{
                System.out.println("O número da publicação digitada não existe!");
            }
        }
        
        
        System.out.println("Devolução da Publicação");                   //Parte 2 - 3
        System.out.print("CPF do cliente : ");
            String cpfdev = sc.nextLine();
            
        System.out.println("Digite quantos dias ficou com a Publicação:");
            int diasloca2 = sc.nextInt();
            
            for(Publicacao p : list1){                                  //Parte 2 - 3(lista1)
                if(cpfdev.equals(p.getCpf())){
                    if(p.isEstadoloca() == true){
                        p.setEstadoloca(false);
                        p.setDiasloca(diasloca2);
                        if(diasloca2>15){
                        System.out.println("Valor da multa: "+p.valormulta());
                        }
                        else{
                            System.out.println("Obrigado!");
                        }
                    }
                }
                else{
                    System.out.println("CPF inválido");
                }
            }
            
            for(Publicacao p : list2){                                  //Parte 2 - 3(lista2)
                if(cpfdev.equals(p.getCpf())){
                    if(p.isEstadoloca() == true){
                        p.setEstadoloca(false);
                        p.setDiasloca(diasloca2);
                        if(diasloca2>15){
                        System.out.println("Valor da multa: "+p.valormulta());
                        }
                        else{
                            System.out.println("Obrigado!");
                        }
                    }
                }
                else{
                    System.out.println("CPF inválido");
                }
            }
        
    }

  

    
    
}
