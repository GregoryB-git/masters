/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.EventsManager;
import com.twitter.sdk.android.core.internal.scribe.FileRollOverManager;
import com.twitter.sdk.android.core.internal.scribe.FilesSender;

public interface EventsStrategy<T>
extends FileRollOverManager,
EventsManager<T> {
    public FilesSender getFilesSender();
}

