public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String [] operations = new String[] {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int contador = 0;
        for (int i=0; i<operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                contador++;
            }
            if (operations[i].equals("X--") || operations[i].equals("--X")){
                contador--;
            }
        }
        return contador;
    }
}
