/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Eb;
import com.yandex.metrica.impl.ob.Jb;
import com.yandex.metrica.impl.ob.ic;
import com.yandex.metrica.impl.ob.wc;
import com.yandex.metrica.impl.ob.zc;

public class xc<T>
implements ic<T> {
    @NonNull
    private final wc<T> a;
    @NonNull
    private final Eb<T> b;
    @NonNull
    private final zc c;
    @NonNull
    private final Jb<T> d;
    @NonNull
    private final Runnable e = new Runnable(this){
        public final xc a;
        {
            this.a = xc2;
        }

        public void run() {
            this.a.b();
        }
    };
    @Nullable
    private T f;

    public xc(@NonNull wc<T> wc2, @NonNull Eb<T> eb2, @NonNull zc zc2, @NonNull Jb<T> jb2, @Nullable T t3) {
        this.a = wc2;
        this.b = eb2;
        this.c = zc2;
        this.d = jb2;
        this.f = t3;
    }

    public void a() {
        T t3 = this.f;
        if (t3 != null && this.b.a(t3) && this.a.a(this.f)) {
            this.c.a();
            this.d.a(this.e, this.f);
        }
    }

    public void a(@Nullable T t3) {
        if (!A2.a(this.f, t3)) {
            this.f = t3;
            this.b();
            this.a();
        }
    }

    public void b() {
        this.d.a();
        this.a.a();
    }

    public void c() {
        T t3 = this.f;
        if (t3 != null && this.b.b(t3)) {
            this.a.b();
        }
        this.a();
    }
}

