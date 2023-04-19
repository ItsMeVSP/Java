import javax.swing.*;
class BikeDriver
{
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog(null,"Enter Bike name:");
        double cc=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Bike CC:"));
        Bike b1=new Bike(name,cc);
        JOptionPane.showMessageDialog(null,"Bike Name:"+b1.brand+"Bike CC:"+b1.cc);
    }
}