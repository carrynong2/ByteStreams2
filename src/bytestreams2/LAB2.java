/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB2 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World!";
            byte b[] = s.getBytes();
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
