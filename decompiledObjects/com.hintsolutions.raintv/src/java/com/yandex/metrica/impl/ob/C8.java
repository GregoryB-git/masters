/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.J7;
import com.yandex.metrica.impl.ob.S7;
import com.yandex.metrica.impl.ob.b8;
import com.yandex.metrica.impl.ob.gm;

public class c8
implements b8 {
    private final Context a;
    private final String b;
    @NonNull
    private final S7 c;
    @NonNull
    private final gm d;
    private J7 e;

    @VisibleForTesting
    public c8(@NonNull Context context, @NonNull String string, @NonNull gm gm2, @NonNull S7 s7) {
        this.a = context;
        this.b = string;
        this.d = gm2;
        this.c = s7;
    }

    @Override
    @Nullable
    @WorkerThread
    public SQLiteDatabase a() {
        c8 c82 = this;
        synchronized (c82) {
            try {
                J7 j72;
                this.d.a();
                this.e = j72 = new J7(this.a, this.b, this.c);
                j72 = j72.getWritableDatabase();
                return j72;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @WorkerThread
    public void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        c8 c82 = this;
        synchronized (c82) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.close();
                }
                catch (Throwable throwable) {}
            }
            A2.a(this.e);
            this.d.b();
            this.e = null;
            return;
        }
    }
}

