/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioDeviceInfo
 *  android.media.AudioFormat
 *  android.media.AudioRouting
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 *  android.media.AudioTrack$Builder
 *  android.media.PlaybackParams
 *  android.media.metrics.LogSessionId
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.ArrayDeque
 *  java.util.Objects
 *  java.util.concurrent.ExecutorService
 */
package m0;

import X2.g0;
import X2.v;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d0.b;
import d0.q;
import g0.a;
import g0.o;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import k0.w;
import l0.y1;
import m0.B;
import m0.C;
import m0.E;
import m0.G;
import m0.H;
import m0.I;
import m0.J;
import m0.K;
import m0.L;
import m0.M;
import m0.O;
import m0.P;
import m0.Q;
import m0.S;
import m0.T;
import m0.U;
import m0.V;
import m0.W;
import m0.X;
import m0.Y;
import m0.Z;
import m0.a0;
import m0.d0;
import m0.e0;
import m0.f0;
import m0.i;
import m0.y;
import m0.z;

public final class N
implements z {
    public static boolean n0 = false;
    public static final Object o0 = new Object();
    public static ExecutorService p0;
    public static int q0;
    public k A;
    public d0.b B;
    public j C;
    public j D;
    public d0.C E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public boolean a0;
    public final e0.c b;
    public int b0;
    public final boolean c;
    public d0.e c0;
    public final C d;
    public m0.j d0;
    public final f0 e;
    public boolean e0;
    public final v f;
    public long f0;
    public final v g;
    public long g0;
    public final g0.f h;
    public boolean h0;
    public final B i;
    public boolean i0;
    public final ArrayDeque j;
    public Looper j0;
    public final boolean k;
    public long k0;
    public int l;
    public long l0;
    public n m;
    public Handler m0;
    public final l n;
    public final l o;
    public final e p;
    public final d q;
    public final w.a r;
    public y1 s;
    public z.d t;
    public g u;
    public g v;
    public e0.a w;
    public AudioTrack x;
    public m0.e y;
    public m0.i z;

    public N(f f8) {
        Object object = f8.a;
        this.a = object;
        Object object2 = d0.b.g;
        this.B = object2;
        object = object != null ? m0.e.e((Context)object, (d0.b)object2, null) : f8.b;
        this.y = object;
        this.b = f8.c;
        int n8 = g0.M.a;
        boolean bl = true;
        boolean bl2 = n8 >= 21 && f8.d;
        this.c = bl2;
        bl2 = n8 >= 23 && f8.e ? bl : false;
        this.k = bl2;
        this.l = 0;
        this.p = f8.g;
        this.q = (d)a.e(f8.h);
        this.h = object = new g0.f(g0.c.a);
        object.e();
        this.i = new B(new m(null));
        this.d = object = new C();
        this.e = object2 = new f0();
        this.f = v.b0(new e0.g(), object, object2);
        this.g = v.Z(new e0());
        this.Q = 1.0f;
        this.b0 = 0;
        this.c0 = new d0.e(0, 0.0f);
        object = d0.C.d;
        this.D = new j((d0.C)object, 0L, 0L, null);
        this.E = object;
        this.F = false;
        this.j = new ArrayDeque();
        this.n = new l(100L);
        this.o = new l(100L);
        this.r = f8.i;
    }

    public /* synthetic */ N(f f8,  a8) {
        this(f8);
    }

    public static /* synthetic */ void D(AudioTrack audioTrack, z.d d8, Handler handler, z.a a8, g0.f f8) {
        N.d0(audioTrack, d8, handler, a8, f8);
    }

    public static /* synthetic */ void E(z.d d8, z.a a8) {
        d8.e(a8);
    }

    public static /* synthetic */ void F(N n8) {
        n8.f0();
    }

    public static int T(int n8, int n9, int n10) {
        boolean bl = (n8 = AudioTrack.getMinBufferSize((int)n8, (int)n9, (int)n10)) != -2;
        a.f(bl);
        return n8;
    }

    /*
     * Exception decompiling
     */
    public static int U(int var0, ByteBuffer var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
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

    public static boolean Z(int n8) {
        if (g0.M.a >= 24 && n8 == -6 || n8 == -32) {
            return true;
        }
        return false;
    }

    public static boolean b0(AudioTrack audioTrack) {
        if (g0.M.a >= 29 && I.a(audioTrack)) {
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void d0(AudioTrack object, z.d object2, Handler handler, z.a a8, g0.f f8) {
        int n8;
        try {
            object.flush();
            object.release();
        }
        catch (Throwable throwable) {
            int n9;
            if (object2 != null && handler.getLooper().getThread().isAlive()) {
                handler.post((Runnable)new M((z.d)object2, a8));
            }
            f8.e();
            object2 = o0;
            // MONITORENTER : object2
            q0 = n9 = q0 - 1;
            if (n9 == 0) {
                p0.shutdown();
                p0 = null;
            }
            // MONITOREXIT : object2
            throw throwable;
        }
        if (object2 != null && handler.getLooper().getThread().isAlive()) {
            handler.post((Runnable)new M((z.d)object2, a8));
        }
        f8.e();
        object = o0;
        // MONITORENTER : object
        q0 = n8 = q0 - 1;
        if (n8 == 0) {
            p0.shutdown();
            p0 = null;
        }
        // MONITOREXIT : object
        return;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l0(AudioTrack audioTrack, g0.f f8, z.d d8, z.a a8) {
        f8.c();
        Handler handler = new Handler(Looper.myLooper());
        Object object = o0;
        synchronized (object) {
            try {
                if (p0 == null) {
                    p0 = g0.M.K0("ExoPlayer:AudioTrackReleaseThread");
                }
                ++q0;
                p0.execute((Runnable)new J(audioTrack, d8, handler, a8, f8));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void q0(AudioTrack audioTrack, float f8) {
        audioTrack.setVolume(f8);
    }

    public static void r0(AudioTrack audioTrack, float f8) {
        audioTrack.setStereoVolume(f8, f8);
    }

    public static int x0(AudioTrack audioTrack, ByteBuffer byteBuffer, int n8) {
        return audioTrack.write(byteBuffer, n8, 1);
    }

    @Override
    public void A(g0.c c8) {
        this.i.u(c8);
    }

    @Override
    public void B() {
        this.N = true;
    }

    @Override
    public void C(z.d d8) {
        this.t = d8;
    }

    public final void N(long l8) {
        Object object;
        if (!this.v0()) {
            object = this.t0() ? this.b.a(this.E) : d0.C.d;
            this.E = object;
        } else {
            object = d0.C.d;
        }
        boolean bl = this.t0() ? this.b.c(this.F) : false;
        this.F = bl;
        this.j.add((Object)new j((d0.C)object, Math.max((long)0L, (long)l8), this.v.i(this.W()), null));
        this.s0();
        object = this.t;
        if (object != null) {
            object.c(this.F);
        }
    }

    public final long O(long l8) {
        while (!this.j.isEmpty() && l8 >= ((j)this.j.getFirst()).c) {
            this.D = (j)this.j.remove();
        }
        long l9 = this.D.c;
        if (this.j.isEmpty()) {
            l8 = this.b.d(l8 - l9);
            return this.D.b + l8;
        }
        j j8 = (j)this.j.getFirst();
        l8 = g0.M.c0(j8.c - l8, this.D.a.a);
        return j8.b - l8;
    }

    public final long P(long l8) {
        long l9 = this.b.b();
        long l10 = this.v.i(l9);
        long l11 = this.k0;
        if (l9 > l11) {
            l11 = this.v.i(l9 - l11);
            this.k0 = l9;
            this.X(l11);
        }
        return l8 + l10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final AudioTrack Q(g g8) {
        Object object;
        try {
            g8 = g8.a(this.B, this.b0);
            object = this.r;
            if (object == null) return g8;
        }
        catch (z.c c8) {}
        object.m(N.b0((AudioTrack)g8));
        return g8;
        object = this.t;
        if (object == null) throw c8;
        object.d(c8);
        throw c8;
    }

    public final AudioTrack R() {
        try {
            AudioTrack audioTrack = this.Q((g)a.e(this.v));
            return audioTrack;
        }
        catch (z.c c8) {
            g g8 = this.v;
            if (g8.h > 1000000) {
                g8 = g8.d(1000000);
                try {
                    AudioTrack audioTrack = this.Q(g8);
                    this.v = g8;
                    return audioTrack;
                }
                catch (z.c c9) {
                    c8.addSuppressed((Throwable)c9);
                }
            }
            this.e0();
            throw c8;
        }
    }

    public final boolean S() {
        boolean bl;
        block6 : {
            block7 : {
                boolean bl2 = this.w.f();
                boolean bl3 = false;
                bl = false;
                if (!bl2) {
                    ByteBuffer byteBuffer = this.T;
                    if (byteBuffer == null) {
                        return true;
                    }
                    this.w0(byteBuffer, Long.MIN_VALUE);
                    if (this.T == null) {
                        bl = true;
                    }
                    return bl;
                }
                this.w.h();
                this.j0(Long.MIN_VALUE);
                bl = bl3;
                if (!this.w.e()) break block6;
                ByteBuffer byteBuffer = this.T;
                if (byteBuffer == null) break block7;
                bl = bl3;
                if (byteBuffer.hasRemaining()) break block6;
            }
            bl = true;
        }
        return bl;
    }

    public final long V() {
        g g8 = this.v;
        if (g8.c == 0) {
            return this.I / (long)g8.b;
        }
        return this.J;
    }

    public final long W() {
        g g8 = this.v;
        if (g8.c == 0) {
            return g0.M.l(this.K, g8.d);
        }
        return this.L;
    }

    public final void X(long l8) {
        this.l0 += l8;
        if (this.m0 == null) {
            this.m0 = new Handler(Looper.myLooper());
        }
        this.m0.removeCallbacksAndMessages((Object)null);
        this.m0.postDelayed((Runnable)new K(this), 100L);
    }

    public final boolean Y() {
        int n8;
        Object object;
        if (!this.h.d()) {
            return false;
        }
        Object object2 = this.R();
        this.x = object2;
        if (N.b0((AudioTrack)object2)) {
            this.k0(this.x);
            object = this.v;
            if (object.k) {
                object2 = this.x;
                object = object.a;
                H.a((AudioTrack)object2, object.E, object.F);
            }
        }
        if ((n8 = g0.M.a) >= 31 && (object2 = this.s) != null) {
            c.a(this.x, (y1)object2);
        }
        this.b0 = this.x.getAudioSessionId();
        object2 = this.i;
        object = this.x;
        g g8 = this.v;
        boolean bl = g8.c == 2;
        object2.s((AudioTrack)object, bl, g8.g, g8.d, g8.h);
        this.p0();
        int n9 = this.c0.a;
        if (n9 != 0) {
            this.x.attachAuxEffect(n9);
            this.x.setAuxEffectSendLevel(this.c0.b);
        }
        if ((object2 = this.d0) != null && n8 >= 23) {
            b.a(this.x, (m0.j)object2);
            object2 = this.z;
            if (object2 != null) {
                object2.i(this.d0.a);
            }
        }
        if (n8 >= 24 && (object2 = this.z) != null) {
            this.A = new k(this.x, (m0.i)object2);
        }
        this.O = true;
        object2 = this.t;
        if (object2 != null) {
            object2.a(this.v.b());
        }
        return true;
    }

    @Override
    public boolean a(q q8) {
        if (this.o(q8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if (this.x != null) {
            return true;
        }
        return false;
    }

    @Override
    public void b() {
        this.flush();
        Object object = this.f.q();
        while (object.hasNext()) {
            ((e0.b)object.next()).b();
        }
        object = this.g.q();
        while (object.hasNext()) {
            ((e0.b)object.next()).b();
        }
        object = this.w;
        if (object != null) {
            object.j();
        }
        this.Z = false;
        this.h0 = false;
    }

    @Override
    public boolean c() {
        if (this.a0() && (!this.W || this.i())) {
            return false;
        }
        return true;
    }

    @Override
    public void d(boolean bl) {
        this.F = bl;
        d0.C c8 = this.v0() ? d0.C.d : this.E;
        this.n0(c8);
    }

    @Override
    public void e() {
        boolean bl = g0.M.a >= 21;
        a.f(bl);
        a.f(this.a0);
        if (!this.e0) {
            this.e0 = true;
            this.flush();
        }
    }

    public final void e0() {
        if (!this.v.m()) {
            return;
        }
        this.h0 = true;
    }

    @Override
    public void f(AudioDeviceInfo audioDeviceInfo) {
        Object object = audioDeviceInfo == null ? null : new m0.j(audioDeviceInfo);
        this.d0 = object;
        object = this.z;
        if (object != null) {
            object.i(audioDeviceInfo);
        }
        if ((audioDeviceInfo = this.x) != null) {
            b.a((AudioTrack)audioDeviceInfo, this.d0);
        }
    }

    public final void f0() {
        if (this.l0 >= 300000L) {
            this.t.g();
            this.l0 = 0L;
        }
    }

    @Override
    public void flush() {
        Object object;
        if (this.a0()) {
            int n8;
            this.m0();
            if (this.i.i()) {
                this.x.pause();
            }
            if (N.b0(this.x)) {
                ((n)a.e(this.m)).b(this.x);
            }
            if ((n8 = g0.M.a) < 21 && !this.a0) {
                this.b0 = 0;
            }
            object = this.v.b();
            Object object2 = this.u;
            if (object2 != null) {
                this.v = object2;
                this.u = null;
            }
            this.i.q();
            if (n8 >= 24 && (object2 = this.A) != null) {
                object2.c();
                this.A = null;
            }
            N.l0(this.x, this.h, this.t, (z.a)object);
            this.x = null;
        }
        this.o.a();
        this.n.a();
        this.k0 = 0L;
        this.l0 = 0L;
        object = this.m0;
        if (object != null) {
            ((Handler)a.e(object)).removeCallbacksAndMessages((Object)null);
        }
    }

    @Override
    public void g() {
        if (!this.W && this.a0() && this.S()) {
            this.i0();
            this.W = true;
        }
    }

    public final void g0() {
        if (this.z == null && this.a != null) {
            m0.i i8;
            this.j0 = Looper.myLooper();
            this.z = i8 = new m0.i(this.a, new L(this), this.B, this.d0);
            this.y = i8.g();
        }
    }

    @Override
    public d0.C h() {
        return this.E;
    }

    public void h0(m0.e object) {
        Looper looper = this.j0;
        Looper looper2 = Looper.myLooper();
        if (looper != looper2) {
            String string2 = "null";
            object = looper == null ? "null" : looper.getThread().getName();
            if (looper2 != null) {
                string2 = looper2.getThread().getName();
            }
            looper2 = new StringBuilder();
            looper2.append("Current looper (");
            looper2.append(string2);
            looper2.append(") is not the playback looper (");
            looper2.append((String)object);
            looper2.append(")");
            throw new IllegalStateException(looper2.toString());
        }
        if (!object.equals(this.y)) {
            this.y = object;
            object = this.t;
            if (object != null) {
                object.f();
            }
        }
    }

    @Override
    public boolean i() {
        if (this.a0() && (g0.M.a < 29 || !I.a(this.x) || !this.Y) && this.i.h(this.W())) {
            return true;
        }
        return false;
    }

    public final void i0() {
        if (!this.X) {
            this.X = true;
            this.i.g(this.W());
            if (N.b0(this.x)) {
                this.Y = false;
            }
            this.x.stop();
            this.H = 0;
        }
    }

    @Override
    public void j() {
        this.Z = false;
        if (this.a0() && (this.i.p() || N.b0(this.x))) {
            this.x.pause();
        }
    }

    public final void j0(long l8) {
        if (!this.w.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer == null) {
                byteBuffer = e0.b.a;
            }
            this.w0(byteBuffer, l8);
            return;
        }
        while (!this.w.e()) {
            ByteBuffer byteBuffer;
            while ((byteBuffer = this.w.d()).hasRemaining()) {
                this.w0(byteBuffer, l8);
                if (!byteBuffer.hasRemaining()) continue;
                return;
            }
            byteBuffer = this.R;
            if (byteBuffer == null) break;
            if (!byteBuffer.hasRemaining()) {
                return;
            }
            this.w.i(this.R);
        }
    }

    @Override
    public void k(d0.C c8) {
        this.E = new d0.C(g0.M.o(c8.a, 0.1f, 8.0f), g0.M.o(c8.b, 0.1f, 8.0f));
        if (this.v0()) {
            this.o0();
            return;
        }
        this.n0(c8);
    }

    public final void k0(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new n();
        }
        this.m.a(audioTrack);
    }

    @Override
    public void l(float f8) {
        if (this.Q != f8) {
            this.Q = f8;
            this.p0();
        }
    }

    @Override
    public void m(d0.e e8) {
        if (this.c0.equals(e8)) {
            return;
        }
        int n8 = e8.a;
        float f8 = e8.b;
        AudioTrack audioTrack = this.x;
        if (audioTrack != null) {
            if (this.c0.a != n8) {
                audioTrack.attachAuxEffect(n8);
            }
            if (n8 != 0) {
                this.x.setAuxEffectSendLevel(f8);
            }
        }
        this.c0 = e8;
    }

    public final void m0() {
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.i0 = false;
        this.M = 0;
        this.D = new j(this.E, 0L, 0L, null);
        this.P = 0L;
        this.C = null;
        this.j.clear();
        this.R = null;
        this.S = 0;
        this.T = null;
        this.X = false;
        this.W = false;
        this.Y = false;
        this.G = null;
        this.H = 0;
        this.e.o();
        this.s0();
    }

    @Override
    public void n(int n8) {
        if (this.b0 != n8) {
            this.b0 = n8;
            boolean bl = n8 != 0;
            this.a0 = bl;
            this.flush();
        }
    }

    public final void n0(d0.C object) {
        object = new j((d0.C)object, -9223372036854775807L, -9223372036854775807L, null);
        if (this.a0()) {
            this.C = object;
            return;
        }
        this.D = object;
    }

    @Override
    public int o(q q8) {
        this.g0();
        if ("audio/raw".equals((Object)q8.n)) {
            if (!g0.M.A0(q8.D)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid PCM encoding: ");
                stringBuilder.append(q8.D);
                o.h("DefaultAudioSink", stringBuilder.toString());
                return 0;
            }
            int n8 = q8.D;
            if (n8 != 2) {
                if (this.c && n8 == 4) {
                    return 2;
                }
                return 1;
            }
            return 2;
        }
        if (this.y.k(q8, this.B)) {
            return 2;
        }
        return 0;
    }

    public final void o0() {
        if (this.a0()) {
            Object object = new PlaybackParams().allowDefaults().setSpeed(this.E.a).setPitch(this.E.b).setAudioFallbackMode(2);
            try {
                this.x.setPlaybackParams((PlaybackParams)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                o.i("DefaultAudioSink", "Failed to set playback params", (Throwable)illegalArgumentException);
            }
            this.E = object = new d0.C(this.x.getPlaybackParams().getSpeed(), this.x.getPlaybackParams().getPitch());
            this.i.t(object.a);
        }
    }

    @Override
    public void p() {
        this.Z = true;
        if (this.a0()) {
            this.i.v();
            this.x.play();
        }
    }

    public final void p0() {
        if (!this.a0()) {
            return;
        }
        if (g0.M.a >= 21) {
            N.q0(this.x, this.Q);
            return;
        }
        N.r0(this.x, this.Q);
    }

    @Override
    public void q(int n8, int n9) {
        Object object = this.x;
        if (object != null && N.b0((AudioTrack)object) && (object = this.v) != null && object.k) {
            H.a(this.x, n8, n9);
        }
    }

    @Override
    public m0.k r(q q8) {
        if (this.h0) {
            return m0.k.d;
        }
        return this.q.a(q8, this.B);
    }

    @Override
    public void release() {
        m0.i i8 = this.z;
        if (i8 != null) {
            i8.j();
        }
    }

    @Override
    public void s(d0.b b8) {
        if (this.B.equals(b8)) {
            return;
        }
        this.B = b8;
        if (this.e0) {
            return;
        }
        m0.i i8 = this.z;
        if (i8 != null) {
            i8.h(b8);
        }
        this.flush();
    }

    public final void s0() {
        e0.a a8;
        this.w = a8 = this.v.i;
        a8.b();
    }

    @Override
    public void t(y1 y12) {
        this.s = y12;
    }

    public final boolean t0() {
        if (!this.e0) {
            g g8 = this.v;
            if (g8.c == 0 && !this.u0(g8.a.D)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean u(ByteBuffer byteBuffer, long l8, int n8) {
        Object object = this.R;
        boolean bl = object == null || byteBuffer == object;
        a.a(bl);
        if (this.u != null) {
            if (!this.S()) {
                return false;
            }
            if (!this.u.c(this.v)) {
                this.i0();
                if (this.i()) {
                    return false;
                }
                this.flush();
            } else {
                this.v = this.u;
                this.u = null;
                object = this.x;
                if (object != null && N.b0((AudioTrack)object) && this.v.k) {
                    if (this.x.getPlayState() == 3) {
                        G.a(this.x);
                        this.i.a();
                    }
                    object = this.x;
                    q q8 = this.v.a;
                    H.a((AudioTrack)object, q8.E, q8.F);
                    this.i0 = true;
                }
            }
            this.N(l8);
        }
        if (!this.a0()) {
            try {
                bl = this.Y();
                if (!bl) {
                    return false;
                }
            }
            catch (z.c c8) {
                if (!c8.p) {
                    this.n.b(c8);
                    return false;
                }
                throw c8;
            }
        }
        this.n.a();
        if (this.O) {
            this.P = Math.max((long)0L, (long)l8);
            this.N = false;
            this.O = false;
            if (this.v0()) {
                this.o0();
            }
            this.N(l8);
            if (this.Z) {
                this.p();
            }
        }
        if (!this.i.k(this.W())) {
            return false;
        }
        if (this.R == null) {
            bl = byteBuffer.order() == ByteOrder.LITTLE_ENDIAN;
            a.a(bl);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            object = this.v;
            if (object.c != 0 && this.M == 0) {
                int n9;
                this.M = n9 = N.U(object.g, byteBuffer);
                if (n9 == 0) {
                    return true;
                }
            }
            if (this.C != null) {
                if (!this.S()) {
                    return false;
                }
                this.N(l8);
                this.C = null;
            }
            long l9 = this.P + this.v.l(this.V() - this.e.n());
            if (!this.N && Math.abs((long)(l9 - l8)) > 200000L) {
                object = this.t;
                if (object != null) {
                    object.d(new z.e(l8, l9));
                }
                this.N = true;
            }
            if (this.N) {
                if (!this.S()) {
                    return false;
                }
                l9 = l8 - l9;
                this.P += l9;
                this.N = false;
                this.N(l8);
                object = this.t;
                if (object != null && l9 != 0L) {
                    object.h();
                }
            }
            if (this.v.c == 0) {
                this.I += (long)byteBuffer.remaining();
            } else {
                this.J += (long)this.M * (long)n8;
            }
            this.R = byteBuffer;
            this.S = n8;
        }
        this.j0(l8);
        if (!this.R.hasRemaining()) {
            this.R = null;
            this.S = 0;
            return true;
        }
        if (this.i.j(this.W())) {
            o.h("DefaultAudioSink", "Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }

    public final boolean u0(int n8) {
        if (this.c && g0.M.z0(n8)) {
            return true;
        }
        return false;
    }

    @Override
    public void v(int n8) {
        boolean bl = g0.M.a >= 29;
        a.f(bl);
        this.l = n8;
    }

    public final boolean v0() {
        g g8 = this.v;
        if (g8 != null && g8.j && g0.M.a >= 23) {
            return true;
        }
        return false;
    }

    @Override
    public long w(boolean bl) {
        if (this.a0() && !this.O) {
            return this.P(this.O(Math.min((long)this.i.d(bl), (long)this.v.i(this.W()))));
        }
        return Long.MIN_VALUE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void w0(ByteBuffer var1_1, long var2_2) {
        block25 : {
            if (!var1_1.hasRemaining()) {
                return;
            }
            var10_3 = this.T;
            var9_4 = true;
            var8_5 = true;
            if (var10_3 != null) {
                var7_6 = var10_3 == var1_1;
                a.a(var7_6);
            } else {
                this.T = var1_1;
                if (g0.M.a < 21) {
                    var4_7 = var1_1.remaining();
                    var10_3 = this.U;
                    if (var10_3 == null || var10_3.length < var4_7) {
                        this.U = new byte[var4_7];
                    }
                    var5_8 = var1_1.position();
                    var1_1.get(this.U, 0, var4_7);
                    var1_1.position(var5_8);
                    this.V = 0;
                }
            }
            var6_9 = var1_1.remaining();
            if (g0.M.a < 21) {
                var4_7 = this.i.c(this.K);
                if (var4_7 > 0) {
                    var4_7 = Math.min((int)var6_9, (int)var4_7);
                    var4_7 = var5_8 = this.x.write(this.U, this.V, var4_7);
                    if (var5_8 > 0) {
                        this.V += var5_8;
                        var1_1.position(var1_1.position() + var5_8);
                        var4_7 = var5_8;
                    }
                } else {
                    var4_7 = 0;
                }
            } else if (this.e0) {
                var7_6 = var2_2 != -9223372036854775807L;
                a.f(var7_6);
                if (var2_2 == Long.MIN_VALUE) {
                    var2_2 = this.f0;
                } else {
                    this.f0 = var2_2;
                }
                var4_7 = this.y0(this.x, (ByteBuffer)var1_1, var6_9, var2_2);
            } else {
                var4_7 = N.x0(this.x, (ByteBuffer)var1_1, var6_9);
            }
            this.g0 = SystemClock.elapsedRealtime();
            if (var4_7 >= 0) break block25;
            if (!N.Z(var4_7)) ** GOTO lbl-1000
            if (this.W() > 0L) {
                var7_6 = var8_5;
            } else if (N.b0(this.x)) {
                this.e0();
                var7_6 = var8_5;
            } else lbl-1000: // 2 sources:
            {
                var7_6 = false;
            }
            var1_1 = new z.f(var4_7, this.v.a, var7_6);
            var10_3 = this.t;
            if (var10_3 != null) {
                var10_3.d((Exception)var1_1);
            }
            if (!var1_1.p) {
                this.o.b((Exception)var1_1);
                return;
            }
            this.y = m0.e.c;
            throw var1_1;
        }
        this.o.a();
        if (N.b0(this.x)) {
            if (this.L > 0L) {
                this.i0 = false;
            }
            if (this.Z && (var10_3 = this.t) != null && var4_7 < var6_9 && !this.i0) {
                var10_3.i();
            }
        }
        if ((var5_8 = this.v.c) == 0) {
            this.K += (long)var4_7;
        }
        if (var4_7 != var6_9) return;
        if (var5_8 != 0) {
            var7_6 = var1_1 == this.R ? var9_4 : false;
            a.f(var7_6);
            this.L += (long)this.M * (long)this.S;
        }
        this.T = null;
    }

    @Override
    public void x() {
        if (this.e0) {
            this.e0 = false;
            this.flush();
        }
    }

    @Override
    public /* synthetic */ void y(long l8) {
        y.a(this, l8);
    }

    public final int y0(AudioTrack audioTrack, ByteBuffer byteBuffer, int n8, long l8) {
        int n9;
        if (g0.M.a >= 26) {
            return audioTrack.write(byteBuffer, n8, 1, l8 * 1000L);
        }
        if (this.G == null) {
            ByteBuffer byteBuffer2;
            this.G = byteBuffer2 = ByteBuffer.allocate((int)16);
            byteBuffer2.order(ByteOrder.BIG_ENDIAN);
            this.G.putInt(1431633921);
        }
        if (this.H == 0) {
            this.G.putInt(4, n8);
            this.G.putLong(8, l8 * 1000L);
            this.G.position(0);
            this.H = n8;
        }
        if ((n9 = this.G.remaining()) > 0) {
            int n10 = audioTrack.write(this.G, n9, 1);
            if (n10 < 0) {
                this.H = 0;
                return n10;
            }
            if (n10 < n9) {
                return 0;
            }
        }
        if ((n8 = N.x0(audioTrack, byteBuffer, n8)) < 0) {
            this.H = 0;
            return n8;
        }
        this.H -= n8;
        return n8;
    }

    @Override
    public void z(q q8, int n8, int[] arrn) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static final abstract class b {
        public static void a(AudioTrack audioTrack, m0.j j8) {
            j8 = j8 == null ? null : j8.a;
            audioTrack.setPreferredDevice((AudioDeviceInfo)j8);
        }
    }

    public static final abstract class c {
        public static void a(AudioTrack audioTrack, y1 y12) {
            if (!O.a((LogSessionId)(y12 = y12.a()), (Object)k0.g0.a())) {
                P.a(audioTrack, (LogSessionId)y12);
            }
        }
    }

    public static interface d {
        public m0.k a(q var1, d0.b var2);
    }

    public static interface e {
        public static final e a = new a0.a().h();

        public int a(int var1, int var2, int var3, int var4, int var5, int var6, double var7);
    }

    public static final class f {
        public final Context a;
        public m0.e b;
        public e0.c c;
        public boolean d;
        public boolean e;
        public boolean f;
        public e g;
        public d h;
        public w.a i;

        public f(Context context) {
            this.a = context;
            this.b = m0.e.c;
            this.g = e.a;
        }

        public N i() {
            a.f(this.f ^ true);
            this.f = true;
            if (this.c == null) {
                this.c = new h(new e0.b[0]);
            }
            if (this.h == null) {
                this.h = new E(this.a);
            }
            return new N(this, null);
        }

        public f j(boolean bl) {
            this.e = bl;
            return this;
        }

        public f k(boolean bl) {
            this.d = bl;
            return this;
        }
    }

    public static final class g {
        public final q a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final e0.a i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public g(q q8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, e0.a a8, boolean bl, boolean bl2, boolean bl3) {
            this.a = q8;
            this.b = n8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
            this.h = n14;
            this.i = a8;
            this.j = bl;
            this.k = bl2;
            this.l = bl3;
        }

        public static AudioAttributes j(d0.b b8, boolean bl) {
            if (bl) {
                return g.k();
            }
            return b8.a().a;
        }

        public static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public AudioTrack a(d0.b b8, int n8) {
            void var1_3;
            b8 = this.e(b8, n8);
            n8 = b8.getState();
            if (n8 == 1) {
                return b8;
            }
            try {
                b8.release();
            }
            catch (Exception exception) {
                throw new z.c(n8, this.e, this.f, this.h, this.a, this.m(), null);
            }
            throw new z.c(n8, this.e, this.f, this.h, this.a, this.m(), null);
            catch (IllegalArgumentException illegalArgumentException) {
                throw new z.c(0, this.e, this.f, this.h, this.a, this.m(), (Exception)var1_3);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw new z.c(0, this.e, this.f, this.h, this.a, this.m(), (Exception)var1_3);
            }
        }

        public z.a b() {
            int n8 = this.g;
            int n9 = this.e;
            int n10 = this.f;
            boolean bl = this.l;
            int n11 = this.c;
            boolean bl2 = true;
            if (n11 != 1) {
                bl2 = false;
            }
            return new z.a(n8, n9, n10, bl, bl2, this.h);
        }

        public boolean c(g g8) {
            if (g8.c == this.c && g8.g == this.g && g8.e == this.e && g8.f == this.f && g8.d == this.d && g8.j == this.j && g8.k == this.k) {
                return true;
            }
            return false;
        }

        public g d(int n8) {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, n8, this.i, this.j, this.k, this.l);
        }

        public final AudioTrack e(d0.b b8, int n8) {
            int n9 = g0.M.a;
            if (n9 >= 29) {
                return this.g(b8, n8);
            }
            if (n9 >= 21) {
                return this.f(b8, n8);
            }
            return this.h(b8, n8);
        }

        public final AudioTrack f(d0.b b8, int n8) {
            return new AudioTrack(g.j(b8, this.l), g0.M.L(this.e, this.f, this.g), this.h, 1, n8);
        }

        public final AudioTrack g(d0.b b8, int n8) {
            AudioFormat audioFormat = g0.M.L(this.e, this.f, this.g);
            b8 = g.j(b8, this.l);
            b8 = new AudioTrack.Builder().setAudioAttributes((AudioAttributes)b8).setAudioFormat(audioFormat);
            boolean bl = true;
            b8 = b8.setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(n8);
            if (this.c != 1) {
                bl = false;
            }
            return Q.a((AudioTrack.Builder)b8, bl).build();
        }

        public final AudioTrack h(d0.b b8, int n8) {
            int n9 = g0.M.k0(b8.c);
            int n10 = this.e;
            int n11 = this.f;
            int n12 = this.g;
            int n13 = this.h;
            if (n8 == 0) {
                b8 = new AudioTrack(n9, n10, n11, n12, n13, 1);
                return b8;
            }
            b8 = new AudioTrack(n9, n10, n11, n12, n13, 1, n8);
            return b8;
        }

        public long i(long l8) {
            return g0.M.V0(l8, this.e);
        }

        public long l(long l8) {
            return g0.M.V0(l8, this.a.C);
        }

        public boolean m() {
            if (this.c == 1) {
                return true;
            }
            return false;
        }
    }

    public static class h
    implements e0.c {
        public final e0.b[] a;
        public final d0 b;
        public final e0.f c;

        public /* varargs */ h(e0.b ... arrb) {
            this(arrb, new d0(), new e0.f());
        }

        public h(e0.b[] arrb, d0 d02, e0.f f8) {
            e0.b[] arrb2 = new e0.b[arrb.length + 2];
            this.a = arrb2;
            System.arraycopy((Object)arrb, (int)0, (Object)arrb2, (int)0, (int)arrb.length);
            this.b = d02;
            this.c = f8;
            arrb2[arrb.length] = d02;
            arrb2[arrb.length + 1] = f8;
        }

        @Override
        public d0.C a(d0.C c8) {
            this.c.j(c8.a);
            this.c.i(c8.b);
            return c8;
        }

        @Override
        public long b() {
            return this.b.v();
        }

        @Override
        public boolean c(boolean bl) {
            this.b.E(bl);
            return bl;
        }

        @Override
        public long d(long l8) {
            long l9 = l8;
            if (this.c.a()) {
                l9 = this.c.h(l8);
            }
            return l9;
        }

        @Override
        public e0.b[] e() {
            return this.a;
        }
    }

    public static final class i
    extends RuntimeException {
        public i(String string2) {
            super(string2);
        }

        public /* synthetic */ i(String string2,  a8) {
            this(string2);
        }
    }

    public static final class j {
        public final d0.C a;
        public final long b;
        public final long c;

        public j(d0.C c8, long l8, long l9) {
            this.a = c8;
            this.b = l8;
            this.c = l9;
        }

        public /* synthetic */ j(d0.C c8, long l8, long l9,  a8) {
            this(c8, l8, l9);
        }
    }

    public static final class k {
        public final AudioTrack a;
        public final m0.i b;
        public AudioRouting.OnRoutingChangedListener c;

        public k(AudioTrack audioTrack, m0.i i8) {
            this.a = audioTrack;
            this.b = i8;
            this.c = new W(this);
            i8 = new Handler(Looper.myLooper());
            S.a(audioTrack, this.c, (Handler)i8);
        }

        public static /* synthetic */ void a(k k8, AudioRouting audioRouting) {
            k8.b(audioRouting);
        }

        private void b(AudioRouting audioRouting) {
            if (this.c == null) {
                return;
            }
            if (V.a(audioRouting) != null) {
                this.b.i(V.a(audioRouting));
            }
        }

        public void c() {
            U.a(this.a, T.a(a.e((Object)this.c)));
            this.c = null;
        }
    }

    public static final class l {
        public final long a;
        public Exception b;
        public long c;

        public l(long l8) {
            this.a = l8;
        }

        public void a() {
            this.b = null;
        }

        public void b(Exception exception) {
            long l8 = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exception;
                this.c = this.a + l8;
            }
            if (l8 >= this.c) {
                Exception exception2 = this.b;
                if (exception2 != exception) {
                    exception2.addSuppressed((Throwable)exception);
                }
                exception = this.b;
                this.a();
                throw exception;
            }
        }
    }

    public final class m
    implements B.a {
        public m() {
        }

        public /* synthetic */ m( a8) {
            this();
        }

        @Override
        public void a(int n8, long l8) {
            if (N.this.t != null) {
                long l9 = SystemClock.elapsedRealtime();
                long l10 = N.this.g0;
                N.this.t.k(n8, l8, l9 - l10);
            }
        }

        @Override
        public void b(long l8) {
            if (N.this.t != null) {
                N.this.t.b(l8);
            }
        }

        @Override
        public void c(long l8, long l9, long l10, long l11) {
            Object object = new StringBuilder();
            object.append("Spurious audio timestamp (frame position mismatch): ");
            object.append(l8);
            object.append(", ");
            object.append(l9);
            object.append(", ");
            object.append(l10);
            object.append(", ");
            object.append(l11);
            object.append(", ");
            object.append(N.this.V());
            object.append(", ");
            object.append(N.this.W());
            object = object.toString();
            if (!N.n0) {
                o.h("DefaultAudioSink", (String)object);
                return;
            }
            throw new i((String)object, null);
        }

        @Override
        public void d(long l8, long l9, long l10, long l11) {
            Object object = new StringBuilder();
            object.append("Spurious audio timestamp (system clock mismatch): ");
            object.append(l8);
            object.append(", ");
            object.append(l9);
            object.append(", ");
            object.append(l10);
            object.append(", ");
            object.append(l11);
            object.append(", ");
            object.append(N.this.V());
            object.append(", ");
            object.append(N.this.W());
            object = object.toString();
            if (!N.n0) {
                o.h("DefaultAudioSink", (String)object);
                return;
            }
            throw new i((String)object, null);
        }

        @Override
        public void e(long l8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring impossibly large audio latency: ");
            stringBuilder.append(l8);
            o.h("DefaultAudioSink", stringBuilder.toString());
        }
    }

    public final class n {
        public final Handler a;
        public final AudioTrack$StreamEventCallback b;

        public n() {
            this.a = new Handler(Looper.myLooper());
            this.b = new AudioTrack$StreamEventCallback(N.this){
                public final /* synthetic */ N a;
                {
                    this.a = n9;
                }

                public void onDataRequest(AudioTrack audioTrack, int n8) {
                    if (!audioTrack.equals((Object)N.this.x)) {
                        return;
                    }
                    if (N.this.t != null && N.this.Z) {
                        N.this.t.j();
                    }
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    if (!audioTrack.equals((Object)N.this.x)) {
                        return;
                    }
                    N.this.Y = true;
                }

                public void onTearDown(AudioTrack audioTrack) {
                    if (!audioTrack.equals((Object)N.this.x)) {
                        return;
                    }
                    if (N.this.t != null && N.this.Z) {
                        N.this.t.j();
                    }
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.a;
            Objects.requireNonNull((Object)handler);
            Y.a(audioTrack, new Z(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            X.a(audioTrack, this.b);
            this.a.removeCallbacksAndMessages((Object)null);
        }

    }

}

