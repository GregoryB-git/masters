/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 */
package h5;

import V4.h;
import g5.c;
import h5.a;
import h5.b;
import h5.d;
import h5.e;
import h5.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class c {
    public static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static void a(String arrby, Y4.a a8, String string2) {
        try {
            arrby = arrby.getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new h((Throwable)unsupportedEncodingException);
        }
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            a8.d(arrby[i8], 8);
        }
        return;
    }

    public static void b(CharSequence charSequence, Y4.a a8) {
        int n8 = charSequence.length();
        int n9 = 0;
        while (n9 < n8) {
            int n10 = c.p(charSequence.charAt(n9));
            if (n10 != -1) {
                int n11 = n9 + 1;
                if (n11 < n8) {
                    if ((n11 = c.p(charSequence.charAt(n11))) != -1) {
                        a8.d(n10 * 45 + n11, 11);
                        n9 += 2;
                        continue;
                    }
                    throw new h();
                }
                a8.d(n10, 6);
                n9 = n11;
                continue;
            }
            throw new h();
        }
    }

    public static void c(String string2, g5.b b8, Y4.a a8, String string3) {
        int n8 = .a[b8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        c.e(string2, a8);
                        return;
                    }
                    throw new h("Invalid mode: ".concat(String.valueOf((Object)((Object)b8))));
                }
                c.a(string2, a8, string3);
                return;
            }
            c.b(string2, a8);
            return;
        }
        c.h(string2, a8);
    }

    public static void d(Y4.c c8, Y4.a a8) {
        a8.d(g5.b.v.c(), 4);
        a8.d(c8.e(), 8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void e(String var0, Y4.a var1_2) {
        try {}
        catch (UnsupportedEncodingException var0_1) {
            throw new h((Throwable)var0_1);
        }
        var0 = var0.getBytes("Shift_JIS");
        var4_3 = var0.length;
        var2_4 = 0;
        while (var2_4 < var4_3) {
            var5_6 = (var0[var2_4] & 255) << 8 | var0[var2_4 + 1] & 255;
            var3_5 = 33088;
            if (var5_6 >= 33088 && var5_6 <= 40956) ** GOTO lbl14
            if (var5_6 >= 57408 && var5_6 <= 60351) {
                var3_5 = 49472;
lbl14: // 2 sources:
                var3_5 = var5_6 - var3_5;
            } else {
                var3_5 = -1;
            }
            if (var3_5 == -1) throw new h("Invalid byte sequence");
            var1_2.d((var3_5 >> 8) * 192 + (var3_5 & 255), 13);
            var2_4 += 2;
        }
    }

    public static void f(int n8, g5.c c8, g5.b b8, Y4.a a8) {
        int n9 = b8.e(c8);
        int n10 = 1 << n9;
        if (n8 < n10) {
            a8.d(n8, n9);
            return;
        }
        c8 = new StringBuilder();
        c8.append(n8);
        c8.append(" is bigger than ");
        c8.append(n10 - 1);
        throw new h(c8.toString());
    }

    public static void g(g5.b b8, Y4.a a8) {
        a8.d(b8.c(), 4);
    }

    public static void h(CharSequence charSequence, Y4.a a8) {
        int n8 = charSequence.length();
        int n9 = 0;
        while (n9 < n8) {
            int n10 = charSequence.charAt(n9) - 48;
            int n11 = n9 + 2;
            if (n11 < n8) {
                a8.d(n10 * 100 + (charSequence.charAt(n9 + 1) - 48) * 10 + (charSequence.charAt(n11) - 48), 10);
                n9 += 3;
                continue;
            }
            if (++n9 < n8) {
                a8.d(n10 * 10 + (charSequence.charAt(n9) - 48), 7);
                n9 = n11;
                continue;
            }
            a8.d(n10, 4);
        }
    }

    public static int i(g5.b b8, Y4.a a8, Y4.a a9, g5.c c8) {
        return a8.l() + b8.e(c8) + a9.l();
    }

    public static int j(b b8) {
        return d.a(b8) + d.c(b8) + d.d(b8) + d.e(b8);
    }

    public static int k(Y4.a a8, g5.a a9, g5.c c8, b b8) {
        int n8 = Integer.MAX_VALUE;
        int n9 = -1;
        for (int i8 = 0; i8 < 8; ++i8) {
            e.a(a8, a9, c8, i8, b8);
            int n10 = c.j(b8);
            int n11 = n8;
            if (n10 < n8) {
                n9 = i8;
                n11 = n10;
            }
            n8 = n11;
        }
        return n9;
    }

    public static g5.b l(String string2, String string3) {
        boolean bl;
        if ("Shift_JIS".equals((Object)string3) && c.s(string2)) {
            return g5.b.w;
        }
        boolean bl2 = bl = false;
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            char c8 = string2.charAt(i8);
            if (c8 >= '0' && c8 <= '9') {
                bl2 = true;
                continue;
            }
            if (c.p(c8) != -1) {
                bl = true;
                continue;
            }
            return g5.b.u;
        }
        if (bl) {
            return g5.b.s;
        }
        if (bl2) {
            return g5.b.r;
        }
        return g5.b.u;
    }

    public static g5.c m(int n8, g5.a a8) {
        for (int i8 = 1; i8 <= 40; ++i8) {
            g5.c c8 = g5.c.e(i8);
            if (!c.v(n8, c8, a8)) continue;
            return c8;
        }
        throw new h("Data too big");
    }

    public static f n(String object, g5.a a8, Map object2) {
        Object object3;
        int n8 = object2 != null && object2.containsKey((Object)V4.c.p) ? 1 : 0;
        Object object4 = n8 != 0 ? object2.get((Object)V4.c.p).toString() : "ISO-8859-1";
        Object object5 = c.l((String)object, (String)object4);
        Y4.a a9 = new Y4.a();
        g5.b b8 = g5.b.u;
        if (object5 == b8 && n8 != 0 && (object3 = Y4.c.c((String)object4)) != null) {
            c.d((Y4.c)((Object)object3), a9);
        }
        if (object2 != null && object2.containsKey(object3 = V4.c.z) && Boolean.valueOf((String)object2.get(object3).toString()).booleanValue()) {
            c.g(g5.b.x, a9);
        }
        c.g((g5.b)((Object)object5), a9);
        object3 = new Y4.a();
        c.c((String)object, (g5.b)((Object)object5), (Y4.a)object3, (String)object4);
        if (object2 != null && object2.containsKey(object4 = V4.c.y)) {
            if (!c.v(c.i((g5.b)((Object)object5), a9, (Y4.a)object3, (g5.c)(object2 = g5.c.e(Integer.parseInt((String)object2.get(object4).toString())))), (g5.c)object2, a8)) {
                throw new h("Data too big for requested version");
            }
        } else {
            object2 = c.t(a8, (g5.b)((Object)object5), a9, (Y4.a)object3);
        }
        object4 = new Y4.a();
        object4.b(a9);
        n8 = object5 == b8 ? object3.n() : object.length();
        c.f(n8, (g5.c)object2, (g5.b)((Object)object5), (Y4.a)object4);
        object4.b((Y4.a)object3);
        object = object2.c(a8);
        n8 = object2.d() - object.d();
        c.u(n8, (Y4.a)object4);
        object = c.r((Y4.a)object4, object2.d(), n8, object.c());
        object4 = new f();
        object4.c(a8);
        object4.f((g5.b)((Object)object5));
        object4.g((g5.c)object2);
        n8 = object2.b();
        object5 = new b(n8, n8);
        n8 = c.k((Y4.a)object, a8, (g5.c)object2, (b)object5);
        object4.d(n8);
        e.a((Y4.a)object, a8, (g5.c)object2, n8, (b)object5);
        object4.e((b)object5);
        return object4;
    }

    public static byte[] o(byte[] arrby, int n8) {
        int n9;
        int n10 = arrby.length;
        int[] arrn = new int[n10 + n8];
        int n11 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            arrn[n9] = arrby[n9] & 255;
        }
        new Z4.c(Z4.a.l).b(arrn, n8);
        arrby = new byte[n8];
        for (n9 = n11; n9 < n8; ++n9) {
            arrby[n9] = (byte)arrn[n10 + n9];
        }
        return arrby;
    }

    public static int p(int n8) {
        int[] arrn = a;
        if (n8 < arrn.length) {
            return arrn[n8];
        }
        return -1;
    }

    public static void q(int n8, int n9, int n10, int n11, int[] arrn, int[] arrn2) {
        if (n11 < n10) {
            int n12 = n8 % n10;
            int n13 = n10 - n12;
            int n14 = n8 / n10;
            int n15 = (n9 /= n10) + 1;
            int n16 = n14 - n9;
            if (n16 == (n14 = n14 + 1 - n15)) {
                if (n10 == n13 + n12) {
                    if (n8 == (n9 + n16) * n13 + (n15 + n14) * n12) {
                        if (n11 < n13) {
                            arrn[0] = n9;
                            arrn2[0] = n16;
                            return;
                        }
                        arrn[0] = n15;
                        arrn2[0] = n14;
                        return;
                    }
                    throw new h("Total bytes mismatch");
                }
                throw new h("RS blocks mismatch");
            }
            throw new h("EC bytes mismatch");
        }
        throw new h("Block ID too large");
    }

    public static Y4.a r(Y4.a a8, int n8, int n9, int n10) {
        if (a8.n() == n9) {
            int n11;
            int n12;
            byte[] arrby;
            Iterator iterator;
            int n13;
            ArrayList arrayList = new ArrayList(n10);
            int n14 = 0;
            int n15 = n12 = (n13 = (n11 = 0));
            int n16 = n13;
            for (n13 = n11; n13 < n10; ++n13) {
                iterator = new int[1];
                int[] arrn = new int[1];
                c.q(n8, n9, n10, n13, (int[])iterator, arrn);
                n11 = iterator[0];
                arrby = new byte[n11];
                a8.p(n16 << 3, arrby, 0, n11);
                arrn = c.o(arrby, arrn[0]);
                arrayList.add((Object)new a(arrby, (byte[])arrn));
                n12 = Math.max((int)n12, (int)n11);
                n15 = Math.max((int)n15, (int)arrn.length);
                n16 += iterator[0];
            }
            if (n9 == n16) {
                a8 = new Y4.a();
                n9 = 0;
                do {
                    if (n9 >= n12) break;
                    iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        arrby = ((a)iterator.next()).a();
                        if (n9 >= arrby.length) continue;
                        a8.d(arrby[n9], 8);
                    }
                    ++n9;
                } while (true);
                for (n10 = n14; n10 < n15; ++n10) {
                    iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        arrby = ((a)iterator.next()).b();
                        if (n10 >= arrby.length) continue;
                        a8.d(arrby[n10], 8);
                    }
                }
                if (n8 == a8.n()) {
                    return a8;
                }
                arrayList = new StringBuilder("Interleaving error: ");
                arrayList.append(n8);
                arrayList.append(" and ");
                arrayList.append(a8.n());
                arrayList.append(" differ.");
                throw new h(arrayList.toString());
            }
            throw new h("Data bytes does not match offset");
        }
        throw new h("Number of bits and data bytes does not match");
    }

    public static boolean s(String arrby) {
        try {
            arrby = arrby.getBytes("Shift_JIS");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return false;
        }
        int n8 = arrby.length;
        if (n8 % 2 != 0) {
            return false;
        }
        for (int i8 = 0; i8 < n8; i8 += 2) {
            int n9 = arrby[i8] & 255;
            if (n9 >= 129 && n9 <= 159) continue;
            if (n9 >= 224) {
                if (n9 <= 235) continue;
                return false;
            }
            return false;
        }
        return true;
    }

    public static g5.c t(g5.a a8, g5.b b8, Y4.a a9, Y4.a a10) {
        return c.m(c.i(b8, a9, a10, c.m(c.i(b8, a9, a10, g5.c.e(1)), a8)), a8);
    }

    public static void u(int n8, Y4.a a8) {
        int n9 = n8 << 3;
        if (a8.l() <= n9) {
            int n10;
            int n11 = 0;
            for (n10 = 0; n10 < 4 && a8.l() < n9; ++n10) {
                a8.a(false);
            }
            n10 = a8.l() & 7;
            if (n10 > 0) {
                while (n10 < 8) {
                    a8.a(false);
                    ++n10;
                }
            }
            int n12 = a8.n();
            for (n10 = n11; n10 < n8 - n12; ++n10) {
                n11 = (n10 & 1) == 0 ? 236 : 17;
                a8.d(n11, 8);
            }
            if (a8.l() == n9) {
                return;
            }
            throw new h("Bits size does not equal capacity");
        }
        StringBuilder stringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
        stringBuilder.append(a8.l());
        stringBuilder.append(" > ");
        stringBuilder.append(n9);
        throw new h(stringBuilder.toString());
    }

    public static boolean v(int n8, g5.c c8, g5.a a8) {
        if (c8.d() - c8.c(a8).d() >= (n8 + 7) / 8) {
            return true;
        }
        return false;
    }

}

