package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 10 a 16.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiezADiesciseis implements IConversion{

    @Override
    public String convertir(String num){
    	//checar que es base 10
      int d = Integer.parseInt(num);
    String digitos = "0123456789ABCDEF";
    if (d <= 0) return "0"; 
    int base = 16; 
    String hexa = "";
    while (d > 0) {
        int digit = d % base;              
        hexa = digitos.charAt(digit) + hexa;   
        d = d / base;
    }
    return hexa;
    }
}
