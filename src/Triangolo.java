public class Triangolo implements Forma{
    int base;
    int altezza;

    Triangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea(){
        int area = base * altezza / 2;
        System.out.println(area);
    }
}
