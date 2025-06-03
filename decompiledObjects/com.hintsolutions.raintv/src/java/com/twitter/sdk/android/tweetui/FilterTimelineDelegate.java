/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.ScribeConstants;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineDelegate;
import com.twitter.sdk.android.tweetui.TimelineFilter;
import com.twitter.sdk.android.tweetui.TimelineResult;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.TweetUi;
import java.util.ArrayList;
import java.util.List;

class FilterTimelineDelegate
extends TimelineDelegate<Tweet> {
    public static final String TOTAL_APPLIED_FILTERS_JSON_PROP = "total_filters";
    public static final String TWEETS_COUNT_JSON_PROP = "tweet_count";
    public static final String TWEETS_FILTERED_JSON_PROP = "tweets_filtered";
    public final Gson gson = new Gson();
    public final TimelineFilter timelineFilter;
    public final TweetUi tweetUi;

    public FilterTimelineDelegate(Timeline<Tweet> timeline, TimelineFilter timelineFilter) {
        super(timeline);
        this.timelineFilter = timelineFilter;
        this.tweetUi = TweetUi.getInstance();
    }

    private String getJsonMessage(int n, int n2, int n3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(TWEETS_COUNT_JSON_PROP, (Number)Integer.valueOf((int)n));
        jsonObject.addProperty(TWEETS_FILTERED_JSON_PROP, (Number)Integer.valueOf((int)(n - n2)));
        jsonObject.addProperty(TOTAL_APPLIED_FILTERS_JSON_PROP, (Number)Integer.valueOf((int)n3));
        return this.gson.toJson((JsonElement)jsonObject);
    }

    @Override
    public void next(Callback<TimelineResult<Tweet>> callback) {
        this.loadNext(this.timelineStateHolder.positionForNext(), new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void previous() {
        this.loadPrevious(this.timelineStateHolder.positionForPrevious(), new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void refresh(Callback<TimelineResult<Tweet>> callback) {
        this.timelineStateHolder.resetCursors();
        this.loadNext(this.timelineStateHolder.positionForNext(), new /* Unavailable Anonymous Inner Class!! */);
    }

    public void scribeFilteredTimeline(List<Tweet> arrayList, List<Tweet> object) {
        int n = arrayList.size();
        object = ScribeItem.fromMessage(this.getJsonMessage(n, n - object.size(), this.timelineFilter.totalFilters()));
        arrayList = new ArrayList();
        arrayList.add(object);
        object = TweetTimelineListAdapter.getTimelineType(this.timeline);
        this.tweetUi.scribe(ScribeConstants.getTfwClientFilterTimelineNamespace(object), (List<ScribeItem>)arrayList);
    }
}

