package okhttp3.internal.http2;

/* loaded from: classes.dex */
public final class Settings {

    /* renamed from: a, reason: collision with root package name */
    public int f12643a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f12644b = new int[10];

    public final int a() {
        if ((this.f12643a & 128) != 0) {
            return this.f12644b[7];
        }
        return 65535;
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f12644b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f12643a = (1 << i10) | this.f12643a;
            iArr[i10] = i11;
        }
    }
}
