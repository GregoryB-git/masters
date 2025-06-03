package S;

import W5.F;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5811a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5811a = name;
        }

        public final String a() {
            return this.f5811a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.a(this.f5811a, ((a) obj).f5811a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5811a.hashCode();
        }

        public String toString() {
            return this.f5811a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final S.a c() {
        Map o7;
        o7 = F.o(a());
        return new S.a(o7, false);
    }

    public final d d() {
        Map o7;
        o7 = F.o(a());
        return new S.a(o7, true);
    }
}
