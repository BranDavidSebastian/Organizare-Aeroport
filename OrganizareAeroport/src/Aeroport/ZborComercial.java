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
class ZborComercial extends Zbor {
//noi atribute specifice clasei ZborComercial
 int NumarZbor;
 int Nrpasageri;
    int altitudine;
 //se reface rutina de afisare a Zborului
// utilizând definiţia anterioară
void AfiseazaZbor() {
 System.out.print(" Zborul " + NumarZbor + " ");
 super.AfiseazaZbor();
 }
}
