package lesson_2;

public abstract class AbsClassExample {
    private int a;
    public static int d;

    public abstract void unfinishedMethod();
    public abstract String getStringRepresentation();
    // RecyclerView.Adapter
    // how many items? getSize();
    // which item to show at position N? show items(3)
    // how should 1 item look?

    public void printA() {
        System.out.println(a);
    }
}
