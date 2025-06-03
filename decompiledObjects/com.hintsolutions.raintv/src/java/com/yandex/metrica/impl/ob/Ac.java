/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Qc
 *  com.yandex.metrica.impl.ob.ac$b
 *  com.yandex.metrica.impl.ob.cc
 *  com.yandex.metrica.impl.ob.ec
 *  com.yandex.metrica.impl.ob.fc
 *  com.yandex.metrica.impl.ob.hc$a
 *  com.yandex.metrica.impl.ob.ij
 *  com.yandex.metrica.impl.ob.w
 *  com.yandex.metrica.impl.ob.w$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Collection
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.F2;
import com.yandex.metrica.impl.ob.H0;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.J0;
import com.yandex.metrica.impl.ob.Qb;
import com.yandex.metrica.impl.ob.Qc;
import com.yandex.metrica.impl.ob.ac;
import com.yandex.metrica.impl.ob.bc;
import com.yandex.metrica.impl.ob.cc;
import com.yandex.metrica.impl.ob.ec;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.ij;
import com.yandex.metrica.impl.ob.w;
import java.util.Collection;

public class ac {
    @NonNull
    private final bc a;
    @NonNull
    private final cc b;
    @NonNull
    private final SystemTimeProvider c;
    @Nullable
    private fc d;
    @NonNull
    private final E e;
    @NonNull
    private final H2 f;
    @NonNull
    private final Qc g;
    @NonNull
    private final w h;
    private boolean i;
    private final Runnable j;

    public ac(@NonNull bc bc2) {
        Context context = bc2.a.a;
        Object object = bc2.e;
        object = object == null ? null : object.m;
        this(bc2, new Qc(context, (Qb)object));
    }

    private ac(@NonNull bc bc2, @NonNull Qc qc2) {
        this(bc2, new cc(bc2.a.a), new SystemTimeProvider(), F0.g().c(), F0.g().b(), H2.a(bc2.a.a), qc2, new H0.c());
    }

    public ac(@NonNull bc bc2, @NonNull cc cc2, @NonNull SystemTimeProvider systemTimeProvider, @NonNull E e3, @NonNull w w4, @NonNull H2 h22, @NonNull Qc qc2, @NonNull H0.c c3) {
        this.j = new Runnable(this){
            public final ac a;
            {
                this.a = ac2;
            }

            public void run() {
                this.a.b();
                this.a.c();
            }
        };
        this.a = bc2;
        this.b = cc2;
        this.c = systemTimeProvider;
        this.d = bc2.e;
        this.e = e3;
        this.h = w4;
        this.f = h22;
        this.g = qc2;
        h22.a().a(c3.a(bc2.a.b, (J0)qc2, (H0.d)((Object)h22.a())));
    }

    private void a() {
        fc fc2 = this.d;
        boolean bl = fc2 != null && fc2.i;
        if (this.i != bl) {
            this.i = bl;
            if (bl) {
                this.c();
            } else {
                this.a.a.b.remove(this.j);
            }
        }
    }

    private void c() {
        long l3;
        fc fc2 = this.d;
        if (fc2 != null && (l3 = fc2.h) > 0L) {
            this.a.a.b.executeDelayed(this.j, l3);
        }
    }

    public void a(@Nullable fc object) {
        this.d = object;
        Qc qc2 = this.g;
        object = object == null ? null : object.m;
        qc2.a((Qb)object);
        this.a();
    }

    public void b() {
        ec ec2 = new ec();
        ec2.b(this.c.currentTimeMillis());
        ec2.a(this.c.elapsedRealtime());
        this.g.b();
        ec2.b(F2.a((Collection<F2>)((Collection)this.f.a().a())));
        this.a.b.a((ij)new b(this, ec2));
        ec2.a(this.e.b());
        ec2.a(hc.a.a((w.a)this.h.c()));
        this.b.a(ec2);
        this.a.c.a();
        this.a.d.a();
    }

    public void d() {
        this.a();
    }

    public void e() {
        this.a.a.b.remove(this.j);
    }
}

