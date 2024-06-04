/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjava;
import javax.swing.JTextField;
import javax.swing.JComboBox;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class Barang {
        private JTextField nb; // Assuming nb is a JTextField
    private JTextField thrg;
    private JTextField tjml;
    private JTextField ttot;
    private JTextField tubyr;
    private JTextField brg;
    private JTextField tukemb;
    private JComboBox<String> cbkode;
    public String kd,nm;
    public int jml;
    public double hrg,ttl,ub,uk;
    
        public void setKd(String val){
            kd=val;
        }
        public String getKd(){
            return kd;
        }
        public void setSeleksiKd(){
            if(kd.equalsIgnoreCase("B001")){
                nm="Pensil";
                hrg=3000;
            }else if(kd.equalsIgnoreCase("B002")){
                nm="Buku";
                hrg=5000;
            }else if(kd.equalsIgnoreCase("B003")){
                nm="Penggaris";
                hrg=1000;
            }else if(kd.equalsIgnoreCase("B004")){ 
                nm="";
                hrg=0;
            }
        }
        void bersih(){
            nb.setText("");
            thrg.setText("");
            tjml.setText("");
            ttot.setText("");
            tubyr.setText("");
            tukemb.setText("");
            cbkode.setSelectedItem("PILIH");
        }
        private void cbkodeActionPerformed(java.awt.event.ActionEvent evt){
            // TODO add your handling code here:
            Barang brg = new Barang(); // Instantiat
            brg.setKd(cbkode.getSelectedItem().toString());
            brg.setSeleksiKd();
            nb.setText(brg.getNm());
            thrg.setText(Double.toString(brg.getHrg()));
            tjml.requestFocus();
            
        }
        
            public void setNm(String val){
                nm=val;
            }
            public String getNm(){
                return nm;
            }
            public void setHrg(Double val){
                hrg=val;
            }
            public double getHrg(){
                return hrg;
            }
            public void setJml(int val){
                jml=val;
            }
            public int getJml(){
                return jml;
            }
            public double getTot(){
                ttl=hrg*jml;
                return(ttl);
            }
            public void setUB(double val){
                ub=val;
            }
            public double getUb(){
                return ub;
            }
            public double getUk(){
                return (ub-ttl);
            }
}
