//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4,1);
        Triangolo triangolo = new Triangolo(5,3);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano
// Forma ed implementano il metodo per il calcolo dell'area.