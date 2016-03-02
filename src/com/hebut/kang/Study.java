package com.hebut.kang;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

class Study{
	
	public static void main(String[] args){
		
		Frame  fr=new Frame("Test Window");
		fr.setBounds(200,200,250,250);
		fr.setLayout(new BorderLayout(30,5));
		Panel p=new Panel();
		fr.add(new TextField(),BorderLayout.NORTH);
		Panel p2=new Panel();
		String[] name={"1","2","3","4","5","6","7","8","9","0","+","-","*","/","="};
		for(int i=0;i<name.length;i++){
			p2.add(new Button(name[i]));
		}
		fr.add(p);
		fr.add(p2);
		fr.pack();
		fr.setVisible(true);
	}
}