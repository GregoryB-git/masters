/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package G0;

import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import G0.a;
import d0.A;
import d0.i;
import d0.q;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;

public final class b
implements r {
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
        int[] arrn;
        p = new a();
        q = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] arrn2 = arrn = new int[16];
        arrn2[0] = 18;
        arrn2[1] = 24;
        arrn2[2] = 33;
        arrn2[3] = 37;
        arrn2[4] = 41;
        arrn2[5] = 47;
        arrn2[6] = 51;
        arrn2[7] = 59;
        arrn2[8] = 61;
        arrn2[9] = 6;
        arrn2[10] = 1;
        arrn2[11] = 1;
        arrn2[12] = 1;
        arrn2[13] = 1;
        arrn2[14] = 1;
        arrn2[15] = 1;
        r = arrn;
        s = g0.M.r0("#!AMR\n");
        t = g0.M.r0("#!AMR-WB\n");
        u = arrn[8];
    }

    public b() {
        this(0);
    }

    public b(int n8) {
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.b = n9;
        this.a = new byte[1];
        this.i = -1;
    }

    public static /* synthetic */ r[] c() {
        return b.o();
    }

    public static int h(int n8, long l8) {
        return (int)((long)n8 * 8000000L / l8);
    }

    public static /* synthetic */ r[] o() {
        return new r[]{new b()};
    }

    public static boolean r(s s8, byte[] arrby) {
        s8.h();
        byte[] arrby2 = new byte[arrby.length];
        s8.n(arrby2, 0, arrby.length);
        return Arrays.equals((byte[])arrby2, (byte[])arrby);
    }

    @Override
    public void a(long l8, long l9) {
        M m8;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (l8 != 0L && (m8 = this.n) instanceof F0.i) {
            this.k = ((F0.i)m8).b(l8);
            return;
        }
        this.k = 0L;
    }

    @Override
    public void b(t t8) {
        this.l = t8;
        this.m = t8.a(0, 1);
        t8.j();
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        return this.t(s8);
    }

    public final void f() {
        g0.a.h(this.m);
        g0.M.i(this.l);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        this.f();
        if (s8.p() == 0L && !this.t(s8)) {
            throw A.a("Could not find AMR header.", null);
        }
        this.p();
        int n8 = this.u(s8);
        this.q(s8.a(), n8);
        return n8;
    }

    public final M j(long l8, boolean bl) {
        int n8 = b.h(this.i, 20000L);
        return new F0.i(l8, this.h, n8, this.i, bl);
    }

    public final int k(int n8) {
        if (!this.m(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal AMR ");
            String string2 = this.c ? "WB" : "NB";
            stringBuilder.append(string2);
            stringBuilder.append(" frame type ");
            stringBuilder.append(n8);
            throw A.a(stringBuilder.toString(), null);
        }
        if (this.c) {
            return r[n8];
        }
        return q[n8];
    }

    public final boolean l(int n8) {
        if (!(this.c || n8 >= 12 && n8 <= 14)) {
            return true;
        }
        return false;
    }

    public final boolean m(int n8) {
        if (n8 >= 0 && n8 <= 15 && (this.n(n8) || this.l(n8))) {
            return true;
        }
        return false;
    }

    public final boolean n(int n8) {
        if (this.c && (n8 < 10 || n8 > 13)) {
            return true;
        }
        return false;
    }

    public final void p() {
        if (!this.o) {
            this.o = true;
            boolean bl = this.c;
            String string2 = bl ? "audio/amr-wb" : "audio/3gpp";
            int n8 = bl ? 16000 : 8000;
            this.m.d(new q.b().o0(string2).f0(u).N(1).p0(n8).K());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void q(long l8, int n8) {
        int n9;
        void var7_7;
        if (this.g) {
            return;
        }
        int n10 = this.b;
        if ((n10 & 1) != 0 && l8 != -1L && ((n9 = this.i) == -1 || n9 == this.e)) {
            if (this.j < 20 && n8 != -1) {
                return;
            }
            boolean bl = (n10 & 2) != 0;
            M m8 = this.j(l8, bl);
        } else {
            M.b b8 = new M.b(-9223372036854775807L);
        }
        this.n = var7_7;
        this.l.e((M)var7_7);
        this.g = true;
    }

    @Override
    public void release() {
    }

    public final int s(s s8) {
        s8.h();
        s8.n(this.a, 0, 1);
        byte by = this.a[0];
        if ((by & 131) <= 0) {
            return this.k(by >> 3 & 15);
        }
        s8 = new StringBuilder();
        s8.append("Invalid padding bits for frame header ");
        s8.append((int)by);
        throw A.a(s8.toString(), null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean t(s s8) {
        int n8;
        byte[] arrby = s;
        if (b.r(s8, arrby)) {
            this.c = false;
            n8 = arrby.length;
        } else {
            arrby = t;
            if (!b.r(s8, arrby)) {
                return false;
            }
            this.c = true;
            n8 = arrby.length;
        }
        s8.i(n8);
        return true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final int u(s s8) {
        int n8;
        if (this.f == 0) {
            this.e = n8 = this.s(s8);
            this.f = n8;
            if (this.i == -1) {
                this.h = s8.p();
                this.i = this.e;
            }
            if (this.i == this.e) {
                ++this.j;
            }
        }
        if ((n8 = this.m.f(s8, this.f, true)) == -1) {
            return -1;
        }
        this.f = n8 = this.f - n8;
        if (n8 > 0) {
            return 0;
        }
        this.m.b(this.k + this.d, 1, this.e, 0, null);
        this.d += 20000L;
        return 0;
        catch (EOFException eOFException) {
            return -1;
        }
    }
}

