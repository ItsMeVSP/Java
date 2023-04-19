import javax.swing.*;
public class StudDriver{
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog(null,"enter name:");
        int age=Integer.parseInt(JOptionPane.showInputDialog("enter age:"));
        Stud s1=new Stud(name,age);
        s1.call();
    }
}