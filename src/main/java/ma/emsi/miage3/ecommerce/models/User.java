package ma.emsi.miage3.ecommerce.models;

import java.io.Serializable;
import java.util.List;


public class User implements Serializable {

  private Integer id;
  private String lastName;
  private String firstName;
  private String userName;
  private String email;
  private String city;
  private String phone;
  private String password;
  private UserRole role;
  private ShoppingCart shoppingCart;
  private List<Order> orders;

  public User() {
    super();
  }

  public User(String lastName, String firstName, String userName, String email, String city, String phone, String password, UserRole role) {
    super();
    this.lastName = lastName;
    this.firstName = firstName;
    this.userName = userName;
    this.email = email;
    this.city = city;
    this.phone = phone;
    this.password = password;
    this.role = role;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserRole getRole() {
    return role;
  }

  public void setRole(UserRole role) {
    this.role = role;
  }

  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", userName='" + userName + '\'' +
            ", email='" + email + '\'' +
            ", city='" + city + '\'' +
            ", phone='" + phone + '\'' +
            ", password='" + password + '\'' +
            ", role=" + role +
            ", shoppingCart=" + shoppingCart +
            ", orders=" + orders +
            '}';
  }
}
