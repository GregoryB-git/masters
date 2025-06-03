package w5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public boolean f16335c;

    /* renamed from: e, reason: collision with root package name */
    public int f16337e;

    /* renamed from: a, reason: collision with root package name */
    public a f16333a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f16334b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f16336d = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f16338a;

        /* renamed from: b, reason: collision with root package name */
        public long f16339b;

        /* renamed from: c, reason: collision with root package name */
        public long f16340c;

        /* renamed from: d, reason: collision with root package name */
        public long f16341d;

        /* renamed from: e, reason: collision with root package name */
        public long f16342e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f16343g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f16344h;

        public final boolean a() {
            return this.f16341d > 15 && this.f16344h == 0;
        }

        public final void b(long j10) {
            int i10;
            long j11 = this.f16341d;
            if (j11 == 0) {
                this.f16338a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f16338a;
                this.f16339b = j12;
                this.f = j12;
                this.f16342e = 1L;
            } else {
                long j13 = j10 - this.f16340c;
                int i11 = (int) (j11 % 15);
                if (Math.abs(j13 - this.f16339b) <= 1000000) {
                    this.f16342e++;
                    this.f += j13;
                    boolean[] zArr = this.f16343g;
                    if (zArr[i11]) {
                        zArr[i11] = false;
                        i10 = this.f16344h - 1;
                        this.f16344h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f16343g;
                    if (!zArr2[i11]) {
                        zArr2[i11] = true;
                        i10 = this.f16344h + 1;
                        this.f16344h = i10;
                    }
                }
            }
            this.f16341d++;
            this.f16340c = j10;
        }

        public final void c() {
            this.f16341d = 0L;
            this.f16342e = 0L;
            this.f = 0L;
            this.f16344h = 0;
            Arrays.fill(this.f16343g, false);
        }
    }

    public final boolean a() {
        return this.f16333a.a();
    }
}
