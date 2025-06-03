package m4;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f10176c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10177d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10178e;

    /* renamed from: a, reason: collision with root package name */
    public final v5.c0 f10174a = new v5.c0(0);
    public long f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f10179g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f10180h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f10175b = new v5.u();

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(v5.u uVar) {
        int i10 = uVar.f15975b;
        if (uVar.f15976c - i10 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        uVar.d(bArr, 0, 9);
        uVar.G(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(c4.i iVar) {
        v5.u uVar = this.f10175b;
        byte[] bArr = v5.e0.f;
        uVar.getClass();
        uVar.E(bArr, bArr.length);
        this.f10176c = true;
        iVar.i();
    }
}
