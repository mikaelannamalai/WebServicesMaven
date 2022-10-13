package ca.vanier;

public class Customer {
  private String firstName;
  private String lastName;
  private int age;

  public Customer() {} ///default just in case

  public Customer(String firstName, String lastName, int age) { // constructor .. use the setters to create an instance of a customer
    setFirstName(firstName);
    setLastName(lastName);
    setAge(age);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return (
      "\nCustomer [firstName=" +
      firstName +
      ", lastName=" +
      lastName +
      ", age=" +
      age +
      "]\n"
    );
  }
}
