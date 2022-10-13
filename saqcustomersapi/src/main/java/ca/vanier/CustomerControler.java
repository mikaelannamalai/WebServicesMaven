package ca.vanier;

import java.util.ArrayList;

public class CustomerControler {
  ArrayList<Customer> customerList = new ArrayList<>();

  public String save(String firstName, String lastName, int age) {
    if (age >= 18) { //// if age is equal or greater than 18 create a new customer and add to a Customer List
      customerList.add(new Customer(firstName, lastName, age)); ////
      return (
        "Successfully added: " +
        customerList.get(customerList.size() - 1).toString()
      );
    } else {
      return "Customer cannot be added";
    }
  }

  public void list() { ///// method to get all customers in the list
    System.out.println(customerList.toString());
  }
}
