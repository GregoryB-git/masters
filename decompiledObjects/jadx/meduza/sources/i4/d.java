package i4;

import android.util.SparseArray;
import c4.h;
import c4.i;
import c4.j;
import c4.v;
import c4.w;
import defpackage.g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v3.a1;
import v5.e0;
import v5.n;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f7425c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f7426d0 = e0.B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f7427e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f7428f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f7429g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    public static final Map<String, Integer> f7430h0;
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final c f7431a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f7432a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f7433b;

    /* renamed from: b0, reason: collision with root package name */
    public j f7434b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<b> f7435c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7436d;

    /* renamed from: e, reason: collision with root package name */
    public final u f7437e;
    public final u f;

    /* renamed from: g, reason: collision with root package name */
    public final u f7438g;

    /* renamed from: h, reason: collision with root package name */
    public final u f7439h;

    /* renamed from: i, reason: collision with root package name */
    public final u f7440i;

    /* renamed from: j, reason: collision with root package name */
    public final u f7441j;

    /* renamed from: k, reason: collision with root package name */
    public final u f7442k;

    /* renamed from: l, reason: collision with root package name */
    public final u f7443l;

    /* renamed from: m, reason: collision with root package name */
    public final u f7444m;

    /* renamed from: n, reason: collision with root package name */
    public final u f7445n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f7446o;

    /* renamed from: p, reason: collision with root package name */
    public long f7447p;

    /* renamed from: q, reason: collision with root package name */
    public long f7448q;

    /* renamed from: r, reason: collision with root package name */
    public long f7449r;

    /* renamed from: s, reason: collision with root package name */
    public long f7450s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public b f7451u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7452v;

    /* renamed from: w, reason: collision with root package name */
    public int f7453w;

    /* renamed from: x, reason: collision with root package name */
    public long f7454x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7455y;

    /* renamed from: z, reason: collision with root package name */
    public long f7456z;

    public final class a implements i4.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:359:0x086f, code lost:
        
            if (r2.o() == r7.getLeastSignificantBits()) goto L485;
         */
        /* JADX WARN: Code restructure failed: missing block: B:403:0x0456, code lost:
        
            if (r3.equals("V_THEORA") == false) goto L360;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:116:0x08d5  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x08ee  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x08fd  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0ac5  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0909  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x08f0  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x0876  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x089b  */
        /* JADX WARN: Type inference failed for: r0v67 */
        /* JADX WARN: Type inference failed for: r0v68 */
        /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.RuntimeException] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r33) {
            /*
                Method dump skipped, instructions count: 3372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.d.a.a(int):void");
        }
    }

    public static final class b {
        public byte[] N;
        public w T;
        public boolean U;
        public v X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f7458a;

        /* renamed from: b, reason: collision with root package name */
        public String f7459b;

        /* renamed from: c, reason: collision with root package name */
        public int f7460c;

        /* renamed from: d, reason: collision with root package name */
        public int f7461d;

        /* renamed from: e, reason: collision with root package name */
        public int f7462e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f7463g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7464h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f7465i;

        /* renamed from: j, reason: collision with root package name */
        public v.a f7466j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f7467k;

        /* renamed from: l, reason: collision with root package name */
        public a4.d f7468l;

        /* renamed from: m, reason: collision with root package name */
        public int f7469m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f7470n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f7471o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f7472p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f7473q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f7474r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f7475s = 0.0f;
        public float t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f7476u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f7477v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f7478w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f7479x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f7480y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f7481z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public final byte[] a(String str) {
            byte[] bArr = this.f7467k;
            if (bArr != null) {
                return bArr;
            }
            throw a1.a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        g.k(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f7430h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        i4.a aVar = new i4.a();
        this.f7448q = -1L;
        this.f7449r = -9223372036854775807L;
        this.f7450s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.f7456z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f7431a = aVar;
        aVar.f7420d = new a();
        this.f7436d = (i10 & 1) == 0;
        this.f7433b = new e();
        this.f7435c = new SparseArray<>();
        this.f7438g = new u(4);
        this.f7439h = new u(ByteBuffer.allocate(4).putInt(-1).array());
        this.f7440i = new u(4);
        this.f7437e = new u(q.f15932a);
        this.f = new u(4);
        this.f7441j = new u();
        this.f7442k = new u();
        this.f7443l = new u(8);
        this.f7444m = new u();
        this.f7445n = new u();
        this.L = new int[1];
    }

    public static byte[] g(long j10, long j11, String str) {
        x6.b.q(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return e0.B(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw a1.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f7434b0 = jVar;
    }

    public final void c(int i10) {
        if (this.f7451u != null) {
            return;
        }
        throw a1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01f2, code lost:
    
        r4 = r5;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0963, code lost:
    
        if (r4 == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0965, code lost:
    
        r5 = r30.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x096b, code lost:
    
        if (r29.f7455y == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x096d, code lost:
    
        r29.A = r5;
        r31.f2313a = r29.f7456z;
        r29.f7455y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0986, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0989, code lost:
    
        if (r3 == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x098b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0473, code lost:
    
        throw v3.a1.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0978, code lost:
    
        if (r29.f7452v == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x097a, code lost:
    
        r5 = r29.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0980, code lost:
    
        if (r5 == (-1)) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0982, code lost:
    
        r31.f2313a = r5;
        r29.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0988, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0744, code lost:
    
        throw v3.a1.a("DocTypeReadVersion " + r8 + " not supported", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x099d, code lost:
    
        if (r4 != false) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x099f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x09a6, code lost:
    
        if (r1 >= r29.f7435c.size()) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x09a8, code lost:
    
        r2 = r29.f7435c.valueAt(r1);
        r2.X.getClass();
        r3 = r2.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x09b7, code lost:
    
        if (r3 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x09b9, code lost:
    
        r3.a(r2.X, r2.f7466j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x09c0, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x09c3, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x09c5, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a8  */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v73 */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r30, c4.s r31) {
        /*
            Method dump skipped, instructions count: 3052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.d(c4.i, c4.s):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i4.d.b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.e(i4.d$b, long, int, int, int):void");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        i4.a aVar = (i4.a) this.f7431a;
        aVar.f7421e = 0;
        aVar.f7418b.clear();
        e eVar = aVar.f7419c;
        eVar.f7484b = 0;
        eVar.f7485c = 0;
        e eVar2 = this.f7433b;
        eVar2.f7484b = 0;
        eVar2.f7485c = 0;
        j();
        for (int i10 = 0; i10 < this.f7435c.size(); i10++) {
            w wVar = this.f7435c.valueAt(i10).T;
            if (wVar != null) {
                wVar.f2326b = false;
                wVar.f2327c = 0;
            }
        }
    }

    public final void h(i iVar, int i10) {
        u uVar = this.f7438g;
        if (uVar.f15976c >= i10) {
            return;
        }
        byte[] bArr = uVar.f15974a;
        if (bArr.length < i10) {
            uVar.a(Math.max(bArr.length * 2, i10));
        }
        u uVar2 = this.f7438g;
        byte[] bArr2 = uVar2.f15974a;
        int i11 = uVar2.f15976c;
        iVar.readFully(bArr2, i11, i10 - i11);
        this.f7438g.F(i10);
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        d0.c cVar = new d0.c();
        c4.e eVar = (c4.e) iVar;
        long j10 = eVar.f2275c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        eVar.c(((u) cVar.f3331b).f15974a, 0, 4, false);
        cVar.f3330a = 4;
        for (long w10 = ((u) cVar.f3331b).w(); w10 != 440786851; w10 = (((u) cVar.f3331b).f15974a[0] & 255) | ((w10 << 8) & (-256))) {
            int i11 = cVar.f3330a + 1;
            cVar.f3330a = i11;
            if (i11 == i10) {
                return false;
            }
            eVar.c(((u) cVar.f3331b).f15974a, 0, 1, false);
        }
        long b10 = cVar.b(eVar);
        long j12 = cVar.f3330a;
        if (b10 == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + b10 >= j10) {
            return false;
        }
        while (true) {
            long j13 = cVar.f3330a;
            long j14 = j12 + b10;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (cVar.b(eVar) == Long.MIN_VALUE) {
                return false;
            }
            long b11 = cVar.b(eVar);
            if (b11 < 0 || b11 > 2147483647L) {
                return false;
            }
            if (b11 != 0) {
                int i12 = (int) b11;
                eVar.k(i12, false);
                cVar.f3330a += i12;
            }
        }
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f7432a0 = false;
        this.f7441j.D(0);
    }

    public final long k(long j10) {
        long j11 = this.f7449r;
        if (j11 != -9223372036854775807L) {
            return e0.O(j10, j11, 1000L);
        }
        throw a1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(i iVar, b bVar, int i10, boolean z10) {
        int e10;
        int e11;
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f7459b)) {
            m(iVar, f7425c0, i10);
        } else if ("S_TEXT/ASS".equals(bVar.f7459b)) {
            m(iVar, f7427e0, i10);
        } else if ("S_TEXT/WEBVTT".equals(bVar.f7459b)) {
            m(iVar, f7428f0, i10);
        } else {
            v vVar = bVar.X;
            if (!this.V) {
                if (bVar.f7464h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        iVar.readFully(this.f7438g.f15974a, 0, 1);
                        this.S++;
                        byte b10 = this.f7438g.f15974a[0];
                        if ((b10 & 128) == 128) {
                            throw a1.a("Extension bit is set in signal byte", null);
                        }
                        this.Z = b10;
                        this.W = true;
                    }
                    byte b11 = this.Z;
                    if ((b11 & 1) == 1) {
                        boolean z11 = (b11 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.f7432a0) {
                            iVar.readFully(this.f7443l.f15974a, 0, 8);
                            this.S += 8;
                            this.f7432a0 = true;
                            u uVar = this.f7438g;
                            uVar.f15974a[0] = (byte) ((z11 ? 128 : 0) | 8);
                            uVar.G(0);
                            vVar.a(1, this.f7438g);
                            this.T++;
                            this.f7443l.G(0);
                            vVar.a(8, this.f7443l);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.X) {
                                iVar.readFully(this.f7438g.f15974a, 0, 1);
                                this.S++;
                                this.f7438g.G(0);
                                this.Y = this.f7438g.v();
                                this.X = true;
                            }
                            int i12 = this.Y * 4;
                            this.f7438g.D(i12);
                            iVar.readFully(this.f7438g.f15974a, 0, i12);
                            this.S += i12;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i13 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f7446o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f7446o = ByteBuffer.allocate(i13);
                            }
                            this.f7446o.position(0);
                            this.f7446o.putShort(s10);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i14 >= i11) {
                                    break;
                                }
                                int y10 = this.f7438g.y();
                                if (i14 % 2 == 0) {
                                    this.f7446o.putShort((short) (y10 - i15));
                                } else {
                                    this.f7446o.putInt(y10 - i15);
                                }
                                i14++;
                                i15 = y10;
                            }
                            int i16 = (i10 - this.S) - i15;
                            int i17 = i11 % 2;
                            ByteBuffer byteBuffer2 = this.f7446o;
                            if (i17 == 1) {
                                byteBuffer2.putInt(i16);
                            } else {
                                byteBuffer2.putShort((short) i16);
                                this.f7446o.putInt(0);
                            }
                            this.f7444m.E(this.f7446o.array(), i13);
                            vVar.a(i13, this.f7444m);
                            this.T += i13;
                        }
                    }
                } else {
                    byte[] bArr = bVar.f7465i;
                    if (bArr != null) {
                        this.f7441j.E(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(bVar.f7459b)) {
                    z10 = bVar.f > 0;
                }
                if (z10) {
                    this.O |= 268435456;
                    this.f7445n.D(0);
                    int i18 = (this.f7441j.f15976c + i10) - this.S;
                    this.f7438g.D(4);
                    u uVar2 = this.f7438g;
                    byte[] bArr2 = uVar2.f15974a;
                    bArr2[0] = (byte) ((i18 >> 24) & 255);
                    bArr2[1] = (byte) ((i18 >> 16) & 255);
                    bArr2[2] = (byte) ((i18 >> 8) & 255);
                    bArr2[3] = (byte) (i18 & 255);
                    vVar.a(4, uVar2);
                    this.T += 4;
                }
                this.V = true;
            }
            int i19 = i10 + this.f7441j.f15976c;
            if (!"V_MPEG4/ISO/AVC".equals(bVar.f7459b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f7459b)) {
                if (bVar.T != null) {
                    x6.b.H(this.f7441j.f15976c == 0);
                    bVar.T.c(iVar);
                }
                while (true) {
                    int i20 = this.S;
                    if (i20 >= i19) {
                        break;
                    }
                    int i21 = i19 - i20;
                    u uVar3 = this.f7441j;
                    int i22 = uVar3.f15976c - uVar3.f15975b;
                    if (i22 > 0) {
                        e11 = Math.min(i21, i22);
                        vVar.b(e11, this.f7441j);
                    } else {
                        e11 = vVar.e(iVar, i21, false);
                    }
                    this.S += e11;
                    this.T += e11;
                }
            } else {
                byte[] bArr3 = this.f.f15974a;
                bArr3[0] = 0;
                bArr3[1] = 0;
                bArr3[2] = 0;
                int i23 = bVar.Y;
                int i24 = 4 - i23;
                while (this.S < i19) {
                    int i25 = this.U;
                    if (i25 == 0) {
                        u uVar4 = this.f7441j;
                        int min = Math.min(i23, uVar4.f15976c - uVar4.f15975b);
                        iVar.readFully(bArr3, i24 + min, i23 - min);
                        if (min > 0) {
                            this.f7441j.d(bArr3, i24, min);
                        }
                        this.S += i23;
                        this.f.G(0);
                        this.U = this.f.y();
                        this.f7437e.G(0);
                        vVar.b(4, this.f7437e);
                        this.T += 4;
                    } else {
                        u uVar5 = this.f7441j;
                        int i26 = uVar5.f15976c - uVar5.f15975b;
                        if (i26 > 0) {
                            e10 = Math.min(i25, i26);
                            vVar.b(e10, this.f7441j);
                        } else {
                            e10 = vVar.e(iVar, i25, false);
                        }
                        this.S += e10;
                        this.T += e10;
                        this.U -= e10;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.f7459b)) {
                this.f7439h.G(0);
                vVar.b(4, this.f7439h);
                this.T += 4;
            }
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(i iVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        u uVar = this.f7442k;
        byte[] bArr2 = uVar.f15974a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            uVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iVar.readFully(this.f7442k.f15974a, bArr.length, i10);
        this.f7442k.G(0);
        this.f7442k.F(length);
    }

    @Override // c4.h
    public final void release() {
    }
}
