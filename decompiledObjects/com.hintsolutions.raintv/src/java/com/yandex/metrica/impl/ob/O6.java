/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.am;
import java.io.File;

public class o6<Output>
implements Runnable {
    @NonNull
    private final File a;
    @NonNull
    private final am<File, Output> b;
    @NonNull
    private final Zl<File> c;
    @NonNull
    private final Zl<Output> d;

    public o6(@NonNull File file, @NonNull am<File, Output> am2, @NonNull Zl<File> zl, @NonNull Zl<Output> zl2) {
        this.a = file;
        this.b = am2;
        this.c = zl;
        this.d = zl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        if (this.a.exists()) {
            try {
                Output Output = this.b.a(this.a);
                if (Output != null) {
                    this.d.b(Output);
                }
            }
            catch (Throwable throwable) {}
            this.c.b(this.a);
        }
    }
}

