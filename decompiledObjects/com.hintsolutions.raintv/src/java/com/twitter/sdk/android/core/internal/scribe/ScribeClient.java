/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider
 *  com.twitter.sdk.android.core.internal.persistence.FileStoreImpl
 *  com.twitter.sdk.android.core.internal.scribe.DisabledEventsStrategy
 *  com.twitter.sdk.android.core.internal.scribe.EnabledScribeStrategy
 *  com.twitter.sdk.android.core.internal.scribe.EventsStrategy
 *  com.twitter.sdk.android.core.internal.scribe.QueueFileEventStorage
 *  com.twitter.sdk.android.core.internal.scribe.ScribeEvent$Transform
 *  com.twitter.sdk.android.core.internal.scribe.ScribeFilesManager
 *  com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender
 *  com.twitter.sdk.android.core.internal.scribe.ScribeHandler
 *  java.io.IOException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider;
import com.twitter.sdk.android.core.internal.persistence.FileStoreImpl;
import com.twitter.sdk.android.core.internal.scribe.DisabledEventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.EnabledScribeStrategy;
import com.twitter.sdk.android.core.internal.scribe.EventTransform;
import com.twitter.sdk.android.core.internal.scribe.EventsFilesManager;
import com.twitter.sdk.android.core.internal.scribe.EventsStrategy;
import com.twitter.sdk.android.core.internal.scribe.QueueFileEventStorage;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesManager;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender;
import com.twitter.sdk.android.core.internal.scribe.ScribeHandler;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class ScribeClient {
    private static final String STORAGE_DIR_BASE = "_se_to_send";
    private static final String WORKING_FILENAME_BASE = "_se.tap";
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private final ScheduledExecutorService executor;
    private final GuestSessionProvider guestSessionProvider;
    private final IdManager idManager;
    private final ScribeConfig scribeConfig;
    public final ConcurrentHashMap<Long, ScribeHandler> scribeHandlers;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;
    private final ScribeEvent.Transform transform;

    public ScribeClient(Context context, ScheduledExecutorService scheduledExecutorService, ScribeConfig scribeConfig, ScribeEvent.Transform transform, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager) {
        this.context = context;
        this.executor = scheduledExecutorService;
        this.scribeConfig = scribeConfig;
        this.transform = transform;
        this.authConfig = twitterAuthConfig;
        this.sessionManager = sessionManager;
        this.guestSessionProvider = guestSessionProvider;
        this.idManager = idManager;
        this.scribeHandlers = new ConcurrentHashMap(2);
    }

    private ScribeHandler newScribeHandler(long l) throws IOException {
        Context context = this.context;
        context = new QueueFileEventStorage(context, new FileStoreImpl(context).getFilesDir(), this.getWorkingFileNameForOwner(l), this.getStorageDirForOwner(l));
        context = new ScribeFilesManager(this.context, (EventTransform)this.transform, (CurrentTimeProvider)new SystemCurrentTimeProvider(), (QueueFileEventStorage)context, this.scribeConfig.maxFilesToKeep);
        return new ScribeHandler(this.context, this.getScribeStrategy(l, (ScribeFilesManager)context), (EventsFilesManager)context, this.executor);
    }

    public ScribeHandler getScribeHandler(long l) throws IOException {
        if (!this.scribeHandlers.containsKey((Object)l)) {
            this.scribeHandlers.putIfAbsent((Object)l, (Object)this.newScribeHandler(l));
        }
        return (ScribeHandler)this.scribeHandlers.get((Object)l);
    }

    public EventsStrategy<ScribeEvent> getScribeStrategy(long l, ScribeFilesManager scribeFilesManager) {
        if (this.scribeConfig.isEnabled) {
            CommonUtils.logControlled(this.context, "Scribe enabled");
            Context context = this.context;
            ScheduledExecutorService scheduledExecutorService = this.executor;
            ScribeConfig scribeConfig = this.scribeConfig;
            return new EnabledScribeStrategy(context, scheduledExecutorService, scribeFilesManager, scribeConfig, new ScribeFilesSender(context, scribeConfig, l, this.authConfig, this.sessionManager, this.guestSessionProvider, (ExecutorService)scheduledExecutorService, this.idManager));
        }
        CommonUtils.logControlled(this.context, "Scribe disabled");
        return new DisabledEventsStrategy();
    }

    public String getStorageDirForOwner(long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l);
        stringBuilder.append(STORAGE_DIR_BASE);
        return stringBuilder.toString();
    }

    public String getWorkingFileNameForOwner(long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l);
        stringBuilder.append(WORKING_FILENAME_BASE);
        return stringBuilder.toString();
    }

    public boolean scribe(ScribeEvent scribeEvent, long l) {
        try {
            this.getScribeHandler(l).scribe(scribeEvent);
            return true;
        }
        catch (IOException iOException) {
            CommonUtils.logControlledError(this.context, "Failed to scribe event", iOException);
            return false;
        }
    }

    public boolean scribeAndFlush(ScribeEvent scribeEvent, long l) {
        try {
            this.getScribeHandler(l).scribeAndFlush(scribeEvent);
            return true;
        }
        catch (IOException iOException) {
            CommonUtils.logControlledError(this.context, "Failed to scribe event", iOException);
            return false;
        }
    }
}

