package outerlimits;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import outerlimits.content.*;

public class OuterLimits extends Mod{

	public OuterLimits(){
		Log.info("Loaded ExampleJavaMod constructor.");
	}

	@Override
	public void loadContent(){
		OLItems.load();
	}

}
