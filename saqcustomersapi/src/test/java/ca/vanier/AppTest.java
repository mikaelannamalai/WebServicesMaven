package ca.vanier;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerTrue() throws Exception { ///// check if index[0] in newly created Customer List contains the first name passed in args
    String args[] = new String[3];
    args[0] = "Mikael";
    args[1] = "Annamalai";
    args[2] = "34";

    CustomerControler testcust = new CustomerControler();
    testcust.save(args[0], args[1], Integer.valueOf(args[2]));
    String result = testcust.customerList.get(0).getFirstName();
    assertEquals("Mikael", result);
  }

  @Test
  public void shouldAnswerCustomerCannotBeAdded() throws Exception { ////////// check if underage customer will not be added to list
    String args[] = new String[3];
    args[0] = "Chi";
    args[1] = "Tao";
    args[2] = "17";

    CustomerControler testcust = new CustomerControler();
    String result = testcust.save(args[0], args[1], Integer.valueOf(args[2]));

    assertEquals("Customer cannot be added", result);
  }

  @Test
  public void shouldAnswerCustomerAge() throws Exception { ////////// check if underage customer will not be added to list
    String args[] = new String[4];
    args[0] = "Leo";
    args[1] = "Mascarenhas";
    args[2] = "35";
    CustomerControler testcust = new CustomerControler();
    testcust.save(args[0], args[1], Integer.valueOf(args[2]));
    int result = testcust
      .customerList.get(testcust.customerList.size() - 1)
      .getAge();
    assertEquals(35, result);
  }

  @Test(expected = Exception.class)
  public void testExecuteException1() throws Exception {
    String args[] = new String[3];
    args[0] = "Mikael";
    args[1] = "34";
    args[2] = "Annamalai"; //// error should occur (NumberFormat exception; handled in the main class)
    CustomerControler testcust = new CustomerControler();
    testcust.save(args[0], args[1], Integer.valueOf(args[2]));
  }

  @Test(expected = Exception.class)
  public void testExecuteException2() throws Exception {
    String args[] = new String[3];
    CustomerControler testcust = new CustomerControler();
    testcust.save(args[0], args[1], Integer.valueOf(args[2])); /////////// error should occur (Number format exception: can't parse null string to int)
  }
}
