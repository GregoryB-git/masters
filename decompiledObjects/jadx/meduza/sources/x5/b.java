package x5;

import java.nio.ByteBuffer;
import l3.l;
import v3.i0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class b extends v3.f {

    /* renamed from: u, reason: collision with root package name */
    public final z3.g f17116u;

    /* renamed from: v, reason: collision with root package name */
    public final u f17117v;

    /* renamed from: w, reason: collision with root package name */
    public long f17118w;

    /* renamed from: x, reason: collision with root package name */
    public a f17119x;

    /* renamed from: y, reason: collision with root package name */
    public long f17120y;

    public b() {
        super(6);
        this.f17116u = new z3.g(1);
        this.f17117v = new u();
    }

    @Override // v3.f
    public final void B() {
        a aVar = this.f17119x;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // v3.f
    public final void D(long j10, boolean z10) {
        this.f17120y = Long.MIN_VALUE;
        a aVar = this.f17119x;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // v3.f
    public final void H(i0[] i0VarArr, long j10, long j11) {
        this.f17118w = j11;
    }

    @Override // v3.k1
    public final int a(i0 i0Var) {
        return "application/x-camera-motion".equals(i0Var.t) ? a0.j.b(4, 0, 0) : a0.j.b(0, 0, 0);
    }

    @Override // v3.j1
    public final boolean b() {
        return true;
    }

    @Override // v3.j1
    public final boolean d() {
        return h();
    }

    @Override // v3.j1, v3.k1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // v3.j1
    public final void p(long j10, long j11) {
        while (!h() && this.f17120y < 100000 + j10) {
            this.f17116u.o();
            l lVar = this.f15331b;
            float[] fArr = null;
            lVar.f9559a = null;
            lVar.f9560b = null;
            if (I(lVar, this.f17116u, 0) != -4 || this.f17116u.m(4)) {
                return;
            }
            z3.g gVar = this.f17116u;
            this.f17120y = gVar.f17534e;
            if (this.f17119x != null && !gVar.n()) {
                this.f17116u.r();
                ByteBuffer byteBuffer = this.f17116u.f17532c;
                int i10 = e0.f15881a;
                if (byteBuffer.remaining() == 16) {
                    this.f17117v.E(byteBuffer.array(), byteBuffer.limit());
                    this.f17117v.G(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr[i11] = Float.intBitsToFloat(this.f17117v.i());
                    }
                }
                if (fArr != null) {
                    this.f17119x.a(this.f17120y - this.f17118w, fArr);
                }
            }
        }
    }

    @Override // v3.f, v3.g1.b
    public final void q(int i10, Object obj) {
        if (i10 == 8) {
            this.f17119x = (a) obj;
        }
    }
}
