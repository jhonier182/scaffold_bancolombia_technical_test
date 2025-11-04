package co.com.bancolombia.model.user;
import lombok.*;



@Data
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
}
