//import stuff here?
import java.text.DecimalFormat;
//Your code here
public class Program5{
    public static void main(String[] args){
        int royaleMiles = 286;
        int royaleGallons = 9;
        
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        
        int badWagonMiles = 161;
        int badWagonGallons = 11;
        
        double royaleAvg = 0;
        double koopaKingAvg = 0;
        double pipeFrameAvg = 0;
        double badWagonAvg = 0;

        royaleAvg = (double)royaleMiles / royaleGallons;
        koopaKingAvg = (double)koopaKingMiles / koopaKingGallons;
        pipeFrameAvg = (double)pipeFrameMiles / pipeFrameGallons;
        badWagonAvg = (double)badWagonMiles / badWagonGallons;
            
   
        
        
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon");
        System.out.printf("Royale averaged: " + "%,.1f m/g %n", (royaleAvg));
        System.out.printf("Koopa King averaged: " + "%,.1f m/g %n", (koopaKingAvg));
        System.out.printf("Pipe Frame averaged: " + "%,.1f m/g %n", (pipeFrameAvg));
        System.out.printf("Badwagon averaged: " + "%,.1f m/g %n", (badWagonAvg));
        
        
        
    }
}
//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon
Royale averaged: 31.8 m/g 
Koopa King averaged: 10.3 m/g 
Pipe Frame averaged: 20.1 m/g 
Badwagon averaged: 14.6 m/g 

*/
