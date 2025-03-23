package sc.content.blocks;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.power.SolarGenerator;
import sc.content.SCItems;
import sc.graphics.SCPal;

public class SCPower {

  public static Block powernode1;
  public static Block sun1;

  public static void load() {

    SCPower.powernode1 = new PowerNode("powernode1") {
      {
        this.size = 1;
        this.health = 80;
        this.laserColor1 = SCPal.light_blue1;
        this.laserColor2 = SCPal.dark_blue1;
        this.maxNodes = 7;
        this.armor = 1;
        this.laserRange = 8;
        this.hasPower = true;
        this.requirements(Category.power, ItemStack.with(new Object[] { SCItems.lv, 2, SCItems.li, 3 }));
      }
    };
    SCPower.sun1 = new SolarGenerator("sun1") {
      {
        this.size = 1;
        this.health = 50;
        this.buildCostMultiplier = 2;
        this.powerProduction = 0.3f;
        this.lightRadius = 2.0f;
        this.requirements(Category.power, ItemStack.with(new Object[] { SCItems.lv, 12, SCItems.li, 12 }));
      }
    };
  }

}
