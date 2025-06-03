package t0;

import g0.AbstractC1297a;
import java.nio.ByteBuffer;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981j extends j0.i {

    /* renamed from: x, reason: collision with root package name */
    public long f19467x;

    /* renamed from: y, reason: collision with root package name */
    public int f19468y;

    /* renamed from: z, reason: collision with root package name */
    public int f19469z;

    public C1981j() {
        super(2);
        this.f19469z = 32;
    }

    public boolean H(j0.i iVar) {
        AbstractC1297a.a(!iVar.D());
        AbstractC1297a.a(!iVar.o());
        AbstractC1297a.a(!iVar.p());
        if (!K(iVar)) {
            return false;
        }
        int i7 = this.f19468y;
        this.f19468y = i7 + 1;
        if (i7 == 0) {
            this.f15402t = iVar.f15402t;
            if (iVar.s()) {
                w(1);
            }
        }
        ByteBuffer byteBuffer = iVar.f15400r;
        if (byteBuffer != null) {
            z(byteBuffer.remaining());
            this.f15400r.put(byteBuffer);
        }
        this.f19467x = iVar.f15402t;
        return true;
    }

    public final boolean K(j0.i iVar) {
        ByteBuffer byteBuffer;
        if (!U()) {
            return true;
        }
        if (this.f19468y >= this.f19469z) {
            return false;
        }
        ByteBuffer byteBuffer2 = iVar.f15400r;
        return byteBuffer2 == null || (byteBuffer = this.f15400r) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long M() {
        return this.f15402t;
    }

    public long S() {
        return this.f19467x;
    }

    public int T() {
        return this.f19468y;
    }

    public boolean U() {
        return this.f19468y > 0;
    }

    public void V(int i7) {
        AbstractC1297a.a(i7 > 0);
        this.f19469z = i7;
    }

    @Override // j0.i, j0.AbstractC1368a
    public void m() {
        super.m();
        this.f19468y = 0;
    }
}
