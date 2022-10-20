package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
	public static final Target ARTICULOS_CARRITO = Target.the("Articulos carrito").locatedBy("//ul[@class='item__list item__list__cart']/li");

	public static final Target NOMBRE_ARTICULO_CARRITO = Target.the("Nombre Articulos carrito").locatedBy("//span[contains(text(), '{0}')]");

	public static final Target CANTIDAD_ARTICULO_CARRITO = Target.the("Cantidad Articulos carrito").locatedBy("//option[@value='2']");

	public static final Target ELIMINAR_ARTICULO_CARRITO = Target.the("Eliminar Articulos carrito").locatedBy("//a[@class='item__interactions__button']");

	public static final Target RECOGER_TIENDA = Target.the("Recoger en Tienda").locatedBy("//div[contains(@class, 'cart-delivery-mode__store')]");

}
