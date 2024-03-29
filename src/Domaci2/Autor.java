package Domaci2;

// Kreirati klasu Autor koja ima
// -ime i prezime
// -konstuktore koje mislite da su vam potrebni
// -gettere i settere za atribute
// -metodu print koja stampa u formatu:
// (ime autora) (prezime autora)

public class Autor
{
  private String ime;
  private String prezime;   

  public Autor(String ime, String prezime)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
  }

  public String getIme()
  {
    return ime;
  }

  public void setIme(String ime)
  {
    this.ime = ime;
  }

  public String getPrezime()
  {
    return prezime;
  }

  public void setPrezime(String prezime)
  {
    this.prezime = prezime;
  }
  
  public void stampajAutora()
  {
    System.out.println(vracaImePrezime());
    
  }
  
  public String vracaImePrezime()
  {
    return getIme() + " " + getPrezime();
  }
}
