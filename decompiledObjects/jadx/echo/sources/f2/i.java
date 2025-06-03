package f2;

import f2.C1289b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i {

    public static abstract class a {
        public final a a(String str, int i7) {
            e().put(str, String.valueOf(i7));
            return this;
        }

        public final a b(String str, long j7) {
            e().put(str, String.valueOf(j7));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        public abstract Map e();

        public abstract a f(Map map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j7);

        public abstract a j(String str);

        public abstract a k(long j7);
    }

    public static a a() {
        return new C1289b.C0206b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = (String) c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new C1289b.C0206b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
    }
}
