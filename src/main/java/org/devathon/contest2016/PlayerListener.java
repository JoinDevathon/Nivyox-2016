package org.devathon.contest2016;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Niek on 5-11-2016.
 */
public class PlayerListener implements Listener {
    private final DevathonPlugin plugin;

    public PlayerListener(DevathonPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {
            Player player = (Player) event.getWhoClicked();
            if (CalculatorManager.getCalculator(player) != null) {
                Calculator calc = CalculatorManager.getCalculator(player);
                char item = event.getCurrentItem().getItemMeta().getDisplayName().charAt(4);
                System.out.println("Clicked item: " + item);
                if (String.valueOf(item).equalsIgnoreCase("=")) {
                    calc.calculate();
                } else {
                    calc.append(String.valueOf(item));
                }
                event.setCancelled(true);
            }
        } else {
            System.out.println("wat");
        }
    }
}
