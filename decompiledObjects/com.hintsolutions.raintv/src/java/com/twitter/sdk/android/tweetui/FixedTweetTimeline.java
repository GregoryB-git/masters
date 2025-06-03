/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.BaseTimeline;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineCursor;
import com.twitter.sdk.android.tweetui.TimelineResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixedTweetTimeline
extends BaseTimeline
implements Timeline<Tweet> {
    private static final String SCRIBE_SECTION = "fixed";
    public final List<Tweet> tweets;

    public FixedTweetTimeline(List<Tweet> arrayList) {
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = new ArrayList();
        }
        this.tweets = arrayList2;
    }

    @Override
    public String getTimelineType() {
        return SCRIBE_SECTION;
    }

    @Override
    public void next(Long l, Callback<TimelineResult<Tweet>> callback) {
        callback.success(new Result<TimelineResult<Tweet>>(new TimelineResult<Tweet>(new TimelineCursor(this.tweets), this.tweets), null));
    }

    @Override
    public void previous(Long l, Callback<TimelineResult<Tweet>> callback) {
        l = Collections.emptyList();
        callback.success(new Result(new TimelineResult(new TimelineCursor((List<? extends Identifiable>)l), l), null));
    }
}

