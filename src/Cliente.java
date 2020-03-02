package practica0;
import practica0.conversiones.*;
import java.util.Scanner;
/**[AOC 2020-2]Clase que contiene el main del proyecto.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/ 
public class Cliente{
    IConversion strategy;
    
    /**Despliega un menú que deja elegir las bases entre las cuales convertir
     *y permite ingresar un número en la primera base, que convierte a un número en la segunda base.
     *@param args No se usa
     **/
    public static void main (String[] args){
	Cliente cliente = new Cliente();
	boolean bandera = true;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bienvenido, estas son las bases entre las cuales se convertir, elige una:");
	while (bandera){
	    System.out.println("1.-  2->8");
	    System.out.println("2.-  2->10");
	    System.out.println("3.-  2->16");
	    System.out.println("4.-  8->2");
	    System.out.println("5.-  8->10");
	    System.out.println("6.-  8->16");
	    System.out.println("7.-  10->2");
	    System.out.println("8.-  10->8");
	    System.out.println("9.-  10->16");
	    System.out.println("10.- 16->2");
	    System.out.println("11.- 16->8");
	    System.out.println("12.- 16->10");
	    System.out.println("13.- Ya no deseo hacer ninguna conversion");
	    int opcion = scanner.nextInt();
	    switch (opcion){
	    case 1:cliente.setStrategy(new DosAOcho());
		break;
	    case 2:cliente.setStrategy(new DosADiez());
		break;
	    case 3:cliente.setStrategy(new DosADiesciseis());
		break;
	    case 4:cliente.setStrategy(new OchoADos());
		break;
	    case 5:cliente.setStrategy(new OchoADiez());
		break;
	    case 6:cliente.setStrategy(new OchoADiesciseis());
		break;
	    case 7:cliente.setStrategy(new DiezADos());
		break;
	    case 8:cliente.setStrategy(new DiezAOcho());
		break;
	    case 9:cliente.setStrategy(new DiezADiesciseis());
		break;
	    case 10:cliente.setStrategy(new DiesciseisADos());
		break;
	    case 11:cliente.setStrategy(new DiesciseisAOcho());
		break;
	    case 12:cliente.setStrategy(new DiesciseisADiez());
		break;
	    case 13:bandera =false;
		break;
	    default: throw new IllegalArgumentException("Opcion no valida");		
	    }
	    if (bandera){
		System.out.println("Introduce el número a convertir: ");
		scanner.nextLine();
		String num = scanner.nextLine();
		System.out.println("Convertido es "+cliente.strategy.convertir(num)+"\n");
	    }
	}
	
    }
    
    /**Cambia el algoritmo de conversión
     *@param strategy el nuevo algoritmo
     */
    private void setStrategy(IConversion strategy){
	this.strategy = strategy;
    }
    
    /**ejecuta el algoritmo de conversión actual
     *@param num El número a convertir como String
     *@return El número convertido
     **/
    private String ejecutarOperacion(String num){
	return this.strategy.convertir(num);
    }
    
}
