// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u0;

import k0.v0;
import java.util.ArrayList;
import j0.i;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.List;
import k0.Z0;
import d0.q;
import g0.M;
import android.os.Looper;
import d0.x;
import android.os.Handler;
import android.os.Handler$Callback;
import k0.n;

public final class c extends n implements Handler$Callback
{
    public final a F;
    public final u0.b G;
    public final Handler H;
    public final O0.b I;
    public final boolean J;
    public O0.a K;
    public boolean L;
    public boolean M;
    public long N;
    public x O;
    public long P;
    
    public c(final u0.b b, final Looper looper) {
        this(b, looper, a.a);
    }
    
    public c(final u0.b b, final Looper looper, final a a) {
        this(b, looper, a, false);
    }
    
    public c(final u0.b b, final Looper looper, final a a, final boolean j) {
        super(5);
        this.G = (u0.b)g0.a.e(b);
        Handler z;
        if (looper == null) {
            z = null;
        }
        else {
            z = g0.M.z(looper, (Handler$Callback)this);
        }
        this.H = z;
        this.F = (a)g0.a.e(a);
        this.J = j;
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
    public void W(final long n, final boolean b) {
        this.O = null;
        this.L = false;
        this.M = false;
    }
    
    public int a(final q q) {
        if (this.F.a(q)) {
            int n;
            if (q.K == 0) {
                n = 4;
            }
            else {
                n = 2;
            }
            return Z0.a(n);
        }
        return Z0.a(0);
    }
    
    public boolean c() {
        return this.M;
    }
    
    @Override
    public void c0(final q[] array, final long n, final long p4, final x0.x.b b) {
        this.K = this.F.b(array[0]);
        final x o = this.O;
        if (o != null) {
            this.O = o.c(o.p + this.P - p4);
        }
        this.P = p4;
    }
    
    public String d() {
        return "MetadataRenderer";
    }
    
    public boolean e() {
        return true;
    }
    
    public void f(final long n, final long n2) {
        for (boolean l0 = true; l0; l0 = this.l0(n)) {
            this.m0();
        }
    }
    
    public final void h0(final x x, final List list) {
        for (int i = 0; i < x.e(); ++i) {
            final q s = x.d(i).s();
            if (s != null && this.F.a(s)) {
                final O0.a b = this.F.b(s);
                final byte[] src = (byte[])g0.a.e(x.d(i).M());
                this.I.m();
                this.I.z(src.length);
                ((ByteBuffer)g0.M.i(this.I.r)).put(src);
                this.I.C();
                final x a = b.a(this.I);
                if (a != null) {
                    this.h0(a, list);
                }
            }
            else {
                list.add(x.d(i));
            }
        }
    }
    
    public boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.k0((x)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final long i0(final long n) {
        final boolean b = false;
        g0.a.f(n != -9223372036854775807L);
        boolean b2 = b;
        if (this.P != -9223372036854775807L) {
            b2 = true;
        }
        g0.a.f(b2);
        return n - this.P;
    }
    
    public final void j0(final x x) {
        final Handler h = this.H;
        if (h != null) {
            h.obtainMessage(1, (Object)x).sendToTarget();
            return;
        }
        this.k0(x);
    }
    
    public final void k0(final x x) {
        this.G.x(x);
    }
    
    public final boolean l0(final long n) {
        final x o = this.O;
        boolean b;
        if (o != null && (this.J || o.p <= this.i0(n))) {
            this.j0(this.O);
            this.O = null;
            b = true;
        }
        else {
            b = false;
        }
        if (this.L && this.O == null) {
            this.M = true;
        }
        return b;
    }
    
    public final void m0() {
        if (!this.L && this.O == null) {
            this.I.m();
            final v0 n = this.N();
            final int e0 = this.e0(n, this.I, 0);
            if (e0 == -4) {
                if (this.I.p()) {
                    this.L = true;
                    return;
                }
                if (this.I.t >= this.P()) {
                    final O0.b i = this.I;
                    i.x = this.N;
                    i.C();
                    final x a = ((O0.a)g0.M.i(this.K)).a(this.I);
                    if (a != null) {
                        final ArrayList list = new ArrayList(a.e());
                        this.h0(a, list);
                        if (!list.isEmpty()) {
                            this.O = new x(this.i0(this.I.t), list);
                        }
                    }
                }
            }
            else if (e0 == -5) {
                this.N = ((q)g0.a.e(n.b)).s;
            }
        }
    }
}
