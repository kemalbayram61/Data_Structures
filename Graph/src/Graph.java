import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph <T>{
    private List<Node> nodeList;

    public Graph(Node initialNode){
        this.initializeNodeList();
        this.nodeList.add(initialNode);
    }

    public Graph(){
        this.initializeNodeList();
    }

    private void initializeNodeList(){
        this.nodeList = new ArrayList<>();
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public static List<Node> getMockNodeList(){
        Node nodeTrabzon   = new Node("Trabzon");
        Node nodeGiresun   = new Node("Giresun");
        Node nodeGumushane = new Node("Gümüşhane");
        Node nodeRize      = new Node("Rize");
        Node nodeOrdu      = new Node("Ordu");
        Node nodeArtvin    = new Node("Artvin");

        nodeTrabzon.setChildList(Arrays.asList(nodeGiresun, nodeRize, nodeGumushane));
        nodeTrabzon.setAccessCostList(Arrays.asList(132, 79, 102));

        nodeGiresun.setChildList(Arrays.asList(nodeOrdu, nodeTrabzon, nodeGumushane));
        nodeGiresun.setAccessCostList(Arrays.asList(44, 132, 164));

        nodeGumushane.setChildList(Arrays.asList(nodeTrabzon, nodeGiresun));
        nodeGumushane.setAccessCostList(Arrays.asList(102, 164));

        nodeRize.setChildList(Arrays.asList(nodeTrabzon, nodeArtvin));
        nodeRize.setAccessCostList(Arrays.asList(79,148));

        return Arrays.asList(nodeTrabzon, nodeGiresun, nodeGumushane, nodeRize, nodeOrdu, nodeArtvin);
    }
}
