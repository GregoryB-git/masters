package c4;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import java.util.Collections;
import p4.a;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2296e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2297g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2298h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2299i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2300j;

    /* renamed from: k, reason: collision with root package name */
    public final a f2301k;

    /* renamed from: l, reason: collision with root package name */
    public final p4.a f2302l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f2303a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f2304b;

        public a(long[] jArr, long[] jArr2) {
            this.f2303a = jArr;
            this.f2304b = jArr2;
        }
    }

    public o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, p4.a aVar2) {
        this.f2292a = i10;
        this.f2293b = i11;
        this.f2294c = i12;
        this.f2295d = i13;
        this.f2296e = i14;
        this.f = d(i14);
        this.f2297g = i15;
        this.f2298h = i16;
        this.f2299i = a(i16);
        this.f2300j = j10;
        this.f2301k = aVar;
        this.f2302l = aVar2;
    }

    public o(byte[] bArr, int i10) {
        v5.t tVar = new v5.t(bArr, bArr.length);
        tVar.k(i10 * 8);
        this.f2292a = tVar.g(16);
        this.f2293b = tVar.g(16);
        this.f2294c = tVar.g(24);
        this.f2295d = tVar.g(24);
        int g10 = tVar.g(20);
        this.f2296e = g10;
        this.f = d(g10);
        this.f2297g = tVar.g(3) + 1;
        int g11 = tVar.g(5) + 1;
        this.f2298h = g11;
        this.f2299i = a(g11);
        int g12 = tVar.g(4);
        int g13 = tVar.g(32);
        int i11 = e0.f15881a;
        this.f2300j = ((g12 & KeyboardMap.kValueMask) << 32) | (g13 & KeyboardMap.kValueMask);
        this.f2301k = null;
        this.f2302l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f2300j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f2296e;
    }

    public final i0 c(byte[] bArr, p4.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f2295d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p4.a aVar2 = this.f2302l;
        if (aVar2 != null) {
            if (aVar != null) {
                a.b[] bVarArr = aVar.f12996a;
                if (bVarArr.length != 0) {
                    long j10 = aVar2.f12997b;
                    a.b[] bVarArr2 = aVar2.f12996a;
                    int i11 = e0.f15881a;
                    Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                    aVar = new p4.a(j10, (a.b[]) copyOf);
                }
            }
            aVar = aVar2;
        }
        i0.a aVar3 = new i0.a();
        aVar3.f15472k = "audio/flac";
        aVar3.f15473l = i10;
        aVar3.f15484x = this.f2297g;
        aVar3.f15485y = this.f2296e;
        aVar3.f15474m = Collections.singletonList(bArr);
        aVar3.f15470i = aVar;
        return new i0(aVar3);
    }
}
