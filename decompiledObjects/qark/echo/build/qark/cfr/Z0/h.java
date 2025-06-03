/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 *  java.util.UUID
 */
package Z0;

import F0.E;
import F0.L;
import F0.M;
import F0.Q;
import F0.T;
import F0.x;
import Q0.c;
import Z0.a;
import Z0.d;
import Z0.f;
import Z0.g;
import Z0.o;
import Z0.r;
import Z0.s;
import Z0.t;
import Z0.u;
import Z0.v;
import android.util.Pair;
import android.util.SparseArray;
import c1.t;
import d0.A;
import d0.m;
import d0.q;
import g0.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class h
implements F0.r {
    public static final x K = new f();
    public static final byte[] L = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final q M = new q.b().o0("application/x-emsg").K();
    public long A;
    public b B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public F0.t G;
    public T[] H;
    public T[] I;
    public boolean J;
    public final t.a a;
    public final int b;
    public final s c;
    public final List d;
    public final SparseArray e;
    public final z f;
    public final z g;
    public final z h;
    public final byte[] i;
    public final z j;
    public final g0.E k;
    public final c l;
    public final z m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public final T p;
    public X2.v q;
    public int r;
    public int s;
    public long t;
    public int u;
    public z v;
    public long w;
    public int x;
    public long y;
    public long z;

    public h(t.a a8, int n8) {
        this(a8, n8, null, null, X2.v.Y(), null);
    }

    public h(t.a arrby, int n8, g0.E e8, s s8, List list, T t8) {
        this.a = arrby;
        this.b = n8;
        this.k = e8;
        this.c = s8;
        this.d = Collections.unmodifiableList((List)list);
        this.p = t8;
        this.l = new c();
        this.m = new z(16);
        this.f = new z(h0.d.a);
        this.g = new z(5);
        this.h = new z();
        arrby = new byte[16];
        this.i = arrby;
        this.j = new z(arrby);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        this.q = X2.v.Y();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.G = F0.t.a;
        this.H = new T[0];
        this.I = new T[0];
    }

    public static void A(t arrbl, z z8, u u8) {
        int n8 = arrbl.d;
        z8.T(8);
        int n9 = Z0.a.b(z8.p());
        boolean bl = true;
        if ((n9 & 1) == 1) {
            z8.U(8);
        }
        n9 = z8.G();
        int n10 = z8.K();
        if (n10 <= u8.f) {
            int n11;
            if (n9 == 0) {
                int n12;
                arrbl = u8.m;
                n9 = n12 = 0;
                do {
                    n11 = n9;
                    if (n12 < n10) {
                        n11 = z8.G();
                        n9 += n11;
                        bl = n11 > n8;
                        arrbl[n12] = bl;
                        ++n12;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                if (n9 <= n8) {
                    bl = false;
                }
                n11 = n9 * n10;
                Arrays.fill((boolean[])u8.m, (int)0, (int)n10, (boolean)bl);
            }
            Arrays.fill((boolean[])u8.m, (int)n10, (int)u8.f, (boolean)false);
            if (n11 > 0) {
                u8.d(n11);
            }
            return;
        }
        arrbl = new StringBuilder();
        arrbl.append("Saiz sample count ");
        arrbl.append(n10);
        arrbl.append(" is greater than fragment sample count");
        arrbl.append(u8.f);
        throw A.a(arrbl.toString(), null);
    }

    public static void B(a.a arrby, String string2, u u8) {
        int n8;
        int n9;
        Object var12_3 = null;
        byte[] arrby2 = null;
        z z8 = arrby2;
        for (n8 = 0; n8 < arrby.c.size(); ++n8) {
            z z9;
            Object object = (a.b)arrby.c.get(n8);
            z z10 = object.b;
            n9 = object.a;
            if (n9 == 1935828848) {
                z10.T(12);
                object = arrby2;
                z9 = z8;
                if (z10.p() == 1936025959) {
                    object = z10;
                    z9 = z8;
                }
            } else {
                object = arrby2;
                z9 = z8;
                if (n9 == 1936158820) {
                    z10.T(12);
                    object = arrby2;
                    z9 = z8;
                    if (z10.p() == 1936025959) {
                        z9 = z10;
                        object = arrby2;
                    }
                }
            }
            arrby2 = object;
            z8 = z9;
        }
        if (arrby2 != null) {
            if (z8 == null) {
                return;
            }
            arrby2.T(8);
            n8 = Z0.a.c(arrby2.p());
            arrby2.U(4);
            if (n8 == 1) {
                arrby2.U(4);
            }
            if (arrby2.p() == 1) {
                z8.T(8);
                n8 = Z0.a.c(z8.p());
                z8.U(4);
                if (n8 == 1) {
                    if (z8.I() == 0L) {
                        throw A.d("Variable length description in sgpd found (unsupported)");
                    }
                } else if (n8 >= 2) {
                    z8.U(4);
                }
                if (z8.I() == 1L) {
                    z8.U(1);
                    n8 = z8.G();
                    boolean bl = z8.G() == 1;
                    if (!bl) {
                        return;
                    }
                    n9 = z8.G();
                    arrby2 = new byte[16];
                    z8.l(arrby2, 0, 16);
                    arrby = var12_3;
                    if (n9 == 0) {
                        int n10 = z8.G();
                        arrby = new byte[n10];
                        z8.l(arrby, 0, n10);
                    }
                    u8.l = true;
                    u8.n = new t(bl, string2, n9, arrby2, (n8 & 240) >> 4, n8 & 15, arrby);
                    return;
                }
                throw A.d("Entry count in sgpd != 1 (unsupported).");
            }
            throw A.d("Entry count in sbgp != 1 (unsupported).");
        }
    }

    public static void C(z z8, int n8, u u8) {
        z8.T(n8 + 8);
        n8 = Z0.a.b(z8.p());
        if ((n8 & 1) == 0) {
            boolean bl = (n8 & 2) != 0;
            n8 = z8.K();
            if (n8 == 0) {
                Arrays.fill((boolean[])u8.m, (int)0, (int)u8.f, (boolean)false);
                return;
            }
            if (n8 == u8.f) {
                Arrays.fill((boolean[])u8.m, (int)0, (int)n8, (boolean)bl);
                u8.d(z8.a());
                u8.b(z8);
                return;
            }
            z8 = new StringBuilder();
            z8.append("Senc sample count ");
            z8.append(n8);
            z8.append(" is different from fragment sample count");
            z8.append(u8.f);
            throw A.a(z8.toString(), null);
        }
        throw A.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static void D(z z8, u u8) {
        h.C(z8, 0, u8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Pair E(z z8, long l8) {
        long l9;
        long l10;
        z8.T(8);
        int n8 = Z0.a.c(z8.p());
        z8.U(4);
        long l11 = z8.I();
        if (n8 == 0) {
            l9 = z8.I();
            l10 = z8.I();
        } else {
            l9 = z8.L();
            l10 = z8.L();
        }
        l8 += l10;
        long l12 = g0.M.W0(l9, 1000000L, l11);
        z8.U(2);
        n8 = z8.M();
        int[] arrn = new int[n8];
        long[] arrl = new long[n8];
        long[] arrl2 = new long[n8];
        long[] arrl3 = new long[n8];
        l10 = l12;
        int n9 = 0;
        while (n9 < n8) {
            int n10 = z8.p();
            if ((n10 & Integer.MIN_VALUE) != 0) {
                throw A.a("Unhandled indirect reference", null);
            }
            long l13 = z8.I();
            arrn[n9] = n10 & Integer.MAX_VALUE;
            arrl[n9] = l8;
            arrl3[n9] = l10;
            l10 = g0.M.W0(l9 += l13, 1000000L, l11);
            arrl2[n9] = l10 - arrl3[n9];
            z8.U(4);
            l8 += (long)arrn[n9];
            ++n9;
        }
        return Pair.create((Object)l12, (Object)new F0.h(arrn, arrl, arrl2, arrl3));
    }

    public static long F(z z8) {
        z8.T(8);
        if (Z0.a.c(z8.p()) == 1) {
            return z8.L();
        }
        return z8.I();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b G(z z8, SparseArray object, boolean bl) {
        Object object2;
        z8.T(8);
        int n8 = Z0.a.b(z8.p());
        int n9 = z8.p();
        object = bl ? object.valueAt(0) : object.get(n9);
        object = (b)object;
        if (object == null) {
            return null;
        }
        if ((n8 & 1) != 0) {
            long l8 = z8.L();
            object2 = object.b;
            object2.c = l8;
            object2.d = l8;
        }
        object2 = object.e;
        n9 = (n8 & 2) != 0 ? z8.p() - 1 : object2.a;
        int n10 = (n8 & 8) != 0 ? z8.p() : object2.b;
        int n11 = (n8 & 16) != 0 ? z8.p() : object2.c;
        n8 = (n8 & 32) != 0 ? z8.p() : object2.d;
        object.b.a = new d(n9, n10, n11, n8);
        return object;
    }

    public static void H(a.a a8, SparseArray object, boolean bl, int n8, byte[] arrby) {
        if ((object = h.G(((a.b)g0.a.e((Object)a8.g((int)1952868452))).b, (SparseArray)object, bl)) == null) {
            return;
        }
        u u8 = object.b;
        long l8 = u8.q;
        bl = u8.r;
        object.k();
        ((b)object).l = true;
        a.b b8 = a8.g(1952867444);
        if (b8 != null && (n8 & 2) == 0) {
            u8.q = h.F(b8.b);
            u8.r = true;
        } else {
            u8.q = l8;
            u8.r = bl;
        }
        h.K(a8, (b)object, n8);
        object = object.d.a.a(((d)g0.a.e((Object)u8.a)).a);
        b8 = a8.g(1935763834);
        if (b8 != null) {
            h.A((t)g0.a.e(object), b8.b, u8);
        }
        if ((b8 = a8.g(1935763823)) != null) {
            h.z(b8.b, u8);
        }
        if ((b8 = a8.g(1936027235)) != null) {
            h.D(b8.b, u8);
        }
        object = object != null ? object.b : null;
        h.B(a8, (String)object, u8);
        int n9 = a8.c.size();
        for (n8 = 0; n8 < n9; ++n8) {
            object = (a.b)a8.c.get(n8);
            if (object.a != 1970628964) continue;
            h.L(object.b, u8, arrby);
        }
    }

    public static Pair I(z z8) {
        z8.T(12);
        return Pair.create((Object)z8.p(), (Object)new d(z8.p() - 1, z8.p(), z8.p(), z8.p()));
    }

    public static int J(b b8, int n8, int n9, z z8, int n10) {
        long l8;
        Object object = b8;
        z8.T(8);
        int n11 = Z0.a.b(z8.p());
        s s8 = object.d.a;
        object = object.b;
        d d8 = (d)g0.M.i(object.a);
        object.h[n8] = z8.K();
        long[] arrl = object.g;
        arrl[n8] = l8 = object.c;
        if ((n11 & 1) != 0) {
            arrl[n8] = l8 + (long)z8.p();
        }
        boolean bl = (n11 & 4) != 0;
        int n12 = d8.d;
        if (bl) {
            n12 = z8.p();
        }
        boolean bl2 = (n11 & 256) != 0;
        boolean bl3 = (n11 & 512) != 0;
        boolean bl4 = (n11 & 1024) != 0;
        n11 = (n11 & 2048) != 0 ? 1 : 0;
        l8 = h.o(s8) ? ((long[])g0.M.i(s8.i))[0] : 0L;
        arrl = object.i;
        long[] arrl2 = object.j;
        boolean[] arrbl = object.k;
        n9 = s8.b == 2 && (n9 & 1) != 0 ? 1 : 0;
        int n13 = n10 + object.h[n8];
        long l9 = s8.c;
        long l10 = object.q;
        while (n10 < n13) {
            long l11;
            n8 = bl2 ? z8.p() : d8.b;
            int n14 = h.f(n8);
            n8 = bl3 ? z8.p() : d8.c;
            int n15 = h.f(n8);
            n8 = bl4 ? z8.p() : (n10 == 0 && bl ? n12 : d8.d);
            int n16 = n11 != 0 ? z8.p() : 0;
            arrl2[n10] = l11 = g0.M.W0((long)n16 + l10 - l8, 1000000L, l9);
            if (!object.r) {
                arrl2[n10] = l11 + b8.d.h;
            }
            arrl[n10] = n15;
            boolean bl5 = (n8 >> 16 & 1) == 0 && (n9 == 0 || n10 == 0);
            arrbl[n10] = bl5;
            l10 += (long)n14;
            ++n10;
        }
        object.q = l10;
        return n13;
    }

    public static void K(a.a a8, b b8, int n8) {
        int n9;
        int n10;
        Object object;
        int n11;
        a8 = a8.c;
        int n12 = a8.size();
        int n13 = 0;
        int n14 = n9 = (n10 = 0);
        int n15 = n9;
        for (n9 = n10; n9 < n12; ++n9) {
            object = (a.b)a8.get(n9);
            n11 = n15;
            n10 = n14;
            if (object.a == 1953658222) {
                object = object.b;
                object.T(12);
                int n16 = object.K();
                n11 = n15;
                n10 = n14;
                if (n16 > 0) {
                    n10 = n14 + n16;
                    n11 = n15 + 1;
                }
            }
            n15 = n11;
            n14 = n10;
        }
        b8.h = 0;
        b8.g = 0;
        b8.f = 0;
        b8.b.e(n15, n14);
        n14 = n15 = 0;
        for (n9 = n13; n9 < n12; ++n9) {
            object = (a.b)a8.get(n9);
            n11 = n15;
            n10 = n14;
            if (object.a == 1953658222) {
                n10 = h.J(b8, n15, n8, object.b, n14);
                n11 = n15 + 1;
            }
            n15 = n11;
            n14 = n10;
        }
    }

    public static void L(z z8, u u8, byte[] arrby) {
        z8.T(8);
        z8.l(arrby, 0, 16);
        if (!Arrays.equals((byte[])arrby, (byte[])L)) {
            return;
        }
        h.C(z8, 16, u8);
    }

    private void M(long l8) {
        while (!this.n.isEmpty() && ((a.a)this.n.peek()).b == l8) {
            this.r((a.a)this.n.pop());
        }
        this.h();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(F0.s object) {
        long l8;
        block21 : {
            block20 : {
                long l9;
                block19 : {
                    if (this.u == 0) {
                        if (!object.d(this.m.e(), 0, 8, true)) {
                            return false;
                        }
                        this.u = 8;
                        this.m.T(0);
                        this.t = this.m.I();
                        this.s = this.m.p();
                    }
                    if ((l8 = this.t) != 1L) break block19;
                    object.readFully(this.m.e(), 8, 8);
                    this.u += 8;
                    l8 = this.m.L();
                    break block20;
                }
                if (l8 != 0L) break block21;
                l8 = l9 = object.a();
                if (l9 == -1L) {
                    l8 = l9;
                    if (!this.n.isEmpty()) {
                        l8 = ((a.a)this.n.peek()).b;
                    }
                }
                if (l8 == -1L) break block21;
                l8 = l8 - object.p() + (long)this.u;
            }
            this.t = l8;
        }
        if (this.t < (long)this.u) {
            throw A.d("Atom size less than header length (unsupported).");
        }
        l8 = object.p() - (long)this.u;
        int n8 = this.s;
        if (!(n8 != 1836019558 && n8 != 1835295092 || this.J)) {
            this.G.e(new M.b(this.z, l8));
            this.J = true;
        }
        if (this.s == 1836019558) {
            int n9 = this.e.size();
            for (n8 = 0; n8 < n9; ++n8) {
                u u8 = ((b)this.e.valueAt((int)n8)).b;
                u8.b = l8;
                u8.d = l8;
                u8.c = l8;
            }
        }
        if ((n8 = this.s) == 1835295092) {
            this.B = null;
            this.w = l8 + this.t;
            this.r = 2;
            return true;
        }
        if (h.R(n8)) {
            l8 = object.p() + this.t - 8L;
            this.n.push((Object)new a.a(this.s, l8));
            if (this.t == (long)this.u) {
                this.M(l8);
                return true;
            }
            this.h();
            return true;
        }
        if (h.S(this.s)) {
            if (this.u != 8) {
                throw A.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.t > Integer.MAX_VALUE) {
                throw A.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            object = new z((int)this.t);
            System.arraycopy((Object)this.m.e(), (int)0, (Object)object.e(), (int)0, (int)8);
            this.v = object;
        } else {
            if (this.t > Integer.MAX_VALUE) {
                throw A.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.v = null;
        }
        this.r = 1;
        return true;
    }

    private static boolean R(int n8) {
        if (n8 != 1836019574 && n8 != 1953653099 && n8 != 1835297121 && n8 != 1835626086 && n8 != 1937007212 && n8 != 1836019558 && n8 != 1953653094 && n8 != 1836475768 && n8 != 1701082227) {
            return false;
        }
        return true;
    }

    private static boolean S(int n8) {
        if (n8 != 1751411826 && n8 != 1835296868 && n8 != 1836476516 && n8 != 1936286840 && n8 != 1937011556 && n8 != 1937011827 && n8 != 1668576371 && n8 != 1937011555 && n8 != 1937011578 && n8 != 1937013298 && n8 != 1937007471 && n8 != 1668232756 && n8 != 1937011571 && n8 != 1952867444 && n8 != 1952868452 && n8 != 1953196132 && n8 != 1953654136 && n8 != 1953658222 && n8 != 1886614376 && n8 != 1935763834 && n8 != 1935763823 && n8 != 1936027235 && n8 != 1970628964 && n8 != 1935828848 && n8 != 1936158820 && n8 != 1701606260 && n8 != 1835362404 && n8 != 1701671783) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ F0.r[] c() {
        return h.p();
    }

    public static int f(int n8) {
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected negative value: ");
        stringBuilder.append(n8);
        throw A.a(stringBuilder.toString(), null);
    }

    private void h() {
        this.r = 0;
        this.u = 0;
    }

    public static m k(List list) {
        int n8 = list.size();
        byte[] arrby = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            a.b b8 = (a.b)list.get(i8);
            byte[] arrby2 = arrby;
            if (b8.a == 1886614376) {
                arrby2 = arrby;
                if (arrby == null) {
                    arrby2 = new byte[]();
                }
                if ((b8 = o.f(arrby = b8.b.e())) == null) {
                    g0.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrby2.add((Object)new m.b((UUID)b8, "video/mp4", arrby));
                }
            }
            arrby = arrby2;
        }
        if (arrby == null) {
            return null;
        }
        return new m((List)arrby);
    }

    public static b l(SparseArray sparseArray) {
        int n8 = sparseArray.size();
        b b8 = null;
        long l8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < n8; ++i8) {
            long l9;
            b b9;
            block8 : {
                b b10;
                block7 : {
                    b10 = (b)sparseArray.valueAt(i8);
                    if (b10.l) break block7;
                    b9 = b8;
                    l9 = l8;
                    if (b10.f == b10.d.b) break block8;
                }
                if (b10.l && b10.h == b10.b.e) {
                    b9 = b8;
                    l9 = l8;
                } else {
                    long l10 = b10.d();
                    b9 = b8;
                    l9 = l8;
                    if (l10 < l8) {
                        b9 = b10;
                        l9 = l10;
                    }
                }
            }
            b8 = b9;
            l8 = l9;
        }
        return b8;
    }

    public static boolean o(s s8) {
        boolean bl;
        long[] arrl = s8.h;
        boolean bl2 = bl = false;
        if (arrl != null) {
            bl2 = bl;
            if (arrl.length == 1) {
                long[] arrl2 = s8.i;
                if (arrl2 == null) {
                    return false;
                }
                long l8 = arrl[0];
                if (l8 == 0L) {
                    return true;
                }
                bl2 = bl;
                if (g0.M.W0(l8 + arrl2[0], 1000000L, s8.d) >= s8.e) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    private static /* synthetic */ F0.r[] p() {
        return new F0.r[]{new h(t.a.a, 32)};
    }

    public static long x(z z8) {
        z8.T(8);
        if (Z0.a.c(z8.p()) == 0) {
            return z8.I();
        }
        return z8.L();
    }

    public static void y(a.a a8, SparseArray sparseArray, boolean bl, int n8, byte[] arrby) {
        int n9 = a8.d.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            a.a a9 = (a.a)a8.d.get(i8);
            if (a9.a != 1953653094) continue;
            h.H(a9, sparseArray, bl, n8, arrby);
        }
    }

    public static void z(z z8, u u8) {
        int n8;
        z8.T(8);
        int n9 = z8.p();
        if ((Z0.a.b(n9) & 1) == 1) {
            z8.U(8);
        }
        if ((n8 = z8.K()) == 1) {
            n9 = Z0.a.c(n9);
            long l8 = u8.d;
            long l9 = n9 == 0 ? z8.I() : z8.L();
            u8.d = l8 + l9;
            return;
        }
        z8 = new StringBuilder();
        z8.append("Unexpected saio entry count: ");
        z8.append(n8);
        throw A.a(z8.toString(), null);
    }

    public final void O(F0.s s8) {
        int n8 = (int)this.t - this.u;
        z z8 = this.v;
        if (z8 != null) {
            s8.readFully(z8.e(), 8, n8);
            this.t(new a.b(this.s, z8), s8.p());
        } else {
            s8.i(n8);
        }
        this.M(s8.p());
    }

    public final void P(F0.s s8) {
        int n8;
        int n9 = this.e.size();
        long l8 = Long.MAX_VALUE;
        b b8 = null;
        for (n8 = 0; n8 < n9; ++n8) {
            u u8 = ((b)this.e.valueAt((int)n8)).b;
            long l9 = l8;
            b b9 = b8;
            if (u8.p) {
                long l10 = u8.d;
                l9 = l8;
                b9 = b8;
                if (l10 < l8) {
                    b9 = (b)this.e.valueAt(n8);
                    l9 = l10;
                }
            }
            l8 = l9;
            b8 = b9;
        }
        if (b8 == null) {
            this.r = 3;
            return;
        }
        n8 = (int)(l8 - s8.p());
        if (n8 >= 0) {
            s8.i(n8);
            b8.b.a(s8);
            return;
        }
        throw A.a("Offset to encryption data was negative.", null);
    }

    public final boolean Q(F0.s s8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void a(long l8, long l9) {
        int n8 = this.e.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((b)this.e.valueAt(i8)).k();
        }
        this.o.clear();
        this.x = 0;
        this.y = l9;
        this.n.clear();
        this.h();
    }

    @Override
    public void b(F0.t object) {
        Object object2 = (this.b & 32) == 0 ? new c1.v((F0.t)object, this.a) : object;
        this.G = object2;
        this.h();
        this.n();
        object2 = this.c;
        if (object2 != null) {
            object = new b(object.a(0, object2.b), new v(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0));
            this.e.put(0, object);
            this.G.j();
        }
    }

    @Override
    public /* synthetic */ F0.r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(F0.s object) {
        Q q8 = r.b((F0.s)object);
        object = q8 != null ? X2.v.Z(q8) : X2.v.Y();
        this.q = object;
        if (q8 == null) {
            return true;
        }
        return false;
    }

    @Override
    public int i(F0.s s8, L l8) {
        do {
            int n8;
            if ((n8 = this.r) != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (!this.Q(s8)) continue;
                        return 0;
                    }
                    this.P(s8);
                    continue;
                }
                this.O(s8);
                continue;
            }
            if (!this.N(s8)) break;
        } while (true);
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final d j(SparseArray object, int n8) {
        if (object.size() == 1) {
            object = object.valueAt(0);
            do {
                return (d)object;
                break;
            } while (true);
        }
        object = g0.a.e((d)object.get(n8));
        return (d)object;
    }

    public X2.v m() {
        return this.q;
    }

    public final void n() {
        int n8;
        Object object = new T[2];
        this.H = object;
        T t8 = this.p;
        int n9 = 0;
        if (t8 != null) {
            object[0] = t8;
            n8 = 1;
        } else {
            n8 = 0;
        }
        int n10 = this.b;
        int n11 = 100;
        int n12 = n8;
        if ((n10 & 4) != 0) {
            object[n8] = this.G.a(100, 5);
            n11 = 101;
            n12 = n8 + 1;
        }
        object = (T[])g0.M.O0(this.H, n12);
        this.H = object;
        n12 = object.length;
        for (n8 = 0; n8 < n12; ++n8) {
            object[n8].d(M);
        }
        this.I = new T[this.d.size()];
        n8 = n9;
        while (n8 < this.I.length) {
            object = this.G.a(n11, 3);
            object.d((q)this.d.get(n8));
            this.I[n8] = object;
            ++n8;
            ++n11;
        }
    }

    public s q(s s8) {
        return s8;
    }

    public final void r(a.a a8) {
        int n8 = a8.a;
        if (n8 == 1836019574) {
            this.v(a8);
            return;
        }
        if (n8 == 1836019558) {
            this.u(a8);
            return;
        }
        if (!this.n.isEmpty()) {
            ((a.a)this.n.peek()).d(a8);
        }
    }

    @Override
    public void release() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void s(z object) {
        int n8;
        long l8;
        long l9;
        int n9;
        int n10;
        block15 : {
            block12 : {
                Object object2;
                block14 : {
                    block13 : {
                        block11 : {
                            long l10;
                            long l11;
                            void var15_9;
                            if (this.H.length == 0) {
                                return;
                            }
                            object.T(8);
                            n9 = Z0.a.c(object.p());
                            if (n9 != 0) {
                                if (n9 != 1) {
                                    object = new StringBuilder();
                                    object.append("Skipping unsupported emsg version: ");
                                    object.append(n9);
                                    g0.o.h("FragmentedMp4Extractor", object.toString());
                                    return;
                                }
                                l8 = object.I();
                                l9 = g0.M.W0(object.L(), 1000000L, l8);
                                l8 = g0.M.W0(object.I(), 1000L, l8);
                                l10 = object.I();
                                object2 = (String)g0.a.e(object.A());
                                String string2 = (String)g0.a.e(object.A());
                                l11 = -9223372036854775807L;
                            } else {
                                object2 = (T[])g0.a.e(object.A());
                                String string3 = (String)g0.a.e(object.A());
                                l8 = object.I();
                                l11 = g0.M.W0(object.I(), 1000000L, l8);
                                l9 = this.A;
                                l9 = l9 != -9223372036854775807L ? (l9 += l11) : -9223372036854775807L;
                                l8 = g0.M.W0(object.I(), 1000L, l8);
                                l10 = object.I();
                            }
                            byte[] arrby = new byte[object.a()];
                            n9 = object.a();
                            n8 = 0;
                            object.l(arrby, 0, n9);
                            object = new Q0.a((String)object2, (String)var15_9, l8, l10, arrby);
                            object = new z(this.l.a((Q0.a)object));
                            n10 = object.a();
                            for (T t8 : this.H) {
                                object.T(0);
                                t8.e((z)object, n10);
                            }
                            if (l9 != -9223372036854775807L) break block11;
                            this.o.addLast((Object)new a(l11, true, n10));
                            break block12;
                        }
                        if (this.o.isEmpty()) break block13;
                        object = this.o;
                        object2 = new a(l9, false, n10);
                        break block14;
                    }
                    object = this.k;
                    if (object == null || object.g()) break block15;
                    object = this.o;
                    object2 = new a(l9, false, n10);
                }
                object.addLast(object2);
            }
            this.x += n10;
            return;
        }
        object = this.k;
        l8 = l9;
        if (object != null) {
            l8 = object.a(l9);
        }
        object = this.H;
        int n11 = object.length;
        n9 = n8;
        while (n9 < n11) {
            object[n9].b(l8, 1, n10, 0, null);
            ++n9;
        }
        return;
    }

    public final void t(a.b b8, long l8) {
        if (!this.n.isEmpty()) {
            ((a.a)this.n.peek()).e(b8);
            return;
        }
        int n8 = b8.a;
        if (n8 == 1936286840) {
            b8 = h.E(b8.b, l8);
            this.A = (Long)b8.first;
            this.G.e((M)b8.second);
            this.J = true;
            return;
        }
        if (n8 == 1701671783) {
            this.s(b8.b);
        }
    }

    public final void u(a.a object) {
        int n8;
        int n9;
        SparseArray sparseArray = this.e;
        s s8 = this.c;
        int n10 = 0;
        boolean bl = s8 != null;
        h.y((a.a)object, sparseArray, bl, this.b, this.i);
        object = h.k(object.c);
        if (object != null) {
            n9 = this.e.size();
            for (n8 = 0; n8 < n9; ++n8) {
                ((b)this.e.valueAt(n8)).n((m)object);
            }
        }
        if (this.y != -9223372036854775807L) {
            n9 = this.e.size();
            for (n8 = n10; n8 < n9; ++n8) {
                ((b)this.e.valueAt(n8)).l(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }

    public final void v(a.a a8) {
        int n8;
        s s8 = this.c;
        int n9 = 0;
        int n10 = 0;
        boolean bl = true;
        boolean bl2 = s8 == null;
        g0.a.g(bl2, "Unexpected moov box.");
        Object object = h.k(a8.c);
        Object object2 = (a.a)g0.a.e(a8.f(1836475768));
        s8 = new SparseArray();
        int n11 = object2.c.size();
        long l8 = -9223372036854775807L;
        for (n8 = 0; n8 < n11; ++n8) {
            a.b b8 = (a.b)object2.c.get(n8);
            int n12 = b8.a;
            if (n12 == 1953654136) {
                b8 = h.I(b8.b);
                s8.put(((Integer)b8.first).intValue(), (Object)((d)b8.second));
                continue;
            }
            if (n12 != 1835362404) continue;
            l8 = h.x(b8.b);
        }
        object2 = new E();
        bl2 = (this.b & 16) != 0;
        a8 = Z0.b.B(a8, (E)object2, l8, (m)object, bl2, false, new g(this));
        n11 = a8.size();
        if (this.e.size() == 0) {
            for (n8 = n10; n8 < n11; ++n8) {
                object2 = (v)a8.get(n8);
                object = object2.a;
                object2 = new b(this.G.a(n8, object.b), (v)object2, this.j((SparseArray)s8, object.a));
                this.e.put(object.a, object2);
                this.z = Math.max((long)this.z, (long)object.e);
            }
            this.G.j();
            return;
        }
        bl2 = this.e.size() == n11 ? bl : false;
        g0.a.f(bl2);
        for (n8 = n9; n8 < n11; ++n8) {
            object = (v)a8.get(n8);
            object2 = object.a;
            ((b)this.e.get(object2.a)).j((v)object, this.j((SparseArray)s8, object2.a));
        }
    }

    public final void w(long l8) {
        while (!this.o.isEmpty()) {
            long l9;
            a a8 = (a)this.o.removeFirst();
            this.x -= a8.c;
            long l10 = l9 = a8.a;
            if (a8.b) {
                l10 = l9 + l8;
            }
            T[] arrt = this.k;
            l9 = l10;
            if (arrt != null) {
                l9 = arrt.a(l10);
            }
            arrt = this.H;
            int n8 = arrt.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrt[i8].b(l9, 1, a8.c, this.x, null);
            }
        }
    }

    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(long l8, boolean bl, int n8) {
            this.a = l8;
            this.b = bl;
            this.c = n8;
        }
    }

    public static final class b {
        public final T a;
        public final u b;
        public final z c;
        public v d;
        public d e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final z j;
        public final z k;
        public boolean l;

        public b(T t8, v v8, d d8) {
            this.a = t8;
            this.d = v8;
            this.e = d8;
            this.b = new u();
            this.c = new z();
            this.j = new z(1);
            this.k = new z();
            this.j(v8, d8);
        }

        public int c() {
            int n8 = !this.l ? this.d.g[this.f] : (this.b.k[this.f] ? 1 : 0);
            int n9 = n8;
            if (this.g() != null) {
                n9 = n8 | 1073741824;
            }
            return n9;
        }

        public long d() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public long e() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.c(this.f);
        }

        public int f() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        public t g() {
            boolean bl = this.l;
            t t8 = null;
            if (!bl) {
                return null;
            }
            int n8 = ((d)g0.M.i((Object)this.b.a)).a;
            t t9 = this.b.n;
            if (t9 == null) {
                t9 = this.d.a.a(n8);
            }
            t t10 = t8;
            if (t9 != null) {
                t10 = t8;
                if (t9.a) {
                    t10 = t9;
                }
            }
            return t10;
        }

        public boolean h() {
            int n8;
            ++this.f;
            if (!this.l) {
                return false;
            }
            this.g = n8 = this.g + 1;
            int[] arrn = this.b.h;
            int n9 = this.h;
            if (n8 == arrn[n9]) {
                this.h = n9 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }

        public int i(int n8, int n9) {
            Object object;
            Object object2 = this.g();
            if (object2 == null) {
                return 0;
            }
            int n10 = object2.d;
            if (n10 != 0) {
                object2 = this.b.o;
            } else {
                object = (byte[])g0.M.i(object2.e);
                this.k.R((byte[])object, object.length);
                object2 = this.k;
                n10 = object.length;
            }
            boolean bl = this.b.g(this.f);
            boolean bl2 = bl || n9 != 0;
            object = this.j.e();
            int n11 = bl2 ? 128 : 0;
            object[0] = (byte)(n11 | n10);
            this.j.T(0);
            this.a.a(this.j, 1, 1);
            this.a.a((z)object2, n10, 1);
            if (!bl2) {
                return n10 + 1;
            }
            if (!bl) {
                this.c.P(8);
                object2 = this.c.e();
                object2[0] = 0;
                object2[1] = 1;
                object2[2] = (byte)(n9 >> 8 & 255);
                object2[3] = (byte)(n9 & 255);
                object2[4] = (byte)(n8 >> 24 & 255);
                object2[5] = (byte)(n8 >> 16 & 255);
                object2[6] = (byte)(n8 >> 8 & 255);
                object2[7] = (byte)(n8 & 255);
                this.a.a(this.c, 8, 1);
                return n10 + 9;
            }
            object = this.b.o;
            n8 = object.M();
            object.U(-2);
            n8 = n8 * 6 + 2;
            object2 = object;
            if (n9 != 0) {
                this.c.P(n8);
                object2 = this.c.e();
                object.l((byte[])object2, 0, n8);
                n9 = ((object2[2] & 255) << 8 | object2[3] & 255) + n9;
                object2[2] = (byte)(n9 >> 8 & 255);
                object2[3] = (byte)(n9 & 255);
                object2 = this.c;
            }
            this.a.a((z)object2, n8, 1);
            return n10 + 1 + n8;
        }

        public void j(v v8, d d8) {
            this.d = v8;
            this.e = d8;
            this.a.d(v8.a.f);
            this.k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long l8) {
            int n8 = this.f;
            do {
                u u8 = this.b;
                if (n8 >= u8.f || u8.c(n8) > l8) break;
                if (this.b.k[n8]) {
                    this.i = n8;
                }
                ++n8;
            } while (true);
        }

        public void m() {
            t t8 = this.g();
            if (t8 == null) {
                return;
            }
            z z8 = this.b.o;
            int n8 = t8.d;
            if (n8 != 0) {
                z8.U(n8);
            }
            if (this.b.g(this.f)) {
                z8.U(z8.M() * 6);
            }
        }

        public void n(m object) {
            Object object2 = this.d.a.a(((d)g0.M.i((Object)this.b.a)).a);
            object2 = object2 != null ? object2.b : null;
            object = object.c((String)object2);
            object = this.d.a.f.a().U((m)object).K();
            this.a.d((q)object);
        }
    }

}

