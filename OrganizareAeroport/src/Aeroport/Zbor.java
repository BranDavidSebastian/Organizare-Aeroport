/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeroport;

/**
 *
 * @author David PC
 */
class Zbor {
 int alt;
 private int azimut;
 int viteza;
 float latitudine;
 float longitudine;
 void RotesteAvion (int unghi) {
 azimut = (azimut + unghi) % 360;

 if (azimut < 0)
 azimut = azimut + 360;
 }
 void SetAzimut (int unghi) {
 azimut= unghi % 360;

 if (azimut < 0)
 azimut = azimut + 360;
 }
 int GetAzimut() {
 return azimut;
 }

 void AfiseazaZbor() {
 System.out.println (alt + " m " + azimut + " grade " + viteza + " km/ora ");
 }
 void Aterizare () {

      while (alt > 0 || viteza > 0){
     if (alt > 0){
    alt = alt - 100;
    }
    
    if (viteza > 0){
    viteza = viteza - 25;
    }
     AfiseazaZbor();
      }
  
    
     
     
 }
}


