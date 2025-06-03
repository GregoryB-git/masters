/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package F0;

import F0.V;
import X2.v;
import android.util.Base64;
import d0.A;
import d0.x;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class W {
    public static int[] a(int n8) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 6) {
                    if (n8 != 7) {
                        if (n8 != 8) {
                            return null;
                        }
                        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                    }
                    return new int[]{0, 2, 1, 6, 5, 3, 4};
                }
                return new int[]{0, 2, 1, 5, 3, 4};
            }
            return new int[]{0, 2, 1, 3, 4};
        }
        return new int[]{0, 2, 1};
    }

    public static int b(int n8) {
        int n9 = 0;
        while (n8 > 0) {
            ++n9;
            n8 >>>= 1;
        }
        return n9;
    }

    public static long c(long l8, long l9) {
        return (long)Math.floor((double)Math.pow((double)l8, (double)(1.0 / (double)l9)));
    }

    public static x d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            String string2 = (String)list.get(i8);
            StringBuilder stringBuilder = M.c1(string2, "=");
            if (stringBuilder.length != 2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse Vorbis comment: ");
                stringBuilder.append(string2);
                o.h("VorbisUtil", stringBuilder.toString());
                continue;
            }
            if (stringBuilder[0].equals((Object)"METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add((Object)R0.a.a(new z(Base64.decode((String)stringBuilder[1], (int)0))));
                }
                catch (RuntimeException runtimeException) {
                    o.i("VorbisUtil", "Failed to parse vorbis picture", (Throwable)runtimeException);
                }
                continue;
            }
            arrayList.add((Object)new W0.a((String)stringBuilder[0], (String)stringBuilder[1]));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List)arrayList);
    }

    public static v e(byte[] arrby) {
        byte[] arrby2 = new byte[](arrby);
        arrby2.U(1);
        int n8 = 0;
        while (arrby2.a() > 0 && arrby2.j() == 255) {
            n8 += 255;
            arrby2.U(1);
        }
        int n9 = n8 + arrby2.G();
        n8 = 0;
        while (arrby2.a() > 0 && arrby2.j() == 255) {
            n8 += 255;
            arrby2.U(1);
        }
        int n10 = arrby2.G();
        byte[] arrby3 = new byte[n9];
        int n11 = arrby2.f();
        System.arraycopy((Object)arrby, (int)n11, (Object)arrby3, (int)0, (int)n9);
        n8 = n11 + n9 + (n8 + n10);
        n9 = arrby.length - n8;
        arrby2 = new byte[n9];
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)0, (int)n9);
        return v.a0(arrby3, arrby2);
    }

    public static void f(V v8) {
        int n8 = v8.d(6);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            int n9;
            int n10 = v8.d(16);
            if (n10 != 0) {
                if (n10 == 1) {
                    int n11;
                    int n12;
                    int n13 = v8.d(5);
                    int[] arrn = new int[n13];
                    n9 = -1;
                    for (n10 = 0; n10 < n13; ++n10) {
                        arrn[n10] = n12 = v8.d(4);
                        n11 = n9;
                        if (n12 > n9) {
                            n11 = n12;
                        }
                        n9 = n11;
                    }
                    n11 = n9 + 1;
                    int[] arrn2 = new int[n11];
                    for (n10 = 0; n10 < n11; ++n10) {
                        arrn2[n10] = v8.d(3) + 1;
                        n12 = v8.d(2);
                        if (n12 > 0) {
                            v8.e(8);
                        }
                        for (n9 = 0; n9 < 1 << n12; ++n9) {
                            v8.e(8);
                        }
                    }
                    v8.e(2);
                    int n14 = v8.d(4);
                    n9 = n10 = (n11 = 0);
                    n12 = n10;
                    for (n10 = n11; n10 < n13; ++n10) {
                        while (n9 < (n12 += arrn2[arrn[n10]])) {
                            v8.e(n14);
                            ++n9;
                        }
                    }
                    continue;
                }
                v8 = new StringBuilder();
                v8.append("floor type greater than 1 not decodable: ");
                v8.append(n10);
                throw A.a(v8.toString(), null);
            }
            v8.e(8);
            v8.e(16);
            v8.e(16);
            v8.e(6);
            v8.e(8);
            n9 = v8.d(4);
            for (n10 = 0; n10 < n9 + 1; ++n10) {
                v8.e(8);
            }
        }
    }

    public static void g(int n8, V v8) {
        int n9 = v8.d(6);
        for (int i8 = 0; i8 < n9 + 1; ++i8) {
            int n10;
            int n11 = v8.d(16);
            if (n11 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mapping type other than 0 not supported: ");
                stringBuilder.append(n11);
                o.c("VorbisUtil", stringBuilder.toString());
                continue;
            }
            n11 = v8.c() ? v8.d(4) + 1 : 1;
            if (v8.c()) {
                int n12 = v8.d(8);
                for (n10 = 0; n10 < n12 + 1; ++n10) {
                    int n13 = n8 - 1;
                    v8.e(W.b(n13));
                    v8.e(W.b(n13));
                }
            }
            if (v8.d(2) == 0) {
                if (n11 > 1) {
                    for (n10 = 0; n10 < n8; ++n10) {
                        v8.e(4);
                    }
                }
                for (n10 = 0; n10 < n11; ++n10) {
                    v8.e(8);
                    v8.e(8);
                    v8.e(8);
                }
                continue;
            }
            throw A.a("to reserved bits must be zero after mapping coupling steps", null);
        }
    }

    public static b[] h(V v8) {
        int n8 = v8.d(6) + 1;
        b[] arrb = new b[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrb[i8] = new b(v8.c(), v8.d(16), v8.d(16), v8.d(8));
        }
        return arrb;
    }

    public static void i(V v8) {
        int n8 = v8.d(6);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            if (v8.d(16) <= 2) {
                int n9;
                int n10;
                v8.e(24);
                v8.e(24);
                v8.e(24);
                int n11 = v8.d(6) + 1;
                v8.e(8);
                int[] arrn = new int[n11];
                for (n9 = 0; n9 < n11; ++n9) {
                    int n12 = v8.d(3);
                    n10 = v8.c() ? v8.d(5) : 0;
                    arrn[n9] = n10 * 8 + n12;
                }
                for (n9 = 0; n9 < n11; ++n9) {
                    for (n10 = 0; n10 < 8; ++n10) {
                        if ((arrn[n9] & 1 << n10) == 0) continue;
                        v8.e(8);
                    }
                }
                continue;
            }
            throw A.a("residueType greater than 2 is not decodable", null);
        }
    }

    public static a j(z z8) {
        return W.k(z8, true, true);
    }

    public static a k(z z8, boolean bl, boolean bl2) {
        int n8 = 0;
        if (bl) {
            W.o(3, z8, false);
        }
        String string2 = z8.D((int)z8.w());
        int n9 = string2.length();
        long l8 = z8.w();
        String[] arrstring = new String[(int)l8];
        n9 += 15;
        while ((long)n8 < l8) {
            String string3;
            arrstring[n8] = string3 = z8.D((int)z8.w());
            n9 = n9 + 4 + string3.length();
            ++n8;
        }
        if (bl2 && (z8.G() & 1) == 0) {
            throw A.a("framing bit expected to be set", null);
        }
        return new a(string2, arrstring, n9 + 1);
    }

    public static c l(z z8) {
        int n8;
        int n9;
        int n10;
        boolean bl = true;
        W.o(1, z8, false);
        int n11 = z8.x();
        int n12 = z8.G();
        int n13 = z8.x();
        int n14 = n8 = z8.t();
        if (n8 <= 0) {
            n14 = -1;
        }
        n8 = n9 = z8.t();
        if (n9 <= 0) {
            n8 = -1;
        }
        n9 = n10 = z8.t();
        if (n10 <= 0) {
            n9 = -1;
        }
        int n15 = z8.G();
        n10 = (int)Math.pow((double)2.0, (double)(n15 & 15));
        n15 = (int)Math.pow((double)2.0, (double)((n15 & 240) >> 4));
        if ((z8.G() & 1) <= 0) {
            bl = false;
        }
        return new c(n11, n12, n13, n14, n8, n9, n10, n15, bl, Arrays.copyOf((byte[])z8.e(), (int)z8.g()));
    }

    public static b[] m(z arrb, int n8) {
        int n9;
        int n10 = 0;
        W.o(5, (z)arrb, false);
        int n11 = arrb.G();
        V v8 = new V(arrb.e());
        v8.e(arrb.f() * 8);
        for (n9 = 0; n9 < n11 + 1; ++n9) {
            W.n(v8);
        }
        n11 = v8.d(6);
        for (n9 = n10; n9 < n11 + 1; ++n9) {
            if (v8.d(16) == 0) {
                continue;
            }
            throw A.a("placeholder of time domain transforms not zeroed out", null);
        }
        W.f(v8);
        W.i(v8);
        W.g(n8, v8);
        arrb = W.h(v8);
        if (v8.c()) {
            return arrb;
        }
        throw A.a("framing bit after modes not set as expected", null);
    }

    public static void n(V v8) {
        if (v8.d(24) == 5653314) {
            int n8;
            int n9 = v8.d(16);
            int n10 = v8.d(24);
            boolean bl = v8.c();
            int n11 = 0;
            if (!bl) {
                bl = v8.c();
                for (n8 = 0; n8 < n10; ++n8) {
                    if (bl && !v8.c()) continue;
                    v8.e(5);
                }
            } else {
                v8.e(5);
                for (n8 = n11; n8 < n10; n8 += v8.d((int)W.b((int)(n10 - n8)))) {
                }
            }
            if ((n8 = v8.d(4)) <= 2) {
                if (n8 == 1 || n8 == 2) {
                    long l8;
                    v8.e(32);
                    v8.e(32);
                    n11 = v8.d(4);
                    v8.e(1);
                    if (n8 == 1) {
                        l8 = n9 != 0 ? W.c(n10, n9) : 0L;
                    } else {
                        l8 = n10;
                        l8 = (long)n9 * l8;
                    }
                    v8.e((int)(l8 * (long)(n11 + 1)));
                }
                return;
            }
            v8 = new StringBuilder();
            v8.append("lookup type greater than 2 not decodable: ");
            v8.append(n8);
            throw A.a(v8.toString(), null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        stringBuilder.append(v8.b());
        throw A.a(stringBuilder.toString(), null);
    }

    public static boolean o(int n8, z z8, boolean bl) {
        if (z8.a() < 7) {
            if (bl) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("too short header: ");
            stringBuilder.append(z8.a());
            throw A.a(stringBuilder.toString(), null);
        }
        if (z8.G() != n8) {
            if (bl) {
                return false;
            }
            z8 = new StringBuilder();
            z8.append("expected header type ");
            z8.append(Integer.toHexString((int)n8));
            throw A.a(z8.toString(), null);
        }
        if (z8.G() == 118 && z8.G() == 111 && z8.G() == 114 && z8.G() == 98 && z8.G() == 105 && z8.G() == 115) {
            return true;
        }
        if (bl) {
            return false;
        }
        throw A.a("expected characters 'vorbis'", null);
    }

    public static final class a {
        public final String a;
        public final String[] b;
        public final int c;

        public a(String string2, String[] arrstring, int n8) {
            this.a = string2;
            this.b = arrstring;
            this.c = n8;
        }
    }

    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public b(boolean bl, int n8, int n9, int n10) {
            this.a = bl;
            this.b = n8;
            this.c = n9;
            this.d = n10;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public c(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, boolean bl, byte[] arrby) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = n15;
            this.i = bl;
            this.j = arrby;
        }
    }

}

