
package com.mycompany.contratos.beings;

public class Beings {
  private boolean soul = true;
  private String planet;

    public Beings(String planet) {
        this.planet = planet;
    }
  
  public void spleep(){
      System.out.println("Estoy durmiendo");
  }
}
