package com.example.votingapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OngoingPoll extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ongoing_poll);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ongoing_poll, menu);
		return true;
	}

}
