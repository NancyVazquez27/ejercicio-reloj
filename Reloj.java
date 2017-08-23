
/**
 * Write a description of class Reloj here.
 *
 * @author (Nancy Martinez)
 * @version (23.08,17)
 */
public class Reloj
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

    /**
     * Constructor for objects of class Reloj
     */
    public Reloj(int horasInicial, int minutosInicial)
    {
        // initialise instance variables
        horas=horasInicial;
        minutos=minutosInicial;
    }

  
    public String dimeTuTiempo()
    {
        // put your code here
        String cadResultado=" ";
        
        cadResultado=cadResultado+horas;
        cadResultado=cadResultado+":";
        cadResultado+=minutos;
        
        return cadResultado;
    }
}
