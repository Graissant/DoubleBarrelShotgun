package com.graissant.datagen;

import com.graissant.doublebarrelshotgun.DoubleBarrelShotgun;
import com.graissant.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DoubleBarrelShotgun.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(
                Registration.DOUBLE_BARREL_SHOTGUN.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DoubleBarrelShotgun.MODID, "item/dbshotgun"));

        singleTexture(
                Registration.BIRDSHOT.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DoubleBarrelShotgun.MODID, "item/birdshot"));
                //ResourceLocation = (modid, path) if no path assume Minecraft

        singleTexture(
                Registration.BUCKSHOT.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DoubleBarrelShotgun.MODID, "item/buckshot"));

        singleTexture(
                Registration.SLUG.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DoubleBarrelShotgun.MODID, "item/slug"));
    }
}
