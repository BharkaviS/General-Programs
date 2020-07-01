// Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        //New node creation->
        if(llist==null){
            llist=n;
            return n;
        }
            n.next=llist;
            llist=n;
            return llist;
    }

