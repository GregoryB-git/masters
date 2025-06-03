/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.TweetScribeClient;
import com.twitter.sdk.android.tweetui.TweetUi;
import java.util.ArrayList;
import java.util.List;

class TweetScribeClientImpl
implements TweetScribeClient {
    public static final String SCRIBE_ACTIONS_ELEMENT = "actions";
    public static final String SCRIBE_CLICK_ACTION = "click";
    public static final String SCRIBE_FAVORITE_ACTION = "favorite";
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_SHARE_ACTION = "share";
    public static final String SCRIBE_UNFAVORITE_ACTION = "unfavorite";
    public static final String SYNDICATED_SDK_IMPRESSION_COMPONENT = "";
    public static final String SYNDICATED_SDK_IMPRESSION_ELEMENT = "";
    public static final String SYNDICATED_SDK_IMPRESSION_PAGE = "tweet";
    public static final String TFW_CLIENT_EVENT_ELEMENT = "";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";
    public static final String TFW_CLIENT_EVENT_SECTION = "tweet";
    public final TweetUi tweetUi;

    public TweetScribeClientImpl(TweetUi tweetUi) {
        this.tweetUi = tweetUi;
    }

    public static EventNamespace getSyndicatedImpressionNamespace(String string2) {
        return new EventNamespace.Builder().setClient(TFW_CLIENT_EVENT_PAGE).setPage("tweet").setSection(string2).setComponent("").setElement("").setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }

    public static EventNamespace getTfwClickNamespace(String string2) {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("tweet").setComponent(string2).setElement("").setAction(SCRIBE_CLICK_ACTION).builder();
    }

    public static EventNamespace getTfwFavoriteNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("tweet").setElement(SCRIBE_ACTIONS_ELEMENT).setAction(SCRIBE_FAVORITE_ACTION).builder();
    }

    public static EventNamespace getTfwImpressionNamespace(String string2, boolean bl) {
        EventNamespace.Builder builder = new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("tweet").setComponent(string2);
        string2 = bl ? SCRIBE_ACTIONS_ELEMENT : "";
        return builder.setElement(string2).setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }

    public static EventNamespace getTfwShareNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("tweet").setElement(SCRIBE_ACTIONS_ELEMENT).setAction(SCRIBE_SHARE_ACTION).builder();
    }

    public static EventNamespace getTfwUnfavoriteNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("tweet").setElement(SCRIBE_ACTIONS_ELEMENT).setAction(SCRIBE_UNFAVORITE_ACTION).builder();
    }

    @Override
    public void click(Tweet tweet, String string2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ScribeItem.fromTweet(tweet));
        this.tweetUi.scribe(TweetScribeClientImpl.getTfwClickNamespace(string2), (List<ScribeItem>)arrayList);
    }

    @Override
    public void favorite(Tweet tweet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ScribeItem.fromTweet(tweet));
        this.tweetUi.scribe(TweetScribeClientImpl.getTfwFavoriteNamespace(), (List<ScribeItem>)arrayList);
    }

    @Override
    public void impression(Tweet tweet, String string2, boolean bl) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ScribeItem.fromTweet(tweet));
        this.tweetUi.scribe(TweetScribeClientImpl.getTfwImpressionNamespace(string2, bl), (List<ScribeItem>)arrayList);
        this.tweetUi.scribe(TweetScribeClientImpl.getSyndicatedImpressionNamespace(string2), (List<ScribeItem>)arrayList);
    }

    @Override
    public void share(Tweet tweet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ScribeItem.fromTweet(tweet));
        this.tweetUi.scribe(TweetScribeClientImpl.getTfwShareNamespace(), (List<ScribeItem>)arrayList);
    }

    @Override
    public void unfavorite(Tweet tweet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ScribeItem.fromTweet(tweet));
        this.tweetUi.scribe(TweetScribeClientImpl.getTfwUnfavoriteNamespace(), (List<ScribeItem>)arrayList);
    }
}

