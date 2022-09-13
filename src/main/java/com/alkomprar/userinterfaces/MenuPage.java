package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
	public static final Target CATEGORIA = Target.the("Categoria {0} del menu").locatedBy("//li[@data-category='{0}']/a[@title='{0}']");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//ul[@class='main-navigation__subcategories js-main-navigation-subcategories']//li[@data-category='{0}']//a[@data-subcategory=\"Celulares\"]");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//a[@class=\"main-navigation__subcategory__subitem__label js-megamenu-datalayer-product\"]//../a[1]");
	public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@title=\"Marca\"]//..//a[@data-name]");
	public static final Target CARRITO = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@href='/cart']");
}