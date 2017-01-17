/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 *
 * @author luca
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileWriter out;

        try {
            Scanner in = new Scanner(System.in);
            String l = in.nextLine();
            out = new FileWriter("data/Logger.txt");
            out.write(l + "\n");
            out.write(new SimpleDateFormat("HH:mm:ss " + " dd/MM/yy").format(Calendar.getInstance().getTime()));
            out.close();
        } catch (IOException ex) {
            System.out.println("ERRORE: " + ex.getMessage());

        }
        
    }
    
}
