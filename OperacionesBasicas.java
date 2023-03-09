
package operacionesbasicas;

//Código ejecutado por YORNE SANTOS
//Del grupo SC 

public class OperacionesBasicas {
    
	//declaramos nuestra variables
    int num1 = 23, num2 = 10, num3 = 6;
    float suma, resta, multi, division;

    public void OperacionSuma(){
        
        // suma
        suma= num1 + valor2 + valor3;
        System.out.println("La suma es: " + suma);
    }    
        
    public void OperacionResta(){    
        // resta
        resta= num1 - num2 - num33;
        System.out.println("La resta es: " + resta);
    }    
    public void OperacionMulti(){
        // multiplicación
        multi = num1 * num2 * num3;
        System.out.println("La multiplicación es: " + multiplicación);
        
    }    
    public void OperacionDivision(){
        // división
        division = num1 / num2 / num3;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {     //plasmamos cada operación en pantalla   
        OperacionesBasicas ope_Suma = new OperacionesBasicas();
        ope_Suma.OperacionSuma();
         OperacionesBasicas ope_Resta = new OperacionesBasicas();
         ope_Resta.OperacionResta();
         OperacionesBasicas ope_Multi = new OperacionesBasicas();
         ope_Multi.OperacionMulti();
         OperacionesBasicas ope_Divison = new OperacionesBasicas();
         ope_Divison.OperacionDivision();
    }
    
}
