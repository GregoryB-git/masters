/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaFormat
 *  android.media.metrics.LogSessionId
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayDeque
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 *  java.util.UUID
 */
package t0;

import F0.K;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import d0.g;
import d0.q;
import g0.D;
import g0.F;
import g0.M;
import g0.a;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k0.Y0;
import k0.g0;
import k0.n;
import k0.u;
import k0.v0;
import l0.y1;
import m0.O;
import m0.c0;
import p0.G;
import p0.n;
import t0.I;
import t0.j;
import t0.m;
import t0.o;
import t0.p;
import t0.x;
import t0.z;
import x0.x;

public abstract class w
extends n {
    public static final byte[] U0 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public final m.b F;
    public int F0;
    public final z G;
    public boolean G0;
    public final boolean H;
    public boolean H0;
    public final float I;
    public boolean I0;
    public final i J;
    public long J0;
    public final i K;
    public long K0;
    public final i L;
    public boolean L0;
    public final j M;
    public boolean M0;
    public final MediaCodec.BufferInfo N;
    public boolean N0;
    public final ArrayDeque O;
    public boolean O0;
    public final c0 P;
    public u P0;
    public q Q;
    public k0.o Q0;
    public q R;
    public f R0;
    public p0.n S;
    public long S0;
    public p0.n T;
    public boolean T0;
    public Y0.a U;
    public MediaCrypto V;
    public long W;
    public float X;
    public float Y;
    public m Z;
    public q a0;
    public MediaFormat b0;
    public boolean c0;
    public float d0;
    public ArrayDeque e0;
    public d f0;
    public p g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public int u0;
    public int v0;
    public ByteBuffer w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public w(int n8, m.b object, z z8, boolean bl, float f8) {
        super(n8);
        this.F = object;
        this.G = (z)a.e(z8);
        this.H = bl;
        this.I = f8;
        this.J = i.F();
        this.K = new i(0);
        this.L = new i(2);
        this.M = object = new j();
        this.N = new MediaCodec.BufferInfo();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.W = -9223372036854775807L;
        this.O = new ArrayDeque();
        this.R0 = f.e;
        object.z(0);
        object.r.order(ByteOrder.nativeOrder());
        this.P = new c0();
        this.d0 = -1.0f;
        this.h0 = 0;
        this.D0 = 0;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.E0 = 0;
        this.F0 = 0;
        this.Q0 = new k0.o();
    }

    public static boolean M1(q q8) {
        int n8 = q8.K;
        if (n8 != 0 && n8 != 2) {
            return false;
        }
        return true;
    }

    public static boolean c1(IllegalStateException arrstackTraceElement) {
        if (M.a >= 21 && w.d1((IllegalStateException)arrstackTraceElement)) {
            return true;
        }
        if ((arrstackTraceElement = arrstackTraceElement.getStackTrace()).length > 0 && arrstackTraceElement[0].getClassName().equals((Object)"android.media.MediaCodec")) {
            return true;
        }
        return false;
    }

    public static boolean d1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean e1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException)illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean m0(String string2, q q8) {
        if (M.a < 21 && q8.q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static boolean n0(String string2) {
        if (M.a < 21 && "OMX.SEC.mp3.dec".equals((Object)string2) && "samsung".equals((Object)M.c) && ((string2 = M.b).startsWith("baffin") || string2.startsWith("grand") || string2.startsWith("fortuna") || string2.startsWith("gprimelte") || string2.startsWith("j2y18lte") || string2.startsWith("ms01"))) {
            return true;
        }
        return false;
    }

    public static boolean o0(String string2) {
        String string3;
        int n8 = M.a;
        if (n8 <= 23 && "OMX.google.vorbis.decoder".equals((Object)string2) || n8 == 19 && ("hb2000".equals((Object)(string3 = M.b)) || "stvm8".equals((Object)string3)) && ("OMX.amlogic.avc.decoder.awesome".equals((Object)string2) || "OMX.amlogic.avc.decoder.awesome.secure".equals((Object)string2))) {
            return true;
        }
        return false;
    }

    public static boolean p0(String string2) {
        if (M.a == 21 && "OMX.google.aac.decoder".equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static boolean q0(p p8) {
        String string2 = p8.a;
        int n8 = M.a;
        if (n8 <= 25 && "OMX.rk.video_decoder.avc".equals((Object)string2) || n8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals((Object)string2) || "OMX.broadcom.video_decoder.tunnel.secure".equals((Object)string2) || "OMX.bcm.vdec.avc.tunnel".equals((Object)string2) || "OMX.bcm.vdec.avc.tunnel.secure".equals((Object)string2) || "OMX.bcm.vdec.hevc.tunnel".equals((Object)string2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals((Object)string2)) || "Amazon".equals((Object)M.c) && "AFTS".equals((Object)M.d) && p8.g) {
            return true;
        }
        return false;
    }

    public static boolean r0(String string2) {
        if (M.a == 19 && M.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals((Object)string2) || "OMX.Exynos.avc.dec.secure".equals((Object)string2))) {
            return true;
        }
        return false;
    }

    public static boolean s0(String string2) {
        if (M.a == 29 && "c2.android.aac.decoder".equals((Object)string2)) {
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public final boolean A0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[SIMPLE_IF_TAKEN]], but top level block is 2[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void A1() {
        this.u0 = -1;
        this.K.r = null;
    }

    public final void B0() {
        try {
            ((m)a.h(this.Z)).flush();
            return;
        }
        finally {
            this.y1();
        }
    }

    public final void B1() {
        this.v0 = -1;
        this.w0 = null;
    }

    public final boolean C0() {
        boolean bl = this.D0();
        if (bl) {
            this.f1();
        }
        return bl;
    }

    public final void C1(p0.n n8) {
        p0.m.a(this.S, n8);
        this.S = n8;
    }

    public boolean D0() {
        if (this.Z == null) {
            return false;
        }
        int n8 = this.F0;
        if (!(n8 == 3 || this.j0 || this.k0 && !this.I0 || this.l0 && this.H0)) {
            if (n8 == 2) {
                n8 = M.a;
                boolean bl = n8 >= 23;
                a.f(bl);
                if (n8 >= 23) {
                    try {
                        this.O1();
                    }
                    catch (u u8) {
                        g0.o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", (Throwable)u8);
                        this.w1();
                        return true;
                    }
                }
            }
            this.B0();
            return false;
        }
        this.w1();
        return true;
    }

    public final void D1(f f8) {
        this.R0 = f8;
        long l8 = f8.c;
        if (l8 != -9223372036854775807L) {
            this.T0 = true;
            this.m1(l8);
        }
    }

    public final List E0(boolean bl) {
        List list;
        q q8 = (q)a.e(this.Q);
        List list2 = list = this.L0(this.G, q8, bl);
        if (list.isEmpty()) {
            list2 = list;
            if (bl) {
                list2 = list = this.L0(this.G, q8, false);
                if (!list.isEmpty()) {
                    list2 = new StringBuilder();
                    list2.append("Drm session requires secure decoder for ");
                    list2.append(q8.n);
                    list2.append(", but no secure decoder available. Trying to proceed with ");
                    list2.append((Object)list);
                    list2.append(".");
                    g0.o.h("MediaCodecRenderer", list2.toString());
                    list2 = list;
                }
            }
        }
        return list2;
    }

    public final void E1() {
        this.O0 = true;
    }

    public final m F0() {
        return this.Z;
    }

    public final void F1(u u8) {
        this.P0 = u8;
    }

    public int G0(i i8) {
        return 0;
    }

    public final void G1(p0.n n8) {
        p0.m.a(this.T, n8);
        this.T = n8;
    }

    public final p H0() {
        return this.g0;
    }

    public final boolean H1(long l8) {
        if (this.W != -9223372036854775807L && this.L().b() - l8 >= this.W) {
            return false;
        }
        return true;
    }

    @Override
    public void I(float f8, float f9) {
        this.X = f8;
        this.Y = f9;
        this.N1(this.a0);
    }

    public boolean I0() {
        return false;
    }

    public boolean I1(p p8) {
        return true;
    }

    public abstract float J0(float var1, q var2, q[] var3);

    public boolean J1() {
        return false;
    }

    public final MediaFormat K0() {
        return this.b0;
    }

    public boolean K1(q q8) {
        return false;
    }

    public abstract List L0(z var1, q var2, boolean var3);

    public abstract int L1(z var1, q var2);

    public long M0(boolean bl, long l8, long l9) {
        return super.q(l8, l9);
    }

    public long N0() {
        return this.K0;
    }

    public final boolean N1(q q8) {
        if (M.a < 23) {
            return true;
        }
        if (this.Z != null && this.F0 != 3) {
            if (this.getState() == 0) {
                return true;
            }
            float f8 = this.d0;
            float f9 = this.J0(this.Y, (q)a.e(q8), this.R());
            if (f8 == f9) {
                return true;
            }
            if (f9 == -1.0f) {
                this.w0();
                return false;
            }
            if (f8 == -1.0f && f9 <= this.I) {
                return true;
            }
            q8 = new Bundle();
            q8.putFloat("operating-rate", f9);
            ((m)a.e(this.Z)).c((Bundle)q8);
            this.d0 = f9;
        }
        return true;
    }

    public abstract m.a O0(p var1, q var2, MediaCrypto var3, float var4);

    public final void O1() {
        j0.b b8 = ((p0.n)a.e(this.T)).h();
        if (b8 instanceof G) {
            try {
                ((MediaCrypto)a.e((Object)this.V)).setMediaDrmSession(((G)b8).b);
            }
            catch (MediaCryptoException mediaCryptoException) {
                throw this.J((Throwable)mediaCryptoException, this.Q, 6006);
            }
        }
        this.C1(this.T);
        this.E0 = 0;
        this.F0 = 0;
    }

    public final long P0() {
        return this.R0.c;
    }

    public final void P1(long l8) {
        block8 : {
            block7 : {
                block6 : {
                    q q8;
                    q q9 = q8 = (q)this.R0.d.i(l8);
                    if (q8 == null) {
                        q9 = q8;
                        if (this.T0) {
                            q9 = q8;
                            if (this.b0 != null) {
                                q9 = (q)this.R0.d.h();
                            }
                        }
                    }
                    if (q9 == null) break block6;
                    this.R = q9;
                    break block7;
                }
                if (!this.c0 || this.R == null) break block8;
            }
            this.l1((q)a.e(this.R), this.b0);
            this.c0 = false;
            this.T0 = false;
        }
    }

    public final long Q0() {
        return this.R0.b;
    }

    public float R0() {
        return this.X;
    }

    public final Y0.a S0() {
        return this.U;
    }

    @Override
    public void T() {
        this.Q = null;
        this.D1(f.e);
        this.O.clear();
        this.D0();
    }

    public abstract void T0(i var1);

    @Override
    public void U(boolean bl, boolean bl2) {
        this.Q0 = new k0.o();
    }

    public final boolean U0() {
        if (this.v0 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean V0() {
        if (!this.M.U()) {
            return true;
        }
        long l8 = this.P();
        if (this.b1(l8, this.M.S()) == this.b1(l8, this.L.t)) {
            return true;
        }
        return false;
    }

    @Override
    public void W(long l8, boolean bl) {
        this.L0 = false;
        this.M0 = false;
        this.O0 = false;
        if (this.z0) {
            this.M.m();
            this.L.m();
            this.A0 = false;
            this.P.d();
        } else {
            this.C0();
        }
        if (this.R0.d.k() > 0) {
            this.N0 = true;
        }
        this.R0.d.c();
        this.O.clear();
    }

    public final void W0(q object) {
        this.u0();
        object = object.n;
        if (!("audio/mp4a-latm".equals(object) || "audio/mpeg".equals(object) || "audio/opus".equals(object))) {
            this.M.V(1);
        } else {
            this.M.V(32);
        }
        this.z0 = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void X0(p object, MediaCrypto object2) {
        boolean bl;
        boolean bl2 = false;
        q q8 = (q)a.e(this.Q);
        String string2 = object.a;
        int n8 = M.a;
        float f8 = -1.0f;
        float f9 = n8 < 23 ? -1.0f : this.J0(this.Y, q8, this.R());
        if (f9 <= this.I) {
            f9 = f8;
        }
        this.q1(q8);
        long l8 = this.L().b();
        object2 = this.O0((p)object, q8, (MediaCrypto)object2, f9);
        if (n8 >= 31) {
            c.a((m.a)object2, this.Q());
        }
        try {
            Object object3 = new StringBuilder();
            object3.append("createCodec:");
            object3.append(string2);
            F.a(object3.toString());
            this.Z = object3 = this.F.a((m.a)object2);
            bl = n8 >= 21 && b.a((m)object3, new e(null));
        }
        catch (Throwable throwable) {}
        F.b();
        throw throwable;
        this.s0 = bl;
        F.b();
        long l9 = this.L().b();
        if (!object.m(q8)) {
            g0.o.h("MediaCodecRenderer", M.G("Format exceeds selected codec's capabilities [%s, %s]", q.g(q8), string2));
        }
        this.g0 = object;
        this.d0 = f9;
        this.a0 = q8;
        this.h0 = this.l0(string2);
        this.i0 = w.m0(string2, (q)a.e(this.a0));
        this.j0 = w.r0(string2);
        this.k0 = w.s0(string2);
        this.l0 = w.o0(string2);
        this.m0 = w.p0(string2);
        this.n0 = w.n0(string2);
        this.o0 = false;
        bl = w.q0((p)object) || this.I0();
        this.r0 = bl;
        if (((m)a.e(this.Z)).e()) {
            this.C0 = true;
            this.D0 = 1;
            bl = bl2;
            if (this.h0 != 0) {
                bl = true;
            }
            this.p0 = bl;
        }
        if (this.getState() == 2) {
            this.t0 = this.L().b() + 1000L;
        }
        object = this.Q0;
        ++object.a;
        this.i1(string2, (m.a)object2, l9, l9 - l8);
    }

    public final boolean Y0() {
        boolean bl = this.V == null;
        a.f(bl);
        Object object = this.S;
        j0.b b8 = object.h();
        if (G.d && b8 instanceof G) {
            int n8 = object.getState();
            if (n8 != 1) {
                if (n8 != 4) {
                    return false;
                }
            } else {
                object = (n.a)((Object)a.e((Object)((Object)object.g())));
                throw this.J((Throwable)object, this.Q, object.o);
            }
        }
        if (b8 == null) {
            if (object.g() != null) {
                return true;
            }
            return false;
        }
        if (b8 instanceof G) {
            object = (G)b8;
            try {
                this.V = new MediaCrypto(object.a, object.b);
                return true;
            }
            catch (MediaCryptoException mediaCryptoException) {
                throw this.J((Throwable)mediaCryptoException, this.Q, 6006);
            }
        }
        return true;
    }

    @Override
    public void Z() {
        try {
            this.u0();
            this.w1();
            return;
        }
        finally {
            this.G1(null);
        }
    }

    public final boolean Z0() {
        return this.z0;
    }

    @Override
    public final int a(q q8) {
        try {
            int n8 = this.L1(this.G, q8);
            return n8;
        }
        catch (I.c c8) {
            throw this.J((Throwable)c8, q8, 4002);
        }
    }

    @Override
    public void a0() {
    }

    public final boolean a1(q q8) {
        if (this.T == null && this.K1(q8)) {
            return true;
        }
        return false;
    }

    @Override
    public void b0() {
    }

    public final boolean b1(long l8, long l9) {
        q q8;
        if (!(l9 >= l8 || (q8 = this.R) != null && Objects.equals((Object)q8.n, (Object)"audio/opus") && K.g(l8, l9))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c() {
        return this.M0;
    }

    @Override
    public void c0(q[] arrq, long l8, long l9, x.b b8) {
        long l10;
        long l11;
        if (this.R0.c == -9223372036854775807L) {
            this.D1(new f(-9223372036854775807L, l8, l9));
            return;
        }
        if (this.O.isEmpty() && ((l11 = this.J0) == -9223372036854775807L || (l10 = this.S0) != -9223372036854775807L && l10 >= l11)) {
            this.D1(new f(-9223372036854775807L, l8, l9));
            if (this.R0.c != -9223372036854775807L) {
                this.o1();
                return;
            }
        } else {
            this.O.add((Object)new f(this.J0, l8, l9));
        }
    }

    @Override
    public boolean e() {
        if (this.Q != null && (this.S() || this.U0() || this.t0 != -9223372036854775807L && this.L().b() < this.t0)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(long l8, long l9) {
        int n8;
        Object object;
        boolean bl = this.O0;
        boolean bl2 = false;
        if (bl) {
            this.O0 = false;
            this.r1();
        }
        if ((object = this.P0) != null) {
            this.P0 = null;
            throw object;
        }
        try {
            block17 : {
                block16 : {
                    block15 : {
                        block14 : {
                            if (this.M0) {
                                this.x1();
                                return;
                            }
                            if (this.Q == null && !this.u1(2)) {
                                return;
                            }
                            this.f1();
                            if (!this.z0) break block14;
                            F.a("bypassRender");
                            while (this.j0(l8, l9)) {
                            }
                            break block15;
                        }
                        if (this.Z != null) {
                            long l10 = this.L().b();
                            F.a("drainAndFeed");
                            while (this.y0(l8, l9) && this.H1(l10)) {
                            }
                            while (this.A0() && this.H1(l10)) {
                            }
                        }
                        break block16;
                    }
                    F.b();
                    break block17;
                }
                object = this.Q0;
                object.d += this.g0(l8);
                this.u1(1);
            }
            this.Q0.c();
            return;
        }
        catch (IllegalStateException illegalStateException) {}
        if (!w.c1(illegalStateException)) throw illegalStateException;
        this.h1((Exception)illegalStateException);
        bl = bl2;
        if (M.a >= 21) {
            bl = bl2;
            if (w.e1(illegalStateException)) {
                bl = true;
            }
        }
        if (bl) {
            this.w1();
        }
        o o8 = this.t0((Throwable)illegalStateException, this.H0());
        if (o8.q == 1101) {
            n8 = 4006;
            throw this.K((Throwable)o8, this.Q, bl, n8);
        }
        n8 = 4003;
        throw this.K((Throwable)o8, this.Q, bl, n8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void f1() {
        if (this.Z != null) return;
        if (this.z0) return;
        q q8 = this.Q;
        if (q8 == null) {
            return;
        }
        if (this.a1(q8)) {
            this.W0(q8);
            return;
        }
        this.C1(this.T);
        if (this.S == null || this.Y0()) {
            p0.n n8 = this.S;
            boolean bl = n8 != null && n8.f((String)a.h(q8.n));
            this.g1(this.V, bl);
        }
        if ((q8 = this.V) == null) return;
        if (this.Z != null) return;
        q8.release();
        this.V = null;
        return;
        catch (d d8) {
            throw this.J((Throwable)d8, q8, 4001);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g1(MediaCrypto mediaCrypto, boolean bl) {
        Object object;
        q q8;
        List list;
        q8 = (q)a.e(this.Q);
        if (this.e0 == null) {
            try {
                list = this.E0(bl);
                object = new ArrayDeque();
                this.e0 = object;
                if (this.H) {
                    object.addAll((Collection)list);
                } else if (!list.isEmpty()) {
                    this.e0.add((Object)((p)list.get(0)));
                }
                this.f0 = null;
            }
            catch (I.c c8) {
                throw new d(q8, (Throwable)c8, bl, -49998);
            }
        }
        if (this.e0.isEmpty()) throw new d(q8, null, bl, -49999);
        list = (ArrayDeque)a.e((Object)this.e0);
        do {
            if (this.Z != null) {
                this.e0 = null;
                return;
            }
            object = (p)a.e((p)list.peekFirst());
            if (!this.I1((p)object)) {
                return;
            }
            try {
                this.X0((p)object, mediaCrypto);
                continue;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to initialize decoder: ");
                stringBuilder.append(object);
                g0.o.i("MediaCodecRenderer", stringBuilder.toString(), (Throwable)exception);
                list.removeFirst();
                object = new d(q8, (Throwable)exception, bl, (p)object);
                this.h1((Exception)object);
                this.f0 = this.f0 == null ? object : this.f0.c((d)((Object)object));
                if (list.isEmpty()) throw this.f0;
                continue;
            }
            break;
        } while (true);
    }

    public abstract void h1(Exception var1);

    public final void i0() {
        v0 v02;
        block9 : {
            a.f(this.L0 ^ true);
            v02 = this.N();
            this.L.m();
            do {
                Object object;
                this.L.m();
                int n8 = this.e0(v02, this.L, 0);
                if (n8 == -5) break block9;
                if (n8 != -4) {
                    if (n8 == -3) {
                        if (this.p()) {
                            this.K0 = this.J0;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                if (this.L.p()) {
                    this.L0 = true;
                    this.K0 = this.J0;
                    return;
                }
                this.J0 = Math.max((long)this.J0, (long)this.L.t);
                if (this.p() || this.K.u()) {
                    this.K0 = this.J0;
                }
                if (this.N0) {
                    object = (q)a.e(this.Q);
                    this.R = object;
                    if (Objects.equals((Object)object.n, (Object)"audio/opus") && !this.R.q.isEmpty()) {
                        n8 = K.f((byte[])this.R.q.get(0));
                        this.R = ((q)a.e(this.R)).a().V(n8).K();
                    }
                    this.l1(this.R, null);
                    this.N0 = false;
                }
                this.L.C();
                object = this.R;
                if (object == null || !Objects.equals((Object)object.n, (Object)"audio/opus")) continue;
                if (this.L.o()) {
                    object = this.L;
                    object.p = this.R;
                    this.T0((i)object);
                }
                if (!K.g(this.P(), this.L.t)) continue;
                this.P.a(this.L, ((q)a.e((Object)this.R)).q);
            } while (this.V0() && this.M.H(this.L));
            this.A0 = true;
            return;
        }
        this.k1(v02);
    }

    public abstract void i1(String var1, m.a var2, long var3, long var5);

    public final boolean j0(long l8, long l9) {
        a.f(this.M0 ^ true);
        if (this.M.U()) {
            j j8 = this.M;
            if (this.s1(l8, l9, null, j8.r, this.v0, 0, j8.T(), this.M.M(), this.b1(this.P(), this.M.S()), this.M.p(), (q)a.e(this.R))) {
                this.n1(this.M.S());
                this.M.m();
            } else {
                return false;
            }
        }
        if (this.L0) {
            this.M0 = true;
            return false;
        }
        if (this.A0) {
            a.f(this.M.H(this.L));
            this.A0 = false;
        }
        if (this.B0) {
            if (this.M.U()) {
                return true;
            }
            this.u0();
            this.B0 = false;
            this.f1();
            if (!this.z0) {
                return false;
            }
        }
        this.i0();
        if (this.M.U()) {
            this.M.C();
        }
        if (!(this.M.U() || this.L0 || this.B0)) {
            return false;
        }
        return true;
    }

    public abstract void j1(String var1);

    public abstract k0.p k0(p var1, q var2, q var3);

    /*
     * Enabled aggressive block sorting
     */
    public k0.p k1(v0 object) {
        k0.p p8;
        q q8;
        int n8;
        Object object2;
        block13 : {
            block14 : {
                block9 : {
                    block15 : {
                        block17 : {
                            int n9;
                            block10 : {
                                boolean bl;
                                boolean bl2;
                                block16 : {
                                    block11 : {
                                        block12 : {
                                            bl = true;
                                            this.N0 = true;
                                            Object object3 = (q)a.e(object.b);
                                            object2 = object3.n;
                                            if (object2 == null) {
                                                throw this.J((Throwable)new IllegalArgumentException("Sample MIME type is null."), (q)object3, 4005);
                                            }
                                            q8 = object3;
                                            if (Objects.equals((Object)object2, (Object)"video/av01")) {
                                                q8 = object3;
                                                if (!object3.q.isEmpty()) {
                                                    q8 = object3.a().b0(null).K();
                                                }
                                            }
                                            this.G1(object.a);
                                            this.Q = q8;
                                            if (this.z0) {
                                                this.B0 = true;
                                                return null;
                                            }
                                            object = this.Z;
                                            if (object == null) {
                                                this.e0 = null;
                                                this.f1();
                                                return null;
                                            }
                                            object3 = (p)a.e(this.g0);
                                            object2 = (q)a.e(this.a0);
                                            if (this.z0((p)object3, q8, this.S, this.T)) {
                                                this.w0();
                                                return new k0.p(object3.a, (q)object2, q8, 0, 128);
                                            }
                                            n8 = this.T != this.S ? 1 : 0;
                                            bl2 = n8 == 0 || M.a >= 23;
                                            a.f(bl2);
                                            p8 = this.k0((p)object3, (q)object2, q8);
                                            int n10 = p8.d;
                                            if (n10 == 0) break block9;
                                            n9 = 16;
                                            if (n10 == 1) break block10;
                                            if (n10 == 2) break block11;
                                            if (n10 != 3) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.N1(q8)) break block12;
                                            n8 = n9;
                                            break block13;
                                        }
                                        this.a0 = q8;
                                        if (n8 == 0 || this.x0()) break block14;
                                        break block15;
                                    }
                                    if (this.N1(q8)) break block16;
                                    n8 = n9;
                                    break block13;
                                }
                                this.C0 = true;
                                this.D0 = 1;
                                n9 = this.h0;
                                bl2 = bl;
                                if (n9 != 2) {
                                    bl2 = n9 == 1 && q8.t == object2.t && q8.u == object2.u ? bl : false;
                                }
                                this.p0 = bl2;
                                this.a0 = q8;
                                if (n8 == 0 || this.x0()) break block14;
                                break block15;
                            }
                            if (this.N1(q8)) break block17;
                            n8 = n9;
                            break block13;
                        }
                        this.a0 = q8;
                        if (!(n8 != 0 ? !this.x0() : !this.v0())) break block14;
                    }
                    n8 = 2;
                    break block13;
                }
                this.w0();
            }
            n8 = 0;
        }
        if (p8.d == 0) return p8;
        if (this.Z == object && this.F0 != 3) {
            return p8;
        }
        return new k0.p(object3.a, (q)object2, q8, 0, n8);
    }

    public final int l0(String string2) {
        String string3;
        int n8 = M.a;
        if (n8 <= 25 && "OMX.Exynos.avc.dec.secure".equals((Object)string2) && ((string3 = M.d).startsWith("SM-T585") || string3.startsWith("SM-A510") || string3.startsWith("SM-A520") || string3.startsWith("SM-J700"))) {
            return 2;
        }
        if (n8 < 24 && ("OMX.Nvidia.h264.decode".equals((Object)string2) || "OMX.Nvidia.h264.decode.secure".equals((Object)string2)) && ("flounder".equals((Object)(string2 = M.b)) || "flounder_lte".equals((Object)string2) || "grouper".equals((Object)string2) || "tilapia".equals((Object)string2))) {
            return 1;
        }
        return 0;
    }

    public abstract void l1(q var1, MediaFormat var2);

    public void m1(long l8) {
    }

    public void n1(long l8) {
        this.S0 = l8;
        while (!this.O.isEmpty() && l8 >= ((f)this.O.peek()).a) {
            this.D1((f)a.e((f)this.O.poll()));
            this.o1();
        }
    }

    public void o1() {
    }

    public void p1(i i8) {
    }

    @Override
    public final long q(long l8, long l9) {
        return this.M0(this.s0, l8, l9);
    }

    public void q1(q q8) {
    }

    public final void r1() {
        int n8 = this.F0;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    this.M0 = true;
                    this.x1();
                    return;
                }
                this.v1();
                return;
            }
            this.B0();
            this.O1();
            return;
        }
        this.B0();
    }

    @Override
    public final int s() {
        return 8;
    }

    public abstract boolean s1(long var1, long var3, m var5, ByteBuffer var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, q var14);

    @Override
    public void t(int n8, Object object) {
        if (n8 == 11) {
            this.U = (Y0.a)object;
            return;
        }
        super.t(n8, object);
    }

    public o t0(Throwable throwable, p p8) {
        return new o(throwable, p8);
    }

    public final void t1() {
        this.I0 = true;
        MediaFormat mediaFormat = ((m)a.e(this.Z)).h();
        if (this.h0 != 0 && mediaFormat.getInteger("width") == 32 && mediaFormat.getInteger("height") == 32) {
            this.q0 = true;
            return;
        }
        if (this.o0) {
            mediaFormat.setInteger("channel-count", 1);
        }
        this.b0 = mediaFormat;
        this.c0 = true;
    }

    public final void u0() {
        this.B0 = false;
        this.M.m();
        this.L.m();
        this.A0 = false;
        this.z0 = false;
        this.P.d();
    }

    public final boolean u1(int n8) {
        v0 v02 = this.N();
        this.J.m();
        n8 = this.e0(v02, this.J, n8 | 4);
        if (n8 == -5) {
            this.k1(v02);
            return true;
        }
        if (n8 == -4 && this.J.p()) {
            this.L0 = true;
            this.r1();
        }
        return false;
    }

    public final boolean v0() {
        if (this.G0) {
            this.E0 = 1;
            if (!this.j0 && !this.l0) {
                this.F0 = 1;
                return true;
            }
            this.F0 = 3;
            return false;
        }
        return true;
    }

    public final void v1() {
        this.w1();
        this.f1();
    }

    public final void w0() {
        if (this.G0) {
            this.E0 = 1;
            this.F0 = 3;
            return;
        }
        this.v1();
    }

    public void w1() {
        Throwable throwable4;
        block14 : {
            Throwable throwable22;
            block13 : {
                MediaCrypto mediaCrypto;
                block10 : {
                    Throwable throwable32;
                    block12 : {
                        block11 : {
                            Object object;
                            block9 : {
                                try {
                                    object = this.Z;
                                    if (object == null) break block9;
                                }
                                catch (Throwable throwable22) {
                                    break block10;
                                }
                                object.release();
                                object = this.Q0;
                                ++object.b;
                                this.j1(((p)a.e((Object)this.g0)).a);
                            }
                            this.Z = null;
                            try {
                                object = this.V;
                                if (object == null) break block11;
                            }
                            catch (Throwable throwable32) {
                                break block12;
                            }
                            object.release();
                        }
                        this.V = null;
                        this.C1(null);
                        this.z1();
                        return;
                    }
                    this.V = null;
                    this.C1(null);
                    this.z1();
                    throw throwable32;
                }
                this.Z = null;
                try {
                    mediaCrypto = this.V;
                    if (mediaCrypto == null) break block13;
                }
                catch (Throwable throwable4) {
                    break block14;
                }
                mediaCrypto.release();
            }
            this.V = null;
            this.C1(null);
            this.z1();
            throw throwable22;
        }
        this.V = null;
        this.C1(null);
        this.z1();
        throw throwable4;
    }

    public final boolean x0() {
        if (this.G0) {
            this.E0 = 1;
            if (!this.j0 && !this.l0) {
                this.F0 = 2;
                return true;
            }
            this.F0 = 3;
            return false;
        }
        this.O1();
        return true;
    }

    public void x1() {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean y0(long l8, long l9) {
        block20 : {
            boolean bl;
            Object object;
            int n8;
            long l10;
            ByteBuffer byteBuffer;
            m m8 = (m)a.e(this.Z);
            if (!this.U0()) {
                if (this.m0 && this.H0) {
                    n8 = m8.d(this.N);
                } else {
                    n8 = m8.d(this.N);
                }
                if (n8 < 0) {
                    if (n8 == -2) {
                        this.t1();
                        return true;
                    }
                    if (!this.r0) return false;
                    if (!this.L0) {
                        if (this.E0 != 2) return false;
                    }
                    this.r1();
                    return false;
                }
                if (this.q0) {
                    this.q0 = false;
                    m8.f(n8, false);
                    return true;
                }
                byteBuffer = this.N;
                if (byteBuffer.size == 0 && (byteBuffer.flags & 4) != 0) {
                    this.r1();
                    return false;
                }
                this.v0 = n8;
                this.w0 = byteBuffer = m8.k(n8);
                if (byteBuffer != null) {
                    byteBuffer.position(this.N.offset);
                    byteBuffer = this.w0;
                    object = this.N;
                    byteBuffer.limit(object.offset + object.size);
                }
                if (this.n0) {
                    byteBuffer = this.N;
                    if (byteBuffer.presentationTimeUs == 0L && (byteBuffer.flags & 4) != 0 && this.J0 != -9223372036854775807L) {
                        byteBuffer.presentationTimeUs = this.K0;
                    }
                }
                bl = this.N.presentationTimeUs < this.P();
                this.x0 = bl;
                l10 = this.K0;
                bl = l10 != -9223372036854775807L && l10 <= this.N.presentationTimeUs;
                this.y0 = bl;
                this.P1(this.N.presentationTimeUs);
            }
            if (this.m0 && this.H0) {
                byteBuffer = this.w0;
                n8 = this.v0;
                object = this.N;
                int n9 = object.flags;
                l10 = object.presentationTimeUs;
                bl = this.x0;
                boolean bl2 = this.y0;
                object = (q)a.e(this.R);
                bl = this.s1(l8, l9, m8, byteBuffer, n8, n9, 1, l10, bl, bl2, (q)object);
            } else {
                byteBuffer = this.w0;
                n8 = this.v0;
                object = this.N;
                bl = this.s1(l8, l9, m8, byteBuffer, n8, object.flags, 1, object.presentationTimeUs, this.x0, this.y0, (q)a.e(this.R));
            }
            if (!bl) return false;
            this.n1(this.N.presentationTimeUs);
            n8 = (this.N.flags & 4) != 0 ? 1 : 0;
            this.B1();
            if (n8 == 0) {
                return true;
            }
            this.r1();
            return false;
            catch (IllegalStateException illegalStateException) {}
            this.r1();
            if (!this.M0) return false;
            this.w1();
            return false;
            catch (IllegalStateException illegalStateException) {}
            break block20;
            catch (IllegalStateException illegalStateException) {}
        }
        this.r1();
        if (!this.M0) return false;
        this.w1();
        return false;
    }

    public void y1() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final boolean z0(p p8, q q8, p0.n n8, p0.n n9) {
        boolean bl = false;
        if (n8 == n9) {
            return false;
        }
        if (n9 != null) {
            if (n8 == null) {
                return true;
            }
            j0.b b8 = n9.h();
            if (b8 == null) {
                return true;
            }
            j0.b b9 = n8.h();
            if (b9 != null) {
                if (!b8.getClass().equals((Object)b9.getClass())) {
                    return true;
                }
                if (!(b8 instanceof G)) {
                    return false;
                }
                if (!n9.d().equals((Object)n8.d())) {
                    return true;
                }
                if (M.a < 23) {
                    return true;
                }
                b8 = g.e;
                if (!b8.equals((Object)n8.d())) {
                    if (b8.equals((Object)n9.d())) {
                        return true;
                    }
                    boolean bl2 = bl;
                    if (!p8.g) {
                        bl2 = bl;
                        if (n9.f((String)a.e(q8.n))) {
                            bl2 = true;
                        }
                    }
                    return bl2;
                }
            }
        }
        return true;
    }

    public void z1() {
        this.y1();
        this.P0 = null;
        this.e0 = null;
        this.g0 = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = false;
        this.I0 = false;
        this.d0 = -1.0f;
        this.h0 = 0;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = false;
        this.s0 = false;
        this.C0 = false;
        this.D0 = 0;
    }

    public static final abstract class b {
        public static boolean a(m m8, e e8) {
            return m8.l(e8);
        }
    }

    public static final abstract class c {
        public static void a(m.a a8, y1 y12) {
            if (!O.a((LogSessionId)(y12 = y12.a()), (Object)g0.a())) {
                a8.b.setString("log-session-id", x.a((LogSessionId)y12));
            }
        }
    }

    public static class d
    extends Exception {
        public final String o;
        public final boolean p;
        public final p q;
        public final String r;
        public final d s;

        public d(q q8, Throwable throwable, boolean bl, int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: [");
            stringBuilder.append(n8);
            stringBuilder.append("], ");
            stringBuilder.append((Object)q8);
            this(stringBuilder.toString(), throwable, q8.n, bl, null, d.b(n8), null);
        }

        public d(q object, Throwable throwable, boolean bl, p p8) {
            Object object2 = new StringBuilder();
            object2.append("Decoder init failed: ");
            object2.append(p8.a);
            object2.append(", ");
            object2.append(object);
            object2 = object2.toString();
            String string2 = object.n;
            object = M.a >= 21 ? d.d(throwable) : null;
            this((String)object2, throwable, string2, bl, p8, (String)object, null);
        }

        public d(String string2, Throwable throwable, String string3, boolean bl, p p8, String string4, d d8) {
            super(string2, throwable);
            this.o = string3;
            this.p = bl;
            this.q = p8;
            this.r = string4;
            this.s = d8;
        }

        public static String b(int n8) {
            String string2 = n8 < 0 ? "neg_" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.media3.exoplayer.mediacodec");
            stringBuilder.append(".MediaCodecRenderer_");
            stringBuilder.append(string2);
            stringBuilder.append(Math.abs((int)n8));
            return stringBuilder.toString();
        }

        public static String d(Throwable throwable) {
            if (throwable instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException)throwable).getDiagnosticInfo();
            }
            return null;
        }

        public final d c(d d8) {
            return new d(this.getMessage(), this.getCause(), this.o, this.p, this.q, this.r, d8);
        }
    }

    public final class e
    implements m.c {
        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        @Override
        public void a() {
            if (w.this.U != null) {
                w.this.U.b();
            }
        }

        @Override
        public void b() {
            if (w.this.U != null) {
                w.this.U.b();
            }
        }
    }

    public static final class f {
        public static final f e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final D d;

        public f(long l8, long l9, long l10) {
            this.a = l8;
            this.b = l9;
            this.c = l10;
            this.d = new D();
        }
    }

}

