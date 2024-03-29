package net.pitan76.gemhammers.item;

import draylar.magna.item.HammerItem;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import net.minecraft.item.ToolMaterial;

public class GemHammerItem extends HammerItem {
    public GemHammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, int breakRadius) {
        super(toolMaterial, attackDamage, attackSpeed, settings, breakRadius);
    }

    public GemHammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public GemHammerItem(ToolMaterial toolMaterial, CompatibleItemSettings settings) {
        this(toolMaterial, (int) 2.5F, -3.0F, settings.build());
    }
}
