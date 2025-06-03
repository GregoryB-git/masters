package X0;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.C0363h;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.M;
import F0.T;
import F0.U;
import F0.r;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import c1.t;
import c1.v;
import d0.AbstractC1184g;
import d0.C1162A;
import d0.C1185h;
import d0.C1190m;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import g0.p;
import g0.z;
import h0.AbstractC1329d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class e implements r {

    /* renamed from: e0, reason: collision with root package name */
    public static final InterfaceC0378x f6906e0 = new InterfaceC0378x() { // from class: X0.d
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] C7;
            C7 = e.C();
            return C7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f6907f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f6908g0 = M.r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f6909h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f6910i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f6911j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f6912k0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f6913A;

    /* renamed from: B, reason: collision with root package name */
    public long f6914B;

    /* renamed from: C, reason: collision with root package name */
    public long f6915C;

    /* renamed from: D, reason: collision with root package name */
    public long f6916D;

    /* renamed from: E, reason: collision with root package name */
    public p f6917E;

    /* renamed from: F, reason: collision with root package name */
    public p f6918F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6919G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6920H;

    /* renamed from: I, reason: collision with root package name */
    public int f6921I;

    /* renamed from: J, reason: collision with root package name */
    public long f6922J;

    /* renamed from: K, reason: collision with root package name */
    public long f6923K;

    /* renamed from: L, reason: collision with root package name */
    public int f6924L;

    /* renamed from: M, reason: collision with root package name */
    public int f6925M;

    /* renamed from: N, reason: collision with root package name */
    public int[] f6926N;

    /* renamed from: O, reason: collision with root package name */
    public int f6927O;

    /* renamed from: P, reason: collision with root package name */
    public int f6928P;

    /* renamed from: Q, reason: collision with root package name */
    public int f6929Q;

    /* renamed from: R, reason: collision with root package name */
    public int f6930R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f6931S;

    /* renamed from: T, reason: collision with root package name */
    public long f6932T;

    /* renamed from: U, reason: collision with root package name */
    public int f6933U;

    /* renamed from: V, reason: collision with root package name */
    public int f6934V;

    /* renamed from: W, reason: collision with root package name */
    public int f6935W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f6936X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f6937Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f6938Z;

    /* renamed from: a, reason: collision with root package name */
    public final X0.c f6939a;

    /* renamed from: a0, reason: collision with root package name */
    public int f6940a0;

    /* renamed from: b, reason: collision with root package name */
    public final g f6941b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f6942b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f6943c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f6944c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6945d;

    /* renamed from: d0, reason: collision with root package name */
    public InterfaceC0374t f6946d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6947e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f6948f;

    /* renamed from: g, reason: collision with root package name */
    public final z f6949g;

    /* renamed from: h, reason: collision with root package name */
    public final z f6950h;

    /* renamed from: i, reason: collision with root package name */
    public final z f6951i;

    /* renamed from: j, reason: collision with root package name */
    public final z f6952j;

    /* renamed from: k, reason: collision with root package name */
    public final z f6953k;

    /* renamed from: l, reason: collision with root package name */
    public final z f6954l;

    /* renamed from: m, reason: collision with root package name */
    public final z f6955m;

    /* renamed from: n, reason: collision with root package name */
    public final z f6956n;

    /* renamed from: o, reason: collision with root package name */
    public final z f6957o;

    /* renamed from: p, reason: collision with root package name */
    public final z f6958p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f6959q;

    /* renamed from: r, reason: collision with root package name */
    public long f6960r;

    /* renamed from: s, reason: collision with root package name */
    public long f6961s;

    /* renamed from: t, reason: collision with root package name */
    public long f6962t;

    /* renamed from: u, reason: collision with root package name */
    public long f6963u;

    /* renamed from: v, reason: collision with root package name */
    public long f6964v;

    /* renamed from: w, reason: collision with root package name */
    public c f6965w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6966x;

    /* renamed from: y, reason: collision with root package name */
    public int f6967y;

    /* renamed from: z, reason: collision with root package name */
    public long f6968z;

    public final class b implements X0.b {
        public b() {
        }

        @Override // X0.b
        public void a(int i7) {
            e.this.q(i7);
        }

        @Override // X0.b
        public int b(int i7) {
            return e.this.w(i7);
        }

        @Override // X0.b
        public void c(int i7, double d7) {
            e.this.t(i7, d7);
        }

        @Override // X0.b
        public boolean d(int i7) {
            return e.this.B(i7);
        }

        @Override // X0.b
        public void e(int i7, int i8, InterfaceC0373s interfaceC0373s) {
            e.this.n(i7, i8, interfaceC0373s);
        }

        @Override // X0.b
        public void f(int i7, String str) {
            e.this.J(i7, str);
        }

        @Override // X0.b
        public void g(int i7, long j7, long j8) {
            e.this.I(i7, j7, j8);
        }

        @Override // X0.b
        public void h(int i7, long j7) {
            e.this.z(i7, j7);
        }
    }

    public static final class c {

        /* renamed from: O, reason: collision with root package name */
        public byte[] f6984O;

        /* renamed from: U, reason: collision with root package name */
        public U f6990U;

        /* renamed from: V, reason: collision with root package name */
        public boolean f6991V;

        /* renamed from: Y, reason: collision with root package name */
        public T f6994Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f6995Z;

        /* renamed from: a, reason: collision with root package name */
        public String f6996a;

        /* renamed from: b, reason: collision with root package name */
        public String f6997b;

        /* renamed from: c, reason: collision with root package name */
        public int f6998c;

        /* renamed from: d, reason: collision with root package name */
        public int f6999d;

        /* renamed from: e, reason: collision with root package name */
        public int f7000e;

        /* renamed from: f, reason: collision with root package name */
        public int f7001f;

        /* renamed from: g, reason: collision with root package name */
        public int f7002g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7003h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f7004i;

        /* renamed from: j, reason: collision with root package name */
        public T.a f7005j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f7006k;

        /* renamed from: l, reason: collision with root package name */
        public C1190m f7007l;

        /* renamed from: m, reason: collision with root package name */
        public int f7008m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f7009n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f7010o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f7011p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f7012q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f7013r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f7014s = -1;

        /* renamed from: t, reason: collision with root package name */
        public float f7015t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f7016u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f7017v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public byte[] f7018w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f7019x = -1;

        /* renamed from: y, reason: collision with root package name */
        public boolean f7020y = false;

        /* renamed from: z, reason: collision with root package name */
        public int f7021z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f6970A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f6971B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f6972C = 1000;

        /* renamed from: D, reason: collision with root package name */
        public int f6973D = 200;

        /* renamed from: E, reason: collision with root package name */
        public float f6974E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f6975F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f6976G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f6977H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f6978I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f6979J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f6980K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f6981L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f6982M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f6983N = -1.0f;

        /* renamed from: P, reason: collision with root package name */
        public int f6985P = 1;

        /* renamed from: Q, reason: collision with root package name */
        public int f6986Q = -1;

        /* renamed from: R, reason: collision with root package name */
        public int f6987R = 8000;

        /* renamed from: S, reason: collision with root package name */
        public long f6988S = 0;

        /* renamed from: T, reason: collision with root package name */
        public long f6989T = 0;

        /* renamed from: W, reason: collision with root package name */
        public boolean f6992W = true;

        /* renamed from: X, reason: collision with root package name */
        public String f6993X = "eng";

        public static Pair k(z zVar) {
            try {
                zVar.U(16);
                long w7 = zVar.w();
                if (w7 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (w7 == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (w7 != 826496599) {
                    o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] e7 = zVar.e();
                for (int f7 = zVar.f() + 20; f7 < e7.length - 4; f7++) {
                    if (e7[f7] == 0 && e7[f7 + 1] == 0 && e7[f7 + 2] == 1 && e7[f7 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e7, f7, e7.length)));
                    }
                }
                throw C1162A.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1162A.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(z zVar) {
            try {
                int y7 = zVar.y();
                if (y7 == 1) {
                    return true;
                }
                if (y7 != 65534) {
                    return false;
                }
                zVar.T(24);
                if (zVar.z() == e.f6911j0.getMostSignificantBits()) {
                    if (zVar.z() == e.f6911j0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1162A.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) {
            int i7;
            int i8;
            try {
                if (bArr[0] != 2) {
                    throw C1162A.a("Error parsing vorbis codec private", null);
                }
                int i9 = 0;
                int i10 = 1;
                while (true) {
                    i7 = bArr[i10];
                    if ((i7 & 255) != 255) {
                        break;
                    }
                    i9 += 255;
                    i10++;
                }
                int i11 = i10 + 1;
                int i12 = i9 + (i7 & 255);
                int i13 = 0;
                while (true) {
                    i8 = bArr[i11];
                    if ((i8 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i11++;
                }
                int i14 = i11 + 1;
                int i15 = i13 + (i8 & 255);
                if (bArr[i14] != 1) {
                    throw C1162A.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i14, bArr2, 0, i12);
                int i16 = i14 + i12;
                if (bArr[i16] != 3) {
                    throw C1162A.a("Error parsing vorbis codec private", null);
                }
                int i17 = i16 + i15;
                if (bArr[i17] != 5) {
                    throw C1162A.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i17];
                System.arraycopy(bArr, i17, bArr3, 0, bArr.length - i17);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1162A.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            AbstractC1297a.e(this.f6994Y);
        }

        public final byte[] g(String str) {
            byte[] bArr = this.f7006k;
            if (bArr != null) {
                return bArr;
            }
            throw C1162A.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.f6974E == -1.0f || this.f6975F == -1.0f || this.f6976G == -1.0f || this.f6977H == -1.0f || this.f6978I == -1.0f || this.f6979J == -1.0f || this.f6980K == -1.0f || this.f6981L == -1.0f || this.f6982M == -1.0f || this.f6983N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f6974E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6975F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6976G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6977H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6978I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6979J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6980K * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f6981L * 50000.0f) + 0.5f));
            order.putShort((short) (this.f6982M + 0.5f));
            order.putShort((short) (this.f6983N + 0.5f));
            order.putShort((short) this.f6972C);
            order.putShort((short) this.f6973D);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x040e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0436  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0572  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0429  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(F0.InterfaceC0374t r19, int r20) {
            /*
                Method dump skipped, instructions count: 1672
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X0.e.c.i(F0.t, int):void");
        }

        public void j() {
            U u7 = this.f6990U;
            if (u7 != null) {
                u7.a(this.f6994Y, this.f7005j);
            }
        }

        public void n() {
            U u7 = this.f6990U;
            if (u7 != null) {
                u7.b();
            }
        }

        public final boolean o(boolean z7) {
            return "A_OPUS".equals(this.f6997b) ? z7 : this.f7001f > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f6912k0 = Collections.unmodifiableMap(hashMap);
    }

    public e(X0.c cVar, int i7, t.a aVar) {
        this.f6961s = -1L;
        this.f6962t = -9223372036854775807L;
        this.f6963u = -9223372036854775807L;
        this.f6964v = -9223372036854775807L;
        this.f6914B = -1L;
        this.f6915C = -1L;
        this.f6916D = -9223372036854775807L;
        this.f6939a = cVar;
        cVar.d(new b());
        this.f6948f = aVar;
        this.f6945d = (i7 & 1) == 0;
        this.f6947e = (i7 & 2) == 0;
        this.f6941b = new g();
        this.f6943c = new SparseArray();
        this.f6951i = new z(4);
        this.f6952j = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.f6953k = new z(4);
        this.f6949g = new z(AbstractC1329d.f14524a);
        this.f6950h = new z(4);
        this.f6954l = new z();
        this.f6955m = new z();
        this.f6956n = new z(8);
        this.f6957o = new z();
        this.f6958p = new z();
        this.f6926N = new int[1];
    }

    public static boolean A(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] C() {
        return new r[]{new e(t.a.f10046a, 2)};
    }

    public static void H(String str, long j7, byte[] bArr) {
        byte[] u7;
        int i7;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                u7 = u(j7, "%01d:%02d:%02d:%02d", 10000L);
                i7 = 21;
                break;
            case "S_TEXT/WEBVTT":
                u7 = u(j7, "%02d:%02d:%02d.%03d", 1000L);
                i7 = 25;
                break;
            case "S_TEXT/UTF8":
                u7 = u(j7, "%02d:%02d:%02d,%03d", 1000L);
                i7 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(u7, 0, bArr, i7, u7.length);
    }

    private void m() {
        AbstractC1297a.h(this.f6946d0);
    }

    public static int[] r(int[] iArr, int i7) {
        return iArr == null ? new int[i7] : iArr.length >= i7 ? iArr : new int[Math.max(iArr.length * 2, i7)];
    }

    public static byte[] u(long j7, String str, long j8) {
        AbstractC1297a.a(j7 != -9223372036854775807L);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        return M.r0(String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8))));
    }

    public boolean B(int i7) {
        return i7 == 357149030 || i7 == 524531317 || i7 == 475249515 || i7 == 374648427;
    }

    public final boolean D(L l7, long j7) {
        if (this.f6913A) {
            this.f6915C = j7;
            l7.f1788a = this.f6914B;
            this.f6913A = false;
            return true;
        }
        if (this.f6966x) {
            long j8 = this.f6915C;
            if (j8 != -1) {
                l7.f1788a = j8;
                this.f6915C = -1L;
                return true;
            }
        }
        return false;
    }

    public final void E(InterfaceC0373s interfaceC0373s, int i7) {
        if (this.f6951i.g() >= i7) {
            return;
        }
        if (this.f6951i.b() < i7) {
            z zVar = this.f6951i;
            zVar.c(Math.max(zVar.b() * 2, i7));
        }
        interfaceC0373s.readFully(this.f6951i.e(), this.f6951i.g(), i7 - this.f6951i.g());
        this.f6951i.S(i7);
    }

    public final void F() {
        this.f6933U = 0;
        this.f6934V = 0;
        this.f6935W = 0;
        this.f6936X = false;
        this.f6937Y = false;
        this.f6938Z = false;
        this.f6940a0 = 0;
        this.f6942b0 = (byte) 0;
        this.f6944c0 = false;
        this.f6954l.P(0);
    }

    public final long G(long j7) {
        long j8 = this.f6962t;
        if (j8 != -9223372036854775807L) {
            return M.W0(j7, j8, 1000L);
        }
        throw C1162A.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void I(int i7, long j7, long j8) {
        m();
        if (i7 == 160) {
            this.f6931S = false;
            this.f6932T = 0L;
            return;
        }
        if (i7 == 174) {
            this.f6965w = new c();
            return;
        }
        if (i7 == 187) {
            this.f6919G = false;
            return;
        }
        if (i7 == 19899) {
            this.f6967y = -1;
            this.f6968z = -1L;
            return;
        }
        if (i7 == 20533) {
            v(i7).f7003h = true;
            return;
        }
        if (i7 == 21968) {
            v(i7).f7020y = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f6961s;
            if (j9 != -1 && j9 != j7) {
                throw C1162A.a("Multiple Segment elements not supported", null);
            }
            this.f6961s = j7;
            this.f6960r = j8;
            return;
        }
        if (i7 == 475249515) {
            this.f6917E = new p();
            this.f6918F = new p();
        } else if (i7 == 524531317 && !this.f6966x) {
            if (this.f6945d && this.f6914B != -1) {
                this.f6913A = true;
            } else {
                this.f6946d0.e(new M.b(this.f6964v));
                this.f6966x = true;
            }
        }
    }

    public void J(int i7, String str) {
        if (i7 == 134) {
            v(i7).f6997b = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 == 21358) {
                v(i7).f6996a = str;
                return;
            } else {
                if (i7 != 2274716) {
                    return;
                }
                v(i7).f6993X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C1162A.a("DocType " + str + " not supported", null);
    }

    public final int K(InterfaceC0373s interfaceC0373s, c cVar, int i7, boolean z7) {
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f6997b)) {
            L(interfaceC0373s, f6907f0, i7);
        } else if ("S_TEXT/ASS".equals(cVar.f6997b)) {
            L(interfaceC0373s, f6909h0, i7);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f6997b)) {
                T t7 = cVar.f6994Y;
                if (!this.f6936X) {
                    if (cVar.f7003h) {
                        this.f6929Q &= -1073741825;
                        if (!this.f6937Y) {
                            interfaceC0373s.readFully(this.f6951i.e(), 0, 1);
                            this.f6933U++;
                            if ((this.f6951i.e()[0] & 128) == 128) {
                                throw C1162A.a("Extension bit is set in signal byte", null);
                            }
                            this.f6942b0 = this.f6951i.e()[0];
                            this.f6937Y = true;
                        }
                        byte b7 = this.f6942b0;
                        if ((b7 & 1) == 1) {
                            boolean z8 = (b7 & 2) == 2;
                            this.f6929Q |= 1073741824;
                            if (!this.f6944c0) {
                                interfaceC0373s.readFully(this.f6956n.e(), 0, 8);
                                this.f6933U += 8;
                                this.f6944c0 = true;
                                this.f6951i.e()[0] = (byte) ((z8 ? 128 : 0) | 8);
                                this.f6951i.T(0);
                                t7.a(this.f6951i, 1, 1);
                                this.f6934V++;
                                this.f6956n.T(0);
                                t7.a(this.f6956n, 8, 1);
                                this.f6934V += 8;
                            }
                            if (z8) {
                                if (!this.f6938Z) {
                                    interfaceC0373s.readFully(this.f6951i.e(), 0, 1);
                                    this.f6933U++;
                                    this.f6951i.T(0);
                                    this.f6940a0 = this.f6951i.G();
                                    this.f6938Z = true;
                                }
                                int i9 = this.f6940a0 * 4;
                                this.f6951i.P(i9);
                                interfaceC0373s.readFully(this.f6951i.e(), 0, i9);
                                this.f6933U += i9;
                                short s7 = (short) ((this.f6940a0 / 2) + 1);
                                int i10 = (s7 * 6) + 2;
                                ByteBuffer byteBuffer = this.f6959q;
                                if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                    this.f6959q = ByteBuffer.allocate(i10);
                                }
                                this.f6959q.position(0);
                                this.f6959q.putShort(s7);
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    i8 = this.f6940a0;
                                    if (i11 >= i8) {
                                        break;
                                    }
                                    int K6 = this.f6951i.K();
                                    if (i11 % 2 == 0) {
                                        this.f6959q.putShort((short) (K6 - i12));
                                    } else {
                                        this.f6959q.putInt(K6 - i12);
                                    }
                                    i11++;
                                    i12 = K6;
                                }
                                int i13 = (i7 - this.f6933U) - i12;
                                int i14 = i8 % 2;
                                ByteBuffer byteBuffer2 = this.f6959q;
                                if (i14 == 1) {
                                    byteBuffer2.putInt(i13);
                                } else {
                                    byteBuffer2.putShort((short) i13);
                                    this.f6959q.putInt(0);
                                }
                                this.f6957o.R(this.f6959q.array(), i10);
                                t7.a(this.f6957o, i10, 1);
                                this.f6934V += i10;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f7004i;
                        if (bArr != null) {
                            this.f6954l.R(bArr, bArr.length);
                        }
                    }
                    if (cVar.o(z7)) {
                        this.f6929Q |= 268435456;
                        this.f6958p.P(0);
                        int g7 = (this.f6954l.g() + i7) - this.f6933U;
                        this.f6951i.P(4);
                        this.f6951i.e()[0] = (byte) ((g7 >> 24) & 255);
                        this.f6951i.e()[1] = (byte) ((g7 >> 16) & 255);
                        this.f6951i.e()[2] = (byte) ((g7 >> 8) & 255);
                        this.f6951i.e()[3] = (byte) (g7 & 255);
                        t7.a(this.f6951i, 4, 2);
                        this.f6934V += 4;
                    }
                    this.f6936X = true;
                }
                int g8 = i7 + this.f6954l.g();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f6997b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f6997b)) {
                    if (cVar.f6990U != null) {
                        AbstractC1297a.f(this.f6954l.g() == 0);
                        cVar.f6990U.d(interfaceC0373s);
                    }
                    while (true) {
                        int i15 = this.f6933U;
                        if (i15 >= g8) {
                            break;
                        }
                        int M6 = M(interfaceC0373s, t7, g8 - i15);
                        this.f6933U += M6;
                        this.f6934V += M6;
                    }
                } else {
                    byte[] e7 = this.f6950h.e();
                    e7[0] = 0;
                    e7[1] = 0;
                    e7[2] = 0;
                    int i16 = cVar.f6995Z;
                    int i17 = 4 - i16;
                    while (this.f6933U < g8) {
                        int i18 = this.f6935W;
                        if (i18 == 0) {
                            N(interfaceC0373s, e7, i17, i16);
                            this.f6933U += i16;
                            this.f6950h.T(0);
                            this.f6935W = this.f6950h.K();
                            this.f6949g.T(0);
                            t7.e(this.f6949g, 4);
                            this.f6934V += 4;
                        } else {
                            int M7 = M(interfaceC0373s, t7, i18);
                            this.f6933U += M7;
                            this.f6934V += M7;
                            this.f6935W -= M7;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f6997b)) {
                    this.f6952j.T(0);
                    t7.e(this.f6952j, 4);
                    this.f6934V += 4;
                }
                return s();
            }
            L(interfaceC0373s, f6910i0, i7);
        }
        return s();
    }

    public final void L(InterfaceC0373s interfaceC0373s, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        if (this.f6955m.b() < length) {
            this.f6955m.Q(Arrays.copyOf(bArr, length + i7));
        } else {
            System.arraycopy(bArr, 0, this.f6955m.e(), 0, bArr.length);
        }
        interfaceC0373s.readFully(this.f6955m.e(), bArr.length, i7);
        this.f6955m.T(0);
        this.f6955m.S(length);
    }

    public final int M(InterfaceC0373s interfaceC0373s, T t7, int i7) {
        int a7 = this.f6954l.a();
        if (a7 <= 0) {
            return t7.f(interfaceC0373s, i7, false);
        }
        int min = Math.min(i7, a7);
        t7.e(this.f6954l, min);
        return min;
    }

    public final void N(InterfaceC0373s interfaceC0373s, byte[] bArr, int i7, int i8) {
        int min = Math.min(i8, this.f6954l.a());
        interfaceC0373s.readFully(bArr, i7 + min, i8 - min);
        if (min > 0) {
            this.f6954l.l(bArr, i7, min);
        }
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f6916D = -9223372036854775807L;
        this.f6921I = 0;
        this.f6939a.b();
        this.f6941b.e();
        F();
        for (int i7 = 0; i7 < this.f6943c.size(); i7++) {
            ((c) this.f6943c.valueAt(i7)).n();
        }
    }

    @Override // F0.r
    public final void b(InterfaceC0374t interfaceC0374t) {
        this.f6946d0 = interfaceC0374t;
        if (this.f6947e) {
            interfaceC0374t = new v(interfaceC0374t, this.f6948f);
        }
        this.f6946d0 = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public final boolean e(InterfaceC0373s interfaceC0373s) {
        return new f().b(interfaceC0373s);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public final int i(InterfaceC0373s interfaceC0373s, L l7) {
        this.f6920H = false;
        boolean z7 = true;
        while (z7 && !this.f6920H) {
            z7 = this.f6939a.c(interfaceC0373s);
            if (z7 && D(l7, interfaceC0373s.p())) {
                return 1;
            }
        }
        if (z7) {
            return 0;
        }
        for (int i7 = 0; i7 < this.f6943c.size(); i7++) {
            c cVar = (c) this.f6943c.valueAt(i7);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    public final void k(int i7) {
        if (this.f6917E == null || this.f6918F == null) {
            throw C1162A.a("Element " + i7 + " must be in a Cues", null);
        }
    }

    public final void l(int i7) {
        if (this.f6965w != null) {
            return;
        }
        throw C1162A.a("Element " + i7 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0231, code lost:
    
        throw d0.C1162A.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r22, int r23, F0.InterfaceC0373s r24) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.e.n(int, int, F0.s):void");
    }

    public final F0.M o(p pVar, p pVar2) {
        int i7;
        if (this.f6961s == -1 || this.f6964v == -9223372036854775807L || pVar == null || pVar.c() == 0 || pVar2 == null || pVar2.c() != pVar.c()) {
            return new M.b(this.f6964v);
        }
        int c7 = pVar.c();
        int[] iArr = new int[c7];
        long[] jArr = new long[c7];
        long[] jArr2 = new long[c7];
        long[] jArr3 = new long[c7];
        int i8 = 0;
        for (int i9 = 0; i9 < c7; i9++) {
            jArr3[i9] = pVar.b(i9);
            jArr[i9] = this.f6961s + pVar2.b(i9);
        }
        while (true) {
            i7 = c7 - 1;
            if (i8 >= i7) {
                break;
            }
            int i10 = i8 + 1;
            iArr[i8] = (int) (jArr[i10] - jArr[i8]);
            jArr2[i8] = jArr3[i10] - jArr3[i8];
            i8 = i10;
        }
        iArr[i7] = (int) ((this.f6961s + this.f6960r) - jArr[i7]);
        long j7 = this.f6964v - jArr3[i7];
        jArr2[i7] = j7;
        if (j7 <= 0) {
            o.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j7);
            iArr = Arrays.copyOf(iArr, i7);
            jArr = Arrays.copyOf(jArr, i7);
            jArr2 = Arrays.copyOf(jArr2, i7);
            jArr3 = Arrays.copyOf(jArr3, i7);
        }
        return new C0363h(iArr, jArr, jArr2, jArr3);
    }

    public final void p(c cVar, long j7, int i7, int i8, int i9) {
        String str;
        U u7 = cVar.f6990U;
        if (u7 != null) {
            u7.c(cVar.f6994Y, j7, i7, i8, i9, cVar.f7005j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f6997b) || "S_TEXT/ASS".equals(cVar.f6997b) || "S_TEXT/WEBVTT".equals(cVar.f6997b)) {
                if (this.f6925M > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j8 = this.f6923K;
                    if (j8 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        H(cVar.f6997b, j8, this.f6955m.e());
                        int f7 = this.f6955m.f();
                        while (true) {
                            if (f7 >= this.f6955m.g()) {
                                break;
                            }
                            if (this.f6955m.e()[f7] == 0) {
                                this.f6955m.S(f7);
                                break;
                            }
                            f7++;
                        }
                        T t7 = cVar.f6994Y;
                        z zVar = this.f6955m;
                        t7.e(zVar, zVar.g());
                        i8 += this.f6955m.g();
                    }
                }
                o.h("MatroskaExtractor", str);
            }
            if ((268435456 & i7) != 0) {
                if (this.f6925M > 1) {
                    this.f6958p.P(0);
                } else {
                    int g7 = this.f6958p.g();
                    cVar.f6994Y.a(this.f6958p, g7, 2);
                    i8 += g7;
                }
            }
            cVar.f6994Y.b(j7, i7, i8, i9, cVar.f7005j);
        }
        this.f6920H = true;
    }

    public void q(int i7) {
        m();
        if (i7 == 160) {
            if (this.f6921I != 2) {
                return;
            }
            c cVar = (c) this.f6943c.get(this.f6927O);
            cVar.f();
            if (this.f6932T > 0 && "A_OPUS".equals(cVar.f6997b)) {
                this.f6958p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f6932T).array());
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.f6925M; i9++) {
                i8 += this.f6926N[i9];
            }
            int i10 = 0;
            while (i10 < this.f6925M) {
                long j7 = this.f6922J + ((cVar.f7000e * i10) / 1000);
                int i11 = this.f6929Q;
                if (i10 == 0 && !this.f6931S) {
                    i11 |= 1;
                }
                int i12 = this.f6926N[i10];
                int i13 = i8 - i12;
                p(cVar, j7, i11, i12, i13);
                i10++;
                i8 = i13;
            }
            this.f6921I = 0;
            return;
        }
        if (i7 == 174) {
            c cVar2 = (c) AbstractC1297a.h(this.f6965w);
            String str = cVar2.f6997b;
            if (str == null) {
                throw C1162A.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f6946d0, cVar2.f6998c);
                this.f6943c.put(cVar2.f6998c, cVar2);
            }
            this.f6965w = null;
            return;
        }
        if (i7 == 19899) {
            int i14 = this.f6967y;
            if (i14 != -1) {
                long j8 = this.f6968z;
                if (j8 != -1) {
                    if (i14 == 475249515) {
                        this.f6914B = j8;
                        return;
                    }
                    return;
                }
            }
            throw C1162A.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i7 == 25152) {
            l(i7);
            c cVar3 = this.f6965w;
            if (cVar3.f7003h) {
                if (cVar3.f7005j == null) {
                    throw C1162A.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f7007l = new C1190m(new C1190m.b(AbstractC1184g.f12615a, "video/webm", this.f6965w.f7005j.f1806b));
                return;
            }
            return;
        }
        if (i7 == 28032) {
            l(i7);
            c cVar4 = this.f6965w;
            if (cVar4.f7003h && cVar4.f7004i != null) {
                throw C1162A.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i7 == 357149030) {
            if (this.f6962t == -9223372036854775807L) {
                this.f6962t = 1000000L;
            }
            long j9 = this.f6963u;
            if (j9 != -9223372036854775807L) {
                this.f6964v = G(j9);
                return;
            }
            return;
        }
        if (i7 == 374648427) {
            if (this.f6943c.size() == 0) {
                throw C1162A.a("No valid tracks were found", null);
            }
            this.f6946d0.j();
        } else {
            if (i7 != 475249515) {
                return;
            }
            if (!this.f6966x) {
                this.f6946d0.e(o(this.f6917E, this.f6918F));
                this.f6966x = true;
            }
            this.f6917E = null;
            this.f6918F = null;
        }
    }

    public final int s() {
        int i7 = this.f6934V;
        F();
        return i7;
    }

    public void t(int i7, double d7) {
        if (i7 == 181) {
            v(i7).f6987R = (int) d7;
        }
        if (i7 == 17545) {
            this.f6963u = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                v(i7).f6974E = (float) d7;
                break;
            case 21970:
                v(i7).f6975F = (float) d7;
                break;
            case 21971:
                v(i7).f6976G = (float) d7;
                break;
            case 21972:
                v(i7).f6977H = (float) d7;
                break;
            case 21973:
                v(i7).f6978I = (float) d7;
                break;
            case 21974:
                v(i7).f6979J = (float) d7;
                break;
            case 21975:
                v(i7).f6980K = (float) d7;
                break;
            case 21976:
                v(i7).f6981L = (float) d7;
                break;
            case 21977:
                v(i7).f6982M = (float) d7;
                break;
            case 21978:
                v(i7).f6983N = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        v(i7).f7015t = (float) d7;
                        break;
                    case 30324:
                        v(i7).f7016u = (float) d7;
                        break;
                    case 30325:
                        v(i7).f7017v = (float) d7;
                        break;
                }
        }
    }

    public c v(int i7) {
        l(i7);
        return this.f6965w;
    }

    public int w(int i7) {
        switch (i7) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void x(c cVar, InterfaceC0373s interfaceC0373s, int i7) {
        if (cVar.f7002g != 1685485123 && cVar.f7002g != 1685480259) {
            interfaceC0373s.i(i7);
            return;
        }
        byte[] bArr = new byte[i7];
        cVar.f6984O = bArr;
        interfaceC0373s.readFully(bArr, 0, i7);
    }

    public void y(c cVar, int i7, InterfaceC0373s interfaceC0373s, int i8) {
        if (i7 != 4 || !"V_VP9".equals(cVar.f6997b)) {
            interfaceC0373s.i(i8);
        } else {
            this.f6958p.P(i8);
            interfaceC0373s.readFully(this.f6958p.e(), 0, i8);
        }
    }

    public void z(int i7, long j7) {
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw C1162A.a("ContentEncodingOrder " + j7 + " not supported", null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw C1162A.a("ContentEncodingScope " + j7 + " not supported", null);
        }
        switch (i7) {
            case 131:
                v(i7).f6999d = (int) j7;
                return;
            case 136:
                v(i7).f6992W = j7 == 1;
                return;
            case 155:
                this.f6923K = G(j7);
                return;
            case 159:
                v(i7).f6985P = (int) j7;
                return;
            case 176:
                v(i7).f7008m = (int) j7;
                return;
            case 179:
                k(i7);
                this.f6917E.a(G(j7));
                return;
            case 186:
                v(i7).f7009n = (int) j7;
                return;
            case 215:
                v(i7).f6998c = (int) j7;
                return;
            case 231:
                this.f6916D = G(j7);
                return;
            case 238:
                this.f6930R = (int) j7;
                return;
            case 241:
                if (this.f6919G) {
                    return;
                }
                k(i7);
                this.f6918F.a(j7);
                this.f6919G = true;
                return;
            case 251:
                this.f6931S = true;
                return;
            case 16871:
                v(i7).f7002g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw C1162A.a("ContentCompAlgo " + j7 + " not supported", null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw C1162A.a("DocTypeReadVersion " + j7 + " not supported", null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw C1162A.a("EBMLReadVersion " + j7 + " not supported", null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw C1162A.a("ContentEncAlgo " + j7 + " not supported", null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw C1162A.a("AESSettingsCipherMode " + j7 + " not supported", null);
            case 21420:
                this.f6968z = j7 + this.f6961s;
                return;
            case 21432:
                int i8 = (int) j7;
                l(i7);
                if (i8 == 0) {
                    this.f6965w.f7019x = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f6965w.f7019x = 2;
                    return;
                } else if (i8 == 3) {
                    this.f6965w.f7019x = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.f6965w.f7019x = 3;
                    return;
                }
            case 21680:
                v(i7).f7011p = (int) j7;
                return;
            case 21682:
                v(i7).f7013r = (int) j7;
                return;
            case 21690:
                v(i7).f7012q = (int) j7;
                return;
            case 21930:
                v(i7).f6991V = j7 == 1;
                return;
            case 21938:
                l(i7);
                c cVar = this.f6965w;
                cVar.f7020y = true;
                cVar.f7010o = (int) j7;
                return;
            case 21998:
                v(i7).f7001f = (int) j7;
                return;
            case 22186:
                v(i7).f6988S = j7;
                return;
            case 22203:
                v(i7).f6989T = j7;
                return;
            case 25188:
                v(i7).f6986Q = (int) j7;
                return;
            case 30114:
                this.f6932T = j7;
                return;
            case 30321:
                l(i7);
                int i9 = (int) j7;
                if (i9 == 0) {
                    this.f6965w.f7014s = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f6965w.f7014s = 1;
                    return;
                } else if (i9 == 2) {
                    this.f6965w.f7014s = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f6965w.f7014s = 3;
                    return;
                }
            case 2352003:
                v(i7).f7000e = (int) j7;
                return;
            case 2807729:
                this.f6962t = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        l(i7);
                        int i10 = (int) j7;
                        if (i10 == 1) {
                            this.f6965w.f6971B = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f6965w.f6971B = 1;
                            return;
                        }
                    case 21946:
                        l(i7);
                        int k7 = C1185h.k((int) j7);
                        if (k7 != -1) {
                            this.f6965w.f6970A = k7;
                            return;
                        }
                        return;
                    case 21947:
                        l(i7);
                        this.f6965w.f7020y = true;
                        int j8 = C1185h.j((int) j7);
                        if (j8 != -1) {
                            this.f6965w.f7021z = j8;
                            return;
                        }
                        return;
                    case 21948:
                        v(i7).f6972C = (int) j7;
                        return;
                    case 21949:
                        v(i7).f6973D = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    public e(t.a aVar, int i7) {
        this(new X0.a(), i7, aVar);
    }

    @Override // F0.r
    public final void release() {
    }
}
