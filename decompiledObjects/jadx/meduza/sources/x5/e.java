package x5;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f17131a;

    /* renamed from: b, reason: collision with root package name */
    public final a f17132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17133c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17134d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b[] f17135a;

        public a(b... bVarArr) {
            this.f17135a = bVarArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17136a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17137b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f17138c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f17139d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f17136a = i10;
            x6.b.q(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f17138c = fArr;
            this.f17139d = fArr2;
            this.f17137b = i11;
        }
    }

    public e() {
        throw null;
    }

    public e(a aVar, a aVar2, int i10) {
        this.f17131a = aVar;
        this.f17132b = aVar2;
        this.f17133c = i10;
        this.f17134d = aVar == aVar2;
    }
}
