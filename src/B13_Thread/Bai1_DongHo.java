/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai1_DongHo implements Runnable {

    @Override
    public void run() {
        // code
        // Show dong ho h:m:s
        while (true) {
            try {
                Calendar cal = Calendar.getInstance(); // lay ra moi thong tin gio giac ngay thang(dong ho) moi nhat cua he thong
                int h = cal.get(Calendar.HOUR);
                int m = cal.get(Calendar.MINUTE);
                int s = cal.get(Calendar.SECOND);
                System.out.println(h + ":" + m + ":" + s);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai1_DongHo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new Bai1_DongHo().run();
    }
}
