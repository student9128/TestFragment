package com.jing.testfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity implements OnClickListener{
private Button left;
private Button right;
private FragmentManager fm;
private LinearLayout ll_content;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		left = (Button) findViewById(R.id.left);
//		right = (Button) findViewById(R.id.right);
//		ll_content = (LinearLayout) findViewById(R.id.ll_content);
//		left.setOnClickListener(this);
//		right.setOnClickListener(this);
		fm= getSupportFragmentManager();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void onClick(View v) {
//		FragmentTransaction ft = fm.beginTransaction();
//		switch (v.getId()) {
//		case R.id.left:
//			ft.replace(R.id.ll_content, new LeftFragment(), "left");
//			break;
//		case R.id.right:
////			FragmentTransaction ft2 = fm.beginTransaction();
//			ft.replace(R.id.ll_content, new RightFragment(), "right");
//			break;
//
//		default:
//			break;
//		}
//		ft.commit();
//	}

}
