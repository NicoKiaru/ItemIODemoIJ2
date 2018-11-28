package ch.epfl.biop.ij2command.ItemIODemo;

import org.scijava.command.Command;
import org.scijava.object.ObjectService;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;


@Plugin(type = Command.class, menuPath = "Plugins>BIOP>Display>Create Settings (Object Service)")
public class CreateDisplaySettingsPutInObjectService implements Command {

    @Parameter
    ObjectService os;

    @Parameter
    int minValue=0;

    @Parameter
    int maxValue=0;

    @Parameter(label="LUT",choices={"Grays","Red","Green","Blue"})
    String lookupTable="Grays";

    @Override
    public void run() {
        ImageDisplaySettings ids = new ImageDisplaySettings();
        ids.minValue=minValue;
        ids.maxValue=maxValue;
        ids.lookupTable=lookupTable;
        os.addObject(ids);
    }
}
