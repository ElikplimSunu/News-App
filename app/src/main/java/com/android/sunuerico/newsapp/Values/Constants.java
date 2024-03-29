package com.android.sunuerico.newsapp.Values;

/**
 * Constants class to store all the constants used in the app.
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class Constants {

	// Constants for making an http connection
	public static final int URL_READ_TIME_OUT = 10000;
	public static final int URL_CONNECT_TIME_OUT = 15000;
	public static final int URL_SUCCESS_RESPONSE_CODE = 200;
	public static final String URL_REQUEST_METHOD = "GET";

	// URL data for building uri
	public static final String URL_SCHEME = "https";
	public static final String URL_AUTHORITY = "content.guardianapis.com";
	public static final String URL_PATH = "search";
	public static final String URL_QUERY_PARAMETER = "q";
	public static final String URL_SECTION = "section";
	public static final String URL_SHOW_FIELDS = "show-fields";
	public static final String URL_SHOW_FIELDS_WITH_THUMBNAIL = "thumbnail,trailText";
	public static final String URL_SHOW_FIELDS_NO_THUMBNAIL = "trailText";
	public static final String URL_SHOW_TAGS = "show-tags";
	public static final String URL_SHOW_TAGS_CONTRIBUTOR = "contributor";
	public static final String URL_ORDER_BY = "order-by";
	public static final String URL_ORDER_BY_NEWEST = "newest";
	public static final String URL_PAGE_SIZE = "page-size";
	public static final String URL_API_KEY = "api-key";
	public static final String URL_API_KEY_VALUE = "test";

	// Sections id
	public static final String SECTION_CULTURE = "culture";
	public static final String SECTION_EDUCATION = "education";
	public static final String SECTION_FASHION = "fashion";
	public static final String SECTION_LIFE_STYLE = "lifeandstyle";
	public static final String SECTION_POLITICS = "politics";
	public static final String SECTION_SPORTS = "sport";
	public static final String SECTION_TECHNOLOGY = "technology";

	/**
	 * Private constructor to prevent instantiation of the class.
	 */
	Constants() {
		// Empty constructor so it cannot be used mistakenly
	}
}
