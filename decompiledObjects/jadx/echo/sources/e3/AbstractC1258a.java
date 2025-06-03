package e3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1258a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13941a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr, int i7, int i8, int i9, int i10) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int b7 = b(i11 ^ iArr[i10], 16);
        iArr[i10] = b7;
        int i12 = iArr[i9] + b7;
        iArr[i9] = i12;
        int b8 = b(iArr[i8] ^ i12, 12);
        iArr[i8] = b8;
        int i13 = iArr[i7] + b8;
        iArr[i7] = i13;
        int b9 = b(iArr[i10] ^ i13, 8);
        iArr[i10] = b9;
        int i14 = iArr[i9] + b9;
        iArr[i9] = i14;
        iArr[i8] = b(iArr[i8] ^ i14, 7);
    }

    public static int b(int i7, int i8) {
        return (i7 >>> (-i8)) | (i7 << i8);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f13941a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void d(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
