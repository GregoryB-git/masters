/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.c;
import com.yandex.metrica.impl.ob.A0;
import com.yandex.metrica.impl.ob.C6;
import com.yandex.metrica.impl.ob.D6;
import com.yandex.metrica.impl.ob.r6;
import com.yandex.metrica.impl.ob.v6;

public abstract class t6
implements v6 {
    @NonNull
    private final a a;
    @Nullable
    private final c b;
    @NonNull
    private final A0 c;

    public t6(@NonNull a a2, @Nullable c c9, @NonNull A0 a02) {
        this.a = a2;
        this.b = c9;
        this.c = a02;
    }

    public abstract void a(@NonNull C6 var1);

    @Override
    public void a(@Nullable Throwable throwable, @NonNull r6 r62) {
        if (this.a.a(throwable)) {
            c c9 = this.b;
            Throwable throwable2 = throwable;
            if (c9 != null) {
                throwable2 = throwable;
                if (throwable != null) {
                    throwable2 = throwable = c9.a(throwable);
                    if (throwable == null) {
                        return;
                    }
                }
            }
            this.a(D6.a(throwable2, r62, null, this.c.a(), this.c.b()));
        }
    }
}

