//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pizza pizzaDeQueso = new Pizza.Builder("Pizza de queso")
            .salsa(true)
            .queso(true)
            .build();
    Pizza pizzaMixta = new Pizza.Builder("Pizza Mixta")
            .salsa(true)
            .queso(true)
            .carne(true)
            .pollo(true)
            .build();
    Pizza pizzaHawaiana = new Pizza.Builder("Pizza hawaiana")
            .salsa(true)
            .queso(true)
            .jamon(true)
            .piña(true)
            .build();


    System.out.println(pizzaDeQueso);
    System.out.println(pizzaHawaiana);
    System.out.println(pizzaMixta);
}
