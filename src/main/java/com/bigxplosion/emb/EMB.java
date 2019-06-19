package com.bigxplosion.emb;

import com.bigxplosion.emb.lib.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;

@Mod(modid = Constants.Mod.MOD_ID, name = Constants.Mod.MOD_NAME, version = Constants.Mod.MOD_VERSION)
public class EMB {

    @Mod.Instance(Constants.Mod.MOD_ID)
    public static EMB instance;

    @SidedProxy(clientSide = Constants.Mod.CLIENT_PROXY, serverSide = Constants.Mod.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
