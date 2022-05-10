package krelox.swiaf.init;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;

import krelox.swiaf.Swiaf;
import krelox.swiaf.itemgroup.ItemGroupSF;
import krelox.swiaf.weapontrait.FlamedIIWeaponTrait;
import krelox.swiaf.weapontrait.FlamedWeaponTrait;
import krelox.swiaf.weapontrait.IcedIIWeaponTrait;
import krelox.swiaf.weapontrait.IcedWeaponTrait;
import krelox.swiaf.weapontrait.MyrmexWeaponTrait;
import krelox.swiaf.weapontrait.PoisonedWeaponTrait;
import krelox.swiaf.weapontrait.ShockedIIWeaponTrait;
import krelox.swiaf.weapontrait.ShockedWeaponTrait;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistrySF 
{
	public static WeaponMaterial DRAGONBONE = new WeaponMaterial("dragonbone", IafItemRegistry.DRAGONBONE_TOOL_MATERIAL, new ResourceLocation("forge:bones/dragon"));
    public static WeaponMaterial FIRE_DRAGONBONE = new WeaponMaterial("fire_dragonbone", IafItemRegistry.FIRE_DRAGONBONE_TOOL_MATERIAL, new ResourceLocation("forge:bones/dragon"), new FlamedWeaponTrait());
    public static WeaponMaterial ICE_DRAGONBONE = new WeaponMaterial("ice_dragonbone", IafItemRegistry.ICE_DRAGONBONE_TOOL_MATERIAL, new ResourceLocation("forge:bones/dragon"), new IcedWeaponTrait());
    public static WeaponMaterial LIGHTNING_DRAGONBONE = new WeaponMaterial("lightning_dragonbone", IafItemRegistry.LIGHTNING_DRAGONBONE_TOOL_MATERIAL, new ResourceLocation("forge:bones/dragon"), new ShockedWeaponTrait());

    public static WeaponMaterial FIRE_DRAGONSTEEL = new WeaponMaterial("fire_dragonsteel", IafItemRegistry.DRAGONSTEEL_FIRE_TOOL_MATERIAL, new ResourceLocation("forge:ingots/dragonsteel_fire"), new FlamedIIWeaponTrait());
    public static WeaponMaterial ICE_DRAGONSTEEL = new WeaponMaterial("ice_dragonsteel", IafItemRegistry.DRAGONSTEEL_ICE_TOOL_MATERIAL, new ResourceLocation("forge:ingots/dragonsteel_ice"), new IcedIIWeaponTrait());
    public static WeaponMaterial LIGHTNING_DRAGONSTEEL = new WeaponMaterial("lightning_dragonsteel", IafItemRegistry.DRAGONSTEEL_LIGHTNING_TOOL_MATERIAL, new ResourceLocation("forge:ingots/dragonsteel_lightning"), new ShockedIIWeaponTrait());
    
    public static WeaponMaterial JUNGLE = new WeaponMaterial("jungle", IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, new ResourceLocation("forge:chitin_jungle"), new MyrmexWeaponTrait());
    public static WeaponMaterial DESERT = new WeaponMaterial("desert", IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, new ResourceLocation("forge:chitin_desert"), new MyrmexWeaponTrait());
    public static WeaponMaterial JUNGLE_VENOM = new WeaponMaterial("jungle_venom", IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, new ResourceLocation("forge:chitin_jungle"), new MyrmexWeaponTrait(), new PoisonedWeaponTrait());
    public static WeaponMaterial DESERT_VENOM = new WeaponMaterial("desert_venom", IafItemRegistry.MYRMEX_CHITIN_TOOL_MATERIAL, new ResourceLocation("forge:chitin_desert"), new MyrmexWeaponTrait(), new PoisonedWeaponTrait());

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Swiaf.MODID);

	public static final RegistryObject<Item> WITHERBONE_HANDLE = ITEMS.register("witherbone_handle", () -> new Item(new Item.Properties().tab(ItemGroupSF.ITEM_GROUP_SF)));
	public static final RegistryObject<Item> WITHERBONE_POLE = ITEMS.register("witherbone_pole", () -> new Item(new Item.Properties().tab(ItemGroupSF.ITEM_GROUP_SF)));

	public static final RegistryObject<Item> DAGGER_DRAGONBONE = ITEMS.register("dagger_dragonbone", () -> SpartanWeaponryAPI.createDagger(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_FIRE_DRAGONBONE = ITEMS.register("dagger_fire_dragonbone", () -> SpartanWeaponryAPI.createDagger(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_ICE_DRAGONBONE = ITEMS.register("dagger_ice_dragonbone", () -> SpartanWeaponryAPI.createDagger(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_LIGHTNING_DRAGONBONE = ITEMS.register("dagger_lightning_dragonbone", () -> SpartanWeaponryAPI.createDagger(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGSWORD_DRAGONBONE = ITEMS.register("longsword_dragonbone", () -> SpartanWeaponryAPI.createLongsword(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_FIRE_DRAGONBONE = ITEMS.register("longsword_fire_dragonbone", () -> SpartanWeaponryAPI.createLongsword(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_ICE_DRAGONBONE = ITEMS.register("longsword_ice_dragonbone", () -> SpartanWeaponryAPI.createLongsword(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_LIGHTNING_DRAGONBONE = ITEMS.register("longsword_lightning_dragonbone", () -> SpartanWeaponryAPI.createLongsword(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> KATANA_DRAGONBONE = ITEMS.register("katana_dragonbone", () -> SpartanWeaponryAPI.createKatana(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_FIRE_DRAGONBONE = ITEMS.register("katana_fire_dragonbone", () -> SpartanWeaponryAPI.createKatana(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_ICE_DRAGONBONE = ITEMS.register("katana_ice_dragonbone", () -> SpartanWeaponryAPI.createKatana(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_LIGHTNING_DRAGONBONE = ITEMS.register("katana_lightning_dragonbone", () -> SpartanWeaponryAPI.createKatana(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SABER_DRAGONBONE = ITEMS.register("saber_dragonbone", () -> SpartanWeaponryAPI.createSaber(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_FIRE_DRAGONBONE = ITEMS.register("saber_fire_dragonbone", () -> SpartanWeaponryAPI.createSaber(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_ICE_DRAGONBONE = ITEMS.register("saber_ice_dragonbone", () -> SpartanWeaponryAPI.createSaber(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_LIGHTNING_DRAGONBONE = ITEMS.register("saber_lightning_dragonbone", () -> SpartanWeaponryAPI.createSaber(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> RAPIER_DRAGONBONE = ITEMS.register("rapier_dragonbone", () -> SpartanWeaponryAPI.createRapier(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_FIRE_DRAGONBONE = ITEMS.register("rapier_fire_dragonbone", () -> SpartanWeaponryAPI.createRapier(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_ICE_DRAGONBONE = ITEMS.register("rapier_ice_dragonbone", () -> SpartanWeaponryAPI.createRapier(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_LIGHTNING_DRAGONBONE = ITEMS.register("rapier_lightning_dragonbone", () -> SpartanWeaponryAPI.createRapier(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GREATSWORD_DRAGONBONE = ITEMS.register("greatsword_dragonbone", () -> SpartanWeaponryAPI.createGreatsword(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_FIRE_DRAGONBONE = ITEMS.register("greatsword_fire_dragonbone", () -> SpartanWeaponryAPI.createGreatsword(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_ICE_DRAGONBONE = ITEMS.register("greatsword_ice_dragonbone", () -> SpartanWeaponryAPI.createGreatsword(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_LIGHTNING_DRAGONBONE = ITEMS.register("greatsword_lightning_dragonbone", () -> SpartanWeaponryAPI.createGreatsword(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HAMMER_DRAGONBONE = ITEMS.register("hammer_dragonbone", () -> SpartanWeaponryAPI.createBattleHammer(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_FIRE_DRAGONBONE = ITEMS.register("hammer_fire_dragonbone", () -> SpartanWeaponryAPI.createBattleHammer(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_ICE_DRAGONBONE = ITEMS.register("hammer_ice_dragonbone", () -> SpartanWeaponryAPI.createBattleHammer(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_LIGHTNING_DRAGONBONE = ITEMS.register("hammer_lightning_dragonbone", () -> SpartanWeaponryAPI.createBattleHammer(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> WARHAMMER_DRAGONBONE = ITEMS.register("warhammer_dragonbone", () -> SpartanWeaponryAPI.createWarhammer(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_FIRE_DRAGONBONE = ITEMS.register("warhammer_fire_dragonbone", () -> SpartanWeaponryAPI.createWarhammer(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_ICE_DRAGONBONE = ITEMS.register("warhammer_ice_dragonbone", () -> SpartanWeaponryAPI.createWarhammer(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_LIGHTNING_DRAGONBONE = ITEMS.register("warhammer_lightning_dragonbone", () -> SpartanWeaponryAPI.createWarhammer(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SPEAR_DRAGONBONE = ITEMS.register("spear_dragonbone", () -> SpartanWeaponryAPI.createSpear(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_FIRE_DRAGONBONE = ITEMS.register("spear_fire_dragonbone", () -> SpartanWeaponryAPI.createSpear(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_ICE_DRAGONBONE = ITEMS.register("spear_ice_dragonbone", () -> SpartanWeaponryAPI.createSpear(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_LIGHTNING_DRAGONBONE = ITEMS.register("spear_lightning_dragonbone", () -> SpartanWeaponryAPI.createSpear(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HALBERD_DRAGONBONE = ITEMS.register("halberd_dragonbone", () -> SpartanWeaponryAPI.createHalberd(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_FIRE_DRAGONBONE = ITEMS.register("halberd_fire_dragonbone", () -> SpartanWeaponryAPI.createHalberd(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_ICE_DRAGONBONE = ITEMS.register("halberd_ice_dragonbone", () -> SpartanWeaponryAPI.createHalberd(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_LIGHTNING_DRAGONBONE = ITEMS.register("halberd_lightning_dragonbone", () -> SpartanWeaponryAPI.createHalberd(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PIKE_DRAGONBONE = ITEMS.register("pike_dragonbone", () -> SpartanWeaponryAPI.createPike(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_FIRE_DRAGONBONE = ITEMS.register("pike_fire_dragonbone", () -> SpartanWeaponryAPI.createPike(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_ICE_DRAGONBONE = ITEMS.register("pike_ice_dragonbone", () -> SpartanWeaponryAPI.createPike(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_LIGHTNING_DRAGONBONE = ITEMS.register("pike_lightning_dragonbone", () -> SpartanWeaponryAPI.createPike(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LANCE_DRAGONBONE = ITEMS.register("lance_dragonbone", () -> SpartanWeaponryAPI.createLance(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_FIRE_DRAGONBONE = ITEMS.register("lance_fire_dragonbone", () -> SpartanWeaponryAPI.createLance(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_ICE_DRAGONBONE = ITEMS.register("lance_ice_dragonbone", () -> SpartanWeaponryAPI.createLance(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_LIGHTNING_DRAGONBONE = ITEMS.register("lance_lightning_dragonbone", () -> SpartanWeaponryAPI.createLance(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGBOW_DRAGONBONE = ITEMS.register("longbow_dragonbone", () -> SpartanWeaponryAPI.createLongbow(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_FIRE_DRAGONBONE = ITEMS.register("longbow_fire_dragonbone", () -> SpartanWeaponryAPI.createLongbow(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_ICE_DRAGONBONE = ITEMS.register("longbow_ice_dragonbone", () -> SpartanWeaponryAPI.createLongbow(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_LIGHTNING_DRAGONBONE = ITEMS.register("longbow_lightning_dragonbone", () -> SpartanWeaponryAPI.createLongbow(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> CROSSBOW_DRAGONBONE = ITEMS.register("heavy_crossbow_dragonbone", () -> SpartanWeaponryAPI.createHeavyCrossbow(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_FIRE_DRAGONBONE = ITEMS.register("heavy_crossbow_fire_dragonbone", () -> SpartanWeaponryAPI.createHeavyCrossbow(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_ICE_DRAGONBONE = ITEMS.register("heavy_crossbow_ice_dragonbone", () -> SpartanWeaponryAPI.createHeavyCrossbow(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_LIGHTNING_DRAGONBONE = ITEMS.register("heavy_crossbow_lightning_dragonbone", () -> SpartanWeaponryAPI.createHeavyCrossbow(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> THROWING_KNIFE_DRAGONBONE = ITEMS.register("throwing_knife_dragonbone", () -> SpartanWeaponryAPI.createThrowingKnife(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_FIRE_DRAGONBONE = ITEMS.register("throwing_knife_fire_dragonbone", () -> SpartanWeaponryAPI.createThrowingKnife(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ICE_DRAGONBONE = ITEMS.register("throwing_knife_ice_dragonbone", () -> SpartanWeaponryAPI.createThrowingKnife(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_LIGHTNING_DRAGONBONE = ITEMS.register("throwing_knife_lightning_dragonbone", () -> SpartanWeaponryAPI.createThrowingKnife(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> TOMAHAWK_DRAGONBONE = ITEMS.register("tomahawk_dragonbone", () -> SpartanWeaponryAPI.createTomahawk(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_FIRE_DRAGONBONE = ITEMS.register("tomahawk_fire_dragonbone", () -> SpartanWeaponryAPI.createTomahawk(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_ICE_DRAGONBONE = ITEMS.register("tomahawk_ice_dragonbone", () -> SpartanWeaponryAPI.createTomahawk(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_LIGHTNING_DRAGONBONE = ITEMS.register("tomahawk_lightning_dragonbone", () -> SpartanWeaponryAPI.createTomahawk(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> JAVELIN_DRAGONBONE = ITEMS.register("javelin_dragonbone", () -> SpartanWeaponryAPI.createJavelin(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_FIRE_DRAGONBONE = ITEMS.register("javelin_fire_dragonbone", () -> SpartanWeaponryAPI.createJavelin(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_ICE_DRAGONBONE = ITEMS.register("javelin_ice_dragonbone", () -> SpartanWeaponryAPI.createJavelin(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_LIGHTNING_DRAGONBONE = ITEMS.register("javelin_lightning_dragonbone", () -> SpartanWeaponryAPI.createJavelin(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BOOMERANG_DRAGONBONE = ITEMS.register("boomerang_dragonbone", () -> SpartanWeaponryAPI.createBoomerang(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_FIRE_DRAGONBONE = ITEMS.register("boomerang_fire_dragonbone", () -> SpartanWeaponryAPI.createBoomerang(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_ICE_DRAGONBONE = ITEMS.register("boomerang_ice_dragonbone", () -> SpartanWeaponryAPI.createBoomerang(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_LIGHTNING_DRAGONBONE = ITEMS.register("boomerang_lightning_dragonbone", () -> SpartanWeaponryAPI.createBoomerang(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BATTLEAXE_DRAGONBONE = ITEMS.register("battleaxe_dragonbone", () -> SpartanWeaponryAPI.createBattleaxe(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_FIRE_DRAGONBONE = ITEMS.register("battleaxe_fire_dragonbone", () -> SpartanWeaponryAPI.createBattleaxe(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_ICE_DRAGONBONE = ITEMS.register("battleaxe_ice_dragonbone", () -> SpartanWeaponryAPI.createBattleaxe(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_LIGHTNING_DRAGONBONE = ITEMS.register("battleaxe_lightning_dragonbone", () -> SpartanWeaponryAPI.createBattleaxe(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> MACE_DRAGONBONE = ITEMS.register("flanged_mace_dragonbone", () -> SpartanWeaponryAPI.createFlangedMace(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_FIRE_DRAGONBONE = ITEMS.register("flanged_mace_fire_dragonbone", () -> SpartanWeaponryAPI.createFlangedMace(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_ICE_DRAGONBONE = ITEMS.register("flanged_mace_ice_dragonbone", () -> SpartanWeaponryAPI.createFlangedMace(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_LIGHTNING_DRAGONBONE = ITEMS.register("flanged_mace_lightning_dragonbone", () -> SpartanWeaponryAPI.createFlangedMace(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GLAIVE_DRAGONBONE = ITEMS.register("glaive_dragonbone", () -> SpartanWeaponryAPI.createGlaive(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_FIRE_DRAGONBONE = ITEMS.register("glaive_fire_dragonbone", () -> SpartanWeaponryAPI.createGlaive(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_ICE_DRAGONBONE = ITEMS.register("glaive_ice_dragonbone", () -> SpartanWeaponryAPI.createGlaive(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_LIGHTNING_DRAGONBONE = ITEMS.register("glaive_lightning_dragonbone", () -> SpartanWeaponryAPI.createGlaive(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> QUARTERSTAFF_DRAGONBONE = ITEMS.register("quarterstaff_dragonbone", () -> SpartanWeaponryAPI.createQuarterstaff(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_FIRE_DRAGONBONE = ITEMS.register("quarterstaff_fire_dragonbone", () -> SpartanWeaponryAPI.createQuarterstaff(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ICE_DRAGONBONE = ITEMS.register("quarterstaff_ice_dragonbone", () -> SpartanWeaponryAPI.createQuarterstaff(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_LIGHTNING_DRAGONBONE = ITEMS.register("quarterstaff_lightning_dragonbone", () -> SpartanWeaponryAPI.createQuarterstaff(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PARRYING_DAGGER_DRAGONBONE = ITEMS.register("parrying_dagger_dragonbone", () -> SpartanWeaponryAPI.createParryingDagger(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_FIRE_DRAGONBONE = ITEMS.register("parrying_dagger_fire_dragonbone", () -> SpartanWeaponryAPI.createParryingDagger(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ICE_DRAGONBONE = ITEMS.register("parrying_dagger_ice_dragonbone", () -> SpartanWeaponryAPI.createParryingDagger(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_LIGHTNING_DRAGONBONE = ITEMS.register("parrying_dagger_lightning_dragonbone", () -> SpartanWeaponryAPI.createParryingDagger(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SCYTHE_DRAGONBONE = ITEMS.register("scythe_dragonbone", () -> SpartanWeaponryAPI.createScythe(DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_FIRE_DRAGONBONE = ITEMS.register("scythe_fire_dragonbone", () -> SpartanWeaponryAPI.createScythe(FIRE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_ICE_DRAGONBONE = ITEMS.register("scythe_ice_dragonbone", () -> SpartanWeaponryAPI.createScythe(ICE_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_LIGHTNING_DRAGONBONE = ITEMS.register("scythe_lightning_dragonbone", () -> SpartanWeaponryAPI.createScythe(LIGHTNING_DRAGONBONE, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> DAGGER_FIRE_DRAGONSTEEL = ITEMS.register("dagger_fire_dragonsteel", () -> SpartanWeaponryAPI.createDagger(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_ICE_DRAGONSTEEL = ITEMS.register("dagger_ice_dragonsteel", () -> SpartanWeaponryAPI.createDagger(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_LIGHTNING_DRAGONSTEEL = ITEMS.register("dagger_lightning_dragonsteel", () -> SpartanWeaponryAPI.createDagger(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGSWORD_FIRE_DRAGONSTEEL = ITEMS.register("longsword_fire_dragonsteel", () -> SpartanWeaponryAPI.createLongsword(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_ICE_DRAGONSTEEL = ITEMS.register("longsword_ice_dragonsteel", () -> SpartanWeaponryAPI.createLongsword(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_LIGHTNING_DRAGONSTEEL = ITEMS.register("longsword_lightning_dragonsteel", () -> SpartanWeaponryAPI.createLongsword(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> KATANA_FIRE_DRAGONSTEEL = ITEMS.register("katana_fire_dragonsteel", () -> SpartanWeaponryAPI.createKatana(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_ICE_DRAGONSTEEL = ITEMS.register("katana_ice_dragonsteel", () -> SpartanWeaponryAPI.createKatana(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_LIGHTNING_DRAGONSTEEL = ITEMS.register("katana_lightning_dragonsteel", () -> SpartanWeaponryAPI.createKatana(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SABER_FIRE_DRAGONSTEEL = ITEMS.register("saber_fire_dragonsteel", () -> SpartanWeaponryAPI.createSaber(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_ICE_DRAGONSTEEL = ITEMS.register("saber_ice_dragonsteel", () -> SpartanWeaponryAPI.createSaber(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_LIGHTNING_DRAGONSTEEL = ITEMS.register("saber_lightning_dragonsteel", () -> SpartanWeaponryAPI.createSaber(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> RAPIER_FIRE_DRAGONSTEEL = ITEMS.register("rapier_fire_dragonsteel", () -> SpartanWeaponryAPI.createRapier(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_ICE_DRAGONSTEEL = ITEMS.register("rapier_ice_dragonsteel", () -> SpartanWeaponryAPI.createRapier(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_LIGHTNING_DRAGONSTEEL = ITEMS.register("rapier_lightning_dragonsteel", () -> SpartanWeaponryAPI.createRapier(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GREATSWORD_FIRE_DRAGONSTEEL = ITEMS.register("greatsword_fire_dragonsteel", () -> SpartanWeaponryAPI.createGreatsword(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_ICE_DRAGONSTEEL = ITEMS.register("greatsword_ice_dragonsteel", () -> SpartanWeaponryAPI.createGreatsword(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_LIGHTNING_DRAGONSTEEL = ITEMS.register("greatsword_lightning_dragonsteel", () -> SpartanWeaponryAPI.createGreatsword(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HAMMER_FIRE_DRAGONSTEEL = ITEMS.register("hammer_fire_dragonsteel", () -> SpartanWeaponryAPI.createBattleHammer(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_ICE_DRAGONSTEEL = ITEMS.register("hammer_ice_dragonsteel", () -> SpartanWeaponryAPI.createBattleHammer(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_LIGHTNING_DRAGONSTEEL = ITEMS.register("hammer_lightning_dragonsteel", () -> SpartanWeaponryAPI.createBattleHammer(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> WARHAMMER_FIRE_DRAGONSTEEL = ITEMS.register("warhammer_fire_dragonsteel", () -> SpartanWeaponryAPI.createWarhammer(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_ICE_DRAGONSTEEL = ITEMS.register("warhammer_ice_dragonsteel", () -> SpartanWeaponryAPI.createWarhammer(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_LIGHTNING_DRAGONSTEEL = ITEMS.register("warhammer_lightning_dragonsteel", () -> SpartanWeaponryAPI.createWarhammer(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SPEAR_FIRE_DRAGONSTEEL = ITEMS.register("spear_fire_dragonsteel", () -> SpartanWeaponryAPI.createSpear(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_ICE_DRAGONSTEEL = ITEMS.register("spear_ice_dragonsteel", () -> SpartanWeaponryAPI.createSpear(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_LIGHTNING_DRAGONSTEEL = ITEMS.register("spear_lightning_dragonsteel", () -> SpartanWeaponryAPI.createSpear(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HALBERD_FIRE_DRAGONSTEEL = ITEMS.register("halberd_fire_dragonsteel", () -> SpartanWeaponryAPI.createHalberd(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_ICE_DRAGONSTEEL = ITEMS.register("halberd_ice_dragonsteel", () -> SpartanWeaponryAPI.createHalberd(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_LIGHTNING_DRAGONSTEEL = ITEMS.register("halberd_lightning_dragonsteel", () -> SpartanWeaponryAPI.createHalberd(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PIKE_FIRE_DRAGONSTEEL = ITEMS.register("pike_fire_dragonsteel", () -> SpartanWeaponryAPI.createPike(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_ICE_DRAGONSTEEL = ITEMS.register("pike_ice_dragonsteel", () -> SpartanWeaponryAPI.createPike(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_LIGHTNING_DRAGONSTEEL = ITEMS.register("pike_lightning_dragonsteel", () -> SpartanWeaponryAPI.createPike(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LANCE_FIRE_DRAGONSTEEL = ITEMS.register("lance_fire_dragonsteel", () -> SpartanWeaponryAPI.createLance(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_ICE_DRAGONSTEEL = ITEMS.register("lance_ice_dragonsteel", () -> SpartanWeaponryAPI.createLance(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_LIGHTNING_DRAGONSTEEL = ITEMS.register("lance_lightning_dragonsteel", () -> SpartanWeaponryAPI.createLance(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGBOW_FIRE_DRAGONSTEEL = ITEMS.register("longbow_fire_dragonsteel", () -> SpartanWeaponryAPI.createLongbow(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_ICE_DRAGONSTEEL = ITEMS.register("longbow_ice_dragonsteel", () -> SpartanWeaponryAPI.createLongbow(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_LIGHTNING_DRAGONSTEEL = ITEMS.register("longbow_lightning_dragonsteel", () -> SpartanWeaponryAPI.createLongbow(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> CROSSBOW_FIRE_DRAGONSTEEL = ITEMS.register("heavy_crossbow_fire_dragonsteel", () -> SpartanWeaponryAPI.createHeavyCrossbow(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_ICE_DRAGONSTEEL = ITEMS.register("heavy_crossbow_ice_dragonsteel", () -> SpartanWeaponryAPI.createHeavyCrossbow(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_LIGHTNING_DRAGONSTEEL = ITEMS.register("heavy_crossbow_lightning_dragonsteel", () -> SpartanWeaponryAPI.createHeavyCrossbow(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> THROWING_KNIFE_FIRE_DRAGONSTEEL = ITEMS.register("throwing_knife_fire_dragonsteel", () -> SpartanWeaponryAPI.createThrowingKnife(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ICE_DRAGONSTEEL = ITEMS.register("throwing_knife_ice_dragonsteel", () -> SpartanWeaponryAPI.createThrowingKnife(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_LIGHTNING_DRAGONSTEEL = ITEMS.register("throwing_knife_lightning_dragonsteel", () -> SpartanWeaponryAPI.createThrowingKnife(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> TOMAHAWK_FIRE_DRAGONSTEEL = ITEMS.register("tomahawk_fire_dragonsteel", () -> SpartanWeaponryAPI.createTomahawk(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_ICE_DRAGONSTEEL = ITEMS.register("tomahawk_ice_dragonsteel", () -> SpartanWeaponryAPI.createTomahawk(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_LIGHTNING_DRAGONSTEEL = ITEMS.register("tomahawk_lightning_dragonsteel", () -> SpartanWeaponryAPI.createTomahawk(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> JAVELIN_FIRE_DRAGONSTEEL = ITEMS.register("javelin_fire_dragonsteel", () -> SpartanWeaponryAPI.createJavelin(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_ICE_DRAGONSTEEL = ITEMS.register("javelin_ice_dragonsteel", () -> SpartanWeaponryAPI.createJavelin(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_LIGHTNING_DRAGONSTEEL = ITEMS.register("javelin_lightning_dragonsteel", () -> SpartanWeaponryAPI.createJavelin(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BOOMERANG_FIRE_DRAGONSTEEL = ITEMS.register("boomerang_fire_dragonsteel", () -> SpartanWeaponryAPI.createBoomerang(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_ICE_DRAGONSTEEL = ITEMS.register("boomerang_ice_dragonsteel", () -> SpartanWeaponryAPI.createBoomerang(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_LIGHTNING_DRAGONSTEEL = ITEMS.register("boomerang_lightning_dragonsteel", () -> SpartanWeaponryAPI.createBoomerang(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BATTLEAXE_FIRE_DRAGONSTEEL = ITEMS.register("battleaxe_fire_dragonsteel", () -> SpartanWeaponryAPI.createBattleaxe(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_ICE_DRAGONSTEEL = ITEMS.register("battleaxe_ice_dragonsteel", () -> SpartanWeaponryAPI.createBattleaxe(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_LIGHTNING_DRAGONSTEEL = ITEMS.register("battleaxe_lightning_dragonsteel", () -> SpartanWeaponryAPI.createBattleaxe(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> MACE_FIRE_DRAGONSTEEL = ITEMS.register("flanged_mace_fire_dragonsteel", () -> SpartanWeaponryAPI.createFlangedMace(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_ICE_DRAGONSTEEL = ITEMS.register("flanged_mace_ice_dragonsteel", () -> SpartanWeaponryAPI.createFlangedMace(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_LIGHTNING_DRAGONSTEEL = ITEMS.register("flanged_mace_lightning_dragonsteel", () -> SpartanWeaponryAPI.createFlangedMace(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GLAIVE_FIRE_DRAGONSTEEL = ITEMS.register("glaive_fire_dragonsteel", () -> SpartanWeaponryAPI.createGlaive(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_ICE_DRAGONSTEEL = ITEMS.register("glaive_ice_dragonsteel", () -> SpartanWeaponryAPI.createGlaive(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_LIGHTNING_DRAGONSTEEL = ITEMS.register("glaive_lightning_dragonsteel", () -> SpartanWeaponryAPI.createGlaive(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> QUARTERSTAFF_FIRE_DRAGONSTEEL = ITEMS.register("quarterstaff_fire_dragonsteel", () -> SpartanWeaponryAPI.createQuarterstaff(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ICE_DRAGONSTEEL = ITEMS.register("quarterstaff_ice_dragonsteel", () -> SpartanWeaponryAPI.createQuarterstaff(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_LIGHTNING_DRAGONSTEEL = ITEMS.register("quarterstaff_lightning_dragonsteel", () -> SpartanWeaponryAPI.createQuarterstaff(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PARRYING_DAGGER_FIRE_DRAGONSTEEL = ITEMS.register("parrying_dagger_fire_dragonsteel", () -> SpartanWeaponryAPI.createParryingDagger(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ICE_DRAGONSTEEL = ITEMS.register("parrying_dagger_ice_dragonsteel", () -> SpartanWeaponryAPI.createParryingDagger(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_LIGHTNING_DRAGONSTEEL = ITEMS.register("parrying_dagger_lightning_dragonsteel", () -> SpartanWeaponryAPI.createParryingDagger(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SCYTHE_FIRE_DRAGONSTEEL = ITEMS.register("scythe_fire_dragonsteel", () -> SpartanWeaponryAPI.createScythe(FIRE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_ICE_DRAGONSTEEL = ITEMS.register("scythe_ice_dragonsteel", () -> SpartanWeaponryAPI.createScythe(ICE_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_LIGHTNING_DRAGONSTEEL = ITEMS.register("scythe_lightning_dragonsteel", () -> SpartanWeaponryAPI.createScythe(LIGHTNING_DRAGONSTEEL, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> DAGGER_JUNGLE = ITEMS.register("dagger_jungle", () -> SpartanWeaponryAPI.createDagger(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_DESERT = ITEMS.register("dagger_desert", () -> SpartanWeaponryAPI.createDagger(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_JUNGLE_VENOM = ITEMS.register("dagger_jungle_venom", () -> SpartanWeaponryAPI.createDagger(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> DAGGER_DESERT_VENOM = ITEMS.register("dagger_desert_venom", () -> SpartanWeaponryAPI.createDagger(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGSWORD_JUNGLE = ITEMS.register("longsword_jungle", () -> SpartanWeaponryAPI.createLongsword(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_DESERT = ITEMS.register("longsword_desert", () -> SpartanWeaponryAPI.createLongsword(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_JUNGLE_VENOM = ITEMS.register("longsword_jungle_venom", () -> SpartanWeaponryAPI.createLongsword(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGSWORD_DESERT_VENOM = ITEMS.register("longsword_desert_venom", () -> SpartanWeaponryAPI.createLongsword(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> KATANA_JUNGLE = ITEMS.register("katana_jungle", () -> SpartanWeaponryAPI.createKatana(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_DESERT = ITEMS.register("katana_desert", () -> SpartanWeaponryAPI.createKatana(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_JUNGLE_VENOM = ITEMS.register("katana_jungle_venom", () -> SpartanWeaponryAPI.createKatana(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> KATANA_DESERT_VENOM = ITEMS.register("katana_desert_venom", () -> SpartanWeaponryAPI.createKatana(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SABER_JUNGLE = ITEMS.register("saber_jungle", () -> SpartanWeaponryAPI.createSaber(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_DESERT = ITEMS.register("saber_desert", () -> SpartanWeaponryAPI.createSaber(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_JUNGLE_VENOM = ITEMS.register("saber_jungle_venom", () -> SpartanWeaponryAPI.createSaber(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SABER_DESERT_VENOM = ITEMS.register("saber_desert_venom", () -> SpartanWeaponryAPI.createSaber(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> RAPIER_JUNGLE = ITEMS.register("rapier_jungle", () -> SpartanWeaponryAPI.createRapier(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_DESERT = ITEMS.register("rapier_desert", () -> SpartanWeaponryAPI.createRapier(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_JUNGLE_VENOM = ITEMS.register("rapier_jungle_venom", () -> SpartanWeaponryAPI.createRapier(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> RAPIER_DESERT_VENOM = ITEMS.register("rapier_desert_venom", () -> SpartanWeaponryAPI.createRapier(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GREATSWORD_JUNGLE = ITEMS.register("greatsword_jungle", () -> SpartanWeaponryAPI.createGreatsword(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_DESERT = ITEMS.register("greatsword_desert", () -> SpartanWeaponryAPI.createGreatsword(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_JUNGLE_VENOM = ITEMS.register("greatsword_jungle_venom", () -> SpartanWeaponryAPI.createGreatsword(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GREATSWORD_DESERT_VENOM = ITEMS.register("greatsword_desert_venom", () -> SpartanWeaponryAPI.createGreatsword(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HAMMER_JUNGLE = ITEMS.register("hammer_jungle", () -> SpartanWeaponryAPI.createBattleHammer(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_DESERT = ITEMS.register("hammer_desert", () -> SpartanWeaponryAPI.createBattleHammer(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_JUNGLE_VENOM = ITEMS.register("hammer_jungle_venom", () -> SpartanWeaponryAPI.createBattleHammer(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HAMMER_DESERT_VENOM = ITEMS.register("hammer_desert_venom", () -> SpartanWeaponryAPI.createBattleHammer(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> WARHAMMER_JUNGLE = ITEMS.register("warhammer_jungle", () -> SpartanWeaponryAPI.createWarhammer(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_DESERT = ITEMS.register("warhammer_desert", () -> SpartanWeaponryAPI.createWarhammer(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_JUNGLE_VENOM = ITEMS.register("warhammer_jungle_venom", () -> SpartanWeaponryAPI.createWarhammer(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> WARHAMMER_DESERT_VENOM = ITEMS.register("warhammer_desert_venom", () -> SpartanWeaponryAPI.createWarhammer(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SPEAR_JUNGLE = ITEMS.register("spear_jungle", () -> SpartanWeaponryAPI.createSpear(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_DESERT = ITEMS.register("spear_desert", () -> SpartanWeaponryAPI.createSpear(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_JUNGLE_VENOM = ITEMS.register("spear_jungle_venom", () -> SpartanWeaponryAPI.createSpear(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SPEAR_DESERT_VENOM = ITEMS.register("spear_desert_venom", () -> SpartanWeaponryAPI.createSpear(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> HALBERD_JUNGLE = ITEMS.register("halberd_jungle", () -> SpartanWeaponryAPI.createHalberd(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_DESERT = ITEMS.register("halberd_desert", () -> SpartanWeaponryAPI.createHalberd(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_JUNGLE_VENOM = ITEMS.register("halberd_jungle_venom", () -> SpartanWeaponryAPI.createHalberd(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> HALBERD_DESERT_VENOM = ITEMS.register("halberd_desert_venom", () -> SpartanWeaponryAPI.createHalberd(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PIKE_JUNGLE = ITEMS.register("pike_jungle", () -> SpartanWeaponryAPI.createPike(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_DESERT = ITEMS.register("pike_desert", () -> SpartanWeaponryAPI.createPike(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_JUNGLE_VENOM = ITEMS.register("pike_jungle_venom", () -> SpartanWeaponryAPI.createPike(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PIKE_DESERT_VENOM = ITEMS.register("pike_desert_venom", () -> SpartanWeaponryAPI.createPike(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LANCE_JUNGLE = ITEMS.register("lance_jungle", () -> SpartanWeaponryAPI.createLance(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_DESERT = ITEMS.register("lance_desert", () -> SpartanWeaponryAPI.createLance(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_JUNGLE_VENOM = ITEMS.register("lance_jungle_venom", () -> SpartanWeaponryAPI.createLance(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LANCE_DESERT_VENOM = ITEMS.register("lance_desert_venom", () -> SpartanWeaponryAPI.createLance(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> LONGBOW_JUNGLE = ITEMS.register("longbow_jungle", () -> SpartanWeaponryAPI.createLongbow(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> LONGBOW_DESERT = ITEMS.register("longbow_desert", () -> SpartanWeaponryAPI.createLongbow(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> CROSSBOW_JUNGLE = ITEMS.register("heavy_crossbow_jungle", () -> SpartanWeaponryAPI.createHeavyCrossbow(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> CROSSBOW_DESERT = ITEMS.register("heavy_crossbow_desert", () -> SpartanWeaponryAPI.createHeavyCrossbow(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> THROWING_KNIFE_JUNGLE = ITEMS.register("throwing_knife_jungle", () -> SpartanWeaponryAPI.createThrowingKnife(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_DESERT = ITEMS.register("throwing_knife_desert", () -> SpartanWeaponryAPI.createThrowingKnife(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_JUNGLE_VENOM = ITEMS.register("throwing_knife_jungle_venom", () -> SpartanWeaponryAPI.createThrowingKnife(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> THROWING_KNIFE_DESERT_VENOM = ITEMS.register("throwing_knife_desert_venom", () -> SpartanWeaponryAPI.createThrowingKnife(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> TOMAHAWK_JUNGLE = ITEMS.register("tomahawk_jungle", () -> SpartanWeaponryAPI.createTomahawk(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_DESERT = ITEMS.register("tomahawk_desert", () -> SpartanWeaponryAPI.createTomahawk(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_JUNGLE_VENOM = ITEMS.register("tomahawk_jungle_venom", () -> SpartanWeaponryAPI.createTomahawk(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> TOMAHAWK_DESERT_VENOM = ITEMS.register("tomahawk_desert_venom", () -> SpartanWeaponryAPI.createTomahawk(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> JAVELIN_JUNGLE = ITEMS.register("javelin_jungle", () -> SpartanWeaponryAPI.createJavelin(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_DESERT = ITEMS.register("javelin_desert", () -> SpartanWeaponryAPI.createJavelin(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_JUNGLE_VENOM = ITEMS.register("javelin_jungle_venom", () -> SpartanWeaponryAPI.createJavelin(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> JAVELIN_DESERT_VENOM = ITEMS.register("javelin_desert_venom", () -> SpartanWeaponryAPI.createJavelin(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BOOMERANG_JUNGLE = ITEMS.register("boomerang_jungle", () -> SpartanWeaponryAPI.createBoomerang(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_DESERT = ITEMS.register("boomerang_desert", () -> SpartanWeaponryAPI.createBoomerang(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_JUNGLE_VENOM = ITEMS.register("boomerang_jungle_venom", () -> SpartanWeaponryAPI.createBoomerang(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BOOMERANG_DESERT_VENOM = ITEMS.register("boomerang_desert_venom", () -> SpartanWeaponryAPI.createBoomerang(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> BATTLEAXE_JUNGLE = ITEMS.register("battleaxe_jungle", () -> SpartanWeaponryAPI.createBattleaxe(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_DESERT = ITEMS.register("battleaxe_desert", () -> SpartanWeaponryAPI.createBattleaxe(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_JUNGLE_VENOM = ITEMS.register("battleaxe_jungle_venom", () -> SpartanWeaponryAPI.createBattleaxe(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> BATTLEAXE_DESERT_VENOM = ITEMS.register("battleaxe_desert_venom", () -> SpartanWeaponryAPI.createBattleaxe(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> MACE_JUNGLE = ITEMS.register("flanged_mace_jungle", () -> SpartanWeaponryAPI.createFlangedMace(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_DESERT = ITEMS.register("flanged_mace_desert", () -> SpartanWeaponryAPI.createFlangedMace(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_JUNGLE_VENOM = ITEMS.register("flanged_mace_jungle_venom", () -> SpartanWeaponryAPI.createFlangedMace(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> MACE_DESERT_VENOM = ITEMS.register("flanged_mace_desert_venom", () -> SpartanWeaponryAPI.createFlangedMace(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> GLAIVE_JUNGLE = ITEMS.register("glaive_jungle", () -> SpartanWeaponryAPI.createGlaive(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_DESERT = ITEMS.register("glaive_desert", () -> SpartanWeaponryAPI.createGlaive(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_JUNGLE_VENOM = ITEMS.register("glaive_jungle_venom", () -> SpartanWeaponryAPI.createGlaive(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> GLAIVE_DESERT_VENOM = ITEMS.register("glaive_desert_venom", () -> SpartanWeaponryAPI.createGlaive(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> QUARTERSTAFF_JUNGLE = ITEMS.register("quarterstaff_jungle", () -> SpartanWeaponryAPI.createQuarterstaff(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_DESERT = ITEMS.register("quarterstaff_desert", () -> SpartanWeaponryAPI.createQuarterstaff(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_JUNGLE_VENOM = ITEMS.register("quarterstaff_jungle_venom", () -> SpartanWeaponryAPI.createQuarterstaff(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> QUARTERSTAFF_DESERT_VENOM = ITEMS.register("quarterstaff_desert_venom", () -> SpartanWeaponryAPI.createQuarterstaff(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> PARRYING_DAGGER_JUNGLE = ITEMS.register("parrying_dagger_jungle", () -> SpartanWeaponryAPI.createParryingDagger(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_DESERT = ITEMS.register("parrying_dagger_desert", () -> SpartanWeaponryAPI.createParryingDagger(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_JUNGLE_VENOM = ITEMS.register("parrying_dagger_jungle_venom", () -> SpartanWeaponryAPI.createParryingDagger(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_DESERT_VENOM = ITEMS.register("parrying_dagger_desert_venom", () -> SpartanWeaponryAPI.createParryingDagger(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));

	public static final RegistryObject<Item> SCYTHE_JUNGLE = ITEMS.register("scythe_jungle", () -> SpartanWeaponryAPI.createScythe(JUNGLE, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_DESERT = ITEMS.register("scythe_desert", () -> SpartanWeaponryAPI.createScythe(DESERT, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_JUNGLE_VENOM = ITEMS.register("scythe_jungle_venom", () -> SpartanWeaponryAPI.createScythe(JUNGLE_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
	public static final RegistryObject<Item> SCYTHE_DESERT_VENOM = ITEMS.register("scythe_desert_venom", () -> SpartanWeaponryAPI.createScythe(DESERT_VENOM, ItemGroupSF.ITEM_GROUP_SF, true));
}