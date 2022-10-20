
package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateToCarStepDefinitions {

    @Cuando("{string} quiere recoger su producto {string} en tienda Fisica mas cercana")
    public void rodolfoQuiereRecogerSuPedidoEnTiendaFisica(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                RecojerTiendaFisica.elemento(item)
        );
    }
    @Entonces("debe encontar {int} articulo en el carrito")
    public void debeVerEnElCarritoDeComprarIphone(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    @Cuando("{string} quiere aumentar en 2 unidades la cantidad de celular {string}")
    public void rodolfoQuiereumentarlasunidadesdecelular(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AumentarCantidadCarrito.elemento(item)
        );
    }
    @Entonces("debe mostrar {int} articulos en el carrito")
    public void debeMostrarEnElCarritoElAumento(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    @Cuando("{string} quiere eliminar el celular {string} del carrito")
    public void rodolfoQuiereEliminarelCelular(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                EliminarCarrito.elemento(item)
        );
    }
    @Entonces("debe mostrar que el carrito esta con {int} articulos")
    public void debeMostrarQueElCarritoEstaVacio(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }


}