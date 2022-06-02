package heranca;

public abstract class SuperClasse {
    public void metodo() {
        System.out.println("Metodo da SuperClasse.java");
    }

    public void principal(){
        System.out.println("Estou no principal");
        metodoGancho();
    }

    protected abstract void metodoGancho();

}
