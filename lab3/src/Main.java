public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {new skirt(), new tshirt(), new trousers(), new tie()};

        SportMaster sportmaster = new SportMaster();
        sportmaster.dressWomen(clothes);
        sportmaster.dressMan(clothes);
    }
}
