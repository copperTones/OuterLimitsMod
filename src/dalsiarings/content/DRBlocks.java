package dalsiarings.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import mindustry.content.*;

public class DRBlocks{

	public static Block
	// factories
	iceRefreezer,
	particleCollider, redmatterEncapsulator;

	public static void load(){
		iceRefreezer = new GenericCrafter("ice-refreezer"){{
			requirements(Category.crafting, with());
			size = 2;
			rotate = false;
			envEnabled = Env.any;
			//drawer = new DrawDefault();
			craftTime = 45;

			hasItems = true;
			consumeItem(DRItems.crushedIce, 2);
			outputItem = new ItemStack(DRItems.ice9c, 1);
		}};

		particleCollider = new DRCrafter("particle-collider"){{
			requirements(Category.crafting, with());
			size = 6;
			envEnabled = Env.any;
			//drawer = new DrawDefault();
			liquidCapacity = 15f;
			craftTime = 300;
			lightLiquid = DRLiquids.redmatter;

			consumePower(12f);
			hasItems = true;
			consumeItem(DRItems.silver);
			outputsLiquid = true;
			outputLiquid = new LiquidStack(DRLiquids.redmatter, 0.5f / 60f);
		}};

		redmatterEncapsulator = new DRCrafter("redmatter-encapsulator"){{
			requirements(Category.crafting, with());
			size = 3;
			envEnabled = Env.any;
			//drawer = new DrawDefault();
			liquidCapacity = 24f;
			craftTime = 90;
			lightLiquid = DRLiquids.redmatter;

			consumePower(1.5f);
			hasItems = true;
			consumeItems(with(DRItems.silver, 3, Items.lead, 1));
			hasLiquids = true;
			consumeLiquid(DRLiquids.redmatter, 4f / craftTime); // 2.33u/s, 4u/i
			outputItem = new ItemStack(DRItems.redmatterCell, 1);
		}};
	}

	public static class DRCrafter extends GenericCrafter{
		public DRCrafter(String name){
			super(name);
			rotate = false;
			hasPower = true;
			conductivePower = true;
		}
	}
}
