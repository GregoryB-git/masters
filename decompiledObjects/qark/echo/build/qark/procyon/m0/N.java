// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import java.util.concurrent.Executor;
import java.util.Objects;
import android.media.AudioTrack$StreamEventCallback;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack$Builder;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.metrics.LogSessionId;
import android.os.SystemClock;
import java.nio.ByteOrder;
import android.media.PlaybackParams;
import g0.o;
import X2.g0;
import d0.q;
import F0.K;
import F0.p;
import F0.I;
import e0.g;
import g0.M;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import e0.a;
import l0.y1;
import k0.w;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import g0.f;
import X2.v;
import d0.e;
import e0.c;
import android.content.Context;
import java.nio.ByteBuffer;
import d0.C;
import d0.b;
import java.util.concurrent.ExecutorService;

public final class N implements z
{
    public static boolean n0 = false;
    public static final Object o0;
    public static ExecutorService p0;
    public static int q0;
    public k A;
    public d0.b B;
    public j C;
    public j D;
    public C E;
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
    public final m0.C d;
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
    
    static {
        o0 = new Object();
    }
    
    public N(final f f) {
        final Context a = m0.N.f.a(f);
        this.a = a;
        final d0.b g = d0.b.g;
        this.B = g;
        m0.e y;
        if (a != null) {
            y = m0.e.e(a, g, null);
        }
        else {
            y = m0.N.f.c(f);
        }
        this.y = y;
        this.b = m0.N.f.d(f);
        final int a2 = g0.M.a;
        final boolean b = true;
        this.c = (a2 >= 21 && m0.N.f.e(f));
        this.k = (a2 >= 23 && m0.N.f.f(f) && b);
        this.l = 0;
        this.p = m0.N.f.g(f);
        this.q = (d)g0.a.e(m0.N.f.h(f));
        (this.h = new g0.f(g0.c.a)).e();
        this.i = new B((B.a)new m(null));
        final m0.C d = new m0.C();
        this.d = d;
        final f0 e = new f0();
        this.e = e;
        this.f = X2.v.b0(new e0.g(), d, e);
        this.g = X2.v.Z(new e0());
        this.Q = 1.0f;
        this.b0 = 0;
        this.c0 = new d0.e(0, 0.0f);
        final C d2 = d0.C.d;
        this.D = new j(d2, 0L, 0L, null);
        this.E = d2;
        this.F = false;
        this.j = new ArrayDeque();
        this.n = new l(100L);
        this.o = new l(100L);
        this.r = m0.N.f.b(f);
    }
    
    public static /* synthetic */ AudioTrack G(final N n) {
        return n.x;
    }
    
    public static /* synthetic */ z.d H(final N n) {
        return n.t;
    }
    
    public static /* synthetic */ boolean I(final N n) {
        return n.Z;
    }
    
    public static /* synthetic */ boolean J(final N n, final boolean y) {
        return n.Y = y;
    }
    
    public static /* synthetic */ long M(final N n) {
        return n.g0;
    }
    
    public static int T(int minBufferSize, final int n, final int n2) {
        minBufferSize = AudioTrack.getMinBufferSize(minBufferSize, n, n2);
        g0.a.f(minBufferSize != -2);
        return minBufferSize;
    }
    
    public static int U(int i, final ByteBuffer byteBuffer) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    default: {
                        switch (i) {
                            default: {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unexpected audio encoding: ");
                                sb.append(i);
                                throw new IllegalStateException(sb.toString());
                            }
                            case 17: {
                                return F0.c.c(byteBuffer);
                            }
                            case 16: {
                                return 1024;
                            }
                            case 15: {
                                return 512;
                            }
                            case 14: {
                                i = F0.b.b(byteBuffer);
                                if (i == -1) {
                                    return 0;
                                }
                                return F0.b.i(byteBuffer, i) * 16;
                            }
                            case 18: {
                                return F0.b.e(byteBuffer);
                            }
                        }
                        break;
                    }
                    case 11:
                    case 12: {
                        return 2048;
                    }
                    case 10: {
                        return 1024;
                    }
                    case 9: {
                        i = I.m(M.O(byteBuffer, byteBuffer.position()));
                        if (i != -1) {
                            return i;
                        }
                        throw new IllegalArgumentException();
                    }
                    case 5:
                    case 6: {
                        return F0.b.e(byteBuffer);
                    }
                    case 7:
                    case 8: {
                        break;
                    }
                }
            }
            return p.f(byteBuffer);
        }
        return K.h(byteBuffer);
    }
    
    public static boolean Z(final int n) {
        return (M.a >= 24 && n == -6) || n == -32;
    }
    
    public static boolean b0(final AudioTrack audioTrack) {
        return M.a >= 29 && m0.I.a(audioTrack);
    }
    
    public static void l0(final AudioTrack audioTrack, final g0.f f, final z.d d, final a a) {
        f.c();
        final Handler handler = new Handler(Looper.myLooper());
        final Object o0 = N.o0;
        // monitorenter(o0)
        while (true) {
            try {
                if (N.p0 == null) {
                    N.p0 = M.K0("ExoPlayer:AudioTrackReleaseThread");
                }
                ++N.q0;
                N.p0.execute(new J(audioTrack, d, handler, a, f));
                // monitorexit(o0)
                return;
                // monitorexit(o0)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void q0(final AudioTrack audioTrack, final float volume) {
        audioTrack.setVolume(volume);
    }
    
    public static void r0(final AudioTrack audioTrack, final float n) {
        audioTrack.setStereoVolume(n, n);
    }
    
    public static int x0(final AudioTrack audioTrack, final ByteBuffer byteBuffer, final int n) {
        return audioTrack.write(byteBuffer, n, 1);
    }
    
    @Override
    public void A(final g0.c c) {
        this.i.u(c);
    }
    
    @Override
    public void B() {
        this.N = true;
    }
    
    @Override
    public void C(final z.d t) {
        this.t = t;
    }
    
    public final void N(final long b) {
        C e;
        if (!this.v0()) {
            if (this.t0()) {
                e = this.b.a(this.E);
            }
            else {
                e = d0.C.d;
            }
            this.E = e;
        }
        else {
            e = d0.C.d;
        }
        this.F = (this.t0() && this.b.c(this.F));
        this.j.add(new j(e, Math.max(0L, b), this.v.i(this.W()), null));
        this.s0();
        final z.d t = this.t;
        if (t != null) {
            t.c(this.F);
        }
    }
    
    public final long O(long n) {
        while (!this.j.isEmpty() && n >= this.j.getFirst().c) {
            this.D = this.j.remove();
        }
        final long c = this.D.c;
        if (this.j.isEmpty()) {
            n = this.b.d(n - c);
            return this.D.b + n;
        }
        final j j = this.j.getFirst();
        n = g0.M.c0(j.c - n, this.D.a.a);
        return j.b - n;
    }
    
    public final long P(final long n) {
        final long b = this.b.b();
        final long i = this.v.i(b);
        final long k0 = this.k0;
        if (b > k0) {
            final long j = this.v.i(b - k0);
            this.k0 = b;
            this.X(j);
        }
        return n + i;
    }
    
    public final AudioTrack Q(final g g) {
        try {
            final AudioTrack a = g.a(this.B, this.b0);
            final w.a r = this.r;
            if (r != null) {
                r.m(b0(a));
                return a;
            }
            return a;
        }
        catch (z.c c) {
            final z.d t = this.t;
            if (t != null) {
                t.d(c);
            }
            throw c;
        }
    }
    
    public final AudioTrack R() {
        try {
            return this.Q((g)g0.a.e(this.v));
        }
        catch (z.c c) {
            final g v = this.v;
            if (v.h > 1000000) {
                final g d = v.d(1000000);
                try {
                    final AudioTrack q = this.Q(d);
                    this.v = d;
                    return q;
                }
                catch (z.c exception) {
                    c.addSuppressed(exception);
                }
            }
            this.e0();
            throw c;
        }
    }
    
    public final boolean S() {
        final boolean f = this.w.f();
        final boolean b = false;
        boolean b2 = false;
        if (f) {
            this.w.h();
            this.j0(Long.MIN_VALUE);
            boolean b3 = b;
            if (this.w.e()) {
                final ByteBuffer t = this.T;
                if (t != null) {
                    b3 = b;
                    if (t.hasRemaining()) {
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        final ByteBuffer t2 = this.T;
        if (t2 == null) {
            return true;
        }
        this.w0(t2, Long.MIN_VALUE);
        if (this.T == null) {
            b2 = true;
        }
        return b2;
    }
    
    public final long V() {
        final g v = this.v;
        if (v.c == 0) {
            return this.I / v.b;
        }
        return this.J;
    }
    
    public final long W() {
        final g v = this.v;
        if (v.c == 0) {
            return g0.M.l(this.K, v.d);
        }
        return this.L;
    }
    
    public final void X(final long n) {
        this.l0 += n;
        if (this.m0 == null) {
            this.m0 = new Handler(Looper.myLooper());
        }
        this.m0.removeCallbacksAndMessages((Object)null);
        this.m0.postDelayed((Runnable)new m0.K(this), 100L);
    }
    
    public final boolean Y() {
        if (!this.h.d()) {
            return false;
        }
        final AudioTrack r = this.R();
        this.x = r;
        if (b0(r)) {
            this.k0(this.x);
            final g v = this.v;
            if (v.k) {
                final AudioTrack x = this.x;
                final q a = v.a;
                m0.H.a(x, a.E, a.F);
            }
        }
        final int a2 = g0.M.a;
        if (a2 >= 31) {
            final y1 s = this.s;
            if (s != null) {
                m0.N.c.a(this.x, s);
            }
        }
        this.b0 = this.x.getAudioSessionId();
        final B i = this.i;
        final AudioTrack x2 = this.x;
        final g v2 = this.v;
        i.s(x2, v2.c == 2, v2.g, v2.d, v2.h);
        this.p0();
        final int a3 = this.c0.a;
        if (a3 != 0) {
            this.x.attachAuxEffect(a3);
            this.x.setAuxEffectSendLevel(this.c0.b);
        }
        final m0.j d0 = this.d0;
        if (d0 != null && a2 >= 23) {
            m0.N.b.a(this.x, d0);
            final m0.i z = this.z;
            if (z != null) {
                z.i(this.d0.a);
            }
        }
        if (a2 >= 24) {
            final m0.i z2 = this.z;
            if (z2 != null) {
                this.A = new k(this.x, z2);
            }
        }
        this.O = true;
        final z.d t = this.t;
        if (t != null) {
            t.a(this.v.b());
        }
        return true;
    }
    
    @Override
    public boolean a(final q q) {
        return this.o(q) != 0;
    }
    
    public final boolean a0() {
        return this.x != null;
    }
    
    @Override
    public void b() {
        this.flush();
        final g0 q = this.f.q();
        while (q.hasNext()) {
            q.next().b();
        }
        final g0 q2 = this.g.q();
        while (q2.hasNext()) {
            q2.next().b();
        }
        final e0.a w = this.w;
        if (w != null) {
            w.j();
        }
        this.Z = false;
        this.h0 = false;
    }
    
    @Override
    public boolean c() {
        return !this.a0() || (this.W && !this.i());
    }
    
    @Override
    public void d(final boolean f) {
        this.F = f;
        C c;
        if (this.v0()) {
            c = d0.C.d;
        }
        else {
            c = this.E;
        }
        this.n0(c);
    }
    
    @Override
    public void e() {
        g0.a.f(g0.M.a >= 21);
        g0.a.f(this.a0);
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
    public void f(final AudioDeviceInfo audioDeviceInfo) {
        m0.j d0;
        if (audioDeviceInfo == null) {
            d0 = null;
        }
        else {
            d0 = new m0.j(audioDeviceInfo);
        }
        this.d0 = d0;
        final m0.i z = this.z;
        if (z != null) {
            z.i(audioDeviceInfo);
        }
        final AudioTrack x = this.x;
        if (x != null) {
            m0.N.b.a(x, this.d0);
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
        if (this.a0()) {
            this.m0();
            if (this.i.i()) {
                this.x.pause();
            }
            if (b0(this.x)) {
                ((n)g0.a.e(this.m)).b(this.x);
            }
            final int a = g0.M.a;
            if (a < 21 && !this.a0) {
                this.b0 = 0;
            }
            final a b = this.v.b();
            final g u = this.u;
            if (u != null) {
                this.v = u;
                this.u = null;
            }
            this.i.q();
            if (a >= 24) {
                final k a2 = this.A;
                if (a2 != null) {
                    a2.c();
                    this.A = null;
                }
            }
            l0(this.x, this.h, this.t, b);
            this.x = null;
        }
        this.o.a();
        this.n.a();
        this.k0 = 0L;
        this.l0 = 0L;
        final Handler m0 = this.m0;
        if (m0 != null) {
            ((Handler)g0.a.e(m0)).removeCallbacksAndMessages((Object)null);
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
            this.j0 = Looper.myLooper();
            final m0.i z = new m0.i(this.a, (m0.i.f)new L(this), this.B, this.d0);
            this.z = z;
            this.y = z.g();
        }
    }
    
    @Override
    public C h() {
        return this.E;
    }
    
    public void h0(final m0.e y) {
        final Looper myLooper = Looper.myLooper();
        final Looper j0 = this.j0;
        if (j0 != myLooper) {
            String name = "null";
            String name2;
            if (j0 == null) {
                name2 = "null";
            }
            else {
                name2 = j0.getThread().getName();
            }
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Current looper (");
            sb.append(name);
            sb.append(") is not the playback looper (");
            sb.append(name2);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        if (!y.equals(this.y)) {
            this.y = y;
            final z.d t = this.t;
            if (t != null) {
                t.f();
            }
        }
    }
    
    @Override
    public boolean i() {
        return this.a0() && (g0.M.a < 29 || !m0.I.a(this.x) || !this.Y) && this.i.h(this.W());
    }
    
    public final void i0() {
        if (!this.X) {
            this.X = true;
            this.i.g(this.W());
            if (b0(this.x)) {
                this.Y = false;
            }
            this.x.stop();
            this.H = 0;
        }
    }
    
    @Override
    public void j() {
        this.Z = false;
        if (this.a0() && (this.i.p() || b0(this.x))) {
            this.x.pause();
        }
    }
    
    public final void j0(final long n) {
        if (!this.w.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer == null) {
                byteBuffer = e0.b.a;
            }
            this.w0(byteBuffer, n);
            return;
        }
    Label_0103:
        while (!this.w.e()) {
            ByteBuffer d;
            do {
                d = this.w.d();
                if (d.hasRemaining()) {
                    this.w0(d, n);
                }
                else {
                    final ByteBuffer r = this.R;
                    if (r == null) {
                        break Label_0103;
                    }
                    if (!r.hasRemaining()) {
                        return;
                    }
                    this.w.i(this.R);
                    continue Label_0103;
                }
            } while (!d.hasRemaining());
            return;
        }
    }
    
    @Override
    public void k(final C c) {
        this.E = new C(g0.M.o(c.a, 0.1f, 8.0f), g0.M.o(c.b, 0.1f, 8.0f));
        if (this.v0()) {
            this.o0();
            return;
        }
        this.n0(c);
    }
    
    public final void k0(final AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new n();
        }
        this.m.a(audioTrack);
    }
    
    @Override
    public void l(final float q) {
        if (this.Q != q) {
            this.Q = q;
            this.p0();
        }
    }
    
    @Override
    public void m(final d0.e c0) {
        if (this.c0.equals(c0)) {
            return;
        }
        final int a = c0.a;
        final float b = c0.b;
        final AudioTrack x = this.x;
        if (x != null) {
            if (this.c0.a != a) {
                x.attachAuxEffect(a);
            }
            if (a != 0) {
                this.x.setAuxEffectSendLevel(b);
            }
        }
        this.c0 = c0;
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
    public void n(final int b0) {
        if (this.b0 != b0) {
            this.b0 = b0;
            this.a0 = (b0 != 0);
            this.flush();
        }
    }
    
    public final void n0(final C c) {
        final j j = new j(c, -9223372036854775807L, -9223372036854775807L, null);
        if (this.a0()) {
            this.C = j;
            return;
        }
        this.D = j;
    }
    
    @Override
    public int o(final q q) {
        this.g0();
        if ("audio/raw".equals(q.n)) {
            if (!g0.M.A0(q.D)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid PCM encoding: ");
                sb.append(q.D);
                g0.o.h("DefaultAudioSink", sb.toString());
                return 0;
            }
            final int d = q.D;
            if (d == 2) {
                return 2;
            }
            if (this.c && d == 4) {
                return 2;
            }
            return 1;
        }
        else {
            if (this.y.k(q, this.B)) {
                return 2;
            }
            return 0;
        }
    }
    
    public final void o0() {
        if (this.a0()) {
            final PlaybackParams setAudioFallbackMode = new PlaybackParams().allowDefaults().setSpeed(this.E.a).setPitch(this.E.b).setAudioFallbackMode(2);
            try {
                this.x.setPlaybackParams(setAudioFallbackMode);
            }
            catch (IllegalArgumentException ex) {
                g0.o.i("DefaultAudioSink", "Failed to set playback params", ex);
            }
            final C e = new C(this.x.getPlaybackParams().getSpeed(), this.x.getPlaybackParams().getPitch());
            this.E = e;
            this.i.t(e.a);
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
            q0(this.x, this.Q);
            return;
        }
        r0(this.x, this.Q);
    }
    
    @Override
    public void q(final int n, final int n2) {
        final AudioTrack x = this.x;
        if (x != null && b0(x)) {
            final g v = this.v;
            if (v != null && v.k) {
                m0.H.a(this.x, n, n2);
            }
        }
    }
    
    @Override
    public m0.k r(final q q) {
        if (this.h0) {
            return m0.k.d;
        }
        return this.q.a(q, this.B);
    }
    
    @Override
    public void release() {
        final m0.i z = this.z;
        if (z != null) {
            z.j();
        }
    }
    
    @Override
    public void s(final d0.b b) {
        if (this.B.equals(b)) {
            return;
        }
        this.B = b;
        if (this.e0) {
            return;
        }
        final m0.i z = this.z;
        if (z != null) {
            z.h(b);
        }
        this.flush();
    }
    
    public final void s0() {
        (this.w = this.v.i).b();
    }
    
    @Override
    public void t(final y1 s) {
        this.s = s;
    }
    
    public final boolean t0() {
        if (!this.e0) {
            final g v = this.v;
            if (v.c == 0 && !this.u0(v.a.D)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean u(final ByteBuffer r, final long b, final int s) {
        final ByteBuffer r2 = this.R;
        g0.a.a(r2 == null || r == r2);
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
            }
            else {
                this.v = this.u;
                this.u = null;
                final AudioTrack x = this.x;
                if (x != null && b0(x) && this.v.k) {
                    if (this.x.getPlayState() == 3) {
                        m0.G.a(this.x);
                        this.i.a();
                    }
                    final AudioTrack x2 = this.x;
                    final q a = this.v.a;
                    m0.H.a(x2, a.E, a.F);
                    this.i0 = true;
                }
            }
            this.N(b);
        }
        if (!this.a0()) {
            try {
                if (!this.Y()) {
                    return false;
                }
            }
            catch (z.c c) {
                if (!c.p) {
                    this.n.b(c);
                    return false;
                }
                throw c;
            }
        }
        this.n.a();
        if (this.O) {
            this.P = Math.max(0L, b);
            this.N = false;
            this.O = false;
            if (this.v0()) {
                this.o0();
            }
            this.N(b);
            if (this.Z) {
                this.p();
            }
        }
        if (!this.i.k(this.W())) {
            return false;
        }
        if (this.R == null) {
            g0.a.a(r.order() == ByteOrder.LITTLE_ENDIAN);
            if (!r.hasRemaining()) {
                return true;
            }
            final g v = this.v;
            if (v.c != 0 && this.M == 0 && (this.M = U(v.g, r)) == 0) {
                return true;
            }
            if (this.C != null) {
                if (!this.S()) {
                    return false;
                }
                this.N(b);
                this.C = null;
            }
            final long n = this.P + this.v.l(this.V() - this.e.n());
            if (!this.N && Math.abs(n - b) > 200000L) {
                final z.d t = this.t;
                if (t != null) {
                    t.d(new z.e(b, n));
                }
                this.N = true;
            }
            if (this.N) {
                if (!this.S()) {
                    return false;
                }
                final long n2 = b - n;
                this.P += n2;
                this.N = false;
                this.N(b);
                final z.d t2 = this.t;
                if (t2 != null && n2 != 0L) {
                    t2.h();
                }
            }
            if (this.v.c == 0) {
                this.I += r.remaining();
            }
            else {
                this.J += this.M * (long)s;
            }
            this.R = r;
            this.S = s;
        }
        this.j0(b);
        if (!this.R.hasRemaining()) {
            this.R = null;
            this.S = 0;
            return true;
        }
        if (this.i.j(this.W())) {
            g0.o.h("DefaultAudioSink", "Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }
    
    public final boolean u0(final int n) {
        return this.c && g0.M.z0(n);
    }
    
    @Override
    public void v(final int l) {
        g0.a.f(g0.M.a >= 29);
        this.l = l;
    }
    
    public final boolean v0() {
        final g v = this.v;
        return v != null && v.j && g0.M.a >= 23;
    }
    
    @Override
    public long w(final boolean b) {
        if (this.a0() && !this.O) {
            return this.P(this.O(Math.min(this.i.d(b), this.v.i(this.W()))));
        }
        return Long.MIN_VALUE;
    }
    
    public final void w0(final ByteBuffer t, long f0) {
        if (!t.hasRemaining()) {
            return;
        }
        final ByteBuffer t2 = this.T;
        final boolean b = true;
        final boolean b2 = true;
        if (t2 != null) {
            g0.a.a(t2 == t);
        }
        else {
            this.T = t;
            if (g0.M.a < 21) {
                final int remaining = t.remaining();
                final byte[] u = this.U;
                if (u == null || u.length < remaining) {
                    this.U = new byte[remaining];
                }
                final int position = t.position();
                t.get(this.U, 0, remaining);
                t.position(position);
                this.V = 0;
            }
        }
        final int remaining2 = t.remaining();
        int n;
        if (g0.M.a < 21) {
            final int c = this.i.c(this.K);
            if (c > 0) {
                final int write = this.x.write(this.U, this.V, Math.min(remaining2, c));
                if ((n = write) > 0) {
                    this.V += write;
                    t.position(t.position() + write);
                    n = write;
                }
            }
            else {
                n = 0;
            }
        }
        else if (this.e0) {
            g0.a.f(f0 != -9223372036854775807L);
            if (f0 == Long.MIN_VALUE) {
                f0 = this.f0;
            }
            else {
                this.f0 = f0;
            }
            n = this.y0(this.x, t, remaining2, f0);
        }
        else {
            n = x0(this.x, t, remaining2);
        }
        this.g0 = SystemClock.elapsedRealtime();
        if (n >= 0) {
            this.o.a();
            if (b0(this.x)) {
                if (this.L > 0L) {
                    this.i0 = false;
                }
                if (this.Z) {
                    final z.d t3 = this.t;
                    if (t3 != null && n < remaining2 && !this.i0) {
                        t3.i();
                    }
                }
            }
            final int c2 = this.v.c;
            if (c2 == 0) {
                this.K += n;
            }
            if (n == remaining2) {
                if (c2 != 0) {
                    g0.a.f(t == this.R && b);
                    this.L += this.M * (long)this.S;
                }
                this.T = null;
            }
            return;
        }
        boolean b3 = false;
        Label_0371: {
            if (Z(n)) {
                if (this.W() > 0L) {
                    b3 = b2;
                    break Label_0371;
                }
                if (b0(this.x)) {
                    this.e0();
                    b3 = b2;
                    break Label_0371;
                }
            }
            b3 = false;
        }
        final z.f f2 = new z.f(n, this.v.a, b3);
        final z.d t4 = this.t;
        if (t4 != null) {
            t4.d(f2);
        }
        if (!f2.p) {
            this.o.b(f2);
            return;
        }
        this.y = m0.e.c;
        throw f2;
    }
    
    @Override
    public void x() {
        if (this.e0) {
            this.e0 = false;
            this.flush();
        }
    }
    
    public final int y0(final AudioTrack audioTrack, final ByteBuffer byteBuffer, int x0, final long n) {
        if (g0.M.a >= 26) {
            return audioTrack.write(byteBuffer, x0, 1, n * 1000L);
        }
        if (this.G == null) {
            (this.G = ByteBuffer.allocate(16)).order(ByteOrder.BIG_ENDIAN);
            this.G.putInt(1431633921);
        }
        if (this.H == 0) {
            this.G.putInt(4, x0);
            this.G.putLong(8, n * 1000L);
            this.G.position(0);
            this.H = x0;
        }
        final int remaining = this.G.remaining();
        if (remaining > 0) {
            final int write = audioTrack.write(this.G, remaining, 1);
            if (write < 0) {
                this.H = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        x0 = x0(audioTrack, byteBuffer, x0);
        if (x0 < 0) {
            this.H = 0;
            return x0;
        }
        this.H -= x0;
        return x0;
    }
    
    @Override
    public void z(final q q, final int n, final int[] array) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public abstract static final class b
    {
        public static void a(final AudioTrack audioTrack, final m0.j j) {
            AudioDeviceInfo a;
            if (j == null) {
                a = null;
            }
            else {
                a = j.a;
            }
            audioTrack.setPreferredDevice(a);
        }
    }
    
    public abstract static final class c
    {
        public static void a(final AudioTrack audioTrack, final y1 y1) {
            final LogSessionId a = y1.a();
            if (!O.a(a, (Object)k0.g0.a())) {
                P.a(audioTrack, a);
            }
        }
    }
    
    public interface d
    {
        m0.k a(final q p0, final d0.b p1);
    }
    
    public interface e
    {
        public static final e a = new a0.a().h();
        
        int a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final double p6);
    }
    
    public static final class f
    {
        public final Context a;
        public m0.e b;
        public e0.c c;
        public boolean d;
        public boolean e;
        public boolean f;
        public e g;
        public d h;
        public w.a i;
        
        public f(final Context a) {
            this.a = a;
            this.b = m0.e.c;
            this.g = e.a;
        }
        
        public static /* synthetic */ Context a(final f f) {
            return f.a;
        }
        
        public static /* synthetic */ w.a b(final f f) {
            return f.i;
        }
        
        public static /* synthetic */ m0.e c(final f f) {
            return f.b;
        }
        
        public static /* synthetic */ e0.c d(final f f) {
            return f.c;
        }
        
        public static /* synthetic */ boolean e(final f f) {
            return f.d;
        }
        
        public static /* synthetic */ boolean f(final f f) {
            return f.e;
        }
        
        public static /* synthetic */ e g(final f f) {
            return f.g;
        }
        
        public static /* synthetic */ d h(final f f) {
            return f.h;
        }
        
        public N i() {
            g0.a.f(this.f ^ true);
            this.f = true;
            if (this.c == null) {
                this.c = new h(new e0.b[0]);
            }
            if (this.h == null) {
                this.h = new E(this.a);
            }
            return new N(this, null);
        }
        
        public f j(final boolean e) {
            this.e = e;
            return this;
        }
        
        public f k(final boolean d) {
            this.d = d;
            return this;
        }
    }
    
    public static final class g
    {
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
        
        public g(final q a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final e0.a i, final boolean j, final boolean k, final boolean l) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        public static AudioAttributes j(final d0.b b, final boolean b2) {
            if (b2) {
                return k();
            }
            return b.a().a;
        }
        
        public static AudioAttributes k() {
            return new AudioAttributes$Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        
        public AudioTrack a(final d0.b p0, final int p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1        
            //     2: iload_2        
            //     3: invokevirtual   m0/N$g.e:(Ld0/b;I)Landroid/media/AudioTrack;
            //     6: astore_1       
            //     7: aload_1        
            //     8: invokevirtual   android/media/AudioTrack.getState:()I
            //    11: istore_2       
            //    12: iload_2        
            //    13: iconst_1       
            //    14: if_icmpne       19
            //    17: aload_1        
            //    18: areturn        
            //    19: aload_1        
            //    20: invokevirtual   android/media/AudioTrack.release:()V
            //    23: new             Lm0/z$c;
            //    26: dup            
            //    27: iload_2        
            //    28: aload_0        
            //    29: getfield        m0/N$g.e:I
            //    32: aload_0        
            //    33: getfield        m0/N$g.f:I
            //    36: aload_0        
            //    37: getfield        m0/N$g.h:I
            //    40: aload_0        
            //    41: getfield        m0/N$g.a:Ld0/q;
            //    44: aload_0        
            //    45: invokevirtual   m0/N$g.m:()Z
            //    48: aconst_null    
            //    49: invokespecial   m0/z$c.<init>:(IIIILd0/q;ZLjava/lang/Exception;)V
            //    52: athrow         
            //    53: astore_1       
            //    54: goto            61
            //    57: astore_1       
            //    58: goto            54
            //    61: new             Lm0/z$c;
            //    64: dup            
            //    65: iconst_0       
            //    66: aload_0        
            //    67: getfield        m0/N$g.e:I
            //    70: aload_0        
            //    71: getfield        m0/N$g.f:I
            //    74: aload_0        
            //    75: getfield        m0/N$g.h:I
            //    78: aload_0        
            //    79: getfield        m0/N$g.a:Ld0/q;
            //    82: aload_0        
            //    83: invokevirtual   m0/N$g.m:()Z
            //    86: aload_1        
            //    87: invokespecial   m0/z$c.<init>:(IIIILd0/q;ZLjava/lang/Exception;)V
            //    90: athrow         
            //    91: astore_1       
            //    92: goto            23
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                     
            //  -----  -----  -----  -----  -----------------------------------------
            //  0      7      57     61     Ljava/lang/UnsupportedOperationException;
            //  0      7      53     54     Ljava/lang/IllegalArgumentException;
            //  19     23     91     95     Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public a b() {
            final int g = this.g;
            final int e = this.e;
            final int f = this.f;
            final boolean l = this.l;
            final int c = this.c;
            boolean b = true;
            if (c != 1) {
                b = false;
            }
            return new a(g, e, f, l, b, this.h);
        }
        
        public boolean c(final g g) {
            return g.c == this.c && g.g == this.g && g.e == this.e && g.f == this.f && g.d == this.d && g.j == this.j && g.k == this.k;
        }
        
        public g d(final int n) {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, n, this.i, this.j, this.k, this.l);
        }
        
        public final AudioTrack e(final d0.b b, final int n) {
            final int a = g0.M.a;
            if (a >= 29) {
                return this.g(b, n);
            }
            if (a >= 21) {
                return this.f(b, n);
            }
            return this.h(b, n);
        }
        
        public final AudioTrack f(final d0.b b, final int n) {
            return new AudioTrack(j(b, this.l), g0.M.L(this.e, this.f, this.g), this.h, 1, n);
        }
        
        public final AudioTrack g(final d0.b b, final int sessionId) {
            final AudioTrack$Builder setAudioFormat = new AudioTrack$Builder().setAudioAttributes(j(b, this.l)).setAudioFormat(g0.M.L(this.e, this.f, this.g));
            boolean b2 = true;
            final AudioTrack$Builder setSessionId = setAudioFormat.setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(sessionId);
            if (this.c != 1) {
                b2 = false;
            }
            return m0.Q.a(setSessionId, b2).build();
        }
        
        public final AudioTrack h(final d0.b b, final int n) {
            final int k0 = g0.M.k0(b.c);
            final int e = this.e;
            final int f = this.f;
            final int g = this.g;
            final int h = this.h;
            if (n == 0) {
                return new AudioTrack(k0, e, f, g, h, 1);
            }
            return new AudioTrack(k0, e, f, g, h, 1, n);
        }
        
        public long i(final long n) {
            return g0.M.V0(n, this.e);
        }
        
        public long l(final long n) {
            return g0.M.V0(n, this.a.C);
        }
        
        public boolean m() {
            return this.c == 1;
        }
    }
    
    public static class h implements c
    {
        public final e0.b[] a;
        public final d0 b;
        public final e0.f c;
        
        public h(final e0.b... array) {
            this(array, new d0(), new e0.f());
        }
        
        public h(final e0.b[] array, final d0 b, final e0.f c) {
            final e0.b[] a = new e0.b[array.length + 2];
            System.arraycopy(array, 0, this.a = a, 0, array.length);
            this.b = b;
            this.c = c;
            a[array.length] = b;
            a[array.length + 1] = c;
        }
        
        @Override
        public C a(final C c) {
            this.c.j(c.a);
            this.c.i(c.b);
            return c;
        }
        
        @Override
        public long b() {
            return this.b.v();
        }
        
        @Override
        public boolean c(final boolean b) {
            this.b.E(b);
            return b;
        }
        
        @Override
        public long d(final long n) {
            long h = n;
            if (this.c.a()) {
                h = this.c.h(n);
            }
            return h;
        }
        
        @Override
        public e0.b[] e() {
            return this.a;
        }
    }
    
    public static final class i extends RuntimeException
    {
        public i(final String message) {
            super(message);
        }
    }
    
    public static final class j
    {
        public final C a;
        public final long b;
        public final long c;
        
        public j(final C a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class k
    {
        public final AudioTrack a;
        public final m0.i b;
        public AudioRouting$OnRoutingChangedListener c;
        
        public k(final AudioTrack a, final m0.i b) {
            this.a = a;
            this.b = b;
            S.a(a, this.c = (AudioRouting$OnRoutingChangedListener)new W(this), new Handler(Looper.myLooper()));
        }
        
        private void b(final AudioRouting audioRouting) {
            if (this.c == null) {
                return;
            }
            if (m0.V.a(audioRouting) != null) {
                this.b.i(m0.V.a(audioRouting));
            }
        }
        
        public void c() {
            m0.U.a(this.a, m0.T.a(g0.a.e(this.c)));
            this.c = null;
        }
    }
    
    public static final class l
    {
        public final long a;
        public Exception b;
        public long c;
        
        public l(final long a) {
            this.a = a;
        }
        
        public void a() {
            this.b = null;
        }
        
        public void b(Exception b) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = b;
                this.c = this.a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.c) {
                final Exception b2 = this.b;
                if (b2 != b) {
                    b2.addSuppressed(b);
                }
                b = this.b;
                this.a();
                throw b;
            }
        }
    }
    
    public final class m implements B.a
    {
        @Override
        public void a(final int n, final long n2) {
            if (m0.N.H(m0.N.this) != null) {
                m0.N.H(m0.N.this).k(n, n2, SystemClock.elapsedRealtime() - m0.N.M(m0.N.this));
            }
        }
        
        @Override
        public void b(final long n) {
            if (m0.N.H(m0.N.this) != null) {
                m0.N.H(m0.N.this).b(n);
            }
        }
        
        @Override
        public void c(final long lng, final long lng2, final long lng3, final long lng4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(lng);
            sb.append(", ");
            sb.append(lng2);
            sb.append(", ");
            sb.append(lng3);
            sb.append(", ");
            sb.append(lng4);
            sb.append(", ");
            sb.append(m0.N.this.V());
            sb.append(", ");
            sb.append(m0.N.this.W());
            final String string = sb.toString();
            if (!m0.N.n0) {
                o.h("DefaultAudioSink", string);
                return;
            }
            throw new i(string, (N$a)null);
        }
        
        @Override
        public void d(final long lng, final long lng2, final long lng3, final long lng4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(lng);
            sb.append(", ");
            sb.append(lng2);
            sb.append(", ");
            sb.append(lng3);
            sb.append(", ");
            sb.append(lng4);
            sb.append(", ");
            sb.append(m0.N.this.V());
            sb.append(", ");
            sb.append(m0.N.this.W());
            final String string = sb.toString();
            if (!m0.N.n0) {
                o.h("DefaultAudioSink", string);
                return;
            }
            throw new i(string, (N$a)null);
        }
        
        @Override
        public void e(final long lng) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(lng);
            o.h("DefaultAudioSink", sb.toString());
        }
    }
    
    public final class n
    {
        public final Handler a;
        public final AudioTrack$StreamEventCallback b;
        
        public n() {
            this.a = new Handler(Looper.myLooper());
            this.b = new AudioTrack$StreamEventCallback() {
                public void onDataRequest(final AudioTrack audioTrack, final int n) {
                    if (!audioTrack.equals(m0.N.G(m0.N.this))) {
                        return;
                    }
                    if (m0.N.H(m0.N.this) != null && m0.N.I(m0.N.this)) {
                        m0.N.H(m0.N.this).j();
                    }
                }
                
                public void onPresentationEnded(final AudioTrack audioTrack) {
                    if (!audioTrack.equals(m0.N.G(m0.N.this))) {
                        return;
                    }
                    m0.N.J(m0.N.this, true);
                }
                
                public void onTearDown(final AudioTrack audioTrack) {
                    if (!audioTrack.equals(m0.N.G(m0.N.this))) {
                        return;
                    }
                    if (m0.N.H(m0.N.this) != null && m0.N.I(m0.N.this)) {
                        m0.N.H(m0.N.this).j();
                    }
                }
            };
        }
        
        public void a(final AudioTrack audioTrack) {
            final Handler a = this.a;
            Objects.requireNonNull(a);
            m0.Y.a(audioTrack, (Executor)new Z(a), this.b);
        }
        
        public void b(final AudioTrack audioTrack) {
            m0.X.a(audioTrack, this.b);
            this.a.removeCallbacksAndMessages((Object)null);
        }
    }
}
