package com.example.imageloader;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listview;
	private List<String> dataList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dataList = new ArrayList<String>();
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112517105023458.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513445888829.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013103114333980185.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513451398679.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513445441470.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513450697470.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112511364244876.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513440075464.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513452017131.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112513453033553.jpg");
		dataList.add("http://www.soutuchina.com:8083/picture/goods/2013112511573914437.jpg");
		
		setContentView(R.layout.activity_main);
		listview = (ListView)findViewById(R.id.listView);
		listview.setAdapter(new ListViewAdapter(this,dataList));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
