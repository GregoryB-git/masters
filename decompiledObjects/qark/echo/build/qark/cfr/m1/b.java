/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package m1;

import F0.L;
import F0.T;
import F0.X;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import android.util.Pair;
import d0.A;
import d0.i;
import d0.q;
import g0.M;
import g0.o;
import g0.z;
import java.util.List;
import m1.d;
import m1.e;

public final class b
implements r {
    public static final x h = new m1.a();
    public t a;
    public T b;
    public int c = 0;
    public long d = -1L;
    public b e;
    public int f = -1;
    public long g = -1L;

    public static /* synthetic */ r[] c() {
        return b.h();
    }

    private void f() {
        g0.a.h(this.b);
        M.i(this.a);
    }

    private static /* synthetic */ r[] h() {
        return new r[]{new b()};
    }

    @Override
    public void a(long l8, long l9) {
        int n8 = l8 == 0L ? 0 : 4;
        this.c = n8;
        b b8 = this.e;
        if (b8 != null) {
            b8.c(l9);
        }
    }

    @Override
    public void b(t t8) {
        this.a = t8;
        this.b = t8.a(0, 1);
        t8.j();
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        return d.a(s8);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        this.f();
        int n8 = this.c;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return this.m(s8);
                        }
                        throw new IllegalStateException();
                    }
                    this.n(s8);
                    return 0;
                }
                this.k(s8);
                return 0;
            }
            this.l(s8);
            return 0;
        }
        this.j(s8);
        return 0;
    }

    public final void j(s s8) {
        boolean bl = s8.p() == 0L;
        g0.a.f(bl);
        int n8 = this.f;
        if (n8 != -1) {
            s8.i(n8);
            this.c = 4;
            return;
        }
        if (d.a(s8)) {
            s8.i((int)(s8.m() - s8.p()));
            this.c = 1;
            return;
        }
        throw A.a("Unsupported or unrecognized wav file type.", null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void k(s object) {
        object = d.b((s)object);
        int n8 = object.a;
        if (n8 == 17) {
            object = new a(this.a, this.b, (m1.c)object);
        } else if (n8 == 6) {
            object = new c(this.a, this.b, (m1.c)object, "audio/g711-alaw", -1);
        } else if (n8 == 7) {
            object = new c(this.a, this.b, (m1.c)object, "audio/g711-mlaw", -1);
        } else {
            if ((n8 = X.a(n8, object.f)) == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported WAV format type: ");
                stringBuilder.append(object.a);
                throw A.d(stringBuilder.toString());
            }
            object = new c(this.a, this.b, (m1.c)object, "audio/raw", n8);
        }
        this.e = object;
        this.c = 3;
    }

    public final void l(s s8) {
        this.d = d.c(s8);
        this.c = 2;
    }

    public final int m(s s8) {
        long l8 = this.g;
        int n8 = 0;
        boolean bl = l8 != -1L;
        g0.a.f(bl);
        l8 = this.g;
        long l9 = s8.p();
        if (((b)g0.a.e(this.e)).a(s8, l8 - l9)) {
            n8 = -1;
        }
        return n8;
    }

    public final void n(s s8) {
        Pair pair = d.e(s8);
        this.f = ((Long)pair.first).intValue();
        long l8 = (Long)pair.second;
        long l9 = this.d;
        long l10 = l8;
        if (l9 != -1L) {
            l10 = l8;
            if (l8 == 0xFFFFFFFFL) {
                l10 = l9;
            }
        }
        this.g = (long)this.f + l10;
        l10 = s8.a();
        if (l10 != -1L && this.g > l10) {
            s8 = new StringBuilder();
            s8.append("Data exceeds input length: ");
            s8.append(this.g);
            s8.append(", ");
            s8.append(l10);
            o.h("WavExtractor", s8.toString());
            this.g = l10;
        }
        ((b)g0.a.e(this.e)).b(this.f, this.g);
        this.c = 4;
    }

    @Override
    public void release() {
    }

    public static final class a
    implements b {
        public static final int[] m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final t a;
        public final T b;
        public final m1.c c;
        public final int d;
        public final byte[] e;
        public final z f;
        public final int g;
        public final q h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(t object, T t8, m1.c c8) {
            int n8;
            int n9;
            this.a = object;
            this.b = t8;
            this.c = c8;
            this.g = n8 = Math.max((int)1, (int)(c8.c / 10));
            object = new z(c8.g);
            object.y();
            this.d = n9 = object.y();
            int n10 = c8.b;
            int n11 = (c8.e - n10 * 4) * 8 / (c8.f * n10) + 1;
            if (n9 == n11) {
                n11 = M.k(n8, n9);
                this.e = new byte[c8.e * n11];
                this.f = new z(n11 * a.h(n9, n10));
                n9 = c8.c * c8.e * 8 / n9;
                this.h = new q.b().o0("audio/raw").M(n9).j0(n9).f0(a.h(n8, n10)).N(c8.b).p0(c8.c).i0(2).K();
                return;
            }
            object = new StringBuilder();
            object.append("Expected frames per block: ");
            object.append(n11);
            object.append("; got: ");
            object.append(n9);
            throw A.a(object.toString(), null);
        }

        public static int h(int n8, int n9) {
            return n8 * 2 * n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        @Override
        public boolean a(s var1_1, long var2_2) {
            block4 : {
                var4_3 = M.k(this.g - this.f(this.k), this.d) * this.c.e;
                if (var2_2 == 0L) break block4;
                var6_5 = false;
                ** GOTO lbl8
            }
            block0 : do {
                var6_5 = true;
lbl8: // 3 sources:
                while (!var6_5 && (var5_4 = this.i) < var4_3) {
                    var5_4 = (int)Math.min((long)(var4_3 - var5_4), (long)var2_2);
                    if ((var5_4 = var1_1.read(this.e, this.i, var5_4)) == -1) continue block0;
                    this.i += var5_4;
                }
                break;
            } while (true);
            var4_3 = this.i / this.c.e;
            if (var4_3 > 0) {
                this.d(this.e, var4_3, this.f);
                this.i -= var4_3 * this.c.e;
                var4_3 = this.f.g();
                this.b.e(this.f, var4_3);
                this.k = var4_3 = this.k + var4_3;
                var4_3 = this.f(var4_3);
                var5_4 = this.g;
                if (var4_3 >= var5_4) {
                    this.i(var5_4);
                }
                if (var6_5 == false) return var6_5;
            }
            if ((var4_3 = this.f(this.k)) <= 0) return var6_5;
            this.i(var4_3);
            return var6_5;
        }

        @Override
        public void b(int n8, long l8) {
            this.a.e(new e(this.c, this.d, n8, l8));
            this.b.d(this.h);
        }

        @Override
        public void c(long l8) {
            this.i = 0;
            this.j = l8;
            this.k = 0;
            this.l = 0L;
        }

        public final void d(byte[] arrby, int n8, z z8) {
            for (int i8 = 0; i8 < n8; ++i8) {
                for (int i9 = 0; i9 < this.c.b; ++i9) {
                    this.e(arrby, i8, i9, z8.e());
                }
            }
            n8 = this.g(this.d * n8);
            z8.T(0);
            z8.S(n8);
        }

        public final void e(byte[] arrby, int n8, int n9, byte[] arrby2) {
            int[] arrn = this.c;
            int n10 = arrn.e;
            int n11 = arrn.b;
            int n12 = n8 * n10 + n9 * 4;
            int n13 = n10 / n11;
            int n14 = (arrby[n12 + 1] & 255) << 8 | arrby[n12] & 255;
            int n15 = Math.min((int)(arrby[n12 + 2] & 255), (int)88);
            int n16 = n[n15];
            n10 = (n8 * this.d * n11 + n9) * 2;
            arrby2[n10] = (byte)(n14 & 255);
            arrby2[n10 + 1] = (byte)(n14 >> 8);
            n9 = n15;
            for (n8 = 0; n8 < (n13 - 4) * 2; ++n8) {
                int n17;
                n15 = arrby[n8 / 8 * n11 * 4 + (n11 * 4 + n12) + n8 / 2 % 4];
                n15 = n8 % 2 == 0 ? (n15 &= 15) : (n15 & 255) >> 4;
                n16 = n17 = ((n15 & 7) * 2 + 1) * n16 >> 3;
                if ((n15 & 8) != 0) {
                    n16 = - n17;
                }
                n14 = M.p(n14 + n16, -32768, 32767);
                arrby2[n10 += n11 * 2] = (byte)(n14 & 255);
                arrby2[n10 + 1] = (byte)(n14 >> 8);
                n16 = m[n15];
                arrn = n;
                n9 = M.p(n9 + n16, 0, arrn.length - 1);
                n16 = arrn[n9];
            }
        }

        public final int f(int n8) {
            return n8 / (this.c.b * 2);
        }

        public final int g(int n8) {
            return a.h(n8, this.c.b);
        }

        public final void i(int n8) {
            long l8 = this.j;
            long l9 = M.W0(this.l, 1000000L, this.c.c);
            int n9 = this.g(n8);
            int n10 = this.k;
            this.b.b(l8 + l9, 1, n9, n10 - n9, null);
            this.l += (long)n8;
            this.k -= n9;
        }
    }

    public static interface b {
        public boolean a(s var1, long var2);

        public void b(int var1, long var2);

        public void c(long var1);
    }

    public static final class c
    implements b {
        public final t a;
        public final T b;
        public final m1.c c;
        public final q d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(t t8, T t9, m1.c c8, String string2, int n8) {
            this.a = t8;
            this.b = t9;
            this.c = c8;
            int n9 = c8.b * c8.f / 8;
            if (c8.e == n9) {
                int n10 = c8.c;
                int n11 = n10 * n9 * 8;
                this.e = n9 = Math.max((int)n9, (int)(n10 * n9 / 10));
                this.d = new q.b().o0(string2).M(n11).j0(n11).f0(n9).N(c8.b).p0(c8.c).i0(n8).K();
                return;
            }
            t8 = new StringBuilder();
            t8.append("Expected block size: ");
            t8.append(n9);
            t8.append("; got: ");
            t8.append(c8.e);
            throw A.a(t8.toString(), null);
        }

        @Override
        public boolean a(s object, long l8) {
            int n8;
            int n9;
            long l9;
            while ((l9 = (l8 LCMP 0L)) > 0 && (n8 = this.g) < (n9 = this.e)) {
                l9 = (int)Math.min((long)(n9 - n8), (long)l8);
                if ((l9 = (long)this.b.f((i)object, (int)l9, true)) == -1) {
                    l8 = 0L;
                    continue;
                }
                this.g += l9;
                l8 -= (long)l9;
            }
            object = this.c;
            n9 = object.e;
            n8 = this.g / n9;
            if (n8 > 0) {
                l8 = this.f;
                long l10 = M.W0(this.h, 1000000L, object.c);
                n9 = n8 * n9;
                int n10 = this.g - n9;
                this.b.b(l8 + l10, 1, n9, n10, null);
                this.h += (long)n8;
                this.g = n10;
            }
            if (l9 <= 0) {
                return true;
            }
            return false;
        }

        @Override
        public void b(int n8, long l8) {
            this.a.e(new e(this.c, 1, n8, l8));
            this.b.d(this.d);
        }

        @Override
        public void c(long l8) {
            this.f = l8;
            this.g = 0;
            this.h = 0L;
        }
    }

}

