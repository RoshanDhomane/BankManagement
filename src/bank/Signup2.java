package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JButton next;
    ButtonGroup buttonGroup;
    JRadioButton r1,r2,e1,e2;
    JTextField textpan,textAadhar;
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Sikh","Muslim","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(121, 211, 253));
        comboBox.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Catagory []={"General","OBC","SC","ST","Other"};
        comboBox2 =new JComboBox(Catagory);
        comboBox2.setBackground(new Color(121,211,253));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income [] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(121,211,253));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,200,30);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post_Graduate","Docturate","Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(121,211,253));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation [] ={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(121,211,253));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Ralway",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(121,211,253));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(121,211,253));
        r2.setBounds(450,490,100,30);
        add(r2);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 =new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(121,211,253));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(121,211,253));
        e2.setBounds(460,540,100,30);
        add(e2);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel l12 = new JLabel("Form No");
        l12.setFont(new Font("Raleway",Font.BOLD,12));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        add(next);
        next.addActionListener(this);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(121, 211, 253));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String)comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = textpan.getText();
        String aadhar = textAadhar.getText();

        String scitizen =" ";
        if((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if ((e1.isSelected())){
            eAccount ="yes";
        }else if ((e2.isSelected())){
            eAccount = "No";
        }
        try{
            if (textpan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                resource c1 = new resource();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}

