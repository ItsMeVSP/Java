import javax.swing.*;
class Stud{
    String name;
    int age;

    Stud(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void call(){
        JOptionPane.showMessageDialog(null,"name:"+name+"\nage:"+age);
    }
}