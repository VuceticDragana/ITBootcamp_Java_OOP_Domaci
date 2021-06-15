package Domaci3_bonus;

import java.util.ArrayList;

//Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
//dohvate, a naziv kluba moze i da se postavi.

//Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
//Samim tim postojace metode koje ce dodavati i uklanjati sportistu.


public class Klub
{
  private String naziv;
  private String sediste;
  private int godOsnivanja;  
  private ArrayList<Sportista> sportisti;  

  public Klub(String naziv, String sediste, int godOsnivanja)
  {
    super();
    this.naziv = naziv;
    this.sediste = sediste;
    this.godOsnivanja = godOsnivanja;
    this.sportisti = new ArrayList<Sportista>();
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
  
  public ArrayList<Sportista> getSportisti()
  {
    return sportisti;
  }

  public void setSportisti(ArrayList<Sportista> sportisti)
  {
    this.sportisti = sportisti;
  }
  
  public void dodavanjeSportiste(Sportista s)
  {
    getSportisti().add(s);
  }
  
  public void uklanjanjeSportiste(String ime)
  {
    for (int i = 0; i < getSportisti().size(); i++)
    {
      if(getSportisti().get(i).getIme().equalsIgnoreCase(ime))
      {
        getSportisti().remove(i);
        break;
      }
    }
  }
  
  public void ispis()
  {
    for (int i = 0; i < getSportisti().size(); i++)
    {     
      getSportisti().get(i).ispis();
    }
  }
}
