package plugin.plugin.challenges;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import plugin.plugin.Plugin;
import plugin.plugin.timer.Timer;

import java.util.Collections;

public class ChallengesCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            challenges(sender);
            return true;
        }

        switch (args[0].toLowerCase()) {
            default:
                sendUsage(sender);
                break;
        }
            return false;
    }

    private void sendUsage(CommandSender sender) {
        sender.sendMessage(ChatColor.RED + ">>" + ChatColor.RESET + "Use: /challenges");
    }

    private void challenges(CommandSender sender) {
        Inventory inv = Bukkit.createInventory(null, 9, "Challenge Options");
        Player player = (Player) sender;

        //Player Visibility
        ItemStack is1 = new ItemStack(Material.DRAGON_EGG);
        ItemMeta im1 = is1.getItemMeta();
        assert im1 != null;
        im1.setDisplayName(ChatColor.AQUA + "Challenge Goal");
        is1.setItemMeta(im1);

        inv.setItem(1, is1);

        //Player Visibility
        ItemStack is3 = new ItemStack(Material.DIAMOND);
        ItemMeta im3 = is3.getItemMeta();
        assert im3 != null;
        im3.setDisplayName(ChatColor.AQUA + "Challenges");
        is3.setItemMeta(im1);

        inv.setItem(3, is3);

        //Player Visibility
        ItemStack is5 = new ItemStack(Material.OAK_WOOD);
        ItemMeta im5 = is5.getItemMeta();
        assert im5 != null;
        im5.setDisplayName(ChatColor.AQUA + "Modifier");
        is5.setItemMeta(im5);

        inv.setItem(5, is5);

        //Player Visibility
        ItemStack is7 = new ItemStack(Material.BARRIER);
        ItemMeta im7 = is7.getItemMeta();
        assert im7 != null;
        im7.setDisplayName(ChatColor.MAGIC + "Help");
        is7.setItemMeta(im7);

        inv.setItem(7, is7);

        player.openInventory(inv);
    }
}
