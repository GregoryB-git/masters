/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayList
 *  java.util.List
 */
package F0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public abstract class K {
    public static List a(byte[] arrby) {
        long l8 = K.k(K.f(arrby));
        long l9 = K.k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)arrby);
        arrayList.add((Object)K.b(l8));
        arrayList.add((Object)K.b(l9));
        return arrayList;
    }

    public static byte[] b(long l8) {
        return ByteBuffer.allocate((int)8).order(ByteOrder.nativeOrder()).putLong(l8).array();
    }

    public static int c(byte[] arrby) {
        return arrby[9] & 255;
    }

    public static long d(byte by, byte by2) {
        int n8;
        int n9 = by & 3;
        if (n9 != 0) {
            int n10;
            n8 = n10 = 2;
            if (n9 != 1) {
                n8 = n10;
                if (n9 != 2) {
                    n8 = by2 & 63;
                }
            }
        } else {
            n8 = 1;
        }
        by = (byte)((by & 255) >> 3);
        by2 = (byte)(by & 3);
        by = by >= 16 ? (byte)(2500 << by2) : (by >= 12 ? (byte)(10000 << (by & 1)) : (by2 == 3 ? (byte)60000 : (byte)(10000 << by2)));
        return (long)n8 * (long)by;
    }

    public static long e(byte[] arrby) {
        byte by = 0;
        byte by2 = arrby[0];
        if (arrby.length > 1) {
            by = arrby[1];
        }
        return K.d(by2, by);
    }

    public static int f(byte[] arrby) {
        byte by = arrby[11];
        return arrby[10] & 255 | (by & 255) << 8;
    }

    public static boolean g(long l8, long l9) {
        if (l8 - l9 <= K.k(3840L) / 1000L) {
            return true;
        }
        return false;
    }

    public static int h(ByteBuffer byteBuffer) {
        int n8 = K.i(byteBuffer);
        n8 = byteBuffer.get(n8 + 26) + 27 + n8;
        byte by = byteBuffer.get(n8);
        byte by2 = byteBuffer.limit() - n8 > 1 ? byteBuffer.get(n8 + 1) : 0;
        return (int)(K.d(by, by2) * 48000L / 1000000L);
    }

    public static int i(ByteBuffer byteBuffer) {
        int n8;
        int n9 = byteBuffer.get(5);
        int n10 = 0;
        if ((n9 & 2) == 0) {
            return 0;
        }
        int n11 = byteBuffer.get(26);
        int n12 = 28;
        n9 = 28;
        for (n8 = 0; n8 < n11; ++n8) {
            n9 += byteBuffer.get(n8 + 27);
        }
        n11 = byteBuffer.get(n9 + 26);
        for (n8 = n10; n8 < n11; ++n8) {
            n12 += byteBuffer.get(n9 + 27 + n8);
        }
        return n9 + n12;
    }

    public static int j(ByteBuffer byteBuffer) {
        byte by = 0;
        byte by2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            by = byteBuffer.get(1);
        }
        return (int)(K.d(by2, by) * 48000L / 1000000L);
    }

    public static long k(long l8) {
        return l8 * 1000000000L / 48000L;
    }
}

