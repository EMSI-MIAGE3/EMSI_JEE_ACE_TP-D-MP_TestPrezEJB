package ma.emsi.miage3.ecommerce.models;

import java.io.Serializable;

public class OrderItem implements Serializable {


  private Integer id;
  private Order order;
  private Article article;
  private Integer quantity;


  public OrderItem() {
    super();
  }

  public OrderItem(Article article, Integer quantity) {
    this.article = article;
    this.quantity = quantity;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }



  @Override
  public String toString() {
    return "OrderItem{" +
            "id=" + id +
            ", order_id=" + order.getId() +
            ", article=" + article +
            ", quantity=" + quantity +
            '}';
  }

}