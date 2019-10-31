/*Fecha: 28/10/2019
Autores: Equipo "All Elite Programers"
Objetivo: Programa de clases abstractas de comida*/
package ejecuta_comida;
import java.util.*;
import java.io.*;
public class Ejecuta_Comida {
    public static void main(String[] args) {
        int op,i;
	//declaracion de arreglo
	Comida[] mesa=new Comida[10];
	Scanner leer=new Scanner(System.in);
	for(i=0;i<10;i++){
	    System.out.println("Escoja el tipo de comida: \n1.-Fruta \n2.-Tuberculo \n3.-Hamburguesa \n4.-Bistec");
	    op=leer.nextInt();
	    switch (op){
		case 1: Fruta frut=new Fruta();
			mesa[i]=new Fruta();
	    		frut=(Fruta) mesa[i]; 
	    		frut.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		frut.pelar();break;
		case 2: Tuberculo tuber=new Tuberculo();
			mesa[i]=new Tuberculo();
	    		tuber=(Tuberculo) mesa[i];
	    		tuber.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		tuber.pelar();
	    		tuber.cortar();break;
		case 3:Hamburguesa hambu=new Hamburguesa();
			mesa[i]=new Hamburguesa();
	    		hambu=(Hamburguesa) mesa[i];
	    		hambu.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		hambu.empanizar();
	    		hambu.cortar();
	    		hambu.freir();break;
		case 4: Bistec bis=new Bistec();
			mesa[i]=new Bistec();
	    		bis=(Bistec) mesa[i];
	    		bis.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		bis.empanizar();
	    		bis.cortar();
	    		bis.condimentar();break;
		default: System.out.println("opcion invalida");
	    }
	}
    }
    
}
