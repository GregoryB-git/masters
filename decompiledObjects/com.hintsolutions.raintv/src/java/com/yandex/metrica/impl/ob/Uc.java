/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Ec;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.H0;
import com.yandex.metrica.impl.ob.Ib;
import com.yandex.metrica.impl.ob.Ic;
import com.yandex.metrica.impl.ob.J0;
import com.yandex.metrica.impl.ob.Qb;
import com.yandex.metrica.impl.ob.Vb;
import com.yandex.metrica.impl.ob.Xb;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.Yb;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.dc;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.ic;
import com.yandex.metrica.impl.ob.vc;
import com.yandex.metrica.impl.ob.xc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class uc
implements J0 {
    @NonNull
    private Ic a;
    @NonNull
    private vc b;
    @NonNull
    private final List<xc<?>> c;
    @NonNull
    private final ic<Qb> d;
    @NonNull
    private final ic<Qb> e;
    @NonNull
    private final ic<Qb> f;
    @NonNull
    private final ic<Vb> g;
    @NonNull
    private final H0 h;
    private boolean i;

    public uc(@NonNull vc vc2, @NonNull Ic ic) {
        this(vc2, ic, F0.g().s());
    }

    @VisibleForTesting
    public uc(@NonNull vc object, @NonNull Ic object2, @NonNull Ib object3, @NonNull Ib object4, @NonNull Ec ec2, @NonNull Xb xb2, @NonNull H0.c c9) {
        Qb qb2;
        Qb qb3;
        Qb qb4;
        this.b = object;
        fc fc2 = ((vc)object).c;
        object = null;
        if (fc2 != null) {
            this.i = fc2.g;
            qb4 = fc2.n;
            qb3 = fc2.o;
            qb2 = fc2.p;
            object = fc2.q;
        } else {
            qb4 = null;
            qb2 = qb3 = null;
        }
        this.a = object2;
        object3 = ((Ib)object3).a((Ic)object2, qb3);
        object4 = ((Ib)object4).a((Ic)object2, qb4);
        object2 = ec2.a((Ic)object2, qb2);
        object = xb2.a((Vb)object);
        this.c = Arrays.asList((Object[])new xc[]{object3, object4, object2, object});
        this.d = object4;
        this.e = object3;
        this.f = object2;
        this.g = object;
        this.h = object = c9.a(this.b.a.b, this, this.a.b());
        this.a.b().a((H0)object);
    }

    private uc(@NonNull vc vc2, @NonNull Ic ic2, @NonNull Y8 y82) {
        this(vc2, ic2, new Yb(vc2, y82), new dc(vc2, y82), new Ec(vc2), new Xb(vc2, y82, ic2), new H0.c());
    }

    @Override
    public void a() {
        if (this.i) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((xc)iterator.next()).c();
            }
        }
    }

    public void a(@NonNull ci ci2) {
        this.a.a(ci2);
    }

    public void a(@Nullable fc object) {
        boolean bl2 = object != null && ((fc)object).g;
        this.i = bl2;
        this.a.a((fc)object);
        ic<Qb> ic2 = this.d;
        Object var4_4 = null;
        Object object2 = object == null ? null : ((fc)object).n;
        ((xc)ic2).a(object2);
        ic2 = this.e;
        object2 = object == null ? null : ((fc)object).o;
        ((xc)ic2).a(object2);
        ic2 = this.f;
        object2 = object == null ? null : ((fc)object).p;
        ((xc)ic2).a(object2);
        object2 = this.g;
        object = object == null ? var4_4 : ((fc)object).q;
        ((xc)object2).a(object);
        this.a();
    }

    @Nullable
    public Location b() {
        Location location = this.i ? this.a.a() : null;
        return location;
    }

    public void c() {
        if (this.i) {
            this.h.c();
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((xc)iterator.next()).a();
            }
        }
    }

    public void d() {
        this.h.d();
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((xc)iterator.next()).b();
        }
    }
}

