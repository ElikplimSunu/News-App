package com.android.sunuerico.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.android.sunuerico.newsapp.Fragments.CultureFragment;
import com.android.sunuerico.newsapp.Fragments.EducationFragment;
import com.android.sunuerico.newsapp.Fragments.FashionFragment;
import com.android.sunuerico.newsapp.Fragments.HomeFragment;
import com.android.sunuerico.newsapp.Fragments.LifeStyleFragment;
import com.android.sunuerico.newsapp.Fragments.PoliticsFragment;
import com.android.sunuerico.newsapp.Fragments.SportsFragment;
import com.android.sunuerico.newsapp.Fragments.TechnologyFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

/** NewsActivity is the main activity of the app.
 * It is responsible for displaying the navigation drawer and the fragments. This class extends {@link AppCompatActivity}
 * and implements {@link NavigationView.OnNavigationItemSelectedListener}.
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class NewsActivity extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener {

	/* Tag for log messages */
	private static final String LOG_TAG = NewsActivity.class.getName();

	/**
	 * This method is called when the activity is starting. It sets the content view to activity_news.xml
	 * @param savedInstanceState If the activity is being re-initialized after previously being shut
	 *                             down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news);

		Toolbar toolbar = findViewById(R.id.default_toolbar);
		setSupportActionBar(toolbar);

		// Setup the navigation drawer
		DrawerLayout drawer = findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.addDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);

		// Start the first Menu item in Navigation Drawer and highlight it
		onNavigationItemSelected(navigationView.getMenu().getItem(0).setChecked(true));
	}

	/**
	 * This method is called when an item in the navigation menu is selected. It displays the appropriate fragment.
	 * @param item The menu item that was selected.
	 * @return boolean Return false to allow normal menu processing to proceed, true to consume it here.
	 */
	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(@NonNull MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId();
		switch (id) {
			case R.id.nav_home:
				/** When user selects home from navigation drawer, start {@link HomeFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new HomeFragment())
						.commit();
				break;
			case R.id.nav_culture:
				/** When user selects culture from navigation drawer, start {@link CultureFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new CultureFragment())
						.commit();
				break;
			case R.id.nav_education:
				/** When user selects education from navigation drawer, start {@link EducationFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new EducationFragment())
						.commit();
				break;
			case R.id.nav_fashion:
				/** When user selects fashion from navigation drawer, start {@link FashionFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new FashionFragment())
						.commit();
				break;
			case R.id.nav_life_style:
				/** When user selects life and style from navigation drawer, start {@link LifeStyleFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new LifeStyleFragment())
						.commit();
				break;
			case R.id.nav_politics:
				/** When user selects politics from navigation drawer, start {@link PoliticsFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new PoliticsFragment())
						.commit();
				break;
			case R.id.nav_sports:
				/** When user sport home from navigation drawer, start {@link SportsFragment} */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new SportsFragment())
						.commit();
				break;
			case R.id.nav_technology:

				/** When user technology home from navigation drawer,
				 * start {@link TechnologyFragment}
				 */
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.content_body, new TechnologyFragment())
						.commit();
				break;
			case R.id.nav_settings:
				/** When user selects settings from navigation drawer, start {@link SettingsActivity} */
				Intent settingActivityIntent = new Intent(NewsActivity.this, SettingsActivity.class);
				startActivity(settingActivityIntent);
				break;
		}

		// When user selects an item from navigation drawer, close it
		DrawerLayout drawer = findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

	/**
	 * This method is called when the back button is pressed.
	 * It closes the navigation drawer if it is open. Otherwise, it closes the app.
	 */
	@Override
	public void onBackPressed() {
		// When user presses the back button and navigation drawer is open, close the drawer first
		DrawerLayout drawer = findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}

	/**
	 * This method is called when the options menu is created. It inflates the menu; this adds items to the action bar if it is present.
	 * @param title The options menu in which you place your items.
	 */
	// Change the title of action bar as per fragment
	public void setActionBarTitle(String title){
		Objects.requireNonNull(getSupportActionBar()).setTitle(title);
	}
}
