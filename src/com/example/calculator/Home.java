package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		initTextViews();
	}

	TextView WorkView;
	TextView ResultView;
	
	String set="";
	private Object input;
	
	
	public void initTextViews(){
		WorkView=(TextView)findViewById(R.id.Work);
		ResultView=(TextView)findViewById(R.id.Result);
	}
	public void setWorking(String given) {
		set=set+given;
		WorkView.setText(set);
	}
	public void equal(View view){
		WorkView.setText("");
		set="";
		ResultView.setText("");
	}
	public void clear(View view){
		WorkView.setText("");
		set="";
		ResultView.setText("");
	}
	
	    
	public void pow(View view){
		setWorking("^");
	}
	
	public void div(View view){
		setWorking("/");
	}
	
	public void mul(View view){
		setWorking("*");
	}
	
	public void sub(View view){
		setWorking("-");
		
	}
	public void plus(View view){
		setWorking("+");
	}
	public void n1(View view){
		setWorking("1");	
	}
	
	public void n2(View view){
		setWorking("2");	
	}
	
	public void n3(View view){
		setWorking("3");	
	}
	
	public void n4(View view){
		setWorking("4");	
	}
	
	public void n5(View view){
		setWorking("5");	
	}
	
	public void n6(View view){
		setWorking("6");
	}
	
	public void n7(View view){
		setWorking("7");
	}
	
	public void n8(View view){
		setWorking("8");
	}
	
	public void n9(View view){
		setWorking("9");
	}
	
	public void np(View view){
		setWorking(".");
	}
	
	public void n0(View view){
		setWorking("0");
	}
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
