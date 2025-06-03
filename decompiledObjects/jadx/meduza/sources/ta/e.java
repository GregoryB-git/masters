package ta;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14695a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<?, ?> f14696b;

    public e(String str, Map<?, ?> map) {
        this.f14695a = str;
        this.f14696b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14695a.equals(eVar.f14695a) && Objects.equals(this.f14696b, eVar.f14696b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14695a, this.f14696b);
    }
}
