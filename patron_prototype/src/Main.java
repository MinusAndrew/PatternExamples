//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws CloneNotSupportedException {

    Pizza pizzaDeQueso = new Pizza.Builder("Pizza de queso")
            .salsa(true)
            .queso(true)
            .build();

    Pizza pizzaDeQuesoYChampiñones = pizzaDeQueso.clone();
    pizzaDeQuesoYChampiñones.setComentario("Pizza de queso y champiñones");
    pizzaDeQuesoYChampiñones.setChampiñones(true);

    System.out.println(pizzaDeQueso);
    System.out.println(pizzaDeQuesoYChampiñones);
}
