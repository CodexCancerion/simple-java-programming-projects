package math_quiz;
public class Medium extends Question {
    void makeMediumQuestion(){
        operation = generateOperation();
        num1 = generateInteger(100);
        num2 = generateInteger(100);
        if (operation == "-"){
            while (!subtractable(num1, num2)){
                num1 = generateInteger(100);
            }
        }
        if (operation == "/"){
            while (!divisible(num1, num2)){
                num1 = generateInteger(100);
            }
        }
        difficulty = "Medium";
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
