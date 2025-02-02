public class Switch {

        public static void main(String[] args) {
            int score = 85;  // Example score
            char grade;

            // Convert the score to a "range" value for switch statement
            int range = score / 10;  // This will give us ranges like 9, 8, 7, etc.

            switch (range) {
                case 10:  // for scores 100
                case 9:   // for scores 90-99
                    grade = 'A';
                    break;
                case 8:   // for scores 80-89
                    grade = 'B';
                    break;
                case 7:   // for scores 70-79
                    grade = 'C';
                    break;
                case 6:   // for scores 60-69
                    grade = 'D';
                    break;
                default:   // for scores below 60
                    grade = 'F';
            }

            System.out.println("Your grade is: " + grade);  // Output: Your grade is: B

    }

}
