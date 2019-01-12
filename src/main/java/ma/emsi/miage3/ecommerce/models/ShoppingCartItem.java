package ma.emsi.miage3.ecommerce.models;

import java.io.Serializable;



public class ShoppingCartItem implements Serializable {

  private Integer id;
  private ShoppingCart shoppingCart;
  private Article article;
  private Integer quantity;



  public ShoppingCartItem() {
    super();
  }

  public ShoppingCartItem(Article article, Integer quantity) {
    super();
    this.article = article;
    this.quantity = quantity;
  }

  public ShoppingCartItem(ShoppingCart shoppingCart, Article article, Integer quantity) {
    super();
    this.shoppingCart = shoppingCart;
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

  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  @Override
  public String toString() {
    return "ShoppingCartItem{" +
            "id=" + id +
            ", shopping_cart_id=" + shoppingCart.getId() +
            ", article=" + article +
            ", quantity=" + quantity +
            '}';
  }
}
