package houses;

public class NodeHouse {
    private boolean available;
    private String nameHouse;
    private int amountCandyHouse;
    private NodeHouse next;
    public NodeHouse(String nameHouse, int amountCandyHouse){
        setNameHouse(nameHouse);
        setAvailable(true);
        setAmountCandyHouse(amountCandyHouse);
    }

    public boolean getAvailable() {
        return available;
    }

    public String getNameHouse() {
        return this.nameHouse;
    }

    public int getAmountCandyHouse(){
        return this.amountCandyHouse;
    }
    public NodeHouse getNext(){
        return this.next;
    }

    public void setNext(NodeHouse next){
        this.next = next;
    }

    public void setNameHouse(String nameHouse){
        this.nameHouse = nameHouse;
    }

    public void setAmountCandyHouse(int amountCandyHouse) {
        this.amountCandyHouse = amountCandyHouse;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
