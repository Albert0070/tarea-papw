/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9;
import java.util.Scanner;

/**
 *
 * @author perro
 */
public class Tarea9 {
static int x;
static int y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
int x;
int y;
String s;

System.out.println("Jugador uno: 1)piedra 2)papel 3)tijera");
x = scanner.nextInt();


scanner.nextLine();// Necesario para evitar saltar línea
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("=============================================");
System.out.println("Jugador dos: 1)piedra 2)papel 3)tijera");
y = scanner.nextInt();
scanner.nextLine();// Necesario para evitar saltar línea


if(x==1&&y==1||x==2&&y==2||x==3&&y==3)
System.out.println("empate!");
else if(x==2&&y==1)
System.out.println("jugador 1 gana!");
else if(x==1&&y==3)
System.out.println("jugador 1 gana!");
else
System.out.println("jugador 2 gana!");


        
    
        




        // TODO code application logic here
    }
    
}
