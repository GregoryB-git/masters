/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.scribe.EventsFilesManager;
import com.twitter.sdk.android.core.internal.scribe.EventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.FilesSender;
import com.twitter.sdk.android.core.internal.scribe.TimeBasedFileRollOverRunnable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class EnabledEventsStrategy<T>
implements EventsStrategy<T> {
    public static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    public final Context context;
    public final ScheduledExecutorService executorService;
    public final EventsFilesManager<T> filesManager;
    public volatile int rolloverIntervalSeconds = -1;
    public final AtomicReference<ScheduledFuture<?>> scheduledRolloverFutureRef;

    public EnabledEventsStrategy(Context context, ScheduledExecutorService scheduledExecutorService, EventsFilesManager<T> eventsFilesManager) {
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = eventsFilesManager;
        this.scheduledRolloverFutureRef = new AtomicReference();
    }

    @Override
    public void cancelTimeBasedFileRollOver() {
        if (this.scheduledRolloverFutureRef.get() != null) {
            CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)this.scheduledRolloverFutureRef.get()).cancel(false);
            this.scheduledRolloverFutureRef.set(null);
        }
    }

    public void configureRollover(int n4) {
        this.rolloverIntervalSeconds = n4;
        this.scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }

    @Override
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public int getRollover() {
        return this.rolloverIntervalSeconds;
    }

    @Override
    public void recordEvent(T t4) {
        CommonUtils.logControlled(this.context, t4.toString());
        try {
            this.filesManager.writeEvent(t4);
        }
        catch (IOException iOException) {
            CommonUtils.logControlledError(this.context, "Failed to write event.", iOException);
        }
        this.scheduleTimeBasedRollOverIfNeeded();
    }

    @Override
    public boolean rollFileOver() {
        try {
            boolean bl = this.filesManager.rollFileOver();
            return bl;
        }
        catch (IOException iOException) {
            CommonUtils.logControlledError(this.context, "Failed to roll file over.", iOException);
            return false;
        }
    }

    public void scheduleTimeBasedFileRollOver(long l4, long l5) {
        boolean bl = this.scheduledRolloverFutureRef.get() == null;
        if (bl) {
            TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new TimeBasedFileRollOverRunnable(this.context, this);
            Context context = this.context;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scheduling time based file roll over every ");
            stringBuilder.append(l5);
            stringBuilder.append(" seconds");
            CommonUtils.logControlled(context, stringBuilder.toString());
            try {
                this.scheduledRolloverFutureRef.set((Object)this.executorService.scheduleAtFixedRate((Runnable)timeBasedFileRollOverRunnable, l4, l5, TimeUnit.SECONDS));
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                CommonUtils.logControlledError(this.context, "Failed to schedule time based file roll over", rejectedExecutionException);
            }
        }
    }

    @Override
    public void scheduleTimeBasedRollOverIfNeeded() {
        boolean bl = this.rolloverIntervalSeconds != -1;
        if (bl) {
            this.scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sendAndCleanUpIfSuccess() {
        int n4;
        FilesSender filesSender = this.getFilesSender();
        if (filesSender == null) {
            CommonUtils.logControlled(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.logControlled(this.context, "Sending all files");
        List<File> list = this.filesManager.getBatchOfFilesToSend();
        int n6 = 0;
        while (true) {
            int n5 = n6;
            n4 = n6;
            try {
                if (list.size() <= 0) break;
                n5 = n6;
                CommonUtils.logControlled(this.context, String.format((Locale)Locale.US, (String)"attempt to send batch of %d files", (Object[])new Object[]{list.size()}));
                n5 = n6;
                boolean bl = filesSender.send(list);
                n4 = n6;
                if (bl) {
                    n5 = n6;
                    n5 = n4 = n6 + list.size();
                    this.filesManager.deleteSentFiles(list);
                }
                if (!bl) break;
                n5 = n4;
                list = this.filesManager.getBatchOfFilesToSend();
                n6 = n4;
            }
            catch (Exception exception) {
                Context context = this.context;
                filesSender = z2.t("Failed to send batch of analytics files to server: ");
                filesSender.append(exception.getMessage());
                CommonUtils.logControlledError(context, filesSender.toString(), exception);
                n4 = n5;
                break;
            }
        }
        if (n4 == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    @Override
    public void sendEvents() {
        this.sendAndCleanUpIfSuccess();
    }
}

