package HuMech;

public class Human implements Humaninterface {
    protected double wzrost;
    protected char plec; // m - mezczyzna // k - kobieta // c - cos innego
    protected double rozmiar_buta;
    protected boolean czy_lysy = false;
    protected String color_wlosow;
    protected int wiek;
    protected Human[] rodzice;


    void setColor_wlosow(String color){
        if(!czy_lysy){
            this.color_wlosow = color;
        }
        else{
            System.out.println("przeciez jest łysy, lol");
        }
    }

    public void setRodzice(Human matka, Human ojciec){
        rodzice = new Human[]{matka, ojciec};
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setRozmiar_buta(double rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public void setCzy_lysy(boolean czy_lysy) {
        this.czy_lysy = czy_lysy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getWzrost() {
        return wzrost;
    }

    public char getPlec() {
        return plec;
    }

    public double getRozmiar_buta() {
        return rozmiar_buta;
    }

    public boolean isCzy_lysy() {
        return czy_lysy;
    }

    public String getColor_wlosow() {
        return color_wlosow;
    }

    public int getWiek() {
        return wiek;
    }

    public Human[] getRodzice() {
        return rodzice;
    }

    public Human(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Human[] rodzice) {
        this.wzrost = wzrost;
        this.plec = plec;
        this.rozmiar_buta = rozmiar_buta;
        this.czy_lysy = czy_lysy;
        this.color_wlosow = color_wlosow;
        this.wiek = wiek;
        this.rodzice = rodzice;
    }

    @Override
    public void work(String where, int za_ile) {
        System.out.println("Pracuje");
    }

    @Override
    public void learn(String czego) {
        System.out.println("Uczy sie "+czego);
    }

    @Override
    public void run_forest() {

    }

    @Override
    public Human give_birth() {
        return null;
    }

    @Override
    public void jedz() {

    }

    @Override
    public void choruje() {

    }
}