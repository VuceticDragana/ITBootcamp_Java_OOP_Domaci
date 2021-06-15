package Domaci1;

//Napisati klasu Racun koja ima 2 atributa.
//Prvo atribut 'brRacuna' tipa String predstavlja broj racuna.
//brRacuna moze da se dohvati, ali ne i postavi
//Drugi atribut 'stanje' tipa double i predstavlja stanje na racunu
//Stanje ima pocetnu vrednost 0 i moze da se dohvati/postavi
//Napraviti metode za dodavanje i oduzimanje novca za drugi atribut
//dohvati=get
//postavi=set

public class Racun
{
  private String brRacuna;
  private double stanje;

  public Racun(String brRacuna)
  {
    super();
    this.brRacuna = brRacuna;
    this.stanje = 0;
  }

  public double getStanje()
  {
    return stanje;
  }

  private void setStanje(double stanje)
  {
    this.stanje = stanje;
  }

  public String getBrRacuna()
  {
    return brRacuna;
  }

  public void dodavanjeNaRacun(double kolicinaZaDodati)
  {
    if (kolicinaZaDodati > 0)
    {      
      double novoStanje = getStanje();      
      novoStanje = novoStanje + kolicinaZaDodati;      
      setStanje(novoStanje);
    }
    else
    {
      System.out.println("Broj mora biti veci od 0.");
    }
  }
  
  public void oduzimanjeSaRacun(double kolicinaZaOduzeti)
  {
    if (kolicinaZaOduzeti > 0)
    {      
      double novoStanje = getStanje();      
      novoStanje = novoStanje - kolicinaZaOduzeti;      
      setStanje(novoStanje);
    }
    else
    {
      System.out.println("Broj mora biti veci od 0.");
    }
  }
  
  public void stampanjeStanja()
  {
    System.out.println("Racun broj " + getBrRacuna() + " ima stanje: " + getStanje());
  }

}
