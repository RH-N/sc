package sc.content.blocks;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.MendProjector;
import mindustry.world.blocks.storage.CoreBlock;
import sc.content.SCItems;
import sc.content.SCUnits;

public class SCBlocksEffects {

  public static Block core1;
  public static Block xiuliqi;

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
    SCBlocksEffects.xiuliqi = new MendProjector("xiuliqi") {
      {
        this.size = 1;
        this.health = 200;
        this.reload = 330f;
        this.range = 45f;
        this.healPercent = 6.3f;
        this.itemCapacity = 10;
        this.phaseBoost = 10f;
        this.phaseRangeBoost = 15f;
        this.consumePower(0.48f);
        this.consumeItem(SCItems.cuguijing, 1).optional(true, true);
        this.requirements(Category.effect, ItemStack.with(new Object[] { SCItems.lv, 20, SCItems.li, 30 }));
      }
    };
  }
}
