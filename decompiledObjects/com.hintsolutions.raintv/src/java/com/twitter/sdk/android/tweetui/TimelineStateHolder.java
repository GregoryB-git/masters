/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.tweetui.TimelineCursor;
import java.util.concurrent.atomic.AtomicBoolean;

class TimelineStateHolder {
    public TimelineCursor nextCursor;
    public TimelineCursor previousCursor;
    public final AtomicBoolean requestInFlight = new AtomicBoolean(false);

    public TimelineStateHolder() {
    }

    public TimelineStateHolder(TimelineCursor timelineCursor, TimelineCursor timelineCursor2) {
        this.nextCursor = timelineCursor;
        this.previousCursor = timelineCursor2;
    }

    public void finishTimelineRequest() {
        this.requestInFlight.set(false);
    }

    public Long positionForNext() {
        TimelineCursor timelineCursor = this.nextCursor;
        timelineCursor = timelineCursor == null ? null : timelineCursor.maxPosition;
        return timelineCursor;
    }

    public Long positionForPrevious() {
        TimelineCursor timelineCursor = this.previousCursor;
        timelineCursor = timelineCursor == null ? null : timelineCursor.minPosition;
        return timelineCursor;
    }

    public void resetCursors() {
        this.nextCursor = null;
        this.previousCursor = null;
    }

    public void setCursorsIfNull(TimelineCursor timelineCursor) {
        if (this.nextCursor == null) {
            this.nextCursor = timelineCursor;
        }
        if (this.previousCursor == null) {
            this.previousCursor = timelineCursor;
        }
    }

    public void setNextCursor(TimelineCursor timelineCursor) {
        this.nextCursor = timelineCursor;
        this.setCursorsIfNull(timelineCursor);
    }

    public void setPreviousCursor(TimelineCursor timelineCursor) {
        this.previousCursor = timelineCursor;
        this.setCursorsIfNull(timelineCursor);
    }

    public boolean startTimelineRequest() {
        return this.requestInFlight.compareAndSet(false, true);
    }
}

