
import javax.swing.*;
import java.awt.*;
import static java.awt.Font.BOLD;

public class GUI {
    GUI() {

        String version = ("Enchanter++ v1"); // Version
        String updateln1 = ("<html>The current version is " + version + ". Added Armor button in main menu. Added armor images in Armor page. Checking the checkboxes in the Armor page now" +
                " changes the color to green. Changed armor position in Armor page. Added 'Tools' button in the main menu. Added Tools page. Added image of all tools in the Tools page." +
                " Added tool enchants. Added Weapons page. Added image of all weapons in the Weapons page.<html>");

        JFrame f = new JFrame(version); // Window
        JLabel t = new JLabel("Enchanter++"); // Title
        JPanel m = new JPanel();

        JLabel ln1 = new JLabel(updateln1);
        JLabel update = new JLabel("Update log: ");

        JLabel acl1 = new JLabel("<html>Protection 4, Mending, Aqua Affinity, Unbreaking 3, Respiration 3, Thorns 3<html>"); // Armor enchant
        JLabel acl2 = new JLabel("<html>Protection 4, Mending, Unbreaking 3, Thorns 3<html>"); // Armor enchant
        JLabel acl3 = new JLabel("<html>Protection 4, Mending, Unbreaking 3, Thorns 3<html>"); // Armor enchant
        JLabel acl4 = new JLabel("<html>Protection 4, Mending, Unbreaking 3, Feather Falling 4, Depth Strider 3<html>"); // Armor enchant

        JLabel tcl1 = new JLabel("<html>Mending, Silk Touch, Unbreaking 3, Efficiency 5<html>"); // Tool enchant
        JLabel tcl2 = new JLabel("<html>Mending, Unbreaking 3, Efficiency 5<html>"); // Tool enchant
        JLabel tcl3 = new JLabel("<html>Mending, Unbreaking 3, Efficiency 5, Fortune 3<html>"); // Tool enchant
        JLabel tcl4 = new JLabel("<html>Mending, Silk Touch Unbreaking 3, Efficiency 5<html>"); // Tool enchant

        JLabel wcl1 = new JLabel("<html>Mending, Unbreaking 3, Sharpness 5, Looting 3<html>"); // Weapons enchant
        JLabel wcl2 = new JLabel("<html>Mending, Unbreaking 3, Sharpness 5, Looting 3<html>"); // Weapons enchant
        JLabel wcl3 = new JLabel("<html>Mending, Flame, Unbreaking 3, Power 5<html>"); // Weapons enchant
        JLabel wcl4 = new JLabel("<html>Mending, Multishot, Unbreaking 3, Quick Charge 3<html>"); // Weapons enchant

        JButton ar = new JButton("Armor"); // Armor button
        JButton ls = new JButton("Tools"); // Tools button
        JButton ws = new JButton("Weapons"); // Weapons button
        JPanel a = new JPanel(); // Armor page
        JPanel l = new JPanel(); // Tools page
        JPanel w = new JPanel(); // Weapons page
        JButton ab = new JButton("Back"); // Armor Back Button
        JButton lsb = new JButton("Back"); // Tools Back Button
        JButton wsb = new JButton("Back"); // Weapons Back Button

        JCheckBox ac1 = new JCheckBox("Helmet"); // Armor checkbox1
        JCheckBox ac2 = new JCheckBox("Chestplate"); // Armor checkbox2
        JCheckBox ac3 = new JCheckBox("Leggings"); // Armor checkbox3
        JCheckBox ac4 = new JCheckBox("Boots"); // Armor checkbox4

        JCheckBox tc1 = new JCheckBox("Shovel"); // Tools checkbox1
        JCheckBox tc2 = new JCheckBox("Hoe"); // Tools checkbox2
        JCheckBox tc3 = new JCheckBox("Pickaxe"); // Tools checkbox3
        JCheckBox tc4 = new JCheckBox("Axe"); // Tools checkbox4

        JCheckBox wc1 = new JCheckBox("Sword"); // Weapon checkbox1
        JCheckBox wc2 = new JCheckBox("Axe"); // Weapon checkbox2
        JCheckBox wc3 = new JCheckBox("Bow"); // Weapon checkbox3
        JCheckBox wc4 = new JCheckBox("Crossbow"); // Weapon checkbox4

        JLabel at = new JLabel("Armor");
        JLabel lt = new JLabel("Tools");
        JLabel wt = new JLabel("Weapons");

        // Armor Button

        ar.setFont(new Font("", Font.PLAIN, 20));
        ar.setFocusPainted(false);
        ar.setForeground(Color.BLACK);
        ar.setBounds(20, 70, 150, 40);
        m.add(ar);
        ar.addActionListener(e -> {
            if (ar.isEnabled()) {
                m.setVisible(false);
                a.setVisible(true);
            }
        });

        // Armor Back Button

        ab.setFont(new Font("", Font.PLAIN, 20));
        ab.setFocusPainted(false);
        ab.setForeground(Color.BLACK);
        ab.setBounds(10, 10, 100, 40);
        a.add(ab);
        ab.addActionListener(e -> {
            if (ab.isEnabled()) {
                m.setVisible(true);
                a.setVisible(false);
                f.setTitle(version);
            }
        });

        // Armor Page

        a.setVisible(false);
        f.add(a);
        a.setBackground(Color.DARK_GRAY);
        a.setSize(600, 500);
        ar.addActionListener(e -> {
            if (ar.isEnabled()) {
                a.setVisible(true);
                f.setTitle(version + " - Armor");
            }
        });

        // Weapons Page

        w.setVisible(false);
        f.add(w);
        w.setBackground(Color.DARK_GRAY);
        w.setSize(600, 500);
        ws.addActionListener(e -> {
            if (ws.isEnabled()) {
                w.setVisible(true);
                m.setVisible(false);
                f.setTitle(version + " - Weapons");
            }
        });

        // Weapon checkboxes

        wc1.setBounds(30, 110, 100, 20);
        wc1.addActionListener(e -> {
            if (wc1.isSelected()) {
                wc1.setForeground(Color.GREEN);
            } else {
                wc1.setForeground(Color.WHITE);
            }
        });
        wc2.setBounds(30, 185, 120, 20);
        wc2.addActionListener(e -> {
            if (wc2.isSelected()) {
                wc2.setForeground(Color.GREEN);
            } else {
                wc2.setForeground(Color.WHITE);
            }
        });
        wc3.setBounds(30, 260, 120, 30);
        wc3.addActionListener(e -> {
            if (wc3.isSelected()) {
                wc3.setForeground(Color.GREEN);
            } else {
                wc3.setForeground(Color.WHITE);
            }
        });
        wc4.setBounds(30, 340, 120, 20);
        wc4.addActionListener(e -> {
            if (wc4.isSelected()) {
                wc4.setForeground(Color.GREEN);
            } else {
                wc4.setForeground(Color.WHITE);
            }
        });

        w.add(wc1);
        w.add(wc2);
        w.add(wc3);
        w.add(wc4);

        wc1.setFont(new Font("", Font.PLAIN, 20));
        wc2.setFont(new Font("", Font.PLAIN, 20));
        wc3.setFont(new Font("", Font.PLAIN, 20));
        wc4.setFont(new Font("", Font.PLAIN, 20));
        wc1.setFocusPainted(false);
        wc2.setFocusPainted(false);
        wc3.setFocusPainted(false);
        wc4.setFocusPainted(false);

        wc1.setBackground(Color.darkGray);
        wc1.setForeground(Color.WHITE);
        wc2.setBackground(Color.darkGray);
        wc2.setForeground(Color.WHITE);
        wc3.setBackground(Color.darkGray);
        wc3.setForeground(Color.WHITE);
        wc4.setBackground(Color.darkGray);
        wc4.setForeground(Color.WHITE);

        // Weapon enchants

        wcl1.setBounds(230, 70, 200, 100);
        wcl1.setFont(new Font(" ", Font.BOLD, 13));
        wcl2.setBounds(230, 150, 200, 100);
        wcl2.setFont(new Font(" ", Font.BOLD, 13));
        wcl3.setBounds(230, 230, 200, 100);
        wcl3.setFont(new Font(" ", Font.BOLD, 13));
        wcl4.setBounds(230, 305, 200, 100);
        wcl4.setFont(new Font(" ", Font.BOLD, 13));

        wcl1.setForeground(Color.WHITE);
        wcl2.setForeground(Color.WHITE);
        wcl3.setForeground(Color.WHITE);
        wcl4.setForeground(Color.WHITE);

        w.add(wcl1);
        w.add(wcl2);
        w.add(wcl3);
        w.add(wcl4);

        // Weapon back button

        wsb.setFont(new Font("", Font.PLAIN, 20));
        wsb.setFocusPainted(false);
        wsb.setForeground(Color.BLACK);
        wsb.setBounds(10, 10, 100, 40);
        w.add(wsb);
        wsb.addActionListener(e -> {
            if (wsb.isEnabled()) {
                m.setVisible(true);
                w.setVisible(false);
                f.setTitle(version);
            }
        });

        // Weapons button

        ws.setFont(new Font("", Font.PLAIN, 20));
        ws.setFocusPainted(false);
        ws.setForeground(Color.BLACK);
        ws.setBounds(415, 70, 150, 40);
        m.add(ws);
        ws.addActionListener(e -> {
            if (ws.isEnabled()) {
                m.setVisible(false);
                w.setVisible(true);
            }
        });

        // Weapons Text

        wt.setFont(new Font("", Font.BOLD, 45));
        wt.setForeground(Color.WHITE);
        wt.setBounds(215, 10, 600, 45);
        wt.setBackground(Color.DARK_GRAY);
        w.add(wt);

        // Tools Page

        l.setVisible(false);
        f.add(l);
        l.setBackground(Color.DARK_GRAY);
        l.setSize(600, 500);
        ls.addActionListener(e -> {
            if (ls.isEnabled()) {
                l.setVisible(true);
                m.setVisible(false);
                f.setTitle(version + " - Tools");
            }
        });

        // Tool Checkboxes

        tc1.setBounds(30, 110, 100, 20);
        tc1.addActionListener(e -> {
            if (tc1.isSelected()) {
                tc1.setForeground(Color.GREEN);
            } else {
                tc1.setForeground(Color.WHITE);
            }
        });
        tc2.setBounds(30, 185, 120, 20);
        tc2.addActionListener(e -> {
            if (tc2.isSelected()) {
                tc2.setForeground(Color.GREEN);
            } else {
                tc2.setForeground(Color.WHITE);
            }
        });
        tc3.setBounds(30, 260, 120, 30);
        tc3.addActionListener(e -> {
            if (tc3.isSelected()) {
                tc3.setForeground(Color.GREEN);
            } else {
                tc3.setForeground(Color.WHITE);
            }
        });
        tc4.setBounds(30, 340, 100, 20);
        tc4.addActionListener(e -> {
            if (tc4.isSelected()) {
                tc4.setForeground(Color.GREEN);
            } else {
                tc4.setForeground(Color.WHITE);
            }
        });

        l.add(tc1);
        l.add(tc2);
        l.add(tc3);
        l.add(tc4);

        tc1.setFont(new Font("", Font.PLAIN, 20));
        tc2.setFont(new Font("", Font.PLAIN, 20));
        tc3.setFont(new Font("", Font.PLAIN, 20));
        tc4.setFont(new Font("", Font.PLAIN, 20));
        tc1.setFocusPainted(false);
        tc2.setFocusPainted(false);
        tc3.setFocusPainted(false);
        tc4.setFocusPainted(false);

        tc1.setBackground(Color.darkGray);
        tc1.setForeground(Color.WHITE);
        tc2.setBackground(Color.darkGray);
        tc2.setForeground(Color.WHITE);
        tc3.setBackground(Color.darkGray);
        tc3.setForeground(Color.WHITE);
        tc4.setBackground(Color.darkGray);
        tc4.setForeground(Color.WHITE);

        // Tools enchants

        tcl1.setBounds(230, 70, 200, 100);
        tcl1.setFont(new Font(" ", Font.BOLD, 13));
        tcl2.setBounds(230, 150, 200, 100);
        tcl2.setFont(new Font(" ", Font.BOLD, 13));
        tcl3.setBounds(230, 230, 200, 100);
        tcl3.setFont(new Font(" ", Font.BOLD, 13));
        tcl4.setBounds(230, 305, 200, 100);
        tcl4.setFont(new Font(" ", Font.BOLD, 13));

        tcl1.setForeground(Color.WHITE);
        tcl2.setForeground(Color.WHITE);
        tcl3.setForeground(Color.WHITE);
        tcl4.setForeground(Color.WHITE);

        l.add(tcl1);
        l.add(tcl2);
        l.add(tcl3);
        l.add(tcl4);

        // Tools Back Button

        lsb.setFont(new Font("", Font.PLAIN, 20));
        lsb.setFocusPainted(false);
        lsb.setForeground(Color.BLACK);
        lsb.setBounds(10, 10, 100, 40);
        l.add(lsb);
        lsb.addActionListener(e -> {
            if (lsb.isEnabled()) {
                m.setVisible(true);
                l.setVisible(false);
                f.setTitle(version);
            }
        });

        // Tools Button

        ls.setFont(new Font("", Font.PLAIN, 20));
        ls.setFocusPainted(false);
        ls.setForeground(Color.BLACK);
        ls.setBounds(215, 70, 150, 40);
        m.add(ls);
        ls.addActionListener(e -> {
            if (ls.isEnabled()) {
                m.setVisible(false);
                l.setVisible(true);
            }
        });

        // Tools Text

        lt.setFont(new Font("", Font.BOLD, 45));
        lt.setForeground(Color.WHITE);
        lt.setBounds(250, 15, 600, 35);
        lt.setBackground(Color.DARK_GRAY);
        l.add(lt);

        // Armor Text

        at.setFont(new Font("", Font.BOLD, 45));
        at.setForeground(Color.WHITE);
        at.setBounds(250, 15, 600, 35);
        at.setBackground(Color.DARK_GRAY);
        a.add(at);

        // Armor images

        ImageIcon armor = new ImageIcon(getClass().getResource("all.png"));

        JLabel label1 = new JLabel(armor);
        label1.setBounds(150, 41, 96, 384);
        a.add(label1);

        ImageIcon tools = new ImageIcon(getClass().getResource("tools.png"));

        JLabel tools1 = new JLabel(tools);
        tools1.setBounds(130, 41, 96, 384);
        l.add(tools1);

        ImageIcon weapons = new ImageIcon(getClass().getResource("weapons.png"));

        JLabel weapons1 = new JLabel(weapons);
        weapons1.setBounds(130, 41, 96, 384);
        w.add(weapons1);

        ImageIcon enchnt = new ImageIcon(getClass().getResource("Ench.png"));

        JLabel enchant = new JLabel(enchnt);
        enchant.setBounds(0, 230, 600, 384);
        m.add(enchant);

        ImageIcon line = new ImageIcon(getClass().getResource("line.png"));

        JLabel label2 = new JLabel(line);
        label2.setBounds(0, 45, 600, 20);
        f.add(label2);

        ImageIcon line2 = new ImageIcon(getClass().getResource("line.png"));

        JLabel label3 = new JLabel(line2);
        label3.setBounds(0, 115, 600, 20);
        f.add(label3);

        ImageIcon line4 = new ImageIcon(getClass().getResource("line.png"));

        JLabel label5 = new JLabel(line4);
        label5.setBounds(0, 55, 600, 20);
        w.add(label5);

        ImageIcon line3 = new ImageIcon(getClass().getResource("line.png"));

        JLabel label4 = new JLabel(line3);
        label4.setBounds(0, 55, 600, 20);
        a.add(label4);

        ImageIcon line6 = new ImageIcon(getClass().getResource("line.png"));

        JLabel label7 = new JLabel(line6);
        label7.setBounds(0, 55, 600, 20);
        l.add(label7);

        // Armor  checkboxes

        ac1.setFont(new Font("", Font.PLAIN, 20));
        ac2.setFont(new Font("", Font.PLAIN, 20));
        ac3.setFont(new Font("", Font.PLAIN, 20));
        ac4.setFont(new Font("", Font.PLAIN, 20));

        a.add(ac1);
        a.add(ac2);
        a.add(ac3);
        a.add(ac4);

        a.add(acl1);
        a.add(acl2);
        a.add(acl3);
        a.add(acl4);

        ac1.setBounds(30, 110, 100, 20);
        ac1.addActionListener(e -> {
            if (ac1.isSelected()) {
                ac1.setForeground(Color.GREEN);
            } else {
                ac1.setForeground(Color.WHITE);
            }
        });
        ac2.setBounds(30, 185, 120, 20);
        ac2.addActionListener(e -> {
            if (ac2.isSelected()) {
                ac2.setForeground(Color.GREEN);
            } else {
                ac2.setForeground(Color.WHITE);
            }
        });
        ac3.setBounds(30, 260, 120, 30);
        ac3.addActionListener(e -> {
            if (ac3.isSelected()) {
                ac3.setForeground(Color.GREEN);
            } else {
                ac3.setForeground(Color.WHITE);
            }
        });
        ac4.setBounds(30, 340, 100, 20);
        ac4.addActionListener(e -> {
            if (ac4.isSelected()) {
                ac4.setForeground(Color.GREEN);
            } else {
                ac4.setForeground(Color.WHITE);
            }
        });

        acl1.setBounds(260, 70, 200, 100);
        acl1.setFont(new Font(" ", Font.BOLD, 13));
        acl2.setBounds(260, 150, 200, 100);
        acl2.setFont(new Font(" ", Font.BOLD, 13));
        acl3.setBounds(260, 230, 200, 100);
        acl3.setFont(new Font(" ", Font.BOLD, 13));
        acl4.setBounds(260, 305, 200, 100);
        acl4.setFont(new Font(" ", Font.BOLD, 13));

        ac1.setFocusPainted(false);
        ac2.setFocusPainted(false);
        ac3.setFocusPainted(false);
        ac4.setFocusPainted(false);

        ac1.setBackground(Color.darkGray);
        ac1.setForeground(Color.WHITE);
        ac2.setBackground(Color.darkGray);
        ac2.setForeground(Color.WHITE);
        ac3.setBackground(Color.darkGray);
        ac3.setForeground(Color.WHITE);
        ac4.setBackground(Color.darkGray);
        ac4.setForeground(Color.WHITE);

        acl1.setForeground(Color.WHITE);
        acl2.setForeground(Color.WHITE);
        acl3.setForeground(Color.WHITE);
        acl4.setForeground(Color.WHITE);

        // Main Screen

        t.setFont(new Font("", BOLD, 35));
        t.setForeground(Color.WHITE);
        t.setBounds(190, 10, 250, 35);
        m.setVisible(true);
        m.add(t);
        m.setSize(600, 500);
        m.setBackground(Color.DARK_GRAY);
        f.add(m);

        // Main screen text

        ln1.setFont(new Font("", Font.PLAIN, 15));
        ln1.setForeground(Color.WHITE);
        ln1.setBounds(95, 53, 450, 300); // y last number has to be 3, add 10 to the y value for each line
        ln1.setBackground(Color.DARK_GRAY);
        m.add(ln1);

        update.setFont(new Font("", BOLD, 15));
        update.setForeground(Color.WHITE);
        update.setBounds(10, 125, 600, 35);
        update.setBackground(Color.DARK_GRAY);
        m.add(update);

        // GUI

        f.setSize(600, 500); // 600, 500
        a.setLayout(null);
        l.setLayout(null);
        m.setLayout(null);
        w.setLayout(null);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.DARK_GRAY);

        // Icon

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage("D:/Downloads/ench.png");
        f.setIconImage(img);
}
    public static void main(String[] args) {
        new GUI();
    }
}