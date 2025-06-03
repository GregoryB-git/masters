package h9;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[][] f7200c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: b, reason: collision with root package name */
    public int f7202b = 0;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7201a = new byte[1024];

    public final void a(int i10) {
        int i11 = i10 + this.f7202b;
        byte[] bArr = this.f7201a;
        if (i11 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i11) {
            i11 = length;
        }
        this.f7201a = Arrays.copyOf(bArr, i11);
    }

    public final void b(byte b10) {
        if (b10 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b10 != -1) {
            d(b10);
        } else {
            d((byte) -1);
            d((byte) 0);
        }
    }

    public final void c(byte b10) {
        if (b10 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b10 != -1) {
            e(b10);
        } else {
            e((byte) -1);
            e((byte) 0);
        }
    }

    public final void d(byte b10) {
        a(1);
        byte[] bArr = this.f7201a;
        int i10 = this.f7202b;
        this.f7202b = i10 + 1;
        bArr[i10] = b10;
    }

    public final void e(byte b10) {
        a(1);
        byte[] bArr = this.f7201a;
        int i10 = this.f7202b;
        this.f7202b = i10 + 1;
        bArr[i10] = (byte) (~b10);
    }

    public final void f(long j10) {
        int i10;
        long j11 = j10 < 0 ? ~j10 : j10;
        if (j11 < 64) {
            a(1);
            byte[] bArr = this.f7201a;
            int i11 = this.f7202b;
            this.f7202b = i11 + 1;
            bArr[i11] = (byte) (j10 ^ f7200c[1][0]);
            return;
        }
        if (j11 < 0) {
            j11 = ~j11;
        }
        int a10 = e.a((64 - Long.numberOfLeadingZeros(j11)) + 1, 7, RoundingMode.UP);
        a(a10);
        if (a10 < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(a10)));
        }
        byte b10 = j10 < 0 ? (byte) -1 : (byte) 0;
        int i12 = this.f7202b;
        if (a10 == 10) {
            i10 = i12 + 2;
            byte[] bArr2 = this.f7201a;
            bArr2[i12] = b10;
            bArr2[i12 + 1] = b10;
        } else if (a10 == 9) {
            i10 = i12 + 1;
            this.f7201a[i12] = b10;
        } else {
            i10 = i12;
        }
        for (int i13 = (a10 - 1) + i12; i13 >= i10; i13--) {
            this.f7201a[i13] = (byte) (255 & j10);
            j10 >>= 8;
        }
        byte[] bArr3 = this.f7201a;
        int i14 = this.f7202b;
        byte b11 = bArr3[i14];
        byte[] bArr4 = f7200c[a10];
        bArr3[i14] = (byte) (b11 ^ bArr4[0]);
        int i15 = i14 + 1;
        bArr3[i15] = (byte) (bArr4[1] ^ bArr3[i15]);
        this.f7202b = i14 + a10;
    }
}
