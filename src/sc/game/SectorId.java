package sc.game;

import arc.Core;
import arc.Events;
import static mindustry.Vars.*;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.ui.dialogs.PlanetDialog;

public class SectorId {
  public static boolean shown = true;
  public static PlanetDialog planet = ui.planet;

  public SectorId() {
    Events.on(ClientLoadEvent.class, e -> {
      this.shown = Core.settings.getBool("planet-sector-id", true);
    });
  }
}
