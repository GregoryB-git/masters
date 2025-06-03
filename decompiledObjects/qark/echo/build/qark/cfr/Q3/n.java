/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 */
package Q3;

import Q3.e;
import V2.j;
import V3.C;
import V3.k;
import Y3.g;
import Y3.m;
import Z3.a;
import d4.o;
import d4.r;
import java.util.Map;

public class n {
    public V3.m a;
    public k b;

    public n(V3.m m8, k k8) {
        this.a = m8;
        this.b = k8;
    }

    public j c() {
        return this.d(null);
    }

    public final j d(e.e object) {
        object = m.l((e.e)object);
        this.a.i0(new Runnable((g)object){
            public final /* synthetic */ g o;
            {
                this.o = g8;
            }

            public void run() {
                n.this.a.T(n.this.b, (e.e)this.o.b());
            }
        });
        return (j)object.a();
    }

    public final j e(Object object, d4.n object2, e.e e8) {
        Y3.n.l(this.b);
        C.g(this.b, object);
        object = a.b(object);
        Y3.n.k(object);
        object = o.b(object, (d4.n)object2);
        object2 = m.l(e8);
        this.a.i0(new Runnable((d4.n)object, (g)object2){
            public final /* synthetic */ d4.n o;
            public final /* synthetic */ g p;
            {
                this.o = n9;
                this.p = g8;
            }

            public void run() {
                n.this.a.U(n.this.b, this.o, (e.e)this.p.b());
            }
        });
        return (j)object2.a();
    }

    public j f(Object object) {
        return this.e(object, r.a(), null);
    }

    public j g(Object object, double d8) {
        return this.e(object, r.c(this.b, d8), null);
    }

    public j h(Object object, String string2) {
        return this.e(object, r.c(this.b, string2), null);
    }

    public j i(Map map) {
        return this.j(map, null);
    }

    public final j j(Map map, e.e object) {
        final Map map2 = Y3.n.e(this.b, map);
        object = m.l((e.e)object);
        this.a.i0(new Runnable((g)object, map){
            public final /* synthetic */ g p;
            public final /* synthetic */ Map q;
            {
                this.p = g8;
                this.q = map22;
            }

            public void run() {
                n.this.a.V(n.this.b, map2, (e.e)this.p.b(), this.q);
            }
        });
        return (j)object.a();
    }

}

