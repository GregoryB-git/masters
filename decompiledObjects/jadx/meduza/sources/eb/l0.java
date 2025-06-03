package eb;

import eb.k0;
import eb.u0;
import java.util.Map;
import n7.g;

/* loaded from: classes.dex */
public abstract class l0 extends k0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.b f5171a = new u0.b(new a());

    public static final class a {
        public final String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public u0.b e(Map<String, ?> map) {
        return f5171a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(b(), "policy");
        b10.d(String.valueOf(c()), "priority");
        b10.c("available", d());
        return b10.toString();
    }
}
