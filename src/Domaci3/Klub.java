package Domaci3;

//Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
//dohvate, a naziv kluba moze i da se postavi.

public class Klub
{
  private String naziv;
  private String sediste;
  private int godOsnivanja;
  private Sportista sportista;  
  
  public Klub(String naziv, String sediste, int godOsnivanja, Sportista sportista)
  {
    super();
    this.naziv = naziv;
    this.sediste = sediste;
    this.godOsnivanja = godOsnivanja;
    this.sportista = sportista;    
  }    

  public String getNaziv()
  {
    return naziv;
  }

  public void setNaziv(String naziv)
  {
    this.naziv = naziv;
  }

  public String getSediste()
  {
    return sediste;
  }

  public int getGodOsnivanja()
  {
    return godOsnivanja;
  }

  public Sportista getSportista()
  {
    return sportista;
  }  

  public void ispis()
  {
    System.out.println(getSportista().vracaPodatke() + " igra za " + getNaziv() + 
        " iz " + getSediste() + " koji je osnovan " + getGodOsnivanja());
  }  
  
}
