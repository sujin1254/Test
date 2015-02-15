package example.hungrystudent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SuperSnack extends ActionBarActivity{
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supersnack);
        
        Button a = (Button)findViewById(R.id.button1);
        a.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(SuperSnack.this, Snack_1.class);
        		startActivity(intent);        		
        	}
        });
	}
}