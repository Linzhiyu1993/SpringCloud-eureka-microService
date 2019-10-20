package cn.microservice.pojo;

public class OrderDetail {
   private String orderid;
   private item Item;
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public item getItem() {
	return Item;
}
public void setItem(item item) {
	Item = item;
}
public OrderDetail(String orderid, item item) {
	super();
	this.orderid = orderid;
	Item = item;
}
@Override
public String toString() {
	return "OrderDetail [orderid=" + orderid + ", Item=" + Item + "]";
}
   
}
