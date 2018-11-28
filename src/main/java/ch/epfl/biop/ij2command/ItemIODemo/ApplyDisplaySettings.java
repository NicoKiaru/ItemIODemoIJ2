package ch.epfl.biop.ij2command.ItemIODemo;

//import ij.IJ;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
//import ij.ImagePlus;
import org.scijava.plugin.Plugin;


@Plugin(type = Command.class, menuPath = "Plugins>BIOP>Display>Apply Settings")
public class ApplyDisplaySettings implements Command {

    @Parameter
    ImageDisplaySettings ids;

    //@Parameter
    //ImagePlus imp;

    @Override
    public void run() {
        System.out.println(" Applying settings to ImagePlus: ");
        System.out.println(" ids = "+ids);
        //imp.getProcessor().setMinAndMax(ids.minValue,ids.maxValue);
        //IJ.run(ids.lookupTable,"");
    }
}
