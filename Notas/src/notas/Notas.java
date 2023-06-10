/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;


public class Notas {
    double[] listaNotas;
    
    public Notas(){
        listaNotas = new double [5];
        }
    
    double calcularPromedio(){
        double suma = 0;
        for (int i = 0; i<listaNotas.length; i++){
            suma = suma + listaNotas[i];
        }
        return (suma/listaNotas.length);
    }
    
    double calcularDesviacion(){
        double prom = calcularPromedio();
        double suma=0;
        for(int i = 0; i < listaNotas.length; i++){
            suma += Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma/listaNotas.length);
    }
    
    double calcularMenor(){
        double menor = listaNotas[0];
        for(int i=0; i<listaNotas.length; i++){
            if(listaNotas[i] < menor){
                menor = listaNotas[i];
            }
        }
        return menor;
    }
    
    double calcularMayor(){
        double mayor = listaNotas[0];
        for(int i=0; i<listaNotas.length; i++){
            if(listaNotas[i] > mayor){
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
