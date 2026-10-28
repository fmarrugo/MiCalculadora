/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Calculadora {

    public static void main(String[] args) throws OperacionInvalida {
        Scanner sc = new Scanner(System.in);
        int n = 0, n1 = 0, opc = 0;
        
        do{
            try{
                System.out.print("Ingrese un número: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Debe digitar un numero.");
            }     
        } while(true);
            
        do{
            try{
                System.out.print("Ingrese otro número: ");
                n1 = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Debe digitar un numero.");
            }
        } while(true);
        
        do{
            try{
                System.out.println("Digite que operacion desea hacer:\n 1)+\n 2)-\n 3)*\n 4)/\n Opcion: ");
                opc = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Debe digitar un numero.");
            }
        } while(true);
        
        try{
            switch (opc){
                case 1:
                    int suma = n + n1;
                    System.out.println("Suma: "+ suma);
                    break;
                case 2:
                    int resta = n - n1;
                    System.out.println("Resta: "+ resta);
                    break;
                case 3:
                    int mult = n * n1;
                    System.out.println("Multiplicacion: "+ mult);
                    break;
                case 4:
                    try{
                        int div = n / n1;
                        System.out.println("División: " + div);
                    }
                    catch(ArithmeticException e){
                        System.out.println("El segundo numero es "+ n1 +" y no se puede dividir entre 0");
                    }

                    break;
                default:
                    throw new OperacionInvalida(opc);                
            }
        }catch(OperacionInvalida e){
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}