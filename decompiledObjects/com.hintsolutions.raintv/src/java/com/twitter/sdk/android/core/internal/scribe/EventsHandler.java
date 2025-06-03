/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.scribe.EventsFilesManager;
import com.twitter.sdk.android.core.internal.scribe.EventsStorageListener;
import com.twitter.sdk.android.core.internal.scribe.EventsStrategy;
import java.util.concurrent.ScheduledExecutorService;

public abstract class EventsHandler<T>
implements EventsStorageListener {
    public final Context context;
    public final ScheduledExecutorService executor;
    public EventsStrategy<T> strategy;

    public EventsHandler(Context context, EventsStrategy<T> eventsStrategy, EventsFilesManager eventsFilesManager, ScheduledExecutorService scheduledExecutorService) {
        this.context = context.getApplicationContext();
        this.executor = scheduledExecutorService;
        this.strategy = eventsStrategy;
        eventsFilesManager.registerRollOverListener(this);
    }

    public void disable() {
        this.executeAsync(new Runnable(this){
            public final EventsHandler this$0;
            {
                this.this$0 = eventsHandler;
            }

            public void run() {
                try {
                    EventsHandler eventsHandler = this.this$0;
                    EventsStrategy<T> eventsStrategy = eventsHandler.strategy;
                    eventsHandler.strategy = eventsHandler.getDisabledEventsStrategy();
                    eventsStrategy.deleteAllEvents();
                }
                catch (Exception exception) {
                    CommonUtils.logControlledError(this.this$0.context, "Failed to disable events.", exception);
                }
            }
        });
    }

    public void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        }
        catch (Exception exception) {
            CommonUtils.logControlledError(this.context, "Failed to submit events task", exception);
        }
    }

    public void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        }
        catch (Exception exception) {
            CommonUtils.logControlledError(this.context, "Failed to run events task", exception);
        }
    }

    public abstract EventsStrategy<T> getDisabledEventsStrategy();

    @Override
    public void onRollOver(String string2) {
        this.executeAsync(new Runnable(this){
            public final EventsHandler this$0;
            {
                this.this$0 = eventsHandler;
            }

            public void run() {
                try {
                    this.this$0.strategy.sendEvents();
                }
                catch (Exception exception) {
                    CommonUtils.logControlledError(this.this$0.context, "Failed to send events files.", exception);
                }
            }
        });
    }

    public void recordEventAsync(T t, boolean bl) {
        this.executeAsync(new Runnable(this, t, bl){
            public final EventsHandler this$0;
            public final Object val$event;
            public final boolean val$sendImmediately;
            {
                this.this$0 = eventsHandler;
                this.val$event = object;
                this.val$sendImmediately = bl;
            }

            public void run() {
                try {
                    this.this$0.strategy.recordEvent(this.val$event);
                    if (this.val$sendImmediately) {
                        this.this$0.strategy.rollFileOver();
                    }
                }
                catch (Exception exception) {
                    CommonUtils.logControlledError(this.this$0.context, "Failed to record event.", exception);
                }
            }
        });
    }

    public void recordEventSync(T t) {
        this.executeSync(new Runnable(this, t){
            public final EventsHandler this$0;
            public final Object val$event;
            {
                this.this$0 = eventsHandler;
                this.val$event = object;
            }

            public void run() {
                try {
                    this.this$0.strategy.recordEvent(this.val$event);
                }
                catch (Exception exception) {
                    CommonUtils.logControlledError(this.this$0.context, "Failed to record event", exception);
                }
            }
        });
    }
}

