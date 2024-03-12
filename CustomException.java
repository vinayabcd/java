package myjava.src;

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int number = 10;
        try {
            validateNumber(number);
        } catch (CustomValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
        System.out.println("Number is valid: " + number);
    }

}