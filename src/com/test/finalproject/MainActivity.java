package com.test.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends  ActionBarActivity implements View.OnClickListener {

	Button buttonLogin;
	Button buttonRegister;
	Button buttonTheme;
	Button buttonMaps;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Utils.setThemeToActivity(this);
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        buttonRegister = (Button)findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(this);
        buttonTheme = (Button)findViewById(R.id.buttonTheme);
        buttonTheme.setOnClickListener(this);
        buttonMaps = (Button)findViewById(R.id.buttonMaps);
        buttonMaps.setOnClickListener(this);
        
    }

    private void buttonLoginClick()
    {
    	startActivity (new Intent("MainApp"));
    }
    
    private void buttonRegisterClick()
    {
    	startActivity (new Intent("Register"));
    }
    
    private void buttonThemeClick()
    {
    	startActivity (new Intent("SettingsTheme"));
    }
    
    private void buttonMapsClick()
    {
    	startActivity (new Intent("GoogleMaps"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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



	@Override
	public void onClick(View v) {
		switch (v.getId())
		{
			case R.id.buttonLogin:
				buttonLoginClick();
				break;
				
		}
		switch (v.getId())
		{
		case R.id.buttonRegister:
			buttonRegisterClick();
			break;
		}
		switch (v.getId())
		{
		case R.id.buttonTheme:
			buttonThemeClick();
			break;
		}
		
		switch (v.getId())
		{
		case R.id.buttonMaps:
			buttonMapsClick();
			break;
		}
	}
}
