/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package c1;

import c1.k;
import c1.l;
import c1.m;
import c1.p;
import c1.q;
import g0.a;
import j0.h;
import j0.i;
import java.nio.ByteBuffer;

public abstract class j
extends j0.k
implements l {
    public final String o;

    public j(String string2) {
        super(new p[2], new q[2]);
        this.o = string2;
        this.w(1024);
    }

    public final m A(Throwable throwable) {
        return new m("Unexpected decode error", throwable);
    }

    public abstract k B(byte[] var1, int var2, boolean var3);

    public final m C(p p8, q q8, boolean bl) {
        try {
            Object object = (ByteBuffer)a.e((Object)p8.r);
            object = this.B(object.array(), object.limit(), bl);
            q8.z(p8.t, (k)object, p8.x);
            q8.r = false;
            return null;
        }
        catch (m m8) {
            return m8;
        }
    }

    @Override
    public void d(long l8) {
    }

    public final p y() {
        return new p();
    }

    public final q z() {
        return new q(){

            @Override
            public void x() {
                j.this.t(this);
            }
        };
    }

}

