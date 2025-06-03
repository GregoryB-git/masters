/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.util.Map
 */
package y0;

import B0.n;
import android.net.Uri;
import d0.q;
import g0.a;
import i0.g;
import i0.k;
import i0.x;
import java.util.Map;
import x0.r;

public abstract class e
implements n.e {
    public final long a;
    public final k b;
    public final int c;
    public final q d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final x i;

    public e(g g8, k k8, int n8, q q8, int n9, Object object, long l8, long l9) {
        this.i = new x(g8);
        this.b = (k)a.e(k8);
        this.c = n8;
        this.d = q8;
        this.e = n9;
        this.f = object;
        this.g = l8;
        this.h = l9;
        this.a = r.a();
    }

    public final long a() {
        return this.i.q();
    }

    public final long d() {
        return this.h - this.g;
    }

    public final Map e() {
        return this.i.s();
    }

    public final Uri f() {
        return this.i.r();
    }
}

