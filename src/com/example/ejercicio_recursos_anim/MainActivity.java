package com.example.ejercicio_recursos_anim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AnimationListener{

	Animation animFadein;
	TextView texto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn=(Button) findViewById(R.id.btnAnimacion);
		texto= (TextView) findViewById(R.id.lblTexto);
		animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in); 
		animFadein.setAnimationListener(this);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				texto.setVisibility(View.VISIBLE);
				texto.startAnimation(animFadein);
			}
		});
	}

	@Override
	public void onAnimationEnd(Animation animacion) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Animacion terminada!!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onAnimationRepeat(Animation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationStart(Animation arg0) {
		// TODO Auto-generated method stub
		
	}


}
