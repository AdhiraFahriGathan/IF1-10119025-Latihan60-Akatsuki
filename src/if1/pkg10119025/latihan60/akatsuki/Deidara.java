/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan60.akatsuki;

/**
 *
 * @author User
 */
public class Deidara extends Akatsuki{
    
    private String karakter;
    private String elemen;
    
    public Deidara(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getElemen(){
        return elemen;
    }
    
    public void setElemen(String elemen){
        this.elemen = elemen;
    }
    
    @Override
    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t: " + ciriKhas);
    }
    
    @Override
    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t: " + kekuatan);
    }
    
    @Override
    public void tampilDeskripsi(String deskripsi){
        System.out.println("Deskripsi\t: " + deskripsi);
    }
}
