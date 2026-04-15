package curd2.restapis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //primary key auto increment as id is unique for each student
    private Long id;
    private String name;
    private String email;
    private String address;

    public Student() { // Default constructor   
        super();
    }

    public Student(Long id, String name, String email, String address) { // Parameterized constructor
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Long getId() { // Getter for id
        return id;
    }

    public void setId(Long id) { // Setter for id
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    // to print in a readable format Student{id=1, name='John', email='john@gmail.com', address='us'}
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
