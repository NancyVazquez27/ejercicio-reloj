
/**
 * Esta clase de realizo con la finalidad de simular un reloj digital 24 horas.
 * Esta clase puede simular avanzar minuto a minuto.
 * El constructor de la clase recibe como parametro horasIncial, minutosInicial
 * dadas por el usuario.
 *
 * @author (Nancy Martinez)
 * @version (23.08,17)
 */
public class Reloj
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

   
      // Constructor for objects of class Reloj
    public Reloj(int horasInicial, int minutosInicial)
    {
        // initialise instance variable
         horas=horasInicial;
        minutos=minutosInicial;
    }

  
    public String dimeTuTiempo()
    {
        // put your code here
        String cadResultado=" ";
        
        if(horas>=0 && horas<10)
            {
                cadResultado=cadResultado+"0"+horas;
                cadResultado=cadResultado+":";
            }   
        else
            {
                cadResultado=cadResultado+horas;
                cadResultado=cadResultado+":";
            }
        if(minutos>=0 && minutos<10)
        {
            cadResultado=cadResultado+"0"+minutos;
        }
        else
            {
                cadResultado=cadResultado+minutos;
            }
        return cadResultado;
    }
    
    public void ticTac()
    {
      if(minutos<=59)
      {
          minutos++;
        }
      if(minutos==60)
      {
          horas++;
          if(horas==24 && minutos==60)
          {
              horas=0;
              minutos=0;
            }
           if(horas<23 && minutos==60)
           { 
               minutos=0;
            }
        }
    }
}
