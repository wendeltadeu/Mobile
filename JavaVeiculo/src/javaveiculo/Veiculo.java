/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaveiculo;

/**
 *
 * @author Wendel Tadeu
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    
    /**
    *
    * Get // Setters
    */    
    public String getMarca(){ return marca; }
    public void setMarca(String value){ marca = value;}
    
    public String getModelo(){ return modelo; }
    public void setModelo(String value){ modelo = value;}
    
    public String getCor(){ return cor; }
    public void setCor(String value){ cor = value;}
    
    public String getCombustivel(){ return combustivel; }
    public void setCombustivel(String value){ combustivel = value;}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        
        Veiculo veiculo = new Veiculo();
        
        veiculo.setMarca("Toyota");
        veiculo.setCor("Cinza");
        veiculo.setCombustivel("Hidrogênio");
        
        System.out.println(veiculo.getMarca());
        System.out.println(veiculo.getCor());
        System.out.println(veiculo.getCombustivel());
    }
    
}
