package com.example.votingapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PreviousPolls extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_previous_polls);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.previous_polls, menu);
		return true;
	}

}
