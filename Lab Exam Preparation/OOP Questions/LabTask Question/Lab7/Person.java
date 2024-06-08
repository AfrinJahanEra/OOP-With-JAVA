package Lab7;


public class Person {
    private String mobileNumber;

    public Person(String mobileNumber) throws InvalidMobileNumberException {
        if (!isValidMobileNumber(mobileNumber)) {
            throw new InvalidMobileNumberException("Invalid mobile number format");
        }
        this.mobileNumber = mobileNumber;
    }

    private boolean isValidMobileNumber(String mobileNumber) {
        String regex = "^\\+\\d{2}-\\d{3}-\\d{7}$";
        return mobileNumber.matches(regex);
    }

    public static void main(String[] args) {
        try {
            Person person1 = new Person("+880-1783-905098");
            System.out.println("Ok");

            Person person2 = new Person("322342"); // This will throw an exception
        } catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

