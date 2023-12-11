public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int [] hours = new int[] {0,1,2,3,4};
        int target = 2;

        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));

    }

    public static int numberOfEmployeesWhoMetTarget(int [] hours, int target) {
            int contador = 0;
            for (int i=0; i<hours.length; i++) {
                if (hours[i] >= target) {
                    contador++;
                }
            }
            return contador;
        }
}
