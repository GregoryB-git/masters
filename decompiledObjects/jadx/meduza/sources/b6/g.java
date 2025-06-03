package b6;

import java.util.Arrays;
import k6.a;

@Deprecated
/* loaded from: classes.dex */
public final class g implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final g f1915c = new g(new f());

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1917b;

    public g(f fVar) {
        this.f1916a = fVar.f1913a.booleanValue();
        this.f1917b = fVar.f1914b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return m6.h.a(null, null) && this.f1916a == gVar.f1916a && m6.h.a(this.f1917b, gVar.f1917b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f1916a), this.f1917b});
    }
}
