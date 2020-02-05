/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10-12S18068 Paulus Richardo
 * @author 10-12S18035 Angelina Sinaga
 */
    import java.util.ArrayList;
public class Main {
    /* program entry point */
    public static void main(String[] _args){
        System.out.println("Hello, world!");
    
    //declaring and manipulating primitive variables
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    
    System.out.println(gear + ", " + result + ", " + b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
    System.out.println(gear + ", " + result + ", " + b);
    
    //26 in hecadecimal and binary
    int hexVal = 0x1a;
    int binVal = 0b11010;
    
    System.out.println(hexVal + ", " + binVal);
    
    // intantiating and manipulating objects
    String name = "Wiro Sableng";
    Short gearObject = 1;
    Boolean resultObj = true;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    name = name.toUpperCase();
    gearObject++;
    resultObj = (result == false) || !resultObj;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    // array, collections, and loop
    int[][] numbers = new int[10][10];
   
    for (int i = 0; i < numbers.length; ++i) {
        for (int j = 0; j < numbers[i].length; ++j) {
            numbers[i][j] = i + j;
        }
    }

    for (int i = 0; i < numbers.length; ++i) {
        for (int j = 0; j < numbers[i].length; ++j) {
            System.out.print(numbers[i][j] + " ");
        }
        
    System.out.println();
    }
    
    //challenge 
    ArrayList<Integer> number = new ArrayList<Integer>();
    
    for (int i = 0; i < 19; ++i){
        number.add(i);
    }
    
    for (int j = 0; j < number.size();j++){
        System.out.println(number.get(j) + " " + number.get(j+1) + " "  + number.get(j+2) + " "  + number.get(j+3) + " "  + number.get(j+4) + " "  + number.get(j+5) + " "  + number.get(j+6) + " "  + number.get(j+7) + " "  + number.get(j+8) + " "  + number.get(j+9));
    }
    // Dengan menggunakan arraylist, pembuatan multidimensional arraylist cukup sulit, dan melakukan print arraylist dengan loop cukup sulit, sehingga ini adalah cara kami untuk membuar kode 5 menjadi arraylist.
    }
}
