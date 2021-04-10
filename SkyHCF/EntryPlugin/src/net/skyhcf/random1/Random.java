package net.skyhcf.random1;

import net.frozenorb.qlib.command.FrozenCommandHandler;
import net.skyhcf.random1.utils.HWIDProtection;
import org.bukkit.plugin.java.JavaPlugin;

public class Random extends JavaPlugin {

    public static Random instance;

    public void onEnable() {
        if(!new HWIDProtection("2HFM-RVLT-LEQD-7GVT", "https://ssmidge.xyz/getrektll/verify.php", this).setSecurityKey("YecoF0I6M05thxLeokoHuW8iUhTdIUInjkfF").register()) return;
        FrozenCommandHandler.registerAll(this);


    }

    public void onDisable() {
        System.out.println("Sad to see you go - Randomed");
    }


}
