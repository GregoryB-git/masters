package x3;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
import v5.e0;
import x3.s;

/* loaded from: classes.dex */
public final class o {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final a f17004a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17005b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f17006c;

    /* renamed from: d, reason: collision with root package name */
    public int f17007d;

    /* renamed from: e, reason: collision with root package name */
    public int f17008e;
    public n f;

    /* renamed from: g, reason: collision with root package name */
    public int f17009g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17010h;

    /* renamed from: i, reason: collision with root package name */
    public long f17011i;

    /* renamed from: j, reason: collision with root package name */
    public float f17012j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17013k;

    /* renamed from: l, reason: collision with root package name */
    public long f17014l;

    /* renamed from: m, reason: collision with root package name */
    public long f17015m;

    /* renamed from: n, reason: collision with root package name */
    public Method f17016n;

    /* renamed from: o, reason: collision with root package name */
    public long f17017o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17018p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17019q;

    /* renamed from: r, reason: collision with root package name */
    public long f17020r;

    /* renamed from: s, reason: collision with root package name */
    public long f17021s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public long f17022u;

    /* renamed from: v, reason: collision with root package name */
    public long f17023v;

    /* renamed from: w, reason: collision with root package name */
    public int f17024w;

    /* renamed from: x, reason: collision with root package name */
    public int f17025x;

    /* renamed from: y, reason: collision with root package name */
    public long f17026y;

    /* renamed from: z, reason: collision with root package name */
    public long f17027z;

    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public o(s.j jVar) {
        this.f17004a = jVar;
        if (e0.f15881a >= 18) {
            try {
                this.f17016n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f17005b = new long[10];
    }

    public final long a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f17026y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((e0.t((elapsedRealtime * 1000) - j10, this.f17012j) * this.f17009g) / 1000000));
        }
        if (elapsedRealtime - this.f17021s >= 5) {
            AudioTrack audioTrack = this.f17006c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = KeyboardMap.kValueMask & audioTrack.getPlaybackHeadPosition();
                if (this.f17010h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f17023v = this.t;
                    }
                    playbackHeadPosition += this.f17023v;
                }
                if (e0.f15881a <= 29) {
                    if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                        this.f17027z = -9223372036854775807L;
                    } else if (this.f17027z == -9223372036854775807L) {
                        this.f17027z = elapsedRealtime;
                    }
                }
                if (this.t > playbackHeadPosition) {
                    this.f17022u++;
                }
                this.t = playbackHeadPosition;
            }
            this.f17021s = elapsedRealtime;
        }
        return this.t + (this.f17022u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(long r6) {
        /*
            r5 = this;
            long r0 = r5.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 0
            r0 = 1
            if (r6 > 0) goto L29
            boolean r6 = r5.f17010h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f17006c
            r6.getClass()
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L26
            long r1 = r5.a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L26
            r6 = r0
            goto L27
        L26:
            r6 = r7
        L27:
            if (r6 == 0) goto L2a
        L29:
            r7 = r0
        L2a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.o.b(long):boolean");
    }

    public final void c() {
        this.f17014l = 0L;
        this.f17025x = 0;
        this.f17024w = 0;
        this.f17015m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f17013k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((v5.e0.f15881a < 23 && (r6 == 5 || r6 == 6)) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f17006c = r4
            r3.f17007d = r7
            r3.f17008e = r8
            x3.n r0 = new x3.n
            r0.<init>(r4)
            r3.f = r0
            int r4 = r4.getSampleRate()
            r3.f17009g = r4
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L29
            int r5 = v5.e0.f15881a
            r1 = 23
            if (r5 >= r1) goto L25
            r5 = 5
            if (r6 == r5) goto L23
            r5 = 6
            if (r6 != r5) goto L25
        L23:
            r5 = r4
            goto L26
        L25:
            r5 = r0
        L26:
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r4 = r0
        L2a:
            r3.f17010h = r4
            boolean r4 = v5.e0.F(r6)
            r3.f17019q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L44
            int r8 = r8 / r7
            long r7 = (long) r8
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r1
            int r4 = r3.f17009g
            long r1 = (long) r4
            long r7 = r7 / r1
            goto L45
        L44:
            r7 = r5
        L45:
            r3.f17011i = r7
            r7 = 0
            r3.t = r7
            r3.f17022u = r7
            r3.f17023v = r7
            r3.f17018p = r0
            r3.f17026y = r5
            r3.f17027z = r5
            r3.f17020r = r7
            r3.f17017o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f17012j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.o.d(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
