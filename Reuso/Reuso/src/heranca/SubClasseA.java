package heranca;

public class SubClasseA extends SuperClasse{
    private int x;
    public SubClasseA(int x){
        setX(x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /*
     * Metodo que sobrescreve da SuperClasse 
     */
    @Override
    public void metodo() {
        System.out.println("Metodo da SubClasseA.java");
        System.out.println("Valor de x " + getX());
    }
    @Override
    protected void metodoGancho() {
        System.out.println("metodo gancho A");
        
    }
}
