/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.Arrays
 *  java.util.concurrent.atomic.AtomicInteger
 */
package F0;

import d0.A;
import d0.m;
import d0.q;
import g0.M;
import g0.y;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class p {
    public static final int[] a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = new int[]{8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = new int[]{5, 8, 10, 12};
    public static final int[] f = new int[]{6, 9, 12, 15};
    public static final int[] g = new int[]{2, 4, 6, 8};
    public static final int[] h = new int[]{9, 11, 13, 16};
    public static final int[] i = new int[]{5, 8, 10, 12};

    public static void a(byte[] arrby, int n8) {
        int n9 = n8 - 2;
        byte by = arrby[n9];
        if ((arrby[n8 - 1] & 255 | by << 8 & 65535) == M.v(arrby, 0, n9, 65535)) {
            return;
        }
        throw A.a("CRC check failed", null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(byte[] arrby) {
        int n8;
        int n9;
        int n10;
        block5 : {
            block3 : {
                block0 : {
                    block4 : {
                        block1 : {
                            block2 : {
                                n10 = 0;
                                n9 = arrby[0];
                                if (n9 == -2) break block0;
                                if (n9 == -1) break block1;
                                if (n9 == 31) break block2;
                                n9 = (arrby[5] & 3) << 12 | (arrby[6] & 255) << 4;
                                n8 = arrby[7];
                                break block3;
                            }
                            n9 = (arrby[6] & 3) << 12 | (arrby[7] & 255) << 4;
                            n8 = arrby[8];
                            break block4;
                        }
                        n9 = (arrby[7] & 3) << 12 | (arrby[6] & 255) << 4;
                        n8 = arrby[9];
                    }
                    n9 = ((n8 & 60) >> 2 | n9) + 1;
                    n8 = 1;
                    break block5;
                }
                n9 = (arrby[4] & 3) << 12 | (arrby[7] & 255) << 4;
                n8 = arrby[6];
            }
            n9 = ((n8 & 240) >> 4 | n9) + 1;
            n8 = n10;
        }
        n10 = n9;
        if (n8 == 0) return n10;
        return n9 * 16 / 14;
    }

    public static int c(int n8) {
        if (n8 != 2147385345 && n8 != -25230976 && n8 != 536864768 && n8 != -14745368) {
            if (n8 != 1683496997 && n8 != 622876772) {
                if (n8 != 1078008818 && n8 != -233094848) {
                    if (n8 != 1908687592 && n8 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static y d(byte[] arrby) {
        int n8 = arrby[0];
        if (n8 != 127 && n8 != 100 && n8 != 64 && n8 != 113) {
            if (p.e(arrby = Arrays.copyOf((byte[])arrby, (int)arrby.length))) {
                for (n8 = 0; n8 < arrby.length - 1; n8 += 2) {
                    byte by = arrby[n8];
                    int n9 = n8 + 1;
                    arrby[n8] = arrby[n9];
                    arrby[n9] = by;
                }
            }
            y y8 = new y(arrby);
            if (arrby[0] == 31) {
                y y9 = new y(arrby);
                while (y9.b() >= 16) {
                    y9.r(2);
                    y8.f(y9.h(14), 14);
                }
            }
            y8.n(arrby);
            return y8;
        }
        return new y(arrby);
    }

    public static boolean e(byte[] arrby) {
        boolean bl = false;
        byte by = arrby[0];
        if (by == -2 || by == -1 || by == 37 || by == -14 || by == -24) {
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int f(ByteBuffer byteBuffer) {
        int n8;
        int n9;
        block5 : {
            block2 : {
                block6 : {
                    block3 : {
                        block4 : {
                            if (byteBuffer.getInt(0) == -233094848) return 1024;
                            if (byteBuffer.getInt(0) == -398277519) {
                                return 1024;
                            }
                            if (byteBuffer.getInt(0) == 622876772) {
                                return 4096;
                            }
                            n8 = byteBuffer.position();
                            n9 = byteBuffer.get(n8);
                            if (n9 == -2) break block2;
                            if (n9 == -1) break block3;
                            if (n9 == 31) break block4;
                            n9 = (byteBuffer.get(n8 + 4) & 1) << 6;
                            n8 += 5;
                            break block5;
                        }
                        n9 = (byteBuffer.get(n8 + 5) & 7) << 4;
                        n8 += 6;
                        break block6;
                    }
                    n9 = (byteBuffer.get(n8 + 4) & 7) << 4;
                    n8 += 7;
                }
                n8 = byteBuffer.get(n8) & 60;
                return ((n8 >> 2 | n9) + 1) * 32;
            }
            n9 = (byteBuffer.get(n8 + 5) & 1) << 6;
            n8 += 4;
        }
        n8 = byteBuffer.get(n8) & 252;
        return ((n8 >> 2 | n9) + 1) * 32;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int g(byte[] arrby) {
        int n8;
        int n9 = arrby[0];
        if (n9 != -2) {
            if (n9 != -1) {
                if (n9 != 31) {
                    n9 = (arrby[4] & 1) << 6;
                    n8 = arrby[5];
                    return (((n8 &= 252) >> 2 | n9) + 1) * 32;
                }
                n9 = (arrby[5] & 7) << 4;
                n8 = arrby[6];
                return (((n8 &= 60) >> 2 | n9) + 1) * 32;
            }
            n9 = (arrby[4] & 7) << 4;
            n8 = arrby[7];
            return (((n8 &= 60) >> 2 | n9) + 1) * 32;
        }
        n9 = (arrby[5] & 1) << 6;
        n8 = arrby[4];
        return (((n8 &= 252) >> 2 | n9) + 1) * 32;
    }

    public static q h(byte[] object, String string2, String string3, int n8, m m8) {
        object = p.d((byte[])object);
        object.r(60);
        int n9 = object.h(6);
        int n10 = a[n9];
        n9 = object.h(4);
        int n11 = b[n9];
        n9 = object.h(5);
        int[] arrn = c;
        n9 = n9 >= arrn.length ? -1 : arrn[n9] * 1000 / 2;
        object.r(10);
        int n12 = object.h(2) > 0 ? 1 : 0;
        return new q.b().a0(string2).o0("audio/vnd.dts").M(n9).N(n10 + n12).p0(n11).U(m8).e0(string3).m0(n8).K();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b i(byte[] object) {
        int n8;
        int n9;
        int n10;
        int n11;
        long l8;
        object = p.d((byte[])object);
        object.r(40);
        int n12 = object.h(2);
        if (!object.g()) {
            n11 = 16;
            n8 = 8;
        } else {
            n11 = 20;
            n8 = 12;
        }
        object.r(n8);
        int n13 = object.h(n11);
        boolean bl = object.g();
        n8 = 0;
        int n14 = 0;
        if (bl) {
            n9 = object.h(2);
            n10 = object.h(3);
            if (object.g()) {
                object.r(36);
            }
            n8 = object.h(3);
            int n15 = object.h(3);
            if (n8 + 1 != 1) throw A.d("Multiple audio presentations or assets not supported");
            if (n15 + 1 != 1) throw A.d("Multiple audio presentations or assets not supported");
            n15 = object.h(++n12);
            for (n8 = 0; n8 < n12; ++n8) {
                if ((n15 >> n8 & 1) != 1) continue;
                object.r(8);
            }
            if (object.g()) {
                object.r(2);
                n12 = object.h(2);
                n15 = object.h(2);
                for (n8 = n14; n8 < n15 + 1; ++n8) {
                    object.r(n12 + 1 << 2);
                }
            }
            n8 = (n10 + 1) * 512;
        } else {
            n9 = -1;
        }
        object.r(n11);
        object.r(12);
        if (bl) {
            if (object.g()) {
                object.r(4);
            }
            if (object.g()) {
                object.r(24);
            }
            if (object.g()) {
                object.s(object.h(10) + 1);
            }
            object.r(5);
            n10 = d[object.h(4)];
            n14 = object.h(8) + 1;
        } else {
            n10 = -2147483647;
            n14 = -1;
        }
        if (!bl) {
            l8 = -9223372036854775807L;
            return new b("audio/vnd.dts.hd;profile=lbr", n14, n10, n13 + 1, l8, 0, null);
        }
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    object = new StringBuilder();
                    object.append("Unsupported reference clock code in DTS HD header: ");
                    object.append(n9);
                    throw A.a(object.toString(), null);
                }
                n11 = 48000;
            } else {
                n11 = 44100;
            }
        } else {
            n11 = 32000;
        }
        l8 = M.W0(n8, 1000000L, n11);
        return new b("audio/vnd.dts.hd;profile=lbr", n14, n10, n13 + 1, l8, 0, null);
    }

    public static int j(byte[] object) {
        object = p.d((byte[])object);
        object.r(42);
        int n8 = object.g() ? 12 : 8;
        return object.h(n8) + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b k(byte[] stringBuilder, AtomicInteger atomicInteger) {
        int n8;
        long l8;
        int n9;
        y y8 = p.d((byte[])stringBuilder);
        int n10 = y8.h(32);
        int n11 = 0;
        int n12 = n10 == 1078008818 ? 1 : 0;
        int n13 = p.m(y8, e, true) + 1;
        if (n12 != 0) {
            if (!y8.g()) {
                throw A.d("Only supports full channel mask-based audio presentation");
            }
            p.a((byte[])stringBuilder, n13);
            n10 = y8.h(2);
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported base duration index in DTS UHD header: ");
                        stringBuilder.append(n10);
                        throw A.a(stringBuilder.toString(), null);
                    }
                    n10 = 384;
                } else {
                    n10 = 480;
                }
            } else {
                n10 = 512;
            }
            int n14 = y8.h(3);
            n8 = y8.h(2);
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported clock rate index in DTS UHD header: ");
                        stringBuilder.append(n8);
                        throw A.a(stringBuilder.toString(), null);
                    }
                    n8 = 48000;
                } else {
                    n8 = 44100;
                }
            } else {
                n8 = 32000;
            }
            if (y8.g()) {
                y8.r(36);
            }
            n9 = (1 << y8.h(2)) * n8;
            l8 = M.W0(n10 * (n14 + 1), 1000000L, n8);
            n10 = n9;
        } else {
            n10 = -2147483647;
            l8 = -9223372036854775807L;
        }
        n8 = n9 = 0;
        while (n9 < n12) {
            n8 += p.m(y8, f, true);
            ++n9;
        }
        if (n12 != 0) {
            atomicInteger.set(p.m(y8, g, true));
        }
        n12 = n11;
        if (atomicInteger.get() != 0) {
            n12 = p.m(y8, h, true);
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, n10, n13 + (n8 + n12), l8, 0, null);
    }

    public static int l(byte[] object) {
        object = p.d((byte[])object);
        object.r(32);
        return p.m((y)object, i, true) + 1;
    }

    public static int m(y y8, int[] arrn, boolean bl) {
        int n8;
        int n9 = 0;
        int n10 = 0;
        int n11 = n8 = 0;
        while (n8 < 3 && y8.g()) {
            ++n11;
            ++n8;
        }
        n8 = n9;
        if (bl) {
            n8 = 0;
            while (n10 < n11) {
                n8 += 1 << arrn[n10];
                ++n10;
            }
        }
        return n8 + y8.h(arrn[n11]);
    }

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        public b(String string2, int n8, int n9, int n10, long l8, int n11) {
            this.a = string2;
            this.c = n8;
            this.b = n9;
            this.d = n10;
            this.e = l8;
            this.f = n11;
        }

        public /* synthetic */ b(String string2, int n8, int n9, int n10, long l8, int n11,  a8) {
            this(string2, n8, n9, n10, l8, n11);
        }
    }

}

