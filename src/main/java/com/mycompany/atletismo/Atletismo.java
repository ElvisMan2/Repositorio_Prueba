
package com.mycompany.atletismo;

import java.util.Scanner;

public class Atletismo {
    
    public static int atletaRapido(Atleta atletas[]){
    float min;
    int i, indiceRapido;
     min=atletas[0].getTiempoCarrera();
     indiceRapido=0;
        for(i=0;i<3;i++){
            
            if(atletas[i].getTiempoCarrera()<min){
            min=atletas[i].getTiempoCarrera();
            indiceRapido=i;
            }
            
        }
        
        return indiceRapido;
    }
    
    public static void main(String[] args) {
        Atleta atletas[];
        atletas= new Atleta[3];
        
        Scanner entrada= new Scanner(System.in);
        int i,indiceBarato;
        float min;
        int codigo;
        float tiempo;
        String nombre;
        
        for(i=0;i<3;i++){
            
            
            System.out.println("Ingrese los datos del atleta "+(i+1));
            System.out.print("codigo del atleta ");
            codigo=entrada.nextInt();
            System.out.print("tiempo del atleta ");
            tiempo=entrada.nextFloat(); entrada.nextLine();
            System.out.print("nombre del atleta ");
            nombre=entrada.nextLine();
            atletas[i]=new Atleta(codigo, nombre, tiempo);
        }
        
        System.out.println("El atleta más rapido es el atleta nro: "+(atletaRapido(atletas)+1));
              
    }
}
