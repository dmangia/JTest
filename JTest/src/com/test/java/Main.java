package com.test.java;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Archivio db=new Archivio();
     ArrayList<String> ls=db.setList();
     
     for(String item:ls)
     System.out.println("categorie: "+item);
	}

}
