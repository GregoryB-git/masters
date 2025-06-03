/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.widget.BaseAdapter
 *  com.twitter.sdk.android.core.Callback
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineDelegate;
import com.twitter.sdk.android.tweetui.TimelineResult;

abstract class TimelineListAdapter<T extends Identifiable>
extends BaseAdapter {
    public final Context context;
    public final TimelineDelegate<T> delegate;

    public TimelineListAdapter(Context context, Timeline<T> timeline) {
        this(context, new TimelineDelegate<T>(timeline));
    }

    public TimelineListAdapter(Context context, TimelineDelegate<T> timelineDelegate) {
        if (context != null) {
            this.context = context;
            this.delegate = timelineDelegate;
            timelineDelegate.refresh(null);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public int getCount() {
        return this.delegate.getCount();
    }

    public T getItem(int n) {
        return this.delegate.getItem(n);
    }

    public long getItemId(int n) {
        return this.delegate.getItemId(n);
    }

    public void notifyDataSetChanged() {
        this.delegate.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        this.delegate.notifyDataSetInvalidated();
    }

    public void refresh(Callback<TimelineResult<T>> callback) {
        this.delegate.refresh(callback);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.delegate.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.delegate.unregisterDataSetObserver(dataSetObserver);
    }
}

