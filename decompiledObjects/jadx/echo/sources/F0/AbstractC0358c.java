package F0;

import d0.C1190m;
import d0.C1194q;
import java.nio.ByteBuffer;

/* renamed from: F0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0358c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1855a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: F0.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1856a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1857b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1858c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1859d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1860e;

        public b(int i7, int i8, int i9, int i10, int i11) {
            this.f1856a = i7;
            this.f1858c = i8;
            this.f1857b = i9;
            this.f1859d = i10;
            this.f1860e = i11;
        }
    }

    public static void a(int i7, g0.z zVar) {
        zVar.P(7);
        byte[] e7 = zVar.e();
        e7[0] = -84;
        e7[1] = 64;
        e7[2] = -1;
        e7[3] = -1;
        e7[4] = (byte) ((i7 >> 16) & 255);
        e7[5] = (byte) ((i7 >> 8) & 255);
        e7[6] = (byte) (i7 & 255);
    }

    public static C1194q b(g0.z zVar, String str, String str2, C1190m c1190m) {
        zVar.U(1);
        return new C1194q.b().a0(str).o0("audio/ac4").N(2).p0(((zVar.G() & 32) >> 5) == 1 ? 48000 : 44100).U(c1190m).e0(str2).K();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new g0.y(bArr)).f1860e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r11 != 8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F0.AbstractC0358c.b d(g0.y r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.h(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = F0.AbstractC0358c.f1855a
            r11 = r0[r11]
            goto L91
        L63:
            if (r9 != r7) goto L90
            int[] r4 = F0.AbstractC0358c.f1855a
            int r6 = r4.length
            if (r11 >= r6) goto L90
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8b
            r7 = 11
            if (r1 == r0) goto L86
            if (r1 == r2) goto L8b
            if (r1 == r3) goto L7c
            goto L84
        L7c:
            if (r11 == r2) goto L82
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
        L82:
            int r4 = r4 + 1
        L84:
            r11 = r4
            goto L91
        L86:
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
            goto L82
        L8b:
            if (r11 == r2) goto L82
            if (r11 != r6) goto L84
            goto L82
        L90:
            r11 = 0
        L91:
            F0.c$b r0 = new F0.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0358c.d(g0.y):F0.c$b");
    }

    public static int e(byte[] bArr, int i7) {
        int i8 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i9 == 65535) {
            i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i8 = 4;
        }
        if (i7 == 44097) {
            i8 += 2;
        }
        return i9 + i8;
    }

    public static int f(g0.y yVar, int i7) {
        int i8 = 0;
        while (true) {
            int h7 = i8 + yVar.h(i7);
            if (!yVar.g()) {
                return h7;
            }
            i8 = (h7 + 1) << i7;
        }
    }
}
