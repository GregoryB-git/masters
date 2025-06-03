package u4;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o7.l0;
import o7.t;
import v5.e0;
import v5.t;
import v5.u;
import w3.v;

/* loaded from: classes.dex */
public final class g extends e9.a {

    /* renamed from: c, reason: collision with root package name */
    public static final v f14958c = new v(9);

    /* renamed from: b, reason: collision with root package name */
    public final a f14959b;

    public interface a {
        boolean d(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14960a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14961b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14962c;

        public b(int i10, int i11, boolean z10) {
            this.f14960a = i10;
            this.f14961b = z10;
            this.f14962c = i11;
        }
    }

    public g(a aVar) {
        this.f14959b = aVar;
    }

    public static u4.a D(int i10, int i11, u uVar) {
        int Q;
        String d10;
        int v10 = uVar.v();
        Charset N = N(v10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        uVar.d(bArr, 0, i12);
        if (i11 == 2) {
            StringBuilder l10 = defpackage.f.l("image/");
            l10.append(x6.b.x0(new String(bArr, 0, 3, n7.d.f11283b)));
            String sb2 = l10.toString();
            if ("image/jpg".equals(sb2)) {
                sb2 = "image/jpeg";
            }
            d10 = sb2;
            Q = 2;
        } else {
            Q = Q(bArr, 0);
            String x02 = x6.b.x0(new String(bArr, 0, Q, n7.d.f11283b));
            d10 = x02.indexOf(47) == -1 ? defpackage.g.d("image/", x02) : x02;
        }
        int i13 = bArr[Q + 1] & 255;
        int i14 = Q + 2;
        int P = P(bArr, i14, v10);
        String str = new String(bArr, i14, P - i14, N);
        int M = M(v10) + P;
        return new u4.a(i13, d10, str, i12 <= M ? e0.f : Arrays.copyOfRange(bArr, M, i12));
    }

    public static c E(u uVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = uVar.f15975b;
        int Q = Q(uVar.f15974a, i13);
        String str = new String(uVar.f15974a, i13, Q - i13, n7.d.f11283b);
        uVar.G(Q + 1);
        int f = uVar.f();
        int f10 = uVar.f();
        long w10 = uVar.w();
        long j10 = w10 == KeyboardMap.kValueMask ? -1L : w10;
        long w11 = uVar.w();
        long j11 = w11 == KeyboardMap.kValueMask ? -1L : w11;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (uVar.f15975b < i14) {
            h H = H(i11, uVar, z10, i12, aVar);
            if (H != null) {
                arrayList.add(H);
            }
        }
        return new c(str, f, f10, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    public static d F(u uVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = uVar.f15975b;
        int Q = Q(uVar.f15974a, i13);
        String str = new String(uVar.f15974a, i13, Q - i13, n7.d.f11283b);
        uVar.G(Q + 1);
        int v10 = uVar.v();
        boolean z11 = (v10 & 2) != 0;
        boolean z12 = (v10 & 1) != 0;
        int v11 = uVar.v();
        String[] strArr = new String[v11];
        for (int i14 = 0; i14 < v11; i14++) {
            int i15 = uVar.f15975b;
            int Q2 = Q(uVar.f15974a, i15);
            strArr[i14] = new String(uVar.f15974a, i15, Q2 - i15, n7.d.f11283b);
            uVar.G(Q2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (uVar.f15975b < i16) {
            h H = H(i11, uVar, z10, i12, aVar);
            if (H != null) {
                arrayList.add(H);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e G(int i10, u uVar) {
        if (i10 < 4) {
            return null;
        }
        int v10 = uVar.v();
        Charset N = N(v10);
        byte[] bArr = new byte[3];
        uVar.d(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        uVar.d(bArr2, 0, i11);
        int P = P(bArr2, 0, v10);
        String str2 = new String(bArr2, 0, P, N);
        int M = M(v10) + P;
        return new e(str, str2, K(bArr2, M, P(bArr2, M, v10), N));
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x021b, code lost:
    
        if (r13 == 67) goto L143;
     */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, u4.h] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u4.h H(int r19, v5.u r20, boolean r21, int r22, u4.g.a r23) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.g.H(int, v5.u, boolean, int, u4.g$a):u4.h");
    }

    public static f I(int i10, u uVar) {
        int v10 = uVar.v();
        Charset N = N(v10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.d(bArr, 0, i11);
        int Q = Q(bArr, 0);
        String str = new String(bArr, 0, Q, n7.d.f11283b);
        int i12 = Q + 1;
        int P = P(bArr, i12, v10);
        String K = K(bArr, i12, P, N);
        int M = M(v10) + P;
        int P2 = P(bArr, M, v10);
        String K2 = K(bArr, M, P2, N);
        int M2 = M(v10) + P2;
        return new f(str, K, K2, i11 <= M2 ? e0.f : Arrays.copyOfRange(bArr, M2, i11));
    }

    public static j J(int i10, u uVar) {
        int A = uVar.A();
        int x10 = uVar.x();
        int x11 = uVar.x();
        int v10 = uVar.v();
        int v11 = uVar.v();
        t tVar = new t();
        tVar.j(uVar.f15974a, uVar.f15976c);
        tVar.k(uVar.f15975b * 8);
        int i11 = ((i10 - 10) * 8) / (v10 + v11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g10 = tVar.g(v10);
            int g11 = tVar.g(v11);
            iArr[i12] = g10;
            iArr2[i12] = g11;
        }
        return new j(A, x10, iArr, iArr2, x11);
    }

    public static String K(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static l0 L(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return o7.t.t("");
        }
        t.b bVar = o7.t.f12050b;
        t.a aVar = new t.a();
        while (true) {
            int P = P(bArr, i11, i10);
            if (i11 >= P) {
                break;
            }
            aVar.c(new String(bArr, i11, P - i11, N(i10)));
            i11 = M(i10) + P;
        }
        l0 e10 = aVar.e();
        return e10.isEmpty() ? o7.t.t("") : e10;
    }

    public static int M(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset N(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? n7.d.f11283b : n7.d.f11284c : n7.d.f11285d : n7.d.f;
    }

    public static String O(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int P(byte[] bArr, int i10, int i11) {
        int Q = Q(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return Q;
        }
        while (Q < bArr.length - 1) {
            if ((Q - i10) % 2 == 0 && bArr[Q + 1] == 0) {
                return Q;
            }
            Q = Q(bArr, Q + 1);
        }
        return bArr.length;
    }

    public static int Q(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int R(int i10, u uVar) {
        byte[] bArr = uVar.f15974a;
        int i11 = uVar.f15975b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean S(v5.u r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.g.S(v5.u, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p4.a C(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.g.C(byte[], int):p4.a");
    }

    @Override // e9.a
    public final p4.a i(p4.d dVar, ByteBuffer byteBuffer) {
        return C(byteBuffer.array(), byteBuffer.limit());
    }
}
