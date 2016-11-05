package org.devathon.contest2016;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Niek on 5-11-2016.
 */
public class CommandCalculator implements CommandExecutor {
    public CommandCalculator(DevathonPlugin devathonPlugin) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (args[0].equalsIgnoreCase("gui")) {
                Calculator calc = new Calculator((Player) sender);
                calc.build();
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
        }
        return true;
    }
}
