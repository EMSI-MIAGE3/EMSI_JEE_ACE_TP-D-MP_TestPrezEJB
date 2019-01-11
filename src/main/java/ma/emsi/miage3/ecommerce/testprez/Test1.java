package ma.emsi.miage3.ecommerce.testprez;


import ma.emsi.miage3.ecommerce.ejbservices.ArticleRemote;
import ma.emsi.miage3.ecommerce.ejbservices.ShopRemote;
import ma.emsi.miage3.ecommerce.ejbservices.UserRemote;
import ma.emsi.miage3.ecommerce.models.Article;
import ma.emsi.miage3.ecommerce.models.ShoppingCartItem;
import ma.emsi.miage3.ecommerce.models.User;
import ma.emsi.miage3.ecommerce.models.UserRole;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Properties;

public class Test1 {
  public static void main(String[] args) {
    InitialContext context = null;
    try {
      Properties props = new Properties();
      props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
      context = new InitialContext(props);
      String lookupNameArticle =
              "ejb:/emsi-ecommerce//ArticleBean!ma.emsi.miage3.ecommerce.ejbservices.ArticleRemote";
      System.out.println(lookupNameArticle);
      ArticleRemote articleBean = (ArticleRemote) context.lookup(lookupNameArticle);

      String lookupNameUser =
              "ejb:/emsi-ecommerce//UserBean!ma.emsi.miage3.ecommerce.ejbservices.UserRemote";
      System.out.println(lookupNameUser);
      UserRemote userBean = (UserRemote) context.lookup(lookupNameUser);


      String lookupNameShop =
              "ejb:/emsi-ecommerce//ShopBean!ma.emsi.miage3.ecommerce.ejbservices.ShopRemote";
      System.out.println(lookupNameShop);
      ShopRemote shopBean = (ShopRemote) context.lookup(lookupNameShop);
//      Article article = articleBean.addArticle(new Article("X-Ap1","Apple MacBook Pro", "blum psum scrum agilum", 15, 25000));
      List<Article> articles = articleBean.getAllArticles();
      Article article = articles.get(0);

//      User user0 = userBean.addUser(new User("Administrateur", "Super", "superroot", "SkafCommunity@gmail.com", "DATA-CENTER", "0600000000", "admin123", UserRole.superAdministrateur));
//      User user1 = userBean.addUser(new User("NAJI", "Zakaria", "znaji", "Zakaria.NAJI@uca.edu.ma", "KHENIFRA", "0652755971", "naji123", UserRole.administrateur));
//      User user2 = userBean.addUser(new User("MAHTAT", "Youssef", "ymahtat", "Youssef.MAHTAT@gmail.com", "RABAT", "0622556515", "mahtat123", UserRole.administrateur));
//      User user3 = userBean.addUser(new User("COLISÈUM", "Amal", "amalc", "Amal@COLISEUM.ma", "Casablanca", "0689232356", "amal123", UserRole.client));
      List<User> users = userBean.getAllUsers();
      System.out.println(users);
      ShoppingCartItem shoppingCartItem = new ShoppingCartItem(article, 2);

      User user3 = users.get(3);
      shoppingCartItem.setShoppingCart(user3.getShoppingCart());
      shopBean.addItemToShoppingCart(shoppingCartItem);
      user3.getShoppingCart().getShoppingCartItems().add(shoppingCartItem);
      userBean.updateUser(user3);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        context.close();
      } catch (NamingException e) {
        e.printStackTrace();
      }
    }
  }
}