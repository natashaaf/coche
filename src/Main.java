import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Motor motorDiesel = new Motor(150, 4);
        Motor motorGasolina = new Motor(170, 2);

        Coche coche1 = new Coche("Fiesta", "Ford", motorDiesel);
        Coche coche2 = new Coche("Fiesta", "Fiesta", motorGasolina);
        Coche coche3 = new Coche("Fox", "Fiesta", motorGasolina);
        Coche coche4 = new Coche("Fiesta", "popo", motorDiesel);

        ArrayList<Coche> listaCoches = new ArrayList<>();

        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);


        for (Coche c : listaCoches) {
            if (c.getMotor() == null) {
                c.setMotor(motorDiesel);
            }
            c.arrancar();
            c.detener();

            System.out.println();
        }
    }

}