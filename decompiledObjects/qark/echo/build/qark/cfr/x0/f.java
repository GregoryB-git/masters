/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package x0;

import d0.I;
import g0.M;
import java.io.IOException;
import java.util.ArrayList;
import x0.b0;
import x0.e;
import x0.h;
import x0.p;
import x0.v;
import x0.x;

public final class f
extends b0 {
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final I.c s;
    public a t;
    public b u;
    public long v;
    public long w;

    public f(x x8, long l8, long l9) {
        this(x8, l8, l9, true, false, false);
    }

    public f(x x8, long l8, long l9, boolean bl, boolean bl2, boolean bl3) {
        super((x)g0.a.e(x8));
        boolean bl4 = l8 >= 0L;
        g0.a.a(bl4);
        this.m = l8;
        this.n = l9;
        this.o = bl;
        this.p = bl2;
        this.q = bl3;
        this.r = new ArrayList();
        this.s = new I.c();
    }

    @Override
    public void B() {
        h.super.B();
        this.u = null;
        this.t = null;
    }

    @Override
    public void S(I i8) {
        if (this.u != null) {
            return;
        }
        this.W(i8);
    }

    public final void W(I i8) {
        long l8;
        long l9;
        int n8;
        Object object = this.s;
        int n9 = 0;
        i8.n(0, (I.c)object);
        long l10 = this.s.e();
        object = this.t;
        long l11 = Long.MIN_VALUE;
        if (object != null && !this.r.isEmpty() && !this.p) {
            l8 = this.v;
            l9 = this.n == Long.MIN_VALUE ? l11 : this.w - l10;
            l8 -= l10;
        } else {
            long l12 = this.m;
            long l13 = this.n;
            l8 = l12;
            l9 = l13;
            if (this.q) {
                l9 = this.s.c();
                l8 = l12 + l9;
                l9 = l13 + l9;
            }
            this.v = l10 + l8;
            if (this.n != Long.MIN_VALUE) {
                l11 = l10 + l9;
            }
            this.w = l11;
            int n10 = this.r.size();
            for (n8 = 0; n8 < n10; ++n8) {
                ((e)this.r.get(n8)).w(this.v, this.w);
            }
        }
        try {
            i8 = new a(i8, l8, l9);
            this.t = i8;
        }
        catch (b b8) {
            this.u = b8;
            for (n8 = n9; n8 < this.r.size(); ++n8) {
                ((e)this.r.get(n8)).t(this.u);
            }
            return;
        }
        this.A(i8);
    }

    @Override
    public void e(v v8) {
        g0.a.f(this.r.remove((Object)v8));
        this.k.e(((e)v8).o);
        if (this.r.isEmpty() && !this.p) {
            this.W(((a)g0.a.e((Object)this.t)).e);
        }
    }

    @Override
    public v f(x.b object, B0.b b8, long l8) {
        object = new e(this.k.f((x.b)object, b8, l8), this.o, this.v, this.w);
        this.r.add(object);
        return object;
    }

    @Override
    public void h() {
        b b8 = this.u;
        if (b8 == null) {
            h.super.h();
            return;
        }
        throw b8;
    }

    public static final class a
    extends p {
        public final long f;
        public final long g;
        public final long h;
        public final boolean i;

        public a(I object, long l8, long l9) {
            block7 : {
                boolean bl;
                block8 : {
                    block9 : {
                        super((I)object);
                        int n8 = object.i();
                        boolean bl2 = false;
                        if (n8 != 1) break block7;
                        object = object.n(0, new I.c());
                        long l10 = Math.max((long)0L, (long)l8);
                        if (!object.k && l10 != 0L && !object.h) {
                            throw new b(1);
                        }
                        l8 = l9 == Long.MIN_VALUE ? object.m : Math.max((long)0L, (long)l9);
                        long l11 = object.m;
                        l9 = l8;
                        if (l11 != -9223372036854775807L) {
                            l9 = l8;
                            if (l8 > l11) {
                                l9 = l11;
                            }
                            if (l10 > l9) {
                                throw new b(2);
                            }
                        }
                        this.f = l10;
                        this.g = l9;
                        n8 = (int)(l9 LCMP -9223372036854775807L);
                        l8 = n8 == 0 ? -9223372036854775807L : l9 - l10;
                        this.h = l8;
                        bl = bl2;
                        if (!object.i) break block8;
                        if (n8 == 0) break block9;
                        bl = bl2;
                        if (l11 == -9223372036854775807L) break block8;
                        bl = bl2;
                        if (l9 != l11) break block8;
                    }
                    bl = true;
                }
                this.i = bl;
                return;
            }
            throw new b(0);
        }

        @Override
        public I.b g(int n8, I.b b8, boolean bl) {
            this.e.g(0, b8, bl);
            long l8 = b8.n() - this.f;
            long l9 = this.h;
            l9 = l9 == -9223372036854775807L ? -9223372036854775807L : (l9 -= l8);
            return b8.s(b8.a, b8.b, 0, l9, l8);
        }

        @Override
        public I.c o(int n8, I.c c8, long l8) {
            this.e.o(0, c8, 0L);
            long l9 = c8.p;
            l8 = this.f;
            c8.p = l9 + l8;
            c8.m = this.h;
            c8.i = this.i;
            l9 = c8.l;
            if (l9 != -9223372036854775807L) {
                c8.l = l8 = Math.max((long)l9, (long)l8);
                l9 = this.g;
                if (l9 != -9223372036854775807L) {
                    l8 = Math.min((long)l8, (long)l9);
                }
                c8.l = l8 - this.f;
            }
            l8 = M.i1(this.f);
            l9 = c8.e;
            if (l9 != -9223372036854775807L) {
                c8.e = l9 + l8;
            }
            if ((l9 = c8.f) != -9223372036854775807L) {
                c8.f = l9 + l8;
            }
            return c8;
        }
    }

    public static final class b
    extends IOException {
        public final int o;

        public b(int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal clipping: ");
            stringBuilder.append(b.a(n8));
            super(stringBuilder.toString());
            this.o = n8;
        }

        public static String a(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return "unknown";
                    }
                    return "start exceeds end";
                }
                return "not seekable to start";
            }
            return "invalid period count";
        }
    }

}

