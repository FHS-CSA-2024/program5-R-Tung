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
        System.out.println("Royale averaged: " + (royaleAvg));
        System.out.println("Koopa King averaged: " + koopaKingAvg);
        System.out.println("Pipe Frame avereraged: " + pipeFrameAvg);
        System.out.println("Badwagon averaged: " + badWagonAvg);
        
        
        
    }
}
