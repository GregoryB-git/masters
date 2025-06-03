/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.D0;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.M5;
import com.yandex.metrica.impl.ob.P5;

public class L5 {
    private final int a;
    @NonNull
    private final P5 b;
    @Nullable
    private M5 c;

    public L5(@NonNull Context context, @NonNull I3 i32, int n2) {
        this(new P5(context, i32), n2);
    }

    @VisibleForTesting
    public L5(@NonNull P5 p52, int n2) {
        this.a = n2;
        this.b = p52;
    }

    private void b() {
        this.b.a(this.c);
    }

    @NonNull
    public D0 a(@NonNull String object) {
        int n2;
        if (this.c == null) {
            int n3;
            M5 m52;
            this.c = m52 = this.b.a();
            n2 = m52.d();
            if (n2 != (n3 = this.a)) {
                this.c.b(n3);
                this.b();
            }
        }
        n2 = object.hashCode();
        if (this.c.b().contains((Object)n2)) {
            object = D0.d;
        } else {
            object = this.c.e() ? D0.c : D0.b;
            if (this.c.c() < 1000) {
                this.c.a(n2);
            } else {
                this.c.a(false);
            }
            this.b();
        }
        return object;
    }

    public void a() {
        if (this.c == null) {
            int n2;
            M5 m52;
            this.c = m52 = this.b.a();
            int n3 = m52.d();
            if (n3 != (n2 = this.a)) {
                this.c.b(n2);
                this.b();
            }
        }
        this.c.a();
        this.c.a(true);
        this.b();
    }
}

