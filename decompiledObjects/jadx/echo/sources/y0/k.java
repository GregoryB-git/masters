package y0;

import d0.C1194q;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k extends AbstractC2226e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f21297j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f21298k;

    public k(i0.g gVar, i0.k kVar, int i7, C1194q c1194q, int i8, Object obj, byte[] bArr) {
        super(gVar, kVar, i7, c1194q, i8, obj, -9223372036854775807L, -9223372036854775807L);
        k kVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = M.f14266f;
            kVar2 = this;
        } else {
            kVar2 = this;
            bArr2 = bArr;
        }
        kVar2.f21297j = bArr2;
    }

    @Override // B0.n.e
    public final void b() {
        try {
            this.f21260i.e(this.f21253b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f21298k) {
                i(i8);
                i7 = this.f21260i.read(this.f21297j, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f21298k) {
                g(this.f21297j, i8);
            }
            i0.j.a(this.f21260i);
        } catch (Throwable th) {
            i0.j.a(this.f21260i);
            throw th;
        }
    }

    @Override // B0.n.e
    public final void c() {
        this.f21298k = true;
    }

    public abstract void g(byte[] bArr, int i7);

    public byte[] h() {
        return this.f21297j;
    }

    public final void i(int i7) {
        byte[] bArr = this.f21297j;
        if (bArr.length < i7 + 16384) {
            this.f21297j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
