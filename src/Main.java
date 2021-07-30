public class Main {
    public static void main(String[] args) {
        String[][] Massiv = new String[][]{{"1", "2", "3", "4"}, { "1","2","3","4" }, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int result = Abracadabra(Massiv);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                System.out.println("incorrect value of string!");

            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Incorrect value!");
            System.out.println("Error in: " + e.i + "x" + e.j);
        }
    }

    private static int Abracadabra(String[][] Massiv) throws MyArraySizeException, MyArrayDataException {
        int count=0;

        if(Massiv.length!=4 || Massiv[0].length!=4){
            throw new MyArraySizeException("incorrect value of string");
        }
        for (int i=0;i<Massiv.length; i++){
            for (int j=0;j<Massiv[i].length;j++){
                try {
                    count = count + Integer.parseInt(Massiv[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                System.out.print(Massiv[i][j]+" ");
            }
            System.out.println();
        }
        return count;
    }
}
