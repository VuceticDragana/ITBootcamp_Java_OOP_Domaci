package Domaci3_bonus;

public class Glavna
{

  public static void main(String[] args)
  {
    Sportista s1 = new Sportista("MIka", "Mikic", 1999);
    Sportista s2 = new Sportista("Dejan", "Dejanovic", 1998);
    Sportista s3 = new Sportista("Milos", "Milosevic", 2000);
    
    Klub k1 = new Klub("Klub1", "Zarkovo", 1970);
    
    k1.dodavanjeSportiste(s1);   
    k1.dodavanjeSportiste(s2);
    k1.dodavanjeSportiste(s3);    
    k1.ispis();
    
    System.out.println("----------------------------------------");
    
    k1.uklanjanjeSportiste("Mika");
    k1.ispis();
  }
}
