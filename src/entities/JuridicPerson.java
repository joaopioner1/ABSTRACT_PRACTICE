package entities;

public class JuridicPerson extends Person {

    private static char[] numbers = {0,1,2,3,4,5,6,7,8,9};
    private final String CNPJ;

    @Override
    public boolean checkID() {
        for (int i=0;i< numbers.length;i++) {
            if (CNPJ.charAt(i)==numbers[i]) {
                return true;
            }
            else return false;
        }
    }

    @Override
    public boolean buyProduct(Product p) {
        return false;
    }

    @Override
    public int getID() {
        return 0;
    }
}
