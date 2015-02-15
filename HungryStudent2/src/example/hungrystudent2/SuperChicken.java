package example.hungrystudent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SuperChicken extends ActionBarActivity{
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superchicken);
        
        Button a = (Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_1.class);
        		startActivity(intent);        		
        	}
        });
        
        Button b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_2.class);
        		startActivity(intent);        		
        	}
        });
        
        Button c = (Button)findViewById(R.id.button3);
        c.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_3.class);
        		startActivity(intent);        		
        	}
        });
        
        Button d = (Button)findViewById(R.id.button4);
        d.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_4.class);
        		startActivity(intent);        		
        	}
        });
        
        Button e = (Button)findViewById(R.id.button5);
        e.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_5.class);
        		startActivity(intent);        		
        	}
        });
        
        Button f = (Button)findViewById(R.id.button6);
        f.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_6.class);
        		startActivity(intent);        		
        	}
        });
        
        Button g = (Button)findViewById(R.id.button7);
        g.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_7.class);
        		startActivity(intent);        		
        	}
        });
        
        Button h = (Button)findViewById(R.id.button8);
        h.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_8.class);
        		startActivity(intent);        		
        	}
        });
        
        Button i = (Button)findViewById(R.id.button9);
        i.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_9.class);
        		startActivity(intent);        		
        	}
        });
        
        Button j = (Button)findViewById(R.id.button10);
        j.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_10.class);
        		startActivity(intent);        		
        	}
        });
        
        Button k = (Button)findViewById(R.id.button11);
        k.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_11.class);
        		startActivity(intent);        		
        	}
        });
        
        Button l = (Button)findViewById(R.id.button12);
        l.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_12.class);
        		startActivity(intent);        		
        	}
        });
        
        Button m = (Button)findViewById(R.id.button13);
        m.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_13.class);
        		startActivity(intent);        		
        	}
        });
        
        Button n = (Button)findViewById(R.id.button14);
        n.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_14.class);
        		startActivity(intent);        		
        	}
        });
        
        Button o = (Button)findViewById(R.id.button15);
        o.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_15.class);
        		startActivity(intent);        		
        	}
        });
        
        Button p = (Button)findViewById(R.id.button16);
        p.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_16.class);
        		startActivity(intent);        		
        	}
        });
        
        Button q = (Button)findViewById(R.id.button17);
        q.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_17.class);
        		startActivity(intent);        		
        	}
        });
        
        Button r = (Button)findViewById(R.id.button18);
        r.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperChicken.this, Chicken_18.class);
        		startActivity(intent);        		
        	}
        });
	}
}