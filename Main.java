// import java.util.Scanner;

public class Main {
    

    // public static void main(String[] args) {
    //     boolean question_1 = question7(6, 12, 72);
    //     System.out.println(question_1);
    // }

    // public static Scanner scanner = new Scanner(System.in);

    public char question1(double score1, double score2, double score3) {

        final int NUMBER_OF_SCORES = 3;
        char grade;

        int avg = (int)(score1 + score2 + score3) / NUMBER_OF_SCORES;
        if (avg >= 90 && avg <=100)
            grade = 'A';
        else if (avg >= 80 && avg <= 89)
            grade = 'B';
        else if (avg >= 70 && avg <=79)
            grade = 'C';
        else if (avg >= 60 && avg <= 69)      
            grade = 'D';
        else 
            grade = 'F';
        // Based on three scores that the user inputs, display the average of the scores
        // and the letter grade that is assigned fort he test score average. The grading
        // scheme is as follows:

        // 90 - 100 A
        // 80 - 89 B
        // 70 - 79 C
        // 60 - 69 D
        // <60 F

        return grade; // you need to change this line
    }

    public boolean question2(boolean isMorning, boolean isMom, boolean isAsleep) {
        // Implement the following logic: Your cell phone rings. Return true if you
        // should answer it. Normally you answer, except in the morning you only answer
        // if it is your mom calling. In all cases, if you are asleep, you do not
        // answer.
        
        boolean answer = true;

        if (isAsleep == true)
            answer = false;
        else if (isMorning == true && isMom == true)
            answer = true;
        else if (isMorning == true)
            answer = false;
        else 
            answer = true;
        
        return answer; // Hello? Text please!
                      // you do need to change the return line though
    }

    public String question3(int dayNum) {
        // Given a day number (1-7), return the day of the week ("Sunday", "Monday",
        // etc.). If an invalid day number is provided, return "Invalid".

        // Examples:

        // dayOfWeek(1) -> "Sunday"
        // dayOfWeek(4) -> "Wednesday"
        String weekDay;
        switch (dayNum) {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break;
            default:
                weekDay = "Invalid";
        }
        return weekDay; // you need to change this line
    }

    public int question4(int tea, int candy) {
        // Write a function in Java that implements the following logic: We are having a
        // party with amounts of tea and candy. Return the int outcome of the party
        // encoded as 0 = bad, 1 = good, or 2 = great. A party is good (1) if both tea
        // and candy are at least 5. However, if either tea or candy is at least double
        // the amount of the other one, the party is great (2). However, in all cases,
        // if either tea or candy is less than 5, the party is always bad (0).
        int outcome = 0;
        if (tea < 5 || candy < 5)
            outcome = 0;
        else if (tea >= candy * 2 || candy >= tea * 2)
            outcome = 2;
        else if (tea >= 5 && candy >=5)
            outcome = 1;

        return outcome; // you need to change this line
    }

    public boolean question5(int a, int b, int c, boolean bOk) {
        // Write a function in Java that implements the following logic: Given three
        // ints, a, b, and c, return true if b is greater than a, and c is greater than
        // b. However, with the exception that if bOk is true, b does not need to be
        // greater than a.
        boolean answer = true;

        if (b > a && c > b)
            answer = true;
        else
            answer = false;

        while (bOk == true)
            if (c > b) {
                answer = true;
                break;
            }
            else {
                answer = false;
                break;
            }
        
                

        // Note 'bOk' is the name of an formal parameter.

        return answer; // you need to change this line
    }

    public boolean question6(int n, boolean outsideMode) {
        // Write a function in Java that implements the following logic: Given a number
        // n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is
        // true, in which case return true if the number is less or equal to 1, or
        // greater or equal to 10.
        boolean answer = true;
        
        if (n >=1 && n <= 10)
            answer = true;
        else
            answer = false;

        while (outsideMode == true)
            if (n <=1 || n >= 10){
                answer = true;
                break;
            }
            else {
                answer = false;
                break;
            }

        return answer; // you will need to change this line
    }

    public boolean question7(int date, int month, int year) {
        // A magic date is one when written in the following format, the month times the
        // date equals the year e.g. 6/10/60. Write code that figures out if a user
        // entered date is a magic date. The dates must be between 1 - 31, inclusive and
        // the months between 1 - 12, inclusive. Let the user know whether they entered
        // a magic date. If the input parameters are not valid, return false.

        // Examples:

        // magicDate(6, 10, 60) -> true
        // magicDate(50, 12, 600) -> false

        boolean answer = true;
        int validate;

        if (date >= 1 && date <= 31 && month >=1 && month <= 12) 
            validate = 1;
        else  
            validate = 0;
        System.out.println(validate);
        
        switch (validate) {
            case 1:
                if (month * date == year)
                    answer = true;
                else 
                    answer = false;
                break;
            default:
                answer = false;
                break;
        }
        return answer; // you will need to change this line
    }
}