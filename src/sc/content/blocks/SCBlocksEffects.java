package sc.content.blocks;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.storage.CoreBlock;
import sc.content.SCItems;
import sc.content.SCUnits;

public class SCBlocksEffects {

  public static Block core1;

  public static void load() {
    SCBlocksEffects.core1 = new CoreBlock("core1") {
      {
        this.health = 3000;
        this.size = 2;
        this.itemCapacity = 5000;
        this.armor = 3;
        this.alwaysUnlocked = true;
        this.unitCapModifier = 10;
        this.unitType = SCUnits.tansuozhe;
        this.requirements(Category.effect, ItemStack.with(new Object[] { SCItems.lv, 800, SCItems.li, 800 }));
      }
    };
  }
}
