
package com.mycompany.latihan.java;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class IfClass {
  public double TotBeli,potongan;

  public void setTotalBeli(double a) {
      TotBeli=a;
  }
  
  
  public double getPotongan(){
      if (TotBeli >= 50000){
          potongan = 0.2 * TotBeli;
      }
      return potongan;
  }
  
public double JumlahBayar ()
  {
    return (TotBeli-potongan);
  }
}
