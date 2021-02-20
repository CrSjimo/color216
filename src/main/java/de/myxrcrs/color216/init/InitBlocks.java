package de.myxrcrs.color216.init;

import java.util.EnumMap;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import de.myxrcrs.color216.Color216;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

public enum InitBlocks {

    BLACK_000("black_000"),
    BLUE_003("blue_003"),
    BLUE_006("blue_006"),
    BLUE_009("blue_009"),
    BLUE_00C("blue_00c"),
    BLUE_00F("blue_00f"),
    BLUE_030("blue_030"),
    BLUE_033("blue_033"),
    BLUE_036("blue_036"),
    BLUE_039("blue_039"),
    BLUE_03C("blue_03c"),
    BLUE_03F("blue_03f"),
    GREEN_060("green_060"),
    GREEN_063("green_063"),
    BLUE_066("blue_066"),
    BLUE_069("blue_069"),
    BLUE_06C("blue_06c"),
    BLUE_06F("blue_06f"),
    GREEN_090("green_090"),
    GREEN_093("green_093"),
    GREEN_096("green_096"),
    GREEN_099("green_099"),
    BLUE_09C("blue_09c"),
    BLUE_09F("blue_09f"),
    GREEN_0C0("green_0c0"),
    GREEN_0C3("green_0c3"),
    GREEN_0C6("green_0c6"),
    GREEN_0C9("green_0c9"),
    GREEN_0CC("green_0cc"),
    BLUE_0CF("blue_0cf"),
    GREEN_0F0("green_0f0"),
    GREEN_0F3("green_0f3"),
    GREEN_0F6("green_0f6"),
    GREEN_0F9("green_0f9"),
    GREEN_0FC("green_0fc"),
    GREEN_0FF("green_0ff"),
    PINK_300("pink_300"),
    BLUE_303("blue_303"),
    BLUE_306("blue_306"),
    BLUE_309("blue_309"),
    BLUE_30C("blue_30c"),
    BLUE_30F("blue_30f"),
    RED_330("red_330"),
    GRAY_333("gray_333"),
    BLUE_336("blue_336"),
    BLUE_339("blue_339"),
    BLUE_33C("blue_33c"),
    BLUE_33F("blue_33f"),
    GREEN_360("green_360"),
    GREEN_363("green_363"),
    BLUE_366("blue_366"),
    BLUE_369("blue_369"),
    BLUE_36C("blue_36c"),
    BLUE_36F("blue_36f"),
    GREEN_390("green_390"),
    GREEN_393("green_393"),
    GREEN_396("green_396"),
    PURPLE_399("purple_399"),
    BLUE_39C("blue_39c"),
    BLUE_39F("blue_39f"),
    GREEN_3C0("green_3c0"),
    GREEN_3C3("green_3c3"),
    GREEN_3C6("green_3c6"),
    GREEN_3C9("green_3c9"),
    GREEN_3CC("green_3cc"),
    BLUE_3CF("blue_3cf"),
    GREEN_3F0("green_3f0"),
    GREEN_3F3("green_3f3"),
    GREEN_3F6("green_3f6"),
    GREEN_3F9("green_3f9"),
    GREEN_3FC("green_3fc"),
    GREEN_3FF("green_3ff"),
    PINK_600("pink_600"),
    PINK_603("pink_603"),
    BLUE_606("blue_606"),
    BLUE_609("blue_609"),
    BLUE_60C("blue_60c"),
    BLUE_60F("blue_60f"),
    RED_630("red_630"),
    PINK_633("pink_633"),
    PINK_636("pink_636"),
    BLUE_639("blue_639"),
    BLUE_63C("blue_63c"),
    BLUE_63F("blue_63f"),
    ORANGE_660("orange_660"),
    ORANGE_663("orange_663"),
    GRAY_666("gray_666"),
    BLUE_669("blue_669"),
    BLUE_66C("blue_66c"),
    BLUE_66F("blue_66f"),
    GREEN_690("green_690"),
    GREEN_693("green_693"),
    GREEN_696("green_696"),
    PURPLE_699("purple_699"),
    BLUE_69C("blue_69c"),
    PURPLE_69F("purple_69f"),
    GREEN_6C0("green_6c0"),
    GREEN_6C3("green_6c3"),
    GREEN_6C6("green_6c6"),
    GREEN_6C9("green_6c9"),
    GREEN_6CC("green_6cc"),
    BLUE_6CF("blue_6cf"),
    GREEN_6F0("green_6f0"),
    GREEN_6F3("green_6f3"),
    GREEN_6F6("green_6f6"),
    GREEN_6F9("green_6f9"),
    GREEN_6FC("green_6fc"),
    GREEN_6FF("green_6ff"),
    RED_900("red_900"),
    PINK_903("pink_903"),
    PINK_906("pink_906"),
    BLUE_909("blue_909"),
    BLUE_90C("blue_90c"),
    BLUE_90F("blue_90f"),
    RED_930("red_930"),
    PINK_933("pink_933"),
    PINK_936("pink_936"),
    PINK_939("pink_939"),
    BLUE_93C("blue_93c"),
    BLUE_93F("blue_93f"),
    ORANGE_960("orange_960"),
    ORANGE_963("orange_963"),
    PINK_966("pink_966"),
    PINK_969("pink_969"),
    PURPLE_96C("purple_96c"),
    PURPLE_96F("purple_96f"),
    YELLOW_990("yellow_990"),
    YELLOW_993("yellow_993"),
    YELLOW_996("yellow_996"),
    GRAY_999("gray_999"),
    PURPLE_99C("purple_99c"),
    PURPLE_99F("purple_99f"),
    GREEN_9C0("green_9c0"),
    GREEN_9C3("green_9c3"),
    GREEN_9C6("green_9c6"),
    GREEN_9C9("green_9c9"),
    PURPLE_9CC("purple_9cc"),
    PURPLE_9CF("purple_9cf"),
    GREEN_9F0("green_9f0"),
    GREEN_9F3("green_9f3"),
    GREEN_9F6("green_9f6"),
    GREEN_9F9("green_9f9"),
    GREEN_9FC("green_9fc"),
    GREEN_9FF("green_9ff"),
    RED_C00("red_c00"),
    PINK_C03("pink_c03"),
    PINK_C06("pink_c06"),
    PINK_C09("pink_c09"),
    PURPLE_C0C("purple_c0c"),
    PURPLE_C0F("purple_c0f"),
    RED_C30("red_c30"),
    RED_C33("red_c33"),
    PINK_C36("pink_c36"),
    PINK_C39("pink_c39"),
    PURPLE_C3C("purple_c3c"),
    PURPLE_C3F("purple_c3f"),
    ORANGE_C60("orange_c60"),
    RED_C63("red_c63"),
    PINK_C66("pink_c66"),
    PINK_C69("pink_c69"),
    PURPLE_C6C("purple_c6c"),
    PURPLE_C6F("purple_c6f"),
    ORANGE_C90("orange_c90"),
    ORANGE_C93("orange_c93"),
    ORANGE_C96("orange_c96"),
    PINK_C99("pink_c99"),
    PURPLE_C9C("purple_c9c"),
    PURPLE_C9F("purple_c9f"),
    YELLOW_CC0("yellow_cc0"),
    YELLOW_CC3("yellow_cc3"),
    YELLOW_CC6("yellow_cc6"),
    YELLOW_CC9("yellow_cc9"),
    GRAY_CCC("gray_ccc"),
    PURPLE_CCF("purple_ccf"),
    YELLOW_CF0("yellow_cf0"),
    YELLOW_CF3("yellow_cf3"),
    YELLOW_CF6("yellow_cf6"),
    GREEN_CF9("green_cf9"),
    GREEN_CFC("green_cfc"),
    GREEN_CFF("green_cff"),
    RED_F00("red_f00"),
    RED_F03("red_f03"),
    PINK_F06("pink_f06"),
    PINK_F09("pink_f09"),
    PURPLE_F0C("purple_f0c"),
    PURPLE_F0F("purple_f0f"),
    RED_F30("red_f30"),
    RED_F33("red_f33"),
    PINK_F36("pink_f36"),
    PINK_F39("pink_f39"),
    PURPLE_F3C("purple_f3c"),
    PURPLE_F3F("purple_f3f"),
    ORANGE_F60("orange_f60"),
    RED_F63("red_f63"),
    RED_F66("red_f66"),
    PINK_F69("pink_f69"),
    PURPLE_F6C("purple_f6c"),
    PURPLE_F6F("purple_f6f"),
    ORANGE_F90("orange_f90"),
    ORANGE_F93("orange_f93"),
    ORANGE_F96("orange_f96"),
    RED_F99("red_f99"),
    PURPLE_F9C("purple_f9c"),
    PURPLE_F9F("purple_f9f"),
    YELLOW_FC0("yellow_fc0"),
    YELLOW_FC3("yellow_fc3"),
    YELLOW_FC6("yellow_fc6"),
    ORANGE_FC9("orange_fc9"),
    ORANGE_FCC("orange_fcc"),
    PURPLE_FCF("purple_fcf"),
    YELLOW_FF0("yellow_ff0"),
    YELLOW_FF3("yellow_ff3"),
    YELLOW_FF6("yellow_ff6"),
    YELLOW_FF9("yellow_ff9"),
    YELLOW_FFC("yellow_ffc"),
    WHITE_FFF("white_fff");


    public static final void initialize(){
        // You NEVER need to know how this method works.
        InitBlocks __tmp = BLACK_000;
    }

    public static enum RenderTypeSymbols{

        CUTOUT,
        TRANSLUCENT;
        
        @OnlyIn(Dist.CLIENT)
        public RenderType getRenderType(){
            switch(this){
                case CUTOUT: return RenderType.getCutout();
                case TRANSLUCENT: return RenderType.getTranslucent();
                default: return RenderType.getSolid();
            }
        }
    }

    public static enum BlockType{

        CONCRETE("concrete",Material.ROCK,
            ()->new Block(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.8F))),

        STAIRS("concrete_stair",Material.ROCK,
            ()->new StairsBlock(()->InitBlocks.BLACK_000.get(CONCRETE).getDefaultState(),AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.8F))),

        SLAB("concrete_slab",Material.ROCK,
            ()->new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.5F, 6.0F)))/* ,

        GLASS("stained_glass",Material.GLASS,
            ()->new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()),
            RenderTypeSymbols.TRANSLUCENT),

        GLASS_PANE("stained_glass_pane",Material.GLASS,
            ()->new PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()),
            RenderTypeSymbols.TRANSLUCENT) */;


        BlockType(String name,Material material,Supplier<? extends Block> sup){
            this(name, material, sup, null);
        }

        BlockType(String name,Material material,Supplier<? extends Block> sup,RenderTypeSymbols renderType){
            this.name = name;
            this.renderType = renderType;
            this.material = material;
            this.sup = sup;
        }

        public final Supplier<? extends Block> sup;

        final String name;

        final RenderTypeSymbols renderType;

        final Material material;

        @Override
        public String toString() {
            return name;
        }
    }

    InitBlocks(String name){
        regList = new EnumMap(BlockType.class);
        itemRegList = new EnumMap(BlockType.class);
        for(BlockType blockType:BlockType.values()){
            RegistryObject<Block> blockReg;
            regList.put(blockType,blockReg=Color216.BLOCKS.register(
                name+"_"+blockType, 
                blockType.sup
            ));
            itemRegList.put(blockType,Color216.ITEMS.register(
                name+"_"+blockType, 
                ()->new BlockItem(blockReg.get(),new Item.Properties().group(Color216.ITEM_GROUP))
            ));
        }
    }

    public final EnumMap<BlockType,RegistryObject<Block>> regList;
    public final EnumMap<BlockType,RegistryObject<Item>> itemRegList;

    public Block get(BlockType blockType){
        return regList.get(blockType).get();
    }
}