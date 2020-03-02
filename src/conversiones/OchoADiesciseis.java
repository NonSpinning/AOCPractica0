package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 8 a 16.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class OchoADiesciseis implements IConversion{

    @Override
    public String convertir(String num){
	OchoADiez ochoadiez = new OchoADiez();
	DiezADiesciseis diezadiesciseis = new DiezADiesciseis();
	return diezadiesciseis.convertir(ochoadiez.convertir(num));
    }
}
