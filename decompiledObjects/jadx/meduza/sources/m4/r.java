package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f10153a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10154b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10155c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10156d;

    /* renamed from: e, reason: collision with root package name */
    public int f10157e;

    public r(int i10) {
        this.f10153a = i10;
        byte[] bArr = new byte[131];
        this.f10156d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f10154b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f10156d;
            int length = bArr2.length;
            int i13 = this.f10157e;
            if (length < i13 + i12) {
                this.f10156d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f10156d, this.f10157e, i12);
            this.f10157e += i12;
        }
    }

    public final boolean b(int i10) {
        if (!this.f10154b) {
            return false;
        }
        this.f10157e -= i10;
        this.f10154b = false;
        this.f10155c = true;
        return true;
    }

    public final void c() {
        this.f10154b = false;
        this.f10155c = false;
    }

    public final void d(int i10) {
        x6.b.H(!this.f10154b);
        boolean z10 = i10 == this.f10153a;
        this.f10154b = z10;
        if (z10) {
            this.f10157e = 3;
            this.f10155c = false;
        }
    }
}
