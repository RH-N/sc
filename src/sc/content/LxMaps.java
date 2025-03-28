package sc.content;

import mindustry.type.SectorPreset;

public class LxMaps {

  public static SectorPreset jianglindian;

  public static void load() {
    jianglindian = new SectorPreset("jianglindian", SCPlanets.lx, 1) {
      {
        this.alwaysUnlocked = true;
        this.difficulty = 1;
        this.addStartingItems = true;
        this.captureWave = 25;
        this.overrideLaunchDefaults = true;
        this.noLighting = true;
        this.startWaveTimeMultiplier = 3f;
      }
    };
  }
}
