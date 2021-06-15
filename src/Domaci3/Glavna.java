package Domaci3;

//Napisati glavni program, gde cete testirati kako ove klase funkcionisu.


public class Glavna
{
  public static void main(String[] args)
  {
    Sportista s1 = new Sportista("Pera", "Peric", 2000); 
    Sportista s2 = new Sportista("Zika", "Zikic", 1999);
    
    Klub k1 = new Klub("klub1", "Grad", 1970, s1);
    Klub k2 = new Klub("klub2", "Grad", 1972, s2);
    
    s1.ispis();
    s2.ispis();
    
    k1.ispis();
    k2.ispis();    

  }

}
