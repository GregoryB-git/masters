package c4;

import c4.t;
import v5.e0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0034a f2241a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2242b;

    /* renamed from: c, reason: collision with root package name */
    public c f2243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2244d;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public static class C0034a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final d f2245a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2246b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2247c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final long f2248d;

        /* renamed from: e, reason: collision with root package name */
        public final long f2249e;
        public final long f;

        /* renamed from: g, reason: collision with root package name */
        public final long f2250g;

        public C0034a(d dVar, long j10, long j11, long j12, long j13, long j14) {
            this.f2245a = dVar;
            this.f2246b = j10;
            this.f2248d = j11;
            this.f2249e = j12;
            this.f = j13;
            this.f2250g = j14;
        }

        @Override // c4.t
        public final boolean e() {
            return true;
        }

        @Override // c4.t
        public final t.a g(long j10) {
            u uVar = new u(j10, c.a(this.f2245a.a(j10), this.f2247c, this.f2248d, this.f2249e, this.f, this.f2250g));
            return new t.a(uVar, uVar);
        }

        @Override // c4.t
        public final long h() {
            return this.f2246b;
        }
    }

    public static final class b implements d {
        @Override // c4.a.d
        public final long a(long j10) {
            return j10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f2251a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2252b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2253c;

        /* renamed from: d, reason: collision with root package name */
        public long f2254d;

        /* renamed from: e, reason: collision with root package name */
        public long f2255e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public long f2256g;

        /* renamed from: h, reason: collision with root package name */
        public long f2257h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f2251a = j10;
            this.f2252b = j11;
            this.f2254d = j12;
            this.f2255e = j13;
            this.f = j14;
            this.f2256g = j15;
            this.f2253c = j16;
            this.f2257h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return e0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
    }

    public interface d {
        long a(long j10);
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f2258d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f2259a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2260b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2261c;

        public e(int i10, long j10, long j11) {
            this.f2259a = i10;
            this.f2260b = j10;
            this.f2261c = j11;
        }

        public static e a(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }
    }

    public interface f {
        void a();

        e b(i iVar, long j10);
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f2242b = fVar;
        this.f2244d = i10;
        this.f2241a = new C0034a(dVar, j10, j11, j12, j13, j14);
    }

    public static int b(i iVar, long j10, s sVar) {
        if (j10 == iVar.getPosition()) {
            return 0;
        }
        sVar.f2313a = j10;
        return 1;
    }

    public final int a(i iVar, s sVar) {
        boolean z10;
        while (true) {
            c cVar = this.f2243c;
            x6.b.K(cVar);
            long j10 = cVar.f;
            long j11 = cVar.f2256g;
            long j12 = cVar.f2257h;
            if (j11 - j10 <= this.f2244d) {
                this.f2243c = null;
                this.f2242b.a();
                return b(iVar, j10, sVar);
            }
            long position = j12 - iVar.getPosition();
            if (position < 0 || position > 262144) {
                z10 = false;
            } else {
                iVar.j((int) position);
                z10 = true;
            }
            if (!z10) {
                return b(iVar, j12, sVar);
            }
            iVar.i();
            e b10 = this.f2242b.b(iVar, cVar.f2252b);
            int i10 = b10.f2259a;
            if (i10 == -3) {
                this.f2243c = null;
                this.f2242b.a();
                return b(iVar, j12, sVar);
            }
            if (i10 == -2) {
                long j13 = b10.f2260b;
                long j14 = b10.f2261c;
                cVar.f2254d = j13;
                cVar.f = j14;
                cVar.f2257h = c.a(cVar.f2252b, j13, cVar.f2255e, j14, cVar.f2256g, cVar.f2253c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = b10.f2261c - iVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        iVar.j((int) position2);
                    }
                    this.f2243c = null;
                    this.f2242b.a();
                    return b(iVar, b10.f2261c, sVar);
                }
                long j15 = b10.f2260b;
                long j16 = b10.f2261c;
                cVar.f2255e = j15;
                cVar.f2256g = j16;
                cVar.f2257h = c.a(cVar.f2252b, cVar.f2254d, j15, cVar.f, j16, cVar.f2253c);
            }
        }
    }

    public final void c(long j10) {
        c cVar = this.f2243c;
        if (cVar == null || cVar.f2251a != j10) {
            long a10 = this.f2241a.f2245a.a(j10);
            C0034a c0034a = this.f2241a;
            this.f2243c = new c(j10, a10, c0034a.f2247c, c0034a.f2248d, c0034a.f2249e, c0034a.f, c0034a.f2250g);
        }
    }
}
