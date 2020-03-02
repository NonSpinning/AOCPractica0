package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 8 a 10.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class OchoADiez implements IConversion{

    @Override
    public String convertir(String num){
    	ChecaBase checabase = new ChecaBase();
	if (!checabase.checarBase(num, "01234567")) throw new IllegalArgumentException("El número no está en la base apropidada");
	int n = Integer.parseInt(num); 
        int dec= 0; 
        int base = 1; 
        int temp = n; 
        while (temp > 0) { 
            int ultimo = temp % 10; 
            temp = temp / 10; 
            dec += ultimo * base; 
            base = base * 8; 
        } 
        String d = dec + "";
        return d;
    }
}
