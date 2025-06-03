/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.EventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.FilesSender;

public class DisabledEventsStrategy<T>
implements EventsStrategy<T> {
    @Override
    public void cancelTimeBasedFileRollOver() {
    }

    @Override
    public void deleteAllEvents() {
    }

    @Override
    public FilesSender getFilesSender() {
        return null;
    }

    @Override
    public void recordEvent(T t4) {
    }

    @Override
    public boolean rollFileOver() {
        return false;
    }

    @Override
    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    @Override
    public void sendEvents() {
    }
}

