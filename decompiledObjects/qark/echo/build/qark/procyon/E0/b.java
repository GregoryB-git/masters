// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E0;

import k0.v0;
import g0.M;
import java.nio.ByteBuffer;
import x0.x;
import k0.Z0;
import d0.q;
import g0.z;
import j0.i;
import k0.n;

public final class b extends n
{
    public final i F;
    public final z G;
    public long H;
    public a I;
    public long J;
    
    public b() {
        super(6);
        this.F = new i(1);
        this.G = new z();
    }
    
    @Override
    public void T() {
        this.i0();
    }
    
    @Override
    public void W(final long n, final boolean b) {
        this.J = Long.MIN_VALUE;
        this.i0();
    }
    
    @Override
    public int a(final q q) {
        int n;
        if ("application/x-camera-motion".equals(q.n)) {
            n = 4;
        }
        else {
            n = 0;
        }
        return Z0.a(n);
    }
    
    @Override
    public boolean c() {
        return this.p();
    }
    
    @Override
    public void c0(final q[] array, final long n, final long h, final x.b b) {
        this.H = h;
    }
    
    @Override
    public String d() {
        return "CameraMotionRenderer";
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public void f(final long n, long t) {
        while (!this.p() && this.J < 100000L + n) {
            this.F.m();
            final v0 n2 = this.N();
            final i f = this.F;
            boolean b = false;
            if (this.e0(n2, f, 0) != -4) {
                break;
            }
            if (this.F.p()) {
                return;
            }
            t = this.F.t;
            this.J = t;
            if (t < this.P()) {
                b = true;
            }
            if (this.I == null) {
                continue;
            }
            if (b) {
                continue;
            }
            this.F.C();
            final float[] h0 = this.h0((ByteBuffer)M.i(this.F.r));
            if (h0 == null) {
                continue;
            }
            ((a)M.i(this.I)).a(this.J - this.H, h0);
        }
    }
    
    public final float[] h0(final ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.G.R(byteBuffer.array(), byteBuffer.limit());
        this.G.T(byteBuffer.arrayOffset() + 4);
        final float[] array = new float[3];
        for (int i = 0; i < 3; ++i) {
            array[i] = Float.intBitsToFloat(this.G.t());
        }
        return array;
    }
    
    public final void i0() {
        final a i = this.I;
        if (i != null) {
            i.h();
        }
    }
    
    @Override
    public void t(final int n, final Object o) {
        if (n == 8) {
            this.I = (a)o;
            return;
        }
        super.t(n, o);
    }
}
