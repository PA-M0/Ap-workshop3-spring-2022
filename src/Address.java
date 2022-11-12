public class Address{
    //fields
    int zipCode;
    String country;
    String city;
    String email;

    public Address(int zipCode, String country, String city, String email) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.email = email;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void stringToString(){
        System.out.println("Zip code :"+ zipCode +
                            "Country :"+ country +
                            "City : " + city +
                            "Email : "+ email);
    }
}
