package ma.emsi.miage3.ecommerce.ejbservices.business.ejbEntities;


import javax.ejb.Remote;

@Remote
public interface TestEJB {
  public String ditBonjour(String aQui);
}
