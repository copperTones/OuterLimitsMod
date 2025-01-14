package dalsiarings.content;

import arc.graphics.Color;
import mindustry.type.*;

public class DRLiquids{
	public static Liquid redmatter, dormantRedmatter;

	public static void load(){
		redmatter = new Liquid("redmatter", DRColor.redmatter){{
			lightColor = DRColor.redmatter.a(0.3f);
			heatCapacity = 0.2f;
			coolant = false; // maybe? the infrastructure lore-wise would be wild
			viscosity = 0.6f;
			explosiveness = 2.0f;
			incinerable = false;
			//effect = TODO hehe
		}};

		dormantRedmatter = new Liquid("dormant-redmatter", DRColor.dormantRedmatter){{
			heatCapacity = 0.7f;
			viscosity = 0.8f;
			explosiveness = 0f;
			incinerable = false;
			//hidden = true;
		}};
	}
}
