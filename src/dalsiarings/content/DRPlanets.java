package dalsiarings.content;

import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;

public class DRPlanets{
	public static Planet
	moria,
	dalsia, dalsiaRings;

	public static void load(){
		moria = new Planet("moria", null, 3.2f){{
			bloom = true;
			accessible = false;

			// TODO? make this darker
			meshLoader = () -> new SunMesh(
				this, 3,
				5, 0.2, 0.8,
				1.2, 1, 1.1f,
				Color.valueOf("ff7e2a"),
				Color.valueOf("e65213"),
				Color.valueOf("d32106"),
				Color.valueOf("9e0f05")
			);
		}};

		dalsia = new Planet("dalsia", moria, 2.5f){{
			// TODO de-tantros this
			generator = new ErekirPlanetGenerator();
			accessible = false;
			meshLoader = () -> new HexMesh(this, 4);
			cloudMeshLoader = () -> new MultiMesh(
				new HexSkyMesh(this, 2, 0.15f, 0.14f, 5, Color.valueOf("eba768").a(0.75f), 2, 0.42f, 1f, 0.43f),
				new HexSkyMesh(this, 3, 0.6f, 0.15f, 5, Color.valueOf("eea293").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
			);
			atmosphereColor = Color.valueOf("3db899");
			iconColor = Color.valueOf("597be3");
			atmosphereRadIn = -0.01f;
			atmosphereRadOut = 0.3f;
		}};

		dalsiaRings = new Planet("dalsia-rings", dalsia, 2f, 4){{
			// TODO this is just an erikir clone
			generator = new ErekirPlanetGenerator();
			meshLoader = () -> new HexMesh(this, 5);
			cloudMeshLoader = () -> new MultiMesh(
				new HexSkyMesh(this, 2, 0.15f, 0.14f, 5, Color.valueOf("eba768").a(0.75f), 2, 0.42f, 1f, 0.43f),
				new HexSkyMesh(this, 3, 0.6f, 0.15f, 5, Color.valueOf("eea293").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
			);
			alwaysUnlocked = true;
			landCloudColor = Color.valueOf("ed6542");
			atmosphereColor = Color.valueOf("f07218");
			defaultEnv = Env.scorching | Env.terrestrial;
			startSector = 10;
			atmosphereRadIn = 0.02f;
			atmosphereRadOut = 0.3f;
			tidalLock = true;
			orbitSpacing = 2f;
			totalRadius += 2.6f;
			lightSrcTo = 0.5f;
			lightDstFrom = 0.2f;
			clearSectorOnLose = true;
			//defaultCore = Blocks.coreBastion;
			iconColor = Color.valueOf("ff9266");
			enemyBuildSpeedMultiplier = 0.4f;

			allowLaunchToNumbered = false;

			updateLighting = false;

			defaultAttributes.set(Attribute.heat, 0.8f);

			ruleSetter = r -> {
				r.waveTeam = Team.malis;
				r.placeRangeCheck = false;
				r.showSpawns = true;
				r.fog = true;
				r.staticFog = true;
				r.lighting = false;
				r.coreDestroyClear = true;
				r.onlyDepositCore = true;
			};
			//campaignRuleDefaults.fog = true;
			//campaignRuleDefaults.showSpawns = true;
		}};
	}
}
