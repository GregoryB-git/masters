/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.kg
 *  com.yandex.metrica.impl.ob.n4
 *  com.yandex.metrica.impl.ob.qb
 *  com.yandex.metrica.impl.ob.w2
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.H3;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.J3;
import com.yandex.metrica.impl.ob.K;
import com.yandex.metrica.impl.ob.L;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.M4;
import com.yandex.metrica.impl.ob.N;
import com.yandex.metrica.impl.ob.N4;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.R3;
import com.yandex.metrica.impl.ob.Rh;
import com.yandex.metrica.impl.ob.Sf;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.Uf;
import com.yandex.metrica.impl.ob.V0;
import com.yandex.metrica.impl.ob.Xh;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.c4;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.f0;
import com.yandex.metrica.impl.ob.ig;
import com.yandex.metrica.impl.ob.k4;
import com.yandex.metrica.impl.ob.kg;
import com.yandex.metrica.impl.ob.n4;
import com.yandex.metrica.impl.ob.qb;
import com.yandex.metrica.impl.ob.w2;
import com.yandex.metrica.impl.ob.yf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class F3
implements P3,
Xh,
R3 {
    @NonNull
    private final Context a;
    @NonNull
    private final I3 b;
    @NonNull
    private final Rh c;
    @NonNull
    private final ei d;
    @NonNull
    private final c4 e;
    @NonNull
    private final qb f;
    @NonNull
    private final N4<M4, F3> g;
    @NonNull
    private final w2<F3> h;
    @NonNull
    private List<V0> i = new ArrayList();
    @NonNull
    private final J3 j;
    @Nullable
    private yf k;
    @NonNull
    private final M l;
    @NonNull
    private final kg m;
    private final Object n = new Object();

    @VisibleForTesting
    public F3(@NonNull Context context, @NonNull Rh rh, @NonNull I3 i3, @NonNull D3 object, @NonNull c4 c42, @NonNull ig ig2, @NonNull J3 j3, @NonNull H3 h32, @NonNull N n, @NonNull qb qb2, @NonNull kg kg2) {
        this.a = context = context.getApplicationContext();
        this.b = i3;
        this.c = rh;
        this.e = c42;
        this.j = j3;
        this.g = h32.a(this);
        this.d = object = rh.a(context, i3, ((D3)object).a);
        this.f = qb2;
        qb2.a(context, ((ei)object).d());
        this.l = n.a((ei)object, qb2, context);
        this.h = h32.a(this, (ei)object);
        this.m = kg2;
        rh.a(i3, this);
    }

    private void a(@Nullable ResultReceiver resultReceiver, @Nullable Map<String, String> object) {
        object = this.l.a((Map<String, String>)object);
        int n = f0.b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            ((L)object).c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @NonNull
    public D3.a a() {
        return this.e.a();
    }

    public void a(@Nullable ResultReceiver resultReceiver) {
        this.m.a(new Sf(){
            public final ResultReceiver a;
            {
                this.a = resultReceiver;
            }

            @Override
            public void a(@Nullable Tf object) {
                ResultReceiver resultReceiver = this.a;
                int n = Uf.b;
                if (resultReceiver != null) {
                    Bundle bundle = new Bundle();
                    object = object == null ? null : (Object)((Tf)object).a();
                    bundle.putByteArray("referrer", (byte[])object);
                    resultReceiver.send(1, bundle);
                }
            }
        });
    }

    public void a(@NonNull D3.a a2) {
        this.e.a(a2);
    }

    @Override
    public void a(@NonNull D3 object) {
        this.d.a(((D3)object).a);
        object = ((D3)object).b;
        this.e.a(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NonNull Th th, @Nullable ci object) {
        Object object2 = object = this.n;
        synchronized (object2) {
            Iterator iterator = this.i.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.i.clear();
                    return;
                }
                Object object3 = (V0)iterator.next();
                ResultReceiver resultReceiver = ((V0)object3).c();
                object3 = this.l.a(((V0)object3).a());
                int n = f0.b;
                if (resultReceiver == null) continue;
                Bundle bundle = new Bundle();
                th.a(bundle);
                ((L)object3).c(bundle);
                resultReceiver.send(2, bundle);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@Nullable V0 v0) {
        Object object;
        Map<String, String> map = new Map<String, String>();
        List<String> list = null;
        if (v0 != null) {
            list = v0.b();
            object = v0.c();
            map = v0.a();
        } else {
            object = null;
        }
        boolean bl = this.d.a(list, map);
        if (!bl) {
            this.a((ResultReceiver)object, map);
        }
        if (!this.d.e()) {
            if (!bl) return;
            this.a((ResultReceiver)object, map);
            return;
        }
        Object object2 = object = this.n;
        synchronized (object2) {
            if (bl && v0 != null) {
                this.i.add((Object)v0);
            }
        }
        this.h.d();
    }

    public void a(@NonNull c0 c02, @NonNull n4 n42) {
        this.g.a(c02, n42);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a(@NonNull ci ci2) {
        Object object4;
        Map<String, String> map;
        Object object2;
        this.f.a(ci2);
        Object object3 = object2 = this.n;
        // MONITORENTER : object3
        for (K k3 : this.j.a()) {
            map = Gl.a(ci2.v());
            k3.a(this.l.a(map));
        }
        map = new Map<String, String>();
        for (Object object4 : this.i) {
            if (((V0)object4).a(ci2)) {
                this.a(((V0)object4).c(), ((V0)object4).a());
                continue;
            }
            map.add(object4);
        }
        object4 = new ArrayList(map);
        this.i = object4;
        if (!map.isEmpty()) {
            this.h.d();
        }
        // MONITOREXIT : object3
        if (this.k == null) {
            this.k = F0.g().l();
        }
        this.k.a(ci2);
    }

    public void a(@NonNull n4 n42) {
        F3 f3 = this;
        synchronized (f3) {
            this.j.a((k4)n42);
            Map<String, String> map = Gl.a(this.d.d().v());
            n42.a(this.l.a(map));
            return;
        }
    }

    @NonNull
    public Context b() {
        return this.a;
    }

    public void b(@NonNull n4 n42) {
        F3 f3 = this;
        synchronized (f3) {
            this.j.b((k4)n42);
            return;
        }
    }
}

