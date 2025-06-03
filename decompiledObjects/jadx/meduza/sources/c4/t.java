package c4;

/* loaded from: classes.dex */
public interface t {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final u f2314a;

        /* renamed from: b, reason: collision with root package name */
        public final u f2315b;

        public a() {
            throw null;
        }

        public a(u uVar, u uVar2) {
            this.f2314a = uVar;
            this.f2315b = uVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2314a.equals(aVar.f2314a) && this.f2315b.equals(aVar.f2315b);
        }

        public final int hashCode() {
            return this.f2315b.hashCode() + (this.f2314a.hashCode() * 31);
        }

        public final String toString() {
            String sb2;
            StringBuilder l10 = defpackage.f.l("[");
            l10.append(this.f2314a);
            if (this.f2314a.equals(this.f2315b)) {
                sb2 = "";
            } else {
                StringBuilder l11 = defpackage.f.l(", ");
                l11.append(this.f2315b);
                sb2 = l11.toString();
            }
            return defpackage.g.f(l10, sb2, "]");
        }
    }

    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final long f2316a;

        /* renamed from: b, reason: collision with root package name */
        public final a f2317b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f2316a = j10;
            u uVar = j11 == 0 ? u.f2318c : new u(0L, j11);
            this.f2317b = new a(uVar, uVar);
        }

        @Override // c4.t
        public final boolean e() {
            return false;
        }

        @Override // c4.t
        public final a g(long j10) {
            return this.f2317b;
        }

        @Override // c4.t
        public final long h() {
            return this.f2316a;
        }
    }

    boolean e();

    a g(long j10);

    long h();
}
