import java.util.ArrayList;
import java.util.List;

public class Node <T>{
    private T data;
    private List<Double> accessCostList;
    private List<Node> childList;

    public Node(T data){
        this.data = data;
        this.childList = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Node> getChildList() {
        return childList;
    }

    public void setChildList(List<Node> childList) {
        this.childList = childList;
    }

    public List<Double> getAccessCostList() {
        return accessCostList;
    }

    public void setAccessCostList(List<Double> accessCostList) {
        this.accessCostList = accessCostList;
    }

    public void clearChildList(){
        this.childList.clear();
    }

    public void addChild(Node node){
        this.childList.add(node);
    }


}
