/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.tweetui.TimelineCursor;
import java.util.List;

public class TimelineResult<T> {
    public final List<T> items;
    public final TimelineCursor timelineCursor;

    public TimelineResult(TimelineCursor timelineCursor, List<T> list) {
        this.timelineCursor = timelineCursor;
        this.items = list;
    }
}

