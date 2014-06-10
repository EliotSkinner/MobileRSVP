package com.example.votingapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button mNewPoll, mPreviousPoll, mCreateGroup, mViewGroup, mSetting;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mNewPoll= (Button) findViewById(R.id.btnNewPoll);
		mNewPoll.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, NewPoll.class);
				startActivity(i);
				finish();
			}
		});
		mPreviousPoll= (Button) findViewById(R.id.btnPreviousPoll);
		mPreviousPoll.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, PreviousPolls.class);
				startActivity(i);
			}
		});
		mCreateGroup= (Button) findViewById(R.id.btnCreateGroup);
		mCreateGroup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, CreateGroup.class);
				startActivity(i);
			}
		});
		mViewGroup= (Button) findViewById(R.id.btnViewGroup);
		mViewGroup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, ViewGroups.class);
				startActivity(i);
			}
		});
		mSetting= (Button) findViewById(R.id.btnSettings);
		mSetting.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, ViewGroups.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
