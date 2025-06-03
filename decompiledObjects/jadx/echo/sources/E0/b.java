package E0;

import d0.C1194q;
import g0.M;
import g0.z;
import j0.i;
import java.nio.ByteBuffer;
import k0.AbstractC1425n;
import k0.Z0;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class b extends AbstractC1425n {

    /* renamed from: F, reason: collision with root package name */
    public final i f1532F;

    /* renamed from: G, reason: collision with root package name */
    public final z f1533G;

    /* renamed from: H, reason: collision with root package name */
    public long f1534H;

    /* renamed from: I, reason: collision with root package name */
    public a f1535I;

    /* renamed from: J, reason: collision with root package name */
    public long f1536J;

    public b() {
        super(6);
        this.f1532F = new i(1);
        this.f1533G = new z();
    }

    @Override // k0.AbstractC1425n
    public void T() {
        i0();
    }

    @Override // k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        this.f1536J = Long.MIN_VALUE;
        i0();
    }

    @Override // k0.a1
    public int a(C1194q c1194q) {
        return Z0.a("application/x-camera-motion".equals(c1194q.f12726n) ? 4 : 0);
    }

    @Override // k0.Y0
    public boolean c() {
        return p();
    }

    @Override // k0.AbstractC1425n
    public void c0(C1194q[] c1194qArr, long j7, long j8, InterfaceC2142x.b bVar) {
        this.f1534H = j8;
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "CameraMotionRenderer";
    }

    @Override // k0.Y0
    public boolean e() {
        return true;
    }

    @Override // k0.Y0
    public void f(long j7, long j8) {
        while (!p() && this.f1536J < 100000 + j7) {
            this.f1532F.m();
            if (e0(N(), this.f1532F, 0) != -4 || this.f1532F.p()) {
                return;
            }
            long j9 = this.f1532F.f15402t;
            this.f1536J = j9;
            boolean z7 = j9 < P();
            if (this.f1535I != null && !z7) {
                this.f1532F.C();
                float[] h02 = h0((ByteBuffer) M.i(this.f1532F.f15400r));
                if (h02 != null) {
                    ((a) M.i(this.f1535I)).a(this.f1536J - this.f1534H, h02);
                }
            }
        }
    }

    public final float[] h0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f1533G.R(byteBuffer.array(), byteBuffer.limit());
        this.f1533G.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i7 = 0; i7 < 3; i7++) {
            fArr[i7] = Float.intBitsToFloat(this.f1533G.t());
        }
        return fArr;
    }

    public final void i0() {
        a aVar = this.f1535I;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // k0.AbstractC1425n, k0.V0.b
    public void t(int i7, Object obj) {
        if (i7 == 8) {
            this.f1535I = (a) obj;
        } else {
            super.t(i7, obj);
        }
    }
}
