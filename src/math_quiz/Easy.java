package math_quiz;

public class Easy extends Question {
    void makeEasyQuestion(){
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
        answer = calculateAnswer(num1, num2, operation);
        preChoices = generateChoices(answer);
        finalChoices = shuffleChoices(preChoices, answer);
    }

    void printTest(){
        System.out.printf("\n%d %s %d = [%d, %d, %d, %d] ANSWER = %d",
                num1, operation, num2, finalChoices[0], finalChoices[1], finalChoices[2], finalChoices[3], answer);
    }

}
