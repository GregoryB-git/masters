package m6;

import java.util.Arrays;
import k6.a;

/* loaded from: classes.dex */
public final class n implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final n f10298b = new n(new a().f10300a);

    /* renamed from: a, reason: collision with root package name */
    public final String f10299a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f10300a;
    }

    public /* synthetic */ n(String str) {
        this.f10299a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return h.a(this.f10299a, ((n) obj).f10299a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10299a});
    }
}
