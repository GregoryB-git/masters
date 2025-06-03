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
 *  java.util.List
 *  retrofit2.Call
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineResult;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;

public class TwitterListTimeline
extends BaseTimeline
implements Timeline<Tweet> {
    private static final String SCRIBE_SECTION = "list";
    public final Boolean includeRetweets;
    public final Long listId;
    public final Integer maxItemsPerRequest;
    public final Long ownerId;
    public final String ownerScreenName;
    public final String slug;
    public final TwitterCore twitterCore;

    public TwitterListTimeline(TwitterCore twitterCore, Long l, String string2, Long l2, String string3, Integer n, Boolean bl) {
        this.twitterCore = twitterCore;
        this.listId = l;
        this.slug = string2;
        this.ownerId = l2;
        this.ownerScreenName = string3;
        this.maxItemsPerRequest = n;
        this.includeRetweets = bl;
    }

    public Call<List<Tweet>> createListTimelineRequest(Long l, Long l2) {
        return this.twitterCore.getApiClient().getListService().statuses(this.listId, this.slug, this.ownerScreenName, this.ownerId, l, l2, this.maxItemsPerRequest, Boolean.TRUE, this.includeRetweets);
    }

    @Override
    public String getTimelineType() {
        return SCRIBE_SECTION;
    }

    @Override
    public void next(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createListTimelineRequest(l, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void previous(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createListTimelineRequest(null, BaseTimeline.decrementMaxId(l)).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }
}

