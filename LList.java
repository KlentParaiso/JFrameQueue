
package Java;


public class LList {
  Node top;
    int size=0;
   
    
    public void Queue(String v){
        Node n = new Node(v);
  
        n.link = top;
        top = n;
        size++;
    }
    
    public Object DeQueue(){
         
         Object object = null;
        try {
            if (top == null) {
                object = null;
            } else if (top.link == null) {
                object = top.val;
                top = null;
            } else {
                Node tempPtr = top;
                while (tempPtr.link.link != null) {
                    tempPtr = tempPtr.link;
                }
                object = tempPtr.link.val;
                tempPtr.link = null;
            }
        } catch (NullPointerException e) {
            System.out.println("Queue is empty \n" + e.getMessage());
        }

        return object;
    }

    
    public int size(){
        
        int s = 0;
        Node tempPtr = top;
        
        while(tempPtr !=null){
            s++;
            tempPtr = tempPtr.link;
        }
        
        return s;
    }
    
    public String toString(){
        
       
        if (size() != 0) {
            String output = "";
            String elements = "";
            Node tempPtr = top;

            while (tempPtr != null) {
              
                elements =  tempPtr.val + "\n" + elements;
                tempPtr = tempPtr.link;
         
            }
            return output + elements;
        } else {
            return "Queue is currently empty.";
        }

    }
    
    
}
class Node {
    String val;
    Node link;
    public Node(String v) {
        val = v;
    }
}