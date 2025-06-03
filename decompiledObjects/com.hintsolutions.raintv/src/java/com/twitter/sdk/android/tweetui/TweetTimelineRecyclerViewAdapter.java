/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.twitter.sdk.android.tweetui.CompactTweetView
 *  com.twitter.sdk.android.tweetui.TweetTimelineRecyclerViewAdapter$1
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.TweetBuilder;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.CompactTweetView;
import com.twitter.sdk.android.tweetui.FilterTimelineDelegate;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.ScribeConstants;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineDelegate;
import com.twitter.sdk.android.tweetui.TimelineResult;
import com.twitter.sdk.android.tweetui.TweetTimelineRecyclerViewAdapter;
import com.twitter.sdk.android.tweetui.TweetUi;
import java.util.ArrayList;
import java.util.List;

public class TweetTimelineRecyclerViewAdapter
extends RecyclerView.Adapter<TweetViewHolder> {
    public static final String DEFAULT_FILTERS_JSON_MSG = "{\"total_filters\":0}";
    public static final String TOTAL_FILTERS_JSON_PROP = "total_filters";
    public Callback<Tweet> actionCallback;
    public final Context context;
    public final Gson gson = new Gson();
    private int previousCount;
    public final int styleResId;
    public final TimelineDelegate<Tweet> timelineDelegate;
    public TweetUi tweetUi;

    public TweetTimelineRecyclerViewAdapter(Context context, Timeline<Tweet> timeline) {
        this(context, timeline, R.style.tw__TweetLightStyle, null);
    }

    public TweetTimelineRecyclerViewAdapter(Context context, Timeline<Tweet> timeline, int n, Callback<Tweet> callback) {
        this(context, new TimelineDelegate<Tweet>(timeline), n, callback, TweetUi.getInstance());
    }

    public TweetTimelineRecyclerViewAdapter(Context context, TimelineDelegate<Tweet> timelineDelegate, int n) {
        if (context != null) {
            this.context = context;
            this.timelineDelegate = timelineDelegate;
            this.styleResId = n;
            timelineDelegate.refresh((Callback<TimelineResult<Tweet>>)new 1(this));
            timelineDelegate.registerDataSetObserver(new DataSetObserver(this){
                public final TweetTimelineRecyclerViewAdapter this$0;
                {
                    this.this$0 = tweetTimelineRecyclerViewAdapter;
                }

                public void onChanged() {
                    TweetTimelineRecyclerViewAdapter tweetTimelineRecyclerViewAdapter;
                    super.onChanged();
                    if (TweetTimelineRecyclerViewAdapter.access$000(this.this$0) == 0) {
                        this.this$0.notifyDataSetChanged();
                    } else {
                        tweetTimelineRecyclerViewAdapter = this.this$0;
                        tweetTimelineRecyclerViewAdapter.notifyItemRangeInserted(TweetTimelineRecyclerViewAdapter.access$000(tweetTimelineRecyclerViewAdapter), this.this$0.timelineDelegate.getCount() - TweetTimelineRecyclerViewAdapter.access$000(this.this$0));
                    }
                    tweetTimelineRecyclerViewAdapter = this.this$0;
                    TweetTimelineRecyclerViewAdapter.access$002(tweetTimelineRecyclerViewAdapter, tweetTimelineRecyclerViewAdapter.timelineDelegate.getCount());
                }

                public void onInvalidated() {
                    this.this$0.notifyDataSetChanged();
                    super.onInvalidated();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public TweetTimelineRecyclerViewAdapter(Context context, TimelineDelegate<Tweet> timelineDelegate, int n, Callback<Tweet> callback, TweetUi tweetUi) {
        this(context, timelineDelegate, n);
        this.actionCallback = new /* Unavailable Anonymous Inner Class!! */;
        this.tweetUi = tweetUi;
        this.scribeTimelineImpression();
    }

    public static /* synthetic */ int access$000(TweetTimelineRecyclerViewAdapter tweetTimelineRecyclerViewAdapter) {
        return tweetTimelineRecyclerViewAdapter.previousCount;
    }

    public static /* synthetic */ int access$002(TweetTimelineRecyclerViewAdapter tweetTimelineRecyclerViewAdapter, int n) {
        tweetTimelineRecyclerViewAdapter.previousCount = n;
        return n;
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
        TimelineDelegate<Tweet> timelineDelegate = this.timelineDelegate;
        timelineDelegate = timelineDelegate instanceof FilterTimelineDelegate ? this.getJsonMessage(((FilterTimelineDelegate)timelineDelegate).timelineFilter.totalFilters()) : DEFAULT_FILTERS_JSON_MSG;
        Object object = ScribeItem.fromMessage((String)((Object)timelineDelegate));
        timelineDelegate = new ArrayList();
        timelineDelegate.add(object);
        object = TweetTimelineRecyclerViewAdapter.getTimelineType(this.timelineDelegate.getTimeline());
        this.tweetUi.scribe(ScribeConstants.getSyndicatedSdkTimelineNamespace((String)object));
        this.tweetUi.scribe(ScribeConstants.getTfwClientTimelineNamespace((String)object), (List<ScribeItem>)timelineDelegate);
    }

    public int getItemCount() {
        return this.timelineDelegate.getCount();
    }

    public void onBindViewHolder(TweetViewHolder tweetViewHolder, int n) {
        Tweet tweet = this.timelineDelegate.getItem(n);
        ((CompactTweetView)tweetViewHolder.itemView).setTweet(tweet);
    }

    public TweetViewHolder onCreateViewHolder(ViewGroup object, int n) {
        object = new TweetBuilder().build();
        object = new CompactTweetView(this.context, (Tweet)object, this.styleResId);
        ((BaseTweetView)((Object)object)).setOnActionCallback(this.actionCallback);
        return new TweetViewHolder((CompactTweetView)object);
    }

    public void refresh(Callback<TimelineResult<Tweet>> callback) {
        this.timelineDelegate.refresh(callback);
        this.previousCount = 0;
    }

    public static final class TweetViewHolder
    extends RecyclerView.ViewHolder {
        public TweetViewHolder(CompactTweetView compactTweetView) {
            super((View)compactTweetView);
        }
    }
}

