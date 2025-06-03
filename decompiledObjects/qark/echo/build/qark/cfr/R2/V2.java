/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.R2;
import R2.w4;

public final class V2
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ R2 s;

    public V2(R2 r22, String string2, String string3, String string4, long l8) {
        this.s = r22;
        this.o = string2;
        this.p = string3;
        this.q = string4;
        this.r = l8;
    }

    public final void run() {
        Object object = this.o;
        if (object == null) {
            R2.o(this.s).C(this.p, null);
            return;
        }
        object = new w4(this.q, (String)object, this.r);
        R2.o(this.s).C(this.p, (w4)object);
    }
}

