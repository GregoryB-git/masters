/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package R2;

import A2.n;
import R2.e2;
import R2.g2;
import java.util.Map;

public final class i2
implements Runnable {
    public final e2 o;
    public final int p;
    public final Throwable q;
    public final byte[] r;
    public final String s;
    public final Map t;

    public i2(String string2, e2 e22, int n8, Throwable throwable, byte[] arrby, Map map) {
        n.i(e22);
        this.o = e22;
        this.p = n8;
        this.q = throwable;
        this.r = arrby;
        this.s = string2;
        this.t = map;
    }

    public /* synthetic */ i2(String string2, e2 e22, int n8, Throwable throwable, byte[] arrby, Map map, g2 g22) {
        this(string2, e22, n8, throwable, arrby, map);
    }

    public final void run() {
        this.o.a(this.s, this.p, this.q, this.r, this.t);
    }
}

