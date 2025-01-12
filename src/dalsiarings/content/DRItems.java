package dalsiarings.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class DRItems{

	//Load Mod Items

	public static Item
	silver, crushedIce, resonantCluster,
	mineralDust, richMineralDust;

	public static void load(){
		silver = new Item("silver", Color.valueOf("8f98a1")){{
			hardness = 1;
			cost = 1.0f;
		}};

		crushedIce = new Item("crushed-ice", Color.valueOf("8ca9e8")){{
			buildable = false;
		}};

		resonantCluster = new Item("resonant-cluster", Color.valueOf("ffffff")){{
			charge = 15f;
		}};

		mineralDust = new Item("mineral-dust", Color.valueOf("ffffff")){{
			buildable = false;
		}};

		richMineralDust = new Item("rich-mineral-dust", Color.valueOf("ffffff")){{
			buildable = false;
		}};
	}
}
