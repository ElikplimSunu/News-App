package com.android.sunuerico.newsapp.Objects;

/**
 * News object that contains the title, section, date, and url of the news article from the Guardian API.
 * @author Eric Elikplim Sunu
 * @version 1.0
 */
public class News {

	private final String mHeadline;
	private final String mSection;
	private final String mAuthor;
	private final String mTime;
	private final String mWebUrl;
	private final String mThumbnailUrl;

	/**
	 * Constructor for News object
	 *
	 * @param headline  news headline
	 * @param section   section of news(i.e Technology, Sport, Life and Style etc.)
	 * @param author    author of article
	 * @param time      time at which article published
	 * @param webUrl    web URL of news item
	 * @param thumbnailUrl url string for thumbnail
	 */
	public News(String headline, String section, String author, String time, String webUrl, String thumbnailUrl) {
		mHeadline = headline;
		mSection = section;
		mAuthor = author;
		mTime = time;
		mWebUrl = webUrl;
		mThumbnailUrl = thumbnailUrl;
	}

	/**
	 * Getter method for headline
	 *
	 * @return headline of news article
	 */
	// Get the headline of news
	public String getHeadline() {
		return mHeadline;
	}

	/**
	 * Getter method for section
	 *
	 * @return section of news article
	 */
	// Get the section of news
	public String getSection() {
		return mSection;
	}

	/**
	 * Getter method for author
	 *
	 * @return author of news article
	 */
	// Get the author's name who has written the article
	public String getAuthor() {
		return mAuthor;
	}

	/**
	 * Getter method for time
	 *
	 * @return time of news article
	 */
	// Get the time at which article published
	public String getTime() {
		return mTime;
	}

	/**
	 * Getter method for web URL
	 *
	 * @return web URL of news article
	 */
	// Get the web Url of news article
	public String getWebUrl() {
		return mWebUrl;
	}

	/**
	 * Getter method for thumbnail URL
	 *
	 * @return thumbnail URL of news article
	 */
	// Get the url for news article thumbnail
	public String getThumbnailUrl(){
		return mThumbnailUrl;
	}
}
