package houses;

public class ListHouses {
    private NodeHouse first = null;
    private int size = 0;

    public int size(){
        return this.size;
    }
    public void createHouse(String nameHouse, int amountCandyHouse) {
        NodeHouse newHouse = new NodeHouse(nameHouse, amountCandyHouse);

        if (this.first == null){
            this.first = newHouse;
        } else {
            NodeHouse iterator = this.first;
            while (iterator.getNext() != null){
                iterator = iterator.getNext();
            }
            iterator.setNext(newHouse);
        }
        this.size++;
    }

    public boolean getFreeHouse(){
        NodeHouse iterator = this.first;

        while (iterator != null){
            if(iterator.getAvailable() != false){
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }

    public String[] getListHouses(){
        String[] list = new String[this.size];
        NodeHouse iterator = this.first;
        int count = 0;

        while (iterator != null){
            list[count] = iterator.getNameHouse();
            /*if (iterator.getShippingItems() > 0){
                iterator.setShippingItems(iterator.getShippingItems() - 1);
                this.totalItemsSold++;
            }
            if (iterator.getShippingItems() == 0) {
                iterator.setAvailable(true);
            }*/
            System.out.print("| " + iterator.getNameHouse() + " | ");
            count++;
            iterator = iterator.getNext();
        }
        System.out.println();
        return list;
    }
}
