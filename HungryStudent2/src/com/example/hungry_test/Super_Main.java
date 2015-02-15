package com.example.hungry_test;

import android.app.*;
import android.os.*;
import android.widget.*;

public class Super_Main extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ImageButton b1 = (ImageButton) findViewById(R.id.button1);
		b1.setEnabled(true);
	
		ImageButton b2 = (ImageButton) findViewById(R.id.button2);
		b2.setEnabled(true);
		
		ImageButton b3 = (ImageButton) findViewById(R.id.button3);
		b3.setEnabled(true);
		
		ImageButton b4 = (ImageButton) findViewById(R.id.button4);
		b4.setEnabled(true);
		
		ImageButton b5 = (ImageButton) findViewById(R.id.button5);
		b5.setEnabled(true);
		
		ImageButton b6 = (ImageButton) findViewById(R.id.button6);
		b6.setEnabled(true);
		
		ImageButton b7 = (ImageButton) findViewById(R.id.button7);
		b7.setEnabled(true);
		
		ImageButton b8 = (ImageButton) findViewById(R.id.button8);
		b8.setEnabled(true);
	}

}
