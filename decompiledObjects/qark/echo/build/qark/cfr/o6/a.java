/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package o6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import o6.b;
import o6.c;
import o6.d;
import o6.e;
import x1.j;

public final class a
implements Comparable {
    public static final a p = new a(null);
    public static final long q = a.m(0L);
    public static final long r = c.b(0x3FFFFFFFFFFFFFFFL);
    public static final long s = c.b(-4611686018427387903L);
    public final long o;

    public /* synthetic */ a(long l8) {
        this.o = l8;
    }

    public static final int C(long l8) {
        if (a.S(l8)) {
            return 0;
        }
        return (int)(a.w(l8) % (long)60);
    }

    public static final d D(long l8) {
        if (a.M(l8)) {
            return d.p;
        }
        return d.r;
    }

    public static final long F(long l8) {
        return l8 >> 1;
    }

    public static int G(long l8) {
        return j.a(l8);
    }

    public static final boolean H(long l8) {
        return a.S(l8) ^ true;
    }

    public static final boolean K(long l8) {
        if (((int)l8 & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean M(long l8) {
        if (((int)l8 & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean S(long l8) {
        if (l8 != r && l8 != s) {
            return false;
        }
        return true;
    }

    public static final boolean T(long l8) {
        if (l8 < 0L) {
            return true;
        }
        return false;
    }

    public static final boolean U(long l8) {
        if (l8 > 0L) {
            return true;
        }
        return false;
    }

    public static final long V(long l8, long l9) {
        return a.W(l8, a.Z(l9));
    }

    public static final long W(long l8, long l9) {
        if (a.S(l8)) {
            if (!a.H(l9)) {
                if ((l9 ^ l8) >= 0L) {
                    return l8;
                }
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return l8;
        }
        if (a.S(l9)) {
            return l9;
        }
        if (((int)l8 & 1) == ((int)l9 & 1)) {
            l9 = a.F(l8) + a.F(l9);
            if (a.M(l8)) {
                return c.e(l9);
            }
            return c.c(l9);
        }
        if (a.K(l8)) {
            return a.c(l8, a.F(l8), a.F(l9));
        }
        return a.c(l8, a.F(l9), a.F(l8));
    }

    public static final long X(long l8, d d8) {
        Intrinsics.checkNotNullParameter((Object)d8, "unit");
        if (l8 == r) {
            return Long.MAX_VALUE;
        }
        if (l8 == s) {
            return Long.MIN_VALUE;
        }
        return e.a(a.F(l8), a.D(l8), d8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String Y(long l8) {
        int n8;
        StringBuilder stringBuilder;
        boolean bl;
        String string2;
        block19 : {
            int n9;
            block24 : {
                int n10;
                int n11;
                block22 : {
                    int n12;
                    int n13;
                    block20 : {
                        block23 : {
                            block21 : {
                                boolean bl2;
                                boolean bl3;
                                block18 : {
                                    int n14;
                                    block17 : {
                                        block16 : {
                                            int n15;
                                            block15 : {
                                                if (l8 == 0L) {
                                                    return "0s";
                                                }
                                                if (l8 == r) {
                                                    return "Infinity";
                                                }
                                                if (l8 == s) {
                                                    return "-Infinity";
                                                }
                                                bl = a.T(l8);
                                                stringBuilder = new StringBuilder();
                                                if (bl) {
                                                    stringBuilder.append('-');
                                                }
                                                long l9 = a.o(l8);
                                                long l10 = a.r(l9);
                                                n15 = a.p(l9);
                                                n14 = a.x(l9);
                                                n13 = a.C(l9);
                                                n12 = a.z(l9);
                                                n9 = 0;
                                                n10 = l10 != 0L ? 1 : 0;
                                                n11 = n15 != 0 ? 1 : 0;
                                                bl2 = n14 != 0;
                                                bl3 = n13 != 0 || n12 != 0;
                                                if (n10 != 0) {
                                                    stringBuilder.append(l10);
                                                    stringBuilder.append('d');
                                                    n9 = 1;
                                                }
                                                if (n11 != 0) break block15;
                                                n8 = n9;
                                                if (n10 == 0) break block16;
                                                if (bl2) break block15;
                                                n8 = n9;
                                                if (!bl3) break block16;
                                            }
                                            if (n9 > 0) {
                                                stringBuilder.append(' ');
                                            }
                                            stringBuilder.append(n15);
                                            stringBuilder.append('h');
                                            n8 = n9 + 1;
                                        }
                                        if (bl2) break block17;
                                        n9 = n8;
                                        if (!bl3) break block18;
                                        if (n11 != 0) break block17;
                                        n9 = n8;
                                        if (n10 == 0) break block18;
                                    }
                                    if (n8 > 0) {
                                        stringBuilder.append(' ');
                                    }
                                    stringBuilder.append(n14);
                                    stringBuilder.append('m');
                                    n9 = n8 + 1;
                                }
                                n8 = n9;
                                if (!bl3) break block19;
                                if (n9 > 0) {
                                    stringBuilder.append(' ');
                                }
                                if (n13 != 0 || n10 != 0 || n11 != 0 || bl2) break block20;
                                if (n12 < 1000000) break block21;
                                n8 = n12 / 1000000;
                                n10 = n12 % 1000000;
                                string2 = "ms";
                                n11 = 6;
                                break block22;
                            }
                            if (n12 < 1000) break block23;
                            n8 = n12 / 1000;
                            n10 = n12 % 1000;
                            string2 = "us";
                            n11 = 3;
                            break block22;
                        }
                        stringBuilder.append(n12);
                        stringBuilder.append("ns");
                        break block24;
                    }
                    n11 = 9;
                    n8 = n13;
                    n10 = n12;
                    string2 = "s";
                }
                a.e(l8, stringBuilder, n8, n10, n11, string2, false);
            }
            n8 = n9 + 1;
        }
        if (bl && n8 > 1) {
            stringBuilder.insert(1, '(').append(')');
        }
        string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final long Z(long l8) {
        return c.a(- a.F(l8), (int)l8 & 1);
    }

    public static final long c(long l8, long l9, long l10) {
        l8 = c.g(l10);
        if (-4611686018426L <= (l9 += l8) && l9 < 4611686018427L) {
            l8 = c.f(l8);
            return c.d(c.f(l9) + (l10 - l8));
        }
        return c.b(l6.d.e(l9, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void e(long l8, StringBuilder stringBuilder, int n8, int n9, int n10, String string2, boolean bl) {
        stringBuilder.append(n8);
        if (n9 != 0) {
            stringBuilder.append('.');
            String string3 = i.O(String.valueOf((int)n9), n10, '0');
            n8 = string3.length();
            n9 = -1;
            n10 = n8 - 1;
            n8 = n9;
            if (n10 >= 0) {
                n8 = n10;
                do {
                    n10 = n8 - 1;
                    if (string3.charAt(n8) != '0') break;
                    if (n10 < 0) {
                        n8 = n9;
                        break;
                    }
                    n8 = n10;
                } while (true);
            }
            n9 = n8 + 1;
            if (!bl && n9 < 3) {
                stringBuilder.append((CharSequence)string3, 0, n9);
            } else {
                stringBuilder.append((CharSequence)string3, 0, (n8 + 3) / 3 * 3);
            }
            Intrinsics.checkNotNullExpressionValue((Object)stringBuilder, "append(...)");
        }
        stringBuilder.append(string2);
    }

    public static final /* synthetic */ a h(long l8) {
        return new a(l8);
    }

    public static int l(long l8, long l9) {
        long l10 = l8 ^ l9;
        if (l10 >= 0L && ((int)l10 & 1) != 0) {
            int n8;
            int n9 = n8 = ((int)l8 & 1) - ((int)l9 & 1);
            if (a.T(l8)) {
                n9 = - n8;
            }
            return n9;
        }
        return Intrinsics.e(l8, l9);
    }

    public static long m(long l8) {
        if (b.a()) {
            if (a.M(l8)) {
                long l9 = a.F(l8);
                if (-4611686018426999999L <= l9 && l9 < 4611686018427000000L) {
                    return l8;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a.F(l8));
                stringBuilder.append(" ns is out of nanoseconds range");
                throw new AssertionError((Object)stringBuilder.toString());
            }
            long l10 = a.F(l8);
            if (-4611686018427387903L <= l10 && l10 < 0x4000000000000000L) {
                l10 = a.F(l8);
                if (-4611686018426L <= l10) {
                    if (l10 >= 4611686018427L) {
                        return l8;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.F(l8));
                    stringBuilder.append(" ms is denormalized");
                    throw new AssertionError((Object)stringBuilder.toString());
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a.F(l8));
                stringBuilder.append(" ms is out of milliseconds range");
                throw new AssertionError((Object)stringBuilder.toString());
            }
        }
        return l8;
    }

    public static boolean n(long l8, Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        if (l8 != ((a)object).a0()) {
            return false;
        }
        return true;
    }

    public static final long o(long l8) {
        long l9 = l8;
        if (a.T(l8)) {
            l9 = a.Z(l8);
        }
        return l9;
    }

    public static final int p(long l8) {
        if (a.S(l8)) {
            return 0;
        }
        return (int)(a.s(l8) % (long)24);
    }

    public static final long r(long l8) {
        return a.X(l8, d.v);
    }

    public static final long s(long l8) {
        return a.X(l8, d.u);
    }

    public static final long u(long l8) {
        return a.X(l8, d.t);
    }

    public static final long w(long l8) {
        return a.X(l8, d.s);
    }

    public static final int x(long l8) {
        if (a.S(l8)) {
            return 0;
        }
        return (int)(a.u(l8) % (long)60);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int z(long l8) {
        if (a.S(l8)) {
            return 0;
        }
        boolean bl = a.K(l8);
        l8 = a.F(l8);
        if (bl) {
            l8 = c.f(l8 % (long)1000);
            do {
                return (int)l8;
                break;
            } while (true);
        }
        l8 %= (long)1000000000;
        return (int)l8;
    }

    public final /* synthetic */ long a0() {
        return this.o;
    }

    public boolean equals(Object object) {
        return a.n(this.o, object);
    }

    public int hashCode() {
        return a.G(this.o);
    }

    public int j(long l8) {
        return a.l(this.o, l8);
    }

    public String toString() {
        return a.Y(this.o);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

