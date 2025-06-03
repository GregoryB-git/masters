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
import com.twitter.sdk.android.tweetui.GalleryScribeClient;
import com.twitter.sdk.android.tweetui.TweetUi;
import java.util.ArrayList;
import java.util.List;

public class GalleryScribeClientImpl
implements GalleryScribeClient {
    public static final String SCRIBE_DISMISS_ACTION = "dismiss";
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_NAVIGATE_ACTION = "navigate";
    public static final String SCRIBE_SHOW_ACTION = "show";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";
    public static final String TFW_CLIENT_EVENT_SECTION = "gallery";
    public final TweetUi tweetUi;

    public GalleryScribeClientImpl(TweetUi tweetUi) {
        this.tweetUi = tweetUi;
    }

    public static EventNamespace getTfwDimissNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_DISMISS_ACTION).builder();
    }

    public static EventNamespace getTfwImpressionNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }

    public static EventNamespace getTfwNavigateNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_NAVIGATE_ACTION).builder();
    }

    public static EventNamespace getTfwShowNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection(TFW_CLIENT_EVENT_SECTION).setAction(SCRIBE_SHOW_ACTION).builder();
    }

    @Override
    public void dismiss() {
        this.tweetUi.scribe(GalleryScribeClientImpl.getTfwDimissNamespace());
    }

    @Override
    public void impression(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)scribeItem);
        this.tweetUi.scribe(GalleryScribeClientImpl.getTfwImpressionNamespace(), (List<ScribeItem>)arrayList);
    }

    @Override
    public void navigate() {
        this.tweetUi.scribe(GalleryScribeClientImpl.getTfwNavigateNamespace());
    }

    @Override
    public void show() {
        this.tweetUi.scribe(GalleryScribeClientImpl.getTfwShowNamespace());
    }
}

