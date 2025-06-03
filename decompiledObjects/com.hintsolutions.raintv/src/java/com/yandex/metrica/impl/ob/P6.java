/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.fm;
import com.yandex.metrica.impl.ob.hm;
import java.io.File;

public class p6
implements Runnable {
    @NonNull
    private final File a;
    @NonNull
    private final Zl<File> b;
    @NonNull
    private final hm c;

    public p6(@NonNull Context context, @NonNull File file, @NonNull Zl<File> zl) {
        this(file, zl, hm.a(context));
    }

    @VisibleForTesting
    public p6(@NonNull File file, @NonNull Zl<File> zl, @NonNull hm hm2) {
        this.a = file;
        this.b = zl;
        this.c = hm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        File[] fileArray;
        if (this.a.exists() && this.a.isDirectory() && (fileArray = this.a.listFiles()) != null) {
            for (File file : fileArray) {
                fm fm2 = this.c.a(file.getName());
                try {
                    fm2.a();
                    this.b.b(file);
                }
                catch (Throwable throwable) {}
                fm2.c();
            }
        }
    }
}

