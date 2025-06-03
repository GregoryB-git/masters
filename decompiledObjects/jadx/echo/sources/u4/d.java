package u4;

import u4.C2010a;
import u4.C2012c;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static d f19793a = a().a();

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j7);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C2012c.a aVar);

        public abstract a h(long j7);
    }

    public static a a() {
        return new C2010a.b().h(0L).g(C2012c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C2012c.a g();

    public abstract long h();

    public boolean i() {
        return g() == C2012c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C2012c.a.NOT_GENERATED || g() == C2012c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C2012c.a.REGISTERED;
    }

    public boolean l() {
        return g() == C2012c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C2012c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public d o(String str, long j7, long j8) {
        return n().b(str).c(j7).h(j8).a();
    }

    public d p() {
        return n().b(null).a();
    }

    public d q(String str) {
        return n().e(str).g(C2012c.a.REGISTER_ERROR).a();
    }

    public d r() {
        return n().g(C2012c.a.NOT_GENERATED).a();
    }

    public d s(String str, String str2, long j7, String str3, long j8) {
        return n().d(str).g(C2012c.a.REGISTERED).b(str3).f(str2).c(j8).h(j7).a();
    }

    public d t(String str) {
        return n().d(str).g(C2012c.a.UNREGISTERED).a();
    }
}
