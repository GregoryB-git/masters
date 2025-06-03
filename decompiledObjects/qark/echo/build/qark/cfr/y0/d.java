/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 */
package y0;

import F0.L;
import F0.M;
import F0.S;
import F0.T;
import F0.n;
import F0.r;
import F0.t;
import X0.e;
import Z0.h;
import Z0.s;
import android.util.SparseArray;
import c1.o;
import c1.t;
import c1.u;
import d0.i;
import d0.q;
import d0.z;
import g0.E;
import java.util.List;
import java.util.Objects;
import l0.y1;
import y0.f;

public final class d
implements t,
f {
    public static final b x = new b();
    public static final L y = new L();
    public final r o;
    public final int p;
    public final q q;
    public final SparseArray r;
    public boolean s;
    public f.b t;
    public long u;
    public M v;
    public q[] w;

    public d(r r8, int n8, q q8) {
        this.o = r8;
        this.p = n8;
        this.q = q8;
        this.r = new SparseArray();
    }

    @Override
    public T a(int n8, int n9) {
        a a8 = (a)this.r.get(n8);
        Object object = a8;
        if (a8 == null) {
            boolean bl = this.w == null;
            g0.a.f(bl);
            object = n9 == this.p ? this.q : null;
            object = new a(n8, n9, (q)object);
            object.g(this.t, this.u);
            this.r.put(n8, object);
        }
        return object;
    }

    @Override
    public void b(f.b b8, long l8, long l9) {
        this.t = b8;
        this.u = l9;
        if (!this.s) {
            this.o.b(this);
            if (l8 != -9223372036854775807L) {
                this.o.a(0L, l8);
            }
            this.s = true;
            return;
        }
        r r8 = this.o;
        long l10 = l8;
        if (l8 == -9223372036854775807L) {
            l10 = 0L;
        }
        r8.a(0L, l10);
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            ((a)this.r.valueAt(i8)).g(b8, l9);
        }
    }

    @Override
    public boolean c(F0.s s8) {
        int n8 = this.o.i(s8, y);
        boolean bl = false;
        boolean bl2 = n8 != 1;
        g0.a.f(bl2);
        bl2 = bl;
        if (n8 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public F0.h d() {
        M m8 = this.v;
        if (m8 instanceof F0.h) {
            return (F0.h)m8;
        }
        return null;
    }

    @Override
    public void e(M m8) {
        this.v = m8;
    }

    @Override
    public q[] f() {
        return this.w;
    }

    @Override
    public void j() {
        q[] arrq = new q[this.r.size()];
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            arrq[i8] = (q)g0.a.h(((a)this.r.valueAt((int)i8)).e);
        }
        this.w = arrq;
    }

    @Override
    public void release() {
        this.o.release();
    }

    public static final class a
    implements T {
        public final int a;
        public final int b;
        public final q c;
        public final n d;
        public q e;
        public T f;
        public long g;

        public a(int n8, int n9, q q8) {
            this.a = n8;
            this.b = n9;
            this.c = q8;
            this.d = new n();
        }

        @Override
        public void a(g0.z z8, int n8, int n9) {
            ((T)g0.M.i(this.f)).e(z8, n8);
        }

        @Override
        public void b(long l8, int n8, int n9, int n10, T.a a8) {
            long l9 = this.g;
            if (l9 != -9223372036854775807L && l8 >= l9) {
                this.f = this.d;
            }
            ((T)g0.M.i(this.f)).b(l8, n8, n9, n10, a8);
        }

        @Override
        public int c(i i8, int n8, boolean bl, int n9) {
            return ((T)g0.M.i(this.f)).f(i8, n8, bl);
        }

        @Override
        public void d(q q8) {
            q q9 = this.c;
            q q10 = q8;
            if (q9 != null) {
                q10 = q8.h(q9);
            }
            this.e = q10;
            ((T)g0.M.i(this.f)).d(this.e);
        }

        @Override
        public /* synthetic */ void e(g0.z z8, int n8) {
            S.b(this, z8, n8);
        }

        @Override
        public /* synthetic */ int f(i i8, int n8, boolean bl) {
            return S.a(this, i8, n8, bl);
        }

        public void g(f.b object, long l8) {
            if (object == null) {
                this.f = this.d;
                return;
            }
            this.g = l8;
            this.f = object = object.a(this.a, this.b);
            q q8 = this.e;
            if (q8 != null) {
                object.d(q8);
            }
        }
    }

    public static final class b
    implements f.a {
        public t.a a = new c1.h();
        public boolean b;

        @Override
        public q b(q object) {
            Object object2 = object;
            if (this.b) {
                object2 = object;
                if (this.a.a((q)object)) {
                    object2 = object.a().o0("application/x-media3-cues").S(this.a.c((q)object));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(object.n);
                    if (object.j != null) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(" ");
                        stringBuilder2.append(object.j);
                        object = stringBuilder2.toString();
                    } else {
                        object = "";
                    }
                    stringBuilder.append((String)object);
                    object2 = object2.O(stringBuilder.toString()).s0(Long.MAX_VALUE).K();
                }
            }
            return object2;
        }

        @Override
        public f c(int n8, q q8, boolean bl, List object, T object2, y1 object3) {
            object3 = q8.m;
            if (z.r((String)object3)) {
                if (!this.b) {
                    return null;
                }
                object = new o(this.a.b(q8), q8);
            } else {
                boolean bl2 = z.q((String)object3);
                int n9 = 1;
                if (bl2) {
                    if (!this.b) {
                        n9 = 3;
                    }
                    object = new e(this.a, n9);
                } else if (Objects.equals((Object)object3, (Object)"image/jpeg")) {
                    object = new N0.a(1);
                } else if (Objects.equals((Object)object3, (Object)"image/png")) {
                    object = new b1.a();
                } else {
                    n9 = bl ? 4 : 0;
                    int n10 = n9;
                    if (!this.b) {
                        n10 = n9 | 32;
                    }
                    object = new h(this.a, n10, null, null, (List)object, (T)object2);
                }
            }
            object2 = object;
            if (this.b) {
                object2 = object;
                if (!z.r((String)object3)) {
                    object2 = object;
                    if (!(object.d() instanceof h)) {
                        object2 = object;
                        if (!(object.d() instanceof e)) {
                            object2 = new u((r)object, this.a);
                        }
                    }
                }
            }
            return new d((r)object2, n8, q8);
        }

        public b d(boolean bl) {
            this.b = bl;
            return this;
        }
    }

}

