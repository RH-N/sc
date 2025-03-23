package sc;

import sc.content.SCUnits;
import sc.content.Test;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;
import sc.content.SCItems;
import sc.content.SCLiquids;
import sc.content.SCLoadouts;
import sc.content.SCOre;
import sc.content.SCPlanets;
import sc.content.SCStatusEffects;

import javax.swing.event.HyperlinkEvent.EventType;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import sc.content.SCBlocks;
import mindustry.core.Renderer;
import sc.content.LxTechTree;
import mindustry.Vars;

public class SCMain extends Mod {
  public static BaseDialog welcomeDialog;
  public static final String scqq = "http://qm.qq.com/cgi-bin/qm/qr?_wv=1027&k=Rrju8RLWbsJstJ3rcJxWyrtop4u7uRb9&authKey=gdngZkPeYxZPhYTmjQUTjPos%2FJKckD02YSFnYLmdVojPZIzZw1T%2FbtubSoyuw2LA&noverify=0&group_code=756820891";

  public SCMain() {
    Log.info("Loaded Synthetic Crystal Mod Constructor.");
    Vars.renderer.minZoom = 0.1f;
    Vars.renderer.maxZoom = 30.0f;
    Events.on(mindustry.game.EventType.ClientLoadEvent.class, (e) -> {
      welcomeDialog = new BaseDialog(Core.bundle.get("sc.welcome"));
      welcomeDialog.cont.image(Core.atlas.find("sc-crystal-core")).pad(3.0f).row();
      welcomeDialog.cont.button("退出", welcomeDialog::hide).size(100.0f, 50.0f);
      welcomeDialog.show();
      Log.info("loaded menu");
      welcomeDialog.cont.pane((c) -> {
        c.button(Core.bundle.get("sc.qq"), () -> {
          if (!Core.app.openURI(scqq)) {
            Vars.ui.showErrorMessage("@linkfail");
            Core.app.setClipboardText(scqq);
          }
        }).grow().left().size(120.0f, 50.0f);
      });

    });

  }

  @Override
  public void loadContent() {
    Log.info("Start to Load Contents");
    SCStatusEffects.load();
    SCLiquids.load();
    Log.info("loaded liquids");
    SCItems.load();
    Log.info("loaded items");
    SCOre.load();
    Log.info("loaded ores");
    SCUnits.load();
    SCBlocks.load();
    Log.info("loaded blocks");
    SCLoadouts.load();
    SCPlanets.load();
    Test.load();
    LxTechTree.load();
  }
}
