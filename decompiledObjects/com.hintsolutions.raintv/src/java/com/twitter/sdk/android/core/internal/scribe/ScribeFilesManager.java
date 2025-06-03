/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.UUID
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import com.twitter.sdk.android.core.internal.scribe.EventTransform;
import com.twitter.sdk.android.core.internal.scribe.EventsFilesManager;
import com.twitter.sdk.android.core.internal.scribe.QueueFileEventStorage;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import java.io.IOException;
import java.util.UUID;

class ScribeFilesManager
extends EventsFilesManager<ScribeEvent> {
    public static final String FILE_EXTENSION = ".tap";
    public static final String FILE_PREFIX = "se";

    public ScribeFilesManager(Context context, EventTransform<ScribeEvent> eventTransform, CurrentTimeProvider currentTimeProvider, QueueFileEventStorage queueFileEventStorage, int n) throws IOException {
        super(context, eventTransform, currentTimeProvider, queueFileEventStorage, n);
    }

    @Override
    public String generateUniqueRollOverFileName() {
        UUID uUID = UUID.randomUUID();
        StringBuilder stringBuilder = z2.u(FILE_PREFIX, "_");
        stringBuilder.append(uUID.toString());
        stringBuilder.append("_");
        stringBuilder.append(this.currentTimeProvider.getCurrentTimeMillis());
        stringBuilder.append(FILE_EXTENSION);
        return stringBuilder.toString();
    }
}

