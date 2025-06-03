package m0;

import F0.AbstractC0357b;
import F0.AbstractC0358c;
import F0.AbstractC0371p;
import X2.AbstractC0703v;
import X2.g0;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import d0.AbstractC1203z;
import d0.C1164C;
import d0.C1179b;
import d0.C1182e;
import d0.C1194q;
import e0.C1239a;
import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import g0.C1302f;
import g0.InterfaceC1299c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import k0.InterfaceC1442w;
import l0.y1;
import m0.B;
import m0.C1643i;
import m0.InterfaceC1659z;
import m0.N;
import m0.a0;

/* loaded from: classes.dex */
public final class N implements InterfaceC1659z {

    /* renamed from: n0, reason: collision with root package name */
    public static boolean f17379n0 = false;

    /* renamed from: o0, reason: collision with root package name */
    public static final Object f17380o0 = new Object();

    /* renamed from: p0, reason: collision with root package name */
    public static ExecutorService f17381p0;

    /* renamed from: q0, reason: collision with root package name */
    public static int f17382q0;

    /* renamed from: A, reason: collision with root package name */
    public k f17383A;

    /* renamed from: B, reason: collision with root package name */
    public C1179b f17384B;

    /* renamed from: C, reason: collision with root package name */
    public j f17385C;

    /* renamed from: D, reason: collision with root package name */
    public j f17386D;

    /* renamed from: E, reason: collision with root package name */
    public C1164C f17387E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17388F;

    /* renamed from: G, reason: collision with root package name */
    public ByteBuffer f17389G;

    /* renamed from: H, reason: collision with root package name */
    public int f17390H;

    /* renamed from: I, reason: collision with root package name */
    public long f17391I;

    /* renamed from: J, reason: collision with root package name */
    public long f17392J;

    /* renamed from: K, reason: collision with root package name */
    public long f17393K;

    /* renamed from: L, reason: collision with root package name */
    public long f17394L;

    /* renamed from: M, reason: collision with root package name */
    public int f17395M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f17396N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f17397O;

    /* renamed from: P, reason: collision with root package name */
    public long f17398P;

    /* renamed from: Q, reason: collision with root package name */
    public float f17399Q;

    /* renamed from: R, reason: collision with root package name */
    public ByteBuffer f17400R;

    /* renamed from: S, reason: collision with root package name */
    public int f17401S;

    /* renamed from: T, reason: collision with root package name */
    public ByteBuffer f17402T;

    /* renamed from: U, reason: collision with root package name */
    public byte[] f17403U;

    /* renamed from: V, reason: collision with root package name */
    public int f17404V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f17405W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f17406X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f17407Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f17408Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17409a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f17410a0;

    /* renamed from: b, reason: collision with root package name */
    public final e0.c f17411b;

    /* renamed from: b0, reason: collision with root package name */
    public int f17412b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17413c;

    /* renamed from: c0, reason: collision with root package name */
    public C1182e f17414c0;

    /* renamed from: d, reason: collision with root package name */
    public final C f17415d;

    /* renamed from: d0, reason: collision with root package name */
    public C1644j f17416d0;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f17417e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f17418e0;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0703v f17419f;

    /* renamed from: f0, reason: collision with root package name */
    public long f17420f0;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0703v f17421g;

    /* renamed from: g0, reason: collision with root package name */
    public long f17422g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1302f f17423h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17424h0;

    /* renamed from: i, reason: collision with root package name */
    public final B f17425i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f17426i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f17427j;

    /* renamed from: j0, reason: collision with root package name */
    public Looper f17428j0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17429k;

    /* renamed from: k0, reason: collision with root package name */
    public long f17430k0;

    /* renamed from: l, reason: collision with root package name */
    public int f17431l;

    /* renamed from: l0, reason: collision with root package name */
    public long f17432l0;

    /* renamed from: m, reason: collision with root package name */
    public n f17433m;

    /* renamed from: m0, reason: collision with root package name */
    public Handler f17434m0;

    /* renamed from: n, reason: collision with root package name */
    public final l f17435n;

    /* renamed from: o, reason: collision with root package name */
    public final l f17436o;

    /* renamed from: p, reason: collision with root package name */
    public final e f17437p;

    /* renamed from: q, reason: collision with root package name */
    public final d f17438q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1442w.a f17439r;

    /* renamed from: s, reason: collision with root package name */
    public y1 f17440s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1659z.d f17441t;

    /* renamed from: u, reason: collision with root package name */
    public g f17442u;

    /* renamed from: v, reason: collision with root package name */
    public g f17443v;

    /* renamed from: w, reason: collision with root package name */
    public C1239a f17444w;

    /* renamed from: x, reason: collision with root package name */
    public AudioTrack f17445x;

    /* renamed from: y, reason: collision with root package name */
    public C1639e f17446y;

    /* renamed from: z, reason: collision with root package name */
    public C1643i f17447z;

    public static final class b {
        public static void a(AudioTrack audioTrack, C1644j c1644j) {
            audioTrack.setPreferredDevice(c1644j == null ? null : c1644j.f17571a);
        }
    }

    public static final class c {
        public static void a(AudioTrack audioTrack, y1 y1Var) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a7 = y1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a7.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a7);
        }
    }

    public interface d {
        C1645k a(C1194q c1194q, C1179b c1179b);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f17448a = new a0.a().h();

        int a(int i7, int i8, int i9, int i10, int i11, int i12, double d7);
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Context f17449a;

        /* renamed from: c, reason: collision with root package name */
        public e0.c f17451c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17452d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f17453e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17454f;

        /* renamed from: h, reason: collision with root package name */
        public d f17456h;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC1442w.a f17457i;

        /* renamed from: b, reason: collision with root package name */
        public C1639e f17450b = C1639e.f17539c;

        /* renamed from: g, reason: collision with root package name */
        public e f17455g = e.f17448a;

        public f(Context context) {
            this.f17449a = context;
        }

        public N i() {
            AbstractC1297a.f(!this.f17454f);
            this.f17454f = true;
            if (this.f17451c == null) {
                this.f17451c = new h(new InterfaceC1240b[0]);
            }
            if (this.f17456h == null) {
                this.f17456h = new E(this.f17449a);
            }
            return new N(this);
        }

        public f j(boolean z7) {
            this.f17453e = z7;
            return this;
        }

        public f k(boolean z7) {
            this.f17452d = z7;
            return this;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final C1194q f17458a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17459b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17460c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17461d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17462e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17463f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17464g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17465h;

        /* renamed from: i, reason: collision with root package name */
        public final C1239a f17466i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f17467j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f17468k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f17469l;

        public g(C1194q c1194q, int i7, int i8, int i9, int i10, int i11, int i12, int i13, C1239a c1239a, boolean z7, boolean z8, boolean z9) {
            this.f17458a = c1194q;
            this.f17459b = i7;
            this.f17460c = i8;
            this.f17461d = i9;
            this.f17462e = i10;
            this.f17463f = i11;
            this.f17464g = i12;
            this.f17465h = i13;
            this.f17466i = c1239a;
            this.f17467j = z7;
            this.f17468k = z8;
            this.f17469l = z9;
        }

        public static AudioAttributes j(C1179b c1179b, boolean z7) {
            return z7 ? k() : c1179b.a().f12606a;
        }

        public static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(C1179b c1179b, int i7) {
            try {
                AudioTrack e7 = e(c1179b, i7);
                int state = e7.getState();
                if (state == 1) {
                    return e7;
                }
                try {
                    e7.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC1659z.c(state, this.f17462e, this.f17463f, this.f17465h, this.f17458a, m(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e8) {
                throw new InterfaceC1659z.c(0, this.f17462e, this.f17463f, this.f17465h, this.f17458a, m(), e8);
            }
        }

        public InterfaceC1659z.a b() {
            return new InterfaceC1659z.a(this.f17464g, this.f17462e, this.f17463f, this.f17469l, this.f17460c == 1, this.f17465h);
        }

        public boolean c(g gVar) {
            return gVar.f17460c == this.f17460c && gVar.f17464g == this.f17464g && gVar.f17462e == this.f17462e && gVar.f17463f == this.f17463f && gVar.f17461d == this.f17461d && gVar.f17467j == this.f17467j && gVar.f17468k == this.f17468k;
        }

        public g d(int i7) {
            return new g(this.f17458a, this.f17459b, this.f17460c, this.f17461d, this.f17462e, this.f17463f, this.f17464g, i7, this.f17466i, this.f17467j, this.f17468k, this.f17469l);
        }

        public final AudioTrack e(C1179b c1179b, int i7) {
            int i8 = g0.M.f14261a;
            return i8 >= 29 ? g(c1179b, i7) : i8 >= 21 ? f(c1179b, i7) : h(c1179b, i7);
        }

        public final AudioTrack f(C1179b c1179b, int i7) {
            return new AudioTrack(j(c1179b, this.f17469l), g0.M.L(this.f17462e, this.f17463f, this.f17464g), this.f17465h, 1, i7);
        }

        public final AudioTrack g(C1179b c1179b, int i7) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(j(c1179b, this.f17469l)).setAudioFormat(g0.M.L(this.f17462e, this.f17463f, this.f17464g)).setTransferMode(1).setBufferSizeInBytes(this.f17465h).setSessionId(i7).setOffloadedPlayback(this.f17460c == 1);
            return offloadedPlayback.build();
        }

        public final AudioTrack h(C1179b c1179b, int i7) {
            int k02 = g0.M.k0(c1179b.f12602c);
            int i8 = this.f17462e;
            int i9 = this.f17463f;
            int i10 = this.f17464g;
            int i11 = this.f17465h;
            return i7 == 0 ? new AudioTrack(k02, i8, i9, i10, i11, 1) : new AudioTrack(k02, i8, i9, i10, i11, 1, i7);
        }

        public long i(long j7) {
            return g0.M.V0(j7, this.f17462e);
        }

        public long l(long j7) {
            return g0.M.V0(j7, this.f17458a.f12703C);
        }

        public boolean m() {
            return this.f17460c == 1;
        }
    }

    public static class h implements e0.c {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1240b[] f17470a;

        /* renamed from: b, reason: collision with root package name */
        public final d0 f17471b;

        /* renamed from: c, reason: collision with root package name */
        public final e0.f f17472c;

        public h(InterfaceC1240b... interfaceC1240bArr) {
            this(interfaceC1240bArr, new d0(), new e0.f());
        }

        @Override // e0.c
        public C1164C a(C1164C c1164c) {
            this.f17472c.j(c1164c.f12356a);
            this.f17472c.i(c1164c.f12357b);
            return c1164c;
        }

        @Override // e0.c
        public long b() {
            return this.f17471b.v();
        }

        @Override // e0.c
        public boolean c(boolean z7) {
            this.f17471b.E(z7);
            return z7;
        }

        @Override // e0.c
        public long d(long j7) {
            return this.f17472c.a() ? this.f17472c.h(j7) : j7;
        }

        @Override // e0.c
        public InterfaceC1240b[] e() {
            return this.f17470a;
        }

        public h(InterfaceC1240b[] interfaceC1240bArr, d0 d0Var, e0.f fVar) {
            InterfaceC1240b[] interfaceC1240bArr2 = new InterfaceC1240b[interfaceC1240bArr.length + 2];
            this.f17470a = interfaceC1240bArr2;
            System.arraycopy(interfaceC1240bArr, 0, interfaceC1240bArr2, 0, interfaceC1240bArr.length);
            this.f17471b = d0Var;
            this.f17472c = fVar;
            interfaceC1240bArr2[interfaceC1240bArr.length] = d0Var;
            interfaceC1240bArr2[interfaceC1240bArr.length + 1] = fVar;
        }
    }

    public static final class i extends RuntimeException {
        public i(String str) {
            super(str);
        }
    }

    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final C1164C f17473a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17474b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17475c;

        public j(C1164C c1164c, long j7, long j8) {
            this.f17473a = c1164c;
            this.f17474b = j7;
            this.f17475c = j8;
        }
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f17476a;

        /* renamed from: b, reason: collision with root package name */
        public final C1643i f17477b;

        /* renamed from: c, reason: collision with root package name */
        public AudioRouting.OnRoutingChangedListener f17478c = new AudioRouting.OnRoutingChangedListener() { // from class: m0.W
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                N.k.this.b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, C1643i c1643i) {
            this.f17476a = audioTrack;
            this.f17477b = c1643i;
            audioTrack.addOnRoutingChangedListener(this.f17478c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            AudioDeviceInfo routedDevice2;
            if (this.f17478c == null) {
                return;
            }
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                C1643i c1643i = this.f17477b;
                routedDevice2 = audioRouting.getRoutedDevice();
                c1643i.i(routedDevice2);
            }
        }

        public void c() {
            this.f17476a.removeOnRoutingChangedListener(T.a(AbstractC1297a.e(this.f17478c)));
            this.f17478c = null;
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final long f17479a;

        /* renamed from: b, reason: collision with root package name */
        public Exception f17480b;

        /* renamed from: c, reason: collision with root package name */
        public long f17481c;

        public l(long j7) {
            this.f17479a = j7;
        }

        public void a() {
            this.f17480b = null;
        }

        public void b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f17480b == null) {
                this.f17480b = exc;
                this.f17481c = this.f17479a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f17481c) {
                Exception exc2 = this.f17480b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f17480b;
                a();
                throw exc3;
            }
        }
    }

    public final class m implements B.a {
        public m() {
        }

        @Override // m0.B.a
        public void a(int i7, long j7) {
            if (N.this.f17441t != null) {
                N.this.f17441t.k(i7, j7, SystemClock.elapsedRealtime() - N.this.f17422g0);
            }
        }

        @Override // m0.B.a
        public void b(long j7) {
            if (N.this.f17441t != null) {
                N.this.f17441t.b(j7);
            }
        }

        @Override // m0.B.a
        public void c(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + N.this.V() + ", " + N.this.W();
            if (N.f17379n0) {
                throw new i(str);
            }
            g0.o.h("DefaultAudioSink", str);
        }

        @Override // m0.B.a
        public void d(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + N.this.V() + ", " + N.this.W();
            if (N.f17379n0) {
                throw new i(str);
            }
            g0.o.h("DefaultAudioSink", str);
        }

        @Override // m0.B.a
        public void e(long j7) {
            g0.o.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j7);
        }
    }

    public final class n {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17483a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f17484b;

        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N f17486a;

            public a(N n7) {
                this.f17486a = n7;
            }

            public void onDataRequest(AudioTrack audioTrack, int i7) {
                if (audioTrack.equals(N.this.f17445x) && N.this.f17441t != null && N.this.f17408Z) {
                    N.this.f17441t.j();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(N.this.f17445x)) {
                    N.this.f17407Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(N.this.f17445x) && N.this.f17441t != null && N.this.f17408Z) {
                    N.this.f17441t.j();
                }
            }
        }

        public n() {
            this.f17484b = new a(N.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f17483a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Z(handler), this.f17484b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f17484b);
            this.f17483a.removeCallbacksAndMessages(null);
        }
    }

    public N(f fVar) {
        Context context = fVar.f17449a;
        this.f17409a = context;
        C1179b c1179b = C1179b.f12594g;
        this.f17384B = c1179b;
        this.f17446y = context != null ? C1639e.e(context, c1179b, null) : fVar.f17450b;
        this.f17411b = fVar.f17451c;
        int i7 = g0.M.f14261a;
        this.f17413c = i7 >= 21 && fVar.f17452d;
        this.f17429k = i7 >= 23 && fVar.f17453e;
        this.f17431l = 0;
        this.f17437p = fVar.f17455g;
        this.f17438q = (d) AbstractC1297a.e(fVar.f17456h);
        C1302f c1302f = new C1302f(InterfaceC1299c.f14278a);
        this.f17423h = c1302f;
        c1302f.e();
        this.f17425i = new B(new m());
        C c7 = new C();
        this.f17415d = c7;
        f0 f0Var = new f0();
        this.f17417e = f0Var;
        this.f17419f = AbstractC0703v.b0(new e0.g(), c7, f0Var);
        this.f17421g = AbstractC0703v.Z(new e0());
        this.f17399Q = 1.0f;
        this.f17412b0 = 0;
        this.f17414c0 = new C1182e(0, 0.0f);
        C1164C c1164c = C1164C.f12353d;
        this.f17386D = new j(c1164c, 0L, 0L);
        this.f17387E = c1164c;
        this.f17388F = false;
        this.f17427j = new ArrayDeque();
        this.f17435n = new l(100L);
        this.f17436o = new l(100L);
        this.f17439r = fVar.f17457i;
    }

    public static int T(int i7, int i8, int i9) {
        int minBufferSize = AudioTrack.getMinBufferSize(i7, i8, i9);
        AbstractC1297a.f(minBufferSize != -2);
        return minBufferSize;
    }

    public static int U(int i7, ByteBuffer byteBuffer) {
        if (i7 == 20) {
            return F0.K.h(byteBuffer);
        }
        if (i7 != 30) {
            switch (i7) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int m7 = F0.I.m(g0.M.O(byteBuffer, byteBuffer.position()));
                    if (m7 != -1) {
                        return m7;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    return 2048;
                default:
                    switch (i7) {
                        case 14:
                            int b7 = AbstractC0357b.b(byteBuffer);
                            if (b7 == -1) {
                                return 0;
                            }
                            return AbstractC0357b.i(byteBuffer, b7) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return AbstractC0358c.c(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i7);
                    }
            }
            return AbstractC0357b.e(byteBuffer);
        }
        return AbstractC0371p.f(byteBuffer);
    }

    public static boolean Z(int i7) {
        return (g0.M.f14261a >= 24 && i7 == -6) || i7 == -32;
    }

    public static boolean b0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (g0.M.f14261a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void d0(AudioTrack audioTrack, final InterfaceC1659z.d dVar, Handler handler, final InterfaceC1659z.a aVar, C1302f c1302f) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: m0.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1659z.d.this.e(aVar);
                    }
                });
            }
            c1302f.e();
            synchronized (f17380o0) {
                try {
                    int i7 = f17382q0 - 1;
                    f17382q0 = i7;
                    if (i7 == 0) {
                        f17381p0.shutdown();
                        f17381p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: m0.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1659z.d.this.e(aVar);
                    }
                });
            }
            c1302f.e();
            synchronized (f17380o0) {
                try {
                    int i8 = f17382q0 - 1;
                    f17382q0 = i8;
                    if (i8 == 0) {
                        f17381p0.shutdown();
                        f17381p0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static void l0(final AudioTrack audioTrack, final C1302f c1302f, final InterfaceC1659z.d dVar, final InterfaceC1659z.a aVar) {
        c1302f.c();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f17380o0) {
            try {
                if (f17381p0 == null) {
                    f17381p0 = g0.M.K0("ExoPlayer:AudioTrackReleaseThread");
                }
                f17382q0++;
                f17381p0.execute(new Runnable() { // from class: m0.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        N.d0(audioTrack, dVar, handler, aVar, c1302f);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q0(AudioTrack audioTrack, float f7) {
        audioTrack.setVolume(f7);
    }

    public static void r0(AudioTrack audioTrack, float f7) {
        audioTrack.setStereoVolume(f7, f7);
    }

    public static int x0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7) {
        return audioTrack.write(byteBuffer, i7, 1);
    }

    @Override // m0.InterfaceC1659z
    public void A(InterfaceC1299c interfaceC1299c) {
        this.f17425i.u(interfaceC1299c);
    }

    @Override // m0.InterfaceC1659z
    public void B() {
        this.f17396N = true;
    }

    @Override // m0.InterfaceC1659z
    public void C(InterfaceC1659z.d dVar) {
        this.f17441t = dVar;
    }

    public final void N(long j7) {
        C1164C c1164c;
        if (v0()) {
            c1164c = C1164C.f12353d;
        } else {
            c1164c = t0() ? this.f17411b.a(this.f17387E) : C1164C.f12353d;
            this.f17387E = c1164c;
        }
        C1164C c1164c2 = c1164c;
        this.f17388F = t0() ? this.f17411b.c(this.f17388F) : false;
        this.f17427j.add(new j(c1164c2, Math.max(0L, j7), this.f17443v.i(W())));
        s0();
        InterfaceC1659z.d dVar = this.f17441t;
        if (dVar != null) {
            dVar.c(this.f17388F);
        }
    }

    public final long O(long j7) {
        while (!this.f17427j.isEmpty() && j7 >= ((j) this.f17427j.getFirst()).f17475c) {
            this.f17386D = (j) this.f17427j.remove();
        }
        long j8 = j7 - this.f17386D.f17475c;
        if (this.f17427j.isEmpty()) {
            return this.f17386D.f17474b + this.f17411b.d(j8);
        }
        j jVar = (j) this.f17427j.getFirst();
        return jVar.f17474b - g0.M.c0(jVar.f17475c - j7, this.f17386D.f17473a.f12356a);
    }

    public final long P(long j7) {
        long b7 = this.f17411b.b();
        long i7 = j7 + this.f17443v.i(b7);
        long j8 = this.f17430k0;
        if (b7 > j8) {
            long i8 = this.f17443v.i(b7 - j8);
            this.f17430k0 = b7;
            X(i8);
        }
        return i7;
    }

    public final AudioTrack Q(g gVar) {
        try {
            AudioTrack a7 = gVar.a(this.f17384B, this.f17412b0);
            InterfaceC1442w.a aVar = this.f17439r;
            if (aVar != null) {
                aVar.m(b0(a7));
            }
            return a7;
        } catch (InterfaceC1659z.c e7) {
            InterfaceC1659z.d dVar = this.f17441t;
            if (dVar != null) {
                dVar.d(e7);
            }
            throw e7;
        }
    }

    public final AudioTrack R() {
        try {
            return Q((g) AbstractC1297a.e(this.f17443v));
        } catch (InterfaceC1659z.c e7) {
            g gVar = this.f17443v;
            if (gVar.f17465h > 1000000) {
                g d7 = gVar.d(1000000);
                try {
                    AudioTrack Q6 = Q(d7);
                    this.f17443v = d7;
                    return Q6;
                } catch (InterfaceC1659z.c e8) {
                    e7.addSuppressed(e8);
                    e0();
                    throw e7;
                }
            }
            e0();
            throw e7;
        }
    }

    public final boolean S() {
        if (!this.f17444w.f()) {
            ByteBuffer byteBuffer = this.f17402T;
            if (byteBuffer == null) {
                return true;
            }
            w0(byteBuffer, Long.MIN_VALUE);
            return this.f17402T == null;
        }
        this.f17444w.h();
        j0(Long.MIN_VALUE);
        if (!this.f17444w.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f17402T;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final long V() {
        return this.f17443v.f17460c == 0 ? this.f17391I / r0.f17459b : this.f17392J;
    }

    public final long W() {
        return this.f17443v.f17460c == 0 ? g0.M.l(this.f17393K, r0.f17461d) : this.f17394L;
    }

    public final void X(long j7) {
        this.f17432l0 += j7;
        if (this.f17434m0 == null) {
            this.f17434m0 = new Handler(Looper.myLooper());
        }
        this.f17434m0.removeCallbacksAndMessages(null);
        this.f17434m0.postDelayed(new Runnable() { // from class: m0.K
            @Override // java.lang.Runnable
            public final void run() {
                N.this.f0();
            }
        }, 100L);
    }

    public final boolean Y() {
        C1643i c1643i;
        y1 y1Var;
        if (!this.f17423h.d()) {
            return false;
        }
        AudioTrack R6 = R();
        this.f17445x = R6;
        if (b0(R6)) {
            k0(this.f17445x);
            g gVar = this.f17443v;
            if (gVar.f17468k) {
                AudioTrack audioTrack = this.f17445x;
                C1194q c1194q = gVar.f17458a;
                audioTrack.setOffloadDelayPadding(c1194q.f12705E, c1194q.f12706F);
            }
        }
        int i7 = g0.M.f14261a;
        if (i7 >= 31 && (y1Var = this.f17440s) != null) {
            c.a(this.f17445x, y1Var);
        }
        this.f17412b0 = this.f17445x.getAudioSessionId();
        B b7 = this.f17425i;
        AudioTrack audioTrack2 = this.f17445x;
        g gVar2 = this.f17443v;
        b7.s(audioTrack2, gVar2.f17460c == 2, gVar2.f17464g, gVar2.f17461d, gVar2.f17465h);
        p0();
        int i8 = this.f17414c0.f12612a;
        if (i8 != 0) {
            this.f17445x.attachAuxEffect(i8);
            this.f17445x.setAuxEffectSendLevel(this.f17414c0.f12613b);
        }
        C1644j c1644j = this.f17416d0;
        if (c1644j != null && i7 >= 23) {
            b.a(this.f17445x, c1644j);
            C1643i c1643i2 = this.f17447z;
            if (c1643i2 != null) {
                c1643i2.i(this.f17416d0.f17571a);
            }
        }
        if (i7 >= 24 && (c1643i = this.f17447z) != null) {
            this.f17383A = new k(this.f17445x, c1643i);
        }
        this.f17397O = true;
        InterfaceC1659z.d dVar = this.f17441t;
        if (dVar != null) {
            dVar.a(this.f17443v.b());
        }
        return true;
    }

    @Override // m0.InterfaceC1659z
    public boolean a(C1194q c1194q) {
        return o(c1194q) != 0;
    }

    public final boolean a0() {
        return this.f17445x != null;
    }

    @Override // m0.InterfaceC1659z
    public void b() {
        flush();
        g0 it = this.f17419f.iterator();
        while (it.hasNext()) {
            ((InterfaceC1240b) it.next()).b();
        }
        g0 it2 = this.f17421g.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1240b) it2.next()).b();
        }
        C1239a c1239a = this.f17444w;
        if (c1239a != null) {
            c1239a.j();
        }
        this.f17408Z = false;
        this.f17424h0 = false;
    }

    @Override // m0.InterfaceC1659z
    public boolean c() {
        return !a0() || (this.f17405W && !i());
    }

    @Override // m0.InterfaceC1659z
    public void d(boolean z7) {
        this.f17388F = z7;
        n0(v0() ? C1164C.f12353d : this.f17387E);
    }

    @Override // m0.InterfaceC1659z
    public void e() {
        AbstractC1297a.f(g0.M.f14261a >= 21);
        AbstractC1297a.f(this.f17410a0);
        if (this.f17418e0) {
            return;
        }
        this.f17418e0 = true;
        flush();
    }

    public final void e0() {
        if (this.f17443v.m()) {
            this.f17424h0 = true;
        }
    }

    @Override // m0.InterfaceC1659z
    public void f(AudioDeviceInfo audioDeviceInfo) {
        this.f17416d0 = audioDeviceInfo == null ? null : new C1644j(audioDeviceInfo);
        C1643i c1643i = this.f17447z;
        if (c1643i != null) {
            c1643i.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f17445x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f17416d0);
        }
    }

    public final void f0() {
        if (this.f17432l0 >= 300000) {
            this.f17441t.g();
            this.f17432l0 = 0L;
        }
    }

    @Override // m0.InterfaceC1659z
    public void flush() {
        k kVar;
        if (a0()) {
            m0();
            if (this.f17425i.i()) {
                this.f17445x.pause();
            }
            if (b0(this.f17445x)) {
                ((n) AbstractC1297a.e(this.f17433m)).b(this.f17445x);
            }
            int i7 = g0.M.f14261a;
            if (i7 < 21 && !this.f17410a0) {
                this.f17412b0 = 0;
            }
            InterfaceC1659z.a b7 = this.f17443v.b();
            g gVar = this.f17442u;
            if (gVar != null) {
                this.f17443v = gVar;
                this.f17442u = null;
            }
            this.f17425i.q();
            if (i7 >= 24 && (kVar = this.f17383A) != null) {
                kVar.c();
                this.f17383A = null;
            }
            l0(this.f17445x, this.f17423h, this.f17441t, b7);
            this.f17445x = null;
        }
        this.f17436o.a();
        this.f17435n.a();
        this.f17430k0 = 0L;
        this.f17432l0 = 0L;
        Handler handler = this.f17434m0;
        if (handler != null) {
            ((Handler) AbstractC1297a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // m0.InterfaceC1659z
    public void g() {
        if (!this.f17405W && a0() && S()) {
            i0();
            this.f17405W = true;
        }
    }

    public final void g0() {
        if (this.f17447z != null || this.f17409a == null) {
            return;
        }
        this.f17428j0 = Looper.myLooper();
        C1643i c1643i = new C1643i(this.f17409a, new C1643i.f() { // from class: m0.L
            @Override // m0.C1643i.f
            public final void a(C1639e c1639e) {
                N.this.h0(c1639e);
            }
        }, this.f17384B, this.f17416d0);
        this.f17447z = c1643i;
        this.f17446y = c1643i.g();
    }

    @Override // m0.InterfaceC1659z
    public C1164C h() {
        return this.f17387E;
    }

    public void h0(C1639e c1639e) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17428j0;
        if (looper == myLooper) {
            if (c1639e.equals(this.f17446y)) {
                return;
            }
            this.f17446y = c1639e;
            InterfaceC1659z.d dVar = this.f17441t;
            if (dVar != null) {
                dVar.f();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (myLooper != null ? myLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.f17407Y != false) goto L13;
     */
    @Override // m0.InterfaceC1659z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i() {
        /*
            r3 = this;
            boolean r0 = r3.a0()
            if (r0 == 0) goto L26
            int r0 = g0.M.f14261a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f17445x
            boolean r0 = m0.I.a(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f17407Y
            if (r0 != 0) goto L26
        L18:
            m0.B r0 = r3.f17425i
            long r1 = r3.W()
            boolean r0 = r0.h(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.N.i():boolean");
    }

    public final void i0() {
        if (this.f17406X) {
            return;
        }
        this.f17406X = true;
        this.f17425i.g(W());
        if (b0(this.f17445x)) {
            this.f17407Y = false;
        }
        this.f17445x.stop();
        this.f17390H = 0;
    }

    @Override // m0.InterfaceC1659z
    public void j() {
        this.f17408Z = false;
        if (a0()) {
            if (this.f17425i.p() || b0(this.f17445x)) {
                this.f17445x.pause();
            }
        }
    }

    public final void j0(long j7) {
        ByteBuffer d7;
        if (!this.f17444w.f()) {
            ByteBuffer byteBuffer = this.f17400R;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC1240b.f13675a;
            }
            w0(byteBuffer, j7);
            return;
        }
        while (!this.f17444w.e()) {
            do {
                d7 = this.f17444w.d();
                if (d7.hasRemaining()) {
                    w0(d7, j7);
                } else {
                    ByteBuffer byteBuffer2 = this.f17400R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f17444w.i(this.f17400R);
                    }
                }
            } while (!d7.hasRemaining());
            return;
        }
    }

    @Override // m0.InterfaceC1659z
    public void k(C1164C c1164c) {
        this.f17387E = new C1164C(g0.M.o(c1164c.f12356a, 0.1f, 8.0f), g0.M.o(c1164c.f12357b, 0.1f, 8.0f));
        if (v0()) {
            o0();
        } else {
            n0(c1164c);
        }
    }

    public final void k0(AudioTrack audioTrack) {
        if (this.f17433m == null) {
            this.f17433m = new n();
        }
        this.f17433m.a(audioTrack);
    }

    @Override // m0.InterfaceC1659z
    public void l(float f7) {
        if (this.f17399Q != f7) {
            this.f17399Q = f7;
            p0();
        }
    }

    @Override // m0.InterfaceC1659z
    public void m(C1182e c1182e) {
        if (this.f17414c0.equals(c1182e)) {
            return;
        }
        int i7 = c1182e.f12612a;
        float f7 = c1182e.f12613b;
        AudioTrack audioTrack = this.f17445x;
        if (audioTrack != null) {
            if (this.f17414c0.f12612a != i7) {
                audioTrack.attachAuxEffect(i7);
            }
            if (i7 != 0) {
                this.f17445x.setAuxEffectSendLevel(f7);
            }
        }
        this.f17414c0 = c1182e;
    }

    public final void m0() {
        this.f17391I = 0L;
        this.f17392J = 0L;
        this.f17393K = 0L;
        this.f17394L = 0L;
        this.f17426i0 = false;
        this.f17395M = 0;
        this.f17386D = new j(this.f17387E, 0L, 0L);
        this.f17398P = 0L;
        this.f17385C = null;
        this.f17427j.clear();
        this.f17400R = null;
        this.f17401S = 0;
        this.f17402T = null;
        this.f17406X = false;
        this.f17405W = false;
        this.f17407Y = false;
        this.f17389G = null;
        this.f17390H = 0;
        this.f17417e.o();
        s0();
    }

    @Override // m0.InterfaceC1659z
    public void n(int i7) {
        if (this.f17412b0 != i7) {
            this.f17412b0 = i7;
            this.f17410a0 = i7 != 0;
            flush();
        }
    }

    public final void n0(C1164C c1164c) {
        j jVar = new j(c1164c, -9223372036854775807L, -9223372036854775807L);
        if (a0()) {
            this.f17385C = jVar;
        } else {
            this.f17386D = jVar;
        }
    }

    @Override // m0.InterfaceC1659z
    public int o(C1194q c1194q) {
        g0();
        if (!"audio/raw".equals(c1194q.f12726n)) {
            return this.f17446y.k(c1194q, this.f17384B) ? 2 : 0;
        }
        if (g0.M.A0(c1194q.f12704D)) {
            int i7 = c1194q.f12704D;
            return (i7 == 2 || (this.f17413c && i7 == 4)) ? 2 : 1;
        }
        g0.o.h("DefaultAudioSink", "Invalid PCM encoding: " + c1194q.f12704D);
        return 0;
    }

    public final void o0() {
        if (a0()) {
            try {
                this.f17445x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f17387E.f12356a).setPitch(this.f17387E.f12357b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                g0.o.i("DefaultAudioSink", "Failed to set playback params", e7);
            }
            C1164C c1164c = new C1164C(this.f17445x.getPlaybackParams().getSpeed(), this.f17445x.getPlaybackParams().getPitch());
            this.f17387E = c1164c;
            this.f17425i.t(c1164c.f12356a);
        }
    }

    @Override // m0.InterfaceC1659z
    public void p() {
        this.f17408Z = true;
        if (a0()) {
            this.f17425i.v();
            this.f17445x.play();
        }
    }

    public final void p0() {
        if (a0()) {
            if (g0.M.f14261a >= 21) {
                q0(this.f17445x, this.f17399Q);
            } else {
                r0(this.f17445x, this.f17399Q);
            }
        }
    }

    @Override // m0.InterfaceC1659z
    public void q(int i7, int i8) {
        g gVar;
        AudioTrack audioTrack = this.f17445x;
        if (audioTrack == null || !b0(audioTrack) || (gVar = this.f17443v) == null || !gVar.f17468k) {
            return;
        }
        this.f17445x.setOffloadDelayPadding(i7, i8);
    }

    @Override // m0.InterfaceC1659z
    public C1645k r(C1194q c1194q) {
        return this.f17424h0 ? C1645k.f17572d : this.f17438q.a(c1194q, this.f17384B);
    }

    @Override // m0.InterfaceC1659z
    public void release() {
        C1643i c1643i = this.f17447z;
        if (c1643i != null) {
            c1643i.j();
        }
    }

    @Override // m0.InterfaceC1659z
    public void s(C1179b c1179b) {
        if (this.f17384B.equals(c1179b)) {
            return;
        }
        this.f17384B = c1179b;
        if (this.f17418e0) {
            return;
        }
        C1643i c1643i = this.f17447z;
        if (c1643i != null) {
            c1643i.h(c1179b);
        }
        flush();
    }

    public final void s0() {
        C1239a c1239a = this.f17443v.f17466i;
        this.f17444w = c1239a;
        c1239a.b();
    }

    @Override // m0.InterfaceC1659z
    public void t(y1 y1Var) {
        this.f17440s = y1Var;
    }

    public final boolean t0() {
        if (!this.f17418e0) {
            g gVar = this.f17443v;
            if (gVar.f17460c == 0 && !u0(gVar.f17458a.f12704D)) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.InterfaceC1659z
    public boolean u(ByteBuffer byteBuffer, long j7, int i7) {
        ByteBuffer byteBuffer2 = this.f17400R;
        AbstractC1297a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f17442u != null) {
            if (!S()) {
                return false;
            }
            if (this.f17442u.c(this.f17443v)) {
                this.f17443v = this.f17442u;
                this.f17442u = null;
                AudioTrack audioTrack = this.f17445x;
                if (audioTrack != null && b0(audioTrack) && this.f17443v.f17468k) {
                    if (this.f17445x.getPlayState() == 3) {
                        this.f17445x.setOffloadEndOfStream();
                        this.f17425i.a();
                    }
                    AudioTrack audioTrack2 = this.f17445x;
                    C1194q c1194q = this.f17443v.f17458a;
                    audioTrack2.setOffloadDelayPadding(c1194q.f12705E, c1194q.f12706F);
                    this.f17426i0 = true;
                }
            } else {
                i0();
                if (i()) {
                    return false;
                }
                flush();
            }
            N(j7);
        }
        if (!a0()) {
            try {
                if (!Y()) {
                    return false;
                }
            } catch (InterfaceC1659z.c e7) {
                if (e7.f17618p) {
                    throw e7;
                }
                this.f17435n.b(e7);
                return false;
            }
        }
        this.f17435n.a();
        if (this.f17397O) {
            this.f17398P = Math.max(0L, j7);
            this.f17396N = false;
            this.f17397O = false;
            if (v0()) {
                o0();
            }
            N(j7);
            if (this.f17408Z) {
                p();
            }
        }
        if (!this.f17425i.k(W())) {
            return false;
        }
        if (this.f17400R == null) {
            AbstractC1297a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f17443v;
            if (gVar.f17460c != 0 && this.f17395M == 0) {
                int U6 = U(gVar.f17464g, byteBuffer);
                this.f17395M = U6;
                if (U6 == 0) {
                    return true;
                }
            }
            if (this.f17385C != null) {
                if (!S()) {
                    return false;
                }
                N(j7);
                this.f17385C = null;
            }
            long l7 = this.f17398P + this.f17443v.l(V() - this.f17417e.n());
            if (!this.f17396N && Math.abs(l7 - j7) > 200000) {
                InterfaceC1659z.d dVar = this.f17441t;
                if (dVar != null) {
                    dVar.d(new InterfaceC1659z.e(j7, l7));
                }
                this.f17396N = true;
            }
            if (this.f17396N) {
                if (!S()) {
                    return false;
                }
                long j8 = j7 - l7;
                this.f17398P += j8;
                this.f17396N = false;
                N(j7);
                InterfaceC1659z.d dVar2 = this.f17441t;
                if (dVar2 != null && j8 != 0) {
                    dVar2.h();
                }
            }
            if (this.f17443v.f17460c == 0) {
                this.f17391I += byteBuffer.remaining();
            } else {
                this.f17392J += this.f17395M * i7;
            }
            this.f17400R = byteBuffer;
            this.f17401S = i7;
        }
        j0(j7);
        if (!this.f17400R.hasRemaining()) {
            this.f17400R = null;
            this.f17401S = 0;
            return true;
        }
        if (!this.f17425i.j(W())) {
            return false;
        }
        g0.o.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public final boolean u0(int i7) {
        return this.f17413c && g0.M.z0(i7);
    }

    @Override // m0.InterfaceC1659z
    public void v(int i7) {
        AbstractC1297a.f(g0.M.f14261a >= 29);
        this.f17431l = i7;
    }

    public final boolean v0() {
        g gVar = this.f17443v;
        return gVar != null && gVar.f17467j && g0.M.f14261a >= 23;
    }

    @Override // m0.InterfaceC1659z
    public long w(boolean z7) {
        if (!a0() || this.f17397O) {
            return Long.MIN_VALUE;
        }
        return P(O(Math.min(this.f17425i.d(z7), this.f17443v.i(W()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.N.w0(java.nio.ByteBuffer, long):void");
    }

    @Override // m0.InterfaceC1659z
    public void x() {
        if (this.f17418e0) {
            this.f17418e0 = false;
            flush();
        }
    }

    @Override // m0.InterfaceC1659z
    public /* synthetic */ void y(long j7) {
        AbstractC1658y.a(this, j7);
    }

    public final int y0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7, long j7) {
        if (g0.M.f14261a >= 26) {
            return audioTrack.write(byteBuffer, i7, 1, j7 * 1000);
        }
        if (this.f17389G == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f17389G = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f17389G.putInt(1431633921);
        }
        if (this.f17390H == 0) {
            this.f17389G.putInt(4, i7);
            this.f17389G.putLong(8, j7 * 1000);
            this.f17389G.position(0);
            this.f17390H = i7;
        }
        int remaining = this.f17389G.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f17389G, remaining, 1);
            if (write < 0) {
                this.f17390H = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int x02 = x0(audioTrack, byteBuffer, i7);
        if (x02 < 0) {
            this.f17390H = 0;
            return x02;
        }
        this.f17390H -= x02;
        return x02;
    }

    @Override // m0.InterfaceC1659z
    public void z(C1194q c1194q, int i7, int[] iArr) {
        C1239a c1239a;
        int i8;
        int i9;
        boolean z7;
        int i10;
        int intValue;
        int i11;
        boolean z8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int a7;
        int[] iArr2;
        g0();
        if ("audio/raw".equals(c1194q.f12726n)) {
            AbstractC1297a.a(g0.M.A0(c1194q.f12704D));
            i8 = g0.M.g0(c1194q.f12704D, c1194q.f12702B);
            AbstractC0703v.a aVar = new AbstractC0703v.a();
            if (u0(c1194q.f12704D)) {
                aVar.j(this.f17421g);
            } else {
                aVar.j(this.f17419f);
                aVar.i(this.f17411b.e());
            }
            C1239a c1239a2 = new C1239a(aVar.k());
            if (c1239a2.equals(this.f17444w)) {
                c1239a2 = this.f17444w;
            }
            this.f17417e.p(c1194q.f12705E, c1194q.f12706F);
            if (g0.M.f14261a < 21 && c1194q.f12702B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f17415d.n(iArr2);
            try {
                InterfaceC1240b.a a8 = c1239a2.a(new InterfaceC1240b.a(c1194q));
                int i18 = a8.f13679c;
                int i19 = a8.f13677a;
                int M6 = g0.M.M(a8.f13678b);
                i12 = 0;
                z7 = false;
                i9 = g0.M.g0(i18, a8.f13678b);
                c1239a = c1239a2;
                i10 = i19;
                intValue = M6;
                z8 = this.f17429k;
                i11 = i18;
            } catch (InterfaceC1240b.C0195b e7) {
                throw new InterfaceC1659z.b(e7, c1194q);
            }
        } else {
            C1239a c1239a3 = new C1239a(AbstractC0703v.Y());
            int i20 = c1194q.f12703C;
            C1645k r7 = this.f17431l != 0 ? r(c1194q) : C1645k.f17572d;
            if (this.f17431l == 0 || !r7.f17573a) {
                Pair i21 = this.f17446y.i(c1194q, this.f17384B);
                if (i21 == null) {
                    throw new InterfaceC1659z.b("Unable to configure passthrough for: " + c1194q, c1194q);
                }
                int intValue2 = ((Integer) i21.first).intValue();
                c1239a = c1239a3;
                i8 = -1;
                i9 = -1;
                z7 = false;
                i10 = i20;
                intValue = ((Integer) i21.second).intValue();
                i11 = intValue2;
                z8 = this.f17429k;
                i12 = 2;
            } else {
                int f7 = AbstractC1203z.f((String) AbstractC1297a.e(c1194q.f12726n), c1194q.f12722j);
                int M7 = g0.M.M(c1194q.f12702B);
                c1239a = c1239a3;
                i8 = -1;
                i9 = -1;
                i12 = 1;
                z8 = true;
                i10 = i20;
                z7 = r7.f17574b;
                i11 = f7;
                intValue = M7;
            }
        }
        if (i11 == 0) {
            throw new InterfaceC1659z.b("Invalid output encoding (mode=" + i12 + ") for: " + c1194q, c1194q);
        }
        if (intValue == 0) {
            throw new InterfaceC1659z.b("Invalid output channel config (mode=" + i12 + ") for: " + c1194q, c1194q);
        }
        int i22 = c1194q.f12721i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c1194q.f12726n) && i22 == -1) {
            i22 = 768000;
        }
        int i23 = i22;
        if (i7 != 0) {
            a7 = i7;
            i13 = i11;
            i14 = intValue;
            i15 = i9;
            i16 = i10;
        } else {
            i13 = i11;
            i14 = intValue;
            i15 = i9;
            i16 = i10;
            a7 = this.f17437p.a(T(i10, intValue, i11), i11, i12, i9 != -1 ? i9 : 1, i10, i23, z8 ? 8.0d : 1.0d);
        }
        this.f17424h0 = false;
        g gVar = new g(c1194q, i8, i12, i15, i16, i14, i13, a7, c1239a, z8, z7, this.f17418e0);
        if (a0()) {
            this.f17442u = gVar;
        } else {
            this.f17443v = gVar;
        }
    }
}
