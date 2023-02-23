package src;

import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.item.GroundItems;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Sleep;
import org.dreambot.api.wrappers.items.GroundItem;

// Script manifest is required to provide details about your script.
@ScriptManifest(name = "Name-Based Item Pickup", description = "Pick up coins by name.", author = "Harminder Singh Nijjar",  version = 0.1,
        category = Category.MISC, image = "")

public class PickUpItemByName extends AbstractScript {

    @Override
    public int onLoop() {

        GroundItem item = GroundItems.closest("Coins");

        if (item != null) {
            item.interact("Take");
            Sleep.sleep(2000, 3000);
        }
        return 0;
    }
}
