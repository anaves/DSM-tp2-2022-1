package aula30mar;

/**
 * Coordenadas
 */
public class Coordenadas {
    int x;
    int y;
    int z;

    @Override
    public boolean equals(Object obj) {
        Coordenadas outro = (Coordenadas)obj;
        return this.x==outro.x && this.y==outro.y && this.z==outro.z;
    }
    public static void main(String[] args) {
        Coordenadas c1 = new Coordenadas();
        c1.x = 10; c1.y = 15; c1.z = 20;
        Coordenadas c2 = new Coordenadas();
        c2.x = 10; c2.y = 15; c2.z = 20;
        /* nao estamos comparando os valores de x, y e z de c1 e c2 e sim o local da "memoria" onde os objetos foram criados*/
        System.out.println(c1==c2); // assim vai ser false!!
        System.out.println(c1.equals(c2)); // retorna true
        String a = "olap"; // String a = new String("ola")
        String b = "olap";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}