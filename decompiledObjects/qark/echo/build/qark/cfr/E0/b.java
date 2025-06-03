/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package E0;

import E0.a;
import d0.q;
import g0.M;
import g0.z;
import j0.i;
import java.nio.ByteBuffer;
import k0.Z0;
import k0.n;
import k0.v0;
import x0.x;

public final class b
extends n {
    public final i F = new i(1);
    public final z G = new z();
    public long H;
    public a I;
    public long J;

    public b() {
        super(6);
    }

    @Override
    public void T() {
        this.i0();
    }

    @Override
    public void W(long l8, boolean bl) {
        this.J = Long.MIN_VALUE;
        this.i0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(q q8) {
        int n8;
        if ("application/x-camera-motion".equals((Object)q8.n)) {
            n8 = 4;
            do {
                return Z0.a(n8);
                break;
            } while (true);
        }
        n8 = 0;
        return Z0.a(n8);
    }

    @Override
    public boolean c() {
        return this.p();
    }

    @Override
    public void c0(q[] arrq, long l8, long l9, x.b b8) {
        this.H = l9;
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
    public void f(long l8, long l9) {
        while (!this.p() && this.J < 100000L + l8) {
            this.F.m();
            float[] arrf = this.N();
            i i8 = this.F;
            boolean bl = false;
            if (this.e0((v0)arrf, i8, 0) != -4) break;
            if (this.F.p()) {
                return;
            }
            this.J = l9 = this.F.t;
            if (l9 < this.P()) {
                bl = true;
            }
            if (this.I == null || bl) continue;
            this.F.C();
            arrf = this.h0((ByteBuffer)M.i((Object)this.F.r));
            if (arrf == null) continue;
            ((a)M.i(this.I)).a(this.J - this.H, arrf);
        }
    }

    public final float[] h0(ByteBuffer arrf) {
        if (arrf.remaining() != 16) {
            return null;
        }
        this.G.R(arrf.array(), arrf.limit());
        this.G.T(arrf.arrayOffset() + 4);
        arrf = new float[3];
        for (int i8 = 0; i8 < 3; ++i8) {
            arrf[i8] = Float.intBitsToFloat((int)this.G.t());
        }
        return arrf;
    }

    public final void i0() {
        a a8 = this.I;
        if (a8 != null) {
            a8.h();
        }
    }

    @Override
    public void t(int n8, Object object) {
        if (n8 == 8) {
            this.I = (a)object;
            return;
        }
        super.t(n8, object);
    }
}

