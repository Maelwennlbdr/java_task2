public class OutOfRange extends Exception {
    public OutOfRange() {
        this("Input value has to be between the specified range of values");
    }
    public OutOfRange(String msg) {
        super(msg);
    }
}
