package j0;

import android.media.MediaCodec;
import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15386a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f15387b;

    /* renamed from: c, reason: collision with root package name */
    public int f15388c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f15389d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15390e;

    /* renamed from: f, reason: collision with root package name */
    public int f15391f;

    /* renamed from: g, reason: collision with root package name */
    public int f15392g;

    /* renamed from: h, reason: collision with root package name */
    public int f15393h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f15394i;

    /* renamed from: j, reason: collision with root package name */
    public final b f15395j;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f15396a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f15397b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f15396a = cryptoInfo;
            this.f15397b = d.a(0, 0);
        }

        public final void b(int i7, int i8) {
            this.f15397b.set(i7, i8);
            this.f15396a.setPattern(this.f15397b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15394i = cryptoInfo;
        this.f15395j = M.f14261a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f15394i;
    }

    public void b(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f15389d == null) {
            int[] iArr = new int[1];
            this.f15389d = iArr;
            this.f15394i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f15389d;
        iArr2[0] = iArr2[0] + i7;
    }

    public void c(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8, int i9, int i10) {
        this.f15391f = i7;
        this.f15389d = iArr;
        this.f15390e = iArr2;
        this.f15387b = bArr;
        this.f15386a = bArr2;
        this.f15388c = i8;
        this.f15392g = i9;
        this.f15393h = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f15394i;
        cryptoInfo.numSubSamples = i7;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i8;
        if (M.f14261a >= 24) {
            ((b) AbstractC1297a.e(this.f15395j)).b(i9, i10);
        }
    }
}
