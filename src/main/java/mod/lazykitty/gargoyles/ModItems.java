package mod.lazykitty.gargoyles;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
	public static Item test_item;
	
	public static void initalize()
	{
		test_item = new Item().setUnlocalizedName("test_item");
		System.out.println(test_item.getUnlocalizedName());
	}
	
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_item);
	}
	
	public static void registerRender(Item item)
	{
		System.out.println(item.getUnlocalizedName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
