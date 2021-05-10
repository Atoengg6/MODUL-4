package modul4;

public class BilanganCetak {
    public static void main(String arg[]){
        
        OperasiBilangan bil = new OperasiBilangan();
        bil.set_A(10.5);
        bil.set_B(0.5);
        bil.set_C();
        
        System.out.println("SELAMAN DATANG DI\nOPERASI ARITMATIKA");
        System.out.println("bilangan A: "+bil.get_A());
        System.out.println("bilangan B: "+bil.get_B());
        
        bil.tampil();
        
        OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
        jumlah.set_A(10.5);
        jumlah.set_B(0.5);
        jumlah.set_C();
        
        System.out.println("");
        System.out.println("OPERASI ARITMATIKA\nPENJUMLAHAN");
        System.out.println("bilangan A: "+bil.get_A());
        System.out.println("bilangan B: "+bil.get_B());
        System.out.println("hasil A + B =  "+jumlah.get_C());
        
        jumlah.tampil();
        
        OperasiPengurangan kurang = new OperasiPengurangan();
        kurang.set_A(10.5);
        kurang.set_B(0.5);
        kurang.set_C();
        
        System.out.println("");
        System.out.println("OPERASI ARITMATIKA\nPENGURANGAN");
        System.out.println("bilangan A: "+bil.get_A());
        System.out.println("bilangan B: "+bil.get_B());
        System.out.println("hasil A - B =  "+kurang.get_C());
        
        kurang.tampil();
        
        OperasiPerkalian kali = new OperasiPerkalian();
        kali.set_A(10.5);
        kali.set_B(0.5);
        kali.set_C();
        
        System.out.println("");
        System.out.println("OPERASI ARITMATIKA\nPERKALIAN");
        System.out.println("bilangan A: "+bil.get_A());
        System.out.println("bilangan B: "+bil.get_B());
        System.out.println("hasil A * B =  "+kali.get_C());
        
        kali.tampil();
        
        OperasiPembagian bagi = new OperasiPembagian();
        bagi.set_A(10.5);
        bagi.set_B(0.5);
        bagi.set_C();
        
        System.out.println("");
        System.out.println("OPERASI ARITMATIKA\nPEMBAGIAN");
        System.out.println("bilangan A: "+bil.get_A());
        System.out.println("bilangan B: "+bil.get_B());
        System.out.println("hasil A / B =  "+bagi.get_C());
        
        bagi.tampil();
    }
}
