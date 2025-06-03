/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Objects
 */
package Z0;

import F0.E;
import F0.F;
import F0.K;
import F0.W;
import F0.a;
import F0.u;
import Z0.a;
import Z0.e;
import Z0.j;
import Z0.q;
import Z0.s;
import Z0.t;
import Z0.v;
import android.util.Pair;
import d0.A;
import d0.h;
import d0.m;
import d0.q;
import d0.x;
import g0.M;
import g0.o;
import g0.y;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class b {
    public static final byte[] a = M.r0("OpusHead");

    public static s A(a.a arrl, a.b arrl2, long l8, m object, boolean bl, boolean bl2) {
        a.a a8 = (a.a)g0.a.e(arrl.f(1835297121));
        int n8 = b.e(b.m(((a.b)g0.a.e((Object)a8.g((int)1751411826))).b));
        if (n8 == -1) {
            return null;
        }
        g g8 = b.z(((a.b)g0.a.e((Object)arrl.g((int)1953196132))).b);
        long l9 = -9223372036854775807L;
        if (l8 == -9223372036854775807L) {
            l8 = g8.b;
        }
        long l10 = b.r((z)arrl2.b).q;
        l8 = l8 == -9223372036854775807L ? l9 : M.W0(l8, 1000000L, l10);
        arrl2 = (a.a)g0.a.e(((a.a)g0.a.e(a8.f(1835626086))).f(1937007212));
        a8 = b.o(((a.b)g0.a.e((Object)a8.g((int)1835296868))).b);
        arrl2 = arrl2.g(1937011556);
        if (arrl2 != null) {
            object = b.x(arrl2.b, g8.a, g8.c, (String)a8.second, (m)object, bl2);
            if (!bl && (arrl = arrl.f(1701082227)) != null && (arrl2 = b.j((a.a)arrl)) != null) {
                arrl = (long[])arrl2.first;
                arrl2 = (long[])arrl2.second;
            } else {
                arrl2 = arrl = null;
            }
            if (object.b == null) {
                return null;
            }
            return new s(g8.a, n8, (Long)a8.first, l10, l8, object.b, object.d, object.a, object.c, arrl, arrl2);
        }
        throw A.a("Malformed sample table (stbl) missing sample description (stsd)", null);
    }

    public static List B(a.a a8, E e8, long l8, m m8, boolean bl, boolean bl2, W2.g g8) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < a8.d.size(); ++i8) {
            s s8;
            a.a a9 = (a.a)a8.d.get(i8);
            if (a9.a != 1953653099 || (s8 = (s)g8.apply(b.A(a9, (a.b)g0.a.e(a8.g(1836476516)), l8, m8, bl, bl2))) == null) continue;
            arrayList.add((Object)b.w(s8, (a.a)g0.a.e(((a.a)g0.a.e(((a.a)g0.a.e(a9.f(1835297121))).f(1835626086))).f(1937007212)), e8));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static x C(a.b object) {
        z z8 = object.b;
        z8.T(8);
        Object object2 = new x(new x.b[0]);
        do {
            int n8;
            int n9;
            block8 : {
                block6 : {
                    int n10;
                    block7 : {
                        block5 : {
                            if (z8.a() < 8) {
                                return object2;
                            }
                            n9 = z8.f();
                            n8 = z8.p();
                            n10 = z8.p();
                            if (n10 != 1835365473) break block5;
                            z8.T(n9);
                            object = b.D(z8, n9 + n8);
                            break block6;
                        }
                        if (n10 != 1936553057) break block7;
                        z8.T(n9);
                        object = q.b(z8, n9 + n8);
                        break block6;
                    }
                    object = object2;
                    if (n10 != -1451722374) break block8;
                    object = b.F(z8);
                }
                object = object2.b((x)object);
            }
            z8.T(n9 + n8);
            object2 = object;
        } while (true);
    }

    public static x D(z z8, int n8) {
        z8.U(8);
        b.f(z8);
        while (z8.f() < n8) {
            int n9 = z8.f();
            int n10 = z8.p();
            if (z8.p() == 1768715124) {
                z8.T(n9);
                return b.n(z8, n9 + n10);
            }
            z8.T(n9 + n10);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void E(z arrby, int n8, int n9, int n10, int n11, int n12, m object, d d8, int n13) {
        Object object2;
        int n14 = n9;
        arrby.T(n14 + 16);
        arrby.U(16);
        int n15 = arrby.M();
        int n16 = arrby.M();
        arrby.U(50);
        int n17 = arrby.f();
        Object object3 = object;
        int n18 = n8;
        if (n8 == 1701733238) {
            object2 = b.u((z)arrby, n14, n10);
            object3 = object;
            if (object2 != null) {
                n8 = (Integer)object2.first;
                object3 = object == null ? null : object.c(((t)object2.second).b);
                d8.a[n13] = (t)object2.second;
            }
            arrby.T(n17);
            n18 = n8;
        }
        String string2 = "video/3gpp";
        object = n18 == 1831958048 ? "video/mpeg" : (n18 == 1211250227 ? "video/3gpp" : null);
        float f8 = 1.0f;
        n8 = 8;
        int n19 = 8;
        Object object4 = null;
        String string3 = null;
        byte[] arrby2 = null;
        int n20 = -1;
        int n21 = -1;
        n13 = -1;
        n14 = -1;
        int n22 = -1;
        object2 = null;
        Object object5 = null;
        boolean bl = false;
        int n23 = n18;
        Pair pair = object3;
        do {
            int n24;
            block21 : {
                block39 : {
                    Object object6;
                    block37 : {
                        Object object7;
                        block23 : {
                            block36 : {
                                block38 : {
                                    int n25;
                                    block35 : {
                                        block29 : {
                                            byte[] arrby3;
                                            block31 : {
                                                block34 : {
                                                    int n26;
                                                    block33 : {
                                                        block32 : {
                                                            boolean bl2;
                                                            block30 : {
                                                                block28 : {
                                                                    block27 : {
                                                                        block26 : {
                                                                            block25 : {
                                                                                block24 : {
                                                                                    block22 : {
                                                                                        block20 : {
                                                                                            object3 = d8;
                                                                                            n18 = n9;
                                                                                            n25 = n10;
                                                                                            if (n17 - n18 >= n25) break;
                                                                                            arrby.T(n17);
                                                                                            n26 = arrby.f();
                                                                                            n24 = arrby.p();
                                                                                            if (n24 == 0 && arrby.f() - n18 == n25) break;
                                                                                            bl2 = n24 > 0;
                                                                                            u.a(bl2, "childAtomSize must be positive");
                                                                                            n25 = arrby.p();
                                                                                            if (n25 != 1635148611) break block20;
                                                                                            bl2 = object == null;
                                                                                            u.a(bl2, null);
                                                                                            arrby.T(n26 + 8);
                                                                                            object = F0.d.b((z)arrby);
                                                                                            object4 = object.a;
                                                                                            object3.c = object.b;
                                                                                            if (!bl) {
                                                                                                f8 = object.k;
                                                                                            }
                                                                                            string3 = object.l;
                                                                                            n21 = object.j;
                                                                                            n13 = object.g;
                                                                                            n14 = object.h;
                                                                                            n22 = object.i;
                                                                                            n8 = object.e;
                                                                                            n18 = object.f;
                                                                                            object = "video/avc";
                                                                                            break block21;
                                                                                        }
                                                                                        if (n25 != 1752589123) break block22;
                                                                                        bl2 = object == null;
                                                                                        u.a(bl2, null);
                                                                                        arrby.T(n26 + 8);
                                                                                        object = F.a((z)arrby);
                                                                                        object4 = object.a;
                                                                                        object3.c = object.b;
                                                                                        if (!bl) {
                                                                                            f8 = object.j;
                                                                                        }
                                                                                        n21 = object.k;
                                                                                        string3 = object.l;
                                                                                        n13 = object.g;
                                                                                        n14 = object.h;
                                                                                        n22 = object.i;
                                                                                        n8 = object.e;
                                                                                        n18 = object.f;
                                                                                        object = "video/hevc";
                                                                                        break block21;
                                                                                    }
                                                                                    if (n25 == 1685480259 || n25 == 1685485123) break block23;
                                                                                    if (n25 != 1987076931) break block24;
                                                                                    bl2 = object == null;
                                                                                    u.a(bl2, null);
                                                                                    object = n23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                                                    arrby.T(n26 + 12);
                                                                                    arrby.U(2);
                                                                                    n18 = arrby.G();
                                                                                    n8 = (n18 & 1) != 0 ? 1 : 0;
                                                                                    n13 = arrby.G();
                                                                                    n22 = arrby.G();
                                                                                    n13 = h.j(n13);
                                                                                    n14 = n8 != 0 ? 1 : 2;
                                                                                    n22 = h.k(n22);
                                                                                    n18 = n8 = n18 >> 4;
                                                                                    break block21;
                                                                                }
                                                                                if (n25 != 1635135811) break block25;
                                                                                n8 = n24 - 8;
                                                                                object = new byte[n8];
                                                                                arrby.l((byte[])object, 0, n8);
                                                                                object4 = X2.v.Z(object);
                                                                                arrby.T(n26 + 8);
                                                                                object = b.h((z)arrby);
                                                                                n8 = object.e;
                                                                                n18 = object.f;
                                                                                n13 = object.a;
                                                                                n14 = object.b;
                                                                                n22 = object.c;
                                                                                object = "video/av01";
                                                                                break block21;
                                                                            }
                                                                            if (n25 != 1668050025) break block26;
                                                                            object3 = object2;
                                                                            if (object2 == null) {
                                                                                object3 = b.a();
                                                                            }
                                                                            object3.position(21);
                                                                            object3.putShort(arrby.C());
                                                                            object3.putShort(arrby.C());
                                                                            object2 = object3;
                                                                            break block27;
                                                                        }
                                                                        if (n25 != 1835295606) break block28;
                                                                        object3 = object2;
                                                                        if (object2 == null) {
                                                                            object3 = b.a();
                                                                        }
                                                                        short s8 = arrby.C();
                                                                        short s9 = arrby.C();
                                                                        short s10 = arrby.C();
                                                                        short s11 = arrby.C();
                                                                        short s12 = arrby.C();
                                                                        short s13 = arrby.C();
                                                                        short s14 = arrby.C();
                                                                        short s15 = arrby.C();
                                                                        long l8 = arrby.I();
                                                                        long l9 = arrby.I();
                                                                        object3.position(1);
                                                                        object3.putShort(s12);
                                                                        object3.putShort(s13);
                                                                        object3.putShort(s8);
                                                                        object3.putShort(s9);
                                                                        object3.putShort(s10);
                                                                        object3.putShort(s11);
                                                                        object3.putShort(s14);
                                                                        object3.putShort(s15);
                                                                        object3.putShort((short)(l8 / 10000L));
                                                                        object3.putShort((short)(l9 / 10000L));
                                                                        object2 = object3;
                                                                    }
                                                                    n18 = n8;
                                                                    break block29;
                                                                }
                                                                n18 = n8;
                                                                if (n25 != 1681012275) break block30;
                                                                bl2 = object == null;
                                                                u.a(bl2, null);
                                                                object3 = string2;
                                                                object6 = object5;
                                                                n8 = n20;
                                                                arrby3 = arrby2;
                                                                object7 = object4;
                                                                break block31;
                                                            }
                                                            if (n25 != 1702061171) break block32;
                                                            bl2 = object == null;
                                                            u.a(bl2, null);
                                                            object6 = b.k((z)arrby, n26);
                                                            object3 = ((b)object6).a;
                                                            object = ((b)object6).b;
                                                            if (object != null) {
                                                                object4 = X2.v.Z(object);
                                                            }
                                                            object7 = object4;
                                                            arrby3 = arrby2;
                                                            n8 = n20;
                                                            break block31;
                                                        }
                                                        if (n25 != 1885434736) break block33;
                                                        f8 = b.s((z)arrby, n26);
                                                        n8 = n18;
                                                        bl = true;
                                                        n18 = n19;
                                                        break block21;
                                                    }
                                                    if (n25 != 1937126244) break block34;
                                                    arrby3 = b.t((z)arrby, n26, n24);
                                                    object3 = object;
                                                    object7 = object4;
                                                    n8 = n20;
                                                    object6 = object5;
                                                    break block31;
                                                }
                                                if (n25 != 1936995172) break block35;
                                                n25 = arrby.G();
                                                arrby.U(3);
                                                object3 = object;
                                                object7 = object4;
                                                arrby3 = arrby2;
                                                n8 = n20;
                                                object6 = object5;
                                                if (n25 == 0) {
                                                    n8 = arrby.G();
                                                    if (n8 != 0) {
                                                        if (n8 != 1) {
                                                            if (n8 != 2) {
                                                                if (n8 != 3) {
                                                                    object3 = object;
                                                                    object7 = object4;
                                                                    arrby3 = arrby2;
                                                                    n8 = n20;
                                                                    object6 = object5;
                                                                } else {
                                                                    n8 = 3;
                                                                    object3 = object;
                                                                    object7 = object4;
                                                                    arrby3 = arrby2;
                                                                    object6 = object5;
                                                                }
                                                            } else {
                                                                n8 = 2;
                                                                object3 = object;
                                                                object7 = object4;
                                                                arrby3 = arrby2;
                                                                object6 = object5;
                                                            }
                                                        } else {
                                                            n8 = 1;
                                                            object3 = object;
                                                            object7 = object4;
                                                            arrby3 = arrby2;
                                                            object6 = object5;
                                                        }
                                                    } else {
                                                        n8 = 0;
                                                        object3 = object;
                                                        object7 = object4;
                                                        arrby3 = arrby2;
                                                        object6 = object5;
                                                    }
                                                }
                                            }
                                            object = object3;
                                            object4 = object7;
                                            arrby2 = arrby3;
                                            n20 = n8;
                                            object5 = object6;
                                        }
                                        n8 = n18;
                                        n18 = n19;
                                        break block21;
                                    }
                                    if (n25 != 1668246642) break block36;
                                    object3 = object;
                                    object6 = string3;
                                    if (n13 != -1) break block37;
                                    object3 = object;
                                    object6 = string3;
                                    if (n22 != -1) break block37;
                                    n18 = arrby.p();
                                    if (n18 == 1852009592 || n18 == 1852009571) break block38;
                                    object3 = new StringBuilder();
                                    object3.append("Unsupported color type: ");
                                    object3.append(Z0.a.a(n18));
                                    o.h("AtomParsers", object3.toString());
                                    object3 = object;
                                    object6 = string3;
                                    break block37;
                                }
                                n14 = arrby.M();
                                n22 = arrby.M();
                                arrby.U(2);
                                n13 = n24 == 19 && (arrby.G() & 128) != 0 ? 1 : 0;
                                n18 = h.j(n14);
                                n14 = n13 != 0 ? 1 : 2;
                                n22 = h.k(n22);
                                n13 = n18;
                                break block39;
                            }
                            object6 = string3;
                            object3 = object;
                            break block37;
                        }
                        object7 = F0.o.a((z)arrby);
                        object3 = object;
                        object6 = string3;
                        if (object7 != null) {
                            object6 = object7.c;
                            object3 = "video/dolby-vision";
                        }
                    }
                    object = object3;
                    string3 = object6;
                }
                n18 = n19;
            }
            n17 += n24;
            n19 = n18;
        } while (true);
        if (object == null) {
            return;
        }
        object = new q.b().Z(n11).o0((String)object).O(string3).v0(n15).Y(n16).k0(f8).n0(n12).l0(arrby2).r0(n20).b0((List)object4).g0(n21).U((m)pair);
        object4 = new h.b().d(n13).c(n14).e(n22);
        arrby = object2 != null ? object2.array() : null;
        arrby = object.P(object4.f(arrby).g(n8).b(n19).a());
        if (object5 != null) {
            arrby.M(a3.f.m(((b)object5).c)).j0(a3.f.m(((b)object5).d));
        }
        d8.b = arrby.K();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static x F(z object) {
        int n8 = object.C();
        object.U(2);
        object = object.D(n8);
        n8 = Math.max((int)object.lastIndexOf(43), (int)object.lastIndexOf(45));
        try {
            return new x(new h0.b(Float.parseFloat((String)object.substring(0, n8)), Float.parseFloat((String)object.substring(n8, object.length() - 1))));
        }
        catch (IndexOutOfBoundsException | NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate((int)25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] arrl, long l8, long l9, long l10) {
        int n8 = arrl.length - 1;
        int n9 = M.p(4, 0, n8);
        n8 = M.p(arrl.length - 4, 0, n8);
        if (arrl[0] <= l9 && l9 < arrl[n9] && arrl[n8] < l10 && l10 <= l8) {
            return true;
        }
        return false;
    }

    public static boolean c(int n8) {
        if (n8 != 1) {
            return true;
        }
        return false;
    }

    public static int d(z z8, int n8, int n9, int n10) {
        int n11 = z8.f();
        boolean bl = n11 >= n9;
        u.a(bl, null);
        while (n11 - n9 < n10) {
            z8.T(n11);
            int n12 = z8.p();
            bl = n12 > 0;
            u.a(bl, "childAtomSize must be positive");
            if (z8.p() == n8) {
                return n11;
            }
            n11 += n12;
        }
        return -1;
    }

    public static int e(int n8) {
        if (n8 == 1936684398) {
            return 1;
        }
        if (n8 == 1986618469) {
            return 2;
        }
        if (n8 != 1952807028 && n8 != 1935832172 && n8 != 1937072756 && n8 != 1668047728) {
            if (n8 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    public static void f(z z8) {
        int n8 = z8.f();
        z8.U(4);
        int n9 = n8;
        if (z8.p() != 1751411826) {
            n9 = n8 + 4;
        }
        z8.T(n9);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void g(z var0, int var1_1, int var2_2, int var3_3, int var4_4, String var5_5, boolean var6_6, m var7_7, d var8_8, int var9_9) {
        block29 : {
            block33 : {
                block39 : {
                    block38 : {
                        block37 : {
                            block36 : {
                                block35 : {
                                    block34 : {
                                        block32 : {
                                            block31 : {
                                                block30 : {
                                                    block28 : {
                                                        block27 : {
                                                            block21 : {
                                                                block24 : {
                                                                    block22 : {
                                                                        block26 : {
                                                                            block25 : {
                                                                                block23 : {
                                                                                    var15_10 = var2_2;
                                                                                    var0.T(var15_10 + 16);
                                                                                    if (var6_6) {
                                                                                        var10_11 = var0.M();
                                                                                        var0.U(6);
                                                                                    } else {
                                                                                        var0.U(8);
                                                                                        var10_11 = 0;
                                                                                    }
                                                                                    if (var10_11 == 0 || var10_11 == 1) break block21;
                                                                                    if (var10_11 != 2) return;
                                                                                    var0.U(16);
                                                                                    var14_12 = (int)Math.round((double)var0.o());
                                                                                    var12_13 = var0.K();
                                                                                    var0.U(4);
                                                                                    var13_14 = var0.K();
                                                                                    var11_15 = var0.K();
                                                                                    var10_11 = (var11_15 & 1) != 0 ? 1 : 0;
                                                                                    var11_15 = (var11_15 & 2) != 0 ? 1 : 0;
                                                                                    if (var10_11 != 0) break block22;
                                                                                    if (var13_14 != 8) break block23;
                                                                                    var10_11 = 3;
                                                                                    break block24;
                                                                                }
                                                                                if (var13_14 != 16) break block25;
                                                                                var10_11 = var11_15 != 0 ? 268435456 : 2;
                                                                                break block24;
                                                                            }
                                                                            if (var13_14 != 24) break block26;
                                                                            var10_11 = var11_15 != 0 ? 1342177280 : 21;
                                                                            break block24;
                                                                        }
                                                                        if (var13_14 != 32) ** GOTO lbl-1000
                                                                        var10_11 = var11_15 != 0 ? 1610612736 : 22;
                                                                        break block24;
                                                                    }
                                                                    if (var13_14 == 32) {
                                                                        var10_11 = 4;
                                                                    } else lbl-1000: // 2 sources:
                                                                    {
                                                                        var10_11 = -1;
                                                                    }
                                                                }
                                                                var0.U(8);
                                                                var16_16 = 0;
                                                                var13_14 = var10_11;
                                                                var10_11 = var14_12;
                                                                var11_15 = var12_13;
                                                                var12_13 = var16_16;
                                                                break block27;
                                                            }
                                                            var11_15 = var0.M();
                                                            var0.U(6);
                                                            var13_14 = var0.H();
                                                            var0.T(var0.f() - 4);
                                                            var12_13 = var0.p();
                                                            if (var10_11 == 1) {
                                                                var0.U(16);
                                                            }
                                                            var14_12 = -1;
                                                            var10_11 = var13_14;
                                                            var13_14 = var14_12;
                                                        }
                                                        var16_16 = var0.f();
                                                        var21_17 = var7_7;
                                                        var14_12 = var1_1;
                                                        if (var1_1 == 1701733217) {
                                                            var19_18 = b.u((z)var0, var15_10, var3_3);
                                                            var18_19 = var7_7;
                                                            if (var19_18 != null) {
                                                                var1_1 = (Integer)var19_18.first;
                                                                var18_19 = var7_7 == null ? null : var7_7.c(((t)var19_18.second).b);
                                                                var8_8.a[var9_9] = (t)var19_18.second;
                                                            }
                                                            var0.T(var16_16);
                                                            var14_12 = var1_1;
                                                            var21_17 = var18_19;
                                                        }
                                                        var22_20 = "audio/mhm1";
                                                        if (var14_12 != 1633889587) break block28;
                                                        var7_7 = "audio/ac3";
                                                        break block29;
                                                    }
                                                    if (var14_12 != 1700998451) break block30;
                                                    var7_7 = "audio/eac3";
                                                    break block29;
                                                }
                                                if (var14_12 != 1633889588) break block31;
                                                var7_7 = "audio/ac4";
                                                break block29;
                                            }
                                            if (var14_12 != 1685353315) break block32;
                                            var7_7 = "audio/vnd.dts";
                                            break block29;
                                        }
                                        if (var14_12 == 1685353320 || var14_12 == 1685353324) break block33;
                                        if (var14_12 != 1685353317) break block34;
                                        var7_7 = "audio/vnd.dts.hd;profile=lbr";
                                        break block29;
                                    }
                                    if (var14_12 != 1685353336) break block35;
                                    var7_7 = "audio/vnd.dts.uhd;profile=p2";
                                    break block29;
                                }
                                if (var14_12 != 1935764850) break block36;
                                var7_7 = "audio/3gpp";
                                break block29;
                            }
                            if (var14_12 != 1935767394) break block37;
                            var7_7 = "audio/amr-wb";
                            break block29;
                        }
                        if (var14_12 == 1936684916) ** GOTO lbl-1000
                        if (var14_12 != 1953984371) break block38;
                        var7_7 = "audio/raw";
                        var13_14 = 268435456;
                        break block29;
                    }
                    if (var14_12 == 1819304813) {
                        ** if (var13_14 != -1) goto lbl-1000
                    }
                    break block39;
lbl-1000: // 2 sources:
                    {
                        var7_7 = "audio/raw";
                        var13_14 = 2;
                        ** GOTO lbl126
                    }
lbl-1000: // 1 sources:
                    {
                        var7_7 = "audio/raw";
                    }
                    break block29;
                }
                var7_7 = var14_12 != 778924082 && var14_12 != 778924083 ? (var14_12 == 1835557169 ? "audio/mha1" : (var14_12 == 1835560241 ? "audio/mhm1" : (var14_12 == 1634492771 ? "audio/alac" : (var14_12 == 1634492791 ? "audio/g711-alaw" : (var14_12 == 1970037111 ? "audio/g711-mlaw" : (var14_12 == 1332770163 ? "audio/opus" : (var14_12 == 1716281667 ? "audio/flac" : (var14_12 == 1835823201 ? "audio/true-hd" : null)))))))) : "audio/mpeg";
                break block29;
            }
            var7_7 = "audio/vnd.dts.hd";
        }
        var18_19 = null;
        var19_18 = null;
        var23_21 = null;
        var14_12 = var16_16;
        var1_1 = var11_15;
        var9_9 = var10_11;
        var24_22 = var7_7;
        while (var14_12 - var2_2 < var3_3) {
            block51 : {
                block44 : {
                    block48 : {
                        block52 : {
                            block54 : {
                                block53 : {
                                    block50 : {
                                        block43 : {
                                            block49 : {
                                                block47 : {
                                                    block46 : {
                                                        block45 : {
                                                            block42 : {
                                                                block41 : {
                                                                    block40 : {
                                                                        var0.T(var14_12);
                                                                        var16_16 = var0.p();
                                                                        var17_23 = var16_16 > 0;
                                                                        u.a(var17_23, "childAtomSize must be positive");
                                                                        var10_11 = var0.p();
                                                                        if (var10_11 != 1835557187) break block40;
                                                                        var0.T(var14_12 + 8);
                                                                        var0.U(1);
                                                                        var10_11 = var0.G();
                                                                        var0.U(1);
                                                                        var20_24 = Objects.equals((Object)var24_22, (Object)var22_20) != false ? String.format((String)"mhm1.%02X", (Object[])new Object[]{var10_11}) : String.format((String)"mha1.%02X", (Object[])new Object[]{var10_11});
                                                                        var10_11 = var0.M();
                                                                        var7_7 = new byte[var10_11];
                                                                        var0.l((byte[])var7_7, 0, var10_11);
                                                                        var7_7 = var19_18 == null ? X2.v.Z(var7_7) : X2.v.a0(var7_7, (byte[])var19_18.get(0));
                                                                        break block41;
                                                                    }
                                                                    if (var10_11 != 1835557200) break block42;
                                                                    var0.T(var14_12 + 8);
                                                                    var10_11 = var0.G();
                                                                    var20_24 = var18_19;
                                                                    var7_7 = var19_18;
                                                                    if (var10_11 > 0) {
                                                                        var7_7 = new byte[var10_11];
                                                                        var0.l((byte[])var7_7, 0, var10_11);
                                                                        if (var19_18 == null) {
                                                                            var7_7 = X2.v.Z(var7_7);
                                                                            var20_24 = var18_19;
                                                                        } else {
                                                                            var7_7 = X2.v.a0((byte[])var19_18.get(0), var7_7);
                                                                            var20_24 = var18_19;
                                                                        }
                                                                    }
                                                                }
                                                                var18_19 = var20_24;
                                                                break block43;
                                                            }
                                                            if (var10_11 == 1702061171 || var6_6 && var10_11 == 2002876005) break block44;
                                                            if (var10_11 != 1684103987) break block45;
                                                            var0.T(var14_12 + 8);
                                                            var7_7 = F0.b.d((z)var0, Integer.toString((int)var4_4), var5_5, (m)var21_17);
                                                            break block46;
                                                        }
                                                        if (var10_11 != 1684366131) break block47;
                                                        var0.T(var14_12 + 8);
                                                        var7_7 = F0.b.h((z)var0, Integer.toString((int)var4_4), var5_5, (m)var21_17);
                                                    }
                                                    var8_8.b = var7_7;
                                                    break block48;
                                                }
                                                if (var10_11 != 1684103988) break block49;
                                                var0.T(var14_12 + 8);
                                                var8_8.b = F0.c.b((z)var0, Integer.toString((int)var4_4), var5_5, (m)var21_17);
                                                break block48;
                                            }
                                            if (var10_11 != 1684892784) break block50;
                                            if (var12_13 <= 0) {
                                                var0 = new StringBuilder();
                                                var0.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                var0.append(var12_13);
                                                throw A.a(var0.toString(), null);
                                            }
                                            var9_9 = var12_13;
                                            var1_1 = 2;
                                            var7_7 = var19_18;
                                        }
                                        var10_11 = var9_9;
                                        var20_24 = var18_19;
                                        var11_15 = var1_1;
                                        break block51;
                                    }
                                    if (var10_11 == 1684305011 || var10_11 == 1969517683) break block52;
                                    if (var10_11 != 1682927731) break block53;
                                    var10_11 = var16_16 - 8;
                                    var7_7 = b.a;
                                    var19_18 = Arrays.copyOf((byte[])var7_7, (int)(var7_7.length + var10_11));
                                    var0.T(var14_12 + 8);
                                    var0.l((byte[])var19_18, var7_7.length, var10_11);
                                    var7_7 = K.a((byte[])var19_18);
                                    var10_11 = var9_9;
                                    var20_24 = var18_19;
                                    var11_15 = var1_1;
                                    break block51;
                                }
                                if (var10_11 != 1684425825) break block54;
                                var7_7 = new byte[var16_16 - 8];
                                var7_7[0] = 102;
                                var7_7[1] = 76;
                                var7_7[2] = 97;
                                var7_7[3] = 67;
                                var0.T(var14_12 + 12);
                                var0.l((byte[])var7_7, 4, var16_16 - 12);
                                var7_7 = X2.v.Z(var7_7);
                                var10_11 = var9_9;
                                var20_24 = var18_19;
                                var11_15 = var1_1;
                                break block51;
                            }
                            if (var10_11 != 1634492771) break block48;
                            var1_1 = var16_16 - 12;
                            var7_7 = new byte[var1_1];
                            var0.T(var14_12 + 12);
                            var0.l((byte[])var7_7, 0, var1_1);
                            var19_18 = g0.d.e((byte[])var7_7);
                            var10_11 = (Integer)var19_18.first;
                            var11_15 = (Integer)var19_18.second;
                            var7_7 = X2.v.Z(var7_7);
                            var20_24 = var18_19;
                            break block51;
                        }
                        var8_8.b = new q.b().Z(var4_4).o0((String)var24_22).N(var1_1).p0(var9_9).U((m)var21_17).e0(var5_5).K();
                    }
                    var10_11 = var9_9;
                    var20_24 = var18_19;
                    var11_15 = var1_1;
                    var7_7 = var19_18;
                    break block51;
                }
                var15_10 = var10_11 == 1702061171 ? var14_12 : b.d((z)var0, 1702061171, var14_12, var16_16);
                var10_11 = var9_9;
                var20_24 = var18_19;
                var11_15 = var1_1;
                var7_7 = var19_18;
                if (var15_10 != -1) {
                    var25_25 = b.k((z)var0, var15_10);
                    var26_26 = b.a(var25_25);
                    var27_27 = b.b(var25_25);
                    var24_22 = var26_26;
                    var10_11 = var9_9;
                    var20_24 = var18_19;
                    var11_15 = var1_1;
                    var7_7 = var19_18;
                    var23_21 = var25_25;
                    if (var27_27 != null) {
                        if ("audio/vorbis".equals((Object)var26_26)) {
                            var7_7 = W.e(var27_27);
                            var24_22 = var26_26;
                            var10_11 = var9_9;
                            var20_24 = var18_19;
                            var11_15 = var1_1;
                            var23_21 = var25_25;
                        } else {
                            if ("audio/mp4a-latm".equals((Object)var26_26)) {
                                var7_7 = F0.a.e(var27_27);
                                var9_9 = var7_7.a;
                                var1_1 = var7_7.b;
                                var18_19 = var7_7.c;
                            }
                            var7_7 = X2.v.Z(var27_27);
                            var23_21 = var25_25;
                            var11_15 = var1_1;
                            var20_24 = var18_19;
                            var10_11 = var9_9;
                            var24_22 = var26_26;
                        }
                    }
                }
            }
            var14_12 += var16_16;
            var9_9 = var10_11;
            var18_19 = var20_24;
            var1_1 = var11_15;
            var19_18 = var7_7;
        }
        if (var8_8.b != null) return;
        if (var24_22 == null) return;
        var0 = new q.b().Z(var4_4).o0((String)var24_22).O((String)var18_19).N(var1_1).p0(var9_9).i0(var13_14).b0((List)var19_18).U((m)var21_17).e0(var5_5);
        if (var23_21 != null) {
            var0.M(a3.f.m(b.d(var23_21))).j0(a3.f.m(b.c(var23_21)));
        }
        var8_8.b = var0.K();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static h h(z object) {
        int n8;
        int n9;
        h.b b8;
        y y8;
        boolean bl;
        int n10;
        int n11;
        block26 : {
            block21 : {
                block25 : {
                    block24 : {
                        block23 : {
                            block22 : {
                                block20 : {
                                    block19 : {
                                        block18 : {
                                            block17 : {
                                                b8 = new h.b();
                                                y8 = new y(object.e());
                                                y8.p(object.f() * 8);
                                                n8 = 1;
                                                y8.s(1);
                                                n10 = y8.h(3);
                                                y8.r(6);
                                                bl = y8.g();
                                                boolean bl2 = y8.g();
                                                n9 = 10;
                                                if (n10 != 2 || !bl) break block17;
                                                n10 = bl2 ? 12 : 10;
                                                b8.g(n10);
                                                n10 = n9;
                                                if (bl2) {
                                                    n10 = 12;
                                                }
                                                break block18;
                                            }
                                            if (n10 > 2) break block19;
                                            n10 = bl ? 10 : 8;
                                            b8.g(n10);
                                            n10 = bl ? n9 : 8;
                                        }
                                        b8.b(n10);
                                    }
                                    y8.r(13);
                                    y8.q();
                                    n10 = y8.h(4);
                                    if (n10 == 1) break block20;
                                    object = new StringBuilder();
                                    object.append("Unsupported obu_type: ");
                                    object.append(n10);
                                    object = object.toString();
                                    break block21;
                                }
                                if (!y8.g()) break block22;
                                object = "Unsupported obu_extension_flag";
                                break block21;
                            }
                            bl = y8.g();
                            y8.q();
                            if (!bl || y8.h(8) <= 127) break block23;
                            object = "Excessive obu_size";
                            break block21;
                        }
                        n11 = y8.h(3);
                        y8.q();
                        if (!y8.g()) break block24;
                        object = "Unsupported reduced_still_picture_header";
                        break block21;
                    }
                    if (!y8.g()) break block25;
                    object = "Unsupported timing_info_present_flag";
                    break block21;
                }
                if (!y8.g()) break block26;
                object = "Unsupported initial_display_delay_present_flag";
            }
            o.f("AtomParsers", (String)object);
            return b8.a();
        }
        int n12 = y8.h(5);
        n9 = 0;
        for (n10 = 0; n10 <= n12; ++n10) {
            y8.r(12);
            if (y8.h(5) <= 7) continue;
            y8.q();
        }
        n10 = y8.h(4);
        n12 = y8.h(4);
        y8.r(n10 + 1);
        y8.r(n12 + 1);
        if (y8.g()) {
            y8.r(7);
        }
        y8.r(7);
        bl = y8.g();
        if (bl) {
            y8.r(2);
        }
        if ((y8.g() || y8.h(1) > 0) && !y8.g()) {
            y8.r(1);
        }
        if (bl) {
            y8.r(3);
        }
        y8.r(3);
        bl = y8.g();
        if (n11 == 2 && bl) {
            y8.q();
        }
        n10 = n9;
        if (n11 != 1) {
            n10 = n9;
            if (y8.g()) {
                n10 = 1;
            }
        }
        if (!y8.g()) return b8.a();
        n11 = y8.h(8);
        n9 = y8.h(8);
        n12 = y8.h(8);
        n10 = n10 == 0 && n11 == 1 && n9 == 13 && n12 == 0 ? 1 : y8.h(1);
        object = b8.d(h.j(n11));
        n10 = n10 == 1 ? n8 : 2;
        object.c(n10).e(h.k(n9));
        return b8.a();
    }

    public static Pair i(z object, int n8, int n9) {
        int n10 = n8 + 8;
        boolean bl = false;
        int n11 = -1;
        int n12 = 0;
        String string2 = null;
        Object object2 = string2;
        while (n10 - n8 < n9) {
            Object object3;
            String string3;
            object.T(n10);
            int n13 = object.p();
            int n14 = object.p();
            if (n14 == 1718775137) {
                object3 = object.p();
                string3 = string2;
            } else if (n14 == 1935894637) {
                object.U(4);
                string3 = object.D(4);
                object3 = object2;
            } else {
                string3 = string2;
                object3 = object2;
                if (n14 == 1935894633) {
                    n11 = n10;
                    n12 = n13;
                    object3 = object2;
                    string3 = string2;
                }
            }
            n10 += n13;
            string2 = string3;
            object2 = object3;
        }
        if (!("cenc".equals((Object)string2) || "cbc1".equals((Object)string2) || "cens".equals((Object)string2) || "cbcs".equals((Object)string2))) {
            return null;
        }
        boolean bl2 = object2 != null;
        u.a(bl2, "frma atom is mandatory");
        bl2 = n11 != -1;
        u.a(bl2, "schi atom is mandatory");
        object = b.v((z)object, n11, n12, string2);
        bl2 = bl;
        if (object != null) {
            bl2 = true;
        }
        u.a(bl2, "tenc atom is mandatory");
        return Pair.create((Object)object2, (Object)((t)M.i(object)));
    }

    public static Pair j(a.a object) {
        if ((object = object.g(1701606260)) == null) {
            return null;
        }
        object = object.b;
        object.T(8);
        int n8 = Z0.a.c(object.p());
        int n9 = object.K();
        long[] arrl = new long[n9];
        long[] arrl2 = new long[n9];
        for (int i8 = 0; i8 < n9; ++i8) {
            long l8 = n8 == 1 ? object.L() : object.I();
            arrl[i8] = l8;
            l8 = n8 == 1 ? object.z() : (long)object.p();
            arrl2[i8] = l8;
            if (object.C() == 1) {
                object.U(2);
                continue;
            }
            throw new IllegalArgumentException("Unsupported media rate.");
        }
        return Pair.create((Object)arrl, (Object)arrl2);
    }

    public static b k(z z8, int n8) {
        z8.T(n8 + 12);
        z8.U(1);
        b.l(z8);
        z8.U(2);
        n8 = z8.G();
        if ((n8 & 128) != 0) {
            z8.U(2);
        }
        if ((n8 & 64) != 0) {
            z8.U(z8.G());
        }
        if ((n8 & 32) != 0) {
            z8.U(2);
        }
        z8.U(1);
        b.l(z8);
        String string2 = d0.z.h(z8.G());
        if (!("audio/mpeg".equals((Object)string2) || "audio/vnd.dts".equals((Object)string2) || "audio/vnd.dts.hd".equals((Object)string2))) {
            z8.U(4);
            long l8 = z8.I();
            long l9 = z8.I();
            z8.U(1);
            n8 = b.l(z8);
            byte[] arrby = new byte[n8];
            z8.l(arrby, 0, n8);
            if (l9 <= 0L) {
                l9 = -1L;
            }
            if (l8 <= 0L) {
                l8 = -1L;
            }
            return new b(string2, arrby, l9, l8);
        }
        return new b(string2, null, -1L, -1L);
    }

    public static int l(z z8) {
        int n8 = z8.G();
        int n9 = n8 & 127;
        while ((n8 & 128) == 128) {
            n8 = z8.G();
            n9 = n9 << 7 | n8 & 127;
        }
        return n9;
    }

    public static int m(z z8) {
        z8.T(16);
        return z8.p();
    }

    public static x n(z z8, int n8) {
        z8.U(8);
        ArrayList arrayList = new ArrayList();
        while (z8.f() < n8) {
            x.b b8 = j.c(z8);
            if (b8 == null) continue;
            arrayList.add((Object)b8);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List)arrayList);
    }

    public static Pair o(z z8) {
        int n8 = 8;
        z8.T(8);
        int n9 = Z0.a.c(z8.p());
        int n10 = n9 == 0 ? 8 : 16;
        z8.U(n10);
        long l8 = z8.I();
        n10 = n8;
        if (n9 == 0) {
            n10 = 4;
        }
        z8.U(n10);
        n10 = z8.M();
        z8 = new StringBuilder();
        z8.append("");
        z8.append((char)((n10 >> 10 & 31) + 96));
        z8.append((char)((n10 >> 5 & 31) + 96));
        z8.append((char)((n10 & 31) + 96));
        return Pair.create((Object)l8, (Object)z8.toString());
    }

    public static x p(a.a object) {
        Object object2 = object.g(1751411826);
        a.b b8 = object.g(1801812339);
        a.b b9 = object.g(1768715124);
        z z8 = null;
        object = z8;
        if (object2 != null) {
            object = z8;
            if (b8 != null) {
                object = z8;
                if (b9 != null) {
                    int n8;
                    int n9;
                    if (b.m(object2.b) != 1835299937) {
                        return null;
                    }
                    z8 = b8.b;
                    z8.T(12);
                    int n10 = z8.p();
                    object = new String[n10];
                    for (n9 = 0; n9 < n10; ++n9) {
                        n8 = z8.p();
                        z8.U(4);
                        object[n9] = z8.D(n8 - 8);
                    }
                    z8 = b9.b;
                    z8.T(8);
                    b9 = new ArrayList();
                    while (z8.a() > 8) {
                        n9 = z8.f();
                        n8 = z8.p();
                        int n11 = z8.p() - 1;
                        if (n11 >= 0 && n11 < n10) {
                            object2 = j.h(z8, n9 + n8, (String)object[n11]);
                            if (object2 != null) {
                                b9.add(object2);
                            }
                        } else {
                            object2 = new StringBuilder();
                            object2.append("Skipped metadata with unknown key index: ");
                            object2.append(n11);
                            o.h("AtomParsers", object2.toString());
                        }
                        z8.T(n9 + n8);
                    }
                    if (b9.isEmpty()) {
                        return null;
                    }
                    object = new x((List)b9);
                }
            }
        }
        return object;
    }

    public static void q(z object, int n8, int n9, int n10, d d8) {
        object.T(n9 + 16);
        if (n8 == 1835365492) {
            object.A();
            object = object.A();
            if (object != null) {
                d8.b = new q.b().Z(n10).o0((String)object).K();
            }
        }
    }

    public static h0.c r(z z8) {
        long l8;
        long l9;
        z8.T(8);
        if (Z0.a.c(z8.p()) == 0) {
            l9 = z8.I();
            l8 = z8.I();
        } else {
            l9 = z8.z();
            l8 = z8.z();
        }
        return new h0.c(l9, l8, z8.I());
    }

    public static float s(z z8, int n8) {
        z8.T(n8 + 8);
        n8 = z8.K();
        int n9 = z8.K();
        return (float)n8 / (float)n9;
    }

    public static byte[] t(z z8, int n8, int n9) {
        int n10 = n8 + 8;
        while (n10 - n8 < n9) {
            z8.T(n10);
            int n11 = z8.p();
            if (z8.p() == 1886547818) {
                return Arrays.copyOfRange((byte[])z8.e(), (int)n10, (int)(n11 + n10));
            }
            n10 += n11;
        }
        return null;
    }

    public static Pair u(z z8, int n8, int n9) {
        int n10 = z8.f();
        while (n10 - n8 < n9) {
            Pair pair;
            z8.T(n10);
            int n11 = z8.p();
            boolean bl = n11 > 0;
            u.a(bl, "childAtomSize must be positive");
            if (z8.p() == 1936289382 && (pair = b.i(z8, n10, n11)) != null) {
                return pair;
            }
            n10 += n11;
        }
        return null;
    }

    public static t v(z z8, int n8, int n9, String string2) {
        int n10 = n8 + 8;
        do {
            byte[] arrby = null;
            if (n10 - n8 >= n9) break;
            z8.T(n10);
            int n11 = z8.p();
            if (z8.p() == 1952804451) {
                n8 = Z0.a.c(z8.p());
                z8.U(1);
                if (n8 == 0) {
                    z8.U(1);
                    n9 = n8 = 0;
                } else {
                    n8 = z8.G();
                    n9 = n8 & 15;
                    n8 = (n8 & 240) >> 4;
                }
                boolean bl = z8.G() == 1;
                n10 = z8.G();
                byte[] arrby2 = new byte[16];
                z8.l(arrby2, 0, 16);
                byte[] arrby3 = arrby;
                if (bl) {
                    arrby3 = arrby;
                    if (n10 == 0) {
                        n11 = z8.G();
                        arrby3 = new byte[n11];
                        z8.l(arrby3, 0, n11);
                    }
                }
                return new t(bl, string2, n10, arrby2, n8, n9, arrby3);
            }
            n10 += n11;
        } while (true);
        return null;
    }

    public static v w(s s8, a.a arrl, E arrl2) {
        block47 : {
            boolean bl;
            long l8;
            Object object;
            c c8;
            long l9;
            int n8;
            Object object2;
            long l10;
            int[] arrn;
            int n9;
            block46 : {
                block45 : {
                    object2 = arrl.g(1937011578);
                    if (object2 == null) break block45;
                    c8 = new e((a.b)object2, s8.f);
                    break block46;
                }
                object2 = arrl.g(1937013298);
                if (object2 == null) break block47;
                c8 = new f((a.b)object2);
            }
            int n10 = c8.b();
            if (n10 == 0) {
                return new v(s8, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            }
            object2 = arrl.g(1937007471);
            if (object2 == null) {
                object2 = (a.b)g0.a.e(arrl.g(1668232756));
                bl = true;
            } else {
                bl = false;
            }
            Object object3 = object2.b;
            long[] arrl3 = ((a.b)g0.a.e((Object)arrl.g((int)1937011555))).b;
            int[] arrn2 = ((a.b)g0.a.e((Object)arrl.g((int)1937011827))).b;
            object2 = arrl.g(1937011571);
            object2 = object2 != null ? object2.b : null;
            arrl = arrl.g(1668576371);
            int[] arrn3 = arrl != null ? arrl.b : null;
            Object object4 = new a((z)arrl3, (z)object3, bl);
            arrn2.T(12);
            int n11 = arrn2.K() - 1;
            int n12 = arrn2.K();
            int n13 = arrn2.K();
            if (arrn3 != null) {
                arrn3.T(12);
                n9 = arrn3.K();
            } else {
                n9 = 0;
            }
            if (object2 != null) {
                object2.T(12);
                n8 = object2.K();
                if (n8 > 0) {
                    object = object2.K() - 1;
                } else {
                    object = -1;
                    object2 = null;
                }
            } else {
                object = -1;
                n8 = 0;
            }
            int n14 = c8.a();
            arrl = s8.f.n;
            int n15 = n14 != -1 && ("audio/raw".equals((Object)arrl) || "audio/g711-mlaw".equals((Object)arrl) || "audio/g711-alaw".equals((Object)arrl)) && n11 == 0 && n9 == 0 && n8 == 0 ? 1 : 0;
            if (n15 != 0) {
                object = object4.a;
                arrl = new long[object];
                object2 = new int[object];
                while (object4.a()) {
                    object = object4.b;
                    arrl[object] = object4.d;
                    object2[object] = object4.c;
                }
                arrn3 = Z0.e.a(n14, arrl, (int[])object2, n13);
                c8 = arrn3.a;
                object3 = arrn3.b;
                object = arrn3.c;
                object2 = arrn3.d;
                arrl = arrn3.e;
                l8 = arrn3.f;
                n15 = n10;
            } else {
                int n16;
                int n17;
                int n18;
                block44 : {
                    block43 : {
                        object3 = new long[n10];
                        arrl3 = new int[n10];
                        arrn = new long[n10];
                        arrl = new int[n10];
                        int n19 = object;
                        int n20 = 0;
                        n14 = 0;
                        int n21 = 0;
                        n16 = 0;
                        n18 = 0;
                        l10 = 0L;
                        l8 = 0L;
                        object = n9;
                        n15 = n12;
                        n17 = n8;
                        n8 = n16;
                        n12 = n21;
                        n9 = n10;
                        n10 = n20;
                        while (n10 < n9) {
                            boolean bl2;
                            bl = true;
                            do {
                                bl2 = bl;
                                if (n12 != 0) break;
                                bl2 = bl = object4.a();
                                if (!bl) break;
                                l8 = object4.d;
                                n12 = object4.c;
                            } while (true);
                            n16 = n15;
                            if (!bl2) {
                                o.h("AtomParsers", "Unexpected end of chunk data");
                                object3 = Arrays.copyOf((long[])object3, (int)n10);
                                c8 = Arrays.copyOf((int[])arrl3, (int)n10);
                                object2 = Arrays.copyOf((long[])arrn, (int)n10);
                                arrl = Arrays.copyOf((int[])arrl, (int)n10);
                                n9 = n10;
                                n15 = n12;
                                break block43;
                            }
                            n21 = object;
                            n15 = n8;
                            n20 = n18;
                            if (arrn3 != null) {
                                while (n18 == 0 && object > 0) {
                                    n18 = arrn3.K();
                                    n8 = arrn3.p();
                                    --object;
                                }
                                n20 = n18 - 1;
                                n15 = n8;
                                n21 = object;
                            }
                            object3[n10] = l8;
                            object = c8.c();
                            arrl3[n10] = object;
                            n18 = n14;
                            if (object > n14) {
                                n18 = object;
                            }
                            arrn[n10] = l10 + (long)n15;
                            object = object2 == null ? 1 : 0;
                            arrl[n10] = (long)object;
                            object = n19;
                            int n22 = n17;
                            if (n10 == n19) {
                                arrl[n10] = 1;
                                n8 = n17 - 1;
                                object = n19;
                                n22 = n8;
                                if (n8 > 0) {
                                    object = ((z)g0.a.e(object2)).K() - 1;
                                    n22 = n8;
                                }
                            }
                            l10 += (long)n13;
                            n8 = n16 - 1;
                            if (n8 == 0 && n11 > 0) {
                                n8 = arrn2.K();
                                n14 = arrn2.p();
                                --n11;
                            } else {
                                n14 = n13;
                            }
                            l9 = (long)arrl3[n10];
                            ++n10;
                            l8 += l9;
                            n13 = n14;
                            --n12;
                            n16 = n15;
                            n19 = object;
                            n17 = n22;
                            n14 = n18;
                            n15 = n8;
                            object = n21;
                            n8 = n16;
                            n18 = n20;
                        }
                        n16 = n15;
                        n15 = n12;
                        object2 = arrn;
                        c8 = arrl3;
                    }
                    l8 = n8;
                    if (arrn3 != null) {
                        while (object > 0) {
                            if (arrn3.K() != 0) {
                                object = 0;
                                break block44;
                            }
                            arrn3.p();
                            --object;
                        }
                    }
                    object = 1;
                }
                if (n17 != 0 || n16 != 0 || n15 != 0 || n11 != 0 || n18 != 0 || object == 0) {
                    arrl3 = new StringBuilder();
                    arrl3.append("Inconsistent stbl box for track ");
                    arrl3.append(s8.a);
                    arrl3.append(": remainingSynchronizationSamples ");
                    arrl3.append(n17);
                    arrl3.append(", remainingSamplesAtTimestampDelta ");
                    arrl3.append(n16);
                    arrl3.append(", remainingSamplesInChunk ");
                    arrl3.append(n15);
                    arrl3.append(", remainingTimestampDeltaChanges ");
                    arrl3.append(n11);
                    arrl3.append(", remainingSamplesAtTimestampOffset ");
                    arrl3.append(n18);
                    arrn3 = object == 0 ? ", ctts invalid" : "";
                    arrl3.append((String)arrn3);
                    o.h("AtomParsers", arrl3.toString());
                }
                arrn3 = object3;
                object = n14;
                l8 = l10 + l8;
                object3 = c8;
                c8 = arrn3;
                n15 = n9;
            }
            object4 = s8;
            l10 = M.W0(l8, 1000000L, object4.c);
            arrn3 = object4.h;
            if (arrn3 == null) {
                M.X0((long[])object2, 1000000L, object4.c);
                return new v(s8, (long[])c8, (int[])object3, (int)object, (long[])object2, (int[])arrl, l10);
            }
            if (arrn3.length == 1 && object4.b == 1 && object2.length >= 2 && b.b((long[])object2, l8, l9 = ((long[])g0.a.e(object4.i))[0], l10 = l9 + M.W0(object4.h[0], object4.c, object4.d))) {
                l9 = M.W0(l9 - object2[0], object4.f.C, object4.c);
                l10 = M.W0(l8 - l10, object4.f.C, object4.c);
                if ((l9 != 0L || l10 != 0L) && l9 <= Integer.MAX_VALUE && l10 <= Integer.MAX_VALUE) {
                    arrl2.a = (int)l9;
                    arrl2.b = (int)l10;
                    M.X0((long[])object2, 1000000L, object4.c);
                    return new v(s8, (long[])c8, (int[])object3, (int)object, (long[])object2, (int[])arrl, M.W0(object4.h[0], 1000000L, object4.d));
                }
            }
            n9 = object;
            arrl2 = object4.h;
            if (arrl2.length == 1 && arrl2[0] == 0L) {
                l10 = ((long[])g0.a.e(object4.i))[0];
                for (object = 0; object < object2.length; ++object) {
                    object2[object] = (int)M.W0(object2[object] - l10, 1000000L, object4.c);
                }
                return new v(s8, (long[])c8, (int[])object3, n9, (long[])object2, (int[])arrl, M.W0(l8 - l10, 1000000L, object4.c));
            }
            bl = object4.b == 1;
            arrn2 = new int[arrl2.length];
            int[] arrn4 = new int[arrl2.length];
            arrn3 = (long[])g0.a.e(object4.i);
            object = 0;
            n12 = 0;
            n8 = 0;
            arrl2 = object3;
            for (n11 = 0; n11 < (object3 = object4.h).length; ++n11) {
                l8 = arrn3[n11];
                if (l8 != -1L) {
                    l10 = M.W0(object3[n11], object4.c, object4.d);
                    arrn2[n11] = M.h((long[])object2, l8, true, true);
                    arrn4[n11] = M.d((long[])object2, l8 + l10, bl, false);
                    while ((n14 = arrn2[n11]) < (n10 = arrn4[n11]) && (arrl[n14] & true) == 0) {
                        arrn2[n11] = n14 + 1;
                    }
                    n12 += n10 - n14;
                    n8 = n8 != n14 ? 1 : 0;
                    n8 = object | n8;
                    object = n10;
                } else {
                    n10 = object;
                    object = n8;
                    n8 = n10;
                }
                n10 = n8;
                n8 = object;
                object = n10;
            }
            n11 = 0;
            n8 = 1;
            if (n12 == n15) {
                n8 = 0;
            }
            n10 = object | n8;
            arrl3 = n10 != 0 ? new long[n12] : c8;
            arrn = n10 != 0 ? new int[n12] : arrl2;
            object = n10 != 0 ? 0 : n9;
            arrn3 = n10 != 0 ? new int[n12] : arrl;
            long[] arrl4 = new long[n12];
            l8 = 0L;
            n9 = 0;
            object3 = arrl2;
            arrl2 = arrl;
            arrl = arrn3;
            n8 = n11;
            arrn3 = arrn4;
            while (n8 < object4.h.length) {
                l9 = object4.i[n8];
                n12 = arrn2[n8];
                n15 = (int)arrn3[n8];
                if (n10 != 0) {
                    n11 = n15 - n12;
                    System.arraycopy((Object)c8, (int)n12, (Object)arrl3, (int)n9, (int)n11);
                    System.arraycopy((Object)object3, (int)n12, (Object)arrn, (int)n9, (int)n11);
                    System.arraycopy((Object)arrl2, (int)n12, (Object)arrl, (int)n9, (int)n11);
                }
                while (n12 < n15) {
                    long l11 = M.W0(l8, 1000000L, object4.d);
                    l10 = M.W0(object2[n12] - l9, 1000000L, object4.c);
                    if (b.c(object4.b)) {
                        l10 = Math.max((long)0L, (long)l10);
                    }
                    arrl4[n9] = l11 + l10;
                    if (n10 != 0 && arrn[n9] > object) {
                        object = object3[n12];
                    }
                    ++n9;
                    ++n12;
                }
                l10 = object4.h[n8];
                ++n8;
                l8 += l10;
            }
            return new v(s8, arrl3, arrn, (int)object, arrl4, (int[])arrl, M.W0(l8, 1000000L, object4.d));
        }
        throw A.a("Track has no sample table size information", null);
    }

    public static d x(z z8, int n8, int n9, String string2, m m8, boolean bl) {
        z8.T(12);
        int n10 = z8.p();
        d d8 = new d(n10);
        for (int i8 = 0; i8 < n10; ++i8) {
            int n11 = z8.f();
            int n12 = z8.p();
            boolean bl2 = n12 > 0;
            u.a(bl2, "childAtomSize must be positive");
            int n13 = z8.p();
            if (n13 != 1635148593 && n13 != 1635148595 && n13 != 1701733238 && n13 != 1831958048 && n13 != 1836070006 && n13 != 1752589105 && n13 != 1751479857 && n13 != 1932670515 && n13 != 1211250227 && n13 != 1987063864 && n13 != 1987063865 && n13 != 1635135537 && n13 != 1685479798 && n13 != 1685479729 && n13 != 1685481573 && n13 != 1685481521) {
                if (n13 != 1836069985 && n13 != 1701733217 && n13 != 1633889587 && n13 != 1700998451 && n13 != 1633889588 && n13 != 1835823201 && n13 != 1685353315 && n13 != 1685353317 && n13 != 1685353320 && n13 != 1685353324 && n13 != 1685353336 && n13 != 1935764850 && n13 != 1935767394 && n13 != 1819304813 && n13 != 1936684916 && n13 != 1953984371 && n13 != 778924082 && n13 != 778924083 && n13 != 1835557169 && n13 != 1835560241 && n13 != 1634492771 && n13 != 1634492791 && n13 != 1970037111 && n13 != 1332770163 && n13 != 1716281667) {
                    if (n13 != 1414810956 && n13 != 1954034535 && n13 != 2004251764 && n13 != 1937010800 && n13 != 1664495672) {
                        if (n13 == 1835365492) {
                            b.q(z8, n13, n11, n8, d8);
                        } else if (n13 == 1667329389) {
                            d8.b = new q.b().Z(n8).o0("application/x-camera-motion").K();
                        }
                    } else {
                        b.y(z8, n13, n11, n12, n8, string2, d8);
                    }
                } else {
                    b.g(z8, n13, n11, n12, n8, string2, bl, m8, d8, i8);
                }
            } else {
                b.E(z8, n13, n11, n12, n8, n9, m8, d8, i8);
            }
            z8.T(n11 + n12);
        }
        return d8;
    }

    public static void y(z object, int n8, int n9, int n10, int n11, String string2, d d8) {
        block7 : {
            long l8;
            Object object2;
            block3 : {
                block6 : {
                    String string3;
                    block5 : {
                        block4 : {
                            block2 : {
                                object.T(n9 + 16);
                                string3 = "application/ttml+xml";
                                object2 = null;
                                l8 = Long.MAX_VALUE;
                                if (n8 != 1414810956) break block2;
                                object = string3;
                                break block3;
                            }
                            if (n8 != 1954034535) break block4;
                            n8 = n10 - 16;
                            object2 = new byte[n8];
                            object.l((byte[])object2, 0, n8);
                            object2 = X2.v.Z(object2);
                            object = "application/x-quicktime-tx3g";
                            break block3;
                        }
                        if (n8 != 2004251764) break block5;
                        object = "application/x-mp4-vtt";
                        break block3;
                    }
                    if (n8 != 1937010800) break block6;
                    l8 = 0L;
                    object = string3;
                    break block3;
                }
                if (n8 != 1664495672) break block7;
                d8.d = 1;
                object = "application/x-mp4-cea-608";
            }
            d8.b = new q.b().Z(n11).o0((String)object).e0(string2).s0(l8).b0((List)object2).K();
            return;
        }
        throw new IllegalStateException();
    }

    public static g z(z z8) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        long l8;
        block12 : {
            long l9;
            n11 = 8;
            z8.T(8);
            n12 = Z0.a.c(z8.p());
            n9 = n12 == 0 ? 8 : 16;
            z8.U(n9);
            n8 = z8.p();
            z8.U(4);
            n13 = z8.f();
            n9 = n11;
            if (n12 == 0) {
                n9 = 4;
            }
            n10 = 0;
            n11 = 0;
            do {
                l9 = -9223372036854775807L;
                if (n11 >= n9) break;
                if (z8.e()[n13 + n11] != -1) {
                    l8 = n12 == 0 ? z8.I() : z8.L();
                    if (l8 == 0L) {
                        l8 = l9;
                    }
                    break block12;
                }
                ++n11;
            } while (true);
            z8.U(n9);
            l8 = l9;
        }
        z8.U(16);
        n11 = z8.p();
        n12 = z8.p();
        z8.U(4);
        n13 = z8.p();
        int n14 = z8.p();
        if (n11 == 0 && n12 == 65536 && n13 == -65536 && n14 == 0) {
            n9 = 90;
        } else if (n11 == 0 && n12 == -65536 && n13 == 65536 && n14 == 0) {
            n9 = 270;
        } else {
            n9 = n10;
            if (n11 == -65536) {
                n9 = n10;
                if (n12 == 0) {
                    n9 = n10;
                    if (n13 == 0) {
                        n9 = n10;
                        if (n14 == -65536) {
                            n9 = 180;
                        }
                    }
                }
            }
        }
        return new g(n8, l8, n9);
    }

    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final z f;
        public final z g;
        public int h;
        public int i;

        public a(z z8, z z9, boolean bl) {
            this.g = z8;
            this.f = z9;
            this.e = bl;
            z9.T(12);
            this.a = z9.K();
            z8.T(12);
            this.i = z8.K();
            int n8 = z8.p();
            bl = true;
            if (n8 != 1) {
                bl = false;
            }
            u.a(bl, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int n8;
            this.b = n8 = this.b + 1;
            if (n8 == this.a) {
                return false;
            }
            long l8 = this.e ? this.f.L() : this.f.I();
            this.d = l8;
            if (this.b == this.h) {
                this.c = this.g.K();
                this.g.U(4);
                this.i = n8 = this.i - 1;
                n8 = n8 > 0 ? this.g.K() - 1 : -1;
                this.h = n8;
            }
            return true;
        }
    }

    public static final class b {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public b(String string2, byte[] arrby, long l8, long l9) {
            this.a = string2;
            this.b = arrby;
            this.c = l8;
            this.d = l9;
        }
    }

    public static interface c {
        public int a();

        public int b();

        public int c();
    }

    public static final class d {
        public final t[] a;
        public d0.q b;
        public int c;
        public int d;

        public d(int n8) {
            this.a = new t[n8];
            this.d = 0;
        }
    }

    public static final class e
    implements c {
        public final int a;
        public final int b;
        public final z c;

        public e(a.b object, d0.q q8) {
            int n8;
            int n9;
            block4 : {
                int n10;
                block5 : {
                    this.c = object = object.b;
                    object.T(12);
                    n9 = n8 = object.K();
                    if (!"audio/raw".equals((Object)q8.n)) break block4;
                    n10 = M.g0(q8.D, q8.B);
                    if (n8 == 0) break block5;
                    n9 = n8;
                    if (n8 % n10 == 0) break block4;
                }
                q8 = new StringBuilder();
                q8.append("Audio sample size mismatch. stsd sample size: ");
                q8.append(n10);
                q8.append(", stsz sample size: ");
                q8.append(n8);
                o.h("AtomParsers", q8.toString());
                n9 = n10;
            }
            n8 = n9;
            if (n9 == 0) {
                n8 = -1;
            }
            this.a = n8;
            this.b = object.K();
        }

        @Override
        public int a() {
            return this.a;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public int c() {
            int n8;
            int n9 = n8 = this.a;
            if (n8 == -1) {
                n9 = this.c.K();
            }
            return n9;
        }
    }

    public static final class f
    implements c {
        public final z a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public f(a.b object) {
            this.a = object = object.b;
            object.T(12);
            this.c = object.K() & 255;
            this.b = object.K();
        }

        @Override
        public int a() {
            return -1;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public int c() {
            int n8 = this.c;
            if (n8 == 8) {
                return this.a.G();
            }
            if (n8 == 16) {
                return this.a.M();
            }
            n8 = this.d;
            this.d = n8 + 1;
            if (n8 % 2 == 0) {
                this.e = n8 = this.a.G();
                return (n8 & 240) >> 4;
            }
            return this.e & 15;
        }
    }

    public static final class g {
        public final int a;
        public final long b;
        public final int c;

        public g(int n8, long l8, int n9) {
            this.a = n8;
            this.b = l8;
            this.c = n9;
        }
    }

}

