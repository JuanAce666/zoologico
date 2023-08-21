package org.example;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia() {
    }

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "papa=" + papa +
                ", mama=" + mama +
                ", hijo=" + hijo +
                '}';
    }

    public Animal getPapa() {
        return papa;
    }

    public void setPapa(Animal papa) {
        this.papa = papa;
    }

    public Animal getMama() {
        return mama;
    }

    public void setMama(Animal mama) {
        this.mama = mama;
    }

    public Animal getHijo() {
        return hijo;
    }

    public void setHijo(Animal hijo) {
        this.hijo = hijo;
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.nombre+
                        "\nLa mamá es: "+this.mama.nombre+
                        "\nEl hijo es: "+this.hijo.nombre
        );
    }

    public void tenerHijo(String nombre){

        if(this.papa.pareja!=null){

            Animal hijo= new Animal();
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }


}
