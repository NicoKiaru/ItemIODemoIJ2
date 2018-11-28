package ch.epfl.biop.ij2command.ItemIODemo;

public class ImageDisplaySettings {
    String lookupTable="grays";
    int minValue=0;
    int maxValue=255;

    public String toString() {
        return lookupTable+"["+minValue+"-"+maxValue+"]";
    }
}
