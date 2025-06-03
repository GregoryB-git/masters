/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.Coordinates;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.core.models.Place;
import com.twitter.sdk.android.core.models.TweetEntities;
import com.twitter.sdk.android.core.models.User;
import java.util.List;

public class Tweet
implements Identifiable {
    public static final long INVALID_ID = -1L;
    @SerializedName(value="card")
    public final Card card;
    @SerializedName(value="coordinates")
    public final Coordinates coordinates;
    @SerializedName(value="created_at")
    public final String createdAt;
    @SerializedName(value="current_user_retweet")
    public final Object currentUserRetweet;
    @SerializedName(value="display_text_range")
    public final List<Integer> displayTextRange;
    @SerializedName(value="entities")
    public final TweetEntities entities;
    @SerializedName(value="extended_entities")
    public final TweetEntities extendedEntities;
    @SerializedName(value="favorite_count")
    public final Integer favoriteCount;
    @SerializedName(value="favorited")
    public final boolean favorited;
    @SerializedName(value="filter_level")
    public final String filterLevel;
    @SerializedName(value="id")
    public final long id;
    @SerializedName(value="id_str")
    public final String idStr;
    @SerializedName(value="in_reply_to_screen_name")
    public final String inReplyToScreenName;
    @SerializedName(value="in_reply_to_status_id")
    public final long inReplyToStatusId;
    @SerializedName(value="in_reply_to_status_id_str")
    public final String inReplyToStatusIdStr;
    @SerializedName(value="in_reply_to_user_id")
    public final long inReplyToUserId;
    @SerializedName(value="in_reply_to_user_id_str")
    public final String inReplyToUserIdStr;
    @SerializedName(value="lang")
    public final String lang;
    @SerializedName(value="place")
    public final Place place;
    @SerializedName(value="possibly_sensitive")
    public final boolean possiblySensitive;
    @SerializedName(value="quoted_status")
    public final Tweet quotedStatus;
    @SerializedName(value="quoted_status_id")
    public final long quotedStatusId;
    @SerializedName(value="quoted_status_id_str")
    public final String quotedStatusIdStr;
    @SerializedName(value="retweet_count")
    public final int retweetCount;
    @SerializedName(value="retweeted")
    public final boolean retweeted;
    @SerializedName(value="retweeted_status")
    public final Tweet retweetedStatus;
    @SerializedName(value="scopes")
    public final Object scopes;
    @SerializedName(value="source")
    public final String source;
    @SerializedName(alternate={"full_text"}, value="text")
    public final String text;
    @SerializedName(value="truncated")
    public final boolean truncated;
    @SerializedName(value="user")
    public final User user;
    @SerializedName(value="withheld_copyright")
    public final boolean withheldCopyright;
    @SerializedName(value="withheld_in_countries")
    public final List<String> withheldInCountries;
    @SerializedName(value="withheld_scope")
    public final String withheldScope;

    private Tweet() {
        TweetEntities tweetEntities = TweetEntities.EMPTY;
        this(null, null, null, tweetEntities, tweetEntities, 0, false, null, 0L, "0", null, 0L, "0", 0L, "0", null, null, false, null, 0L, "0", null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    public Tweet(Coordinates object, String string2, Object object2, TweetEntities tweetEntities, TweetEntities tweetEntities2, Integer n, boolean bl, String string3, long l, String string4, String string5, long l2, String string6, long l3, String string7, String string8, Place place, boolean bl2, Object object3, long l4, String string9, Tweet tweet, int n2, boolean bl3, Tweet tweet2, String string10, String string11, List<Integer> list, boolean bl4, User user, boolean bl5, List<String> list2, String string12, Card card) {
        this.coordinates = object;
        this.createdAt = string2;
        this.currentUserRetweet = object2;
        object = tweetEntities == null ? TweetEntities.EMPTY : tweetEntities;
        this.entities = object;
        if (tweetEntities2 == null) {
            tweetEntities2 = TweetEntities.EMPTY;
        }
        this.extendedEntities = tweetEntities2;
        this.favoriteCount = n;
        this.favorited = bl;
        this.filterLevel = string3;
        this.id = l;
        this.idStr = string4;
        this.inReplyToScreenName = string5;
        this.inReplyToStatusId = l2;
        this.inReplyToStatusIdStr = string6;
        this.inReplyToUserId = l3;
        this.inReplyToUserIdStr = string7;
        this.lang = string8;
        this.place = place;
        this.possiblySensitive = bl2;
        this.scopes = object3;
        this.quotedStatusId = l4;
        this.quotedStatusIdStr = string9;
        this.quotedStatus = tweet;
        this.retweetCount = n2;
        this.retweeted = bl3;
        this.retweetedStatus = tweet2;
        this.source = string10;
        this.text = string11;
        this.displayTextRange = ModelUtils.getSafeList(list);
        this.truncated = bl4;
        this.user = user;
        this.withheldCopyright = bl5;
        this.withheldInCountries = ModelUtils.getSafeList(list2);
        this.withheldScope = string12;
        this.card = card;
    }

    public boolean equals(Object object) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (!(object instanceof Tweet)) {
            return false;
        }
        object = (Tweet)object;
        if (this.id == ((Tweet)object).id) {
            bl = true;
        }
        return bl;
    }

    @Override
    public long getId() {
        return this.id;
    }

    public int hashCode() {
        return (int)this.id;
    }
}

