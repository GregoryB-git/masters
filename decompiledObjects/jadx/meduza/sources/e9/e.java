package e9;

import defpackage.f;
import defpackage.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f4853b = new e(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4854a;

    public e(String str) {
        this.f4854a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        String str = this.f4854a;
        String str2 = ((e) obj).f4854a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f4854a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return g.f(f.l("User(uid:"), this.f4854a, ")");
    }
}
