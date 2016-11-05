package org.devathon.contest2016;

import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Created by Niek on 5-11-2016.
 */
public class CalculatorManager {

    static HashMap<Player, Calculator> calculators = new HashMap<Player, Calculator>();


    public static void addCalculator(Calculator calculator, Player player) {
        calculators.put(player, calculator);
    }

    public static void removeCalculator(Player player) {
        if (calculators.containsKey(player)) {
            calculators.remove(player);
        } else {
            return;
        }
    }

    public static Calculator getCalculator(Player player) {
        if(calculators.containsKey(player)) {
            return calculators.get(player);
        } else {
            return null;
        }
    }
}
