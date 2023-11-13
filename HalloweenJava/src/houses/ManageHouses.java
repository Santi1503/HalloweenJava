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

    public int totalAmountCandyHouse(){
        return this.listHouses.getTotalAmountCandyHouse();
    }

    public void substractCandyHouse(int candyToGive){
        this.listHouses.substractCandyHouse(candyToGive);
    }

    public void availableHouse(boolean availableHouse){
        this.listHouses.setAvailableHouse(availableHouse);
    }

    public int giveCandy(){
        if(totalAmountCandyHouse() > 5){
            int candyToGive = 1 + (int)(Math.random() * ((5 - 1) + 1));
            return candyToGive;
        } else{
            int candyToGiveFinal = this.listHouses.getTotalAmountCandyHouse();
            availableHouse(false);
            return candyToGiveFinal;
        }
    }
}
