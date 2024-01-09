package net.pitan76.gemhammers;

import ml.pkom.mcpitanlibarch.api.registry.ArchRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class GemHammersMod implements ModInitializer {
    public static String MOD_NAME = "GemHammers";
    public static String MOD_ID = "gemhammers";

    ArchRegistry registry = ArchRegistry.createRegistry(MOD_ID);

    @Override
    public void onInitialize() {
        registry.registerItem(id("ruby_hammer"), () -> GHItems.RUBY_HAMMER);
        registry.registerItem(id("sapphire_hammer"), () -> GHItems.SAPPHIRE_HAMMER);
        registry.registerItem(id("peridot_hammer"), () -> GHItems.PERIDOT_HAMMER);
        registry.registerItem(id("bronze_hammer"), () -> GHItems.BRONZE_HAMMER);

        registry.registerItem(id("ruby_excavator"), () -> GHItems.RUBY_EXCAVATOR);
        registry.registerItem(id("sapphire_excavator"), () -> GHItems.SAPPHIRE_EXCAVATOR);
        registry.registerItem(id("peridot_excavator"), () -> GHItems.PERIDOT_EXCAVATOR);
        registry.registerItem(id("bronze_excavator"), () -> GHItems.BRONZE_EXCAVATOR);

        registry.allRegister();
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }
}
