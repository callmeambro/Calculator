package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.view.Menu;
//import android.view.MenuItem;

public class MainActivity extends Activity {

	Handler h=new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		h.postDelayed(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,Home.class);
				startActivity(i);
				finish();
			}},2000);
	}
}
