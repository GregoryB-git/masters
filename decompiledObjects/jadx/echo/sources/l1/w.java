package l1;

import g0.AbstractC1297a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f17115a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17117c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f17118d;

    /* renamed from: e, reason: collision with root package name */
    public int f17119e;

    public w(int i7, int i8) {
        this.f17115a = i7;
        byte[] bArr = new byte[i8 + 3];
        this.f17118d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (this.f17116b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f17118d;
            int length = bArr2.length;
            int i10 = this.f17119e;
            if (length < i10 + i9) {
                this.f17118d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, this.f17118d, this.f17119e, i9);
            this.f17119e += i9;
        }
    }

    public boolean b(int i7) {
        if (!this.f17116b) {
            return false;
        }
        this.f17119e -= i7;
        this.f17116b = false;
        this.f17117c = true;
        return true;
    }

    public boolean c() {
        return this.f17117c;
    }

    public void d() {
        this.f17116b = false;
        this.f17117c = false;
    }

    public void e(int i7) {
        AbstractC1297a.f(!this.f17116b);
        boolean z7 = i7 == this.f17115a;
        this.f17116b = z7;
        if (z7) {
            this.f17119e = 3;
            this.f17117c = false;
        }
    }
}
