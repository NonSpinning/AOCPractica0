package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 16 a 2.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiesciseisADos implements IConversion{

    @Override
    public String convertir(String num){
        DiesciseisADiez diesciseisadiez = new DiesciseisADiez();
	DiezADos diezados = new DiezADos();
	return diezados.convertir(diesciseisadiez.convertir(num));
    }
}
