/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  retrofit2.Call
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.TweetBuilder;
import com.twitter.sdk.android.core.models.TwitterCollection;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineCursor;
import com.twitter.sdk.android.tweetui.TimelineResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;

public class CollectionTimeline
extends BaseTimeline
implements Timeline<Tweet> {
    public static final String COLLECTION_PREFIX = "custom-";
    private static final String SCRIBE_SECTION = "collection";
    public final String collectionIdentifier;
    public final Integer maxItemsPerRequest;
    public final TwitterCore twitterCore;

    public CollectionTimeline(TwitterCore twitterCore, Long l, Integer n) {
        if (l == null) {
            this.collectionIdentifier = null;
        } else {
            StringBuilder stringBuilder = z2.t(COLLECTION_PREFIX);
            stringBuilder.append(Long.toString((long)l));
            this.collectionIdentifier = stringBuilder.toString();
        }
        this.twitterCore = twitterCore;
        this.maxItemsPerRequest = n;
    }

    public static List<Tweet> getOrderedTweets(TwitterCollection twitterCollection) {
        Iterator iterator;
        Object object;
        if (twitterCollection != null && (object = twitterCollection.contents) != null && (iterator = ((TwitterCollection.Content)object).tweetMap) != null && ((TwitterCollection.Content)object).userMap != null && !iterator.isEmpty() && !twitterCollection.contents.userMap.isEmpty() && (object = twitterCollection.metadata) != null && ((TwitterCollection.Metadata)object).timelineItems != null && ((TwitterCollection.Metadata)object).position != null) {
            object = new ArrayList();
            for (TwitterCollection.TimelineItem timelineItem : twitterCollection.metadata.timelineItems) {
                object.add((Object)CollectionTimeline.mapTweetToUsers((Tweet)twitterCollection.contents.tweetMap.get((Object)timelineItem.tweetItem.id), twitterCollection.contents.userMap));
            }
            return object;
        }
        return Collections.emptyList();
    }

    public static TimelineCursor getTimelineCursor(TwitterCollection object) {
        if (object != null && (object = ((TwitterCollection)object).metadata) != null && (object = ((TwitterCollection.Metadata)object).position) != null) {
            return new TimelineCursor(((TwitterCollection.Metadata.Position)object).minPosition, ((TwitterCollection.Metadata.Position)object).maxPosition);
        }
        return null;
    }

    public static Tweet mapTweetToUsers(Tweet tweet, Map<Long, User> map) {
        Object object = (User)map.get((Object)tweet.user.id);
        object = new TweetBuilder().copy(tweet).setUser((User)object);
        tweet = tweet.quotedStatus;
        if (tweet != null) {
            ((TweetBuilder)object).setQuotedStatus(CollectionTimeline.mapTweetToUsers(tweet, map));
        }
        return ((TweetBuilder)object).build();
    }

    public Call<TwitterCollection> createCollectionRequest(Long l, Long l2) {
        return this.twitterCore.getApiClient().getCollectionService().collection(this.collectionIdentifier, this.maxItemsPerRequest, l2, l);
    }

    @Override
    public String getTimelineType() {
        return SCRIBE_SECTION;
    }

    @Override
    public void next(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createCollectionRequest(l, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void previous(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createCollectionRequest(null, l).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }
}

