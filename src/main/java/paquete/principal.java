/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 *
 * @author MargaritaT
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("        Colas con prioridad");
        System.out.println("========================================");
        colaprioridad<String> cola1 = new colaprioridad<String>(7);
        cola1.enqueue(1,"Nacho");
        cola1.enqueue(1, "Fernando");
        cola1.enqueue(3, "Fatima");
        cola1.enqueue(1, "Abril");
        cola1.enqueue(3, "Jose");
        cola1.enqueue(3, "Carlos");
        cola1.enqueue(5, "Miguel");
        cola1.enqueue(4, "Natalia");
        cola1.enqueue(1, "Facbian");
        cola1.enqueue(2, "Angelica");
        cola1.enqueue(1, "Ernesto");
         System.out.println("tamanio de la cola");
        System.out.println(cola1.length());
        System.out.println("Se elimina a "+cola1.front()+" de la cola prioritaria");
        cola1.dequeue();
        System.out.println("nuevo tamanio de la cola");
        System.out.println(cola1.length());
        System.out.println("Sus elementos son:");
        //imprimimos los valores de la cola 
        while(cola1.length()!=0)//ira imprimiendo los datos que encuntre al principio de la cola mientras la lista que recorre no sea 0 
            //que significa que se llogo al final de la cola 
                {
                    System.out.println(cola1.front());//llamamos al el primer elemento prioritario 
                    cola1.dequeue();//elimina el dato que se encuntra en la cabezara de la cola 
                    //de ese modo se reduce su tamaño hasta llegar a 0 para salir del bucle y terminar imprimiendo la cola
                }
    }
    
}
