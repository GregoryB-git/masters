package h3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7066a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f7066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f7066a.equals(((c) obj).f7066a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7066a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.g.f(defpackage.f.l("Encoding{name=\""), this.f7066a, "\"}");
    }
}
