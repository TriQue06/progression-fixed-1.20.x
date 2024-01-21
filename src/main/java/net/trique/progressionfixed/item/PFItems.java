package net.trique.progressionfixed.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.progressionfixed.ProgressionFixed;

public class PFItems {
    //        WOODEN_SWORD = register((String)"wooden_sword", (Item)(new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings())));
    //        WOODEN_SHOVEL = register((String)"wooden_shovel", (Item)(new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings())));
    //        WOODEN_PICKAXE = register((String)"wooden_pickaxe", (Item)(new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings())));
    //        WOODEN_AXE = register((String)"wooden_axe", (Item)(new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings())));
    //        WOODEN_HOE = register((String)"wooden_hoe", (Item)(new HoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings())));

    //        STONE_SWORD = register((String)"stone_sword", (Item)(new SwordItem(ToolMaterials.STONE, 3, -2.4F, new Item.Settings())));
    //        STONE_SHOVEL = register((String)"stone_shovel", (Item)(new ShovelItem(ToolMaterials.STONE, 1.5F, -3.0F, new Item.Settings())));
    //        STONE_PICKAXE = register((String)"stone_pickaxe", (Item)(new PickaxeItem(ToolMaterials.STONE, 1, -2.8F, new Item.Settings())));
    //        STONE_AXE = register((String)"stone_axe", (Item)(new AxeItem(ToolMaterials.STONE, 7.0F, -3.2F, new Item.Settings())));
    //        STONE_HOE = register((String)"stone_hoe", (Item)(new HoeItem(ToolMaterials.STONE, -1, -2.0F, new Item.Settings())));

    //        GOLDEN_SWORD = register((String)"golden_sword", (Item)(new SwordItem(ToolMaterials.GOLD, 3, -2.4F, new Item.Settings())));
    //        GOLDEN_SHOVEL = register((String)"golden_shovel", (Item)(new ShovelItem(ToolMaterials.GOLD, 1.5F, -3.0F, new Item.Settings())));
    //        GOLDEN_PICKAXE = register((String)"golden_pickaxe", (Item)(new PickaxeItem(ToolMaterials.GOLD, 1, -2.8F, new Item.Settings())));
    //        GOLDEN_AXE = register((String)"golden_axe", (Item)(new AxeItem(ToolMaterials.GOLD, 6.0F, -3.0F, new Item.Settings())));
    //        GOLDEN_HOE = register((String)"golden_hoe", (Item)(new HoeItem(ToolMaterials.GOLD, 0, -3.0F, new Item.Settings())));

    //        IRON_SWORD = register((String)"iron_sword", (Item)(new SwordItem(ToolMaterials.IRON, 3, -2.4F, new Item.Settings())));
    //        IRON_SHOVEL = register((String)"iron_shovel", (Item)(new ShovelItem(ToolMaterials.IRON, 1.5F, -3.0F, new Item.Settings())));
    //        IRON_PICKAXE = register((String)"iron_pickaxe", (Item)(new PickaxeItem(ToolMaterials.IRON, 1, -2.8F, new Item.Settings())));
    //        IRON_AXE = register((String)"iron_axe", (Item)(new AxeItem(ToolMaterials.IRON, 6.0F, -3.1F, new Item.Settings())));
    //        IRON_HOE = register((String)"iron_hoe", (Item)(new HoeItem(ToolMaterials.IRON, -2, -1.0F, new Item.Settings())));

    //        DIAMOND_SWORD = register((String)"diamond_sword", (Item)(new SwordItem(ToolMaterials.DIAMOND, 3, -2.4F, new Item.Settings())));
    //        DIAMOND_SHOVEL = register((String)"diamond_shovel", (Item)(new ShovelItem(ToolMaterials.DIAMOND, 1.5F, -3.0F, new Item.Settings())));
    //        DIAMOND_PICKAXE = register((String)"diamond_pickaxe", (Item)(new PickaxeItem(ToolMaterials.DIAMOND, 1, -2.8F, new Item.Settings())));
    //        DIAMOND_AXE = register((String)"diamond_axe", (Item)(new AxeItem(ToolMaterials.DIAMOND, 5.0F, -3.0F, new Item.Settings())));
    //        DIAMOND_HOE = register((String)"diamond_hoe", (Item)(new HoeItem(ToolMaterials.DIAMOND, -3, 0.0F, new Item.Settings())));

    //        NETHERITE_SWORD = register((String)"netherite_sword", (Item)(new SwordItem(ToolMaterials.NETHERITE, 3, -2.4F, (new Item.Settings()).fireproof())));
    //        NETHERITE_SHOVEL = register((String)"netherite_shovel", (Item)(new ShovelItem(ToolMaterials.NETHERITE, 1.5F, -3.0F, (new Item.Settings()).fireproof())));
    //        NETHERITE_PICKAXE = register((String)"netherite_pickaxe", (Item)(new PickaxeItem(ToolMaterials.NETHERITE, 1, -2.8F, (new Item.Settings()).fireproof())));
    //        NETHERITE_AXE = register((String)"netherite_axe", (Item)(new AxeItem(ToolMaterials.NETHERITE, 5.0F, -3.0F, (new Item.Settings()).fireproof())));
    //        NETHERITE_HOE = register((String)"netherite_hoe", (Item)(new HoeItem(ToolMaterials.NETHERITE, -4, 0.0F, (new Item.Settings()).fireproof())));

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
