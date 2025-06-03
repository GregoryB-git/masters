/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.io.Closeable
 *  java.io.File
 *  java.io.RandomAccessFile
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 *  java.nio.channels.FileLock
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.L0;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class gm {
    @NonNull
    private final Context a;
    @NonNull
    private final String b;
    @NonNull
    private final B0 c;
    private File d;
    private FileLock e;
    private RandomAccessFile f;
    private FileChannel g;
    private int h = 0;

    public gm(@NonNull Context context, @NonNull String string) {
        this(context, string, new B0());
    }

    @VisibleForTesting
    public gm(@NonNull Context context, @NonNull String string, @NonNull B0 b0) {
        this.a = context;
        this.b = z2.o(string, ".lock");
        this.c = b0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() throws Throwable {
        gm gm2 = this;
        synchronized (gm2) {
            File file;
            this.d = file = this.c.b(this.a.getFilesDir(), this.b);
            if (file == null) {
                file = new IllegalStateException("Cannot create lock file");
                throw file;
            }
            file = new RandomAccessFile(this.d, "rw");
            this.f = file;
            file = file.getChannel();
            this.g = file;
            if (this.h == 0) {
                this.e = file.lock();
            }
            ++this.h;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        gm gm2 = this;
        synchronized (gm2) {
            int n4;
            File file = this.d;
            if (file != null) {
                file.getAbsolutePath();
            }
            this.h = n4 = this.h - 1;
            if (n4 == 0) {
                L0.a(this.e);
            }
            A2.a((Closeable)this.f);
            A2.a((Closeable)this.g);
            this.f = null;
            this.e = null;
            this.g = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        gm gm2 = this;
        synchronized (gm2) {
            this.b();
            File file = this.d;
            if (file != null) {
                file.delete();
            }
            return;
        }
    }
}

