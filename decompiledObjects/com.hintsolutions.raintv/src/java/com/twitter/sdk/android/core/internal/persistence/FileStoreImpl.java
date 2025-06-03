/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.core.internal.persistence;

import android.content.Context;
import android.os.Environment;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.persistence.FileStore;
import java.io.File;

public class FileStoreImpl
implements FileStore {
    private final Context context;

    public FileStoreImpl(Context context) {
        if (context != null) {
            this.context = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    @Override
    public File getCacheDir() {
        return this.prepare(this.context.getCacheDir());
    }

    @Override
    public File getExternalCacheDir() {
        if (this.isExternalStorageAvailable()) {
            return this.prepare(this.context.getExternalCacheDir());
        }
        return this.prepare(null);
    }

    @Override
    public File getExternalFilesDir() {
        if (this.isExternalStorageAvailable()) {
            return this.prepare(this.context.getExternalFilesDir(null));
        }
        return this.prepare(null);
    }

    @Override
    public File getFilesDir() {
        return this.prepare(this.context.getFilesDir());
    }

    public boolean isExternalStorageAvailable() {
        if (!"mounted".equals((Object)Environment.getExternalStorageState())) {
            Twitter.getLogger().w("Twitter", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public File prepare(File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) return file;
            Twitter.getLogger().w("Twitter", "Couldn't create file");
            return null;
        } else {
            Twitter.getLogger().d("Twitter", "Null File");
        }
        return null;
    }
}

