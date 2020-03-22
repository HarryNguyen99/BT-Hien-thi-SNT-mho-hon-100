public class HienThiSNTNhoHoen100 {
    public static void main(String[] args) {
        int number = 0;
        boolean check = false;

        for (number = 0; number < 100; number++) {
            if (number < 2) {
            } else {
                int i = 2;
                check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            }
            if (check)
                System.out.println("số nguyên tố nhỏ hơn 100: " + number);
        }


    }
}
