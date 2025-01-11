package dalsiarings.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class DRItems {

	//Load Mod Items

	public static Item
	crushedIce, resonantCluster,
	mineralDust, richMineralDust;

	public static void load() {
		crushedIce = new Item("crushed-ice") {{
			color = Color.white;
		}};

		resonantCluster = new Item("resonant-cluster") {{
			color = Color.white;
			charge = 15f;
		}};

		mineralDust = new Item("mineral-dust") {{
			color = Color.white;
		}};

		richMineralDust = new Item("rich-mineral-dust") {{
			color = Color.white;
		}};
	}
}
