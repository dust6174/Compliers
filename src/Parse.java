import java.io.*;

public class Parse {

    //行号待补充
    //每次调用完后要关闭流 重置一些静态变量

    static String[] tokens;
    static Node root;

    public static void  parsing(BufferedReader bufferedReader, PrintWriter printWriter) throws IOException {

        String current = "";
        while((current = bufferedReader.readLine()) != null ){
                //System.out.println(current);
                tokens = current.split("\\s+");//第一行
                root = new Node(Node.Type.threadSpec);
                Node begin = new Node(tokens[1], Node.Type.identifier);
                root.childs.add(begin);
                tokens = null;
                current = bufferedReader.readLine(); //第二行
                current = bufferedReader.readLine(); //第三行
                Node featureSpec = new Node(Node.Type.featureSpec);
                root.childs.add(featureSpec);
                tokens = current.split("\\s+");
                features(tokens,featureSpec);
                tokens = null;
                current = bufferedReader.readLine(); //第四行
                current = bufferedReader.readLine(); //第五行
                Node flowSpec = new Node(Node.Type.flowSpec);
                root.childs.add(flowSpec);
                tokens = current.split("\\s+");
                flows(tokens,flowSpec);
                tokens = null;
                current = bufferedReader.readLine(); //第六行
                current = bufferedReader.readLine(); //第七行
                tokens = current.split("\\s+");
                Node association = new Node(Node.Type.association);
                root.childs.add(association);
                properties(tokens,association);
                tokens = null;
                current = bufferedReader.readLine(); //第八行
                tokens = current.split("\\s+");
                Node end = new Node(tokens[1], Node.Type.identifier);
                root.childs.add(end);
                tokens = null;

                bufferedReader.readLine(); //第九行 空行
                printWriter.println(root.toString());//打印结果
                root.remove_all();
                root = null;
        }



    }

    private static boolean isIdentifier(String string){
        return false;
    }
    private static boolean isDecimal(String string){
        return false;
    }
    private static void features(String[] tokens, Node featureSpec){
        if(tokens.length == 1){
            if(tokens[0].equals("none")){
                Node none = new Node(Node.Type.none);
                featureSpec.childs.add(none);
                return ;
            }
        }
        //
    }
    private static void flows(String[] tokens, Node flowSpec){
        if(tokens.length == 1){
            if(tokens[0].equals("none")){
                Node none = new Node(Node.Type.none);
                flowSpec.childs.add(none);
                return;
            }
        }
        //
    }
    private static  void properties(String[] tokens, Node association){
        if(tokens.length == 1){
            if(tokens[0].equals("none")){
                Node none = new Node(Node.Type.none);
                association.childs.add(none);
                return;
            }
        }
        //
    }
}
