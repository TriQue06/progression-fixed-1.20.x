package net.trique.progressionfixed.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.progressionfixed.ProgressionFixed;

public class PFItems {
    public static final Item POWER_ESSENCE = registerItem("power_essence",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(PFToolMaterials.COPPER, 3, -2.4f,(new FabricItemSettings())));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(PFToolMaterials.COPPER, 1.5F, -3.0f,(new FabricItemSettings())));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(PFToolMaterials.COPPER, 1, -2.8f,(new FabricItemSettings())));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(PFToolMaterials.COPPER, 6.0F, -3.0F,(new FabricItemSettings())));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(PFToolMaterials.COPPER, -3, 0.0F,(new FabricItemSettings())));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProgressionFixed.MOD_ID, name), item);
    }

    public static void registerWardenItems() {
        ProgressionFixed.LOGGER.info("Registering Progression Fixed Items for " + ProgressionFixed.MOD_ID);
    }
}
