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
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.VideoScribeClient;
import java.util.ArrayList;
import java.util.List;

class VideoScribeClientImpl
implements VideoScribeClient {
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_PLAY_ACTION = "play";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";
    public static final String TFW_CLIENT_EVENT_SECTION = "video";
    public final TweetUi tweetUi;

    public VideoScribeClientImpl(TweetUi tweetUi) {
        this.tweetUi = tweetUi;
    }

    public static EventNamespace getTfwImpressionNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }

    public static EventNamespace getTfwPlayNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_PLAY_ACTION).builder();
    }

    @Override
    public void impression(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)scribeItem);
        this.tweetUi.scribe(VideoScribeClientImpl.getTfwImpressionNamespace(), (List<ScribeItem>)arrayList);
    }

    @Override
    public void play(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)scribeItem);
        this.tweetUi.scribe(VideoScribeClientImpl.getTfwPlayNamespace(), (List<ScribeItem>)arrayList);
    }
}

