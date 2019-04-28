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
public class Zbornou extends ZborComercial
 {
 public static void main (String args[])
 {

ZborComercial Avion1 = new ZborComercial();

Avion1.alt = 20500;
Avion1.viteza = 5000;
 Avion1.NumarZbor = 101;
 Avion1.Nrpasageri = 120;
 
 Avion1.RotesteAvion(180);


ZborComercial Avion2 = new ZborComercial();
Avion2.alt = 10500;
Avion2.viteza = 3000;
Avion2.NumarZbor = 100;
Avion2.Nrpasageri = 100;
Avion2.SetAzimut(30);

ZborComercial Avion3 = new ZborComercial();
Avion3.alt = 15000;
Avion3.viteza = 8000;
Avion3.latitudine = 130;
Avion3.longitudine = 200;
Avion3.NumarZbor = 102;

Avion2.SetAzimut(20);
Avion2.RotesteAvion(180);

Avion1.AfiseazaZbor();
Avion2.AfiseazaZbor();
Avion3.AfiseazaZbor();

/* for (int i = 1;i<100;i++)
{Avion1.SetAzimut(67+i);
Avion1.AfiseazaZbor();
Avion2.RotesteAvion(15*i);
Avion2.AfiseazaZbor();
Avion3.RotesteAvion(15*i);
Avion3.AfiseazaZbor();
}
        */



 Avion2.SetAzimut(15);
 if (Avion2.GetAzimut() == 15){
Avion2.Aterizare();
 }
     
 }
  
 }



