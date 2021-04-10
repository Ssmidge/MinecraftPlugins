package net.skyhcf.random1;

import net.frozenorb.qlib.command.Param;

import net.skyhcf.random1.utils.JsonMessage;
import org.bukkit.entity.Player;
import net.frozenorb.qlib.command.*;
import org.bukkit.command.CommandSender;

public class SkyHCF {

    @Command(names = {"skyhcf", "skihcf", "skyhc"}, permission = "")
   // @Command(names = { "reboot" }, permission = "server.reboot")
    public static void skyhcf(CommandSender sender, @Param(name = "target", defaultValue = "self") Player target){

        if(sender instanceof Player) {
            JsonMessage.sendMessage(sender.getServer().getPlayer(sender.getName()), sender.getServer().getPlayer(sender.getName()), "E");
        }
    }





}
