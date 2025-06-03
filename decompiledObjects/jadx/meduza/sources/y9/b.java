package y9;

import java.util.Arrays;
import m6.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f17453a;

    public b(String str) {
        this.f17453a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return h.a(this.f17453a, ((b) obj).f17453a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17453a});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(this.f17453a, "token");
        return aVar.toString();
    }
}
