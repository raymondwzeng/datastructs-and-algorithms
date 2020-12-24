package DataStructures;

public class LinkedListCustom {
    private class Node{
        int value;
        Node nextNode;
        public Node(int value)
        {
            this.value = value;
        }
        public int getValue()
        {
            return this.value;
        }
    }

    Node head;
    int length;

    public Node addNode(int value)
    {
        if(this.head == null)
        {
            this.head = new Node(value);
            return this.head;
        }
        Node currentNode = this.head;
        while(currentNode.nextNode != null)
        {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = new Node(value);
        this.length++;
        return currentNode.nextNode;
    }

    public Node removeNode(int value) //Removes a node of a specific value. That does mean though that in the case of duplicate values the first one will be deleted.
    {
        Node currentNode = this.head;
        Node removedNode;
        while(currentNode.nextNode != null)
        {
            if(currentNode.nextNode.getValue() == value)
            {
                removedNode = currentNode.nextNode; //Set the removed node to point to the next, which will be removed soon.
                if(currentNode.nextNode.nextNode != null)
                {
                    currentNode.nextNode = currentNode.nextNode.nextNode; //Set the current node to the next next node
                } else {
                    currentNode.nextNode = null; //Since the next next is null, then we just ignore. This would be the "tail".
                }
                this.length -= 1; //Decrease length by one.
                return removedNode;
            }
        }
        return null;
    }

    public String toString()
    {
        String output = "";
        Node thisNode = this.head;
        while(thisNode != null)
        {
            output += thisNode.getValue() + " ";
            thisNode = thisNode.nextNode;
        }
        return output;
    }
}
