package com.example.votingapp;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class NewPoll extends Activity {
private Spinner spinner1;
private Button mStart, mAdd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_poll);
	
		
		mStart= (Button) findViewById(R.id.btnStart);
		mStart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(NewPoll.this, OngoingPoll.class);
				startActivity(i);
				finish();
			}
		});
		//addListenerOnButton();
		//addListenerOnSpinnerItemSelection();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_poll, menu);
		return true;
	}
	//not being used
	 public void addListenerOnSpinnerItemSelection() {
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		  }
	 //not being used
	 public void addListenerOnButton() {
		 
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			mStart.setOnClickListener(new OnClickListener() {
				 
				  @Override
				  public void onClick(View v) {
			 
				    Toast.makeText(NewPoll.this,
					"OnClickListener : " + 
			        "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
			    	Toast.LENGTH_LONG).show();
				  }
			});
			}
}
