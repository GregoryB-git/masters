package o4;

import a4.e;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o4.j;
import o4.p;
import v3.i0;
import v5.b0;
import v5.e0;
import w3.a0;
import x3.y;
import z3.g;
import z4.c0;

/* loaded from: classes.dex */
public abstract class m extends v3.f {
    public static final byte[] J0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final z3.g A;
    public boolean A0;
    public final f B;
    public boolean B0;
    public final ArrayList<Long> C;
    public boolean C0;
    public final MediaCodec.BufferInfo D;
    public boolean D0;
    public final ArrayDeque<c> E;
    public v3.n E0;
    public i0 F;
    public z3.e F0;
    public i0 G;
    public c G0;
    public a4.e H;
    public long H0;
    public a4.e I;
    public boolean I0;
    public MediaCrypto J;
    public boolean K;
    public long L;
    public float M;
    public float N;
    public j O;
    public i0 P;
    public MediaFormat Q;
    public boolean R;
    public float S;
    public ArrayDeque<l> T;
    public b U;
    public l V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11811a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f11812b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f11813c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11814d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11815e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f11816f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f11817g0;

    /* renamed from: h0, reason: collision with root package name */
    public g f11818h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f11819i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f11820j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f11821k0;

    /* renamed from: l0, reason: collision with root package name */
    public ByteBuffer f11822l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f11823m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f11824n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f11825o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11826p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f11827q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f11828r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f11829s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f11830t0;

    /* renamed from: u, reason: collision with root package name */
    public final j.b f11831u;

    /* renamed from: u0, reason: collision with root package name */
    public int f11832u0;

    /* renamed from: v, reason: collision with root package name */
    public final n f11833v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f11834v0;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11835w;
    public boolean w0;

    /* renamed from: x, reason: collision with root package name */
    public final float f11836x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f11837x0;

    /* renamed from: y, reason: collision with root package name */
    public final z3.g f11838y;

    /* renamed from: y0, reason: collision with root package name */
    public long f11839y0;

    /* renamed from: z, reason: collision with root package name */
    public final z3.g f11840z;

    /* renamed from: z0, reason: collision with root package name */
    public long f11841z0;

    public static final class a {
        public static void a(j.a aVar, a0 a0Var) {
            a0.a aVar2 = a0Var.f16196a;
            aVar2.getClass();
            LogSessionId logSessionId = aVar2.f16198a;
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f11799b.setString("log-session-id", logSessionId.getStringId());
        }
    }

    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f11842a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11843b;

        /* renamed from: c, reason: collision with root package name */
        public final l f11844c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11845d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r10, v3.i0 r11, o4.p.b r12, boolean r13) {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Decoder init failed: ["
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = "], "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.t
                if (r10 >= 0) goto L20
                java.lang.String r11 = "neg_"
                goto L22
            L20:
                java.lang.String r11 = ""
            L22:
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                java.lang.StringBuilder r11 = defpackage.g.g(r0, r11)
                int r10 = java.lang.Math.abs(r10)
                r11.append(r10)
                java.lang.String r8 = r11.toString()
                r7 = 0
                r2 = r9
                r4 = r12
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.m.b.<init>(int, v3.i0, o4.p$b, boolean):void");
        }

        public b(String str, Throwable th, String str2, boolean z10, l lVar, String str3) {
            super(str, th);
            this.f11842a = str2;
            this.f11843b = z10;
            this.f11844c = lVar;
            this.f11845d = str3;
        }
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f11846d = new c(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f11847a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11848b;

        /* renamed from: c, reason: collision with root package name */
        public final b0<i0> f11849c = new b0<>();

        public c(long j10, long j11) {
            this.f11847a = j10;
            this.f11848b = j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i10, h hVar, float f) {
        super(i10);
        defpackage.f fVar = n.f11850l;
        this.f11831u = hVar;
        this.f11833v = fVar;
        this.f11835w = false;
        this.f11836x = f;
        this.f11838y = new z3.g(0);
        this.f11840z = new z3.g(0);
        this.A = new z3.g(2);
        f fVar2 = new f();
        this.B = fVar2;
        this.C = new ArrayList<>();
        this.D = new MediaCodec.BufferInfo();
        this.M = 1.0f;
        this.N = 1.0f;
        this.L = -9223372036854775807L;
        this.E = new ArrayDeque<>();
        t0(c.f11846d);
        fVar2.q(0);
        fVar2.f17532c.order(ByteOrder.nativeOrder());
        this.S = -1.0f;
        this.W = 0;
        this.f11829s0 = 0;
        this.f11820j0 = -1;
        this.f11821k0 = -1;
        this.f11819i0 = -9223372036854775807L;
        this.f11839y0 = -9223372036854775807L;
        this.f11841z0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.f11830t0 = 0;
        this.f11832u0 = 0;
    }

    @Override // v3.f
    public void B() {
        this.F = null;
        t0(c.f11846d);
        this.E.clear();
        R();
    }

    @Override // v3.f
    public void D(long j10, boolean z10) {
        int i10;
        this.A0 = false;
        this.B0 = false;
        this.D0 = false;
        if (this.f11825o0) {
            this.B.o();
            this.A.o();
            this.f11826p0 = false;
        } else if (R()) {
            a0();
        }
        b0<i0> b0Var = this.G0.f11849c;
        synchronized (b0Var) {
            i10 = b0Var.f15871d;
        }
        if (i10 > 0) {
            this.C0 = true;
        }
        this.G0.f11849c.b();
        this.E.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r5) goto L13;
     */
    @Override // v3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(v3.i0[] r5, long r6, long r8) {
        /*
            r4 = this;
            o4.m$c r5 = r4.G0
            long r5 = r5.f11848b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L16
            o4.m$c r5 = new o4.m$c
            r5.<init>(r0, r8)
            r4.t0(r5)
            goto L4e
        L16:
            java.util.ArrayDeque<o4.m$c> r5 = r4.E
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L42
            long r5 = r4.f11839y0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r2 = r4.H0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L42
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L42
        L2e:
            o4.m$c r5 = new o4.m$c
            r5.<init>(r0, r8)
            r4.t0(r5)
            o4.m$c r5 = r4.G0
            long r5 = r5.f11848b
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L4e
            r4.j0()
            goto L4e
        L42:
            java.util.ArrayDeque<o4.m$c> r5 = r4.E
            o4.m$c r6 = new o4.m$c
            long r0 = r4.f11839y0
            r6.<init>(r0, r8)
            r5.add(r6)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.m.H(v3.i0[], long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean J(long j10, long j11) {
        boolean z10;
        x6.b.H(!this.B0);
        f fVar = this.B;
        int i10 = fVar.f11788r;
        if (!(i10 > 0)) {
            z10 = 0;
        } else {
            if (!m0(j10, j11, null, fVar.f17532c, this.f11821k0, 0, i10, fVar.f17534e, fVar.n(), this.B.m(4), this.G)) {
                return false;
            }
            i0(this.B.f11787q);
            this.B.o();
            z10 = 0;
        }
        if (this.A0) {
            this.B0 = true;
            return z10;
        }
        if (this.f11826p0) {
            x6.b.H(this.B.s(this.A));
            this.f11826p0 = z10;
        }
        if (this.f11827q0) {
            if (this.B.f11788r > 0 ? true : z10) {
                return true;
            }
            M();
            this.f11827q0 = z10;
            a0();
            if (!this.f11825o0) {
                return z10;
            }
        }
        x6.b.H(!this.A0);
        l3.l lVar = this.f15331b;
        lVar.f9559a = null;
        lVar.f9560b = null;
        this.A.o();
        while (true) {
            this.A.o();
            int I = I(lVar, this.A, z10);
            if (I == -5) {
                f0(lVar);
                break;
            }
            if (I != -4) {
                if (I != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.A.m(4)) {
                    this.A0 = true;
                    break;
                }
                if (this.C0) {
                    i0 i0Var = this.F;
                    i0Var.getClass();
                    this.G = i0Var;
                    g0(i0Var, null);
                    this.C0 = z10;
                }
                this.A.r();
                if (!this.B.s(this.A)) {
                    this.f11826p0 = true;
                    break;
                }
            }
        }
        f fVar2 = this.B;
        if (fVar2.f11788r > 0 ? true : z10) {
            fVar2.r();
        }
        if ((this.B.f11788r > 0 ? true : z10) || this.A0 || this.f11827q0) {
            return true;
        }
        return z10;
    }

    public abstract z3.i K(l lVar, i0 i0Var, i0 i0Var2);

    public k L(IllegalStateException illegalStateException, l lVar) {
        return new k(illegalStateException, lVar);
    }

    public final void M() {
        this.f11827q0 = false;
        this.B.o();
        this.A.o();
        this.f11826p0 = false;
        this.f11825o0 = false;
    }

    public final boolean N() {
        if (this.f11834v0) {
            this.f11830t0 = 1;
            if (this.Y || this.f11811a0) {
                this.f11832u0 = 3;
                return false;
            }
            this.f11832u0 = 2;
        } else {
            y0();
        }
        return true;
    }

    public final boolean O(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean m02;
        int h10;
        boolean z12;
        if (!(this.f11821k0 >= 0)) {
            if (this.f11812b0 && this.w0) {
                try {
                    h10 = this.O.h(this.D);
                } catch (IllegalStateException unused) {
                    l0();
                    if (this.B0) {
                        o0();
                    }
                    return false;
                }
            } else {
                h10 = this.O.h(this.D);
            }
            if (h10 < 0) {
                if (h10 != -2) {
                    if (this.f11817g0 && (this.A0 || this.f11830t0 == 2)) {
                        l0();
                    }
                    return false;
                }
                this.f11837x0 = true;
                MediaFormat b10 = this.O.b();
                if (this.W != 0 && b10.getInteger("width") == 32 && b10.getInteger("height") == 32) {
                    this.f11816f0 = true;
                } else {
                    if (this.f11814d0) {
                        b10.setInteger("channel-count", 1);
                    }
                    this.Q = b10;
                    this.R = true;
                }
                return true;
            }
            if (this.f11816f0) {
                this.f11816f0 = false;
                this.O.j(h10, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.D;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            }
            this.f11821k0 = h10;
            ByteBuffer n2 = this.O.n(h10);
            this.f11822l0 = n2;
            if (n2 != null) {
                n2.position(this.D.offset);
                ByteBuffer byteBuffer = this.f11822l0;
                MediaCodec.BufferInfo bufferInfo2 = this.D;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f11813c0) {
                MediaCodec.BufferInfo bufferInfo3 = this.D;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f11839y0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.D.presentationTimeUs;
            int size = this.C.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z12 = false;
                    break;
                }
                if (this.C.get(i10).longValue() == j13) {
                    this.C.remove(i10);
                    z12 = true;
                    break;
                }
                i10++;
            }
            this.f11823m0 = z12;
            long j14 = this.f11841z0;
            long j15 = this.D.presentationTimeUs;
            this.f11824n0 = j14 == j15;
            z0(j15);
        }
        if (this.f11812b0 && this.w0) {
            try {
                j jVar = this.O;
                ByteBuffer byteBuffer2 = this.f11822l0;
                int i11 = this.f11821k0;
                MediaCodec.BufferInfo bufferInfo4 = this.D;
                z10 = true;
                z11 = false;
                try {
                    m02 = m0(j10, j11, jVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f11823m0, this.f11824n0, this.G);
                } catch (IllegalStateException unused2) {
                    l0();
                    if (this.B0) {
                        o0();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z10 = true;
            z11 = false;
            j jVar2 = this.O;
            ByteBuffer byteBuffer3 = this.f11822l0;
            int i12 = this.f11821k0;
            MediaCodec.BufferInfo bufferInfo5 = this.D;
            m02 = m0(j10, j11, jVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f11823m0, this.f11824n0, this.G);
        }
        if (m02) {
            i0(this.D.presentationTimeUs);
            boolean z13 = (this.D.flags & 4) != 0 ? z10 : z11;
            this.f11821k0 = -1;
            this.f11822l0 = null;
            if (!z13) {
                return z10;
            }
            l0();
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final boolean P() {
        boolean z10;
        j jVar = this.O;
        boolean z11 = 0;
        if (jVar == null || this.f11830t0 == 2 || this.A0) {
            return false;
        }
        if (this.f11820j0 < 0) {
            int f = jVar.f();
            this.f11820j0 = f;
            if (f < 0) {
                return false;
            }
            this.f11840z.f17532c = this.O.l(f);
            this.f11840z.o();
        }
        if (this.f11830t0 == 1) {
            if (!this.f11817g0) {
                this.w0 = true;
                this.O.i(this.f11820j0, 0, 4, 0L);
                this.f11820j0 = -1;
                this.f11840z.f17532c = null;
            }
            this.f11830t0 = 2;
            return false;
        }
        if (this.f11815e0) {
            this.f11815e0 = false;
            this.f11840z.f17532c.put(J0);
            this.O.i(this.f11820j0, 38, 0, 0L);
            this.f11820j0 = -1;
            this.f11840z.f17532c = null;
            this.f11834v0 = true;
            return true;
        }
        if (this.f11829s0 == 1) {
            for (int i10 = 0; i10 < this.P.f15458v.size(); i10++) {
                this.f11840z.f17532c.put(this.P.f15458v.get(i10));
            }
            this.f11829s0 = 2;
        }
        int position = this.f11840z.f17532c.position();
        l3.l lVar = this.f15331b;
        lVar.f9559a = null;
        lVar.f9560b = null;
        try {
            int I = I(lVar, this.f11840z, 0);
            if (h() || this.f11840z.m(536870912)) {
                this.f11841z0 = this.f11839y0;
            }
            if (I == -3) {
                return false;
            }
            if (I == -5) {
                if (this.f11829s0 == 2) {
                    this.f11840z.o();
                    this.f11829s0 = 1;
                }
                f0(lVar);
                return true;
            }
            if (this.f11840z.m(4)) {
                if (this.f11829s0 == 2) {
                    this.f11840z.o();
                    this.f11829s0 = 1;
                }
                this.A0 = true;
                if (!this.f11834v0) {
                    l0();
                    return false;
                }
                try {
                    if (!this.f11817g0) {
                        this.w0 = true;
                        this.O.i(this.f11820j0, 0, 4, 0L);
                        this.f11820j0 = -1;
                        this.f11840z.f17532c = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw z(e0.r(e10.getErrorCode()), this.F, e10, false);
                }
            }
            if (!this.f11834v0 && !this.f11840z.m(1)) {
                this.f11840z.o();
                if (this.f11829s0 == 2) {
                    this.f11829s0 = 1;
                }
                return true;
            }
            boolean m10 = this.f11840z.m(1073741824);
            if (m10) {
                z3.c cVar = this.f11840z.f17531b;
                if (position == 0) {
                    cVar.getClass();
                } else {
                    if (cVar.f17512d == null) {
                        int[] iArr = new int[1];
                        cVar.f17512d = iArr;
                        cVar.f17516i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = cVar.f17512d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.X && !m10) {
                ByteBuffer byteBuffer = this.f11840z.f17532c;
                byte[] bArr = v5.q.f15932a;
                int position2 = byteBuffer.position();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i13 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i14 = byteBuffer.get(i11) & 255;
                    if (i12 == 3) {
                        if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.position(i11 - 3);
                            duplicate.limit(position2);
                            byteBuffer.position(0);
                            byteBuffer.put(duplicate);
                            break;
                        }
                    } else if (i14 == 0) {
                        i12++;
                    }
                    if (i14 != 0) {
                        i12 = 0;
                    }
                    i11 = i13;
                }
                if (this.f11840z.f17532c.position() == 0) {
                    return true;
                }
                this.X = false;
            }
            z3.g gVar = this.f11840z;
            long j10 = gVar.f17534e;
            g gVar2 = this.f11818h0;
            if (gVar2 != null) {
                i0 i0Var = this.F;
                if (gVar2.f11791b == 0) {
                    gVar2.f11790a = j10;
                }
                if (!gVar2.f11792c) {
                    ByteBuffer byteBuffer2 = gVar.f17532c;
                    byteBuffer2.getClass();
                    int i15 = 0;
                    for (int i16 = 0; i16 < 4; i16++) {
                        i15 = (i15 << 8) | (byteBuffer2.get(i16) & 255);
                    }
                    int b10 = y.b(i15);
                    if (b10 == -1) {
                        gVar2.f11792c = true;
                        gVar2.f11791b = 0L;
                        gVar2.f11790a = gVar.f17534e;
                        v5.m.f("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j10 = gVar.f17534e;
                    } else {
                        long max = Math.max(0L, ((gVar2.f11791b - 529) * 1000000) / i0Var.H) + gVar2.f11790a;
                        gVar2.f11791b += b10;
                        j10 = max;
                    }
                }
                long j11 = this.f11839y0;
                g gVar3 = this.f11818h0;
                i0 i0Var2 = this.F;
                gVar3.getClass();
                z10 = m10;
                this.f11839y0 = Math.max(j11, Math.max(0L, ((gVar3.f11791b - 529) * 1000000) / i0Var2.H) + gVar3.f11790a);
                j10 = j10;
            } else {
                z10 = m10;
            }
            if (this.f11840z.n()) {
                this.C.add(Long.valueOf(j10));
            }
            if (this.C0) {
                (!this.E.isEmpty() ? this.E.peekLast() : this.G0).f11849c.a(this.F, j10);
                this.C0 = false;
            }
            this.f11839y0 = Math.max(this.f11839y0, j10);
            this.f11840z.r();
            if (this.f11840z.m(268435456)) {
                Y(this.f11840z);
            }
            k0(this.f11840z);
            try {
                if (z10) {
                    this.O.c(this.f11820j0, this.f11840z.f17531b, j10);
                } else {
                    this.O.i(this.f11820j0, this.f11840z.f17532c.limit(), 0, j10);
                }
                this.f11820j0 = -1;
                this.f11840z.f17532c = null;
                this.f11834v0 = true;
                this.f11829s0 = 0;
                z3.e eVar = this.F0;
                z11 = eVar.f17522c + 1;
                eVar.f17522c = z11;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw z(e0.r(e11.getErrorCode()), this.F, e11, z11);
            }
        } catch (g.a e12) {
            c0(e12);
            n0(0);
            Q();
            return true;
        }
    }

    public final void Q() {
        try {
            this.O.flush();
        } finally {
            q0();
        }
    }

    public final boolean R() {
        if (this.O == null) {
            return false;
        }
        int i10 = this.f11832u0;
        if (i10 == 3 || this.Y || ((this.Z && !this.f11837x0) || (this.f11811a0 && this.w0))) {
            o0();
            return true;
        }
        if (i10 == 2) {
            int i11 = e0.f15881a;
            x6.b.H(i11 >= 23);
            if (i11 >= 23) {
                try {
                    y0();
                } catch (v3.n e10) {
                    v5.m.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    o0();
                    return true;
                }
            }
        }
        Q();
        return false;
    }

    public final List<l> S(boolean z10) {
        ArrayList V = V(this.f11833v, this.F, z10);
        if (V.isEmpty() && z10) {
            V = V(this.f11833v, this.F, false);
            if (!V.isEmpty()) {
                StringBuilder l10 = defpackage.f.l("Drm session requires secure decoder for ");
                l10.append(this.F.t);
                l10.append(", but no secure decoder available. Trying to proceed with ");
                l10.append(V);
                l10.append(".");
                v5.m.f("MediaCodecRenderer", l10.toString());
            }
        }
        return V;
    }

    public boolean T() {
        return false;
    }

    public abstract float U(float f, i0[] i0VarArr);

    public abstract ArrayList V(n nVar, i0 i0Var, boolean z10);

    public final a4.p W(a4.e eVar) {
        z3.b l10 = eVar.l();
        if (l10 == null || (l10 instanceof a4.p)) {
            return (a4.p) l10;
        }
        throw z(6001, this.F, new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + l10), false);
    }

    public abstract j.a X(l lVar, i0 i0Var, MediaCrypto mediaCrypto, float f);

    public void Y(z3.g gVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0423, code lost:
    
        if ("stvm8".equals(r11) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0433, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L246;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ae  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(o4.l r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.m.Z(o4.l, android.media.MediaCrypto):void");
    }

    @Override // v3.k1
    public final int a(i0 i0Var) {
        try {
            return w0(this.f11833v, i0Var);
        } catch (p.b e10) {
            throw A(e10, i0Var);
        }
    }

    public final void a0() {
        i0 i0Var;
        if (this.O != null || this.f11825o0 || (i0Var = this.F) == null) {
            return;
        }
        if (this.I == null && v0(i0Var)) {
            i0 i0Var2 = this.F;
            M();
            String str = i0Var2.t;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                f fVar = this.B;
                fVar.getClass();
                fVar.f11789s = 32;
            } else {
                f fVar2 = this.B;
                fVar2.getClass();
                fVar2.f11789s = 1;
            }
            this.f11825o0 = true;
            return;
        }
        s0(this.I);
        String str2 = this.F.t;
        a4.e eVar = this.H;
        if (eVar != null) {
            if (this.J == null) {
                a4.p W = W(eVar);
                if (W != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(W.f193a, W.f194b);
                        this.J = mediaCrypto;
                        this.K = !W.f195c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw z(6006, this.F, e10, false);
                    }
                } else if (this.H.k() == null) {
                    return;
                }
            }
            if (a4.p.f192d) {
                int e11 = this.H.e();
                if (e11 == 1) {
                    e.a k10 = this.H.k();
                    k10.getClass();
                    throw z(k10.f176a, this.F, k10, false);
                }
                if (e11 != 4) {
                    return;
                }
            }
        }
        try {
            b0(this.J, this.K);
        } catch (b e12) {
            throw z(4001, this.F, e12, false);
        }
    }

    @Override // v3.j1
    public boolean b() {
        boolean b10;
        if (this.F != null) {
            if (h()) {
                b10 = this.f15339s;
            } else {
                c0 c0Var = this.f15335o;
                c0Var.getClass();
                b10 = c0Var.b();
            }
            if (b10) {
                return true;
            }
            if (this.f11821k0 >= 0) {
                return true;
            }
            if (this.f11819i0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f11819i0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(android.media.MediaCrypto r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.m.b0(android.media.MediaCrypto, boolean):void");
    }

    public abstract void c0(Exception exc);

    @Override // v3.j1
    public boolean d() {
        return this.B0;
    }

    public abstract void d0(String str, long j10, long j11);

    public abstract void e0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0143, code lost:
    
        if (r0 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r12 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e6, code lost:
    
        if (N() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0119, code lost:
    
        if (N() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012b, code lost:
    
        if (N() == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z3.i f0(l3.l r12) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.m.f0(l3.l):z3.i");
    }

    public abstract void g0(i0 i0Var, MediaFormat mediaFormat);

    public void h0(long j10) {
    }

    public void i0(long j10) {
        this.H0 = j10;
        while (!this.E.isEmpty() && j10 >= this.E.peek().f11847a) {
            t0(this.E.poll());
            j0();
        }
    }

    public abstract void j0();

    public abstract void k0(z3.g gVar);

    public final void l0() {
        int i10 = this.f11832u0;
        if (i10 == 1) {
            Q();
            return;
        }
        if (i10 == 2) {
            Q();
            y0();
        } else if (i10 != 3) {
            this.B0 = true;
            p0();
        } else {
            o0();
            a0();
        }
    }

    @Override // v3.f, v3.j1
    public void m(float f, float f10) {
        this.M = f;
        this.N = f10;
        x0(this.P);
    }

    public abstract boolean m0(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i0 i0Var);

    public final boolean n0(int i10) {
        l3.l lVar = this.f15331b;
        lVar.f9559a = null;
        lVar.f9560b = null;
        this.f11838y.o();
        int I = I(lVar, this.f11838y, i10 | 4);
        if (I == -5) {
            f0(lVar);
            return true;
        }
        if (I != -4 || !this.f11838y.m(4)) {
            return false;
        }
        this.A0 = true;
        l0();
        return false;
    }

    @Override // v3.f, v3.k1
    public final int o() {
        return 8;
    }

    public final void o0() {
        try {
            j jVar = this.O;
            if (jVar != null) {
                jVar.release();
                this.F0.f17521b++;
                e0(this.V.f11804a);
            }
            this.O = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.O = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: IllegalStateException -> 0x00a3, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x00a3, blocks: (B:8:0x000f, B:10:0x0013, B:13:0x0017, B:15:0x001b, B:18:0x0023, B:20:0x002a, B:21:0x002f, B:25:0x0084, B:26:0x009e, B:27:0x00a0, B:28:0x00a1, B:30:0x0036, B:32:0x003a, B:33:0x0043, B:35:0x004e, B:37:0x0054, B:45:0x0066, B:47:0x006c, B:49:0x0072, B:60:0x0088), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065 A[LOOP:1: B:33:0x0043->B:42:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:44:? BREAK  A[LOOP:1: B:33:0x0043->B:42:0x0065], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[LOOP:2: B:45:0x0066->B:54:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084 A[EDGE_INSN: B:55:0x0084->B:25:0x0084 BREAK  A[LOOP:2: B:45:0x0066->B:54:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    @Override // v3.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.m.p(long, long):void");
    }

    public void p0() {
    }

    public void q0() {
        this.f11820j0 = -1;
        this.f11840z.f17532c = null;
        this.f11821k0 = -1;
        this.f11822l0 = null;
        this.f11819i0 = -9223372036854775807L;
        this.w0 = false;
        this.f11834v0 = false;
        this.f11815e0 = false;
        this.f11816f0 = false;
        this.f11823m0 = false;
        this.f11824n0 = false;
        this.C.clear();
        this.f11839y0 = -9223372036854775807L;
        this.f11841z0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        g gVar = this.f11818h0;
        if (gVar != null) {
            gVar.f11790a = 0L;
            gVar.f11791b = 0L;
            gVar.f11792c = false;
        }
        this.f11830t0 = 0;
        this.f11832u0 = 0;
        this.f11829s0 = this.f11828r0 ? 1 : 0;
    }

    public final void r0() {
        q0();
        this.E0 = null;
        this.f11818h0 = null;
        this.T = null;
        this.V = null;
        this.P = null;
        this.Q = null;
        this.R = false;
        this.f11837x0 = false;
        this.S = -1.0f;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f11811a0 = false;
        this.f11812b0 = false;
        this.f11813c0 = false;
        this.f11814d0 = false;
        this.f11817g0 = false;
        this.f11828r0 = false;
        this.f11829s0 = 0;
        this.K = false;
    }

    public final void s0(a4.e eVar) {
        a4.e eVar2 = this.H;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.h(null);
            }
            if (eVar2 != null) {
                eVar2.f(null);
            }
        }
        this.H = eVar;
    }

    public final void t0(c cVar) {
        this.G0 = cVar;
        long j10 = cVar.f11848b;
        if (j10 != -9223372036854775807L) {
            this.I0 = true;
            h0(j10);
        }
    }

    public boolean u0(l lVar) {
        return true;
    }

    public boolean v0(i0 i0Var) {
        return false;
    }

    public abstract int w0(n nVar, i0 i0Var);

    public final boolean x0(i0 i0Var) {
        if (e0.f15881a >= 23 && this.O != null && this.f11832u0 != 3 && this.f != 0) {
            float f = this.N;
            i0[] i0VarArr = this.f15336p;
            i0VarArr.getClass();
            float U = U(f, i0VarArr);
            float f10 = this.S;
            if (f10 == U) {
                return true;
            }
            if (U == -1.0f) {
                if (this.f11834v0) {
                    this.f11830t0 = 1;
                    this.f11832u0 = 3;
                    return false;
                }
                o0();
                a0();
                return false;
            }
            if (f10 == -1.0f && U <= this.f11836x) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", U);
            this.O.d(bundle);
            this.S = U;
        }
        return true;
    }

    public final void y0() {
        try {
            this.J.setMediaDrmSession(W(this.I).f194b);
            s0(this.I);
            this.f11830t0 = 0;
            this.f11832u0 = 0;
        } catch (MediaCryptoException e10) {
            throw z(6006, this.F, e10, false);
        }
    }

    public final void z0(long j10) {
        boolean z10;
        i0 d10;
        i0 e10;
        b0<i0> b0Var = this.G0.f11849c;
        synchronized (b0Var) {
            z10 = true;
            d10 = b0Var.d(j10, true);
        }
        i0 i0Var = d10;
        if (i0Var == null && this.I0 && this.Q != null) {
            b0<i0> b0Var2 = this.G0.f11849c;
            synchronized (b0Var2) {
                e10 = b0Var2.f15871d == 0 ? null : b0Var2.e();
            }
            i0Var = e10;
        }
        if (i0Var != null) {
            this.G = i0Var;
        } else {
            z10 = false;
        }
        if (z10 || (this.R && this.G != null)) {
            g0(this.G, this.Q);
            this.R = false;
            this.I0 = false;
        }
    }
}
