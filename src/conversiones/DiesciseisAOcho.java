package practica0.conversiones;
import practica0.IConversion;

/**[AOC 2020-2]Clase que transforma de base 16 a 8.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/
public class DiesciseisAOcho implements IConversion{

    @Override
    public String convertir(String num){
	DiesciseisADiez diesciseisadiez = new DiesciseisADiez();
	DiezAOcho diezaocho = new DiezAOcho();
	return diesciseisadiez.convertir(diezaocho.convertir(num));
    }
}
