package c4;

import c4.v;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2325a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f2326b;

    /* renamed from: c, reason: collision with root package name */
    public int f2327c;

    /* renamed from: d, reason: collision with root package name */
    public long f2328d;

    /* renamed from: e, reason: collision with root package name */
    public int f2329e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f2330g;

    public final void a(v vVar, v.a aVar) {
        if (this.f2327c > 0) {
            vVar.c(this.f2328d, this.f2329e, this.f, this.f2330g, aVar);
            this.f2327c = 0;
        }
    }

    public final void b(v vVar, long j10, int i10, int i11, int i12, v.a aVar) {
        if (!(this.f2330g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f2326b) {
            int i13 = this.f2327c;
            int i14 = i13 + 1;
            this.f2327c = i14;
            if (i13 == 0) {
                this.f2328d = j10;
                this.f2329e = i10;
                this.f = 0;
            }
            this.f += i11;
            this.f2330g = i12;
            if (i14 >= 16) {
                a(vVar, aVar);
            }
        }
    }

    public final void c(i iVar) {
        if (this.f2326b) {
            return;
        }
        iVar.m(this.f2325a, 0, 10);
        iVar.i();
        byte[] bArr = this.f2325a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                r2 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.f2326b = true;
    }
}
