/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasArray;

/**
 *
 * @author ASUS
 */
public class Palindromo {
    
    PilaLineal stack;
    PilaLineal stackEditable;
    PilaLineal stackBack;
    
    public boolean esPalindromo(String element) throws Exception{
        
        boolean rta = false;
        
        llenarPila(element);
        llenarPilaAlreves(element);

        if(stack.pop().equals(stackBack.pop())){
            rta = true;
        }
        
        return rta;
    }
    
    public void llenarPila(String element) throws Exception{
        stack = new PilaLineal(obtenerTamanio(element));
        stackEditable = new PilaLineal(obtenerTamanio(element));
        for (int i = 0; i < obtenerTamanio(element); i++) {
            char lt = element.charAt(i);
            String letra = String.valueOf(lt).toLowerCase().trim().replaceAll("á","a").replaceAll("é", "e").replaceAll("í", "i").replaceAll("ó", "o").replaceAll("ú", "u");
            stack.push(letra);
            stackEditable.push(letra);
        }
    }
    
    public void llenarPilaAlreves(String element) throws Exception{
        stackBack = new PilaLineal(obtenerTamanio(element));
        for (int i = 0; i < obtenerTamanio(element); i++) {
            stackBack.push(stackEditable.pop());
            
        }
    }
    
    public int obtenerTamanio(String element){
        return element.length();
    }
    
    public String imprimir() throws Exception{
        return "La palabra ingresada es: "+ stack.print() + " \nLa pila a comparar es: " + stackBack.print();
    }
    
    public String imprimirRta(String element) throws Exception{
        String rta;
        if(esPalindromo(element)){
            rta = "La palabra es Palindromo";
        }else{
            rta = "La palabra no es Palindromo";
        }
        return rta;
    }
}

