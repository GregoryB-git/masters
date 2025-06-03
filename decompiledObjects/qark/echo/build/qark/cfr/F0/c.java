/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package F0;

import d0.m;
import d0.q;
import g0.y;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class c {
    public static final int[] a = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void a(int n8, z arrby) {
        arrby.P(7);
        arrby = arrby.e();
        arrby[0] = -84;
        arrby[1] = 64;
        arrby[2] = -1;
        arrby[3] = -1;
        arrby[4] = (byte)(n8 >> 16 & 255);
        arrby[5] = (byte)(n8 >> 8 & 255);
        arrby[6] = (byte)(n8 & 255);
    }

    public static q b(z z8, String string2, String string3, m m8) {
        z8.U(1);
        int n8 = (z8.G() & 32) >> 5 == 1 ? 48000 : 44100;
        return new q.b().a0(string2).o0("audio/ac4").N(2).p0(n8).U(m8).e0(string3).K();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] arrby = new byte[16];
        int n8 = byteBuffer.position();
        byteBuffer.get(arrby);
        byteBuffer.position(n8);
        return c.d((y)new y((byte[])arrby)).e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b d(y arrn) {
        int n8;
        int n9;
        int n10;
        int n11;
        block10 : {
            int n12;
            block13 : {
                int n13;
                block11 : {
                    block12 : {
                        n11 = arrn.h(16);
                        n10 = arrn.h(16);
                        if (n10 == 65535) {
                            n10 = arrn.h(24);
                            n8 = 7;
                        } else {
                            n8 = 4;
                        }
                        n8 = n10 += n8;
                        if (n11 == 44097) {
                            n8 = n10 + 2;
                        }
                        n11 = n10 = arrn.h(2);
                        if (n10 == 3) {
                            n11 = n10 + c.f((y)arrn, 2);
                        }
                        n10 = arrn.h(10);
                        if (arrn.g() && arrn.h(3) > 0) {
                            arrn.r(2);
                        }
                        n9 = arrn.g() ? 48000 : 44100;
                        n13 = arrn.h(4);
                        if (n9 == 44100 && n13 == 13) {
                            n10 = a[n13];
                            return new b(n11, 2, n9, n8, n10, null);
                        }
                        if (n9 != 48000 || n13 >= (arrn = a).length) break block10;
                        n12 = arrn[n13];
                        if ((n10 %= 5) == 1) break block11;
                        if (n10 == 2) break block12;
                        if (n10 == 3) break block11;
                        if (n10 != 4) {
                            n10 = n12;
                            return new b(n11, 2, n9, n8, n10, null);
                        }
                        if (n13 != 3 && n13 != 8) {
                            n10 = n12;
                            if (n13 != 11) return new b(n11, 2, n9, n8, n10, null);
                        }
                        break block13;
                    }
                    if (n13 != 8) {
                        n10 = n12;
                        if (n13 != 11) return new b(n11, 2, n9, n8, n10, null);
                    }
                    break block13;
                }
                if (n13 != 3) {
                    n10 = n12;
                    if (n13 != 8) return new b(n11, 2, n9, n8, n10, null);
                }
            }
            n10 = n12 + 1;
            return new b(n11, 2, n9, n8, n10, null);
        }
        n10 = 0;
        return new b(n11, 2, n9, n8, n10, null);
    }

    public static int e(byte[] arrby, int n8) {
        int n9 = arrby.length;
        int n10 = 7;
        if (n9 < 7) {
            return -1;
        }
        n9 = (arrby[2] & 255) << 8 | arrby[3] & 255;
        if (n9 == 65535) {
            n9 = (arrby[4] & 255) << 16 | (arrby[5] & 255) << 8 | arrby[6] & 255;
        } else {
            n10 = 4;
        }
        int n11 = n10;
        if (n8 == 44097) {
            n11 = n10 + 2;
        }
        return n9 + n11;
    }

    public static int f(y y8, int n8) {
        int n9 = 0;
        do {
            n9 += y8.h(n8);
            if (!y8.g()) {
                return n9;
            }
            n9 = n9 + 1 << n8;
        } while (true);
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(int n8, int n9, int n10, int n11, int n12) {
            this.a = n8;
            this.c = n9;
            this.b = n10;
            this.d = n11;
            this.e = n12;
        }

        public /* synthetic */ b(int n8, int n9, int n10, int n11, int n12,  a8) {
            this(n8, n9, n10, n11, n12);
        }
    }

}

