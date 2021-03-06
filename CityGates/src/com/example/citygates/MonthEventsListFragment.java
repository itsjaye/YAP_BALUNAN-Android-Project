package com.example.citygates;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MonthEventsListFragment extends ListFragment {
	static String text = "default";
	ArrayList<SelectedMonthEvents> items;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stu
		Log.d("CHECKTEXT", text);
		View v = super.onCreateView(inflater, container, savedInstanceState);
		SelectedMonthEvents.selectedMonth = text;
		items = SelectedMonthEvents.populateItems();

		MonthEventsAdapter adapter = new MonthEventsAdapter(this.getActivity(),
				items);
		this.setListAdapter(adapter);
		return v;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d("CHECKME", "I'm Here");
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub

	}

}
