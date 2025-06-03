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

public class UserTimeline
extends BaseTimeline
implements Timeline<Tweet> {
    private static final String SCRIBE_SECTION = "user";
    public final Boolean includeReplies;
    public final Boolean includeRetweets;
    public final Integer maxItemsPerRequest;
    public final String screenName;
    public final TwitterCore twitterCore;
    public final Long userId;

    public UserTimeline(TwitterCore twitterCore, Long l, String string2, Integer n, Boolean bl, Boolean bl2) {
        this.twitterCore = twitterCore;
        this.userId = l;
        this.screenName = string2;
        this.maxItemsPerRequest = n;
        boolean bl3 = bl == null ? false : bl;
        this.includeReplies = bl3;
        this.includeRetweets = bl2;
    }

    public Call<List<Tweet>> createUserTimelineRequest(Long l, Long l2) {
        return this.twitterCore.getApiClient().getStatusesService().userTimeline(this.userId, this.screenName, this.maxItemsPerRequest, l, l2, Boolean.FALSE, this.includeReplies ^ true, null, this.includeRetweets);
    }

    @Override
    public String getTimelineType() {
        return SCRIBE_SECTION;
    }

    @Override
    public void next(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createUserTimelineRequest(l, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void previous(Long l, com.twitter.sdk.android.core.Callback<TimelineResult<Tweet>> callback) {
        this.createUserTimelineRequest(null, BaseTimeline.decrementMaxId(l)).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }
}

