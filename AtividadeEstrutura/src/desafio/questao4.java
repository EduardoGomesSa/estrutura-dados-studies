package desafio;

import java.util.Scanner;

public class questao4 {

	public static int[] increaseSize(int[] arr)
    {
        int[] newArr = new int[arr.length + 1];//Creating a new array with space for an extra element
        for(int i = 0; i < arr.length; i++)
        {
            newArr[i] = arr[i];//Copying the elements to the new array
        }
        return newArr;
    }
	
    public static void main(String[] args)
    {
    	Scanner entrada = new Scanner(System.in);
    	
        int[] arr = new int[1];
        int counter = 0, valor, querContinuar = 0;
        for(int i = 0; i <= arr.length; i++)
        {
            if(counter == arr.length)
            {
                arr = increaseSize(arr);
            }
            
            System.out.println("Digite um valor: ");
            valor = entrada.nextInt();
            
            System.out.println("Quer continuar? ");
            querContinuar = entrada.nextInt();
            
            arr[i] = valor;
            
            if(querContinuar==1) {
            	counter += 1;
            }else {
            	i = arr.length;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
