/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.Callback
 *  java.lang.Long
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.tweetui.TimelineResult;

public interface Timeline<T> {
    public void next(Long var1, Callback<TimelineResult<T>> var2);

    public void previous(Long var1, Callback<TimelineResult<T>> var2);
}

