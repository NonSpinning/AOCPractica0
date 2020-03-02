package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 8 a 2.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class OchoADos implements IConversion{

    @Override
    public String convertir(String num){
	OchoADiez ochoadiez = new OchoADiez();
	DiezADos diezados = new DiezADos();
	return diezados.convertir(ochoadiez.convertir(num));
    }
}
