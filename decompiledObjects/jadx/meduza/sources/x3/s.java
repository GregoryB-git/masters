package x3;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v3.e1;
import v3.i0;
import v3.j1;
import v5.e0;
import w3.a0;
import x3.l;
import x3.m;
import x3.o;
import x3.u;

/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: d0, reason: collision with root package name */
    public static final Object f17038d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static ExecutorService f17039e0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f17040f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public x3.f[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public p X;
    public c Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final x3.e f17041a;

    /* renamed from: a0, reason: collision with root package name */
    public long f17042a0;

    /* renamed from: b, reason: collision with root package name */
    public final x3.g f17043b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f17044b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17045c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f17046c0;

    /* renamed from: d, reason: collision with root package name */
    public final r f17047d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f17048e;
    public final x3.f[] f;

    /* renamed from: g, reason: collision with root package name */
    public final x3.f[] f17049g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.g f17050h;

    /* renamed from: i, reason: collision with root package name */
    public final o f17051i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<h> f17052j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17053k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17054l;

    /* renamed from: m, reason: collision with root package name */
    public k f17055m;

    /* renamed from: n, reason: collision with root package name */
    public final i<m.b> f17056n;

    /* renamed from: o, reason: collision with root package name */
    public final i<m.e> f17057o;

    /* renamed from: p, reason: collision with root package name */
    public final u f17058p;

    /* renamed from: q, reason: collision with root package name */
    public w3.a0 f17059q;

    /* renamed from: r, reason: collision with root package name */
    public m.c f17060r;

    /* renamed from: s, reason: collision with root package name */
    public f f17061s;
    public f t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f17062u;

    /* renamed from: v, reason: collision with root package name */
    public x3.d f17063v;

    /* renamed from: w, reason: collision with root package name */
    public h f17064w;

    /* renamed from: x, reason: collision with root package name */
    public h f17065x;

    /* renamed from: y, reason: collision with root package name */
    public e1 f17066y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f17067z;

    public static final class a {
        public static void a(AudioTrack audioTrack, c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f17068a);
        }
    }

    public static final class b {
        public static void a(AudioTrack audioTrack, w3.a0 a0Var) {
            a0.a aVar = a0Var.f16196a;
            aVar.getClass();
            LogSessionId logSessionId = aVar.f16198a;
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f17068a;

        public c(AudioDeviceInfo audioDeviceInfo) {
            this.f17068a = audioDeviceInfo;
        }
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final u f17069a = new u(new u.a());
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public g f17071b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17072c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17073d;

        /* renamed from: a, reason: collision with root package name */
        public x3.e f17070a = x3.e.f16961c;

        /* renamed from: e, reason: collision with root package name */
        public int f17074e = 0;
        public u f = d.f17069a;
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f17075a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17076b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17077c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17078d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17079e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17080g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17081h;

        /* renamed from: i, reason: collision with root package name */
        public final x3.f[] f17082i;

        public f(i0 i0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, x3.f[] fVarArr) {
            this.f17075a = i0Var;
            this.f17076b = i10;
            this.f17077c = i11;
            this.f17078d = i12;
            this.f17079e = i13;
            this.f = i14;
            this.f17080g = i15;
            this.f17081h = i16;
            this.f17082i = fVarArr;
        }

        public static AudioAttributes c(x3.d dVar, boolean z10) {
            return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dVar.a().f16953a;
        }

        public final AudioTrack a(boolean z10, x3.d dVar, int i10) {
            try {
                AudioTrack b10 = b(z10, dVar, i10);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                throw new m.b(state, this.f17079e, this.f, this.f17081h, this.f17075a, this.f17077c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new m.b(0, this.f17079e, this.f, this.f17081h, this.f17075a, this.f17077c == 1, e10);
            }
        }

        public final AudioTrack b(boolean z10, x3.d dVar, int i10) {
            AudioTrack.Builder offloadedPlayback;
            int i11 = e0.f15881a;
            if (i11 >= 29) {
                offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(c(dVar, z10)).setAudioFormat(s.x(this.f17079e, this.f, this.f17080g)).setTransferMode(1).setBufferSizeInBytes(this.f17081h).setSessionId(i10).setOffloadedPlayback(this.f17077c == 1);
                return offloadedPlayback.build();
            }
            if (i11 >= 21) {
                return new AudioTrack(c(dVar, z10), s.x(this.f17079e, this.f, this.f17080g), this.f17081h, 1, i10);
            }
            int y10 = e0.y(dVar.f16950c);
            int i12 = this.f17079e;
            int i13 = this.f;
            int i14 = this.f17080g;
            int i15 = this.f17081h;
            return i10 == 0 ? new AudioTrack(y10, i12, i13, i14, i15, 1) : new AudioTrack(y10, i12, i13, i14, i15, 1, i10);
        }
    }

    public static class g implements x3.g {

        /* renamed from: a, reason: collision with root package name */
        public final x3.f[] f17083a;

        /* renamed from: b, reason: collision with root package name */
        public final a0 f17084b;

        /* renamed from: c, reason: collision with root package name */
        public final c0 f17085c;

        public g(x3.f... fVarArr) {
            a0 a0Var = new a0();
            c0 c0Var = new c0();
            x3.f[] fVarArr2 = new x3.f[fVarArr.length + 2];
            this.f17083a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f17084b = a0Var;
            this.f17085c = c0Var;
            fVarArr2[fVarArr.length] = a0Var;
            fVarArr2[fVarArr.length + 1] = c0Var;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f17086a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17087b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17088c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17089d;

        public h(e1 e1Var, boolean z10, long j10, long j11) {
            this.f17086a = e1Var;
            this.f17087b = z10;
            this.f17088c = j10;
            this.f17089d = j11;
        }
    }

    public static final class i<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        public T f17090a;

        /* renamed from: b, reason: collision with root package name */
        public long f17091b;

        public final void a(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f17090a == null) {
                this.f17090a = t;
                this.f17091b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f17091b) {
                T t10 = this.f17090a;
                if (t10 != t) {
                    t10.addSuppressed(t);
                }
                T t11 = this.f17090a;
                this.f17090a = null;
                throw t11;
            }
        }
    }

    public final class j implements o.a {
        public j() {
        }

        @Override // x3.o.a
        public final void a(final long j10) {
            final l.a aVar;
            Handler handler;
            m.c cVar = s.this.f17060r;
            if (cVar == null || (handler = (aVar = x.this.L0).f16986a) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: x3.h
                @Override // java.lang.Runnable
                public final void run() {
                    l.a aVar2 = l.a.this;
                    long j11 = j10;
                    l lVar = aVar2.f16987b;
                    int i10 = e0.f15881a;
                    lVar.s(j11);
                }
            });
        }

        @Override // x3.o.a
        public final void b(final int i10, final long j10) {
            if (s.this.f17060r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                s sVar = s.this;
                final long j11 = elapsedRealtime - sVar.f17042a0;
                final l.a aVar = x.this.L0;
                Handler handler = aVar.f16986a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: x3.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.a aVar2 = l.a.this;
                            int i11 = i10;
                            long j12 = j10;
                            long j13 = j11;
                            l lVar = aVar2.f16987b;
                            int i12 = e0.f15881a;
                            lVar.z(i11, j12, j13);
                        }
                    });
                }
            }
        }

        @Override // x3.o.a
        public final void c(long j10) {
            v5.m.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // x3.o.a
        public final void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + s.this.z() + ", " + s.this.A();
            Object obj = s.f17038d0;
            v5.m.f("DefaultAudioSink", str);
        }

        @Override // x3.o.a
        public final void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + s.this.z() + ", " + s.this.A();
            Object obj = s.f17038d0;
            v5.m.f("DefaultAudioSink", str);
        }
    }

    public final class k {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17093a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final a f17094b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i10) {
                s sVar;
                m.c cVar;
                j1.a aVar;
                if (audioTrack.equals(s.this.f17062u) && (cVar = (sVar = s.this).f17060r) != null && sVar.U && (aVar = x.this.V0) != null) {
                    aVar.b();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                s sVar;
                m.c cVar;
                j1.a aVar;
                if (audioTrack.equals(s.this.f17062u) && (cVar = (sVar = s.this).f17060r) != null && sVar.U && (aVar = x.this.V0) != null) {
                    aVar.b();
                }
            }
        }

        public k() {
        }
    }

    public s(e eVar) {
        this.f17041a = eVar.f17070a;
        g gVar = eVar.f17071b;
        this.f17043b = gVar;
        int i10 = e0.f15881a;
        this.f17045c = i10 >= 21 && eVar.f17072c;
        this.f17053k = i10 >= 23 && eVar.f17073d;
        this.f17054l = i10 >= 29 ? eVar.f17074e : 0;
        this.f17058p = eVar.f;
        b5.g gVar2 = new b5.g();
        this.f17050h = gVar2;
        gVar2.a();
        this.f17051i = new o(new j());
        r rVar = new r();
        this.f17047d = rVar;
        d0 d0Var = new d0();
        this.f17048e = d0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new z(), rVar, d0Var);
        Collections.addAll(arrayList, gVar.f17083a);
        this.f = (x3.f[]) arrayList.toArray(new x3.f[0]);
        this.f17049g = new x3.f[]{new w()};
        this.J = 1.0f;
        this.f17063v = x3.d.f16947o;
        this.W = 0;
        this.X = new p();
        e1 e1Var = e1.f15326d;
        this.f17065x = new h(e1Var, false, 0L, 0L);
        this.f17066y = e1Var;
        this.R = -1;
        this.K = new x3.f[0];
        this.L = new ByteBuffer[0];
        this.f17052j = new ArrayDeque<>();
        this.f17056n = new i<>();
        this.f17057o = new i<>();
    }

    public static boolean D(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (e0.f15881a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public static AudioFormat x(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final long A() {
        return this.t.f17077c == 0 ? this.D / r0.f17078d : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.B():boolean");
    }

    public final boolean C() {
        return this.f17062u != null;
    }

    public final void E() {
        if (this.T) {
            return;
        }
        this.T = true;
        o oVar = this.f17051i;
        long A = A();
        oVar.A = oVar.a();
        oVar.f17026y = SystemClock.elapsedRealtime() * 1000;
        oVar.B = A;
        this.f17062u.stop();
        this.A = 0;
    }

    public final void F(long j10) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = x3.f.f16967a;
                }
            }
            if (i10 == length) {
                M(byteBuffer, j10);
            } else {
                x3.f fVar = this.K[i10];
                if (i10 > this.R) {
                    fVar.b(byteBuffer);
                }
                ByteBuffer a10 = fVar.a();
                this.L[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void G() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f17046c0 = false;
        this.F = 0;
        this.f17065x = new h(y().f17086a, y().f17087b, 0L, 0L);
        this.I = 0L;
        this.f17064w = null;
        this.f17052j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f17067z = null;
        this.A = 0;
        this.f17048e.f16960o = 0L;
        while (true) {
            x3.f[] fVarArr = this.K;
            if (i10 >= fVarArr.length) {
                return;
            }
            x3.f fVar = fVarArr[i10];
            fVar.flush();
            this.L[i10] = fVar.a();
            i10++;
        }
    }

    public final void H(e1 e1Var, boolean z10) {
        h y10 = y();
        if (e1Var.equals(y10.f17086a) && z10 == y10.f17087b) {
            return;
        }
        h hVar = new h(e1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (C()) {
            this.f17064w = hVar;
        } else {
            this.f17065x = hVar;
        }
    }

    public final void I(e1 e1Var) {
        if (C()) {
            try {
                this.f17062u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e1Var.f15327a).setPitch(e1Var.f15328b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                v5.m.g("DefaultAudioSink", "Failed to set playback params", e10);
            }
            e1Var = new e1(this.f17062u.getPlaybackParams().getSpeed(), this.f17062u.getPlaybackParams().getPitch());
            o oVar = this.f17051i;
            oVar.f17012j = e1Var.f15327a;
            n nVar = oVar.f;
            if (nVar != null) {
                nVar.a();
            }
            oVar.c();
        }
        this.f17066y = e1Var;
    }

    public final void J() {
        if (C()) {
            if (e0.f15881a >= 21) {
                this.f17062u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f17062u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K() {
        /*
            r4 = this;
            boolean r0 = r4.Z
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L37
            x3.s$f r0 = r4.t
            v3.i0 r0 = r0.f17075a
            java.lang.String r0 = r0.t
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            x3.s$f r0 = r4.t
            v3.i0 r0 = r0.f17075a
            int r0 = r0.I
            boolean r3 = r4.f17045c
            if (r3 == 0) goto L33
            int r3 = v5.e0.f15881a
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r3) goto L2e
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r3) goto L2e
            r3 = 4
            if (r0 != r3) goto L2c
            goto L2e
        L2c:
            r0 = r2
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.K():boolean");
    }

    public final boolean L(i0 i0Var, x3.d dVar) {
        int o10;
        boolean isOffloadedPlaybackSupported;
        int i10;
        int i11 = e0.f15881a;
        if (i11 < 29 || this.f17054l == 0) {
            return false;
        }
        String str = i0Var.t;
        str.getClass();
        int d10 = v5.p.d(str, i0Var.f15454q);
        if (d10 == 0 || (o10 = e0.o(i0Var.G)) == 0) {
            return false;
        }
        AudioFormat x10 = x(i0Var.H, o10, d10);
        AudioAttributes audioAttributes = dVar.a().f16953a;
        if (i11 >= 31) {
            i10 = AudioManager.getPlaybackOffloadSupport(x10, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(x10, audioAttributes);
            i10 = !isOffloadedPlaybackSupported ? 0 : (i11 == 30 && e0.f15884d.startsWith("Pixel")) ? 2 : 1;
        }
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return ((i0Var.J != 0 || i0Var.K != 0) && (this.f17054l == 1)) ? false : true;
        }
        if (i10 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e3, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.M(java.nio.ByteBuffer, long):void");
    }

    @Override // x3.m
    public final boolean a(i0 i0Var) {
        return u(i0Var) != 0;
    }

    @Override // x3.m
    public final void b() {
        this.U = true;
        if (C()) {
            n nVar = this.f17051i.f;
            nVar.getClass();
            nVar.a();
            this.f17062u.play();
        }
    }

    @Override // x3.m
    public final void c(e1 e1Var) {
        e1 e1Var2 = new e1(e0.h(e1Var.f15327a, 0.1f, 8.0f), e0.h(e1Var.f15328b, 0.1f, 8.0f));
        if (!this.f17053k || e0.f15881a < 23) {
            H(e1Var2, y().f17087b);
        } else {
            I(e1Var2);
        }
    }

    @Override // x3.m
    public final boolean d() {
        return !C() || (this.S && !h());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0044  */
    @Override // x3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(v3.i0 r24, int[] r25) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.e(v3.i0, int[]):void");
    }

    @Override // x3.m
    public final e1 f() {
        return this.f17053k ? this.f17066y : y().f17086a;
    }

    @Override // x3.m
    public final void flush() {
        if (C()) {
            G();
            AudioTrack audioTrack = this.f17051i.f17006c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f17062u.pause();
            }
            if (D(this.f17062u)) {
                k kVar = this.f17055m;
                kVar.getClass();
                this.f17062u.unregisterStreamEventCallback(kVar.f17094b);
                kVar.f17093a.removeCallbacksAndMessages(null);
            }
            if (e0.f15881a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f17061s;
            if (fVar != null) {
                this.t = fVar;
                this.f17061s = null;
            }
            o oVar = this.f17051i;
            oVar.c();
            oVar.f17006c = null;
            oVar.f = null;
            AudioTrack audioTrack2 = this.f17062u;
            b5.g gVar = this.f17050h;
            synchronized (gVar) {
                gVar.f1869a = false;
            }
            synchronized (f17038d0) {
                try {
                    if (f17039e0 == null) {
                        f17039e0 = Executors.newSingleThreadExecutor(new t0.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f17040f0++;
                    f17039e0.execute(new x0.f(9, audioTrack2, gVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f17062u = null;
        }
        this.f17057o.f17090a = null;
        this.f17056n.f17090a = null;
    }

    @Override // x3.m
    public final void g() {
        if (!this.S && C() && w()) {
            E();
            this.S = true;
        }
    }

    @Override // x3.m
    public final boolean h() {
        return C() && this.f17051i.b(A());
    }

    @Override // x3.m
    public final void i(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.V = i10 != 0;
            flush();
        }
    }

    @Override // x3.m
    public final void j(p pVar) {
        if (this.X.equals(pVar)) {
            return;
        }
        int i10 = pVar.f17028a;
        float f10 = pVar.f17029b;
        AudioTrack audioTrack = this.f17062u;
        if (audioTrack != null) {
            if (this.X.f17028a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f17062u.setAuxEffectSendLevel(f10);
            }
        }
        this.X = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x00f5, code lost:
    
        if (r5.a() == 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    @Override // x3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(long r19, java.nio.ByteBuffer r21, int r22) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.k(long, java.nio.ByteBuffer, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d2, code lost:
    
        if (r11 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d5, code lost:
    
        if (r11 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bd A[Catch: Exception -> 0x01c8, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c8, blocks: (B:70:0x019a, B:72:0x01bd), top: B:69:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    @Override // x3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(boolean r29) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.l(boolean):long");
    }

    @Override // x3.m
    public final void m() {
        if (this.Z) {
            this.Z = false;
            flush();
        }
    }

    @Override // x3.m
    public final void n() {
        this.G = true;
    }

    @Override // x3.m
    public final void o(float f10) {
        if (this.J != f10) {
            this.J = f10;
            J();
        }
    }

    @Override // x3.m
    public final void p(w3.a0 a0Var) {
        this.f17059q = a0Var;
    }

    @Override // x3.m
    public final void pause() {
        boolean z10 = false;
        this.U = false;
        if (C()) {
            o oVar = this.f17051i;
            oVar.c();
            if (oVar.f17026y == -9223372036854775807L) {
                n nVar = oVar.f;
                nVar.getClass();
                nVar.a();
                z10 = true;
            }
            if (z10) {
                this.f17062u.pause();
            }
        }
    }

    @Override // x3.m
    public final void q() {
        x6.b.H(e0.f15881a >= 21);
        x6.b.H(this.V);
        if (this.Z) {
            return;
        }
        this.Z = true;
        flush();
    }

    @Override // x3.m
    public final /* synthetic */ void r() {
    }

    @Override // x3.m
    public final void reset() {
        flush();
        for (x3.f fVar : this.f) {
            fVar.reset();
        }
        for (x3.f fVar2 : this.f17049g) {
            fVar2.reset();
        }
        this.U = false;
        this.f17044b0 = false;
    }

    @Override // x3.m
    public final void s(x3.d dVar) {
        if (this.f17063v.equals(dVar)) {
            return;
        }
        this.f17063v = dVar;
        if (this.Z) {
            return;
        }
        flush();
    }

    @Override // x3.m
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        c cVar = audioDeviceInfo == null ? null : new c(audioDeviceInfo);
        this.Y = cVar;
        AudioTrack audioTrack = this.f17062u;
        if (audioTrack != null) {
            a.a(audioTrack, cVar);
        }
    }

    @Override // x3.m
    public final void t(boolean z10) {
        H(y().f17086a, z10);
    }

    @Override // x3.m
    public final int u(i0 i0Var) {
        if (!"audio/raw".equals(i0Var.t)) {
            if (this.f17044b0 || !L(i0Var, this.f17063v)) {
                return this.f17041a.a(i0Var) != null ? 2 : 0;
            }
            return 2;
        }
        if (e0.F(i0Var.I)) {
            int i10 = i0Var.I;
            return (i10 == 2 || (this.f17045c && i10 == 4)) ? 2 : 1;
        }
        StringBuilder l10 = defpackage.f.l("Invalid PCM encoding: ");
        l10.append(i0Var.I);
        v5.m.f("DefaultAudioSink", l10.toString());
        return 0;
    }

    public final void v(long j10) {
        e1 e1Var;
        boolean z10;
        l.a aVar;
        Handler handler;
        if (K()) {
            x3.g gVar = this.f17043b;
            e1Var = y().f17086a;
            c0 c0Var = ((g) gVar).f17085c;
            float f10 = e1Var.f15327a;
            if (c0Var.f16934c != f10) {
                c0Var.f16934c = f10;
                c0Var.f16939i = true;
            }
            float f11 = e1Var.f15328b;
            if (c0Var.f16935d != f11) {
                c0Var.f16935d = f11;
                c0Var.f16939i = true;
            }
        } else {
            e1Var = e1.f15326d;
        }
        e1 e1Var2 = e1Var;
        int i10 = 0;
        if (K()) {
            x3.g gVar2 = this.f17043b;
            boolean z11 = y().f17087b;
            ((g) gVar2).f17084b.f16897m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f17052j.add(new h(e1Var2, z10, Math.max(0L, j10), (A() * 1000000) / this.t.f17079e));
        x3.f[] fVarArr = this.t.f17082i;
        ArrayList arrayList = new ArrayList();
        for (x3.f fVar : fVarArr) {
            if (fVar.isActive()) {
                arrayList.add(fVar);
            } else {
                fVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (x3.f[]) arrayList.toArray(new x3.f[size]);
        this.L = new ByteBuffer[size];
        int i11 = 0;
        while (true) {
            x3.f[] fVarArr2 = this.K;
            if (i11 >= fVarArr2.length) {
                break;
            }
            x3.f fVar2 = fVarArr2[i11];
            fVar2.flush();
            this.L[i11] = fVar2.a();
            i11++;
        }
        m.c cVar = this.f17060r;
        if (cVar == null || (handler = (aVar = x.this.L0).f16986a) == null) {
            return;
        }
        handler.post(new x3.j(i10, aVar, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.R
            x3.f[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.F(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.M(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.s.w():boolean");
    }

    public final h y() {
        h hVar = this.f17064w;
        return hVar != null ? hVar : !this.f17052j.isEmpty() ? this.f17052j.getLast() : this.f17065x;
    }

    public final long z() {
        return this.t.f17077c == 0 ? this.B / r0.f17076b : this.C;
    }
}
