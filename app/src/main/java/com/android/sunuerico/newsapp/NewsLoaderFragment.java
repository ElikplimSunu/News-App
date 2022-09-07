package com.android.sunuerico.newsapp;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import com.android.sunuerico.newsapp.Helpers.QueryUtilities;
import com.android.sunuerico.newsapp.Objects.News;

import java.util.List;

public class NewsLoaderFragment extends AsyncTaskLoader<List<News>>{
	private final String mUrl;

	/**
	 * NewsLoaderFragment constructor
	 *
	 * @param context  context of app
	 * @param queryUrl url string as per user input in SearchView
	 */
	public NewsLoaderFragment(Context context, String queryUrl) {
		super(context);
		mUrl = queryUrl;
	}

	@Override
	protected void onStartLoading() {
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
