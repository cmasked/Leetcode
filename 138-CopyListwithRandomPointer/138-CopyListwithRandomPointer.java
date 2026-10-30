// Last updated: 30/10/2026, 19:25:02
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        HashMap<Node,Node>map=new HashMap<>();
19        Node curr=head;
20
21        while(curr != null){
22            Node copy= new Node(curr.val);
23            map.put(curr,copy);
24            curr=curr.next;
25
26        }
27        curr=head;
28        while(curr!=null){
29            Node copy=map.get(curr);
30            copy.next=map.get(curr.next);
31            copy.random=map.get(curr.random);
32            curr=curr.next;
33
34        }
35        return map.get(head);
36
37        
38    }
39}