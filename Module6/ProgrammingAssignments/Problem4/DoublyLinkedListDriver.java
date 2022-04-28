package Problem4;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        
        list.addANodeToStart("firstNode");
        list.addANodeToStart("secondNode");
        list.goToNext();
        list.addANodeToStart("thirdNode");
        list.resetIteration();
        list.goToNext();
        list.addANodeToStart("middleNode");
        list.showList();
        list.deleteHeadNode();
        list.showList();
        list.goToNext();
        list.goToNext();
        list.addANodeToStart("lastNode1");
        list.addANodeToStart("lastNode2");
        list.showList();
        list.goToPrevious();
        list.deleteCurrentNode();
        list.showList();
        list.addANodeToStart("newHead");
        list.showList();
        list.findInList("lastNode1");
        list.findInList("Not in list");
        list.showList();
    }
}
