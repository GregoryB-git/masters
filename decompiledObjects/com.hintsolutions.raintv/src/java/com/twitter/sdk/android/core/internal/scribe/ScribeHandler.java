/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.scribe.DisabledEventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.EventsFilesManager;
import com.twitter.sdk.android.core.internal.scribe.EventsHandler;
import com.twitter.sdk.android.core.internal.scribe.EventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import java.util.concurrent.ScheduledExecutorService;

class ScribeHandler
extends EventsHandler<ScribeEvent> {
    public ScribeHandler(Context context, EventsStrategy<ScribeEvent> eventsStrategy, EventsFilesManager eventsFilesManager, ScheduledExecutorService scheduledExecutorService) {
        super(context, eventsStrategy, eventsFilesManager, scheduledExecutorService);
    }

    @Override
    public EventsStrategy<ScribeEvent> getDisabledEventsStrategy() {
        return new DisabledEventsStrategy<ScribeEvent>();
    }

    public void scribe(ScribeEvent scribeEvent) {
        this.recordEventAsync(scribeEvent, false);
    }

    public void scribeAndFlush(ScribeEvent scribeEvent) {
        this.recordEventAsync(scribeEvent, true);
    }
}

