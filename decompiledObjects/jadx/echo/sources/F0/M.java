package F0;

import g0.AbstractC1297a;

/* loaded from: classes.dex */
public interface M {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final N f1789a;

        /* renamed from: b, reason: collision with root package name */
        public final N f1790b;

        public a(N n7) {
            this(n7, n7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1789a.equals(aVar.f1789a) && this.f1790b.equals(aVar.f1790b);
        }

        public int hashCode() {
            return (this.f1789a.hashCode() * 31) + this.f1790b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f1789a);
            if (this.f1789a.equals(this.f1790b)) {
                str = "";
            } else {
                str = ", " + this.f1790b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(N n7, N n8) {
            this.f1789a = (N) AbstractC1297a.e(n7);
            this.f1790b = (N) AbstractC1297a.e(n8);
        }
    }

    public static class b implements M {

        /* renamed from: a, reason: collision with root package name */
        public final long f1791a;

        /* renamed from: b, reason: collision with root package name */
        public final a f1792b;

        public b(long j7) {
            this(j7, 0L);
        }

        @Override // F0.M
        public boolean h() {
            return false;
        }

        @Override // F0.M
        public a j(long j7) {
            return this.f1792b;
        }

        @Override // F0.M
        public long l() {
            return this.f1791a;
        }

        public b(long j7, long j8) {
            this.f1791a = j7;
            this.f1792b = new a(j8 == 0 ? N.f1793c : new N(0L, j8));
        }
    }

    boolean h();

    a j(long j7);

    long l();
}
