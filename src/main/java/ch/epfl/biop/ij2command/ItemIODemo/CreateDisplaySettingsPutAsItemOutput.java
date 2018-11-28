package ch.epfl.biop.ij2command.ItemIODemo;

import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;


@Plugin(type = Command.class, menuPath = "Plugins>BIOP>Display>Create Settings (Item Output)")
public class CreateDisplaySettingsPutAsItemOutput implements Command {

    @Parameter(type= ItemIO.OUTPUT)
    ImageDisplaySettings ids;

    @Parameter
    int minValue=0;

    @Parameter
    int maxValue=0;

    @Parameter(label="LUT",choices={"Grays","Red","Green","Blue"})
    String lookupTable="Grays";

    @Override
    public void run() {
        ids = new ImageDisplaySettings();
        ids.minValue=minValue;
        ids.maxValue=maxValue;
        ids.lookupTable=lookupTable;
    }
}
