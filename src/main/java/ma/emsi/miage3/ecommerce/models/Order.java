package ma.emsi.miage3.ecommerce.models;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

  private Integer id;
  private User clientOwner;
  private List<OrderItem> orderItems;
  private Double totalAmount;

  public Order() {
    super();
  }

  public Order(User clientOwner) {
    super();
    this.clientOwner = clientOwner;
  }



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getClientOwner() {
    return clientOwner;
  }

  public void setClientOwner(User clientOwner) {
    this.clientOwner = clientOwner;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public Double getTotalAmount() {
    this.totalAmount = 0.0;
    this.getOrderItems().forEach(item -> totalAmount += item.getPrice());
    return this.totalAmount;
  }



  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", client_id" + clientOwner.getId() +
            ", orderItems=" + orderItems +
            ", totalAmount=" + totalAmount +
            '}';
  }
}
