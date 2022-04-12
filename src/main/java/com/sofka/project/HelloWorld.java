package com.sofka.project;

import javax.swing.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String data;
        data = JOptionPane.showInputDialog("Insert data");
        JOptionPane.showMessageDialog(null, "The inserted data is " + data);
    }
}
