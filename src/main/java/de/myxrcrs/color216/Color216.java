package de.myxrcrs.color216;

import com.mojang.brigadier.CommandDispatcher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.myxrcrs.color216.init.InitBlocks;
import de.myxrcrs.color216.init.InitBlocks.BlockType;
import net.minecraft.block.Block;
import net.minecraft.command.CommandSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("color216")
public class Color216
{
    public static final String MOD_ID = "color216";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Color216.MOD_ID);

    public Color216() {

        InitBlocks.initialize();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final ItemGroup ITEM_GROUP = new ItemGroup("color216") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(InitBlocks.BLACK_000.get(BlockType.CONCRETE));
        }
    };
}
