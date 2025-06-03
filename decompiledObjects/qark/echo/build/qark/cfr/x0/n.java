/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 */
package x0;

import android.content.Context;
import c1.h;
import c1.t;
import i0.g;
import i0.l;
import java.util.HashMap;
import java.util.Map;
import x0.x;

public final class n
implements x.a {
    public final a a;
    public g.a b;
    public t.a c;
    public long d;
    public long e;
    public long f;
    public float g;
    public float h;
    public boolean i;

    public n(Context context, F0.x x8) {
        this(new l.a(context), x8);
    }

    public n(g.a a8, F0.x object) {
        this.b = a8;
        h h8 = new h();
        this.c = h8;
        this.a = object = new a((F0.x)object, h8);
        object.a(a8);
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static final class a {
        public final F0.x a;
        public final Map b;
        public final Map c;
        public g.a d;
        public boolean e;
        public t.a f;

        public a(F0.x x8, t.a a8) {
            this.a = x8;
            this.f = a8;
            this.b = new HashMap();
            this.c = new HashMap();
            this.e = true;
        }

        public void a(g.a a8) {
            if (a8 != this.d) {
                this.d = a8;
                this.b.clear();
                this.c.clear();
            }
        }
    }

}

