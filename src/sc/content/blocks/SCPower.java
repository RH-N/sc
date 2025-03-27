package sc.content.blocks;

import arc.graphics.Color;
import arc.graphics.Colors;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.power.SolarGenerator;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawMulti;
import mindustry.world.draw.DrawPower;
import mindustry.world.draw.DrawRegion;
import sc.content.SCItems;
import sc.graphics.SCPal;

public class SCPower {

  public static Block powernode1;
  public static Block sun1;
  public static Block battery1;

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
    SCPower.battery1 = new Battery("battery1") {
      {
        this.size = 1;
        this.health = 60;
        this.drawer = new DrawMulti(new DrawDefault(), new DrawPower() {
          {
            this.emptyLightColor = Color.valueOf("#F8C266");
            this.fullLightColor = Color.valueOf("#FFFFFF");
          }
        }, new DrawRegion("-top"));
        this.consumePowerBuffered(3000f);
        this.requirements(Category.power, ItemStack.with(new Object[] { SCItems.lv, 8, SCItems.li, 20 }));
      }
    };
  }

}
