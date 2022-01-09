package edu.thi.demo.robotech_process_jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name=Customer.searchCustomer,
            query="SELECT c FROM Customer c WHERE c.email LIKE ?1")
@Table(name="Customer")
public class Customer implements Serializable {
    public final static String searchCustomer = "Customer.searchCustomer";

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long customerid;
    private String firstname;
    private String lastname;
    private String email;
    
    public Long getCustomerid() {
        return customerid;
    }
    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + customerid + "; Firstname: " + firstname + "; Lastname: " + lastname + "; Email: " + email;
    }
}
