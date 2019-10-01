package people;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    public static void main(String[] args) {

    }
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop(String[] array) {
        String result = "";
        int counter = 0;
                while(counter<array.length){

                  for(int x = 0; x <array.length; x++){
                      result += array[x];
                  }
                }
counter ++;
    // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        int counter= 0;
        for(int x = 0; x <personArray.length; x++){
            result += personArray[x];
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (Person v : personArray) {
            for (int x = 0; x < personArray.length; x++) {
                result += personArray[x];
            }
        }

            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;

    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
