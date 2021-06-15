package Domaci4;

public class Glavna
{

  public static void main(String[] args)
  {
    Vozac v1 = new Vozac("Pera", "Peric");
    Vozac v2 = new Vozac("Mika", "Mikic");
    
    Putnik p1 = new Putnik ("Sima", "Simic", 2000);
    Putnik p2 = new Putnik ("Jovan", "Jovanovic", 3500);
    Putnik p3 = new Putnik ("Milan", "Milanovic", 4000);
    
    Autobus a1 = new Autobus("MunjaTrans", v1, 400);
    
    a1.dodatiPutnika(p1);
    a1.dodatiPutnika(p2);
    a1.dodatiPutnika(p3);    

    a1.stampa();
    
    System.out.println("-----------------------------------------");
    
    p2.dodatiNovac(200);
    p3.oduzetiNovac(400);
    a1.uklonitiVozaca();
    a1.dodatiVozaca(v2);
    a1.uklonitiPutnika("Sima");
    
    a1.stampa();
    
    System.out.println("-----------------------------------------");
        
    a1.uklonitiVozaca();
    p2.oduzetiNovac(4000);
    
    a1.stampa();
  }

}
