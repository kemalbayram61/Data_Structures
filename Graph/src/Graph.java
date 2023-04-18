import java.util.ArrayList;
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


}
