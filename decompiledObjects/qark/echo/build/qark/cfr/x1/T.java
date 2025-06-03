/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FilterOutputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package x1;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.F;
import x1.J;
import x1.U;
import x1.V;

public final class T
extends FilterOutputStream
implements U {
    public final J o;
    public final Map p;
    public final long q;
    public final long r;
    public long s;
    public long t;
    public V u;

    public T(OutputStream outputStream, J j8, Map map, long l8) {
        Intrinsics.checkNotNullParameter((Object)outputStream, "out");
        Intrinsics.checkNotNullParameter((Object)j8, "requests");
        Intrinsics.checkNotNullParameter((Object)map, "progressMap");
        super(outputStream);
        this.o = j8;
        this.p = map;
        this.q = l8;
        this.r = B.A();
    }

    private final void b(long l8) {
        V v8 = this.u;
        if (v8 != null) {
            v8.a(l8);
        }
        this.s = l8 = this.s + l8;
        if (l8 >= this.t + this.r || l8 >= this.q) {
            this.c();
        }
    }

    @Override
    public void a(F object) {
        object = object != null ? (V)this.p.get(object) : null;
        this.u = object;
    }

    public final void c() {
        if (this.s > this.t) {
            for (J.a a8 : this.o.T()) {
            }
            this.t = this.s;
        }
    }

    public void close() {
        super.close();
        Iterator iterator = this.p.values().iterator();
        while (iterator.hasNext()) {
            ((V)iterator.next()).c();
        }
        this.c();
    }

    public void write(int n8) {
        this.out.write(n8);
        this.b(1L);
    }

    public void write(byte[] arrby) {
        Intrinsics.checkNotNullParameter(arrby, "buffer");
        this.out.write(arrby);
        this.b(arrby.length);
    }

    public void write(byte[] arrby, int n8, int n9) {
        Intrinsics.checkNotNullParameter(arrby, "buffer");
        this.out.write(arrby, n8, n9);
        this.b(n9);
    }
}

