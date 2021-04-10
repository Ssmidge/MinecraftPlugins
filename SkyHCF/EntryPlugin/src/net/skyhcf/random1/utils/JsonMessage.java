package net.skyhcf.random1.utils;

import net.minecraft.server.v1_7_R4.ChatSerializer;
import net.minecraft.server.v1_7_R4.IChatBaseComponent;
import net.minecraft.server.v1_7_R4.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class JsonMessage {

    public static void sendMessage(Player sender, Player player, String message) {
        String jsonMessage = composeMessage(sender, player, message);
        sendJsonMessage(player, jsonMessage);
    }

    public static String composeMessage(Player sender, Player player, String message) {
        String playerName = player.getName();
        String jsonString = "[\"\", {\"text\":\"" + Color.translate("&fHello, &b") + playerName + Color.translate(" &fenjoy your time on &b&lSkyHCF&f!") + "\",\"hoverEvent\":{\"action\":\"show_text\",\"value\":\"" + Color.translate("&fBetween you and me you are the best player in &b&lSkyHCF&f!") + "\"}}]";
        return jsonString;
    }


    public static void sendJsonMessage(Player p, String s) {
        ( (CraftPlayer)p ).getHandle().playerConnection.sendPacket( createPacketPlayOutChat(s) );
    }

    public static PacketPlayOutChat createPacketPlayOutChat(String s) {
        IChatBaseComponent comp = ChatSerializer.a(s);
        return new PacketPlayOutChat(comp);
    }



}
