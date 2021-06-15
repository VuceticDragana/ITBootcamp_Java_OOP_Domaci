package Domaci4;

import java.util.ArrayList;

//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena
//karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.

public class Autobus
{
  private String naziv;
  private Vozac vozac;
  private double cenaKarte;
  private ArrayList<Putnik> putnici;

  public Autobus(String naziv, Vozac vozac, double cenaKarte)
  {
    super();
    this.naziv = naziv;
    this.vozac = vozac;
    this.cenaKarte = cenaKarte;
    this.putnici = new ArrayList<Putnik>();
  }

  public Vozac getVozac()
  {
    return vozac;
  }

  public void setVozac(Vozac vozac)
  {
    this.vozac = vozac;
  }

  public ArrayList<Putnik> getPutnici()
  {
    return putnici;
  }

  public void setPutnici(ArrayList<Putnik> putnici)
  {
    this.putnici = putnici;
  }

  public String getNaziv()
  {
    return naziv;
  }

  public double getCenaKarte()
  {
    return cenaKarte;
  }

  public void dodatiPutnika(Putnik p)
  {
    getPutnici().add(p);
  }

  public void uklonitiPutnika(String ime)
  {
    for (int i = 0; i < getPutnici().size(); i++)
    {
      if (getPutnici().get(i).getIme().equalsIgnoreCase(ime))
      {
        getPutnici().remove(i);
        break;
      }
    }
  }

  public void stampa()
  {
    String vozac;
    if (getVozac() == null)
    {
      vozac = " nema vozaca";
    }
    else
    {
      vozac = " vozi " + getVozac().vracaPodatke();
    }    
    
      System.out.println("Autobus " + getNaziv() + vozac + ", a cena karte je "
          + getCenaKarte() + " dinara.");    
    

    for (int i = 0; i < getPutnici().size(); i++)
    {
      getPutnici().get(i).stampa();
    }
  }

  public void dodatiVozaca(Vozac v)
  {
    setVozac(v);
  }

  public void uklonitiVozaca()
  {
    setVozac(null);
  }
}
