package Week3Day5.f;

public class PopulationMove {
    private int toSido;
    private int fromSido;

    public PopulationMove(int toSido, int fromSido) {
        this.toSido = toSido;
        this.fromSido = fromSido;
    }

    public PopulationMove(String toSido, String fromSido) {
        this.toSido = Integer.parseInt(toSido);
        this.fromSido = Integer.parseInt(fromSido);
    }

    public int getToSido() {
        return toSido;
    }
    public int getFromSido() {
        return fromSido;
    }

}