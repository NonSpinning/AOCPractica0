package practica0;
/**[AOC 2020-2]Clase que contiene el main del proyecto.
 *@author Erika Yusset Madera Baldovinos
 *@author Hugo Rafael Ibarra Alarcón
 **/ 
public class Cliente{
    IConversion strategy;

    /**Despliega un menú que deja elegir las bases entre las cuales convertir
     *y permite ingresar un número en la primera base, que convierte a un número en la segunda base.
     *@param args No se usa
     **/
    public static void main (String[] args){
        //menu en un while, usa set Strategy y ejOp.
    }
    
    /**Cambia el algoritmo de conversión
     *@param strategy el nuevo algoritmo
     */
    private void setStrategy(IConversion strategy){
        this.strategy = strategy;
    }
    
    /**ejecuta el algoritmo de conversión actual
     *@param num El número a convertir como String
     *@return El número convertido
     **/
    private String ejecutarOperacion(String num){
        return this.strategy.convertir(num);
    }
    
}
