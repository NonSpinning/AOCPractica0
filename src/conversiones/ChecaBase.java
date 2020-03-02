package practica0.conversiones;

public class ChecaBase{

    public boolean checarBase(String porchecar, String permitidos){
	boolean aceptado = false;
	for (int i = 0; i < porchecar.length(); i++){
	    for (int j =0; j < permitidos.length(); j++){
		if (porchecar.charAt(i)==permitidos.charAt(j)){
		    aceptado = true;
		    break;
		}
	    }
	    if (!aceptado) return false;
	}
	return true;
       }
    
}
