package co.com.bancolombia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "'Users'")
@Data
public class UserEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
}
