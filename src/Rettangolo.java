public class Rettangolo implements Forma{
    int base;
    int altezza;

    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea(){
        int area = base * altezza;
        System.out.println(area);
    }
}
