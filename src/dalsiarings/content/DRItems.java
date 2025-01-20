package dalsiarings.content;

import arc.graphics.Color;
import mindustry.type.*;

public class DRItems{

	public static Item
	silver, crushedIce, mineralDust, richMineralDust,
	ice9c, resonantCluster, duriate, redmatterCell;

	public static void load(){
		silver = new Item("silver", Color.valueOf("8f98a1")){{
			hardness = 1;
			cost = 1.0f;
		}};

		crushedIce = new Item("crushed-ice", Color.valueOf("8ca9e8")){{
			hardness = 1;
			buildable = false;
		}};

		ice9c = new Item("ice-9c", Color.valueOf("d1efff")){{
		}};

		resonantCluster = new Item("resonant-cluster", Color.valueOf("c3e46a")){{
			charge = 15f;
		}};

		mineralDust = new Item("mineral-dust", Color.valueOf("ffffff")){{
			buildable = false;
		}};

		richMineralDust = new Item("rich-mineral-dust", Color.valueOf("ffffff")){{
			buildable = false;
		}};

		duriate = new Item("duriate", Color.valueOf("d1efff")){{
		}};


		redmatterCell = new Item("redmatter-cell", DRColor.redmatterDark){{
			explosiveness = 0.2f;
			charge = 0.8f;
		}};
	}
}
