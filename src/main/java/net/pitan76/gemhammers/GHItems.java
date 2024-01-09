package net.pitan76.gemhammers;

import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import ml.pkom.mcpitanlibarch.api.item.DefaultItemGroups;
import net.pitan76.gemhammers.item.GemExcavatorItem;
import net.pitan76.gemhammers.item.GemHammerItem;

public class GHItems {
    public static GemHammerItem RUBY_HAMMER = new GemHammerItem(GemMaterials.RUBY, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemHammerItem SAPPHIRE_HAMMER = new GemHammerItem(GemMaterials.SAPPHIRE, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemHammerItem PERIDOT_HAMMER = new GemHammerItem(GemMaterials.PERIDOT, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemHammerItem BRONZE_HAMMER = new GemHammerItem(GemMaterials.BRONZE, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));



    public static GemExcavatorItem RUBY_EXCAVATOR = new GemExcavatorItem(GemMaterials.RUBY, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemExcavatorItem SAPPHIRE_EXCAVATOR = new GemExcavatorItem(GemMaterials.SAPPHIRE, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemExcavatorItem PERIDOT_EXCAVATOR = new GemExcavatorItem(GemMaterials.PERIDOT, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
    public static GemExcavatorItem BRONZE_EXCAVATOR = new GemExcavatorItem(GemMaterials.BRONZE, new CompatibleItemSettings().addGroup(DefaultItemGroups.TOOLS));
}
