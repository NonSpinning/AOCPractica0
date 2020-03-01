package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 10 a 2.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiezADos implements IConversion{

    @Override
    public String convertir(String num){
    	//checar que es base 10
	 int d = Integer.parseInt(num);
    String digitos = "01";
    if (d <= 0) return "0";  
    int base = 2;
    String bin = "";
    while (d > 0) {
        int digit = d % base;              
        bin = digitos.charAt(digit) + bin;  
        d = d / base;
    }
    return bin;
    }
}
