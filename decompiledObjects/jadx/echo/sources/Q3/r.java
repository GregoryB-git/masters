package Q3;

/* loaded from: classes.dex */
public abstract class r {

    public interface b {
        c a(m mVar);

        void b(Q3.c cVar, boolean z7, Q3.b bVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4408a;

        /* renamed from: b, reason: collision with root package name */
        public d4.n f4409b;

        public c(boolean z7, d4.n nVar) {
            this.f4408a = z7;
            this.f4409b = nVar;
        }

        public d4.n a() {
            return this.f4409b;
        }

        public boolean b() {
            return this.f4408a;
        }
    }

    public static c a() {
        return new c(false, null);
    }

    public static c b(m mVar) {
        return new c(true, mVar.b());
    }
}
