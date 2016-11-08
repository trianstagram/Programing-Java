/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mahasiswa;

/**
 *
 * @author lk7no42uty
 */
public class Mahasiswa {
    private String Xnama;
    private String Xnim;
    
   Mahasiswa (String nama,String nim ){
                Xnama = nama;
                Xnim = nim;
                                
            }
            void show(){
              
                System.out.println("Nama     : "+Xnama);
                System.out.println("NIM      : "+Xnim);
               
                
            }
            public static void main (String arg[]) {
                Mahasiswa Xobj;
                Xobj = new Mahasiswa ("Yaoming","3153111010");
                Xobj.show();
            }
}

