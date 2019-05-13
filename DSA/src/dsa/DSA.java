/**
 *
 * @author Desubham
 */
package dsa;
import java.util.*;

class Node{
    int data;
    Node next;
    void enterDataEnd(int nodeData){
        data = nodeData;
    }
    void display(){
        System.out.print(data+"->"); 
    }
}
public class DSA {

    public static void main(String[] args) {
        Node start;
        Node current;
        Node temp;
        start = current = null;
        while(true){
        System.out.println("Enter your choice?");
        System.out.println("Choices : 1-Enter Data at End");
        System.out.println("Choices : 2-Enter Data at a position");
        System.out.println("Choices : 3-Delete data //under process");
        System.out.println("Choices : 4-Display data");
        System.out.println("Choices : 5-Exit");
        Scanner scn = new Scanner(System.in);
        int choice;
        choice = scn.nextInt();
        
        int cdata;
        /*choice 1 - enter data at end*/
        while(choice == 1){
            temp = new Node();
            cdata = scn.nextInt();
            if(start == null){
                start = temp;
                current = temp;
            }
            else{
                current.next = temp;
                current = temp;
            }
            current.enterDataEnd(cdata);
            System.out.println("Enter more values?Press 1 to continue Else enter 0-zero");
            choice = scn.nextInt();
        }
        if(choice == 4){
        //current.next = null;
        temp = start;
        System.out.print("The values are : ");
        while(temp!=null){
           temp.display();
           temp = temp.next;
            }
        System.out.println("END");
        }
        if(choice == 2){//Enter Data at a given position
            int pos;
            current = start;
            System.out.println("Enter the position : ");
            pos = scn.nextInt();
            while(pos>1){
                current = current.next;
                pos--;
            }
            if(current!=null){
                System.out.println("Enter the data at this position : ");
                cdata = scn.nextInt();
                temp = new Node();
                temp.next = current.next;
                current.next = temp;
                current.enterDataEnd(cdata);
            }
            else{   System.out.println("Invalid position : ");
            }
        }
        if(choice == 5)
            break;
     }
    }
}
