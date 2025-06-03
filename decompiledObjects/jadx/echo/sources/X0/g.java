package X0;

import F0.InterfaceC0373s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f7024d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7025a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f7026b;

    /* renamed from: c, reason: collision with root package name */
    public int f7027c;

    public static long a(byte[] bArr, int i7, boolean z7) {
        long j7 = bArr[0] & 255;
        if (z7) {
            j7 &= ~f7024d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public static int c(int i7) {
        long j7;
        int i8 = 0;
        do {
            long[] jArr = f7024d;
            if (i8 >= jArr.length) {
                return -1;
            }
            j7 = jArr[i8] & i7;
            i8++;
        } while (j7 == 0);
        return i8;
    }

    public int b() {
        return this.f7027c;
    }

    public long d(InterfaceC0373s interfaceC0373s, boolean z7, boolean z8, int i7) {
        if (this.f7026b == 0) {
            if (!interfaceC0373s.d(this.f7025a, 0, 1, z7)) {
                return -1L;
            }
            int c7 = c(this.f7025a[0] & 255);
            this.f7027c = c7;
            if (c7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7026b = 1;
        }
        int i8 = this.f7027c;
        if (i8 > i7) {
            this.f7026b = 0;
            return -2L;
        }
        if (i8 != 1) {
            interfaceC0373s.readFully(this.f7025a, 1, i8 - 1);
        }
        this.f7026b = 0;
        return a(this.f7025a, this.f7027c, z8);
    }

    public void e() {
        this.f7026b = 0;
        this.f7027c = 0;
    }
}
