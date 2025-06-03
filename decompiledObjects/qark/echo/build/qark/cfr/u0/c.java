/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.List
 */
package u0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d0.q;
import d0.x;
import g0.M;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k0.Z0;
import k0.n;
import k0.v0;
import u0.a;
import u0.b;
import x0.x;

public final class c
extends n
implements Handler.Callback {
    public final a F;
    public final b G;
    public final Handler H;
    public final O0.b I;
    public final boolean J;
    public O0.a K;
    public boolean L;
    public boolean M;
    public long N;
    public d0.x O;
    public long P;

    public c(b b8, Looper looper) {
        this(b8, looper, a.a);
    }

    public c(b b8, Looper looper, a a8) {
        this(b8, looper, a8, false);
    }

    public c(b b8, Looper looper, a a8, boolean bl) {
        super(5);
        this.G = (b)g0.a.e(b8);
        b8 = looper == null ? null : M.z(looper, this);
        this.H = b8;
        this.F = (a)g0.a.e(a8);
        this.J = bl;
        this.I = new O0.b();
        this.P = -9223372036854775807L;
    }

    @Override
    public void T() {
        this.O = null;
        this.K = null;
        this.P = -9223372036854775807L;
    }

    @Override
    public void W(long l8, boolean bl) {
        this.O = null;
        this.L = false;
        this.M = false;
    }

    @Override
    public int a(q q8) {
        if (this.F.a(q8)) {
            int n8 = q8.K == 0 ? 4 : 2;
            return Z0.a(n8);
        }
        return Z0.a(0);
    }

    @Override
    public boolean c() {
        return this.M;
    }

    @Override
    public void c0(q[] object, long l8, long l9, x.b b8) {
        this.K = this.F.b(object[0]);
        object = this.O;
        if (object != null) {
            this.O = object.c(object.p + this.P - l9);
        }
        this.P = l9;
    }

    @Override
    public String d() {
        return "MetadataRenderer";
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(long l8, long l9) {
        boolean bl = true;
        while (bl) {
            this.m0();
            bl = this.l0(l8);
        }
    }

    public final void h0(d0.x x8, List list) {
        for (int i8 = 0; i8 < x8.e(); ++i8) {
            Object object = x8.d(i8).s();
            if (object != null && this.F.a((q)object)) {
                object = this.F.b((q)object);
                byte[] arrby = (byte[])g0.a.e(x8.d(i8).M());
                this.I.m();
                this.I.z(arrby.length);
                ((ByteBuffer)M.i((Object)this.I.r)).put(arrby);
                this.I.C();
                object = object.a(this.I);
                if (object == null) continue;
                this.h0((d0.x)object, list);
                continue;
            }
            list.add((Object)x8.d(i8));
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.k0((d0.x)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final long i0(long l8) {
        boolean bl = false;
        boolean bl2 = l8 != -9223372036854775807L;
        g0.a.f(bl2);
        bl2 = bl;
        if (this.P != -9223372036854775807L) {
            bl2 = true;
        }
        g0.a.f(bl2);
        return l8 - this.P;
    }

    public final void j0(d0.x x8) {
        Handler handler = this.H;
        if (handler != null) {
            handler.obtainMessage(1, (Object)x8).sendToTarget();
            return;
        }
        this.k0(x8);
    }

    public final void k0(d0.x x8) {
        this.G.x(x8);
    }

    public final boolean l0(long l8) {
        boolean bl;
        d0.x x8 = this.O;
        if (x8 != null && (this.J || x8.p <= this.i0(l8))) {
            this.j0(this.O);
            this.O = null;
            bl = true;
        } else {
            bl = false;
        }
        if (this.L && this.O == null) {
            this.M = true;
        }
        return bl;
    }

    public final void m0() {
        if (!this.L && this.O == null) {
            this.I.m();
            Object object = this.N();
            int n8 = this.e0((v0)object, this.I, 0);
            if (n8 == -4) {
                if (this.I.p()) {
                    this.L = true;
                    return;
                }
                if (this.I.t >= this.P()) {
                    object = this.I;
                    object.x = this.N;
                    object.C();
                    object = ((O0.a)M.i(this.K)).a(this.I);
                    if (object != null) {
                        ArrayList arrayList = new ArrayList(object.e());
                        this.h0((d0.x)object, (List)arrayList);
                        if (!arrayList.isEmpty()) {
                            this.O = new d0.x(this.i0(this.I.t), (List)arrayList);
                            return;
                        }
                    }
                }
            } else if (n8 == -5) {
                this.N = ((q)g0.a.e((Object)object.b)).s;
            }
        }
    }
}

