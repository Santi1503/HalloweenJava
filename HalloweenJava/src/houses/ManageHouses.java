package houses;

public class ManageHouses {
    private ListHouses listHouses;

    public ManageHouses(){
        this.listHouses = new ListHouses();
    }

    public boolean freeHouse(){
        return this.listHouses.getFreeHouse();
    }
    public void addHouse(String nameHouse, int amountCandyHouse){
        this.listHouses.createHouse(nameHouse, amountCandyHouse);
    }

    public String[] listHouses(){
        return this.listHouses.getListHouses();
    }


}
