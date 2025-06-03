package r0;

import ec.i;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f13513a;

        public a(String str) {
            i.e(str, "name");
            this.f13513a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return i.a(this.f13513a, ((a) obj).f13513a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13513a.hashCode();
        }

        public final String toString() {
            return this.f13513a;
        }
    }

    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
