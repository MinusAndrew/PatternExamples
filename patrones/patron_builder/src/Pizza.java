public class Pizza {
    private String comentario;
   private boolean queso, salsa, jamon, piña, champiñones, carne, pollo;

   private Pizza(Builder builder){
       this.comentario = builder.comentario;
       this.queso = builder.queso;
       this.salsa = builder.salsa;
       this.jamon = builder.jamon;
       this.piña = builder.piña;
       this.champiñones = builder.champiñones;
       this.carne = builder.carne;
       this.pollo = builder.pollo;
   }

    @Override
    public String toString() {
        return  comentario + "\n" +
                "-------------------------\n" +
                "Queso: " + (queso) + "\n" +
                "Salsa: " + (salsa) + "\n" +
                "Jamón: " + (jamon) + "\n" +
                "Piña: " + (piña) + "\n" +
                "Champiñones: " + (champiñones) + "\n" +
                "Carne: " + (carne) + "\n" +
                "Pollo: " + (pollo) + "\n";
    }

    public static class Builder {

       private String comentario;
        private boolean queso, salsa, jamon, piña, champiñones, carne, pollo;

        public Builder(String comentario){
            this.comentario = comentario;
        }

        public Builder queso(boolean b) {
            this.queso = b;
            return this;
        }

        public Builder salsa(boolean b){
            this.salsa = b;
            return this;
        }

        public Builder jamon(boolean b){
            this.jamon = b;
            return this;
        }

        public Builder piña(boolean b){
            this.piña = b;
            return this;
        }

        public Builder champiñones(boolean b){
            this.champiñones = b;
            return this;
        }

        public Builder carne(boolean b){
            this.carne = b;
            return this;
        }

        public Builder pollo(boolean b){
            this.pollo = b;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }

    }
}
