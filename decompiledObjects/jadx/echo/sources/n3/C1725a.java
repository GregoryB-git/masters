package n3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1725a f17944b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f17945a;

    /* renamed from: n3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public HashMap f17946a = new HashMap();

        public C1725a a() {
            if (this.f17946a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C1725a c1725a = new C1725a(Collections.unmodifiableMap(this.f17946a));
            this.f17946a = null;
            return c1725a;
        }
    }

    public C1725a(Map map) {
        this.f17945a = map;
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f17945a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1725a) {
            return this.f17945a.equals(((C1725a) obj).f17945a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17945a.hashCode();
    }

    public String toString() {
        return this.f17945a.toString();
    }
}
