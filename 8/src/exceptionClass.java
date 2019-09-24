public class exceptionClass
{
    public static void main(String args[]) {
        int result = 0;                                                    // Somewhere to store a result.
        int arraySize = 3;
        int badSize = -1;                                                  // A negative size to generate NegativeArraySizeException.
        int[] array = null;                                                // Define an integer array variable.


            for (int choice = 0; choice < 3; choice++) {
                try {
                    switch (choice) {
                        case 1:
                            result = array[0];
                            break;
                        case 2:
                            array = new int[arraySize];
                            break;
                        case 3:
                            result = array[badSize];
                            break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("This is a null pointer Exception");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("This is a out of index exception");
                } catch (NegativeArraySizeException e) {
                    System.out.println("This is array of negative size");
                }
            }

    }
}
