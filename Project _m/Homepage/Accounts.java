package Homepage;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Accounts {
    private String username;
    private String pass;

    private File file;
    private FileWriter fwriter;
    private Scanner sc;

    public Accounts() {
        this.username = "";
    }

    public Accounts(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getusername() {
        return username;
    }

    public String getpass() {
        return pass;
    }

    public void addaccount() {
        try {
            file = new File("./Accounts.txt");
            file.createNewFile();
            fwriter = new FileWriter(file, true);
            fwriter.write(getusername() + "\t");
            fwriter.write(getpass() + "\n");
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public boolean getAccount(String username, String pass) {
        boolean flag = false;
        file = new File("./Accounts.txt");

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(username) && value[1].equals(pass)) {
                    flag = true;
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return flag;

    }

}