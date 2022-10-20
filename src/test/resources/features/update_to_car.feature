
# language: es
Característica: Update to car
  Como usuario web
  Quiero Editar  los productos del carro de compras
  Para comprar

  Escenario: Solicitar Recoger en tienda Fisica
    Cuando "Rodolfo" quiere recoger su producto "Xiaomi" en tienda Fisica mas cercana
    Entonces debe encontar 1 articulo en el carrito

  Escenario: Aumentar la cantidad de Celulares
    Cuando "Rodolfo" quiere aumentar en 2 unidades la cantidad de celular "Xiaomi"
    Entonces debe mostrar 1 articulos en el carrito

  Escenario: Eliminar el articulo del carrito
    Cuando "Rodolfo" quiere eliminar el celular "Xiaomi" del carrito
    Entonces debe mostrar que el carrito esta con 0 articulos


