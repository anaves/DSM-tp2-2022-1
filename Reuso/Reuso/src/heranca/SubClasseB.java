package heranca;

public class SubClasseB extends SuperClasse {
    @Override
    protected void metodoGancho() {
        System.out.println("metodo gancho B");
        
    }

    @Override
    public void metodo() {
        System.out.println("Metodo da SubClasseB.java");
    }
}
