/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author student
 */
public class JavaHw2 {
    
    JFrame frame = new JFrame("My Very First Window");
    JButton[][] grid; //names the grid of buttons

    /**
     * @param args the command line arguments
     */
    
    public JavaHw2(int width, int length){
        frame.setLayout(new GridLayout(width,length));
        grid = new JButton[width][length];
        
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton("CLICK HERE!!!"); //creates new button     
                frame.add(grid[x][y]); //adds button to grid
                //frame.add(grid[x][y]); //adds button to grid

                Random random = new Random();
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                Color backgroundColor = new Color(r, g, b);
                grid[x][y].setBackground(backgroundColor);
               
                JButton button1 = new JButton("1");
                grid[x][y].addActionListener(new ButtonPress()); 
                grid[x][y].setOpaque(true);
                grid[x][y].setBorderPainted(false);
            }
        }
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);   
    }
    
    public static void main(String[] args) { 
        new JavaHw2(3,4);
       // new JavaHw2(100,100);
    }
   }
   
    class ButtonPress implements ActionListener{
        int i =0;
        @Override
        public void actionPerformed(ActionEvent ae){
            JButton b =(JButton)ae.getSource();
            Random r = new Random();
            b.setBackground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        }
    }

