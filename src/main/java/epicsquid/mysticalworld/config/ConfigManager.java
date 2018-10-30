package epicsquid.mysticalworld.config;

import epicsquid.mysticalworld.MysticalWorld;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.fml.common.Mod;

@Config(modid = MysticalWorld.MODID)
@Mod.EventBusSubscriber(modid = MysticalWorld.MODID)
public class ConfigManager {

  @Config.Comment(("Mystical world content modules. These modules are applied before any other config options."))
  public static ConfigMysticalWorldModules modules = new ConfigMysticalWorldModules();

  public static class ConfigMysticalWorldModules {

    @Config.Comment(("Enable Roots Content"))
    public boolean rootsModuleEnabled = true;

    @Config.Comment(("Enable Embers Content"))
    public boolean embersModuleEnabled = true;

    @Config.Comment(("Enable Mystical World Content"))
    public boolean mysticalWorldModuleEnabled = true;

    @Config.Comment(("Enable Solar Content"))
    public boolean solarModuleEnabled = true;
  }

  @Config.Comment(("Mystical world metals and their components."))
  public static ConfigMysticalWorldMetals metals = new ConfigMysticalWorldMetals();

  public static class ConfigMysticalWorldMetals {

    @Config.Comment(("Enable Tiny Dusts for Metals"))
    public boolean enableTinyDusts = true;

    @Config.Comment(("Enable Dusts for Metals"))
    public boolean enableDusts = true;

    @Config.Comment(("Enable Ores for Metals"))
    public boolean enableOres = true;

    @Config.Comment(("Enable Blocks for Metals"))
    public boolean enableBlocks = true;

    @Config.Comment(("Enable Ingots for Metals"))
    public boolean enableIngots = true;

    @Config.Comment(("Enable Nuggets for Metals"))
    public boolean enableNuggets = true;

    @Config.Comment(("Enable Copper"))
    public boolean enableCopper = true;

    @Config.Comment(("Enable Tin"))
    public boolean enableTin = true;

    @Config.Comment(("Enable Silver"))
    public boolean enableSilver = true;

    @Config.Comment(("Enable Lead"))
    public boolean enableLead = true;

    @Config.Comment(("Enable Nickel"))
    public boolean enableNickel = true;

    @Config.Comment(("Enable Aluminum"))
    public boolean enableAluminum = true;

    @Config.Comment(("Enable Zinc"))
    public boolean enableZinc = true;

    @Config.Comment(("Enable Invar"))
    public boolean enableInvar = true;

    @Config.Comment(("Enable Electrum"))
    public boolean enableElectrum = true;

    @Config.Comment(("Enable Brass"))
    public boolean enableBrass = true;

    @Config.Comment(("Enable Bronze"))
    public boolean enableBronze = true;

    @Config.Comment(("Enable Dawnstone"))
    public boolean enableDawnstone = true;

    @Config.Comment(("Enable Sooty Iron"))
    public boolean enableSootyIron = true;
  }

  @Config.Comment(("Controls ore generation for Mystical World Ores."))
  public static ConfigMysticalWorldOreGen oreGen = new ConfigMysticalWorldOreGen();

  public static class ConfigMysticalWorldOreGen {

    @Config.Comment(("The amount of copper veins to generate per chunk. Set to 0 to disable."))
    public int copperPerChunk = 6;

    @Config.Comment(("The maximum size of a copper ore vein."))
    public int copperVeinSize = 12;

    @Config.Comment(("The highest a copper ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int copperMaxY = 64;

    @Config.Comment(("The lowest a copper of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int copperMinY = 0;

    @Config.Comment(("The amount of tin veins to generate per chunk. Set to 0 to disable."))
    public int tinPerChunk = 6;

    @Config.Comment(("The maximum size of a tin ore vein."))
    public int tinVeinSize = 8;

    @Config.Comment(("The highest a tin ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int tinMaxY = 48;

    @Config.Comment(("The lowest a tin of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int tinMinY = 0;

    @Config.Comment(("The amount of silver veins to generate per chunk. Set to 0 to disable."))
    public int silverPerChunk = 4;

    @Config.Comment(("The maximum size of a silver ore vein."))
    public int silverVeinSize = 8;

    @Config.Comment(("The highest a silver ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int silverMaxY = 28;

    @Config.Comment(("The lowest a silver of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int silverMinY = 0;

    @Config.Comment(("The amount of lead veins to generate per chunk. Set to 0 to disable."))
    public int leadPerChunk = 4;

    @Config.Comment(("The maximum size of a lead ore vein."))
    public int leadVeinSize = 8;

    @Config.Comment(("The highest a lead ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int leadMaxY = 28;

    @Config.Comment(("The lowest a lead of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int leadMinY = 0;

    @Config.Comment(("The amount of nickel veins to generate per chunk. Set to 0 to disable."))
    public int nickelPerChunk = 4;

    @Config.Comment(("The maximum size of a nickel ore vein."))
    public int nickelVeinSize = 8;

    @Config.Comment(("The highest a nickel ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int nickelMaxY = 24;

    @Config.Comment(("The lowest a nickel of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int nickelMinY = 0;

    @Config.Comment(("The amount of aluminum veins to generate per chunk. Set to 0 to disable."))
    public int aluminumPerChunk = 4;

    @Config.Comment(("The maximum size of a aluminum ore vein."))
    public int aluminumVeinSize = 8;

    @Config.Comment(("The highest a aluminum ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int aluminumMaxY = 58;

    @Config.Comment(("The lowest a aluminum of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int aluminumMinY = 0;

    @Config.Comment(("The amount of zinc veins to generate per chunk. Set to 0 to disable."))
    public int zincPerChunk = 4;

    @Config.Comment(("The maximum size of a zinc ore vein."))
    public int zincVeinSize = 8;

    @Config.Comment(("The highest a zinc ore vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int zincMaxY = 32;

    @Config.Comment(("The lowest a zinc of vein can generate."))
    @RangeInt(min = 0, max = 255)
    public int zincMinY = 0;
  }
}