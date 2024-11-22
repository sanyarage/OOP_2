public class SportMaster {

    public void dressMan(Clothes[] clothesArray) {
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof MenClothing) {
                ((MenClothing) clothes).dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothesArray) {
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof WomenClothing) {
                ((WomenClothing) clothes).dressWoman();
            }
        }
    }
}
