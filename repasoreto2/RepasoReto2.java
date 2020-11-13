/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoreto2;

/**
 *
 * @author clases
 */
public class RepasoReto2 {

    static int stockAnimalesDioses = 50;
    static int stockLaEstetica = 60;
    static int stockDivinaComedia = 70;
    static int stockHistoriaTiempo = 30;
    static int stockAlgebraBaldor = 80;
    static double ivaPorcentaje;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	facturar(5, 0, 15, 5, 0);
        facturar(5, 5, 15, 5, 0);
        facturar(5, 0, 15, 0, 0);
        facturar(0, 5, 5, 5, 0);
        facturar(1, 5, 15, 5, 0);
        facturar(5, 2, 15, 5, 0);
    }

    private static void facturar(int animalesA, int estetica, int divina, int historia, int algebra){
        if(animalesA<=stockAnimalesDioses && estetica<=stockLaEstetica && divina <=stockDivinaComedia &&
                historia<=stockHistoriaTiempo && algebra<=stockAlgebraBaldor) {
            
            int cantidad = animalesA+algebra+divina+estetica+historia;
            ivaPorcentaje = 0.21-(0.01*cantidad)>=0?0.21-(0.01*cantidad):0;
            double iva = Math.ceil(ivaPorcentaje*100);
            
            double price = animalesA*20000+estetica*10000+divina*8000+historia*19000+algebra*25000;
            double priceTotal = (price*(100+iva))/100;
            
            System.out.println("price: " + priceTotal + "; y el iva: " + iva + "%");
            
            stockAnimalesDioses -= animalesA;
            stockAlgebraBaldor -= algebra;
            stockDivinaComedia -= divina;
            stockLaEstetica -= estetica;
           
            
        } else {
            System.out.println("Lo sentimos, no hay existencias suficientes, vuelva a enviar una cantidad");
        }
        
    }
}
