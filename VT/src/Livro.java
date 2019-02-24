/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conta
 */
    import java.util.Scanner;

public class Livro extends Publicacao{
    private int numpaginas;
    private int areaatu;

    public Livro() {
        super();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de páginas: ");
        this.numpaginas = sc.nextInt();
        
        System.out.println("Digite a área de atuação: ");
        System.out.println("1 - EXATAS | 2 - HUMANAS | 3 - SAÚDE");
        this.areaatu = sc.nextInt(); 
    }
    
    @Override
    public float valortotalloca(){
        if(areaatu == 1){
            return super.valortotalloca() - (0.05f * getValordia());
        }
        else if(areaatu == 2){
            return super.valortotalloca() - (0.07f * getValordia());
        }
        else if(areaatu == 3){
            return super.valortotalloca() - (0.09f * getValordia());
        }
        else{
            return 0; //condição para imprimir no main que o valor digitado está errado
        }
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public int getAreaatu() {
        return areaatu;
    }

    public void setAreaatu(int areaatu) {
        this.areaatu = areaatu;
    }
    
    
    
    
    
    

    
    
    
}
