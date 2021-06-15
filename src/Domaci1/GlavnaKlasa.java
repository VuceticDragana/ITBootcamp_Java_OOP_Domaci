package Domaci1;

public class GlavnaKlasa
{

  public static void main(String[] args)
  {
    Racun r1 = new Racun("123-000456-789");
    
    r1.stampanjeStanja();
    
    r1.dodavanjeNaRacun(5000);
    r1.stampanjeStanja();
    
    r1.oduzimanjeSaRacun(200);
    r1.stampanjeStanja();
    
    r1.dodavanjeNaRacun(0);
    r1.oduzimanjeSaRacun(-1);
  }

}
