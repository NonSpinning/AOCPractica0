package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 16 a 10.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiesciseisADiez implements IConversion{

    @Override
    public String convertir(String num){
	//checar que sea base 16
    	String digits = "0123456789ABCDEF";
             num = num.toUpperCase();
             int val = 0;
             for (int i = 0; i < num.length(); i++)
             {
                 char c = num.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             String d = val + "";
             return d;
    }
}
