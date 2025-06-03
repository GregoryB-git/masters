/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObservable
 *  android.database.DataSetObserver
 *  com.twitter.sdk.android.core.Callback
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TimelineResult;
import com.twitter.sdk.android.tweetui.TimelineStateHolder;
import java.util.ArrayList;
import java.util.List;

class TimelineDelegate<T extends Identifiable> {
    public static final long CAPACITY = 200L;
    public List<T> itemList;
    public final DataSetObservable listAdapterObservable;
    public final Timeline<T> timeline;
    public final TimelineStateHolder timelineStateHolder;

    public TimelineDelegate(Timeline<T> timeline) {
        this(timeline, null, null);
    }

    public TimelineDelegate(Timeline<T> timeline, DataSetObservable dataSetObservable, List<T> list) {
        if (timeline != null) {
            this.timeline = timeline;
            this.timelineStateHolder = new TimelineStateHolder();
            this.listAdapterObservable = dataSetObservable == null ? new DataSetObservable() : dataSetObservable;
            this.itemList = list == null ? new ArrayList() : list;
            return;
        }
        throw new IllegalArgumentException("Timeline must not be null");
    }

    public int getCount() {
        return this.itemList.size();
    }

    public T getItem(int n) {
        if (this.isLastPosition(n)) {
            this.previous();
        }
        return (T)((Identifiable)this.itemList.get(n));
    }

    public long getItemId(int n) {
        return ((Identifiable)this.itemList.get(n)).getId();
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public boolean isLastPosition(int n) {
        int n2 = this.itemList.size();
        boolean bl = true;
        if (n != n2 - 1) {
            bl = false;
        }
        return bl;
    }

    public void loadNext(Long l, Callback<TimelineResult<T>> callback) {
        if (this.withinMaxCapacity()) {
            if (this.timelineStateHolder.startTimelineRequest()) {
                this.timeline.next(l, callback);
            } else {
                callback.failure(new TwitterException("Request already in flight"));
            }
        } else {
            callback.failure(new TwitterException("Max capacity reached"));
        }
    }

    public void loadPrevious(Long l, Callback<TimelineResult<T>> callback) {
        if (this.withinMaxCapacity()) {
            if (this.timelineStateHolder.startTimelineRequest()) {
                this.timeline.previous(l, callback);
            } else {
                callback.failure(new TwitterException("Request already in flight"));
            }
        } else {
            callback.failure(new TwitterException("Max capacity reached"));
        }
    }

    public void next(Callback<TimelineResult<T>> callback) {
        this.loadNext(this.timelineStateHolder.positionForNext(), (Callback<TimelineResult<T>>)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void notifyDataSetChanged() {
        this.listAdapterObservable.notifyChanged();
    }

    public void notifyDataSetInvalidated() {
        this.listAdapterObservable.notifyInvalidated();
    }

    public void previous() {
        this.loadPrevious(this.timelineStateHolder.positionForPrevious(), (Callback<TimelineResult<T>>)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void refresh(Callback<TimelineResult<T>> callback) {
        this.timelineStateHolder.resetCursors();
        this.loadNext(this.timelineStateHolder.positionForNext(), (Callback<TimelineResult<T>>)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.listAdapterObservable.registerObserver((Object)dataSetObserver);
    }

    public void setItemById(T t) {
        for (int i = 0; i < this.itemList.size(); ++i) {
            if (t.getId() != ((Identifiable)this.itemList.get(i)).getId()) continue;
            this.itemList.set(i, t);
        }
        this.notifyDataSetChanged();
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.listAdapterObservable.unregisterObserver((Object)dataSetObserver);
    }

    public boolean withinMaxCapacity() {
        boolean bl = (long)this.itemList.size() < 200L;
        return bl;
    }
}

