/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonomia.pkgdo.carro;
import java.util.Scanner;
/**
 *
 * @author Caio-Stalberg
 */
public class AutonomiaDoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.
        Scanner dados = new Scanner(System.in);
        
        int km; // Kilômetros rodados
        int litro; // Litros gastos
        float resultado; // Km por litro
        String texto1,texto2;
        
        System.out.println("Digite quantos kilômetros rodou com seu carro:");
        km = dados.nextInt();
        
        System.out.println("agora digite quantos litros gastou no total:");
        litro = dados.nextInt();
        
        resultado = (km / litro);
        
        texto1 = "Seu carro está utilizando: ";
        texto2 = " litros por kilômetro!";
        
        System.out.println(texto1 + resultado + texto2);
        
        
    }
    
}
