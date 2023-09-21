package team.lodestar.lodestone.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class LodestoneBlockTags {

    public static final TagKey<Block> TERRACOTTA = forgeTag("terracotta");

    public static TagKey<Block> modTag(String path) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(path));
    }

    public static TagKey<Block> forgeTag(String name) {
        return BlockTags.create(new ResourceLocation("forge", name));
    }
}