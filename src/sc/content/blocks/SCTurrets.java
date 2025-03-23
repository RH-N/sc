package sc.content.blocks;

import arc.graphics.Color;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.part.RegionPart;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.draw.DrawTurret;
import sc.content.SCFx;
import sc.content.SCItems;

public class SCTurrets {

  public static Block danguanpao;

  public static void load() {
    SCTurrets.danguanpao = new ItemTurret("danguanpao") {
      {
        this.health = 160;
        this.size = 1;
        this.reload = 30.0f;
        this.range = 105.0f;
        this.inaccuracy = 0.0f;
        this.recoil = 1.0f;
        this.rotateSpeed = 5.0f;
        this.maxAmmo = 20;
        this.alwaysUnlocked = false;
        this.ammo(
            SCItems.lv, new BasicBulletType(6.0f, 15.0f) {
              {
                this.width = 5.0f;
                this.height = 8.0f;
                this.lifetime = 25.0f;
                this.reloadMultiplier = 1.5f;
                this.ammoMultiplier = 1.8f;
                this.despawnEffect = this.hitEffect = SCFx.smoke4sides;
              }
            },
            SCItems.li, new BasicBulletType(6.0f, 18.6f) {
              {
                this.width = 5.0f;
                this.height = 8.0f;
                this.lifetime = 25.0f;
                this.reloadMultiplier = 1.0f;
                this.ammoMultiplier = 1.3f;
              }
            });
        this.coolant = consumeCoolant(0.1f);
        this.requirements(Category.turret, ItemStack.with(new Object[] { SCItems.lv, 30 }));
        this.drawer = new DrawTurret() {
          {
            for (int i = 0; i < 2; i++) {
              int f = i;
              this.parts.add(new RegionPart("-" + (f == 0 ? "l" : "r")) {
                {
                  this.moveX = (f == 0 ? -1 : 1) * (0.3f);
                  this.under = false;
                  this.mirror = false;
                  this.moveY = 0.0f;
                  this.heatColor = Color.valueOf("FF7055FF");
                }
              });
            }
          }
        };
      }
    };
  }
}
