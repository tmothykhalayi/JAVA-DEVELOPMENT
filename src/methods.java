public class methods {
    public static void main(String[] args){

            // method =  a block of reusable code that is executed when called ()

            happyBirthday("Timothy", 30);
            happyBirthday("Timoth", 26);
            happyBirthday("Timo", 47);
        }
        static void happyBirthday(String name, int age){
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday dear %s!\n", name);
            System.out.printf("You are %d years old!\n", age);
            System.out.println("Happy Birthday to you!\n");
        }
        static double square(double number){
            return number * number;
        }
        static double cube(double number){
            return number * number * number;
        }
        static String getFullName(String first, String last){
            return first + " " + last;
        }
        static boolean ageCheck(int age){
            if(age >= 18){
                return true;
            }
            else{
                return false;
            }
        }
    }



