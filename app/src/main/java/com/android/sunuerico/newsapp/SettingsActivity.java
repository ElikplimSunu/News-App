package com.android.sunuerico.newsapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * SettingsActivity is the activity that allows the user to change the settings of the app
 * such as the number of articles to display, the order of the articles and whether to show the
 * news author or not.
 *
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class SettingsActivity extends AppCompatActivity {
	/**
	 * This method is called when the activity is starting. This is where most initialization should go:
	 * @param savedInstanceState If the activity is being re-initialized after previously being shut down then
	 * this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	/**
	 * This fragment shows the preferences for the first header.
	 */
	public static class NewsPreferenceSettings extends PreferenceFragment
			implements Preference.OnPreferenceChangeListener {

		/**
		 * This method is called when the fragment is visible to the user and actively running.
		 * @param savedInstanceState If the fragment is being re-created from a previous saved state,
		 *                                this is the state. This value may be null.
		 */
		@Override
		public void onCreate(@Nullable Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.settings_main);

			/* Find the preference for order by and set the summary */
			Preference orderByPreference = findPreference(getString(R.string.settings_order_by_key));
			bindPreferenceSummaryToValue(orderByPreference);

			/* Find preference for number of articles per page and set the summary */
			Preference numberOfArticlesPreference = findPreference(getString(R.string.settings_number_of_articles_key));
			bindPreferenceSummaryToValue(numberOfArticlesPreference);
		}

		/**
		 * This method is called when a Preference has been changed by the user. This is called before the state of the
		 * Preference is about to be updated and before the state is persisted.
		 * @param preference The changed Preference.
		 * @param value The new value The new value of the Preference.
		 * @return True to update the state of the Preference with the new value.
		 */
		@Override
		public boolean onPreferenceChange(Preference preference, Object value) {
			String stringValue = value.toString();
			if (preference instanceof ListPreference) {
				ListPreference listPreference = (ListPreference) preference;
				int prefIndex = listPreference.findIndexOfValue(stringValue);
				if (prefIndex >= 0) {
					CharSequence[] labels = listPreference.getEntries();
					preference.setSummary(labels[prefIndex]);
				}

			} else {
				preference.setSummary(stringValue);
			}
			return true;
		}

		/**
		 * This method is called when the fragment is visible to the user and actively running.
		 * @param preference The changed Preference.
		 */
		private void bindPreferenceSummaryToValue(Preference preference) {
			preference.setOnPreferenceChangeListener(this);
			SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(preference.getContext());
			String preferenceString = preferences.getString(preference.getKey(), "");
			onPreferenceChange(preference, preferenceString);
		}
	}
}
