package Domaci4;

//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

public class Vozac extends Covek
{
  private String zvanje;

  public Vozac(String ime, String prezime)
  {
    super(ime, prezime);
    this.zvanje = "sofer";
  }

  public String getZvanje()
  {
    return zvanje;
  }    

  @Override
  public void stampa()
  {
    System.out.println("Vozac " + vracaPodatke());
  }

}
