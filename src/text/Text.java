/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        ArrayList<Integer> myNums = new ArrayList();
//        myNums.add(2);
//        myNums.add(20);
//        for (int i=10;i<20;i+=3){
//            myNums.add(i);
//        }
//        System.out.println(myNums);
//        for (int i: myNums){
//            System.out.println(i-1);
//        }
//        ArrayList<Email> emailList = new ArrayList();
//        Email e1 = new Email("lam", "pham", "sale");
//        Email e2 = new Email("tu", "chu", "student");
//        emailList.add(e1);
//        emailList.add(e2);
//       
//        for(Email m: emailList){
//            System.out.println(m.getEmail());
//        }
        TextChange gui = new TextChange();
        gui.setVisible(true);
//        try {
//            File myObj = new File("test.csv");
//         if (myObj.createNewFile()) {
//            System.out.println("File created: " + myObj.getName());
//        } else {
//            System.out.println("File already exists.");
//        }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try{
//            File myFile = new File("test.csv");
//            System.out.println(myFile.getAbsolutePath());
//            Scanner reader = new Scanner(myFile);
//            while (reader.hasNext()){
//                String line = reader.nextLine();
//                System.out.println(line);
//            }
//        }
//        catch(IOException e){
//            System.out.println("File not found");
//        }
//        File myObj = new File("filename.txt"); 
//            if (myObj.delete()) { 
//                 System.out.println("Deleted the file: " + myObj.getName());
//            } else {
//                 System.out.println("Failed to delete the file.");
//        } 
    }
}
