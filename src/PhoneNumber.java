public class PhoneNumber {
    //fields
    private String countryCode;
    private String number;//12 characters

    public void setCountryCode(String countryCode) {
        if (countryCode.equals(""))
            this.countryCode = "(not saved)";
        else
            this.countryCode = countryCode;
    }


    public boolean setNumber(String number) {
        if (number.length() != 10) {
            return false;
        } else {
            this.number = number;
            return true;
        }
    }

    public String toString() {
        return "PhoneNumber: " + countryCode + " " + number;
    }
}
