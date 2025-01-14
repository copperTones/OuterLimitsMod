package dalsiarings;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import dalsiarings.content.*;

public class DalsiaRings extends Mod{

	public DalsiaRings(){
		Log.info("Loaded ExampleJavaMod constructor.");
	}

	@Override
	public void loadContent(){
		DRItems.load();
		DRLiquids.load();
		DRPlanets.load();
	}

}
