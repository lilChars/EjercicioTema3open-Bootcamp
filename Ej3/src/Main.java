public class Main {
    public static void main(String[] args) {
        int resultant = add(2, 3, 5);
        System.out.println(resultant);
        Coche miCoche = new Coche(3);
        miCoche.agregarPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static class Coche {
        private int numPuertas;

        public Coche(int numPuertas) {
            this.numPuertas = numPuertas;
        }

        public int getNumPuertas() {
            return numPuertas;
        }

        public void agregarPuerta() {
            numPuertas++;
        }
    }

}
