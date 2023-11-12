package children;
public class ListChildren {
    private NodeChild first = null;
    private int size = 0;

    public int size(){
        return this.size;
    }

    public void createChild(){
        NodeChild newChild = new NodeChild();

        if (this.first == null){
            this.first = newChild;
        } else {
            NodeChild iterator = this.first;
            while (iterator.getNext() != null){
                iterator = iterator.getNext();
            }
            iterator.setNext(newChild);
        }
        this.size++;
    }

    public boolean getIsEmpty(){

        if(this.first != null){
            return true;
        } else {
            return false;
        }
    }

    public void deleteChildrenInQueue() {
        if(this.first != null){
            this.first = this.first.getNext();
            this.size--;
        }
    }
}
