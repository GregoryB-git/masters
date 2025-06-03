package i4;

import c4.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f7482d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7483a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f7484b;

    /* renamed from: c, reason: collision with root package name */
    public int f7485c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f7482d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final long b(i iVar, boolean z10, boolean z11, int i10) {
        if (this.f7484b == 0) {
            if (!iVar.b(this.f7483a, 0, 1, z10)) {
                return -1L;
            }
            int i11 = this.f7483a[0] & 255;
            int i12 = 0;
            while (true) {
                long[] jArr = f7482d;
                if (i12 >= 8) {
                    i12 = -1;
                    break;
                }
                long j10 = jArr[i12];
                i12++;
                if ((i11 & j10) != 0) {
                    break;
                }
            }
            this.f7485c = i12;
            if (i12 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7484b = 1;
        }
        int i13 = this.f7485c;
        if (i13 > i10) {
            this.f7484b = 0;
            return -2L;
        }
        if (i13 != 1) {
            iVar.readFully(this.f7483a, 1, i13 - 1);
        }
        this.f7484b = 0;
        return a(this.f7483a, this.f7485c, z11);
    }
}
