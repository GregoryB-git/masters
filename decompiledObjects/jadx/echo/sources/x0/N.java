package x0;

import B0.b;
import F0.T;
import d0.InterfaceC1186i;
import g0.AbstractC1297a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import x0.P;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public final B0.b f20616a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20617b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f20618c;

    /* renamed from: d, reason: collision with root package name */
    public a f20619d;

    /* renamed from: e, reason: collision with root package name */
    public a f20620e;

    /* renamed from: f, reason: collision with root package name */
    public a f20621f;

    /* renamed from: g, reason: collision with root package name */
    public long f20622g;

    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f20623a;

        /* renamed from: b, reason: collision with root package name */
        public long f20624b;

        /* renamed from: c, reason: collision with root package name */
        public B0.a f20625c;

        /* renamed from: d, reason: collision with root package name */
        public a f20626d;

        public a(long j7, int i7) {
            d(j7, i7);
        }

        @Override // B0.b.a
        public B0.a a() {
            return (B0.a) AbstractC1297a.e(this.f20625c);
        }

        public a b() {
            this.f20625c = null;
            a aVar = this.f20626d;
            this.f20626d = null;
            return aVar;
        }

        public void c(B0.a aVar, a aVar2) {
            this.f20625c = aVar;
            this.f20626d = aVar2;
        }

        public void d(long j7, int i7) {
            AbstractC1297a.f(this.f20625c == null);
            this.f20623a = j7;
            this.f20624b = j7 + i7;
        }

        public int e(long j7) {
            return ((int) (j7 - this.f20623a)) + this.f20625c.f575b;
        }

        @Override // B0.b.a
        public b.a next() {
            a aVar = this.f20626d;
            if (aVar == null || aVar.f20625c == null) {
                return null;
            }
            return aVar;
        }
    }

    public N(B0.b bVar) {
        this.f20616a = bVar;
        int e7 = bVar.e();
        this.f20617b = e7;
        this.f20618c = new g0.z(32);
        a aVar = new a(0L, e7);
        this.f20619d = aVar;
        this.f20620e = aVar;
        this.f20621f = aVar;
    }

    public static a d(a aVar, long j7) {
        while (j7 >= aVar.f20624b) {
            aVar = aVar.f20626d;
        }
        return aVar;
    }

    public static a i(a aVar, long j7, ByteBuffer byteBuffer, int i7) {
        a d7 = d(aVar, j7);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (d7.f20624b - j7));
            byteBuffer.put(d7.f20625c.f574a, d7.e(j7), min);
            i7 -= min;
            j7 += min;
            if (j7 == d7.f20624b) {
                d7 = d7.f20626d;
            }
        }
        return d7;
    }

    public static a j(a aVar, long j7, byte[] bArr, int i7) {
        a d7 = d(aVar, j7);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (d7.f20624b - j7));
            System.arraycopy(d7.f20625c.f574a, d7.e(j7), bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == d7.f20624b) {
                d7 = d7.f20626d;
            }
        }
        return d7;
    }

    public static a k(a aVar, j0.i iVar, P.b bVar, g0.z zVar) {
        long j7 = bVar.f20661b;
        int i7 = 1;
        zVar.P(1);
        a j8 = j(aVar, j7, zVar.e(), 1);
        long j9 = j7 + 1;
        byte b7 = zVar.e()[0];
        boolean z7 = (b7 & 128) != 0;
        int i8 = b7 & Byte.MAX_VALUE;
        j0.c cVar = iVar.f15399q;
        byte[] bArr = cVar.f15386a;
        if (bArr == null) {
            cVar.f15386a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j10 = j(j8, j9, cVar.f15386a, i8);
        long j11 = j9 + i8;
        if (z7) {
            zVar.P(2);
            j10 = j(j10, j11, zVar.e(), 2);
            j11 += 2;
            i7 = zVar.M();
        }
        int i9 = i7;
        int[] iArr = cVar.f15389d;
        if (iArr == null || iArr.length < i9) {
            iArr = new int[i9];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f15390e;
        if (iArr3 == null || iArr3.length < i9) {
            iArr3 = new int[i9];
        }
        int[] iArr4 = iArr3;
        if (z7) {
            int i10 = i9 * 6;
            zVar.P(i10);
            j10 = j(j10, j11, zVar.e(), i10);
            j11 += i10;
            zVar.T(0);
            for (int i11 = 0; i11 < i9; i11++) {
                iArr2[i11] = zVar.M();
                iArr4[i11] = zVar.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f20660a - ((int) (j11 - bVar.f20661b));
        }
        T.a aVar2 = (T.a) g0.M.i(bVar.f20662c);
        cVar.c(i9, iArr2, iArr4, aVar2.f1806b, cVar.f15386a, aVar2.f1805a, aVar2.f1807c, aVar2.f1808d);
        long j12 = bVar.f20661b;
        int i12 = (int) (j11 - j12);
        bVar.f20661b = j12 + i12;
        bVar.f20660a -= i12;
        return j10;
    }

    public static a l(a aVar, j0.i iVar, P.b bVar, g0.z zVar) {
        long j7;
        ByteBuffer byteBuffer;
        if (iVar.D()) {
            aVar = k(aVar, iVar, bVar, zVar);
        }
        if (iVar.o()) {
            zVar.P(4);
            a j8 = j(aVar, bVar.f20661b, zVar.e(), 4);
            int K6 = zVar.K();
            bVar.f20661b += 4;
            bVar.f20660a -= 4;
            iVar.z(K6);
            aVar = i(j8, bVar.f20661b, iVar.f15400r, K6);
            bVar.f20661b += K6;
            int i7 = bVar.f20660a - K6;
            bVar.f20660a = i7;
            iVar.G(i7);
            j7 = bVar.f20661b;
            byteBuffer = iVar.f15403u;
        } else {
            iVar.z(bVar.f20660a);
            j7 = bVar.f20661b;
            byteBuffer = iVar.f15400r;
        }
        return i(aVar, j7, byteBuffer, bVar.f20660a);
    }

    public final void a(a aVar) {
        if (aVar.f20625c == null) {
            return;
        }
        this.f20616a.b(aVar);
        aVar.b();
    }

    public void b(long j7) {
        a aVar;
        if (j7 == -1) {
            return;
        }
        while (true) {
            aVar = this.f20619d;
            if (j7 < aVar.f20624b) {
                break;
            }
            this.f20616a.c(aVar.f20625c);
            this.f20619d = this.f20619d.b();
        }
        if (this.f20620e.f20623a < aVar.f20623a) {
            this.f20620e = aVar;
        }
    }

    public void c(long j7) {
        AbstractC1297a.a(j7 <= this.f20622g);
        this.f20622g = j7;
        if (j7 != 0) {
            a aVar = this.f20619d;
            if (j7 != aVar.f20623a) {
                while (this.f20622g > aVar.f20624b) {
                    aVar = aVar.f20626d;
                }
                a aVar2 = (a) AbstractC1297a.e(aVar.f20626d);
                a(aVar2);
                a aVar3 = new a(aVar.f20624b, this.f20617b);
                aVar.f20626d = aVar3;
                if (this.f20622g == aVar.f20624b) {
                    aVar = aVar3;
                }
                this.f20621f = aVar;
                if (this.f20620e == aVar2) {
                    this.f20620e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f20619d);
        a aVar4 = new a(this.f20622g, this.f20617b);
        this.f20619d = aVar4;
        this.f20620e = aVar4;
        this.f20621f = aVar4;
    }

    public long e() {
        return this.f20622g;
    }

    public void f(j0.i iVar, P.b bVar) {
        l(this.f20620e, iVar, bVar, this.f20618c);
    }

    public final void g(int i7) {
        long j7 = this.f20622g + i7;
        this.f20622g = j7;
        a aVar = this.f20621f;
        if (j7 == aVar.f20624b) {
            this.f20621f = aVar.f20626d;
        }
    }

    public final int h(int i7) {
        a aVar = this.f20621f;
        if (aVar.f20625c == null) {
            aVar.c(this.f20616a.d(), new a(this.f20621f.f20624b, this.f20617b));
        }
        return Math.min(i7, (int) (this.f20621f.f20624b - this.f20622g));
    }

    public void m(j0.i iVar, P.b bVar) {
        this.f20620e = l(this.f20620e, iVar, bVar, this.f20618c);
    }

    public void n() {
        a(this.f20619d);
        this.f20619d.d(0L, this.f20617b);
        a aVar = this.f20619d;
        this.f20620e = aVar;
        this.f20621f = aVar;
        this.f20622g = 0L;
        this.f20616a.a();
    }

    public void o() {
        this.f20620e = this.f20619d;
    }

    public int p(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
        int h7 = h(i7);
        a aVar = this.f20621f;
        int read = interfaceC1186i.read(aVar.f20625c.f574a, aVar.e(this.f20622g), h7);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(g0.z zVar, int i7) {
        while (i7 > 0) {
            int h7 = h(i7);
            a aVar = this.f20621f;
            zVar.l(aVar.f20625c.f574a, aVar.e(this.f20622g), h7);
            i7 -= h7;
            g(h7);
        }
    }
}
