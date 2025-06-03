package s0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s0.v;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static volatile n f14050b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f14051c;

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, v.e<?, ?>> f14052a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14053a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14054b;

        public a(Object obj, int i10) {
            this.f14053a = obj;
            this.f14054b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14053a == aVar.f14053a && this.f14054b == aVar.f14054b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14053a) * 65535) + this.f14054b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f14051c = new n(0);
    }

    public n() {
        this.f14052a = new HashMap();
    }

    public n(int i10) {
        this.f14052a = Collections.emptyMap();
    }

    public static n a() {
        n nVar = f14050b;
        if (nVar == null) {
            synchronized (n.class) {
                nVar = f14050b;
                if (nVar == null) {
                    Class<?> cls = m.f14048a;
                    if (cls != null) {
                        try {
                            nVar = (n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f14050b = nVar;
                    }
                    nVar = f14051c;
                    f14050b = nVar;
                }
            }
        }
        return nVar;
    }
}
