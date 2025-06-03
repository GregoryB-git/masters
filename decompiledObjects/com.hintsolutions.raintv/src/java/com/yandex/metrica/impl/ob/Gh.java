/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.hh;
import com.yandex.metrica.impl.ob.rh;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer$Client;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

class gh
implements CacheControlHttpsConnectionPerformer$Client {
    public final Qh a;
    public final File b;
    public final rh c;
    public final hh d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public gh(hh hh2, Qh qh2, File file, rh rh2) {
        this.d = hh2;
        this.a = qh2;
        this.b = file;
        this.c = rh2;
    }

    @Override
    @Nullable
    public String getOldETag() {
        return hh.b(this.d).b();
    }

    @Override
    public void onError() {
        hh.a(this.d, this.a.h);
        hh.c(this.d);
    }

    @Override
    public void onNotModified() {
        hh.a(this.d, this.a.i);
        hh.c(this.d);
        this.c.a(this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onResponse(@NonNull String object, @NonNull byte[] byArray) {
        block4: {
            hh.a(this.d, this.a.i);
            hh.c(this.d);
            hh.b(this.d).b((String)object);
            object = this.d;
            File file = this.b;
            object.getClass();
            try {
                object = new FileOutputStream(file);
            }
            catch (Throwable throwable) {
                object = null;
                break block4;
            }
            try {}
            catch (Throwable throwable) {
            }
            object.write(byArray);
            object.flush();
        }
        A2.a((Closeable)object);
        this.c.a(this.b);
    }
}

