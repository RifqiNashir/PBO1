
package LatihanInheritance;

public class subClass extends superClass{
    
    private int usia;

    public subClass(int usia, String nama, String ket) {
        super(nama, ket);
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    @Override
    public String getKet() {
        return super.getKet(); 
    }

    @Override
    public String getNama() {
        return super.getNama(); 
    }
    
    
    
    
}
