package dalsiarings;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.mod.*;
import dalsiarings.content.*;

public class DalsiaRings extends Mod{

	public DalsiaRings(){
		Log.info("Loaded ExampleJavaMod constructor.");
	}

	@Override
	public void loadContent(){
		DRItems.load();
		DRLiquids.load();
		DRBlocks.load();
		DRPlanets.load();
	}

}
