package e5;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14005a;

    /* renamed from: b, reason: collision with root package name */
    public int f14006b = 0;

    public C1274b(int i7) {
        this.f14005a = new byte[i7];
    }

    public void a(boolean z7, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f14006b;
            this.f14006b = i9 + 1;
            c(i9, z7);
        }
    }

    public byte[] b(int i7) {
        int length = this.f14005a.length * i7;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = this.f14005a[i8 / i7];
        }
        return bArr;
    }

    public final void c(int i7, boolean z7) {
        this.f14005a[i7] = z7 ? (byte) 1 : (byte) 0;
    }
}
