package org.devathon.contest2016;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.devathon.contest2016.me.nivyox.banners.Banners;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by Niek on 5-11-2016.
 */
public class Calculator {
    private final Player player;
    private String calculation = "";
    private Inventory calculatorInv;

    public Calculator(Player sender) {
        this.player = sender;
        CalculatorManager.addCalculator(this, this.player);
        calculatorInv = buildInventory();
    }


    public void build() {
        buildInventory();
        player.openInventory(calculatorInv);
    }

    public boolean append(String thing) {
        calculation = calculation + thing;
        player.sendMessage(ChatColor.GREEN + "Calculation: " + calculation);
        return true;
    }

    public void close() {
        player.closeInventory();
        CalculatorManager.removeCalculator(this.player);
    }

    public Inventory buildInventory() {
        Inventory inventory = Bukkit.createInventory(null, 54, "Calculator");
        int number = 0;
        for (int i = 0; i < 54; i++) {
            //Operators
            if (i == 0) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "+");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }
            if (i == 1) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "-");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }
            if (i == 2) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "*");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }
            if (i == 3) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "/");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }


            //Numbers
            if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26 || i == 34) {
                Banners bannerhandler = new Banners();
                ItemStack item = bannerhandler.getBanner(i);
                inventory.setItem(i, item);
                number++;
            }

            if (i == 53) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "=");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }

            //Complicated stuff
            if (i == 18) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + "(");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }
            if (i == 19) {
                ItemStack item = new ItemStack(Material.SIGN);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + ")");
                item.setItemMeta(im);
                inventory.setItem(i, item);
            }
        }
        return inventory;
    }

    public void calculate() {
        String answer = calculation;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            System.out.println("Answer: " + engine.eval(answer));
            player.sendMessage(ChatColor.BOLD.toString() + ChatColor.GREEN + "Answer: " + engine.eval(answer));
            calculation = "";
        } catch (Exception e) {
            player.sendMessage(ChatColor.BOLD.toString() + ChatColor.RED + "ERROR!");
            calculation = "";
            e.printStackTrace();
        }
    }
}
