public class Account {
  private String firstName;
  private String surname;
  private String number;
  private double balance;

  public Account() {}

  public Account(String firstName, String surname, String number, double balance) {
    this.firstName = firstName;
    this.surname = surname;
    this.number = number;
    this.balance = balance;
  }

  public boolean validateNumber() {
    return number != null && number.length() == 26;
  }

  public boolean makePayment(double value) {
    if (this.balance >= value) {
      this.balance -= value;
      return true;
    }
    System.out.println("Not enough money!");
    return false;
  }

  public void receiveTransfer(double value) {
    this.balance += value;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
