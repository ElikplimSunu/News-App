package com.android.sunuerico.newsapp.Values;

/**
 * Keys class to store the API keys for the app.
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class Keys {

	// Keys for extracting JSON object
	public static final String JSON_NEWS_OBJECT_KEY = "response";
	public static final String JSON_NEWS_ARRAY_KEY = "results";
	public static final String JSON_NEWS_SECTION_KEY = "sectionName";
	public static final String JSON_NEWS_HEADLINE_KEY = "webTitle";
	public static final String JSON_NEWS_PUBLISHED_TIME_KEY = "webPublicationDate";
	public static final String JSON_NEWS_URL_KEY = "webUrl";
	public static final String JSON_NEWS_FIELDS_KEY = "fields";
	public static final String JSON_NEWS_THUMBNAIL_KEY = "thumbnail";
	public static final String JSON_NEWS_TAGS_KEY = "tags";
	public static final String JSON_NEWS_AUTHOR_NAME_KEY = "webTitle";

	/**
	 * Private constructor to prevent instantiation of the class.
	 */
	Keys() {
		// Empty constructor so it cannot be used mistakenly
	}
}
