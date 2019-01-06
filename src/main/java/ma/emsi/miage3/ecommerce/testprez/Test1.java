package ma.emsi.miage3.ecommerce.testprez;


import ma.emsi.miage3.ecommerce.ejbservices.business.ejbEntities.TestEJB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class Test1 {
  public static void main(String[] args) {
    InitialContext context = null;
    try {
      Properties props = new Properties();
      props.put(Context.URL_PKG_PREFIXES,
              "org.jboss.ejb.client.naming");
      context = new InitialContext(props);
      String lookupName =
              "ejb:/E_Commerce_EJB_Services_ejb_exploded//TestEJBBean!ma.emsi.miage3.ecommerce.ejbservices.business.ejbEntities.TestEJB";
      System.out.println(lookupName);
      TestEJB bean = (TestEJB) context.lookup(lookupName);
      System.out.println(bean.ditBonjour("Ibrahim"));
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