/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

final class ScribeConstants {
    public static final EventNamespace.Builder ComposerEventBuilder = new EventNamespace.Builder().setClient("tfw").setPage("android").setSection("composer");
    public static final String SCRIBE_CANCEL_ELEMENT = "cancel";
    public static final String SCRIBE_CLICK_ACTION = "click";
    public static final String SCRIBE_COMPONENT = "";
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_IMPRESSION_ELEMENT = "";
    public static final String SCRIBE_PAGE = "android";
    public static final String SCRIBE_SECTION = "composer";
    public static final String SCRIBE_TFW_CLIENT = "tfw";
    public static final String SCRIBE_TWEET_ELEMENT = "tweet";

    private ScribeConstants() {
    }
}

