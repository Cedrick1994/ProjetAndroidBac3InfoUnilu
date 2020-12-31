
	 
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class iphone_x_xs_11_pro___1_activity extends Activity {

	
	private View _bg__iphone_x_xs_11_pro___1_ek2;
	private ImageView encadrement_loyers;
	private View _rectangle_2;
	private TextView se_connecter;
	private TextView mpako;
	private TextView rl;
	private TextView mpakorl_est_une_application_mobile_android_mis_en_place_pour_mettre_en_relation_les_clients__locataire_et_bailleur__et_le_bureau_de_la_drhkat_;
	private TextView mpako_ek1;
	private TextView home;
	private ImageView ligne_1;
	private TextView mpakorl__version_1_0;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_x_xs_11_pro___1);

		
		_bg__iphone_x_xs_11_pro___1_ek2 = (View) findViewById(R.id._bg__iphone_x_xs_11_pro___1_ek2);
		encadrement_loyers = (ImageView) findViewById(R.id.encadrement_loyers);
		_rectangle_2 = (View) findViewById(R.id._rectangle_2);
		se_connecter = (TextView) findViewById(R.id.se_connecter);
		mpako = (TextView) findViewById(R.id.mpako);
		rl = (TextView) findViewById(R.id.rl);
		mpakorl_est_une_application_mobile_android_mis_en_place_pour_mettre_en_relation_les_clients__locataire_et_bailleur__et_le_bureau_de_la_drhkat_ = (TextView) findViewById(R.id.mpakorl_est_une_application_mobile_android_mis_en_place_pour_mettre_en_relation_les_clients__locataire_et_bailleur__et_le_bureau_de_la_drhkat_);
		mpako_ek1 = (TextView) findViewById(R.id.mpako_ek1);
		home = (TextView) findViewById(R.id.home);
		ligne_1 = (ImageView) findViewById(R.id.ligne_1);
		mpakorl__version_1_0 = (TextView) findViewById(R.id.mpakorl__version_1_0);
	
		
		_rectangle_2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_x_xs_11_pro___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	