package z4;

import android.media.MediaCodec;
import c4.v;
import java.nio.ByteBuffer;
import java.util.Arrays;
import z3.c;
import z4.b0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final t5.b f17561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17562b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.u f17563c;

    /* renamed from: d, reason: collision with root package name */
    public a f17564d;

    /* renamed from: e, reason: collision with root package name */
    public a f17565e;
    public a f;

    /* renamed from: g, reason: collision with root package name */
    public long f17566g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f17567a;

        /* renamed from: b, reason: collision with root package name */
        public long f17568b;

        /* renamed from: c, reason: collision with root package name */
        public t5.a f17569c;

        /* renamed from: d, reason: collision with root package name */
        public a f17570d;

        public a(int i10, long j10) {
            x6.b.H(this.f17569c == null);
            this.f17567a = j10;
            this.f17568b = j10 + i10;
        }
    }

    public a0(t5.b bVar) {
        this.f17561a = bVar;
        int i10 = ((t5.o) bVar).f14557b;
        this.f17562b = i10;
        this.f17563c = new v5.u(32);
        a aVar = new a(i10, 0L);
        this.f17564d = aVar;
        this.f17565e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f17568b) {
            aVar = aVar.f17570d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (aVar.f17568b - j10));
            t5.a aVar2 = aVar.f17569c;
            byteBuffer.put(aVar2.f14445a, ((int) (j10 - aVar.f17567a)) + aVar2.f14446b, min);
            i10 -= min;
            j10 += min;
            if (j10 == aVar.f17568b) {
                aVar = aVar.f17570d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f17568b) {
            aVar = aVar.f17570d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (aVar.f17568b - j10));
            t5.a aVar2 = aVar.f17569c;
            System.arraycopy(aVar2.f14445a, ((int) (j10 - aVar.f17567a)) + aVar2.f14446b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == aVar.f17568b) {
                aVar = aVar.f17570d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, z3.g gVar, b0.a aVar2, v5.u uVar) {
        long j10;
        ByteBuffer byteBuffer;
        if (gVar.m(1073741824)) {
            long j11 = aVar2.f17596b;
            int i10 = 1;
            uVar.D(1);
            a e10 = e(aVar, j11, uVar.f15974a, 1);
            long j12 = j11 + 1;
            byte b10 = uVar.f15974a[0];
            boolean z10 = (b10 & 128) != 0;
            int i11 = b10 & Byte.MAX_VALUE;
            z3.c cVar = gVar.f17531b;
            byte[] bArr = cVar.f17509a;
            if (bArr == null) {
                cVar.f17509a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(e10, j12, cVar.f17509a, i11);
            long j13 = j12 + i11;
            if (z10) {
                uVar.D(2);
                aVar = e(aVar, j13, uVar.f15974a, 2);
                j13 += 2;
                i10 = uVar.A();
            }
            int[] iArr = cVar.f17512d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = cVar.f17513e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                uVar.D(i12);
                aVar = e(aVar, j13, uVar.f15974a, i12);
                j13 += i12;
                uVar.G(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = uVar.A();
                    iArr2[i13] = uVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f17595a - ((int) (j13 - aVar2.f17596b));
            }
            v.a aVar3 = aVar2.f17597c;
            int i14 = v5.e0.f15881a;
            byte[] bArr2 = aVar3.f2322b;
            byte[] bArr3 = cVar.f17509a;
            int i15 = aVar3.f2321a;
            int i16 = aVar3.f2323c;
            int i17 = aVar3.f2324d;
            cVar.f = i10;
            cVar.f17512d = iArr;
            cVar.f17513e = iArr2;
            cVar.f17510b = bArr2;
            cVar.f17509a = bArr3;
            cVar.f17511c = i15;
            cVar.f17514g = i16;
            cVar.f17515h = i17;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f17516i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (v5.e0.f15881a >= 24) {
                c.a aVar4 = cVar.f17517j;
                aVar4.getClass();
                c.a.a(aVar4, i16, i17);
            }
            long j14 = aVar2.f17596b;
            int i18 = (int) (j13 - j14);
            aVar2.f17596b = j14 + i18;
            aVar2.f17595a -= i18;
        }
        if (gVar.m(268435456)) {
            uVar.D(4);
            a e11 = e(aVar, aVar2.f17596b, uVar.f15974a, 4);
            int y10 = uVar.y();
            aVar2.f17596b += 4;
            aVar2.f17595a -= 4;
            gVar.q(y10);
            aVar = d(e11, aVar2.f17596b, gVar.f17532c, y10);
            aVar2.f17596b += y10;
            int i19 = aVar2.f17595a - y10;
            aVar2.f17595a = i19;
            ByteBuffer byteBuffer2 = gVar.f;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i19) {
                gVar.f = ByteBuffer.allocate(i19);
            } else {
                gVar.f.clear();
            }
            j10 = aVar2.f17596b;
            byteBuffer = gVar.f;
        } else {
            gVar.q(aVar2.f17595a);
            j10 = aVar2.f17596b;
            byteBuffer = gVar.f17532c;
        }
        return d(aVar, j10, byteBuffer, aVar2.f17595a);
    }

    public final void a(a aVar) {
        if (aVar.f17569c == null) {
            return;
        }
        t5.o oVar = (t5.o) this.f17561a;
        synchronized (oVar) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                t5.a[] aVarArr = oVar.f;
                int i10 = oVar.f14560e;
                oVar.f14560e = i10 + 1;
                t5.a aVar3 = aVar2.f17569c;
                aVar3.getClass();
                aVarArr[i10] = aVar3;
                oVar.f14559d--;
                aVar2 = aVar2.f17570d;
                if (aVar2 == null || aVar2.f17569c == null) {
                    aVar2 = null;
                }
            }
            oVar.notifyAll();
        }
        aVar.f17569c = null;
        aVar.f17570d = null;
    }

    public final void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f17564d;
            if (j10 < aVar.f17568b) {
                break;
            }
            t5.b bVar = this.f17561a;
            t5.a aVar2 = aVar.f17569c;
            t5.o oVar = (t5.o) bVar;
            synchronized (oVar) {
                t5.a[] aVarArr = oVar.f;
                int i10 = oVar.f14560e;
                oVar.f14560e = i10 + 1;
                aVarArr[i10] = aVar2;
                oVar.f14559d--;
                oVar.notifyAll();
            }
            a aVar3 = this.f17564d;
            aVar3.f17569c = null;
            a aVar4 = aVar3.f17570d;
            aVar3.f17570d = null;
            this.f17564d = aVar4;
        }
        if (this.f17565e.f17567a < aVar.f17567a) {
            this.f17565e = aVar;
        }
    }

    public final int c(int i10) {
        t5.a aVar;
        a aVar2 = this.f;
        if (aVar2.f17569c == null) {
            t5.o oVar = (t5.o) this.f17561a;
            synchronized (oVar) {
                int i11 = oVar.f14559d + 1;
                oVar.f14559d = i11;
                int i12 = oVar.f14560e;
                if (i12 > 0) {
                    t5.a[] aVarArr = oVar.f;
                    int i13 = i12 - 1;
                    oVar.f14560e = i13;
                    aVar = aVarArr[i13];
                    aVar.getClass();
                    oVar.f[oVar.f14560e] = null;
                } else {
                    t5.a aVar3 = new t5.a(new byte[oVar.f14557b], 0);
                    t5.a[] aVarArr2 = oVar.f;
                    if (i11 > aVarArr2.length) {
                        oVar.f = (t5.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                    }
                    aVar = aVar3;
                }
            }
            a aVar4 = new a(this.f17562b, this.f.f17568b);
            aVar2.f17569c = aVar;
            aVar2.f17570d = aVar4;
        }
        return Math.min(i10, (int) (this.f.f17568b - this.f17566g));
    }
}
