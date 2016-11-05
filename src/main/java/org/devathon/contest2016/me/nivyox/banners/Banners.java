package org.devathon.contest2016.me.nivyox.banners;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

/**
 * Created by Niek on 5-11-2016.
 */
public class Banners {
    public Banners() {

    }

    public ItemStack getBanner(int i) {
        if (i == 6) {
            return get0(DyeColor.BLACK);
        }
        if (i == 7) {
            return get1(DyeColor.BLACK);
        }
        if (i == 8) {
            return get2(DyeColor.BLACK);
        }
        if (i == 15) {
            return get3(DyeColor.BLACK);
        }
        if (i == 16) {
            return get4(DyeColor.BLACK);
        }
        if (i == 17) {
            return get5(DyeColor.BLACK);
        }
        if (i == 24) {
            return get6(DyeColor.BLACK);
        }
        if (i == 25) {
            return get7(DyeColor.BLACK);
        }
        if (i == 26) {
            return get8(DyeColor.BLACK);
        }
        if (i == 34) {
            return get9(DyeColor.BLACK);
        } else {
            return null;
        }
    }

    public ItemStack get0(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_RIGHT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_LEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_DOWNLEFT));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 0);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get1(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.SQUARE_TOP_LEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_CENTER));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 1);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get2(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.RHOMBUS_MIDDLE));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_DOWNLEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 2);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get3(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_MIDDLE));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.STRIPE_LEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_RIGHT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 3);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get4(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_LEFT));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_RIGHT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_MIDDLE));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 4);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get5(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_DOWNRIGHT));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.CURLY_BORDER));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.SQUARE_BOTTOM_LEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 5);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get6(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL_MIRROR));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_RIGHT));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_LEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_MIDDLE));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 6);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get7(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.DIAGONAL_RIGHT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_DOWNLEFT));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.SQUARE_BOTTOM_LEFT));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 7);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get8(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.BLACK);
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_MIDDLE));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 8);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

    public ItemStack get9(DyeColor foreGroundColor) {
        ItemStack banner = new ItemStack(Material.BANNER);
        BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();
        bannerMeta.setBaseColor(DyeColor.WHITE);
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_MIDDLE));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_LEFT));
        bannerMeta.addPattern(new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_TOP));
        bannerMeta.addPattern(new Pattern(foreGroundColor, PatternType.STRIPE_RIGHT));
        bannerMeta.setDisplayName(ChatColor.RESET.toString() + ChatColor.WHITE + 9);
        banner.setItemMeta(bannerMeta);
        return banner;
    }

}
