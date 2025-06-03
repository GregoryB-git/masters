package F0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class K {
    public static List a(byte[] bArr) {
        long k7 = k(f(bArr));
        long k8 = k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(k7));
        arrayList.add(b(k8));
        return arrayList;
    }

    public static byte[] b(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static long d(byte b7, byte b8) {
        int i7;
        int i8 = b7 & 255;
        int i9 = b7 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b8 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        return i7 * (i10 >= 16 ? 2500 << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean g(long j7, long j8) {
        return j7 - j8 <= k(3840L) / 1000;
    }

    public static int h(ByteBuffer byteBuffer) {
        int i7 = i(byteBuffer);
        int i8 = byteBuffer.get(i7 + 26) + 27 + i7;
        return (int) ((d(byteBuffer.get(i8), byteBuffer.limit() - i8 > 1 ? byteBuffer.get(i8 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b7 = byteBuffer.get(26);
        int i7 = 28;
        int i8 = 28;
        for (int i9 = 0; i9 < b7; i9++) {
            i8 += byteBuffer.get(i9 + 27);
        }
        byte b8 = byteBuffer.get(i8 + 26);
        for (int i10 = 0; i10 < b8; i10++) {
            i7 += byteBuffer.get(i8 + 27 + i10);
        }
        return i8 + i7;
    }

    public static int j(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long k(long j7) {
        return (j7 * 1000000000) / 48000;
    }
}
