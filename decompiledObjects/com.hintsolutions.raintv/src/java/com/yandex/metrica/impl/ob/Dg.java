/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.cg;
import com.yandex.metrica.impl.ob.lg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dg
implements cg.a {
    public final cg.b a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public dg(cg.b b2) {
        this.a = b2;
    }

    @Override
    @WorkerThread
    public void a() {
        cg.d(this.a.a).a(new lg(this){
            public final dg a;
            {
                this.a = dg2;
            }

            @Override
            @WorkerThread
            public void a(@Nullable Tf tf2) {
                cg cg2 = this.a.a.a;
                cg.a(cg2, tf2, cg.c(cg2));
            }

            @Override
            @WorkerThread
            public void a(@NotNull Throwable object) {
                object = this.a.a.a;
                cg.a((cg)object, null, cg.c((cg)object));
            }
        });
    }
}

