package sc.content;

import arc.util.Log;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class SCOre {
  public static Block oreLv;
  public static Block oreLi;
  public static Block oreTandanzhi;
  public static Block oreFeizha;
  public static Block oreXi;
  public static Block oreJin;
  public static Block oreYou;
  public static Block oreChijin;
  public static Block oreGutaineng;

  public static void load() {
    oreLv = new OreBlock("ore-lv", SCItems.lv) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 23.47619f;
      }
    };
    Log.info("loaded orelv");
    oreLi = new OreBlock("ore-li", SCItems.li) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 23.47619f;
      }
    };
    Log.info("loaded oreli");
    oreTandanzhi = new OreBlock("ore-tandanzhi", SCItems.tandanzhi) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 24.655f;
      }
    };
    Log.info("loaded ore-tandanzhi");
    oreFeizha = new OreBlock("ore-feizha", SCItems.feizha) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 27.655f;
      }
    };
    Log.info("loaded ore-feizha");

    oreXi = new OreBlock("ore-xi", SCItems.xi) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 24.655f;
      }
    };

    Log.info("loaded orexi");
    oreJin = new OreBlock("ore-jin", SCItems.jin) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 20.655f;
      }
    };
    Log.info("loaded orejin");
    oreYou = new OreBlock("ore-you", SCItems.you) {
      {
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 20.655f;
      }
    };
    Log.info("loaded oreyou");
    oreChijin = new OreBlock("ore-chijin", SCItems.chijin) {
      {
        oreDefault = true;
        oreThreshold = 0.86f;
        oreScale = 12.655f;
      }
    };
    Log.info("loaded ore-chijin");
    oreGutaineng = new OreBlock("ore-gutaineng", SCItems.gutaineng) {
      {
        variants = 1;
        oreDefault = true;
        oreThreshold = 0.81f;
        oreScale = 12.655f;
      }
    };
    Log.info("loaded ore-gutaineng");
  }
}
