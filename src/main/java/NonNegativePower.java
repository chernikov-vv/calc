public class NonNegativePower extends Operation {
    @Override
    public int execute(int a, int b) {
        int result = 1;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        return result;
    }
}
