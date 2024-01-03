package math_quiz;

import java.util.Arrays;

public class test{
    /*
    void makeTestQuestion(){
        operation = generateOperation();
        num1 = generateInteger(10);
        num2 = generateInteger(10);
        if (operation == "-"){
            while (!subtractable(num1, num2)){
                num1 = generateInteger(10);
            }
        }

        if (operation == "/"){
            while (!divisible(num1, num2)){
                num1 = generateInteger(10);
            }
        }

        difficulty = "Easy";
        preChoices = generateChoices(answer);

        answer = calculateAnswer(num1, num2, operation);
        finalChoices = shuffleChoices(preChoices, answer);
    }

    void printTest(){
        System.out.printf("\n%d %s %d = [%d, %d, %d, %d] ANSWER = %d",
                num1, operation, num2, finalChoices[0], finalChoices[1], finalChoices[2], finalChoices[3], answer);
    }


     */

    public int[] shuffleChoices(int[] choices, int answer){
        int[] tempChoices = new int[choices.length+1];
        int[] finChoices = new int[tempChoices.length];

        for(int i=0; i<choices.length; i++){
            tempChoices[i] = choices[i];
        }
        System.out.println(Arrays.toString(tempChoices));
        //finChoices[finChoices.length-1] = answer;

        //INSERTER
        int i,j,k, in;
        int insert = 3;
        //int temp=0;
        for(in =0, i=0, j=0, k=0; i<finChoices.length; in++){
            if (in==insert) {
                System.out.println(answer);
                finChoices[i++] = answer;
                //temp = finalChoices[i];
            }
            else {
                finChoices[i++]=tempChoices[j++];
                if (in==tempChoices.length) break;
                System.out.printf("\n%d\t%d\t%d", tempChoices[j++], choices[k++], finChoices[i++]);
            }

        }
        return finChoices;
    }
    int[] generateChoices(int ans){

        int counter=1;
        for (int i=ans; i/10 >0 ;i/=10){
            counter++;
        }
        System.out.println(counter);

        int[] choices = new int[3];
        switch (counter){
            case 1 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(10);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(10);
                    }
                    choices[i] = temp;
                    System.out.println(choices[i]);
                }
                break;
            case 2 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(100);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(100);
                    }
                    choices[i] = temp;
                    System.out.println(choices[i]);
                }
                break;
            case 3 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(1000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(1000);
                    }
                    choices[i] = temp;
                    System.out.println(choices[i]);
                }
                break;
            case 4 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(10000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(10000);
                    }
                    choices[i] = temp;
                    System.out.println(choices[i]);
                }
                break;
            case 5 :
                for (int i = 0; i< choices.length; i++){
                    int temp = generateInteger(100000);
                    while (temp==ans && temp==choices[i-1]) {
                        temp = generateInteger(100000);
                    }
                    choices[i] = temp;
                    System.out.println(choices[i]);
                }
                break;
        }
        return choices;
    }

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
}
