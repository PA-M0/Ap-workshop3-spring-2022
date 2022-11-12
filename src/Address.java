import java.lang.String;
public class Address{
    //fields
    private String zipCode;
    private String country;
    private String city;
    private String email;



    public void setZipCode(String zipCode) {
        if (zipCode.equals("")) {
            this.zipCode = "(not saved)";
        }
        else {
            this.zipCode = zipCode;
        }
    }

    public void setCountry(String country) {
        if (country.equals("")) {
            this.country = "(not saved)";
        }
        else {
            this.country = country;
        }
    }

    public void setCity(String city) {
        if (city.equals("")) {
            this.city = "(not saved)";
        }
        else {
            this.city = city;
        }
    }


    public String toString() {
        return "Address: " + zipCode + " - " + country + " - " + city;
    }

}


