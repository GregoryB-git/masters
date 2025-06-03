/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package V0;

import O0.b;
import V0.a;
import V0.d;
import V0.e;
import V0.f;
import V0.g;
import d0.x;
import g0.E;
import g0.y;
import g0.z;
import j0.i;
import java.nio.ByteBuffer;

public final class c
extends O0.c {
    public final z a = new z();
    public final y b = new y();
    public E c;

    @Override
    public x b(b object, ByteBuffer byteBuffer) {
        E e8 = this.c;
        if (e8 == null || object.x != e8.f()) {
            this.c = e8 = new E(object.t);
            e8.a(object.t - object.x);
        }
        object = byteBuffer.array();
        int n8 = byteBuffer.limit();
        this.a.R((byte[])object, n8);
        this.b.o((byte[])object, n8);
        this.b.r(39);
        long l8 = (long)this.b.h(1) << 32 | (long)this.b.h(32);
        this.b.r(20);
        n8 = this.b.h(12);
        int n9 = this.b.h(8);
        this.a.U(14);
        object = n9 != 0 ? (n9 != 255 ? (n9 != 4 ? (n9 != 5 ? (n9 != 6 ? null : g.a(this.a, l8, this.c)) : d.a(this.a, l8, this.c)) : f.a(this.a)) : a.a(this.a, n8, l8)) : new e();
        if (object == null) {
            return new x(new x.b[0]);
        }
        return new x(new x.b[]{object});
    }
}

