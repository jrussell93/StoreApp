package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: John Russell
 * Date Created: 10/17/2015
 * Georgia Southern University - 900743229
 *
 *
 * Instance of Home Screen to be displayed
 */
/*
    Todo: For Home
        Add login feature
                Check username within database
                Check password within database
                If match login success
                If not... the world explodes?

        Add create account feature
                Get customer email
                Get password
                Username by default is set to the customers email

       How should we implement these features?
            My idea is a button for both LogIn and SignUp
            When the button is clicked display a small frame that asks for information above respectively

 */
public class HomeGUI extends JFrame {

    //<editor-fold defaultstate="collapsed" desc="JFrame Objects">
    private JPanel pnlHome;
    private JLabel lblTitle;
    private JButton btnMen;
    private JLabel lblWomen;
    private JButton btnWomen;
    private JLabel lblMen;
    //</editor-fold>

    public HomeGUI() {
        super("Store GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(pnlHome);
        setSize(445,400);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        //<editor-fold defaultstate="collapsed" desc="Button Listeners">
        btnMen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ShirtsPageGUI shirtsPage = new ShirtsPageGUI();
                shirtsPage.getMensIcon();
                shirtsPage.setVisible(true);
                shirtsPage.setIsMens(true);
            }
        });
        btnWomen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ShirtsPageGUI shirtsPage = new ShirtsPageGUI();
                shirtsPage.getWomensIcon();
                shirtsPage.setVisible(true);
                shirtsPage.setIsMens(false);
            }
        });
        //</editor-fold>
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
}
