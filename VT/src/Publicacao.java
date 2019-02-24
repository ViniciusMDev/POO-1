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

public class Publicacao {
    private int numordem;
    private String tipo;
    private int qntdloca;
    private float valordia;
    private int diasloca;
    private String cpf;
    private boolean estadoloca;

    public Publicacao() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de ordem: ");
        this.numordem = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o tipo: ");
        this.tipo = sc.nextLine();
        
        System.out.println("Digite a quantidade para locação: ");
        this.qntdloca = sc.nextInt();
        
        System.out.println("Digite o valor da diária: ");
        this.valordia = sc.nextFloat();
        
        System.out.println("Digite o estado de locação: \ntrue: locada | false: disponível");
        this.estadoloca = sc.nextBoolean();
    }

    @Override
    public String toString() {
        return "Publicacao{" + "numordem=" + numordem + ", tipo=" + tipo + ", qntdloca=" + qntdloca + '}';
    }
    
    public float valortotalloca(){
        return diasloca * valordia;
    }
    
    public float valormulta(){
        if(diasloca>15){
            return (diasloca - 15) * (0.03f * valortotalloca());
        }
        else{
            return 0;
        }
    }
    
    public boolean validacaocliente(String cpfpa){
        if(this.cpf == null){
            return false;
        }
        else{
            return cpf.equals(cpfpa);
        }
    }

    public int getNumordem() {
        return numordem;
    }

    public void setNumordem(int numordem) {
        this.numordem = numordem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQntdloca() {
        return qntdloca;
    }

    public void setQntdloca(int qntdloca) {
        this.qntdloca = qntdloca;
    }

    public float getValordia() {
        return valordia;
    }

    public void setValordia(float valordia) {
        this.valordia = valordia;
    }

    public int getDiasloca() {
        return diasloca;
    }

    public void setDiasloca(int diasloca) {
        this.diasloca = diasloca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isEstadoloca() {
        return estadoloca;
    }

    public void setEstadoloca(boolean estadoloca) {
        this.estadoloca = estadoloca;
    }
    
    
    
}
