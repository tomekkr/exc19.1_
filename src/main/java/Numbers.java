public class Numbers {
    public int sumMultiplesOfNumbersThreeOrFive(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}