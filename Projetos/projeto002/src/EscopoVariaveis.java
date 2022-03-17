public class EscopoVariaveis {
    public static void main(String[] args) {
        int i =5, j=0;
        if (i<10){
            j = i+2;
            // j existe somente dentro do if
        }
        int z = i+j;// erro pois j existe somente dentro do if
    }
}
