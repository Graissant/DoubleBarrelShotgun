package com.graissant.setup;

import com.graissant.items.Birdshot;
import com.graissant.items.Buckshot;
import com.graissant.items.DBShotgun;
import com.graissant.items.Slug;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.graissant.doublebarrelshotgun.DoubleBarrelShotgun.MODID;


public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> DOUBLE_BARREL_SHOTGUN = ITEMS.register("doublebarrelshotgun", () -> new DBShotgun(new Item.Properties()));
    public static final RegistryObject<Item> BIRDSHOT = ITEMS.register("birdshot", () -> new Birdshot(new Item.Properties()));
    public static final RegistryObject<Item> BUCKSHOT = ITEMS.register("buckshot", () -> new Buckshot(new Item.Properties()));
    public static final RegistryObject<Item> SLUG = ITEMS.register("slug", () -> new Slug(new Item.Properties()));
}
