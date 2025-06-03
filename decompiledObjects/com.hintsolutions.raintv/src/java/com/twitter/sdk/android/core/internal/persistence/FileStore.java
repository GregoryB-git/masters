/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.persistence;

import java.io.File;

public interface FileStore {
    public File getCacheDir();

    public File getExternalCacheDir();

    public File getExternalFilesDir();

    public File getFilesDir();
}

