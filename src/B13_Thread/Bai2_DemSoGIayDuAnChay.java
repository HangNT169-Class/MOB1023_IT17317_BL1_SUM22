/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai2_DemSoGIayDuAnChay implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                count++;
                System.out.println(convertTime(count));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai2_DemSoGIayDuAnChay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String convertTime(int count){ // convert so giay dem duoc => H:m:s
        // covert
       return null;
    }
    public static void main(String[] args) {
        new Bai2_DemSoGIayDuAnChay().run();
    }
}
