package com.example.hometownportal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Nightlife extends ListActivity {
	
EntertainmentListAdapter adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		adapter = new EntertainmentListAdapter(this, R.layout.entertainment_entry, EntertainmentActivity.getNightlife());
		setListAdapter(adapter);
		
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void onListItemClick(ListView parent, View v, int position,
			long id) {
			Intent i = new Intent(this, EntertainmentDetails.class);
			i.putExtra("position", position);
			i.putExtra("list", "nightlife");
			startActivity(i);
	}

}
