/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.List
 *  java.util.Objects
 */
package m0;

import F0.W;
import X2.v;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import d0.C;
import d0.e;
import d0.q;
import g0.M;
import g0.a;
import g0.o;
import g0.r;
import j0.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import k0.A0;
import k0.Y0;
import k0.Z0;
import k0.b1;
import k0.p;
import k0.u;
import k0.v0;
import l0.y1;
import m0.k;
import m0.x;
import m0.z;
import t0.I;
import t0.m;
import t0.w;

public class b0
extends w
implements A0 {
    public final Context V0;
    public final x.a W0;
    public final z X0;
    public int Y0;
    public boolean Z0;
    public boolean a1;
    public q b1;
    public q c1;
    public long d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public int h1;
    public boolean i1;
    public long j1;

    public b0(Context context, m.b b8, t0.z z8, boolean bl, Handler handler, x x8, z z9) {
        super(1, b8, z8, bl, 44100.0f);
        this.V0 = context.getApplicationContext();
        this.X0 = z9;
        this.h1 = -1000;
        this.W0 = new x.a(handler, x8);
        this.j1 = -9223372036854775807L;
        z9.C(new c(null));
    }

    public static boolean V1(String string2) {
        if (M.a < 24 && "OMX.SEC.aac.dec".equals((Object)string2) && "samsung".equals((Object)M.c) && ((string2 = M.b).startsWith("zeroflte") || string2.startsWith("herolte") || string2.startsWith("heroqlte"))) {
            return true;
        }
        return false;
    }

    public static boolean W1(String string2) {
        if (!(string2.equals((Object)"OMX.google.opus.decoder") || string2.equals((Object)"c2.android.opus.decoder") || string2.equals((Object)"OMX.google.vorbis.decoder") || string2.equals((Object)"c2.android.vorbis.decoder"))) {
            return false;
        }
        return true;
    }

    public static boolean X1() {
        String string2;
        if (M.a == 23 && ("ZTE B2017G".equals((Object)(string2 = M.d)) || "AXON 7 mini".equals((Object)string2))) {
            return true;
        }
        return false;
    }

    private int Z1(t0.p p8, q q8) {
        int n8;
        if ("OMX.google.raw.decoder".equals((Object)p8.a) && (n8 = M.a) < 24 && (n8 != 23 || !M.E0(this.V0))) {
            return -1;
        }
        return q8.o;
    }

    public static List b2(t0.z z8, q q8, boolean bl, z object) {
        if (q8.n == null) {
            return v.Y();
        }
        if (object.a(q8) && (object = I.x()) != null) {
            return v.Z(object);
        }
        return I.v(z8, q8, bl, false);
    }

    @Override
    public A0 B() {
        return this;
    }

    @Override
    public long H() {
        if (this.getState() == 2) {
            this.f2();
        }
        return this.d1;
    }

    @Override
    public float J0(float f8, q q8, q[] arrq) {
        int n8 = arrq.length;
        int n9 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = arrq[i8].C;
            int n11 = n9;
            if (n10 != -1) {
                n11 = Math.max((int)n9, (int)n10);
            }
            n9 = n11;
        }
        if (n9 == -1) {
            return -1.0f;
        }
        return f8 * (float)n9;
    }

    @Override
    public boolean K1(q q8) {
        int n8;
        if (this.M().a != 0 && ((n8 = this.Y1(q8)) & 512) != 0 && (this.M().a == 2 || (n8 & 1024) != 0 || q8.E == 0 && q8.F == 0)) {
            return true;
        }
        return this.X0.a(q8);
    }

    @Override
    public List L0(t0.z z8, q q8, boolean bl) {
        return I.w(b0.b2(z8, q8, bl, this.X0), q8);
    }

    @Override
    public int L1(t0.z object, q q8) {
        int n8;
        boolean bl = d0.z.o(q8.n);
        int n9 = 0;
        if (!bl) {
            return Z0.a(0);
        }
        int n10 = M.a >= 21 ? 32 : 0;
        int n11 = q8.K;
        bl = true;
        n11 = n11 != 0 ? 1 : 0;
        boolean bl2 = w.M1(q8);
        if (bl2 && (n11 == 0 || I.x() != null)) {
            n11 = this.Y1(q8);
            if (this.X0.a(q8)) {
                return Z0.b(4, 8, n10, n11);
            }
        } else {
            n11 = 0;
        }
        if ("audio/raw".equals((Object)q8.n) && !this.X0.a(q8)) {
            return Z0.a(1);
        }
        if (!this.X0.a(M.f0(2, q8.B, q8.C))) {
            return Z0.a(1);
        }
        List list = b0.b2((t0.z)object, q8, false, this.X0);
        if (list.isEmpty()) {
            return Z0.a(1);
        }
        if (!bl2) {
            return Z0.a(2);
        }
        object = (t0.p)list.get(0);
        bl2 = object.m(q8);
        if (!bl2) {
            for (n8 = 1; n8 < list.size(); ++n8) {
                t0.p p8 = (t0.p)list.get(n8);
                if (!p8.m(q8)) continue;
                n8 = 0;
                object = p8;
                break;
            }
        } else {
            n8 = 1;
            bl = bl2;
        }
        int n12 = bl ? 4 : 3;
        int n13 = bl && object.p(q8) ? 16 : 8;
        int n14 = object.h ? 64 : 0;
        if (n8 != 0) {
            n9 = 128;
        }
        return Z0.d(n12, n13, n10, n14, n9, n11);
    }

    @Override
    public long M0(boolean bl, long l8, long l9) {
        long l10 = this.j1;
        if (l10 != -9223372036854775807L) {
            float f8 = l10 - l8;
            float f9 = this.h() != null ? this.h().a : 1.0f;
            l8 = l10 = (long)(f8 / f9 / 2.0f);
            if (this.i1) {
                l8 = l10 - (M.J0(this.L().b()) - l9);
            }
            return Math.max((long)10000L, (long)l8);
        }
        return super.M0(bl, l8, l9);
    }

    @Override
    public m.a O0(t0.p p8, q q8, MediaCrypto mediaCrypto, float f8) {
        this.Y0 = this.a2(p8, q8, this.R());
        this.Z0 = b0.V1(p8.a);
        this.a1 = b0.W1(p8.a);
        MediaFormat mediaFormat = this.c2(q8, p8.c, this.Y0, f8);
        q q9 = "audio/raw".equals((Object)p8.b) && !"audio/raw".equals((Object)q8.n) ? q8 : null;
        this.c1 = q9;
        return m.a.a(p8, mediaFormat, q8, mediaCrypto);
    }

    @Override
    public void T() {
        this.f1 = true;
        this.b1 = null;
        try {
            this.X0.flush();
        }
        catch (Throwable throwable) {
            try {
                super.T();
                throw throwable;
            }
            finally {
                this.W0.s(this.Q0);
            }
        }
        try {
            super.T();
            return;
        }
        finally {
            this.W0.s(this.Q0);
        }
    }

    @Override
    public void T0(i i8) {
        q q8;
        if (M.a >= 29 && (q8 = i8.p) != null && Objects.equals((Object)q8.n, (Object)"audio/opus") && this.Z0()) {
            q8 = (ByteBuffer)a.e((Object)i8.u);
            int n8 = ((q)a.e((Object)i8.p)).E;
            if (q8.remaining() == 8) {
                int n9 = (int)(q8.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000L / 1000000000L);
                this.X0.q(n8, n9);
            }
        }
    }

    @Override
    public void U(boolean bl, boolean bl2) {
        super.U(bl, bl2);
        this.W0.t(this.Q0);
        if (this.M().b) {
            this.X0.e();
        } else {
            this.X0.x();
        }
        this.X0.t(this.Q());
        this.X0.A(this.L());
    }

    @Override
    public void W(long l8, boolean bl) {
        super.W(l8, bl);
        this.X0.flush();
        this.d1 = l8;
        this.g1 = false;
        this.e1 = true;
    }

    @Override
    public void X() {
        this.X0.release();
    }

    public final int Y1(q object) {
        object = this.X0.r((q)object);
        if (!object.a) {
            return 0;
        }
        int n8 = object.b ? 1536 : 512;
        int n9 = n8;
        if (object.c) {
            n9 = n8 | 2048;
        }
        return n9;
    }

    @Override
    public void Z() {
        this.g1 = false;
        try {
            super.Z();
            return;
        }
        finally {
            if (this.f1) {
                this.f1 = false;
                this.X0.b();
            }
        }
    }

    @Override
    public void a0() {
        super.a0();
        this.X0.p();
        this.i1 = true;
    }

    public int a2(t0.p p8, q q8, q[] arrq) {
        int n8 = this.Z1(p8, q8);
        if (arrq.length == 1) {
            return n8;
        }
        for (q q9 : arrq) {
            int n9 = n8;
            if (p8.e((q)q8, (q)q9).d != 0) {
                n9 = Math.max((int)n8, (int)this.Z1(p8, q9));
            }
            n8 = n9;
        }
        return n8;
    }

    @Override
    public void b0() {
        this.f2();
        this.i1 = false;
        this.X0.j();
        super.b0();
    }

    @Override
    public boolean c() {
        if (super.c() && this.X0.c()) {
            return true;
        }
        return false;
    }

    public MediaFormat c2(q q8, String string2, int n8, float f8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", string2);
        mediaFormat.setInteger("channel-count", q8.B);
        mediaFormat.setInteger("sample-rate", q8.C);
        r.e(mediaFormat, q8.q);
        r.d(mediaFormat, "max-input-size", n8);
        n8 = M.a;
        if (n8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f && !b0.X1()) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (n8 <= 28 && "audio/ac4".equals((Object)q8.n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (n8 >= 24 && this.X0.o(M.f0(4, q8.B, q8.C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (n8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (n8 >= 35) {
            mediaFormat.setInteger("importance", Math.max((int)0, (int)(- this.h1)));
        }
        return mediaFormat;
    }

    @Override
    public String d() {
        return "MediaCodecAudioRenderer";
    }

    public void d2() {
        this.e1 = true;
    }

    @Override
    public boolean e() {
        if (!this.X0.i() && !super.e()) {
            return false;
        }
        return true;
    }

    public final void e2() {
        m m8 = this.F0();
        if (m8 == null) {
            return;
        }
        if (M.a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max((int)0, (int)(- this.h1)));
            m8.c(bundle);
        }
    }

    public final void f2() {
        long l8 = this.X0.w(this.c());
        if (l8 != Long.MIN_VALUE) {
            if (!this.e1) {
                l8 = Math.max((long)this.d1, (long)l8);
            }
            this.d1 = l8;
            this.e1 = false;
        }
    }

    @Override
    public C h() {
        return this.X0.h();
    }

    @Override
    public void h1(Exception exception) {
        o.d("MediaCodecAudioRenderer", "Audio codec error", (Throwable)exception);
        this.W0.m(exception);
    }

    @Override
    public void i1(String string2, m.a a8, long l8, long l9) {
        this.W0.q(string2, l8, l9);
    }

    @Override
    public void j1(String string2) {
        this.W0.r(string2);
    }

    @Override
    public void k(C c8) {
        this.X0.k(c8);
    }

    @Override
    public p k0(t0.p object, q q8, q q9) {
        int n8;
        int n9;
        p p8 = object.e(q8, q9);
        n9 = n8 = p8.e;
        if (this.a1(q9)) {
            n9 = n8 | 32768;
        }
        n8 = n9;
        if (this.Z1((t0.p)object, q9) > this.Y0) {
            n8 = n9 | 64;
        }
        object = object.a;
        n9 = n8 != 0 ? 0 : p8.d;
        return new p((String)object, q8, q9, n9, n8);
    }

    @Override
    public p k1(v0 object) {
        q q8;
        this.b1 = q8 = (q)a.e(object.b);
        object = super.k1((v0)object);
        this.W0.u(q8, (p)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l1(q q8, MediaFormat arrn) {
        q q9 = this.c1;
        q q10 = null;
        int[] arrn2 = null;
        if (q9 != null) {
            q8 = q9;
            arrn = q10;
        } else if (this.F0() == null) {
            arrn = q10;
        } else {
            a.e(arrn);
            int n8 = "audio/raw".equals((Object)q8.n) ? q8.D : (M.a >= 24 && arrn.containsKey("pcm-encoding") ? arrn.getInteger("pcm-encoding") : (arrn.containsKey("v-bits-per-sample") ? M.e0(arrn.getInteger("v-bits-per-sample")) : 2));
            q10 = new q.b().o0("audio/raw").i0(n8).V(q8.E).W(q8.F).h0(q8.k).T(q8.l).a0(q8.a).c0(q8.b).d0(q8.c).e0(q8.d).q0(q8.e).m0(q8.f).N(arrn.getInteger("channel-count")).p0(arrn.getInteger("sample-rate")).K();
            if (this.Z0 && q10.B == 6 && (n8 = q8.B) < 6) {
                arrn2 = new int[n8];
                n8 = 0;
                do {
                    arrn = arrn2;
                    if (n8 < q8.B) {
                        arrn2[n8] = n8++;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                arrn = arrn2;
                if (this.a1) {
                    arrn = W.a(q10.B);
                }
            }
            q8 = q10;
        }
        try {
            if (M.a >= 29) {
                if (this.Z0() && this.M().a != 0) {
                    this.X0.v(this.M().a);
                } else {
                    this.X0.v(0);
                }
            }
            this.X0.z(q8, 0, arrn);
            return;
        }
        catch (z.b b8) {
            throw this.J((Throwable)b8, b8.o, 5001);
        }
    }

    @Override
    public void m1(long l8) {
        this.X0.y(l8);
    }

    @Override
    public void o1() {
        super.o1();
        this.X0.B();
    }

    @Override
    public boolean r() {
        boolean bl = this.g1;
        this.g1 = false;
        return bl;
    }

    @Override
    public boolean s1(long l8, long l9, m object, ByteBuffer object2, int n8, int n9, int n10, long l10, boolean bl, boolean bl2, q q8) {
        z.c c82;
        block8 : {
            z.f f82;
            block6 : {
                block7 : {
                    a.e(object2);
                    this.j1 = -9223372036854775807L;
                    if (this.c1 != null && (n9 & 2) != 0) {
                        ((m)a.e(object)).f(n8, false);
                        return true;
                    }
                    if (bl) {
                        if (object != null) {
                            object.f(n8, false);
                        }
                        object = this.Q0;
                        object.f += n10;
                        this.X0.B();
                        return true;
                    }
                    try {
                        bl = this.X0.u((ByteBuffer)object2, l10, n10);
                        if (!bl) break block6;
                        if (object == null) break block7;
                    }
                    catch (z.f f82) {
                    }
                    catch (z.c c82) {
                        break block8;
                    }
                    object.f(n8, false);
                }
                object = this.Q0;
                object.e += n10;
                return true;
            }
            this.j1 = l10;
            return false;
            bl = f82.p;
            n8 = this.Z0() && this.M().a != 0 ? 5003 : 5002;
            throw this.K((Throwable)f82, q8, bl, n8);
        }
        object2 = this.b1;
        bl = c82.p;
        n8 = this.Z0() && this.M().a != 0 ? 5004 : 5001;
        throw this.K((Throwable)c82, (q)object2, bl, n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void t(int n8, Object object) {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 6) {
                    if (n8 != 12) {
                        if (n8 != 16) {
                            if (n8 != 9) {
                                if (n8 != 10) {
                                    super.t(n8, object);
                                    return;
                                }
                                this.X0.n((Integer)a.e(object));
                                return;
                            }
                            this.X0.d((Boolean)a.e(object));
                            return;
                        }
                        this.h1 = (Integer)a.e(object);
                        this.e2();
                        return;
                    }
                    if (M.a < 23) return;
                    b.a(this.X0, object);
                    return;
                }
                object = (e)object;
                this.X0.m((e)a.e(object));
                return;
            }
            object = (d0.b)object;
            this.X0.s((d0.b)a.e(object));
            return;
        }
        this.X0.l(((Float)a.e(object)).floatValue());
    }

    @Override
    public void x1() {
        z.f f82;
        block3 : {
            try {
                this.X0.g();
                if (this.N0() != -9223372036854775807L) {
                    this.j1 = this.N0();
                    return;
                }
            }
            catch (z.f f82) {
                break block3;
            }
            return;
        }
        q q8 = f82.q;
        boolean bl = f82.p;
        int n8 = this.Z0() ? 5003 : 5002;
        throw this.K((Throwable)f82, q8, bl, n8);
    }

    public static final abstract class b {
        public static void a(z z8, Object object) {
            z8.f((AudioDeviceInfo)object);
        }
    }

    public final class c
    implements z.d {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public void a(z.a a8) {
            b0.this.W0.o(a8);
        }

        @Override
        public void b(long l8) {
            b0.this.W0.H(l8);
        }

        @Override
        public void c(boolean bl) {
            b0.this.W0.I(bl);
        }

        @Override
        public void d(Exception exception) {
            o.d("MediaCodecAudioRenderer", "Audio sink error", (Throwable)exception);
            b0.this.W0.n(exception);
        }

        @Override
        public void e(z.a a8) {
            b0.this.W0.p(a8);
        }

        @Override
        public void f() {
            b0.this.Y();
        }

        @Override
        public void g() {
            b0.this.g1 = true;
        }

        @Override
        public void h() {
            b0.this.d2();
        }

        @Override
        public void i() {
            Y0.a a8 = b0.this.S0();
            if (a8 != null) {
                a8.a();
            }
        }

        @Override
        public void j() {
            Y0.a a8 = b0.this.S0();
            if (a8 != null) {
                a8.b();
            }
        }

        @Override
        public void k(int n8, long l8, long l9) {
            b0.this.W0.J(n8, l8, l9);
        }
    }

}

