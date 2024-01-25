package LinkedList;
public class listnode {
    int val;
    listnode next;

    listnode() {
    }

    listnode(int val) {
        this.val = val;
    }

    listnode(int val, listnode next) {
        this.next = next;
        this.val = val;
    }

    public static void main(String[] args) {
        listnode a = new listnode(2, new listnode(4, new listnode(3)));
        listnode b = new listnode(5, new listnode(6, new listnode(4)));

        listnode kk = addTwoNumbers(a, b);

        while (kk != null) {
            System.out.print(kk.val + " ");
            kk = kk.next;
        }
    }


    public static listnode addTwoNumbers(listnode l1, listnode l2) {
        listnode dummyHead = new listnode(0);
        listnode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {  
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new listnode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new listnode(carry);
        }

        return dummyHead.next;
    }


}
