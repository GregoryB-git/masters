/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package H0;

import F0.J;
import F0.L;
import F0.M;
import F0.N;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import H0.a;
import H0.d;
import H0.e;
import H0.f;
import H0.g;
import H0.h;
import X2.g0;
import X2.v;
import c1.t;
import d0.A;
import d0.q;
import d0.z;
import g0.o;
import java.util.ArrayList;
import java.util.List;

public final class b
implements r {
    public final g0.z a;
    public final c b;
    public final boolean c;
    public final t.a d;
    public int e;
    public t f;
    public H0.c g;
    public long h;
    public e[] i;
    public long j;
    public e k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public b(int n8, t.a a8) {
        this.d = a8;
        boolean bl = true;
        if ((n8 & 1) != 0) {
            bl = false;
        }
        this.c = bl;
        this.a = new g0.z(12);
        this.b = new c(null);
        this.f = new J();
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    public static void f(s s8) {
        if ((s8.p() & 1L) == 1L) {
            s8.i(1);
        }
    }

    @Override
    public void a(long l8, long l9) {
        this.j = -1L;
        this.k = null;
        e[] arre = this.i;
        int n8 = arre.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arre[i8].o(l8);
        }
        if (l8 == 0L) {
            if (this.i.length == 0) {
                this.e = 0;
                return;
            }
            this.e = 3;
            return;
        }
        this.e = 6;
    }

    @Override
    public void b(t t8) {
        this.e = 0;
        t t9 = t8;
        if (this.c) {
            t9 = new c1.v(t8, this.d);
        }
        this.f = t9;
        this.j = -1L;
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        byte[] arrby = this.a.e();
        boolean bl = false;
        s8.n(arrby, 0, 12);
        this.a.T(0);
        if (this.a.t() != 1179011410) {
            return false;
        }
        this.a.U(4);
        if (this.a.t() == 541677121) {
            bl = true;
        }
        return bl;
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    public final e h(int n8) {
        for (e e8 : this.i) {
            if (!e8.j(n8)) continue;
            return e8;
        }
        return null;
    }

    @Override
    public int i(s object, L object2) {
        if (this.o((s)object, (L)object2)) {
            return 1;
        }
        switch (this.e) {
            default: {
                throw new AssertionError();
            }
            case 6: {
                return this.n((s)object);
            }
            case 5: {
                object2 = new g0.z(this.o);
                object.readFully(object2.e(), 0, this.o);
                this.k((g0.z)object2);
                this.e = 6;
                this.j = this.m;
                return 0;
            }
            case 4: {
                object.readFully(this.a.e(), 0, 8);
                this.a.T(0);
                int n8 = this.a.t();
                int n9 = this.a.t();
                if (n8 == 829973609) {
                    this.e = 5;
                    this.o = n9;
                    return 0;
                }
                this.j = object.p() + (long)n9;
                return 0;
            }
            case 3: {
                long l8;
                long l9;
                if (this.m != -1L && (l9 = object.p()) != (l8 = this.m)) {
                    this.j = l8;
                    return 0;
                }
                object.n(this.a.e(), 0, 12);
                object.h();
                this.a.T(0);
                this.b.a(this.a);
                int n10 = this.a.t();
                int n11 = this.b.a;
                if (n11 == 1179011410) {
                    object.i(12);
                    return 0;
                }
                if (n11 == 1414744396 && n10 == 1769369453) {
                    this.m = l9 = object.p();
                    this.n = l9 + (long)this.b.b + 8L;
                    if (!this.p) {
                        if (((H0.c)g0.a.e(this.g)).b()) {
                            this.e = 4;
                            this.j = this.n;
                            return 0;
                        }
                        this.f.e(new M.b(this.h));
                        this.p = true;
                    }
                    this.j = object.p() + 12L;
                    this.e = 6;
                    return 0;
                }
                this.j = object.p() + (long)this.b.b + 8L;
                return 0;
            }
            case 2: {
                int n12 = this.l - 4;
                object2 = new g0.z(n12);
                object.readFully(object2.e(), 0, n12);
                this.j((g0.z)object2);
                this.e = 3;
                return 0;
            }
            case 1: {
                object.readFully(this.a.e(), 0, 12);
                this.a.T(0);
                this.b.b(this.a);
                object = this.b;
                if (object.c == 1819436136) {
                    this.l = object.b;
                    this.e = 2;
                    return 0;
                }
                object = new StringBuilder();
                object.append("hdrl expected, found: ");
                object.append(this.b.c);
                throw A.a(object.toString(), null);
            }
            case 0: 
        }
        if (this.e((s)object)) {
            object.i(12);
            this.e = 1;
            return 0;
        }
        throw A.a("AVI Header List not found", null);
    }

    public final void j(g0.z object) {
        Object object2 = f.d(1819436136, (g0.z)object);
        if (object2.a() == 1819436136) {
            object = (H0.c)object2.c(H0.c.class);
            if (object != null) {
                this.g = object;
                this.h = (long)object.c * (long)object.a;
                object = new ArrayList();
                object2 = object2.a.q();
                int n8 = 0;
                while (object2.hasNext()) {
                    Object object3 = (a)object2.next();
                    if (object3.a() != 1819440243) continue;
                    if ((object3 = this.m((f)object3, n8)) != null) {
                        object.add(object3);
                    }
                    ++n8;
                }
                this.i = (e[])object.toArray((Object[])new e[0]);
                this.f.j();
                return;
            }
            throw A.a("AviHeader not found", null);
        }
        object = new StringBuilder();
        object.append("Unexpected header list type ");
        object.append(object2.a());
        throw A.a(object.toString(), null);
    }

    public final void k(g0.z arre) {
        int n8;
        int n9;
        long l8 = this.l((g0.z)arre);
        while (arre.a() >= 16) {
            n8 = arre.t();
            n9 = arre.t();
            long l9 = arre.t();
            arre.t();
            e e8 = this.h(n8);
            if (e8 == null) continue;
            if ((n9 & 16) == 16) {
                e8.b(l9 + l8);
            }
            e8.k();
        }
        arre = this.i;
        n9 = arre.length;
        for (n8 = 0; n8 < n9; ++n8) {
            arre[n8].c();
        }
        this.p = true;
        this.f.e(new b(this.h));
    }

    public final long l(g0.z z8) {
        int n8 = z8.a();
        long l8 = 0L;
        if (n8 < 16) {
            return 0L;
        }
        n8 = z8.f();
        z8.U(8);
        long l9 = z8.t();
        long l10 = this.m;
        if (l9 <= l10) {
            l8 = l10 + 8L;
        }
        z8.T(n8);
        return l8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final e m(f object, int n8) {
        d d8;
        Object object2;
        block8 : {
            block7 : {
                block6 : {
                    d8 = (d)object.c(d.class);
                    object2 = (g)object.c(g.class);
                    if (d8 != null) break block6;
                    object = "Missing Stream Header";
                    break block7;
                }
                if (object2 != null) break block8;
                object = "Missing Stream Format";
            }
            o.h("AviExtractor", (String)object);
            return null;
        }
        long l8 = d8.b();
        q q8 = object2.a;
        object2 = q8.a();
        object2.Z(n8);
        int n9 = d8.f;
        if (n9 != 0) {
            object2.f0(n9);
        }
        if ((object = (h)object.c(h.class)) != null) {
            object2.c0(object.a);
        }
        if ((n9 = z.k(q8.n)) != 1 && n9 != 2) {
            return null;
        }
        object = this.f.a(n8, n9);
        object.d(object2.K());
        object = new e(n8, n9, l8, d8.e, (T)object);
        this.h = l8;
        return object;
    }

    public final int n(s s8) {
        if (s8.p() >= this.n) {
            return -1;
        }
        byte[] arrby = this.k;
        if (arrby != null) {
            if (arrby.m(s8)) {
                this.k = null;
                return 0;
            }
        } else {
            b.f(s8);
            arrby = this.a.e();
            int n8 = 12;
            s8.n(arrby, 0, 12);
            this.a.T(0);
            int n9 = this.a.t();
            if (n9 == 1414744396) {
                this.a.T(8);
                if (this.a.t() != 1769369453) {
                    n8 = 8;
                }
                s8.i(n8);
                s8.h();
                return 0;
            }
            n8 = this.a.t();
            if (n9 == 1263424842) {
                this.j = s8.p() + (long)n8 + 8L;
                return 0;
            }
            s8.i(8);
            s8.h();
            arrby = this.h(n9);
            if (arrby == null) {
                this.j = s8.p() + (long)n8;
                return 0;
            }
            arrby.n(n8);
            this.k = arrby;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean o(s var1_1, L var2_2) {
        if (this.j == -1L) ** GOTO lbl9
        var5_4 = this.j;
        var3_3 = var1_1.p();
        if (var5_4 < var3_3 || var5_4 > 262144L + var3_3) {
            var2_2.a = var5_4;
            var7_5 = true;
        } else {
            var1_1.i((int)(var5_4 - var3_3));
lbl9: // 2 sources:
            var7_5 = false;
        }
        this.j = -1L;
        return var7_5;
    }

    @Override
    public void release() {
    }

    public class b
    implements M {
        public final long a;

        public b(long l8) {
            this.a = l8;
        }

        @Override
        public boolean h() {
            return true;
        }

        @Override
        public M.a j(long l8) {
            M.a a8 = b.this.i[0].i(l8);
            for (int i8 = 1; i8 < b.this.i.length; ++i8) {
                M.a a9 = b.this.i[i8].i(l8);
                M.a a10 = a8;
                if (a9.a.b < a8.a.b) {
                    a10 = a9;
                }
                a8 = a10;
            }
            return a8;
        }

        @Override
        public long l() {
            return this.a;
        }
    }

    public static class c {
        public int a;
        public int b;
        public int c;

        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public void a(g0.z z8) {
            this.a = z8.t();
            this.b = z8.t();
            this.c = 0;
        }

        public void b(g0.z z8) {
            this.a(z8);
            if (this.a == 1414744396) {
                this.c = z8.t();
                return;
            }
            z8 = new StringBuilder();
            z8.append("LIST expected, found: ");
            z8.append(this.a);
            throw A.a(z8.toString(), null);
        }
    }

}

