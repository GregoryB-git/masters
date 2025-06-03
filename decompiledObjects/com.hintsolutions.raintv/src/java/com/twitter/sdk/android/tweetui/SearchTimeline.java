/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 *  retrofit2.Call
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Search;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.services.params.Geocode;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineResult;
import java.text.SimpleDateFormat;
import java.util.Locale;
import retrofit2.Call;
import retrofit2.Callback;

public class SearchTimeline
extends BaseTimeline
implements Timeline<Tweet> {
    public static final String FILTER_RETWEETS = " -filter:retweets";
    private static final SimpleDateFormat QUERY_DATE = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private static final String SCRIBE_SECTION = "search";
    public final Geocode geocode;
    public final String languageCode;
    public final Integer maxItemsPerRequest;
    public final String query;
    public final String resultType;
    public final TwitterCore twitterCore;
    public final String untilDate;

    public SearchTimeline(TwitterCore object, String string2, Geocode geocode, String string3, String string4, Integer n, String string5) {
        this.twitterCore = object;
        this.languageCode = string4;
        this.maxItemsPerRequest = n;
        this.untilDate = string5;
        this.resultType = string3;
        object = string2 == null ? null : z2.o(string2, FILTER_RETWEETS);
        this.query = object;
        this.geocode = geocode;
    }

    public Call<Search> createSearchRequest(Long l, Long l2) {
        return this.twitterCore.getApiClient().getSearchService().tweets(this.query, this.geocode, this.languageCode, null, this.resultType, this.maxItemsPerRequest, this.untilDate, l, l2, Boolean.TRUE);
    }

    @Override
    public String getTimelineType() {
        return SCRIBE_SECTION;
    }

    @Override
    public void next(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createSearchRequest(l, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void previous(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createSearchRequest(null, BaseTimeline.decrementMaxId(l)).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }
}

