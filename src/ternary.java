public class ternary {
        public static void main(String[] args) {
            // variable = (condition) ? IfTrue : IfFalse;
            int score = 752;
            int number = 10;
            int hours = 13;
            int income = 60000;
            String passOrFail = "PASS";
            String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
            String timeOfDay = (hours < 12) ? "A.M." : "P.M";
            double taxRate = (income > 40000) ? 0.25 : 0.15;
        }
}
