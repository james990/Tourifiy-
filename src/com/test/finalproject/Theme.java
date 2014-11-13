package com.test.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Theme extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Utils.setThemeToActivity(this);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		startActivity(new Intent(getBaseContext(), SettingsTheme.class));
		Theme.this.finish();
	}
}
