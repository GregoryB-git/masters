/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.User
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import java.util.List;
import java.util.Map;

public class TwitterCollection {
    @SerializedName(value="objects")
    public final Content contents;
    @SerializedName(value="response")
    public final Metadata metadata;

    public TwitterCollection(Content content, Metadata metadata) {
        this.contents = content;
        this.metadata = metadata;
    }

    public static final class Content {
        @SerializedName(value="tweets")
        public final Map<Long, Tweet> tweetMap;
        @SerializedName(value="users")
        public final Map<Long, User> userMap;

        public Content(Map<Long, Tweet> map, Map<Long, User> map2) {
            this.tweetMap = ModelUtils.getSafeMap(map);
            this.userMap = ModelUtils.getSafeMap(map2);
        }
    }

    public static final class Metadata {
        @SerializedName(value="position")
        public final Position position;
        @SerializedName(value="timeline_id")
        public final String timelineId;
        @SerializedName(value="timeline")
        public final List<TimelineItem> timelineItems;

        public Metadata(String string2, Position position, List<TimelineItem> list) {
            this.timelineId = string2;
            this.position = position;
            this.timelineItems = list;
        }

        public static final class Position {
            @SerializedName(value="max_position")
            public final Long maxPosition;
            @SerializedName(value="min_position")
            public final Long minPosition;

            public Position(Long l, Long l2) {
                this.maxPosition = l;
                this.minPosition = l2;
            }
        }
    }

    public static class TimelineItem {
        @SerializedName(value="tweet")
        public final TweetItem tweetItem;

        public TimelineItem(TweetItem tweetItem) {
            this.tweetItem = tweetItem;
        }

        public static final class TweetItem {
            @SerializedName(value="id")
            public final Long id;

            public TweetItem(Long l) {
                this.id = l;
            }
        }
    }
}

