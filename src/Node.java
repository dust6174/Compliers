import java.util.Vector;

public class Node {

//有删除方法待写

    enum Type{
        threadSpec,
        identifier ,
        featureSpec ,
        flowSpec,
        association,
        portSpec,
        parameterSpec,
        none ,
        IOtype ,
        reference ,
        flowSourceSpec ,
        flowSinkSpec ,
        flowPathSpec ,
        splitter,
        decimal,
    }

    String value = null;//值
    Type type = null;//类型
    Vector<Node> childs;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Vector<Node> getChilds() {
        return childs;
    }

    public void setChilds(Vector<Node> childs) {
        this.childs = childs;
    }

    public Node(String value, Type type) {
        this.value = value;
        this.type = type;
        this.childs = new Vector<Node>();
    }

    public Node(Type type) {
        this.type = type;
        this.childs = new Vector<Node>();
    }

    @Override
    public String toString() {
        String string = "";
         string = "Node：" +
                "value='" + value + '\'' +
                ", type=" + type +
                ", childs:\n" ;

        for(Node child : childs){
            string += child.toString()+"\n";
        }

        string += '}';

        return string;
    }

    public void remove_all(){

    }
}
