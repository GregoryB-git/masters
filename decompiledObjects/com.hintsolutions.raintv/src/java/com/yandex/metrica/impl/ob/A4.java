/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.M3$a
 *  com.yandex.metrica.impl.ob.W8
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.pm
 *  com.yandex.metrica.impl.ob.qm
 *  com.yandex.metrica.impl.ob.s
 *  com.yandex.metrica.impl.ob.s$a
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.G7;
import com.yandex.metrica.impl.ob.M3;
import com.yandex.metrica.impl.ob.O3;
import com.yandex.metrica.impl.ob.W7;
import com.yandex.metrica.impl.ob.W8;
import com.yandex.metrica.impl.ob.X5;
import com.yandex.metrica.impl.ob.a6;
import com.yandex.metrica.impl.ob.b6;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.pm;
import com.yandex.metrica.impl.ob.qm;
import com.yandex.metrica.impl.ob.s;

public class a4 {
    @NonNull
    private final W8 a;
    @NonNull
    private final W7 b;
    @NonNull
    private a6 c;
    @NonNull
    private G7 d;
    @NonNull
    private final qm e;
    @NonNull
    private final s f;
    @NonNull
    private final O3 g;
    @NonNull
    private a h;
    @NonNull
    private final TimeProvider i;
    private final int j;
    private long k;
    private long l;
    private int m;

    @VisibleForTesting
    public a4(@NonNull W8 w82, @NonNull W7 w7, @NonNull a6 a62, @NonNull G7 g7, @NonNull s s4, @NonNull qm qm2, int n2, @NonNull a a10, @NonNull O3 o3, @NonNull TimeProvider timeProvider) {
        this.a = w82;
        this.b = w7;
        this.c = a62;
        this.d = g7;
        this.f = s4;
        this.e = qm2;
        this.j = n2;
        this.g = o3;
        this.i = timeProvider;
        this.h = a10;
        this.k = w82.b(0L);
        this.l = w82.l();
        this.m = w82.i();
    }

    public long a() {
        return this.l;
    }

    public void a(c0 c02) {
        this.c.c(c02);
    }

    @VisibleForTesting
    public void a(@NonNull c0 c02, @NonNull b6 b62) {
        if (TextUtils.isEmpty((CharSequence)c02.o())) {
            c02.e(this.a.n());
        }
        c02.d(this.a.m());
        c02.a(Integer.valueOf((int)this.b.e()));
        s.a a10 = this.f.a();
        pm pm2 = this.e.a(c02);
        this.d.a(pm2.a(c02), c02.n(), b62, a10, this.g);
        ((M3.a)this.h).a.g();
    }

    public void b() {
        int n2;
        this.m = n2 = this.j;
        this.a.a(n2).d();
    }

    public void b(c0 c02) {
        this.a(c02, this.c.b(c02));
    }

    public void c(c0 c02) {
        int n2;
        this.a(c02, this.c.b(c02));
        this.m = n2 = this.j;
        this.a.a(n2).d();
    }

    public boolean c() {
        boolean bl = this.m < this.j;
        return bl;
    }

    public void d(c0 c02) {
        long l3;
        this.a(c02, this.c.b(c02));
        this.k = l3 = this.i.currentTimeSeconds();
        this.a.c(l3).d();
    }

    public boolean d() {
        boolean bl = this.i.currentTimeSeconds() - this.k > X5.a;
        return bl;
    }

    public void e(c0 c02) {
        long l3;
        this.a(c02, this.c.b(c02));
        this.l = l3 = this.i.currentTimeSeconds();
        this.a.e(l3).d();
    }

    public void f(@NonNull c0 c02) {
        this.a(c02, this.c.f(c02));
    }

    public static interface a {
    }
}

