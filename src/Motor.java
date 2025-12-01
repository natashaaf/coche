public class Motor {
    private int potencia;
    private int numBujias;


    //Constructor con los atributos
    public Motor(int potencia, int numBujias) {
        this.potencia = potencia;
        this.numBujias = numBujias;

    }

    //Getters e setters
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumBujias() {
        return numBujias;
    }

    public void setNumBujias(int numBujias) {
        this.numBujias = numBujias;
    }

    public void encender(){
        System.out.println("Encendendo");

    }
    public void apagar(){
        System.out.println("Esta apagado");

    }
}
