
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_x_xs_11_pro___1
	 *	@date 		0
	 *	@title 		iPhone X/XS/11 Pro  1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class iphone_x_xs_11_pro___2_activity extends Activity {

	
	private View _bg__iphone_x_xs_11_pro___2_ek2;
	private View rectangle_7;
	private TextView login;
	private ImageView ligne_2;
	private View rectangle_2_ek1;
	private TextView _connexion;
	private View rectangle_3;
	private TextView your_email_;
	private View rectangle_4;
	private TextView your_email__ek1;
	private View rectangle_4_ek1;
	private TextView password_;
	private TextView mpakorl__version_1_0_ek1;
	private TextView saisir_votre_email_ici;
	private TextView saisir_votre_mot_de_passe_ici;
	private ImageView _trac__1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_x_xs_11_pro___2);

		
		_bg__iphone_x_xs_11_pro___2_ek2 = (View) findViewById(R.id._bg__iphone_x_xs_11_pro___2_ek2);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		login = (TextView) findViewById(R.id.login);
		ligne_2 = (ImageView) findViewById(R.id.ligne_2);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		_connexion = (TextView) findViewById(R.id._connexion);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		your_email_ = (TextView) findViewById(R.id.your_email_);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		your_email__ek1 = (TextView) findViewById(R.id.your_email__ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		password_ = (TextView) findViewById(R.id.password_);
		mpakorl__version_1_0_ek1 = (TextView) findViewById(R.id.mpakorl__version_1_0_ek1);
		saisir_votre_email_ici = (TextView) findViewById(R.id.saisir_votre_email_ici);
		saisir_votre_mot_de_passe_ici = (TextView) findViewById(R.id.saisir_votre_mot_de_passe_ici);
		_trac__1 = (ImageView) findViewById(R.id._trac__1);
	
		
		_connexion.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_trac__1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	