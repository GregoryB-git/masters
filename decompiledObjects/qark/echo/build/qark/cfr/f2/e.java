/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package f2;

import android.content.Context;
import f2.k;
import f2.u;
import f2.v;
import f2.w;
import g2.j;
import g2.l;
import h2.a;
import l2.i;
import m2.s;
import n2.N;
import n2.V;
import n2.g;
import n2.h;
import p2.c;
import p2.d;

public final class e
extends v {
    public U5.a A;
    public U5.a o;
    public U5.a p;
    public U5.a q;
    public U5.a r;
    public U5.a s;
    public U5.a t;
    public U5.a u;
    public U5.a v;
    public U5.a w;
    public U5.a x;
    public U5.a y;
    public U5.a z;

    public e(Context context) {
        this.e(context);
    }

    public /* synthetic */ e(Context context,  a8) {
        this(context);
    }

    public static v.a c() {
        return new b(null);
    }

    @Override
    public n2.d a() {
        return (n2.d)this.u.get();
    }

    @Override
    public u b() {
        return (u)this.A.get();
    }

    public final void e(Context object) {
        this.o = a.a(k.a());
        this.p = object = h2.c.a(object);
        this.q = object = j.a((U5.a)object, c.a(), d.a());
        this.r = a.a(l.a(this.p, (U5.a)object));
        this.s = V.a(this.p, g.a(), n2.i.a());
        this.t = a.a(h.a(this.p));
        this.u = a.a(N.a(c.a(), d.a(), n2.j.a(), this.s, this.t));
        this.v = object = l2.g.b(c.a());
        this.w = object = i.a(this.p, this.u, (U5.a)object, d.a());
        U5.a a8 = this.o;
        U5.a a9 = this.r;
        U5.a a10 = this.u;
        this.x = l2.d.a(a8, a9, (U5.a)object, a10, a10);
        object = this.p;
        a8 = this.r;
        a9 = this.u;
        this.y = s.a((U5.a)object, a8, a9, this.w, this.o, a9, c.a(), d.a(), this.u);
        object = this.o;
        a8 = this.u;
        this.z = m2.w.a((U5.a)object, a8, this.w, a8);
        this.A = a.a(w.a(c.a(), d.a(), this.x, this.y, this.z));
    }

    public static final class b
    implements v.a {
        public Context a;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public v a() {
            h2.d.a((Object)this.a, Context.class);
            return new e(this.a, null);
        }

        public b c(Context context) {
            this.a = (Context)h2.d.b((Object)context);
            return this;
        }
    }

}

