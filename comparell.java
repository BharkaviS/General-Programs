  // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr1=head1;
        SinglyLinkedListNode curr2=head1;
        int a=0,b=0,c=0;
        while(curr1!=null){
            a++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            b++;
            curr2=curr2.next;
        }
        if(a!=b){
            return false;
        }
        else{
            while((head1!=null && head2!=null)&&(head1.data==head2.data)){
                c++;
                head1=head1.next;
                head2=head2.next;
            }
            if(c==a){
                return true;
            }
            else{
                return false;
            }
        }

    }
