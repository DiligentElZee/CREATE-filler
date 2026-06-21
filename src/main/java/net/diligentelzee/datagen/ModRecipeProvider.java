package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        List<ItemLike> COAL_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_COAL_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE,
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE,
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE,
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE
        );
        
        List<ItemLike> COPPER_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_COPPER_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE
        );
        
        List<ItemLike> DIAMOND_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE
        );
        
        List<ItemLike> EMERALD_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE
        );
        
        List<ItemLike> GOLD_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE
        );
        
        List<ItemLike> NETHER_GOLD_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE
        );
        
        List<ItemLike> IRON_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_IRON_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE,
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE,
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE,
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE
        );
        
        List<ItemLike> LAPIS_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE
        );
        
        List<ItemLike> REDSTONE_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE
        );
        
        List<ItemLike> NETHER_QUARTZ_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE
        );

        oreSmelting(recipeOutput, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 250, "coal");
        oreBlasting(recipeOutput, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.6f, 125, "coal");

        oreSmelting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.5f, 250, "copper");
        oreBlasting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.6f, 125, "copper");

        oreSmelting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.5f, 250, "diamond");
        oreBlasting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.6f, 125, "diamond");

        oreSmelting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.5f, 250, "emerald");
        oreBlasting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.6f, 125, "emerald");

        oreSmelting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.5f, 250, "gold");
        oreBlasting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.6f, 125, "gold");

        oreSmelting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.5f, 250, "iron");
        oreBlasting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.6f, 125, "iron");

        oreSmelting(recipeOutput, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.0f, 250, "lapis");
        oreBlasting(recipeOutput, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.2f, 125, "lapis");

        oreSmelting(recipeOutput, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.5f, 250, "redstone");
        oreBlasting(recipeOutput, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.6f, 125, "redstone");

        oreSmelting(recipeOutput, NETHER_GOLD_SMELTABLE, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.5f, 250, "gold_nugget");
        oreBlasting(recipeOutput, NETHER_GOLD_SMELTABLE, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.6f, 125, "gold_nugget");

        oreSmelting(recipeOutput, NETHER_QUARTZ_SMELTABLE, RecipeCategory.MISC, Items.QUARTZ, 0.5f, 250, "quartz");
        oreBlasting(recipeOutput, NETHER_QUARTZ_SMELTABLE, RecipeCategory.MISC, Items.QUARTZ, 0.6f, 125, "quartz");
    }

    protected static void oreSmelting(@NotNull RecipeOutput recipeOutput, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTIme, @NotNull String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(@NotNull RecipeOutput recipeOutput, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTime, @NotNull String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(@NotNull RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer,
                                                                       AbstractCookingRecipe.@NotNull Factory<T> factory,
                                                                       List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory,
                                                                       @NotNull ItemLike pResult, float pExperience, int pCookingTime,
                                                                       @NotNull String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CreateFillers.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
