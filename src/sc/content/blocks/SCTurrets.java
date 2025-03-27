package sc.content.blocks;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.part.RegionPart;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.BaseTurret;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.draw.DrawTurret;
import sc.content.SCFx;
import sc.content.SCItems;

public class SCTurrets {

  public static Block danguanpao;
  public static Block zhentian;

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
    BulletType zhentianbullet = new BasicBulletType(6, 6f) {
      {
        this.reloadMultiplier = 1.5f;
        this.knockback = 0.2f;
        this.lifetime = 32f;
        this.width = 6f;
        this.height = 10f;
        this.splashDamage = 30f;
        this.splashDamageRadius = 15;
      }
    };

    SCTurrets.zhentian = new ItemTurret("zhentian") {
      {
        this.size = 2;
        this.health = 550;
        this.ammoPerShot = 1;
        this.range = 210f;
        this.reload = 50f;
        this.inaccuracy = 5f;
        this.ammoPerShot = 1;
        this.ammoUseEffect = Fx.casing1;
        this.rotateSpeed = 2f;
        this.maxAmmo = 15;
        this.targetAir = true;
        this.targetGround = false;
        this.coolantMultiplier = 2;
        this.heatColor = Color.valueOf("#FF0000");
        this.coolant = consumeCoolant(0.2f);
        this.requirements(Category.turret, ItemStack.with(new Object[] { SCItems.lv, 120, SCItems.li, 85 }));
        this.ammo(SCItems.lv, zhentianbullet, SCItems.li, zhentianbullet, SCItems.cuguijing,
            new BasicBulletType(6, 6f) {
              {
                this.reloadMultiplier = 1.5f;
                this.knockback = 0.2f;
                this.lifetime = 32f;
                this.width = 6f;
                this.height = 10f;
                this.splashDamage = 47f;
                this.splashDamageRadius = 18;
                this.fragBullets = 4;
                this.fragBullet = new BasicBulletType(2f, 16f) {
                  {
                    this.lifetime = 30;
                  }
                };
              }
            },
            SCItems.chunguijing,
            new BasicBulletType(6, 16f) {
              {
                this.reloadMultiplier = 1.5f;
                this.knockback = 0.2f;
                this.lifetime = 32f;
                this.width = 6f;
                this.height = 10f;
                this.splashDamage = 59f;
                this.splashDamageRadius = 25f;
                this.fragBullets = 3;
                this.fragBullet = new BasicBulletType(2f, 16f) {
                  {
                    this.lifetime = 30;
                    this.fragBullets = 3;
                    this.fragBullet = new BasicBulletType(2f, 16f) {
                      {
                        this.lifetime = 30;
                        this.splashDamage = 35f;
                        this.splashDamageRadius = 25f;
                      }
                    };
                  }
                };
              }
            });
      }
    };
  }
}
