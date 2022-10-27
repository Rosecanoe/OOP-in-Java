public class FormLetterWriter {
    public static void main(String[] args) {
//        test the two methods
        displaySalutation("Lin");
        displaySalutation("Xiao","Lin");
    }

    public static void displaySalutation(String lastname) {

//        salute for the customer who only shows the last name
        System.out.println("Dear Mr. or Ms. " + lastname);
        System.out.println("Thank you for your recent order.");

    }

    public static void displaySalutation(String firstname, String lastname) {
//        salute for the customer who shows the first name and the last name
        System.out.println("Dear " + firstname + " " + lastname);
        System.out.println("Thank you for your recent order.");

    }
}
