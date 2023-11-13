package children;

public class ManageChildren {
    private ListChildren listChildren;

    public ManageChildren(){
        this.listChildren = new ListChildren();
    }
    public void addChild(){
        this.listChildren.createChild();
    }

    public boolean isEmpty(){
        return listChildren.getIsEmpty();
    }

    public void deleteFirstChildrenInQueue(){
        listChildren.deleteChildrenInQueue();
    }

    public int candyAmountFirstChild(){
        return  listChildren.getCandyAmountFirstChild();
    }

    public void giveCandyAmountFirstChild(int giveCandyAmountFirstChild){
        listChildren.setGiveCandyAmountFirstChild(giveCandyAmountFirstChild);
    }

    public int size(){
        return listChildren.size();
    }
}
