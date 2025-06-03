/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.twitter.sdk.android.tweetui.CompactTweetView
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.CompactTweetView;
import com.twitter.sdk.android.tweetui.FilterTimelineDelegate;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.ScribeConstants;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineDelegate;
import com.twitter.sdk.android.tweetui.TimelineListAdapter;
import com.twitter.sdk.android.tweetui.TweetUi;
import java.util.ArrayList;
import java.util.List;

public class TweetTimelineListAdapter
extends TimelineListAdapter<Tweet> {
    public static final String DEFAULT_FILTERS_JSON_MSG = "{\"total_filters\":0}";
    public static final String TOTAL_FILTERS_JSON_PROP = "total_filters";
    public Callback<Tweet> actionCallback;
    public final Gson gson = new Gson();
    public final int styleResId;
    public TweetUi tweetUi;

    public TweetTimelineListAdapter(Context context, Timeline<Tweet> timeline) {
        this(context, timeline, R.style.tw__TweetLightStyle, null);
    }

    public TweetTimelineListAdapter(Context context, Timeline<Tweet> timeline, int n, Callback<Tweet> callback) {
        this(context, new TimelineDelegate<Tweet>(timeline), n, callback, TweetUi.getInstance());
    }

    public TweetTimelineListAdapter(Context context, TimelineDelegate<Tweet> timelineDelegate, int n, Callback<Tweet> callback, TweetUi tweetUi) {
        super(context, timelineDelegate);
        this.styleResId = n;
        this.actionCallback = new /* Unavailable Anonymous Inner Class!! */;
        this.tweetUi = tweetUi;
        this.scribeTimelineImpression();
    }

    private String getJsonMessage(int n) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(TOTAL_FILTERS_JSON_PROP, (Number)Integer.valueOf((int)n));
        return this.gson.toJson((JsonElement)jsonObject);
    }

    public static String getTimelineType(Timeline timeline) {
        if (timeline instanceof BaseTimeline) {
            return ((BaseTimeline)((Object)timeline)).getTimelineType();
        }
        return "other";
    }

    private void scribeTimelineImpression() {
        TimelineDelegate timelineDelegate = this.delegate;
        timelineDelegate = timelineDelegate instanceof FilterTimelineDelegate ? this.getJsonMessage(((FilterTimelineDelegate)timelineDelegate).timelineFilter.totalFilters()) : DEFAULT_FILTERS_JSON_MSG;
        Object object = ScribeItem.fromMessage((String)((Object)timelineDelegate));
        timelineDelegate = new ArrayList();
        timelineDelegate.add(object);
        object = TweetTimelineListAdapter.getTimelineType(this.delegate.getTimeline());
        this.tweetUi.scribe(ScribeConstants.getSyndicatedSdkTimelineNamespace((String)object));
        this.tweetUi.scribe(ScribeConstants.getTfwClientTimelineNamespace((String)object), (List<ScribeItem>)timelineDelegate);
    }

    public View getView(int n, View view, ViewGroup object) {
        object = (Tweet)this.getItem(n);
        if (view == null) {
            view = new CompactTweetView(this.context, (Tweet)object, this.styleResId);
            view.setOnActionCallback(this.actionCallback);
        } else {
            ((BaseTweetView)view).setTweet((Tweet)object);
        }
        return view;
    }
}

