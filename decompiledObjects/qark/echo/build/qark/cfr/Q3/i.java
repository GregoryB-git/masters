/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package Q3;

import Q3.h;
import R3.d;
import V3.A;
import V3.g;
import V3.p;
import java.util.HashMap;
import java.util.Map;
import r4.a;
import s3.e;

public class i {
    public final Map a = new HashMap();
    public final e b;
    public final A c;
    public final A d;

    public i(e e8, a a8, a a9) {
        this.b = e8;
        this.c = new R3.g(a8);
        this.d = new d(a9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h a(p p8) {
        synchronized (this) {
            try {
                h h8 = (h)this.a.get((Object)p8);
                Object object = h8;
                if (h8 == null) {
                    object = new g();
                    if (!this.b.y()) {
                        object.O(this.b.q());
                    }
                    object.K(this.b);
                    object.J(this.c);
                    object.I(this.d);
                    object = new h(this.b, p8, (g)object);
                    this.a.put((Object)p8, object);
                }
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

