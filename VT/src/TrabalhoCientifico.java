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

public class TrabalhoCientifico extends Publicacao{
    private float nota;
    private int numcapi;

    public TrabalhoCientifico() {
        super();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota final: ");
        this.nota = sc.nextFloat();
        
        System.out.println("Digite o número de capítulos: ");
        this.numcapi = sc.nextInt();
    }
    
    
    public float valortotalloca(float precocapi){
        return precocapi * numcapi + (0.8f * getValordia());
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getNumcapi() {
        return numcapi;
    }

    public void setNumcapi(int numcapi) {
        this.numcapi = numcapi;
    }
    
    

    
}
