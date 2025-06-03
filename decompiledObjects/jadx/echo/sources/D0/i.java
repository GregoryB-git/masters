package D0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1109c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1110d;

    /* renamed from: f, reason: collision with root package name */
    public int f1112f;

    /* renamed from: a, reason: collision with root package name */
    public a f1107a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f1108b = new a();

    /* renamed from: e, reason: collision with root package name */
    public long f1111e = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1113a;

        /* renamed from: b, reason: collision with root package name */
        public long f1114b;

        /* renamed from: c, reason: collision with root package name */
        public long f1115c;

        /* renamed from: d, reason: collision with root package name */
        public long f1116d;

        /* renamed from: e, reason: collision with root package name */
        public long f1117e;

        /* renamed from: f, reason: collision with root package name */
        public long f1118f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f1119g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f1120h;

        public static int c(long j7) {
            return (int) (j7 % 15);
        }

        public long a() {
            long j7 = this.f1117e;
            if (j7 == 0) {
                return 0L;
            }
            return this.f1118f / j7;
        }

        public long b() {
            return this.f1118f;
        }

        public boolean d() {
            long j7 = this.f1116d;
            if (j7 == 0) {
                return false;
            }
            return this.f1119g[c(j7 - 1)];
        }

        public boolean e() {
            return this.f1116d > 15 && this.f1120h == 0;
        }

        public void f(long j7) {
            int i7;
            long j8 = this.f1116d;
            if (j8 == 0) {
                this.f1113a = j7;
            } else if (j8 == 1) {
                long j9 = j7 - this.f1113a;
                this.f1114b = j9;
                this.f1118f = j9;
                this.f1117e = 1L;
            } else {
                long j10 = j7 - this.f1115c;
                int c7 = c(j8);
                if (Math.abs(j10 - this.f1114b) <= 1000000) {
                    this.f1117e++;
                    this.f1118f += j10;
                    boolean[] zArr = this.f1119g;
                    if (zArr[c7]) {
                        zArr[c7] = false;
                        i7 = this.f1120h - 1;
                        this.f1120h = i7;
                    }
                } else {
                    boolean[] zArr2 = this.f1119g;
                    if (!zArr2[c7]) {
                        zArr2[c7] = true;
                        i7 = this.f1120h + 1;
                        this.f1120h = i7;
                    }
                }
            }
            this.f1116d++;
            this.f1115c = j7;
        }

        public void g() {
            this.f1116d = 0L;
            this.f1117e = 0L;
            this.f1118f = 0L;
            this.f1120h = 0;
            Arrays.fill(this.f1119g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f1107a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f1107a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f1112f;
    }

    public long d() {
        if (e()) {
            return this.f1107a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f1107a.e();
    }

    public void f(long j7) {
        this.f1107a.f(j7);
        if (this.f1107a.e() && !this.f1110d) {
            this.f1109c = false;
        } else if (this.f1111e != -9223372036854775807L) {
            if (!this.f1109c || this.f1108b.d()) {
                this.f1108b.g();
                this.f1108b.f(this.f1111e);
            }
            this.f1109c = true;
            this.f1108b.f(j7);
        }
        if (this.f1109c && this.f1108b.e()) {
            a aVar = this.f1107a;
            this.f1107a = this.f1108b;
            this.f1108b = aVar;
            this.f1109c = false;
            this.f1110d = false;
        }
        this.f1111e = j7;
        this.f1112f = this.f1107a.e() ? 0 : this.f1112f + 1;
    }

    public void g() {
        this.f1107a.g();
        this.f1108b.g();
        this.f1109c = false;
        this.f1111e = -9223372036854775807L;
        this.f1112f = 0;
    }
}
