package Domaci4;

//Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja
//mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili
//oduzme.

public class Putnik extends Covek
{
  private double novac;

  public Putnik(String ime, String prezime, double novac)
  {
    super(ime, prezime);
    this.novac = novac;
  }

  public double getNovac()
  {
    return novac;
  }

  private void setNovac(double novac)
  {
    this.novac = novac;
  }

  public void dodatiNovac(double n)
  {
    setNovac(getNovac() + n);
  }

  public void oduzetiNovac(double n)
  {
    if (getNovac() - n < 0)
    {
      System.out.println("Putnik " + vracaPodatke() + " nema dovoljno novca.");
    }
    else
    {
      setNovac(getNovac() - n);
    }
  }

  @Override
  public void stampa()
  {
    System.out.println("Putnik " + vracaPodatke() + " ima " + getNovac() + " dinara.");
  }
}
