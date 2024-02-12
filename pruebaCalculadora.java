public class pruebaCalculadora {
    private int num1;
    private int num2;
    
    public pruebaCalculadora(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int suma() {
        return num1 + num2;
    }
    public int resta() {
        if ( num1 > num2){
        return num1 - num2;
        }
        else {
            return num2 -num1;
        }
    }
}