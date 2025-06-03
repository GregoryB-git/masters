package ma;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ma.w;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile o f11058b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f11059c = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, w.e<?, ?>> f11060a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11061a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11062b;

        public a(Object obj, int i10) {
            this.f11061a = obj;
            this.f11062b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11061a == aVar.f11061a && this.f11062b == aVar.f11062b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f11061a) * 65535) + this.f11062b;
        }
    }

    public o() {
        this.f11060a = new HashMap();
    }

    public o(int i10) {
        this.f11060a = Collections.emptyMap();
    }

    public static o a() {
        o oVar = f11058b;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = f11058b;
                if (oVar == null) {
                    Class<?> cls = n.f11057a;
                    o oVar2 = null;
                    if (cls != null) {
                        try {
                            oVar2 = (o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (oVar2 == null) {
                        oVar2 = f11059c;
                    }
                    f11058b = oVar2;
                    oVar = oVar2;
                }
            }
        }
        return oVar;
    }
}
