package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RecogerArticuloPage {

	public static final Target ELEGIR_CIUDAD = Target.the("Elegir Ciudad").locatedBy("//div[contains(@class, 'proximity-filter')]");

	public static final Target SELECCIONAR_CIUDAD = Target.the("Selecciona Ciudad").locatedBy("//div[contains(@class, 'float-select')]");

	public static final Target PRIMER_TIENDA_CIUDAD = Target.the("Cantidad Articulos carrito").locatedBy("//div[@class= 'store-list-box js-store-box']");

	public static final Target VOLVER = Target.the("Cantidad Articulos carrito").locatedBy("//button[contains(text(), 'Ir al carrito')]");

}
