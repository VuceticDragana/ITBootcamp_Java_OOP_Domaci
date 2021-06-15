package Domaci3_bonus;

//Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
//zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:
//IME_PREZIME: godinaRodjenja

public class Sportista
{
  private String ime;
  private String prezime;
  private int godRodjenja;
  
  public Sportista(String ime, String prezime, int godRodjenja)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
    this.godRodjenja = godRodjenja;
  }

  public String getIme()
  {
    return ime;
  }

  public String getPrezime()
  {
    return prezime;
  }

  public int getGodRodjenja()
  {
    return godRodjenja;
  }
  
  public String vracaPodatke()
  {
    return "Sportista " + getIme().toUpperCase() + "_" + getPrezime().toUpperCase() + ": " 
  + getGodRodjenja() + ". godiste";
  }
  
  public void ispis()
  {
    System.out.println(vracaPodatke());
  }
}
