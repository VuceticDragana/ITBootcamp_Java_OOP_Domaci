package Domaci2;

import java.util.ArrayList;

// U glavnom programu napraviti vise autora sa vise knjiga.

public class Glavna
{
  public static void main(String[] args)
  {
    ArrayList<Knjiga> knjige = new ArrayList<Knjiga>();
    
    Autor a1 = new Autor("Pera", "Peric");
    Autor a2 = new Autor("Mile", "Milic");    
    
    knjige.add(new Knjiga("1234567891234", "Knjiga1", 2012, a1));
    knjige.add(new Knjiga("1534567898239", "Knjiga2", 2008, a2));
    knjige.add(new Knjiga("5434868898219", "Knjiga3", 2017, a1));
    
    for (int i = 0; i < knjige.size(); i++)
    {
      knjige.get(i).stampajKnjigu();
    }
  }
}
