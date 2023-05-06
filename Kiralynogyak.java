package kiralynogyak;


public class Kiralynogyak {

    public static void main(String[] args) {
        Tabla tabla = new Tabla('x');
        //tabla.megjelenit();
        tabla.elhelyez(8);
        tabla.megjelenit();
        System.out.println(tabla.uresSor(2));
        System.out.println(tabla.uresOszlop(2));
        tabla.uresek();
        System.out.println(tabla.getUresOszlopokSzama());
        System.out.println(tabla.getUresSorokSzama());
    }
    
}
