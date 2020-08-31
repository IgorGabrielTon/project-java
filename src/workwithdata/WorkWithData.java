/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithdata;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.tools.DocumentationTool;




/**
 *
 * @author igorg
 */
public class WorkWithData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     //1º forma de work com data
     SimpleDateFormat modeloExibicao = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
     Date a = new Date();
        System.out.println(modeloExibicao.format(a));
        
      //2º forma de work com data
      SimpleDateFormat modeloExibicao2 = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
      modeloExibicao2.setTimeZone(TimeZone.getTimeZone("GMT"));
      Date b = new Date();
      System.out.println(modeloExibicao2.format(b));
     
      //3º forma de work com data
       SimpleDateFormat modeloExibicao3 = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
       //modeloExibicao3.setTimeZone(TimeZone.getTimeZone("GMT")); <- Essencial 
       Date C = Date.from(Instant.parse("2020-08-30T23:00:00Z"));
        System.out.println(modeloExibicao3.format(C));
    }
    
}
