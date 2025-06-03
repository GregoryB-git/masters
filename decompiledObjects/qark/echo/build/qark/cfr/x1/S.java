/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 */
package x1;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.F;
import x1.U;
import x1.V;

public final class S
extends OutputStream
implements U {
    public final Handler o;
    public final Map p;
    public F q;
    public V r;
    public int s;

    public S(Handler handler) {
        this.o = handler;
        this.p = new HashMap();
    }

    @Override
    public void a(F object) {
        this.q = object;
        object = object != null ? (V)this.p.get(object) : null;
        this.r = object;
    }

    public final void b(long l8) {
        Object object = this.q;
        if (object == null) {
            return;
        }
        if (this.r == null) {
            V v8;
            this.r = v8 = new V(this.o, (F)object);
            this.p.put(object, (Object)v8);
        }
        if ((object = this.r) != null) {
            object.b(l8);
        }
        this.s += (int)l8;
    }

    public final int c() {
        return this.s;
    }

    public final Map e() {
        return this.p;
    }

    public void write(int n8) {
        this.b(1L);
    }

    public void write(byte[] arrby) {
        Intrinsics.checkNotNullParameter(arrby, "buffer");
        this.b(arrby.length);
    }

    public void write(byte[] arrby, int n8, int n9) {
        Intrinsics.checkNotNullParameter(arrby, "buffer");
        this.b(n9);
    }
}

