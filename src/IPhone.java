public class IPhone implements BasicFunction, SmartFunction {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling Cell No. " + number + " ...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS message to Cell No. " + number + " : " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing to Web URL: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Snap! You've taken a picture.");
    }
}
