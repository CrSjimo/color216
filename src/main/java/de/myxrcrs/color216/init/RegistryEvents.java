package de.myxrcrs.color216.init;

import de.myxrcrs.color216.init.InitBlocks.BlockType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
// Event bus for receiving Registry Events)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        InitBlocks[] blockRegs = InitBlocks.class.getEnumConstants();
        for(InitBlocks blockReg:blockRegs){
            for(BlockType blockType:BlockType.values()){
                if(blockType.renderType==null)continue;
                RenderTypeLookup.setRenderLayer(blockReg.get(blockType), blockType.renderType.getRenderType());
            }
            
        }
    }
}
