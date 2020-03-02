package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 2 a 8.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DosAOcho implements IConversion{

    @Override
    public String convertir(String num){
	DosADiez dosadiez = new DosADiez();
	DiezAOcho diezaocho = new DiezAOcho();	
	return diezaocho.convertir(dosadiez.convertir(num));
    }
}
