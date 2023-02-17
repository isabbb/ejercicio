/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author sistemas
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        carro mazda= new carro();
    //mazda.marca="mazda";
    mazda.setMarca("Mazda");
        System.out.println(mazda.getMarca());
        autovolador carro=new autovolador();
        
        carro.setEsta_Volando(true);
        
        if (carro.isEsta_Volando()){
            System.out.println("Esta volandooo :D");
        }
        else {
            System.out.println("No esta volando :c");
            
        }
    }
    
    
            
            
            
            
            
            
            
            
}
