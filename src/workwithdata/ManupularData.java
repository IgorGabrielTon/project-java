/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithdata;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author igorg
 */
public class ManupularData {
    
    public static void main(String[] args) {
        SimpleDateFormat modeloExibicao3 = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        modeloExibicao3.setTimeZone(TimeZone.getTimeZone("GMT")); 
        Date C = Date.from(Instant.parse("2020-08-30T23:00:00Z"));
        System.out.println(modeloExibicao3.format(C));
        
        //Somar Tempo
        
        Calendar manipulador = Calendar.getInstance();
        manipulador.setTime(C);
        manipulador.add(Calendar.DAY_OF_WEEK, 2);
        C = manipulador.getTime();
        
        System.out.println(modeloExibicao3.format(C));
        
    }
    
}
