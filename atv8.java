package vscode.adeskos;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class atv8{

    public static void main(String[] args){
        System.out.println("informe idade: ");
        Scanner scan = new Scanner(System.in);  
        int idade = scan.nextInt();
        
        if (idade <=3){
            System.out.println("Você é bebê");
            JOptionPane.showMessageDialog(null, "Você é bebê");
        } 
        

        if ((idade > 3 ) && (idade <=9)){
            System.out.println("Você é criança");
            JOptionPane.showMessageDialog(null, "Você é criança");
        } 


        if ((idade > 10 ) && (idade <=12)){
            System.out.println("Você é pré-adolescente");
            JOptionPane.showMessageDialog(null, "Você é pré-adolescente");
        } 
 
        if ((idade >= 13 ) && (idade <=17)){
            System.out.println("Você é adolescente");
            JOptionPane.showMessageDialog(null, "Você é adolescente");
        } 


        if ((idade >= 18 ) && (idade <=30)){
            System.out.println("Você é adulto");
            JOptionPane.showMessageDialog(null, "Você é adulto");
        } 
    
        if ((idade >= 31 ) && (idade <=60)){
            System.out.println("Você é adulto de meia idade");
            JOptionPane.showMessageDialog(null, "Você é adulto de meia idade");
        }    
    
   
        if ((idade >=1361 ) && (idade <=100)){
            System.out.println("Você é idoso");
            JOptionPane.showMessageDialog(null, "Você é idoso");
        } 

    }





}









