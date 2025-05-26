package TomatoJava.models;

import java.util.List;

public interface Order {
    String getType();

    int getOrderId();
    void setUser(User u);
    User getUser();
    void setRestaurant(Restaurant r);
    Restaurant getRestaurant();
    void setItems(List<MenuItem> its);
    List<MenuItem> getItems();
    void setPaymentStrategy(PaymentStrategy p);
    void setScheduled(String s);
    String getScheduled();
    double getTotal();
    void setTotal(int total);
    boolean processPayment();
}
