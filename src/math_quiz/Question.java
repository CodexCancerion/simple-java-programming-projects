package math_quiz;

public class Question {
    public int num1;            //FIRST NUMBER
    public int num2;            //SECOND NUMBER
    public String operation;    //OPERATION
    public int answer;          //ANSWER
    public String difficulty;   //DIFFICULTY
    public int[] preChoices = new int[3];       //3 CHOICES
    public int[] finalChoices;     //3 CHOICES

    /*
    Generates an Integer which digits is dependent on the fed number as argument
    1 - 2 digit
    2 - 3 digit
    3 - 4 digit
    Returns the Integer
     */
    int generateInteger(int i){
        int temp = 0;
        switch (i) {
            case 10:
                while (temp == 0) {
                    temp = (int) (Math.random() * 10);
                }
                break;
            case 100:
                while (temp == 0) {
                    temp = (int) (Math.random() * 90) + 10;
                }
                break;
            case 1000:
                while (temp == 0) {
                    temp = (int) (Math.random() * 900) + 100;
                }
                break;
            case 10000:
                while (temp == 0) {
                    temp = (int) (Math.random() * 9000) + 1000;
                }
                break;
            case 100000:
                while (temp == 0) {
                    temp = (int) (Math.random() * 90000) + 10000;
                }
                break;
            default :
                while (temp == 0) {
                    temp = (int) (Math.random() * i);
                }
        }
        return temp;
    }

    /*
    Generates an operation either of the 4 arithmetic operations
    Returns the operation in a String form
     */
    String generateOperation(){
        int x = (int)(Math.random() * 4)+1;
        String ops = "";
        switch (x){
            case 1 :
                ops = "+";
                break;
            case 2 :
                ops = "-";
                break;
            case 3 :
                ops = "*";
                break;
            case 4 :
                ops = "/";
                break;
        }
        return ops;
    }

    /*
    Returns the calculation of num1 and num 2 based on the operation
     */
    int calculateAnswer(int x, int y, String ops){
        double answer = 0;
        switch (ops){
            case "+" :
                answer = x + y;
                break;
            case "-" :
                answer = x - y;
                break;
            case "*" :
                answer = x * y;
                break;
            case "/" :
                answer = x / y;
        }
        return (int) Math.round(answer);
    }

    /*
    Generates and returns an array containing the answer choices depending on the number of digits of the answer
     */
    int[] generateChoices(int ans){

        int counter=1;
        for (int i=ans; i/10>0 ;i/=10){
            counter++;
        }

        int[] choices = new int[3];
        switch (counter){
            case 1 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(10);
                    while (temp==ans) {
                        temp = generateInteger(10);
                    }
                    choices[i] = temp;
                }
                break;
            case 2 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(100);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(100);
                    }
                    choices[i] = temp;
                }
                break;
            case 3 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(1000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(1000);
                    }
                    choices[i] = temp;
                }
                break;
            case 4 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(10000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(10000);
                    }
                    choices[i] = temp;
                }
                break;
            case 5 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(100000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(100000);
                    }
                    choices[i] = temp;
                }
                break;
            case 6 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(1000000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(1000000);
                    }
                    choices[i] = temp;
                }
                break;
        }
        return choices;
    }

    /*
    Inserts the correct answer to the choices in a random index
     */
    public int[] shuffleChoices(int[] choices, int answer){
        int[] tempChoices = new int[choices.length+1];
        int[] finChoices = new int[tempChoices.length];

        for(int i=0; i<choices.length; i++){
            tempChoices[i] = choices[i];
        }

        //INSERTER
        int i,j, in;
        int insert = generateInteger(17)/4;
        for(in =0, i=0, j=0; i<finChoices.length; in++){
            if (in==insert) {
                finChoices[i++] = answer;
            }
            else {
                finChoices[i]=tempChoices[j];
                i++;
                j++;
            }
        }
        return finChoices;
    }

    boolean divisible(int x, int y){
        if (x>y && x/y>0) return true;
        else return false;
    }

    boolean subtractable(int x, int y){
        if (x>y) return true;
        else return false;
    }

    int divisibilityError(int x, int y){
        if (x>y) return 1;
        if (x/y>0) return 2;
        return 0;
    }
}
