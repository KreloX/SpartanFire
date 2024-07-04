package krelox.spartanfire;

import com.github.alexthe666.iceandfire.item.DragonSteelTier;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.alexthe666.iceandfire.item.ItemGeneric;
import com.mojang.datafixers.util.Either;
import com.oblivioussp.spartanweaponry.ModSpartanWeaponry;
import com.oblivioussp.spartanweaponry.api.crafting.condition.TypeDisabledCondition;
import com.oblivioussp.spartanweaponry.api.data.model.ModelGenerator;
import com.oblivioussp.spartanweaponry.api.data.recipe.ConditionalShapelessRecipeBuilder;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import it.unimi.dsi.fastutil.Pair;
import krelox.spartantoolkit.*;
import net.minecraft.ChatFormatting;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod(SpartanFire.MODID)
public class SpartanFire extends SpartanAddon {
    public static final String MODID = "spartanfire";

    public static final WeaponMap WEAPONS = new WeaponMap();
    public static final DeferredRegister<Item> ITEMS = itemRegister(MODID);
    public static final DeferredRegister<WeaponTrait> TRAITS = traitRegister(MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = tabRegister(MODID);

    // Traits
    public static final RegistryObject<WeaponTrait> ICE_DRAGON_DAMAGE_BONUS_I = registerTrait(TRAITS,
            new WeaponTrait("ice_dragon_damage_bonus_i", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));
    public static final RegistryObject<WeaponTrait> ICE_DRAGON_DAMAGE_BONUS_II = registerTrait(TRAITS,
            new WeaponTrait("ice_dragon_damage_bonus_ii", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    public static final RegistryObject<WeaponTrait> FIRE_DRAGON_DAMAGE_BONUS_I = registerTrait(TRAITS,
            new WeaponTrait("fire_dragon_damage_bonus_i", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));
    public static final RegistryObject<WeaponTrait> FIRE_DRAGON_DAMAGE_BONUS_II = registerTrait(TRAITS,
            new WeaponTrait("fire_dragon_damage_bonus_ii", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    public static final RegistryObject<WeaponTrait> FLAMED_I = registerTrait(TRAITS,
            new WeaponTrait("flamed_i", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));
    public static final RegistryObject<WeaponTrait> FLAMED_II = registerTrait(TRAITS,
            new WeaponTrait("flamed_ii", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    public static final RegistryObject<WeaponTrait> ICED_I = registerTrait(TRAITS,
            new WeaponTrait("iced_i", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));
    public static final RegistryObject<WeaponTrait> ICED_II = registerTrait(TRAITS,
            new WeaponTrait("iced_ii", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    public static final RegistryObject<WeaponTrait> SHOCKED = registerTrait(TRAITS,
            new WeaponTrait("shocked", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    public static final RegistryObject<WeaponTrait> NON_ARTHROPOD_DAMAGE_BONUS = registerTrait(TRAITS,
            new WeaponTrait("non-arthropod_damage_bonus", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));
    public static final RegistryObject<WeaponTrait> POISONED = registerTrait(TRAITS,
            new WeaponTrait("poisoned", MODID, WeaponTrait.TraitQuality.POSITIVE).setUniversal(false));

    // Materials
    public static final SpartanMaterial DRAGON_BONE = material("dragon_bone",
            IafItemRegistry.DRAGONBONE_TOOL_MATERIAL, "forge:bones/dragon", Set.of(), Map.of());
    public static final SpartanMaterial FLAMED_DRAGON_BONE = material("flamed_dragon_bone",
            IafItemRegistry.FIRE_DRAGONBONE_TOOL_MATERIAL, "forge:bones/dragon", Set.of(ICE_DRAGON_DAMAGE_BONUS_II, FLAMED_I), Map.of());
    public static final SpartanMaterial ICED_DRAGON_BONE = material("iced_dragon_bone",
            IafItemRegistry.ICE_DRAGONBONE_TOOL_MATERIAL, "forge:bones/dragon", Set.of(FIRE_DRAGON_DAMAGE_BONUS_II, ICED_I), Map.of());
    public static final SpartanMaterial LIGHTNING_DRAGON_BONE = material("lightning_dragon_bone",
            IafItemRegistry.LIGHTNING_DRAGONBONE_TOOL_MATERIAL, "forge:bones/dragon", Set.of(ICE_DRAGON_DAMAGE_BONUS_I, FIRE_DRAGON_DAMAGE_BONUS_I, SHOCKED), Map.of());

    public static final SpartanMaterial FIRE_DRAGONSTEEL = material("fire_dragonsteel",
            DragonSteelTier.DRAGONSTEEL_TIER_FIRE, "forge:ingots/dragonsteel_fire", Set.of(FLAMED_II), Map.of());
    public static final SpartanMaterial ICE_DRAGONSTEEL = material("ice_dragonsteel",
            DragonSteelTier.DRAGONSTEEL_TIER_ICE, "forge:ingots/dragonsteel_ice", Set.of(ICED_II), Map.of());
    public static final SpartanMaterial LIGHTNING_DRAGONSTEEL = material("lightning_dragonsteel",
            DragonSteelTier.DRAGONSTEEL_TIER_LIGHTNING, "forge:ingots/dragonsteel_lightning", Set.of(SHOCKED), Map.of());

    public static final SpartanMaterial DESERT_MYRMEX_CHITIN = material("desert_myrmex_chitin",
            IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, "forge:chitin_desert", Set.of(NON_ARTHROPOD_DAMAGE_BONUS), Map.of());
    public static final SpartanMaterial DESERT_MYRMEX_STINGER = material("desert_myrmex_stinger",
            IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, "forge:chitin_desert", Set.of(NON_ARTHROPOD_DAMAGE_BONUS, POISONED), Map.of());
    public static final SpartanMaterial JUNGLE_MYRMEX_CHITIN = material("jungle_myrmex_chitin",
            IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, "forge:chitin_jungle", Set.of(NON_ARTHROPOD_DAMAGE_BONUS), Map.of());
    public static final SpartanMaterial JUNGLE_MYRMEX_STINGER = material("jungle_myrmex_stinger",
            IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, "forge:chitin_jungle", Set.of(NON_ARTHROPOD_DAMAGE_BONUS, POISONED), Map.of());

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> SPARTAN_FIRE_TAB = registerTab(TABS, MODID, () -> WEAPONS.get(FLAMED_DRAGON_BONE, WeaponType.GREATSWORD).get(),
            (parameters, output) -> ITEMS.getEntries().forEach(item -> output.accept(item.get())));

    public static final RegistryObject<Item> WITHERBONE_HANDLE = ITEMS.register("witherbone_handle", ItemGeneric::new);
    public static final RegistryObject<Item> WITHERBONE_POLE = ITEMS.register("witherbone_pole", ItemGeneric::new);

    private static final TagKey<Item> WITHERBONE = ItemTags.create(new ResourceLocation("forge:bones/wither"));

    public SpartanFire() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        registerSpartanWeapons(ITEMS);
        ITEMS.register(bus);
        TRAITS.register(bus);
        TABS.register(bus);
    }

    @SubscribeEvent
    public void gatherTooltipComponents(RenderTooltipEvent.GatherComponents event) {
        if (event.getItemStack().getItem() instanceof WeaponItem weapon && (weapon.getMaterial().equals(FLAMED_DRAGON_BONE) || weapon.getMaterial().equals(ICED_DRAGON_BONE) || weapon.getMaterial().equals(LIGHTNING_DRAGON_BONE))) {
            event.getTooltipElements().add(1, Either.left(Component.translatable("item.iceandfire.legendary_weapon.desc").withStyle(ChatFormatting.GOLD)));
        }
    }

    private static SpartanMaterial material(String name, Tier tier, String tagPath, Set<RegistryObject<WeaponTrait>> traits, Map<Supplier<Enchantment>, Integer> enchantments) {
        return new SpartanMaterial(name, MODID, tier, ItemTags.create(new ResourceLocation(tagPath)), traits, enchantments) {
            @Override
            public TagKey<Item> getStick() {
                return WITHERBONE;
            }

            @Override
            public ItemLike getHandle() {
                return WITHERBONE_HANDLE.get();
            }

            @Override
            public ItemLike getPole() {
                return WITHERBONE_POLE.get();
            }
        };
    }

    @Override
    protected void addTranslations(LanguageProvider provider, Function<RegistryObject<?>, String> formatName) {
        super.addTranslations(provider, formatName);
        provider.add(WITHERBONE_HANDLE.get(), "Witherbone Handle");
        provider.add(WITHERBONE_POLE.get(), "Witherbone Pole");
    }

    @Override
    protected void registerModels(ItemModelProvider provider, ModelGenerator generator) {
        super.registerModels(provider, generator);
        provider.basicItem(WITHERBONE_HANDLE.get());
        generator.createSimpleModel(WITHERBONE_POLE.get(), new ResourceLocation(ModSpartanWeaponry.ID, "item/base/pole"));
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        TriConsumer<ShapelessRecipeBuilder, Integer, TagKey<Item>> witherboneRecipe = (builder, witherboneCount, ingredient) -> builder
                .requires(Ingredient.of(WITHERBONE), witherboneCount)
                .requires(ingredient)
                .group(ForgeRegistries.ITEMS.getKey(builder.getResult()).toString())
                .unlockedBy("has_witherbone", has(WITHERBONE))
                .save(consumer, ForgeRegistries.ITEMS.getKey(builder.getResult()).withSuffix("_from_" + ingredient.location().getPath()));

        witherboneRecipe.accept(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WITHERBONE_HANDLE.get()), 1, Tags.Items.STRING);
        witherboneRecipe.accept(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WITHERBONE_HANDLE.get(), 4), 4, ItemTags.WOOL);
        witherboneRecipe.accept(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WITHERBONE_HANDLE.get(), 4), 4, Tags.Items.LEATHER);

        witherboneRecipe.accept(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WITHERBONE_POLE.get(), 4), 8, ItemTags.WOOL);
        witherboneRecipe.accept(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WITHERBONE_POLE.get(), 4), 8, Tags.Items.LEATHER);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, WITHERBONE_POLE.get())
                .define('|', WITHERBONE)
                .define('#', Tags.Items.STRING)
                .pattern("| ")
                .pattern("|#")
                .pattern("| ")
                .group(WITHERBONE_POLE.getId().toString())
                .unlockedBy("has_witherbone", has(WITHERBONE))
                .save(consumer, WITHERBONE_POLE.getId() + "_from_string");

        Map<SpartanMaterial, RegistryObject<Item>> dragonBlood = Map.of(
                FLAMED_DRAGON_BONE, IafItemRegistry.FIRE_DRAGON_BLOOD,
                ICED_DRAGON_BONE, IafItemRegistry.ICE_DRAGON_BLOOD,
                LIGHTNING_DRAGON_BONE, IafItemRegistry.LIGHTNING_DRAGON_BLOOD
        );

        WEAPONS.forEach((key, item) -> {
            SpartanMaterial material = key.first();
            WeaponType type = key.second();
            if (material.equals(DESERT_MYRMEX_STINGER) || material.equals(JUNGLE_MYRMEX_STINGER)) {
                SpartanMaterial baseMaterial = WEAPONS.keySet().stream()
                        .map(Pair::first)
                        .filter(material1 -> material1.getMaterialName().equals(material.getMaterialName().replace("stinger", "chitin")))
                        .findAny().get();
                ConditionalShapelessRecipeBuilder.shapeless(item.get())
                        .requires(WEAPONS.get(baseMaterial, type).get())
                        .requires(IafItemRegistry.MYRMEX_STINGER.get())
                        .group(ModSpartanWeaponry.ID + ":" + type.name().toLowerCase())
                        .condition(new TypeDisabledCondition(List.of(type.name().toLowerCase())))
                        .unlockedBy("has_myrmex_stinger", has(IafItemRegistry.MYRMEX_STINGER.get()))
                        .save(consumer);
            } else if (material.equals(FLAMED_DRAGON_BONE) || material.equals(ICED_DRAGON_BONE) || material.equals(LIGHTNING_DRAGON_BONE)) {
                RegistryObject<Item> blood = dragonBlood.get(material);
                ConditionalShapelessRecipeBuilder.shapeless(item.get())
                        .requires(WEAPONS.get(DRAGON_BONE, type).get())
                        .requires(blood.get())
                        .group(ModSpartanWeaponry.ID + ":" + type.name().toLowerCase())
                        .condition(new TypeDisabledCondition(List.of(type.name().toLowerCase())))
                        .unlockedBy("has_" + blood.getId().getPath(), has(blood.get()))
                        .save(consumer);
            } else {
                type.recipe.accept(getWeaponMap(), consumer, material);
            }
        });
    }

    @Override
    protected Map<RegistryObject<WeaponTrait>, String> getTraitDescriptions() {
        return Map.ofEntries(
                Map.entry(ICE_DRAGON_DAMAGE_BONUS_I, "+4 damage against Ice Dragons"),
                Map.entry(ICE_DRAGON_DAMAGE_BONUS_II, "+8 damage against Ice Dragons"),
                Map.entry(FIRE_DRAGON_DAMAGE_BONUS_I, "+4 damage against Fire Dragons"),
                Map.entry(FIRE_DRAGON_DAMAGE_BONUS_II, "+8 damage against Fire Dragons"),
                Map.entry(FLAMED_I, "Ignites and knocks back targets"),
                Map.entry(FLAMED_II, "Ignites and knocks back targets"),
                Map.entry(ICED_I, "Freezes targets"),
                Map.entry(ICED_II, "Freezes targets"),
                Map.entry(SHOCKED, "Strikes targets with lightning"),
                Map.entry(NON_ARTHROPOD_DAMAGE_BONUS, "+4 damage against non-arthropods and Death Worms"),
                Map.entry(POISONED, "Poisons targets")
        );
    }

    @Override
    public String modid() {
        return MODID;
    }

    @Override
    public List<SpartanMaterial> getMaterials() {
        return List.of(
                DRAGON_BONE, FLAMED_DRAGON_BONE, ICED_DRAGON_BONE, LIGHTNING_DRAGON_BONE,
                DESERT_MYRMEX_CHITIN, DESERT_MYRMEX_STINGER, JUNGLE_MYRMEX_CHITIN, JUNGLE_MYRMEX_STINGER,
                FIRE_DRAGONSTEEL, ICE_DRAGONSTEEL, LIGHTNING_DRAGONSTEEL
        );
    }

    @Override
    public WeaponMap getWeaponMap() {
        return WEAPONS;
    }
}
