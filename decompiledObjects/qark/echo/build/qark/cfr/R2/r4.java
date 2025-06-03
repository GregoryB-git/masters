/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package R2;

import R2.s4;
import java.util.Map;

public final class r4
implements Runnable {
    public /* synthetic */ s4 o;
    public /* synthetic */ int p;
    public /* synthetic */ Exception q;
    public /* synthetic */ byte[] r;
    public /* synthetic */ Map s;

    public /* synthetic */ r4(s4 s42, int n8, Exception exception, byte[] arrby, Map map) {
        this.o = s42;
        this.p = n8;
        this.q = exception;
        this.r = arrby;
        this.s = map;
    }

    public final void run() {
        this.o.a(this.p, this.q, this.r, this.s);
    }
}

