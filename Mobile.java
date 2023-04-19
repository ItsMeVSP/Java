import javax.swing.*;
class Mobile{
  String brand="apple";
  String color;
  double price;
  
  Mobile(String brand,double price, String color){
     this.brand=brand;
     this.price=price;
     this.color=color;
}
public void toCall(){
  JOptionPane.showMessageDialog(null,"name:"+brand+"\n"+"price:"+price+"\n"+"color:"+color);

}

}