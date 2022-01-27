

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      (a method recieves inputs and returns outputs)
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
       String output = reverse("Shirhan");
        System.out.println(output);
    }
/// ---ddsjf
        public static String reverse(String input) {
String output= "";
            for (int i = input.length() - 1; i >= 0; i--) {
               output += input.charAt(i);
               // we dont want to print the character as it loops but we want to add it to the empty variable we created.
            }
            // in the string output, Shirhan will collect as it loops. String output= "nahrihS"

            return output;
        }
        }
/*
start with  the method - data type is string and we name it reverse, input to the function is any string.

secondly we invoke our method above where we have our main method line10.
thirdly the string output needs to be be equal to the method we're invoking then print out the output
 Assigning a variable to our input
 4th we want to reverse the input by looping. Below we're reserve looping.
5th charAt(i) returns characters at specified index.
Outside the for loop, creating String output="" to hold the concat the output to input.charAt(i) then return output
 at the end */


