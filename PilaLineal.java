/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasArray;



/**
 *
 * @author ASUS
 */
public class PilaLineal {

    private int top;
    private String[] list;

    public PilaLineal(int size) {
        top = -1;
        list = new String[size];
    }

    public void push(String element) throws Exception {
        if (!isFull()) {
            top++;
            list[top] = element;

        } else {
            throw new Exception("La pila esta llena, no se pueden ingresar mas datos.");
        }
    }

    public String pop() throws Exception{
        if(!isEmpty()){
            String element = list[top];
        top--;
        return element;
        }else{
            throw new Exception("La pila esta vacia, por lo que no se puede realizar pop");
        }
        
    }

    public void clear() throws Exception{
        
        if(!isEmpty()){
            for (int i = 0; i < list.length; i++) {
            list[i]=null;      
        }
        
        top = -1;
        }else{
            throw new Exception("La pila ya esta vacia, no se puede limpiar");
        }
        
    }
    
    public String getTop() throws Exception{
        if(!isEmpty()){
        return list[top];
        }
        else{
            throw new Exception("No se puede obtener el dato de la cima, porque la lista está vacía");
        }
    }

    public String print() throws Exception{
        StringBuffer sb = new StringBuffer("");

        if (!isEmpty()) {
//            Node<E> current = head;
//            sb.append("[");
//            for (int i = 0; i < size; i++) {
//                sb.append(current.getData());
//                current = current.getNext();
//                if (current != null) {
//                    sb.append(", ");
//                } else {
//                    sb.append("]");
//                }
//            }
            for (int i = 0; i < list.length; i++) {
                sb.append(list[i]);
                
            }
            return sb.toString();

        } else {
            throw new Exception("No se puede imprimir la pila, esta vacia");
        }
        
    }
    
    public boolean isFull() {
        return top == list.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
