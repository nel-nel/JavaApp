/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.geneLoad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "GeneLoadWS")
@Stateless()
public class GeneLoadWS {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
     public String Gene(@WebParam(name = "addName") String txt) {        
        System.out.println();
        String PATH = "D:\\Desktop\\NellyProekt1\\samples\\";
        PATH += txt;
        PATH += ".txt";
        File file = new File(PATH);

        String buff = "";
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                buff += line;
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
        
        return "  " + buff + " ";
    }
}
