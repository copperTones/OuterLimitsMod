package dalsiarings.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class DRBlocks{

	public static Block
	// liquid
	fluiduct, fluiductJunction, fluiductBridge, fluiductRouter,

	// factories
	iceRefreezer,
	particleCollider, redmatterEncapsulator;

	public static void load(){
		// liquid
		fluiduct = new ArmoredConduit("fluiduct"){{
			requirements(Category.liquid, with(Items.lead, 1, DRItems.ice9c, 1));
			botColor = Color.valueOf("1f2e2a");
			leaks = true;
			liquidCapacity = 15f;
			liquidPressure = 1.03f;
			health = 250;
			researchCostMultiplier = 3;
			solid = false;
			underBullets = true;
		}};

		fluiductRouter = new LiquidRouter("fluiduct-router"){{
			requirements(Category.liquid, with(Items.lead, 2, DRItems.ice9c, 4));
			liquidCapacity = 30f;
			liquidPadding = 3f/4f;
			solid = false;
			underBullets = true;
		}};

		fluiductJunction = new LiquidJunction("fluiduct-junction"){{
			requirements(Category.liquid, with(Items.lead, 4, DRItems.ice9c, 2));
			solid = false;
			underBullets = true;
		}};

		fluiductBridge = new DirectionLiquidBridge("fluiduct-bridge"){{
			requirements(Category.liquid, with(Items.lead, 4, DRItems.ice9c, 10));
			range = 4;
			solid = false;
			underBullets = true;
		}};

		((Conduit)fluiduct).junctionReplacement = fluiductJunction;
		((Conduit)fluiduct).rotBridgeReplacement = fluiductBridge;

		// factories
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
