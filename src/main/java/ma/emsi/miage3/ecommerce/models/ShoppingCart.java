package ma.emsi.miage3.ecommerce.models;

import java.io.Serializable;
import java.util.List;

public class ShoppingCart implements Serializable {

  private Integer id;
  private User clientOwner;
  private List<ShoppingCartItem> shoppingCartItems;

  public ShoppingCart() {
    super();
  }

  public ShoppingCart(User clientOwner) {
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

  public List<ShoppingCartItem> getShoppingCartItems() {
    return shoppingCartItems;
  }

  public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
    this.shoppingCartItems = shoppingCartItems;
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
            "id=" + id +
            ", id=client_id" + clientOwner.getId() +
            ", shoppingCartItems=" + shoppingCartItems +
            '}';
  }
}
