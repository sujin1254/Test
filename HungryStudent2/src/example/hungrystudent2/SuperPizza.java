package example.hungrystudent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SuperPizza extends ActionBarActivity{
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superpizza);
        
        Button a = (Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperPizza.this, Pizza1_pizzamyungga.class);
        		startActivity(intent);        		
        	}
        });   
        
        Button b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperPizza.this, Pizza_2.class);
        		startActivity(intent);        		
        	}
        });  
        
        Button c = (Button)findViewById(R.id.button3);
        c.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperPizza.this, Pizza_3.class);
        		startActivity(intent);        		
        	}
        });
	}
}