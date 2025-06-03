package g4;

import c4.v;
import defpackage.f;
import g4.d;
import v3.i0;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final u f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5840c;

    /* renamed from: d, reason: collision with root package name */
    public int f5841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5842e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f5843g;

    public e(v vVar) {
        super(vVar);
        this.f5839b = new u(q.f15932a);
        this.f5840c = new u(4);
    }

    @Override // g4.d
    public final boolean a(u uVar) {
        int v10 = uVar.v();
        int i10 = (v10 >> 4) & 15;
        int i11 = v10 & 15;
        if (i11 != 7) {
            throw new d.a(f.h("Video format not supported: ", i11));
        }
        this.f5843g = i10;
        return i10 != 5;
    }

    @Override // g4.d
    public final boolean b(long j10, u uVar) {
        int v10 = uVar.v();
        byte[] bArr = uVar.f15974a;
        int i10 = uVar.f15975b;
        int i11 = i10 + 1;
        int i12 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        uVar.f15975b = i11 + 1 + 1;
        long j11 = (((bArr[r4] & 255) | i12) * 1000) + j10;
        if (v10 == 0 && !this.f5842e) {
            u uVar2 = new u(new byte[uVar.f15976c - uVar.f15975b]);
            uVar.d(uVar2.f15974a, 0, uVar.f15976c - uVar.f15975b);
            w5.a a10 = w5.a.a(uVar2);
            this.f5841d = a10.f16319b;
            i0.a aVar = new i0.a();
            aVar.f15472k = "video/avc";
            aVar.f15469h = a10.f;
            aVar.f15477p = a10.f16320c;
            aVar.f15478q = a10.f16321d;
            aVar.t = a10.f16322e;
            aVar.f15474m = a10.f16318a;
            this.f5838a.d(new i0(aVar));
            this.f5842e = true;
            return false;
        }
        if (v10 != 1 || !this.f5842e) {
            return false;
        }
        int i13 = this.f5843g == 1 ? 1 : 0;
        if (!this.f && i13 == 0) {
            return false;
        }
        byte[] bArr2 = this.f5840c.f15974a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i14 = 4 - this.f5841d;
        int i15 = 0;
        while (uVar.f15976c - uVar.f15975b > 0) {
            uVar.d(this.f5840c.f15974a, i14, this.f5841d);
            this.f5840c.G(0);
            int y10 = this.f5840c.y();
            this.f5839b.G(0);
            this.f5838a.b(4, this.f5839b);
            this.f5838a.b(y10, uVar);
            i15 = i15 + 4 + y10;
        }
        this.f5838a.c(j11, i13, i15, 0, null);
        this.f = true;
        return true;
    }
}
