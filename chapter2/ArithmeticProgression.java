public class ArithmeticProgression extends Progression{

    protected long incremenet;

    public ArithmeticProgression(){ this(0, 1); }

    public ArithmeticProgression(long stepsize ){ this(stepsize, 0); }

    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        incremenet = stepsize;
    }

    protected void advance() {
        current += incremenet;
    }
}
