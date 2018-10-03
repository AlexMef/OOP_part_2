public class Main {
    public static void main(String[] args) {
        Adress adress1 = new Adress();
        Adress adress2 = new Adress(10, "Ukraine", "Odessa", "Pushkinskaya", "12A", "23");

        adress1.setIndex(20);
        adress1.setCountry("Russia");
        adress1.setCity("DefaultCity2");

        System.out.println(adress1.getStreet());
        System.out.println("adress1 " + adress1.toString());
        System.out.println("adress2 " + adress2.toString());
    }
}
