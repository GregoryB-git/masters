/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.UUID
 */
package p0;

import B0.m;
import X2.g0;
import X2.v;
import X2.w;
import X2.y;
import a3.f;
import android.net.Uri;
import d0.u;
import g0.M;
import g0.a;
import i0.g;
import i0.m;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import p0.A;
import p0.F;
import p0.N;
import p0.O;
import p0.Q;
import p0.h;
import p0.x;

public final class l
implements A {
    public final Object a = new Object();
    public u.f b;
    public x c;
    public g.a d;
    public String e;
    public m f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public x a(u object) {
        a.e(object.b);
        u.f f8 = object.b.c;
        if (f8 == null) {
            return x.a;
        }
        object = this.a;
        synchronized (object) {
            try {
                if (M.c(f8, this.b)) return (x)a.e(this.c);
                this.b = f8;
                this.c = this.b(f8);
                return (x)a.e(this.c);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final x b(u.f f8) {
        Object object;
        Object object2 = this.d;
        if (object2 == null) {
            object2 = new m.b().e(this.e);
        }
        Object object3 = f8.c;
        object3 = object3 == null ? null : object3.toString();
        object2 = new O((String)object3, f8.h, (g.a)object2);
        object3 = f8.e.g().q();
        while (object3.hasNext()) {
            object = (Map.Entry)object3.next();
            object2.e((String)object.getKey(), (String)object.getValue());
        }
        object3 = new h.b().f(f8.a, N.d).c(f8.f).d(f8.g).e(f.n((Collection)f8.j));
        object = this.f;
        if (object != null) {
            object3.b((m)object);
        }
        object2 = object3.a((Q)object2);
        object2.F(0, f8.c());
        return object2;
    }
}

