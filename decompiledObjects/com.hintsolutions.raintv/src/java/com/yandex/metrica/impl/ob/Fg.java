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

public final class fg
implements lg {
    public final cg.d a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public fg(cg.d d3) {
        this.a = d3;
    }

    @Override
    @WorkerThread
    public void a(@Nullable Tf tf2) {
        cg cg2 = this.a.a;
        cg.a(cg2, tf2, cg.b(cg2));
    }

    @Override
    @WorkerThread
    public void a(@NotNull Throwable object) {
        object = this.a.a;
        cg.a((cg)object, null, cg.b((cg)object));
    }
}

