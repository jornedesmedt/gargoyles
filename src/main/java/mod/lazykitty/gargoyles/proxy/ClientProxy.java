package mod.lazykitty.gargoyles.proxy;

import mod.lazykitty.gargoyles.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
	}
}
