package z3;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import v5.e0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17509a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17510b;

    /* renamed from: c, reason: collision with root package name */
    public int f17511c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f17512d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f17513e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f17514g;

    /* renamed from: h, reason: collision with root package name */
    public int f17515h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f17516i;

    /* renamed from: j, reason: collision with root package name */
    public final a f17517j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f17518a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec$CryptoInfo$Pattern f17519b = new MediaCodec$CryptoInfo$Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f17518a = cryptoInfo;
        }

        public static void a(a aVar, int i10, int i11) {
            aVar.f17519b.set(i10, i11);
            aVar.f17518a.setPattern(aVar.f17519b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17516i = cryptoInfo;
        this.f17517j = e0.f15881a >= 24 ? new a(cryptoInfo) : null;
    }
}
