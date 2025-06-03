/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

public interface FileRollOverManager {
    public void cancelTimeBasedFileRollOver();

    public boolean rollFileOver() throws IOException;

    public void scheduleTimeBasedRollOverIfNeeded();
}

