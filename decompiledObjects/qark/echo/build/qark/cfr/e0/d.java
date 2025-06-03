/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package e0;

import e0.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class d
implements b {
    public b.a b;
    public b.a c;
    public b.a d;
    public b.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public d() {
        Object object = b.a;
        this.f = object;
        this.g = object;
        this.d = object = b.a.e;
        this.e = object;
        this.b = object;
        this.c = object;
    }

    @Override
    public boolean a() {
        if (this.e != b.a.e) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        b.a a8;
        this.flush();
        this.f = b.a;
        this.d = a8 = b.a.e;
        this.e = a8;
        this.b = a8;
        this.c = a8;
        this.l();
    }

    @Override
    public boolean c() {
        if (this.h && this.g == b.a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = b.a;
        return byteBuffer;
    }

    @Override
    public final void e() {
        this.h = true;
        this.k();
    }

    @Override
    public final void flush() {
        this.g = b.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.j();
    }

    @Override
    public final b.a g(b.a a8) {
        this.d = a8;
        this.e = this.i(a8);
        if (this.a()) {
            return this.e;
        }
        return b.a.e;
    }

    public final boolean h() {
        return this.g.hasRemaining();
    }

    public abstract b.a i(b.a var1);

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public final ByteBuffer m(int n8) {
        ByteBuffer byteBuffer;
        if (this.f.capacity() < n8) {
            this.f = ByteBuffer.allocateDirect((int)n8).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        this.g = byteBuffer = this.f;
        return byteBuffer;
    }
}

