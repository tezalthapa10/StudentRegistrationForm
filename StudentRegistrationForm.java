import javax.swing.*;
public class StudentRegistrationForm
{
    public static void main(String [] args){
        //create JFrame
        JFrame frame = new JFrame("Form1");
        
        //create an array of options
        String[] Year = {"1st","2nd","3rd","4th"};
        String[] SchoolYear = {"2010-2014","2009-2015","2010-2014","2009-2016","2004-2007"};
        String[] Status = {"Single","Married","Unmarried"};
        //create components for the frame
        JLabel lb1 = new JLabel("Student's Registration Form");
        JLabel lb2 = new JLabel("Student ID:");
        JTextField tf1 = new JTextField(20);
        JLabel lb3 = new JLabel("First Name:");
        JTextField tf2 = new JTextField(20);
        JLabel lb4 = new JLabel("Address:");
        JTextField tf3 = new JTextField(20);
        JLabel lb5 = new JLabel("Age:");
        JTextField tf4 = new JTextField(20);
        JLabel lb6 = new JLabel("Address:");
        JTextField tf5 = new JTextField(20);
        JLabel lb7 = new JLabel("Last Name:");
        JTextField tf6 = new JTextField(20);
        JLabel lb8 = new JLabel("Middle Name:");
        JTextField tf7 = new JTextField(20);
        JLabel lb9 = new JLabel("Place of Birth:");
        JTextField tf8 = new JTextField(20);
        JLabel lb10 = new JLabel("Guardian:");
        JTextField tf9 = new JTextField(20);
        JLabel lb11 = new JLabel("Relation:");
        JTextField tf10 = new JTextField(20);
        JLabel lb12 = new JLabel("Contact:");
        JTextField tf11 = new JTextField(20);
        JLabel lb13 = new JLabel("Date of Birth:");
        JTextField tf12 = new JTextField(20);
        JLabel lb14 = new JLabel("Year:");
        JLabel lb15 = new JLabel("School Year:");
        JLabel lb16 = new JLabel("Status:");
        JLabel lb17 = new JLabel("Gender:");
        JLabel lb18 = new JLabel("0  OF  0");
        
        JComboBox<String> cb1 = new JComboBox<>(Year);
        JComboBox<String> cb2 = new JComboBox<>(SchoolYear);
        JComboBox<String> cb3 = new JComboBox<>(Status);
        
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JButton btn1 = new JButton("l<");
        JButton btn2 = new JButton("<<");
        JButton btn3 = new JButton(">>");
        JButton btn4 = new JButton(">l");
        JButton btn5 = new JButton("New");
        JButton btn6 = new JButton("Save");
        
        lb1.setBounds(350,20,200,50);
        lb2.setBounds(20,80,100,50);
        lb3.setBounds(20,120,100,50);
        lb4.setBounds(33,160,130,50);
        lb5.setBounds(55,200,130,50);
        lb14.setBounds(53,240,130,50);
        lb6.setBounds(33,280,130,50);
        lb7.setBounds(280,120,100,50);
        lb13.setBounds(270,160,100,50);
        lb17.setBounds(300,200,100,50);
        lb10.setBounds(290,240,100,50);
        lb15.setBounds(540,80,100,50);
        lb8.setBounds(535,120,100,50);
        lb9.setBounds(530,160,100,50);
        lb16.setBounds(570,200,100,50);
        lb11.setBounds(560,240,100,50);
        lb12.setBounds(565,280,100,50);
        tf1.setBounds(90,95,120,20);
        tf2.setBounds(90,135,150,20);
        tf3.setBounds(90,175,150,20);
        tf4.setBounds(90,215,90,20);
        tf5.setBounds(90,295,150,20);
        tf6.setBounds(350,135,150,20);
        tf12.setBounds(350,175,150,20);
        tf9.setBounds(350,255,150,20);
        tf7.setBounds(620,135,150,20);
        tf8.setBounds(620,175,150,20);
        tf10.setBounds(620,255,150,20);
        tf11.setBounds(620,295,150,20);
        male.setBounds(350,215,70,20);
        female.setBounds(420,215,100,20);
        cb1.setBounds(90,255,90,20);
        cb2.setBounds(620,95,130,20);
        cb3.setBounds(620,215,130,20);
        btn1.setBounds(20,350,50,20);
        btn2.setBounds(75,350,50,20);
        btn3.setBounds(130,350,50,20);
        btn4.setBounds(185,350,50,20);
        btn5.setBounds(635,350,70,20);
        btn6.setBounds(720,350,100,20);
        lb18.setBounds(260,350,100,20);
        
        frame.add(lb1);
        frame.add(lb2);
        frame.add(lb3);
        frame.add(lb4);
        frame.add(lb5);
        frame.add(lb6);
        frame.add(lb7);
        frame.add(lb8);
        frame.add(lb9);
        frame.add(lb10);
        frame.add(lb11);
        frame.add(lb12);
        frame.add(lb13);
        frame.add(lb14);
        frame.add(lb15);
        frame.add(lb16);
        frame.add(lb17);
        frame.add(lb18);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(male);
        frame.add(female);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);
        frame.add(tf5);
        frame.add(tf6);
        frame.add(tf7);
        frame.add(tf8);
        frame.add(tf9);
        frame.add(tf10);
        frame.add(tf11);
        frame.add(tf12);
        
        //set size of frame
        frame.setLayout(null);
        frame.setSize(850,450);
        frame.setVisible(true);
    }
}

