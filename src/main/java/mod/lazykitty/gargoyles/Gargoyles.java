package mod.lazykitty.gargoyles;

import mod.lazykitty.gargoyles.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Gargoyles
{   
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	private void preInit(FMLPreInitializationEvent e)
	{
		ModItems.initalize();
		ModItems.register();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenders();
    }
}
