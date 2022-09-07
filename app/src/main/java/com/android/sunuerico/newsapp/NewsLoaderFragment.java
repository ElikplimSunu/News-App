package com.android.sunuerico.newsapp;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import com.android.sunuerico.newsapp.Helpers.QueryUtilities;
import com.android.sunuerico.newsapp.Objects.News;

import java.util.List;

/**
 * Loads a list of news by using an AsyncTask to perform the
 * network request to the given URL.
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class NewsLoaderFragment extends AsyncTaskLoader<List<News>>{

	/**
	 * field for the url. This is the url that will be used to get the data from the guardian api server.
	 */
	private final String mUrl;

	/**
	 * NewsLoaderFragment constructor
	 *
	 * @param context  context of app
	 * @param queryUrl url string as per user input in SearchView
	 */
	public NewsLoaderFragment(Context context, String queryUrl) {
		// Initialize the Loader with the given ID and callbacks.
		super(context);
		mUrl = queryUrl;
	}

	/**
	 * This is on a background thread.
	 */
	@Override
	protected void onStartLoading() {
		//forceLoad() is a method of the AsyncTaskLoader class that we are extending.
		super.onStartLoading();
		forceLoad();
	}

	/**
	 * This method is called to load data from url string in background thread
	 *
	 * @return News detail in form of List<News>
	 */
	@Override
	public List<News> loadInBackground() {

		// If url string is null return null object
		if (mUrl == null) {
			return null;
		}

		// Get the List<News> from URL string queried by user
		List<News> newsData = QueryUtilities.fetchNewsData(mUrl);
		return newsData;
	}
}
