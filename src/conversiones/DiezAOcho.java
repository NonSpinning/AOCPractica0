package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 10 a 8.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiezAOcho implements IConversion{

    @Override
    public String convertir(String num){
    	//checar que es base 10
	 int d = Integer.parseInt(num);
    String digitos = "01234567";
    if (d <= 0) return "0"; 
    int base = 8;
    String octa = "";
    while (d > 0) {
        int digit = d % base;              
        octa = digitos.charAt(digit) + octa;   
        d = d / base;
    }
    return octa;
    }
}
