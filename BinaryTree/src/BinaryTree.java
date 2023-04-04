import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T>{
    private Node root;

    private List<Node> dfsList;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public List<Node> getBFS(){
        List<Node> nodeList = new ArrayList<>();
        if(this.root != null){
            List<Node> layerNodes    = new ArrayList<>();
            List<Node> subLayerNodes = new ArrayList<>();
            layerNodes.add(this.root);
            while (layerNodes.size() > 0){
                for(Node node : layerNodes){
                    nodeList.add(node);
                    if(node.getLeft() != null) subLayerNodes.add(node.getLeft());
                    if(node.getRight() != null) subLayerNodes.add(node.getRight());
                }
                layerNodes.clear();
                layerNodes.addAll(subLayerNodes);
                subLayerNodes.clear();
            }
        }
        return nodeList;
    }

    private void prepareDFS(Node node){
        if (node == null)
            return;
        this.prepareDFS(node.getLeft());
        this.dfsList.add(node);
        this.prepareDFS(node.getRight());
    }

    public List<Node> getDFS(){
        this.dfsList = new ArrayList<>();
        this.prepareDFS(this.root);
        return this.dfsList;
    }
}
