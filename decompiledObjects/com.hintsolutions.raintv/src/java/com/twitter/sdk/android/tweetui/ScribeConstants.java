/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

final class ScribeConstants {
    public static final String SCRIBE_FILTER_ACTION = "filter";
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_INITIAL_COMPONENT = "initial";
    public static final String SCRIBE_INITIAL_ELEMENT = "initial";
    public static final String SCRIBE_TIMELINE_PAGE = "timeline";
    public static final String SCRIBE_TIMELINE_SECTION = "timeline";
    public static final String SYNDICATED_SDK_IMPRESSION_ELEMENT = "";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";

    private ScribeConstants() {
    }

    public static EventNamespace getSyndicatedSdkTimelineNamespace(String string2) {
        return new EventNamespace.Builder().setClient(TFW_CLIENT_EVENT_PAGE).setPage("timeline").setSection(string2).setComponent("initial").setElement(SYNDICATED_SDK_IMPRESSION_ELEMENT).setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }

    public static EventNamespace getTfwClientFilterTimelineNamespace(String string2) {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("timeline").setComponent(string2).setElement("initial").setAction(SCRIBE_FILTER_ACTION).builder();
    }

    public static EventNamespace getTfwClientTimelineNamespace(String string2) {
        return new EventNamespace.Builder().setClient("tfw").setPage(TFW_CLIENT_EVENT_PAGE).setSection("timeline").setComponent(string2).setElement("initial").setAction(SCRIBE_IMPRESSION_ACTION).builder();
    }
}

