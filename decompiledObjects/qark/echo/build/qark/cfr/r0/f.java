/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Comparable
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
package r0;

import X2.B;
import X2.v;
import X2.w;
import android.net.Uri;
import d0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import r0.h;

public final class f
extends h {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final m q;
    public final List r;
    public final List s;
    public final Map t;
    public final long u;
    public final f v;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public f(int var1_1, String var2_2, List var3_3, long var4_4, boolean var6_5, long var7_6, boolean var9_7, int var10_8, long var11_9, int var13_10, long var14_11, long var16_12, boolean var18_13, boolean var19_14, boolean var20_15, m var21_16, List var22_17, List var23_18, f var24_19, Map var25_20) {
        block3 : {
            super((String)var2_2, var3_3, var18_13);
            this.d = var1_1;
            this.h = var7_6;
            this.g = var6_5;
            this.i = var9_7;
            this.j = var10_8;
            this.k = var11_9;
            this.l = var13_10;
            this.m = var14_11;
            this.n = var16_12;
            this.o = var19_14;
            this.p = var20_15;
            this.q = var21_16;
            this.r = v.U((Collection)var22_17);
            this.s = v.U((Collection)var23_18);
            this.t = w.c(var25_20);
            if (var23_18.isEmpty()) break block3;
            var2_2 = (b)B.d((Iterable)var23_18);
            ** GOTO lbl23
        }
        if (!var22_17.isEmpty()) {
            var2_2 = (d)B.d((Iterable)var22_17);
lbl23: // 2 sources:
            this.u = var2_2.s + var2_2.q;
        } else {
            this.u = 0L;
        }
        var7_6 = -9223372036854775807L;
        if (var4_4 != -9223372036854775807L) {
            var7_6 = this.u;
            var7_6 = var4_4 >= 0L ? Math.min((long)var7_6, (long)var4_4) : Math.max((long)0L, (long)(var7_6 + var4_4));
        }
        this.e = var7_6;
        var6_5 = var4_4 >= 0L;
        this.f = var6_5;
        this.v = var24_19;
    }

    public f b(List list) {
        return this;
    }

    public f c(long l8, int n8) {
        return new f(this.d, this.a, this.b, this.e, this.g, l8, true, n8, this.k, this.l, this.m, this.n, this.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public f d() {
        if (this.o) {
            return this;
        }
        return new f(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public long e() {
        return this.h + this.u;
    }

    public boolean f(f f8) {
        boolean bl;
        boolean bl2 = bl = true;
        if (f8 != null) {
            long l8 = this.k;
            long l9 = f8.k;
            if (l8 > l9) {
                return true;
            }
            if (l8 < l9) {
                return false;
            }
            int n8 = this.r.size() - f8.r.size();
            if (n8 != 0) {
                if (n8 > 0) {
                    return true;
                }
                return false;
            }
            n8 = this.s.size();
            int n9 = f8.s.size();
            bl2 = bl;
            if (n8 <= n9) {
                if (n8 == n9 && this.o && !f8.o) {
                    return true;
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    public static final class b
    extends e {
        public final boolean A;
        public final boolean z;

        public b(String string2, d d8, long l8, int n8, long l9, m m8, String string3, String string4, long l10, long l11, boolean bl, boolean bl2, boolean bl3) {
            super(string2, d8, l8, n8, l9, m8, string3, string4, l10, l11, bl, null);
            this.z = bl2;
            this.A = bl3;
        }

        public b e(long l8, int n8) {
            return new b(this.o, this.p, this.q, n8, l8, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A);
        }
    }

    public static final class c {
        public final Uri a;
        public final long b;
        public final int c;

        public c(Uri uri, long l8, int n8) {
            this.a = uri;
            this.b = l8;
            this.c = n8;
        }
    }

    public static final class d
    extends e {
        public final List A;
        public final String z;

        public d(String string2, long l8, long l9, String string3, String string4) {
            this(string2, null, "", 0L, -1, -9223372036854775807L, null, string3, string4, l8, l9, false, v.Y());
        }

        public d(String string2, d d8, String string3, long l8, int n8, long l9, m m8, String string4, String string5, long l10, long l11, boolean bl, List list) {
            super(string2, d8, l8, n8, l9, m8, string4, string5, l10, l11, bl, null);
            this.z = string3;
            this.A = v.U((Collection)list);
        }

        public d e(long l8, int n8) {
            ArrayList arrayList = new ArrayList();
            long l9 = l8;
            for (int i8 = 0; i8 < this.A.size(); ++i8) {
                b b8 = (b)this.A.get(i8);
                arrayList.add((Object)b8.e(l9, n8));
                l9 += b8.q;
            }
            return new d(this.o, this.p, this.z, this.q, n8, l8, this.t, this.u, this.v, this.w, this.x, this.y, (List)arrayList);
        }
    }

    public static abstract class e
    implements Comparable {
        public final String o;
        public final d p;
        public final long q;
        public final int r;
        public final long s;
        public final m t;
        public final String u;
        public final String v;
        public final long w;
        public final long x;
        public final boolean y;

        public e(String string2, d d8, long l8, int n8, long l9, m m8, String string3, String string4, long l10, long l11, boolean bl) {
            this.o = string2;
            this.p = d8;
            this.q = l8;
            this.r = n8;
            this.s = l9;
            this.t = m8;
            this.u = string3;
            this.v = string4;
            this.w = l10;
            this.x = l11;
            this.y = bl;
        }

        public /* synthetic */ e(String string2, d d8, long l8, int n8, long l9, m m8, String string3, String string4, long l10, long l11, boolean bl,  a8) {
            this(string2, d8, l8, n8, l9, m8, string3, string4, l10, l11, bl);
        }

        public int c(Long l8) {
            if (this.s > l8) {
                return 1;
            }
            if (this.s < l8) {
                return -1;
            }
            return 0;
        }
    }

    public static final class f {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public f(long l8, boolean bl, long l9, long l10, boolean bl2) {
            this.a = l8;
            this.b = bl;
            this.c = l9;
            this.d = l10;
            this.e = bl2;
        }
    }

}

