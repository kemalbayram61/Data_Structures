public class Main {
    public static void main(String [] args){
        LinkList linkList = new LinkList();
        linkList.push("Kemal Bayram");
        linkList.push("Melih Yazıcı");
        linkList.append(61);
        linkList.print();
        int data = (int)linkList.pop();
        System.out.println("Deleted item:" + data);
        linkList.print();
    }
}
