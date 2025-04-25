package hostelapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Address {
    // Design pattern - Builder
    // Estamos implemementando, sem uso do Builder, com sobrecarga de construtores
    private String address;
    private String zipCode;
    private String city;
    private String state;

    public Address(String address, String zipCode, String city, String state) {
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public Address() {
        this("", null, null, null);
    }


    public static void main(String[] args) {
        Address address = new Address("Rua X", "123", "Alfenas", "MG");
        System.out.println(address.getCity());
    }


}
