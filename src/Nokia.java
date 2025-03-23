public class Nokia implements BasicFunction { // This will be my BasicPhone
    @Override
    public void makeCall(String number) {
        System.out.println("Calling Cell No. " + number + " ...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS message to Cell No. " + number + " : " + message);
    }
}
