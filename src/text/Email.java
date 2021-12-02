/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Email {

    private String firstName;
    private String lastName;
    private String depart;
    private int mailboxCapacity;
    private String password;

    public Email(String firstName, String lastName, String depart, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.depart = depart;
        this.mailboxCapacity = this.getMailboxCapacity();
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepart() {
        return depart;
    }

    public int getMailboxCapacity() {
        return 500;
    }
    
    public String getPassword(){
        return this.password;
    }

//    public String setPassword() {
//        String passwd = "123456789";
//        String rndpasswd = "";
//        int length = 5;
//        Random rand = new Random();
//        char[] text = new char[length];
//        for (int i = 0; i < length; i++) {
//            text[i] = passwd.charAt(rand.nextInt(passwd.length()));
//            if (i == 5) {
//                break;
//            }
//        }
//        for (int i = 0; i < text.length; i++) {
//            rndpasswd += text[i];
//        }
//        return rndpasswd;
//    }

    public void setPassword(Scanner s) {
        System.out.println("Enter new password: ");
        this.password = s.next();
        System.out.println(this.password);
    }
//    public String setDepart(){
//        System.out.println("Enter department code (1-sale,2-development,3-accounting)");
//        Scanner sc = new Scanner(System.in);
//        int code=sc.nextInt();
//        switch(code){
//            case 1:
//                return "sale";
//            case 2:
//                return "development";
//            case 3:
//                return "accounting";
//            default:
//                return "";
//        }
//    }
//    public void setReplacingEmail(Scanner s){
//        System.out.println("Enter name of the replacing email: ");
//        String a =s.next();
//        System.out.println(a+"@"+setDepart()+".company.com");
//    }
//    public void setEmail(Scanner s){
//        System.out.println("Enter first name: ");
//        this.firstName=s.next();
//        System.out.println("Enter last name: ");
//        this.lastName=s.next();
//    }

    public String getEmail() {
        return this.firstName.toLowerCase().replaceAll(" ", "") + this.lastName.toLowerCase().replaceAll(" ", "") + "@" + this.depart + ".company.com";
    }

    @Override
    public String toString() {
        return "Email: firstname= " + this.getFirstName().trim() + ", lastname= " + this.getLastName().trim() + ", depart= "
                + this.depart + ", password= " + this.password + ", mailbox capacity = " + this.getMailboxCapacity() + "GB";
    }

//    public void displayEmail() {
//        System.out.println(this.toString());
//    }
}
