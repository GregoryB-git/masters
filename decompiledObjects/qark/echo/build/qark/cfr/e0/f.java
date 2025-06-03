/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.ShortBuffer
 */
package e0;

import e0.b;
import e0.e;
import g0.M;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class f
implements b {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public b.a e;
    public b.a f;
    public b.a g;
    public b.a h;
    public boolean i;
    public e j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public f() {
        b.a a8;
        this.e = a8 = b.a.e;
        this.f = a8;
        this.g = a8;
        this.h = a8;
        a8 = b.a;
        this.k = a8;
        this.l = a8.asShortBuffer();
        this.m = a8;
        this.b = -1;
    }

    @Override
    public final boolean a() {
        if (this.f.a != -1 && (Math.abs((float)(this.c - 1.0f)) >= 1.0E-4f || Math.abs((float)(this.d - 1.0f)) >= 1.0E-4f || this.f.a != this.e.a)) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        b.a a8;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = a8 = b.a.e;
        this.f = a8;
        this.g = a8;
        this.h = a8;
        a8 = b.a;
        this.k = a8;
        this.l = a8.asShortBuffer();
        this.m = a8;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override
    public final boolean c() {
        e e8;
        if (this.p && ((e8 = this.j) == null || e8.k() == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer d() {
        int n8;
        e e8 = this.j;
        if (e8 != null && (n8 = e8.k()) > 0) {
            if (this.k.capacity() < n8) {
                ByteBuffer byteBuffer;
                this.k = byteBuffer = ByteBuffer.allocateDirect((int)n8).order(ByteOrder.nativeOrder());
                this.l = byteBuffer.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            e8.j(this.l);
            this.o += (long)n8;
            this.k.limit(n8);
            this.m = this.k;
        }
        e8 = this.m;
        this.m = b.a;
        return e8;
    }

    @Override
    public final void e() {
        e e8 = this.j;
        if (e8 != null) {
            e8.s();
        }
        this.p = true;
    }

    @Override
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        e e8 = (e)a.e(this.j);
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        int n8 = byteBuffer.remaining();
        this.n += (long)n8;
        e8.t(shortBuffer);
        byteBuffer.position(byteBuffer.position() + n8);
    }

    @Override
    public final void flush() {
        if (this.a()) {
            b.a a8;
            Object object = this.e;
            this.g = object;
            this.h = a8 = this.f;
            if (this.i) {
                this.j = new e(object.a, object.b, this.c, this.d, a8.a);
            } else {
                object = this.j;
                if (object != null) {
                    object.i();
                }
            }
        }
        this.m = b.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override
    public final b.a g(b.a a8) {
        if (a8.c == 2) {
            int n8;
            int n9 = n8 = this.b;
            if (n8 == -1) {
                n9 = a8.a;
            }
            this.e = a8;
            this.f = a8 = new b.a(n9, a8.b, 2);
            this.i = true;
            return a8;
        }
        throw new b.b(a8);
    }

    public final long h(long l8) {
        if (this.o >= 1024L) {
            long l9 = this.n - (long)((e)a.e(this.j)).l();
            int n8 = this.h.a;
            int n9 = this.g.a;
            if (n8 == n9) {
                return M.W0(l8, l9, this.o);
            }
            return M.W0(l8, l9 * (long)n8, this.o * (long)n9);
        }
        return (long)((double)this.c * (double)l8);
    }

    public final void i(float f8) {
        if (this.d != f8) {
            this.d = f8;
            this.i = true;
        }
    }

    public final void j(float f8) {
        if (this.c != f8) {
            this.c = f8;
            this.i = true;
        }
    }
}

