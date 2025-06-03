package m0;

import m0.N;

/* loaded from: classes.dex */
public class a0 implements N.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f17490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17491c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17492d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17493e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17496h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f17497a = 250000;

        /* renamed from: b, reason: collision with root package name */
        public int f17498b = 750000;

        /* renamed from: c, reason: collision with root package name */
        public int f17499c = 4;

        /* renamed from: d, reason: collision with root package name */
        public int f17500d = 250000;

        /* renamed from: e, reason: collision with root package name */
        public int f17501e = 50000000;

        /* renamed from: f, reason: collision with root package name */
        public int f17502f = 2;

        /* renamed from: g, reason: collision with root package name */
        public int f17503g = 4;

        public a0 h() {
            return new a0(this);
        }
    }

    public a0(a aVar) {
        this.f17490b = aVar.f17497a;
        this.f17491c = aVar.f17498b;
        this.f17492d = aVar.f17499c;
        this.f17493e = aVar.f17500d;
        this.f17494f = aVar.f17501e;
        this.f17495g = aVar.f17502f;
        this.f17496h = aVar.f17503g;
    }

    public static int b(int i7, int i8, int i9) {
        return a3.f.d(((i7 * i8) * i9) / 1000000);
    }

    public static int d(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // m0.N.e
    public int a(int i7, int i8, int i9, int i10, int i11, int i12, double d7) {
        return (((Math.max(i7, (int) (c(i7, i8, i9, i10, i11, i12) * d7)) + i10) - 1) / i10) * i10;
    }

    public int c(int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i9 == 0) {
            return g(i7, i11, i10);
        }
        if (i9 == 1) {
            return e(i8);
        }
        if (i9 == 2) {
            return f(i8, i12);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i7) {
        return a3.f.d((this.f17494f * d(i7)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f17493e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f17495g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f17496h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = Z2.d.b(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = d(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = a3.f.d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a0.f(int, int):int");
    }

    public int g(int i7, int i8, int i9) {
        return g0.M.p(i7 * this.f17492d, b(this.f17490b, i8, i9), b(this.f17491c, i8, i9));
    }
}
