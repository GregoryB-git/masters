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
import com.twitter.sdk.android.core.internal.scribe.EnabledEventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.FilesSender;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesManager;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender;
import java.util.concurrent.ScheduledExecutorService;

class EnabledScribeStrategy
extends EnabledEventsStrategy<ScribeEvent> {
    private final FilesSender filesSender;

    public EnabledScribeStrategy(Context context, ScheduledExecutorService scheduledExecutorService, ScribeFilesManager scribeFilesManager, ScribeConfig scribeConfig, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, scribeFilesManager);
        this.filesSender = scribeFilesSender;
        this.configureRollover(scribeConfig.sendIntervalSeconds);
    }

    @Override
    public FilesSender getFilesSender() {
        return this.filesSender;
    }
}

