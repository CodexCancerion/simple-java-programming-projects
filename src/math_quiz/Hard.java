package math_quiz;
public class Hard extends Question {
    void makeHardQuestion(){
        operation = generateOperation();
        num1 = generateInteger(1000);
        num2 = generateInteger(1000);
        if (operation == "-"){
            while (!subtractable(num1, num2)){
                num1 = generateInteger(1000);
            }
        }
        if (operation == "/"){
            while (!divisible(num1, num2)){
                num1 = generateInteger(1000);
            }
        }
        difficulty = "Hard";
        answer = calculateAnswer(num1, num2, operation);
        preChoices = generateChoices(answer);
        finalChoices = shuffleChoices(preChoices, answer);
    }
    //PRINT TEST
    void printTest(){
        System.out.printf("\n%d %s %d = [%d, %d, %d, %d] ANSWER = %d",
                num1, operation, num2, finalChoices[0], finalChoices[1], finalChoices[2], finalChoices[3], answer);
    }
}
