/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localservice;

/**
 *
 * @author AJC
 */
public class LocalClassExample {
    // All symbols that are not digits.
    static String regularExpression = "[^0-9]";
    /**
    * Method validates a phone number as being as: ddd-ddd-dddd where d - digit
    * @param phoneNumberToBeValidated first phone number
    */
    public static void validatePhoneNumber(String phoneNumberToBeValidated) {
    // phone numbers are 10 digits length without - symbols
    final int numberLength = 10;
    // local class
    class PhoneNumber {
        /* formated phone number */
        String formattedPhoneNumber = null;
        // local class constructor
        PhoneNumber(String phoneNumberToBeValidated){
        // replace everything out of digits with ""
            String currentNumber = phoneNumberToBeValidated.replaceAll(
        regularExpression, "");
        // check the number of digits to be equal with 10
            if (currentNumber.length() == numberLength)
                formattedPhoneNumber = currentNumber;
            else
                formattedPhoneNumber = null;
        }
        // getter that returns formatedPhoneNumber
        public String getNumber() {
            return formattedPhoneNumber;
        }
    }
    // create new PhoneNumber objects initializing them with the string
    // was received as paramater. Constructor is already processing the
    // validation. If there is no valid number null is "returned"
    PhoneNumber myNumber = new
    PhoneNumber(phoneNumberToBeValidated);
    // check the validations and display the results only for successfuly no.
    if (myNumber.getNumber() == null)
        System.out.println("Number is invalid");
    else
        System.out.println("Number is " + myNumber.getNumber());
    }// end of method validatePhoneNumber
    // main method
    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890");
        validatePhoneNumber("112 222");
        validatePhoneNumber("0040/770/123");
    }
}
