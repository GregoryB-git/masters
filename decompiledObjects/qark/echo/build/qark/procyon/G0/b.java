// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G0;

import java.io.EOFException;
import d0.A;
import F0.L;
import java.util.List;
import F0.q;
import F0.i;
import java.util.Arrays;
import F0.s;
import F0.M;
import F0.T;
import F0.t;
import F0.x;
import F0.r;

public final class b implements r
{
    public static final x p;
    public static final int[] q;
    public static final int[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final int u;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public long k;
    public t l;
    public T m;
    public M n;
    public boolean o;
    
    static {
        p = new a();
        q = new int[] { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
        final int[] array;
        final int[] r2 = array = new int[16];
        array[0] = 18;
        array[1] = 24;
        array[2] = 33;
        array[3] = 37;
        array[4] = 41;
        array[5] = 47;
        array[6] = 51;
        array[7] = 59;
        array[8] = 61;
        array[9] = 6;
        array[11] = (array[10] = 1);
        array[13] = (array[12] = 1);
        array[15] = (array[14] = 1);
        r = r2;
        s = g0.M.r0("#!AMR\n");
        t = g0.M.r0("#!AMR-WB\n");
        u = r2[8];
    }
    
    public b() {
        this(0);
    }
    
    public b(final int n) {
        int b = n;
        if ((n & 0x2) != 0x0) {
            b = (n | 0x1);
        }
        this.b = b;
        this.a = new byte[1];
        this.i = -1;
    }
    
    public static int h(final int n, final long n2) {
        return (int)(n * 8000000L / n2);
    }
    
    public static boolean r(final s s, final byte[] a2) {
        s.h();
        final byte[] a3 = new byte[a2.length];
        s.n(a3, 0, a2.length);
        return Arrays.equals(a3, a2);
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (n != 0L) {
            final M n3 = this.n;
            if (n3 instanceof i) {
                this.k = ((i)n3).b(n);
                return;
            }
        }
        this.k = 0L;
    }
    
    @Override
    public void b(final t l) {
        this.l = l;
        this.m = l.a(0, 1);
        l.j();
    }
    
    @Override
    public boolean e(final s s) {
        return this.t(s);
    }
    
    public final void f() {
        g0.a.h(this.m);
        g0.M.i(this.l);
    }
    
    @Override
    public int i(final s s, final L l) {
        this.f();
        if (s.p() == 0L && !this.t(s)) {
            throw A.a("Could not find AMR header.", null);
        }
        this.p();
        final int u = this.u(s);
        this.q(s.a(), u);
        return u;
    }
    
    public final M j(final long n, final boolean b) {
        return new i(n, this.h, h(this.i, 20000L), this.i, b);
    }
    
    public final int k(final int i) {
        if (!this.m(i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Illegal AMR ");
            String str;
            if (this.c) {
                str = "WB";
            }
            else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw A.a(sb.toString(), null);
        }
        if (this.c) {
            return G0.b.r[i];
        }
        return G0.b.q[i];
    }
    
    public final boolean l(final int n) {
        return !this.c && (n < 12 || n > 14);
    }
    
    public final boolean m(final int n) {
        return n >= 0 && n <= 15 && (this.n(n) || this.l(n));
    }
    
    public final boolean n(final int n) {
        return this.c && (n < 10 || n > 13);
    }
    
    public final void p() {
        if (!this.o) {
            this.o = true;
            final boolean c = this.c;
            String s;
            if (c) {
                s = "audio/amr-wb";
            }
            else {
                s = "audio/3gpp";
            }
            int n;
            if (c) {
                n = 16000;
            }
            else {
                n = 8000;
            }
            this.m.d(new d0.q.b().o0(s).f0(G0.b.u).N(1).p0(n).K());
        }
    }
    
    public final void q(final long n, final int n2) {
        if (this.g) {
            return;
        }
        final int b = this.b;
        while (true) {
            Label_0115: {
                if ((b & 0x1) == 0x0 || n == -1L) {
                    break Label_0115;
                }
                final int i = this.i;
                if (i != -1 && i != this.e) {
                    break Label_0115;
                }
                if (this.j < 20 && n2 != -1) {
                    return;
                }
                final M j = this.j(n, (b & 0x2) != 0x0);
                this.n = j;
                this.l.e(j);
                this.g = true;
                return;
            }
            final M j = new M.b(-9223372036854775807L);
            continue;
        }
    }
    
    @Override
    public void release() {
    }
    
    public final int s(final s s) {
        s.h();
        s.n(this.a, 0, 1);
        final byte i = this.a[0];
        if ((i & 0x83) <= 0) {
            return this.k(i >> 3 & 0xF);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid padding bits for frame header ");
        sb.append(i);
        throw A.a(sb.toString(), null);
    }
    
    public final boolean t(final s s) {
        final byte[] s2 = G0.b.s;
        int n;
        if (r(s, s2)) {
            this.c = false;
            n = s2.length;
        }
        else {
            final byte[] t = G0.b.t;
            if (!r(s, t)) {
                return false;
            }
            this.c = true;
            n = t.length;
        }
        s.i(n);
        return true;
    }
    
    public final int u(final s s) {
        Label_0073: {
            if (this.f != 0) {
                break Label_0073;
            }
            try {
                final int s2 = this.s(s);
                this.e = s2;
                this.f = s2;
                if (this.i == -1) {
                    this.h = s.p();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    ++this.j;
                }
                final int f = this.m.f(s, this.f, true);
                if (f == -1) {
                    return -1;
                }
                if ((this.f -= f) > 0) {
                    return 0;
                }
                this.m.b(this.k + this.d, 1, this.e, 0, null);
                this.d += 20000L;
                return 0;
            }
            catch (EOFException ex) {
                return -1;
            }
        }
    }
}
