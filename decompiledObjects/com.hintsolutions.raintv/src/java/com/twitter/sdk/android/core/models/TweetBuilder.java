/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.User
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.Coordinates;
import com.twitter.sdk.android.core.models.Place;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.TweetEntities;
import com.twitter.sdk.android.core.models.User;
import java.util.List;

public class TweetBuilder {
    private Card card;
    private Coordinates coordinates;
    private String createdAt;
    private Object currentUserRetweet;
    private List<Integer> displayTextRange;
    private TweetEntities entities;
    private TweetEntities extendedEntities;
    private Integer favoriteCount;
    private boolean favorited;
    private String filterLevel;
    private long id = -1L;
    private String idStr;
    private String inReplyToScreenName;
    private long inReplyToStatusId;
    private String inReplyToStatusIdStr;
    private long inReplyToUserId;
    private String inReplyToUserIdStr;
    private String lang;
    private Place place;
    private boolean possiblySensitive;
    private Tweet quotedStatus;
    private long quotedStatusId;
    private String quotedStatusIdStr;
    private int retweetCount;
    private boolean retweeted;
    private Tweet retweetedStatus;
    private Object scopes;
    private String source;
    private String text;
    private boolean truncated;
    private User user;
    private boolean withheldCopyright;
    private List<String> withheldInCountries;
    private String withheldScope;

    public Tweet build() {
        return new Tweet(this.coordinates, this.createdAt, this.currentUserRetweet, this.entities, this.extendedEntities, this.favoriteCount, this.favorited, this.filterLevel, this.id, this.idStr, this.inReplyToScreenName, this.inReplyToStatusId, this.inReplyToStatusIdStr, this.inReplyToUserId, this.inReplyToUserIdStr, this.lang, this.place, this.possiblySensitive, this.scopes, this.quotedStatusId, this.quotedStatusIdStr, this.quotedStatus, this.retweetCount, this.retweeted, this.retweetedStatus, this.source, this.text, this.displayTextRange, this.truncated, this.user, this.withheldCopyright, this.withheldInCountries, this.withheldScope, this.card);
    }

    public TweetBuilder copy(Tweet tweet) {
        String string2;
        this.coordinates = tweet.coordinates;
        this.createdAt = tweet.createdAt;
        this.currentUserRetweet = tweet.currentUserRetweet;
        this.entities = tweet.entities;
        this.extendedEntities = tweet.extendedEntities;
        this.favoriteCount = tweet.favoriteCount;
        this.favorited = tweet.favorited;
        this.filterLevel = tweet.filterLevel;
        this.id = tweet.id;
        this.idStr = tweet.idStr;
        this.inReplyToScreenName = tweet.inReplyToScreenName;
        this.inReplyToStatusId = tweet.inReplyToStatusId;
        this.inReplyToStatusIdStr = string2 = tweet.inReplyToStatusIdStr;
        this.inReplyToUserId = tweet.inReplyToUserId;
        this.inReplyToUserIdStr = string2;
        this.lang = tweet.lang;
        this.place = tweet.place;
        this.possiblySensitive = tweet.possiblySensitive;
        this.scopes = tweet.scopes;
        this.quotedStatusId = tweet.quotedStatusId;
        this.quotedStatusIdStr = tweet.quotedStatusIdStr;
        this.quotedStatus = tweet.quotedStatus;
        this.retweetCount = tweet.retweetCount;
        this.retweeted = tweet.retweeted;
        this.retweetedStatus = tweet.retweetedStatus;
        this.source = tweet.source;
        this.text = tweet.text;
        this.displayTextRange = tweet.displayTextRange;
        this.truncated = tweet.truncated;
        this.user = tweet.user;
        this.withheldCopyright = tweet.withheldCopyright;
        this.withheldInCountries = tweet.withheldInCountries;
        this.withheldScope = tweet.withheldScope;
        this.card = tweet.card;
        return this;
    }

    public TweetBuilder setCard(Card card) {
        this.card = card;
        return this;
    }

    public TweetBuilder setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public TweetBuilder setCreatedAt(String string2) {
        this.createdAt = string2;
        return this;
    }

    public TweetBuilder setCurrentUserRetweet(Object object) {
        this.currentUserRetweet = object;
        return this;
    }

    public TweetBuilder setDisplayTextRange(List<Integer> list) {
        this.displayTextRange = list;
        return this;
    }

    public TweetBuilder setEntities(TweetEntities tweetEntities) {
        this.entities = tweetEntities;
        return this;
    }

    public TweetBuilder setExtendedEntities(TweetEntities tweetEntities) {
        this.extendedEntities = tweetEntities;
        return this;
    }

    public TweetBuilder setFavoriteCount(Integer n) {
        this.favoriteCount = n;
        return this;
    }

    public TweetBuilder setFavorited(boolean bl) {
        this.favorited = bl;
        return this;
    }

    public TweetBuilder setFilterLevel(String string2) {
        this.filterLevel = string2;
        return this;
    }

    public TweetBuilder setId(long l) {
        this.id = l;
        return this;
    }

    public TweetBuilder setIdStr(String string2) {
        this.idStr = string2;
        return this;
    }

    public TweetBuilder setInReplyToScreenName(String string2) {
        this.inReplyToScreenName = string2;
        return this;
    }

    public TweetBuilder setInReplyToStatusId(long l) {
        this.inReplyToStatusId = l;
        return this;
    }

    public TweetBuilder setInReplyToStatusIdStr(String string2) {
        this.inReplyToStatusIdStr = string2;
        return this;
    }

    public TweetBuilder setInReplyToUserId(long l) {
        this.inReplyToUserId = l;
        return this;
    }

    public TweetBuilder setInReplyToUserIdStr(String string2) {
        this.inReplyToUserIdStr = string2;
        return this;
    }

    public TweetBuilder setLang(String string2) {
        this.lang = string2;
        return this;
    }

    public TweetBuilder setPlace(Place place) {
        this.place = place;
        return this;
    }

    public TweetBuilder setPossiblySensitive(boolean bl) {
        this.possiblySensitive = bl;
        return this;
    }

    public TweetBuilder setQuotedStatus(Tweet tweet) {
        this.quotedStatus = tweet;
        return this;
    }

    public TweetBuilder setQuotedStatusId(long l) {
        this.quotedStatusId = l;
        return this;
    }

    public TweetBuilder setQuotedStatusIdStr(String string2) {
        this.quotedStatusIdStr = string2;
        return this;
    }

    public TweetBuilder setRetweetCount(int n) {
        this.retweetCount = n;
        return this;
    }

    public TweetBuilder setRetweeted(boolean bl) {
        this.retweeted = bl;
        return this;
    }

    public TweetBuilder setRetweetedStatus(Tweet tweet) {
        this.retweetedStatus = tweet;
        return this;
    }

    public TweetBuilder setScopes(Object object) {
        this.scopes = object;
        return this;
    }

    public TweetBuilder setSource(String string2) {
        this.source = string2;
        return this;
    }

    public TweetBuilder setText(String string2) {
        this.text = string2;
        return this;
    }

    public TweetBuilder setTruncated(boolean bl) {
        this.truncated = bl;
        return this;
    }

    public TweetBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public TweetBuilder setWithheldCopyright(boolean bl) {
        this.withheldCopyright = bl;
        return this;
    }

    public TweetBuilder setWithheldInCountries(List<String> list) {
        this.withheldInCountries = list;
        return this;
    }

    public TweetBuilder setWithheldScope(String string2) {
        this.withheldScope = string2;
        return this;
    }
}

