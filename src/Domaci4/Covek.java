package Domaci4;

//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
//Svi podaci mogu da se dohvate, ali ne i postave.

public class Covek
{
  private String ime;
  private String prezime;
  
  public Covek(String ime, String prezime)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
  }

  public String getIme()
  {
    return ime;
  }

  public String getPrezime()
  {
    return prezime;
  }
  
  public String vracaPodatke()
  {
    return getIme() + " " + getPrezime();
  }
  
  public void stampa()
  {
    System.out.println(vracaPodatke());
  }
}
