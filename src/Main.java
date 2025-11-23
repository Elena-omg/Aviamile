public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 18_475;
        int miles = service.calkulate(price);
        System.out.println(miles);
    }
}


