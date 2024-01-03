package math_quiz;

import javax.swing.*;

public class main {
    static Player player = new Player();
    static int totalScore=0;
    public static void main(String[] args){
        player.score = 0;
        welcomeUser();

        Easy q1 = new Easy();
            q1.makeEasyQuestion();
            totalScore+=1;
        Easy q2 = new Easy();
            q2.makeEasyQuestion();
            totalScore+=1;
        Easy q3 = new Easy();
            q3.makeEasyQuestion();
            totalScore+=1;

        Medium q4 = new Medium();
            q4.makeMediumQuestion();
            totalScore+=2;
        Medium q5 = new Medium();
            q5.makeMediumQuestion();
            totalScore+=2;
        Medium q6 = new Medium();
            q6.makeMediumQuestion();
            totalScore+=2;

        Hard q7 = new Hard();
            q7.makeHardQuestion();
            totalScore+=3;
        Hard q8 = new Hard();
            q8.makeHardQuestion();
            totalScore+=3;
        Hard q9 = new Hard();
            q9.makeHardQuestion();
            totalScore+=3;
        Hard q10 = new Hard();
            q10.makeHardQuestion();
            totalScore+=3;


/*
//TESTS
        q1.printTest();
        q2.printTest();
        q3.printTest();

        q4.printTest();
        q5.printTest();
        q6.printTest();

        q7.printTest();
        q8.printTest();
        q9.printTest();
        q10.printTest();

        int[] arr = {1,2,3};
        int ans = 4;
        test test = new test();
        System.out.println(Arrays.toString(test.shuffleChoices(arr, ans)));

 */
        printQuestion(q1.num1, q1.num2, q1.operation, q1.difficulty, q1.finalChoices, q1.answer);
        printQuestion(q2.num1, q2.num2, q2.operation, q2.difficulty, q2.finalChoices, q2.answer);
        printQuestion(q3.num1, q3.num2, q3.operation, q3.difficulty, q3.finalChoices, q3.answer);
        printQuestion(q4.num1, q4.num2, q4.operation, q4.difficulty, q4.finalChoices, q4.answer);
        printQuestion(q5.num1, q5.num2, q5.operation, q5.difficulty, q5.finalChoices, q5.answer);
        printQuestion(q6.num1, q6.num2, q6.operation, q6.difficulty, q6.finalChoices, q6.answer);
        printQuestion(q7.num1, q7.num2, q7.operation, q7.difficulty, q7.finalChoices, q7.answer);
        printQuestion(q8.num1, q8.num2, q8.operation, q8.difficulty, q8.finalChoices, q8.answer);
        printQuestion(q9.num1, q9.num2, q9.operation, q9.difficulty, q9.finalChoices, q9.answer);
        printQuestion(q10.num1, q10.num2, q10.operation, q10.difficulty, q10.finalChoices, q10.answer);

        String message = String.format("End of Quiz..." +
                "\nYour Total Score is %d out of %d"
                ,player.score, totalScore );
        JOptionPane.showMessageDialog(null, message, "ANSWER", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void welcomeUser(){
        String message = String.format("Welcome to Math Quiz..." +
                "\nThis is a challenge on basic Maths" +
                "\n\nMECHANICS:" +
                "\nAll you have to do is to pick" +
                "\nyour answer on the given choices." +
                "\n\nEasy = 1 pt" +
                "\nMedium = 2 pts" +
                "\nHard = 3 pts" +
                "\nLezgo==>>");
        JOptionPane.showMessageDialog(null, message, "WELCOME", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void printQuestion(int x, int y, String ops, String diff, int[] finalChoices, int answer){
        //SHOW QUESTION
        String message = String.format("Question 1 %s" +
                                        "\n%d %s %d = \n%d\n%d\n%d\n%d"
                                        , diff, x, ops, y, finalChoices[0], finalChoices[1], finalChoices[2], finalChoices[3]);
        String ansStr = JOptionPane.showInputDialog(null, message, "QUESTION", JOptionPane.QUESTION_MESSAGE);
        int userAnswer = Integer.parseInt(ansStr);
        checkAnswer(userAnswer, answer, diff, x, ops, y);
    }

    public static void checkAnswer(int userAns, int correctAns, String diff, int x, String ops, int y){
        String message2 = String.format("Question 1 %s" +
                        "\n%d %s %d = %d"
                ,diff, x, ops, y, correctAns);
        boolean check = userAns==correctAns;
        if (check){
            switch (diff){
                case "Easy" :
                    player.addScore(1);
                    break;
                case "Medium" :
                    player.addScore(2);
                    break;
                case "Hard" :
                    player.addScore(3);
                    break;
            }
        }

        if (check) {
            message2 += String.format("\n Your answer is CORRECT." +
                    "\nScore = %d", player.score);
            JOptionPane.showMessageDialog(null, message2, "ANSWER", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            message2 += String.format("\n Your answer is INCORRECT." +
                    "\nScore = %d", player.score);
            JOptionPane.showMessageDialog(null, message2, "ANSWER", JOptionPane.ERROR_MESSAGE);
        }
    }
}
